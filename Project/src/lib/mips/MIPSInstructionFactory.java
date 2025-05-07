package lib.mips;

import Instructions.MIPSInstructionI;
import Instructions.MIPSInstructionJ;
import Instructions.MIPSInstructionPSEUDO;
import Instructions.MIPSInstructionR;

public class MIPSInstructionFactory {
    public static MIPSInstruction create(String str) {
        if(str.startsWith("0x")) {
            return create(str, MIPSStringType.Hex);
        } else if(isBinary(str)) {
            return create(str, MIPSStringType.Binary);
        } else {
            return create(str, MIPSStringType.String);
        }
    }

    public static boolean isBinary(String str) {
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '0' || c == '1') continue;
            return false;
        }

        return true;
    }

    public static MIPSInstruction create(String str, MIPSStringType type) {
        if(type == MIPSStringType.String) {
            return fromString(str);
        } else if(type == MIPSStringType.Hex) {
            return fromHex(str);
        } else if(type == MIPSStringType.Binary) {
            return fromBinary(str);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private static MIPSInstruction fromString(String str) {
        String start = str.split(" ")[0];
        switch(OpCodeUtil.getType(OpCodeUtil.getValue(start))) {
            case R:
                return new MIPSInstructionR(str, MIPSStringType.String);
            case I:
                return new MIPSInstructionI(str, MIPSStringType.String);
            case J:
                return new MIPSInstructionJ(str, MIPSStringType.String);
            case PSEUDO:
                return new MIPSInstructionPSEUDO(str, MIPSStringType.String);
            default:
                throw new IllegalArgumentException("Not a valid instruction start");
        }
    }

    private static MIPSInstruction fromHex(String str) {
        if (str.startsWith("0x")) {
            str = str.substring(2);
        }


        if (str.length() < 8) {
            str = String.format("%8s", str).replace(' ', '0');
        }

        try {
            int instr = Integer.parseUnsignedInt(str, 16);
            int op = (instr >>> 26) & 0x3F;


            MIPSInstructionType type = OpCodeUtil.getType(op);


            return switch (type) {
                case R -> new MIPSInstructionR(str, MIPSStringType.Hex);
                case I -> new MIPSInstructionI(str, MIPSStringType.Hex);
                case J -> new MIPSInstructionJ(str, MIPSStringType.Hex);
                case PSEUDO -> new MIPSInstructionPSEUDO(str, MIPSStringType.Hex);
            };

        } catch (IllegalArgumentException e) {
            System.err.println("ERROR: Invalid opcode from instruction hex: " + str);
            throw new IllegalArgumentException("Not a valid opcode: " + str, e);
        } catch (Exception e) {
            System.err.println("ERROR: Unexpected parsing error: " + e.getMessage());
            throw e;
        }
    }

    private static MIPSInstruction fromBinary(String str) {
        throw new UnsupportedOperationException();
    }
}
