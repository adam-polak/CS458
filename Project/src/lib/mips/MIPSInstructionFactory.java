package lib.mips;

import Instructions.MIPSInstructionI;
import Instructions.MIPSInstructionJ;
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
            default:
                throw new IllegalArgumentException("Not a valid instruction start");
        }
    }

    private static MIPSInstruction fromHex(String str) {
        throw new UnsupportedOperationException();
    }

    private static MIPSInstruction fromBinary(String str) {
        throw new UnsupportedOperationException();
    }
}
