package Instructions;

import lib.MIPSConvertible;
import lib.MIPSInstruction;
import lib.MIPSStringType;

public class MIPSInstructionR implements MIPSInstruction {

    public MIPSInstructionR(String str, MIPSStringType type) {
        if(type == MIPSStringType.Hex || type == MIPSStringType.Binary) {
            throw new UnsupportedOperationException("hex is not implemented yet");
        }
        // TODO implement creating instruction with string
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
