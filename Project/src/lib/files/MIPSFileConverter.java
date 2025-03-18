package lib.files;

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

    public String convertContents(MIPSStringType format) {
        if(format == null) {
            throw new NullPointerException("Must provide content format type");
        }

        BufferedReader bufferedReader = new BufferedReader(_reader);
        StringBuilder sb = new StringBuilder();
        String line;

        try {
            while((line = bufferedReader.readLine()) != null) {
                sb.append(line);
            }
        } catch(Exception e) {
            _logger.log(Level.SEVERE, "Failed while reading file");
            try {
                bufferedReader.close();
            } catch(Exception ex) {
                _logger.log(Level.SEVERE, "Failed to close buffered reader");
            }
        }

        return sb.toString();
    }
}