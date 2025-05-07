package Instructions;

import lib.mips.*;

public class MIPSInstructionR extends AbstractMIPSInstruction {
    private final int op;
    private final int rs;
    private final int rt;
    private final int rd;
    private final int shamt;
    private final int funct;

    public MIPSInstructionR(String str, MIPSStringType type) {
        if(type == MIPSStringType.String) {
            str = cleanString(str);
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
        } else if(type == MIPSStringType.Hex || type == MIPSStringType.Binary) {
            long val = getValue(str, type);
            op = 0;
            rs = (int)((val & ((1 << 26) - 1)) >> 21);
            rt = (int)((val & ((1 << 21) - 1)) >> 16);
            rd = (int)((val & ((1 << 16) - 1)) >> 11);
            shamt = 0;
            funct = (int)(val & ((1 << 6) - 1));
        } else {
            throw new UnsupportedOperationException("MIPSString type not implemented yet");
        }
    }

    @Override
    public String toString() {
        if("syscall".equals(FunctUtil.getString(funct))) {
            return "syscall {opcode: "
                    + hexStrLength(op, 2)
                    + ", code: 000000, funct: "
                    + hexStrLength(funct, 2)
                    + "}";
        }

        return FunctUtil.getString(funct)
                + " {opcode: "
                + hexStrLength(op, 2)
                + ", rs: "
                + hexStrLength(rs, 2)
                + ", rt: "
                + hexStrLength(rt, 2)
                + ", rd: "
                + hexStrLength(rd, 2)
                + ", shmt: "
                + hexStrLength(shamt, 2)
                + ", funct: "
                + hexStrLength(funct, 2)
                + "}";
//
//        return FunctUtil.getString(funct)
//                + " " + RegisterUtil.getString(rd)
//                + ", " + RegisterUtil.getString(rs)
//                + ", " + RegisterUtil.getString(rt);
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


    public String getName() {
        return FunctUtil.getString(funct);
    }

    public int getRs() {
        return rs;
    }

    public int getRt() {
        return rt;
    }

    public int getRd() {
        return rd;
    }




}
