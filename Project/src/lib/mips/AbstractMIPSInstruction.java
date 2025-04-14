package lib.mips;

public abstract class AbstractMIPSInstruction implements MIPSInstruction {

    protected String cleanString(String str) {
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        boolean lastIsSpace = false;
        for(char c : arr) {
            if(c == '#') break;
            else if(c != ' ' || !lastIsSpace) {
                sb.append(c);
                lastIsSpace = c == ' ';
            }
        }

        return sb.toString().trim();
    }

    public String convert(MIPSStringType format) {
        switch(format) {
            case Binary:
                return toBinary();
            case Hex:
                return toHex();
            case String:
                return toString();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public String toHex() {
        char[] arr = toBinary().toCharArray();
        StringBuilder sb = new StringBuilder();
        StringBuilder hexSb = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);

            if((i + 1) % 4 == 0) {
                hexSb.append(Integer.toString(Integer.parseInt(sb.toString(), 2), 16));
                sb.delete(0, sb.length());
            }
        }

        return hexSb.toString();
    }

    public String toBinary() {
        String str = Integer.toBinaryString(getFullInstructionInt());
        StringBuilder sb = new StringBuilder();
        while(sb.length() + str.length() < 32) {
            sb.append('0');
        }

        sb.append(str);

        return sb.toString();
    }

    @Override
    public abstract String toString();

    protected String[] getPartsOfAsmString(String str) {
        String[] arr = str.split(" ");
        for(int i = 1; i < arr.length - 1; i++) {
            arr[i] = arr[i].trim();
            if(arr[i].endsWith(",")) {
                arr[i] = arr[i].substring(0, arr[i].length() - 1);
            }
        }

        return arr;
    }

    protected int getValue(String str, MIPSStringType type) {
        int x = -1;
        if(type == MIPSStringType.Hex) {
           x = Integer.parseInt(str, 16);
        } else {
           x = Integer.parseInt(str, 2);
        }

        if(x == -1) {
            throw new IllegalArgumentException("Cannot parse string");
        }

        return x;
    }

    protected String hexStrLength(int x, int length) {
        String hex = Integer.toHexString(x);
        StringBuilder pad = new StringBuilder();
        while(hex.length() + pad.length() < length) {
            pad.append('0');
        }

        return pad + hex;
    }

    protected abstract int getFullInstructionInt();
}
