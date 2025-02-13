package Instructions;

import lib.FunctUtil;
import lib.MIPSConvertible;
import lib.MIPSInstruction;
import lib.MIPSStringType;

public class MIPSInstructionR implements MIPSInstruction {
    private int opCode = 0;
    private int rs;
    private int rt;
    private int rd;
    private int shamt;
    private int funct;

    public MIPSInstructionR(String str, MIPSStringType type) {
        if(type == MIPSStringType.Hex || type == MIPSStringType.Binary) {
            throw new UnsupportedOperationException("hex is not implemented yet");
        }

        if(type == MIPSStringType.String) {
            rs = 0;
            rt = 0;
            rd = 0;
            shamt = 0;
            funct = FunctUtil.getValue(str.split(" ")[0]);
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
}
