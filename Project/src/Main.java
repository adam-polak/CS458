import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;
import lib.mips.MIPSStringType;

public class Main {
    public static void main(String[] args) {
        String test = "2743006a";
        MIPSInstruction ins = MIPSInstructionFactory.create(test, MIPSStringType.Hex);

        System.out.println(ins.toString());
    }
}