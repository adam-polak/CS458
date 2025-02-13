package Instructions;

import lib.MIPSConvertible;
import lib.MIPSInstruction;

public class MIPSInstructionR implements MIPSInstruction {

    public MIPSInstructionR(String str, boolean isHex) {
        if(isHex) {
            throw new UnsupportedOperationException("hex is not implemented yet");
        }
        // TODO
    }

    public MIPSInstructionR(boolean[] bits) {
        // TODO
    }

    @Override
    public String toString() {
        return null;
    }

    @Override
    public String toHex() {
        return null;
    }

    @Override
    public String toBinary() {
        return null;
    }

    @Override
    public MIPSConvertible getOpCode() {
        return null;
    }
}
