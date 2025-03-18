package Instructions;

import lib.mips.*;

public class MIPSInstructionJ extends AbstractMIPSInstruction {

    private final int op;
    private final int inst_index;

    public MIPSInstructionJ(String str, MIPSStringType type) {
        if(type == MIPSStringType.String) {
            String[] arr = getPartsOfAsmString(str);
            op = OpCodeUtil.getValue(arr[0]);
            if(arr[1].startsWith("0x")) {
                inst_index = Integer.parseInt(arr[1].substring(2), 16);
            } else {
                inst_index = Integer.parseInt(arr[1]);
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String toString() {
        return OpCodeUtil.getString(op)
                + " " + Integer.toHexString(inst_index);
    }

    @Override
    protected int getFullInstructionInt() {
        return inst_index | (op << 26);
    }
}
