package lib;

import java.util.HashMap;

public class OpCodeUtil {
    private static final HashMap<String, Integer> map = new HashMap<>(){{
        put("add", 0);
        put("addiu", 9);
        put("and", 0);
        put("andi", 12);
        put("beq", 4);
        put("bne", 5);
        put("j", 2);
        put("lui", 15);
        put("lw", 35);
        put("or", 0);
        put("ori", 13);
        put("slt", 0);
        put("sub", 0);
        put("sw", 43);
        put("syscall", 0);
    }};

    public static int getValue(String str) {
        return map.get(str);
    }

    public static MIPSInstructionType getType(int value) {
        if(value == 0) {
            return MIPSInstructionType.R;
        }

        switch(value) {
            case 9:
            case 12:
            case 15:
            case 13:
            case 4:
            case 5:
            case 35:
            case 43:
                return MIPSInstructionType.I;
            case 2:
                return MIPSInstructionType.J;
            default:
                throw new IllegalArgumentException("Op code value not recognized");
        }
    }
}
