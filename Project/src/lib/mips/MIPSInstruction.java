package lib.mips;

public interface MIPSInstruction {
    public String convert(MIPSStringType type);
    public String toString();
    public String toHex();
    public String toBinary();


}
