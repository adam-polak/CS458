package lib;

public abstract class AbstractMIPSInstruction implements MIPSInstruction {
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

    protected String[] getPartsOfAsmString(String str) {
        String[] arr = str.split(" ");
        for(int i = 1; i < arr.length - 1; i++) {
            arr[i] = arr[i].substring(0, arr[i].length() - 1); // trim comma
        }

        return arr;
    }

    protected abstract int getFullInstructionInt();
}
