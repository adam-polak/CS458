package lib;

import java.util.HashMap;

public class OpCodeFactory {

    private static final HashMap<String, Integer> map = new HashMap<>(){{
        put("add", 1); // TODO add all op codes
    }};

    public static int getValue(String str) {
        if(str.startsWith("0x")) {
            return getValue(str, MIPSStringType.Hex);
        } else if(MIPSInstructionFactory.isBinary(str)) {
            return getValue(str, MIPSStringType.Binary);
        } else {
            return getValue(str, MIPSStringType.String);
        }
    }

    public static int getValue(String str, MIPSStringType type) {
        if(type == MIPSStringType.Hex) {
            // TODO create method to convert hex string to int
        } else if(type == MIPSStringType.Binary) {
            // TODO create method to convert binary string to int
        } else if(type == MIPSStringType.String) {
            return map.get(str);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public static String getString(int value) {
        throw new UnsupportedOperationException();
    }
}
