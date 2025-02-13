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
}
