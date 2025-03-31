import lib.files.MIPSFileConverter;
import lib.mips.MIPSStringType;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String filePath = args[0];

        String[] sections = new MIPSFileConverter(
                new FileReader(filePath)
        ).convertContents(MIPSStringType.Hex);

        StringBuilder dir = new StringBuilder();
        String[] arr = filePath.split("/");
        for(int i = 0; i < arr.length - 1; i++) {
            dir.append(arr[i]).append("/");
        }

        String fileName = arr[arr.length - 1].split("\\.")[0];

        FileWriter data = new FileWriter(
                dir + fileName + ".data"
        );
        FileWriter text = new FileWriter(
                dir + fileName + ".text"
        );

        data.write(sections[0]);
        data.close();
        text.write(sections[1]);
        text.close();
    }
}