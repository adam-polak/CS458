package lib;

import java.util.HashMap;

public class FunctUtil {
    private static final HashMap<String, Integer> map = new HashMap<>(){{
        map.put("add", 32);
        map.put("and", 36);
        map.put("or", 37);
        map.put("sub", 34);
        map.put("syscall", 12);
    }};

    public static int getValue(String str) {
        return map.get(str);
    }
}
