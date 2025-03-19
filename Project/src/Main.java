import lib.files.MIPSFileConverter;
import lib.mips.MIPSInstructionFactory;
import lib.mips.MIPSStringType;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String filePath = args[0];

        try {
            System.out.println(
                    new MIPSFileConverter(
                       new FileReader(filePath)
                    ).convertContents(MIPSStringType.Hex)[1]
            );
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}