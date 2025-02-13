package lib;

public class MIPSInstructionFactory {
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
        throw new UnsupportedOperationException();
    }

    private static MIPSInstruction fromHex(String str) {
        throw new UnsupportedOperationException();
    }

    private static MIPSInstruction fromBinary(String str) {
        throw new UnsupportedOperationException();
    }
}
