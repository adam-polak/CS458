package Instructions;

import lib.mips.AbstractMIPSInstruction;
import lib.mips.FunctUtil;
import lib.mips.MIPSStringType;
import lib.mips.RegisterUtil;

public class MIPSInstructionR extends AbstractMIPSInstruction {
    private final int op;
    private final int rs;
    private final int rt;
    private final int rd;
    private final int shamt;
    private final int funct;

    public MIPSInstructionR(String str, MIPSStringType type) {
        if(type == MIPSStringType.String) {
            String[] arr = getPartsOfAsmString(str);
            if(arr[0].equals("syscall")) {
                op = 0;
                rs = 0;
                rt = 0;
                rd = 0;
                shamt = 0;
                funct = FunctUtil.getValue(arr[0]);
                return;
            }
            op = 0;
            rs = RegisterUtil.getValue(arr[2]);
            rt = RegisterUtil.getValue(arr[3]);
            rd = RegisterUtil.getValue(arr[1]);
            shamt = 0;
            funct = FunctUtil.getValue(arr[0]);
        } else {
            throw new UnsupportedOperationException("MIPSString type not implemented yet");
        }
    }

    @Override
    public String toString() {
        if("syscall".equals(FunctUtil.getString(funct))) {
            return "syscall";
        }

        return FunctUtil.getString(funct)
                + " " + RegisterUtil.getString(rd)
                + ", " + RegisterUtil.getString(rs)
                + ", " + RegisterUtil.getString(rt);
    }

    @Override
    protected int getFullInstructionInt() {
        int inst = funct;
        inst = inst | (shamt << 6);
        inst = inst | (rd << 11);
        inst = inst | (rt << 16);
        inst = inst | (rs << 21);
        inst = inst | (op << 26);
        return inst;
    }
}
