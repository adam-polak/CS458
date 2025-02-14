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
            switch(arr[0]) {
                case "beq":
                case "bne":
                    rs = RegisterUtil.getValue(arr[1]);
                    rt = RegisterUtil.getValue(arr[2]);
                    break;
                case "lw":
                case "sw":
                    rt = convertToInt(arr[1]);
                    rs = RegisterUtil.getValue(arr[2]);
                    break;
                default:
                    rt = RegisterUtil.getValue(arr[1]);
                    rs = RegisterUtil.getValue(arr[2]);
                    break;
            }

            imm = convertToInt(arr[3]);
            System.out.printf("op: %d\nrt: %d\nrs: %d\nimm: %d\n", op, rt, rs, imm);
            System.out.println(this.toBinary());
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private int convertToInt(String s) {
        if(s.startsWith("0x")) {
            return Integer.parseInt(s.substring(2), 16);
        } else if(s.startsWith("$")) {
            return RegisterUtil.getValue(s);
        } else {
            return Integer.parseInt(s);
        }
    }

    @Override
    protected String[] getPartsOfAsmString(String str) {
        String[] arr = super.getPartsOfAsmString(str);
        switch(arr[0]) {
            case "lw":
            case "sw":
                String[] ans = new String[4];
                ans[0] = arr[0];
                ans[1] = arr[1];
                ans[2] = "";
                ans[3] = "";
                boolean startAdding = false;
                for(int i = 0; i < arr[2].length(); i++) {
                    if(startAdding && arr[2].charAt(i) != ')') {
                        ans[2] += arr[2].charAt(i);
                    } else if(arr[2].charAt(i) == '(') {
                        if(ans[3].isEmpty()) {
                            ans[3] = "0";
                        }
                        startAdding = true;
                    } else if(arr[2].charAt(i) == ')') {
                        break;
                    } else {
                        ans[3] += arr[2].charAt(i);
                    }
                }

                return ans;
            default:
                return arr;
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
