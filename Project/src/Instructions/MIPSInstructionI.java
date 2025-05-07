package Instructions;

import lib.mips.AbstractMIPSInstruction;
import lib.mips.MIPSStringType;
import lib.mips.OpCodeUtil;
import lib.mips.RegisterUtil;

public class MIPSInstructionI extends AbstractMIPSInstruction {

    private final int op;
    private final int rs;
    private final int rt;
    private final int imm;
    private boolean formatHex;

    public MIPSInstructionI(String str, MIPSStringType type) {
        if(type == MIPSStringType.String) {
            str = cleanString(str);
            String[] arr = getPartsOfAsmString(str);
            op = OpCodeUtil.getValue(arr[0]);
            switch(arr[0]) {
                case "beq":
                case "bne":
                case "lui":
                    rs = getIntValue(arr[1]);
                    rt = getIntValue(arr[2]);
                    break;
                default:
                    rt = getIntValue(arr[1]);
                    rs = getIntValue(arr[2]);
                    break;
            }

            imm = getIntValue(arr[3]);
        } else if(type == MIPSStringType.Hex || type == MIPSStringType.Binary) {
            long value = getValue(str, type);
            op = (int)(value >> 26);
            rs = (int)((value & ((1 << 26) - 1)) >> 21);
            rt = (int)((value & ((1 << 21) - 1)) >> 16);
            imm = (int)(value & ((1 << 16) - 1));
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private int getIntValue(String s) {
        if(s.startsWith("0x")) {
            formatHex = true;
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
        String[] ans;
        switch(arr[0]) {
            case "lw":
            case "sw":
                ans = new String[4];
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
            case "lui":
                ans = new String[4];
                ans[0] = arr[0];
                ans[1] = "0";
                ans[2] = arr[1];
                ans[3] = arr[2];
                return ans;
            default:
                return arr;
        }
    }

    private void appendAddress(StringBuilder sb) {
        if(formatHex) {
            sb.append("0x").append(Integer.toHexString(imm));
        } else {
            sb.append(imm);
        }
    }

    @Override
    public String toString() {
        return OpCodeUtil.getString(op) + " " + '{' +
                "opcode: " +
                hexStrLength(op, 2) +
                ", " +
                "rs(base): " +
                hexStrLength(rs, 2) +
                ", rt: " +
                hexStrLength(rt, 2) +
                ", immediate(offset): " +
                hexStrLength(imm, 4) +
                '}';
    }
//        switch(opCode) {
//            case "beq":
//            case "bne":
//                ans.append("rs(base): ")
//                        .append(hexStrLength(rs, 2))
//                        .append(", rt: ")
//                        .append(hexStrLength(rt, 2))
//                        .append(", immediate(offset): ")
//                        .append(hexStrLength(imm, 4))
//                        .append("}");
//
//                break;
//            case "lui":
//            case "lw":
//            case "sw":
//            default:
//                ans.append("rt: ")
//                        .append(hexStrLength(rt, 2))
//                        .append(", rs: ")
//                        .append(hexStrLength(rs, 2))
//                        .append(", immediate(offset): ")
//                        .append(hexStrLength(imm, 4))
//                        .append("}");
//
//                break;
//                if(!opCode.equals("lui") && RegisterUtil.isRegisterValue(rs)) {
//                    if(imm != 0) {
//                        appendAddress(ans);
//                    }
//
//                    ans.append("(")
//                        .append(RegisterUtil.getString(rs))
//                        .append(")");
//                } else {
//                    appendAddress(ans);
//                }
//            default:
//                ans.append(RegisterUtil.getString(rt))
//                        .append(", ")
//                        .append(RegisterUtil.getString(rs))
//                        .append(", ");
//
//                appendAddress(ans);
//
//                break;
//        }
//
//        return ans.toString();
//    }

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

    public String getName() {
        return OpCodeUtil.getString(op);
    }

    public int getRs() {
        return rs;
    }

    public int getRt() {
        return rt;
    }

    public int getImmediate() {
        return imm;
    }






}
