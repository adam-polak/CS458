package lib;

import java.util.HashMap;

public class FunctUtil {
    private static final HashMap<String, Integer> map = new HashMap<>(){{
        put("add", 32);
        put("and", 36);
        put("or", 37);
        put("sub", 34);
        put("syscall", 12);
        put("slt", 42);
    }};

    public static int getValue(String str) {
        return map.get(str);
    }

    public static String getString(int value) {
        for(String key : map.keySet()) {
            if(map.get(key) == value) {
                return key;
            }
        }

        return null;
    }
}
