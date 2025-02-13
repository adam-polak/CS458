import lib.MIPSInstruction;
import lib.MIPSInstructionFactory;

public class Main {
    public static void main(String[] args) {
        String mipsAsm = formatString(args[0]);
        MIPSInstruction instruction = MIPSInstructionFactory.create(mipsAsm);
        System.out.println(instruction);
        System.out.println(instruction.toBinary());
        System.out.println(instruction.toHex());
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