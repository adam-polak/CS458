package Instructions;

import lib.mips.*;

public class MIPSInstructionPSEUDO extends AbstractMIPSInstruction {
    private final MIPSInstruction[] _instructions;

    public MIPSInstructionPSEUDO(String str, MIPSStringType type) {
        if(type != MIPSStringType.String) {
            throw new UnsupportedOperationException();
        }

        str = cleanString(str);
        str = str.replace(",", "");

        String[] parts = str.split(" ");

        int value;
        switch(parts[0]) {
            case "li":
                String immediate = parts[2];
                value = convertToInt(immediate);

                int loadVal = value >> 15;
                int orVal = value & ((1 << 15) - 1);

                if(loadVal == 0) {
                    _instructions = new MIPSInstruction[]{
                            MIPSInstructionFactory.create(
                                "addiu " + parts[1]
                                    + ", $zero, 0x"
                                    + Integer.toHexString(orVal),
                                MIPSStringType.String
                            )
                    };
                } else {
                    _instructions = new MIPSInstruction[]{
                            MIPSInstructionFactory.create(
                                    "lui $at, 0x"
                                            + Integer.toHexString(loadVal),
                                    MIPSStringType.String
                            ),
                            MIPSInstructionFactory.create(
                                    "ori " + parts[1]
                                            + ", $at, 0x"
                                            + Integer.toHexString(orVal),
                                    MIPSStringType.String
                            )
                    };
                }

                break;
            case "la":
                String addr = parts[2];
                value = convertToInt(addr);
                int upper = value >> 16;
                int lower = value & ((1 << 15) - 1);
                _instructions = new MIPSInstruction[]{
                    MIPSInstructionFactory.create(
                      "lui $at, 0x"
                            + Integer.toHexString(upper),
                        MIPSStringType.String
                    ),
                    MIPSInstructionFactory.create(
                        "ori " + parts[1]
                            + ", $at, 0x"
                            + Integer.toHexString(lower),
                        MIPSStringType.String
                    )
                };

                break;
            case "blt":
                _instructions = new MIPSInstruction[]{
                    MIPSInstructionFactory.create(
                        "slt $at, "
                            + parts[1] + ", "
                            + parts[2],
                        MIPSStringType.String
                    ),
                    MIPSInstructionFactory.create(
                        "bne $at, $zero, "
                            + parts[3],
                        MIPSStringType.String
                    )
                };

                break;
            case "move":
                _instructions = new MIPSInstruction[]{
                        MIPSInstructionFactory.create(
                            "add "
                                    + parts[1] + ", "
                                    + parts[2] + " $zero",
                                MIPSStringType.String
                        )
                };

                break;
            default:
                throw new UnsupportedOperationException("Pseudo instruction not implemented yet");
        }
    }

    private int convertToInt(String str) {
        return Integer.parseInt(
                str,
                str.startsWith("0x")
                ? 16
                : 10
        );
    }

    private String toType(MIPSStringType type) {
        StringBuilder sb = new StringBuilder();
        MIPSInstruction ins;
        for(int i = 0; i < _instructions.length; i++) {
            ins = _instructions[i];

            switch(type) {
                case String:
                    sb.append(ins.toString());
                    break;
                case Hex:
                    sb.append(ins.toHex());
                    break;
                case Binary:
                    sb.append(ins.toBinary());
                    break;
                default:
                    throw new UnsupportedOperationException();
            }

            if(i != _instructions.length - 1) {
                sb.append('\n');
            }
        }

        return sb.toString();
    }

    @Override
    public String toBinary() {
        return toType(MIPSStringType.Binary);
    }

    @Override
    public String toHex() {
        return toType(MIPSStringType.Hex);
    }

    @Override
    public String toString() {
        return toType(MIPSStringType.String);
    }

    @Override
    protected int getFullInstructionInt() {
        throw new UnsupportedOperationException();
    }
}
