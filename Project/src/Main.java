import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;

public class Main {
    public static void main(String[] args) {
        String mipsAsm = formatString(args[0]);
        MIPSInstruction instruction = MIPSInstructionFactory.create(mipsAsm);
    }

    private static String formatString(String str) {
        str = str.trim();
        StringBuilder ans = new StringBuilder();
        char[] arr = str.toCharArray();
        boolean lastIsSpace = false;
        for (char c : arr) {
            if(c == '#') break;
            else if (c != ' ' || !lastIsSpace) {
                ans.append(c);
                lastIsSpace = c == ' ';
            }
        }

        return ans.toString();
    }
}