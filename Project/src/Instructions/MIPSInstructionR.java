package Instructions;

import lib.*;

import java.util.HexFormat;

public class MIPSInstructionR extends AbstractMIPSInstruction {
    private int op;
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
            String[] arr = getPartsOfAsmString(str);
            op = 0;
            rs = RegisterUtil.getValue(arr[2]);
            rt = RegisterUtil.getValue(arr[3]);
            rd = RegisterUtil.getValue(arr[1]);
            shamt = 0;
            funct = FunctUtil.getValue(str.split(" ")[0]);
        }
    }

    private String[] getPartsOfAsmString(String str) {
        String[] arr = str.split(" ");
        for(int i = 1; i < arr.length - 1; i++) {
            arr[i] = arr[i].substring(0, arr[i].length() - 1); // trim comma
        }

        return arr;
    }

    @Override
    public String toString() {
        return FunctUtil.getString(funct)
                + " " + RegisterUtil.getString(rd)
                + ", " + RegisterUtil.getString(rs)
                + ", " + RegisterUtil.getString(rt);
    }

    @Override
    public String toBinary() {
        return "000000" + Integer.toBinaryString(getFullInstructionInt());
    }

    private int getFullInstructionInt() {
        int inst = funct;
        inst = inst | (shamt << 6);
        inst = inst | (rd << 11);
        inst = inst | (rt << 16);
        inst = inst | (rs << 21);
        inst = inst | (op << 26);
        return inst;
    }
}
