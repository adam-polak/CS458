import lib.MIPSInstruction;
import lib.MIPSInstructionFactory;

public class Main {
    public static void main(String[] args) {
        String mipsAsm = formatString(args[0]);
        MIPSInstruction instruction = MIPSInstructionFactory.create(mipsAsm);
    }

    private static String formatString(String str) {
        str = str.trim();
        StringBuilder ans = new StringBuilder();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c != ' ') {
                ans.append(c);
            }
        }

        return ans.toString();
    }
}