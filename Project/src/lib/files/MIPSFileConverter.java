package lib.files;

import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;
import lib.mips.MIPSStringType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;

public class MIPSFileConverter {

    private static final Logger _logger = Logger.getLogger(MIPSFileConverter.class.getName());
    private final FileReader _reader;
    private ArrayList<String> _dataLabelAddresses;
    private HashMap<String, String> _dataValueMap;
    private HashMap<String, Integer> _labelMap;

    public MIPSFileConverter(FileReader reader) {
        _reader = reader;
        _dataLabelAddresses = new ArrayList<>();
        _dataValueMap = new HashMap<>();
        _labelMap = new HashMap<>();
    }

    private String cleanLine(String str) {
        if(str == null) {
            throw new NullPointerException();
        }

        str = str.trim();
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean lastIsSpace = false;
        for(char c : arr) {
            if(c == '#') break;
            else if(c != ' ' || !lastIsSpace) {
                sb.append(c);
                lastIsSpace = c == ' ';
            }
        }

        str = sb.toString().trim();

        if(str.isEmpty()) {
            return null;
        }
        if(str.startsWith(".") && !str.startsWith(".text") || str.startsWith(".data")) {
            return null;
        }
        return str;
    }

    private String getAsciizKey(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean foundColon = false;
        for(int i = 0; i < arr.length; i++) {
            foundColon = arr[i] == ':';
            if(foundColon || arr[i] == ' ') {
                break;
            }

            sb.append(arr[i]);
        }

        if(!foundColon) {
            return null;
        }

        return sb.toString();
    }

    private String getAsciizString(String str) {
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean didOpen = false;
        boolean quoteOpen = false;
        for(int i = 0; i < arr.length; i++) {
            if(!quoteOpen) {
                didOpen = quoteOpen = arr[i] == '"';
                continue;
            }

            if(arr[i] == '"') {
                quoteOpen = false;
                break;
            }

            sb.append(arr[i]);
        }

        if(!didOpen || quoteOpen) {
            return null;
        }

        return sb.toString();
    }

    private void dumpDataMapIntoStringBuilder(StringBuilder sb) {
        StringBuilder dataStr = new StringBuilder();
        for(String key : _dataLabelAddresses) {
            dataStr.append(_dataValueMap.get(key));
        }

        String completeDataString = dataStr.toString();
        byte[] arr = completeDataString.getBytes();
        for(int i = 0; i < arr.length; i += 4) {
            int size = Math.min(4, arr.length - i);

            for(int j = size - 1; j >= 0; j--) {
                sb.append(String.format("%02x", arr[i + j] & 0xFF));
            }

            sb.append('\n');
        }
    }

    private void writeToFile(String fileName, String content) {
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
        }catch(Exception e) {
            _logger.log(Level.SEVERE, "Error writing to file " + fileName, e);
        }
    }

    public String[] convertContents(MIPSStringType format) {
        if(format == null) {
            throw new NullPointerException("Must provide content format type");
        }

        BufferedReader bufferedReader = new BufferedReader(_reader);
        StringBuilder sb = null;
        String line;

        String[] ans = new String[2];
        int index = -1;
        List<String> allLines = new ArrayList<>();
        try {
            // for uncleaned line
            String rawLine;
            while ((rawLine = bufferedReader.readLine()) != null) {
                allLines.add(rawLine);
            }
            bufferedReader.close();

            _labelMap.clear();
            int currentInstructionIndex = 0;
            boolean inTextSection = false;

            for (String raw : allLines) {
                String clean = cleanLine(raw);
                if (clean == null) continue;
                if (clean.startsWith(".text")) {
                    inTextSection = true;
                    continue;
                }
                if (!inTextSection) continue;

                if (clean.endsWith(":")) {
                    String label = clean.substring(0, clean.length() - 1);
                    _labelMap.put(label, currentInstructionIndex);
                } else {
                    currentInstructionIndex++;
                }
            }

            index = -1;
            sb = null;
            currentInstructionIndex = 0;

            for (String raw : allLines) {
                if (raw.startsWith(".")) {
                    index++;
                    if (index > 0) {
                        dumpDataMapIntoStringBuilder(sb);
                        ans[index - 1] = sb.toString();
                    }
                    sb = new StringBuilder();
                    continue;
                }
                line = cleanLine(raw);
                if(line == null || index < 0)continue;

                if (index == 0) {
                    String key = getAsciizKey(line);
                    String value = getAsciizString(line);
                    if (key == null || value == null) {
                        throw new Exception("Format for .data section is invalid");
                    } else if (_dataValueMap.containsKey(key)) {
                        throw new Exception("duplicate label");
                    }
                    value += "\0";
                    _dataValueMap.put(key, value);
                    _dataLabelAddresses.add(key);
                } else if (line.endsWith(":")) {
                    continue;
                } else {
                    line = line.trim();
                    String[] arr = line.split("[,\\s]+");

                    String op = arr[0];
                    String[] args = new String[arr.length - 1];
                    System.arraycopy(arr, 1, args, 0, args.length);

                    for (int i = 0; i < args.length; i++) {
                        String token = args[i];

                        if ((op.equals("beq") || op.equals("bne")) && i == 2 && _labelMap.containsKey(token)) {
                            int target = _labelMap.get(token);
                            int offset = target - (currentInstructionIndex + 1);

                            args[i] = String.valueOf(offset);
                        } else if (op.equals("j") && i == 0 && _labelMap.containsKey(token)) {
                            int target = _labelMap.get(token);
                            int address = (target * 4) + 0x00400000;
                            int encodedAddress = address >>> 2;
                            String hexAddr = "0x" + Integer.toHexString(encodedAddress);


                            args[i] = hexAddr;
                        }

                        if (_dataValueMap.containsKey(token)) {
                            int addr = Integer.parseInt("10010000", 16);
                            for (String key : _dataLabelAddresses) {
                                if (key.equals(token)) {
                                    String hexAddr = "0x" + Integer.toHexString(addr);

                                    args[i] = hexAddr;
                                    break;
                                }
                                addr += _dataValueMap.get(key).getBytes().length;
                            }
                        }
                    }

                    line = op;
                    if (args.length > 0) {
                        line += " " + String.join(", ", args);
                    }



                    MIPSInstruction ins = MIPSInstructionFactory.create(line);
                    sb.append(ins.convert(format)).append('\n');

                    currentInstructionIndex++;
                }
            }

            if (index > -1) {
                ans[index] = sb.toString();
            }

            writeToFile(".data.txt",ans[0] != null ? ans[0] : "");
            writeToFile(".text.txt",ans[1] != null ? ans[1] : "");

        } catch (Exception e) {
            e.printStackTrace();
            _logger.log(Level.SEVERE, "Failed while reading file");
            try {
                bufferedReader.close();
            } catch (Exception ex) {
                _logger.log(Level.SEVERE, "Failed to close buffered reader");
            }
        }

        return ans;
    }
}