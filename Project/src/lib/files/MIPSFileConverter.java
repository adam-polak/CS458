package lib.files;

import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;
import lib.mips.MIPSStringType;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.logging.Logger;
import java.util.logging.Level;

public class MIPSFileConverter {

    private static final Logger _logger = Logger.getLogger(MIPSFileConverter.class.getName());
    private final FileReader _reader;

    public MIPSFileConverter(FileReader reader) {
        _reader = reader;
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
            else if(c == '\t') continue;
            else if(c != ' ' || !lastIsSpace) {
                sb.append(c);
                lastIsSpace = c == ' ';
            }
        }

        str = sb.toString().trim();
        if(str.isEmpty() || str.startsWith(".") || str.endsWith(":")) {
            return null;
        } else {
            return str;
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
        try {
            while((line = bufferedReader.readLine()) != null) {
                if(line.startsWith(".")) {
                    index++;
                    sb = new StringBuilder();
                    if(index > 0) {
                        ans[index] = sb.toString();
                    }

                    continue;
                }

                line = cleanLine(line);
                if(index < 1 || line == null) {
                    continue;
                }

                try {
                    MIPSInstruction ins = MIPSInstructionFactory.create(line);
                    sb.append(ins.convert(format)).append('\n');
                } catch(Exception ignored) {}
            }

            ans[index] = sb.toString();
        } catch(Exception e) {
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