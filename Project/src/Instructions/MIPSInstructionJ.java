package Instructions;

import lib.mips.*;

public class MIPSInstructionJ extends AbstractMIPSInstruction {

    private final int op;
    private final int inst_index;
    private final boolean formatHex;

    public MIPSInstructionJ(String str, MIPSStringType type) {
        if(type == MIPSStringType.String) {
            str = cleanString(str);
            String[] arr = getPartsOfAsmString(str);
            op = OpCodeUtil.getValue(arr[0]);
            formatHex = arr[1].startsWith("0x");
            if(formatHex) {
                inst_index = Integer.parseInt(arr[1].substring(2), 16);
            } else {
                inst_index = Integer.parseInt(arr[1]);
            }
        } else if(type == MIPSStringType.Hex || type == MIPSStringType.Binary) {
            int val = getValue(str, type);
            op = val >> 26;
            inst_index = val & ((1 << 26) - 1);
            formatHex = false;
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String toString() {
        return OpCodeUtil.getString(op)
                + " {opcode: "
                + hexStrLength(op, 2)
                + ", code: "
                + hexStrLength(inst_index, 7)
                + "}";
//        return OpCodeUtil.getString(op)
//                + (
//                    formatHex
//                    ? " 0x" + Integer.toHexString(inst_index)
//                    : inst_index
//                );
    }

    @Override
    protected int getFullInstructionInt() {
        return inst_index | (op << 26);
    }
}
