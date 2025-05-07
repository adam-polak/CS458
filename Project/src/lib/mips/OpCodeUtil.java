package lib.mips;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class OpCodeUtil {
    private static final HashMap<String, Integer> map = new HashMap<>() {{
        put("add", 0);
        put("addi", 8);
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
        put("li", -1);
        put("la", -1);
        put("blt", -1);
        put("move", -1);
    }};

    public static int getValue(String str) {
        return map.get(str);
    }

    public static String getString(int value) {
        if (value == 0 || value == -1) {
            throw new IllegalArgumentException("Cannot get op code string for 0 or -1");
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == value) {
                return entry.getKey();
            }
        }

        throw new NoSuchElementException("Op code doesn't exist for value");
    }

    public static MIPSInstructionType getType(int value) {
        if (value == 0) {
            return MIPSInstructionType.R;
        }

        switch (value) {
            case 8:
            case 9:
            case 12:
            case 13:
            case 15:
            case 4:
            case 5:
            case 35:
            case 43:
                return MIPSInstructionType.I;
            case 2:
                return MIPSInstructionType.J;
            case -1:
                return MIPSInstructionType.PSEUDO;
            default:
                throw new IllegalArgumentException("Op code value not recognized: " + value);
        }
    }
}
