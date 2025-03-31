package lib.files;

import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;
import lib.mips.MIPSStringType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;
import java.util.logging.Level;

public class MIPSFileConverter {

    private static final Logger _logger = Logger.getLogger(MIPSFileConverter.class.getName());
    private final String _file;
    private ArrayList<String> _dataLabelAddresses;
    private HashMap<String, String> _dataValueMap;
    private HashMap<String, Integer> _labelMap;

    public MIPSFileConverter(FileReader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader r = new BufferedReader(reader);
        String line;
        while((line = r.readLine()) != null) {
            sb.append(line).append("\n");
        }

        _file = sb.toString();
        _dataLabelAddresses = new ArrayList<>();
        _dataValueMap = new HashMap<>();
        _labelMap = new HashMap<>();

        loadLabelMap();
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
        if(str.isEmpty() || str.startsWith(".")) {
            return null;
        } else {
            return str;
        }
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

    private void addToDataMap(String line) throws Exception {
        String key = getAsciizKey(line);
        String value = getAsciizString(line);

        if(key == null || value == null) {
            throw new Exception("Format for .data section is invalid");
        } else if(_dataValueMap.get(key) != null) {
            throw new Exception("Duplicate data label");
        }

        value += '\0'; // add null byte

        _dataValueMap.put(key, value);
        _dataLabelAddresses.add(key);
    }

    private void appendInstructionHex(StringBuilder sb, String line, int curAddr, MIPSStringType format) {
        String[] arr = line.split(" ");
        if(_dataValueMap.get(arr[arr.length - 1]) != null) {
            StringBuilder lineBuilder = new StringBuilder();
            for (int i = 0; i < arr.length - 1; i++) {
                lineBuilder.append(arr[i]).append(' ');
            }

            // data addresses start at 0x10010000 for MIPS
            int addr = Integer.parseInt("10010000", 16);
            for(int i = 0 ; i < _dataLabelAddresses.size(); i++) {
                if(_dataLabelAddresses.get(i).equals(arr[arr.length - 1])) {
                    lineBuilder.append("0x").append(Integer.toHexString(addr));
                    break;
                } else {
                    addr += _dataValueMap.get(_dataLabelAddresses.get(i)).getBytes().length;
                }
            }

            line = lineBuilder.toString();
        } else if(_labelMap.get(arr[arr.length - 1]) != null) {
            StringBuilder lineBuilder = new StringBuilder();
            for(int i = 0; i < arr.length - 1; i++) {
                lineBuilder.append(arr[i]).append(' ');
            }

            int labelAddr = _labelMap.get(arr[arr.length - 1]);
            if(arr[0].startsWith("b")) {
                labelAddr = ((labelAddr - (curAddr + 4)) / 4);
            } else {
                labelAddr = ((labelAddr & ((1 << 26) - 1)) >> 2) + 1;
            }

            lineBuilder.append("0x").append(Integer.toHexString(labelAddr));

            line = lineBuilder.toString();
        }

        MIPSInstruction ins = MIPSInstructionFactory.create(line);
        sb.append(ins.convert(format)).append('\n');
    }

    private void loadLabelMap() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new StringReader(_file));
        String line;

        boolean startTracking = false;
        int curAddr =  0x00400000;
        while((line = bufferedReader.readLine()) != null) {
            if(!startTracking) {
                startTracking = line.trim().startsWith(".text");
                continue;
            }

            line = cleanLine(line);
            if(line == null || line.isEmpty()) {
                continue;
            }

            if(line.endsWith(":")) {
                String label = line.substring(0, line.length() - 1);
                _labelMap.put(label, curAddr);
            }

            curAddr += 4;
        }
    }

    public String[] convertContents(MIPSStringType format) {
        if(format == null) {
            throw new NullPointerException("Must provide content format type");
        }

        BufferedReader bufferedReader = new BufferedReader(new StringReader(_file));
        StringBuilder sb = null;
        String line;

        String[] ans = new String[2];
        int index = -1;
        try {
            int curAddr = 0x00400000;
            while((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(".")) {
                    index++;
                    if (index > 0) {
                        dumpDataMapIntoStringBuilder(sb);
                        ans[index - 1] = sb.toString();
                    }

                    sb = new StringBuilder();

                    continue;
                }

                line = cleanLine(line);
                if (index < 0 || line == null) {
                    continue;
                }

                if(index == 0) {
                    addToDataMap(line);
                } else if(line.endsWith(":")) {
                    // TODO
                        // keep track of labels and replace
                        // their references in the assembly code
                        // to the correct address
                        // NOTE:
                        // -currently not possible with this format
                        // -will have to create a loop before this to find
                        // and keep track of labels
                } else {
                    appendInstructionHex(sb, line, curAddr, format);
                    curAddr += 4;
                }
            }

            if(index > -1) {
                ans[index] = sb.toString();
            }
        } catch(Exception e) {
            e.printStackTrace();
            _logger.log(Level.SEVERE, "Failed while reading file");
            try {
                bufferedReader.close();
            } catch(Exception ex) {
                _logger.log(Level.SEVERE, "Failed to close buffered reader");
            }
        }

        return ans;
    }
}