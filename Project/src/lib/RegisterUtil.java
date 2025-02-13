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

    public static String getString(int value) {
        if(value == 0) {
            return "$zero";
        } else if(value == 1) {
            return "$at";
        } else if(value == 2 || value == 3) {
            return "$v" + (value - 1);
        } else if(value >= 4 && value <= 7) {
            return "$a" + (value - 4);
        } else if(value >= 8 && value <= 15 || value == 24 || value == 25) {
            return "$t" + (value < 24 ? value - 8 : value - 24);
        } else if(value >= 16 && value <= 23) {
            return "$s" + (value - 16);
        } else if(value == 26 || value == 27) {
            return "$k" + (value - 26);
        } else if(value == 28) {
            return "$gp";
        } else if(value == 29) {
            return "$sp";
        } else if(value == 30) {
            return "$fp";
        } else if(value ==31) {
            return "ra";
        } else {
            throw new IllegalArgumentException("Invalid register value");
        }
    }

    private static int getTrailingInt(String str) {
        return Integer.parseInt(str.substring(2));
    }
}
