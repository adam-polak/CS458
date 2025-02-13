package lib;

public class RegisterUtil {
    public static int getValue(String str) {
        if(str.equals("$zero")) {
            return 0;
        } else if(str.equals("$at")) {
            return 1;
        } else if(str.startsWith("$v")) {
            return 2 + getTrailingInt(str);
        } else if(str.startsWith("$a")) {
            return 4 + getTrailingInt(str);
        } else if(str.startsWith("$t")) {
            int trail = getTrailingInt(str);
            return trail > 7 ? 16 + trail : 8 + trail;
        } else if(str.startsWith("$s")) {
            return 16 + getTrailingInt(str);
        } else if(str.startsWith("$k")) {
            return 26 + getTrailingInt(str);
        } else if(str.equals("$gp")) {
            return 28;
        } else if(str.equals("$sp")) {
            return 29;
        } else if(str.equals("$fp")) {
            return 30;
        } else if(str.equals("$ra")) {
            return 31;
        } else {
            throw new IllegalArgumentException("Register not recognized");
        }
    }

    private static int getTrailingInt(String str) {
        return Integer.parseInt(str.substring(2));
    }
}
