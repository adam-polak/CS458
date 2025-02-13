import lib.MIPSInstruction;
import lib.MIPSInstructionFactory;

public class Main {
    public static void main(String[] args) {
        String mipsAsm = args[0];
        MIPSInstruction instruction = MIPSInstructionFactory.create(mipsAsm);
    }
}