package Instructions;

import lib.AbstractMIPSInstruction;
import lib.MIPSStringType;
import lib.OpCodeUtil;
import lib.RegisterUtil;

public class MIPSInstructionI extends AbstractMIPSInstruction {

    private final int op;
    private final int rs;
    private final int rt;
    private final int imm;

    public MIPSInstructionI(String str, MIPSStringType type) {
        if(type == MIPSStringType.String) {
            String[] arr = getPartsOfAsmString(str);
            op = OpCodeUtil.getValue(arr[0]);
            rt = RegisterUtil.getValue(arr[1]);
            rs = RegisterUtil.getValue(arr[2]);
            imm = arr[3].startsWith("0x") ? Integer.parseInt(arr[3].substring(2), 16) : Integer.parseInt(arr[3]);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public String toString() {
        return OpCodeUtil.getString(op)
                + " " + RegisterUtil.getString(rt)
                + ", " + RegisterUtil.getString(rs)
                + ", " + imm;
    }

    @Override
    protected int getFullInstructionInt() {
        int inst = imm;
        if(inst < 0 && imm >= -1 * (Math.pow(2, 16) - 1)) {
            int pow;
            for(pow = 16; pow > 0; pow--) {
                if(imm >= -1 * (Math.pow(2, pow) - 1)) continue;
                break;
            }

            inst = inst & ((int)Math.pow(2, 16 - pow) - 1); // remove sign bit but keep rest of bits
            inst = (inst | (((int)Math.pow(2, pow) - 1)) << (16 - pow)); // ensure instruction is 16 bits long at this point
        }

        inst = inst | (rt << 16);
        inst = inst | (rs << 21);
        inst = inst | (op << 26);

        return inst;
    }
}
