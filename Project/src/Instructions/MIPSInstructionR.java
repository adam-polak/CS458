package Instructions;

import lib.FunctUtil;
import lib.MIPSInstruction;
import lib.MIPSStringType;
import lib.RegisterUtil;

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
            String[] arr = getPartsOfAsmString(str);
            rs = RegisterUtil.getValue(arr[1]);
            rt = RegisterUtil.getValue(arr[2]);
            rd = RegisterUtil.getValue(arr[3]);
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
                + " " + RegisterUtil.getString(rs)
                + ", " + RegisterUtil.getString(rt)
                + ", " + RegisterUtil.getString(rd);
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
