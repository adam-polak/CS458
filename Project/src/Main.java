import lib.files.MIPSFileConverter;
import lib.mips.MIPSStringType;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = args[0];

        String[] sections = new MIPSFileConverter(
                new FileReader(filePath)
        ).convertContents(MIPSStringType.Hex);

        System.out.println(".data\n" + sections[0]);
        System.out.println(".text\n" + sections[1]);
    }
}