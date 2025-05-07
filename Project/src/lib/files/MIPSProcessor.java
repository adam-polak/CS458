package lib.files;

import lib.mips.*;
import Instructions.*;

import java.io.*;
import java.util.*;

public class MIPSProcessor {
    private final int[] registers = new int[32];
    private final Map<Integer, Integer> memory = new HashMap<>();
    private final Map<Integer, Byte> byteMemory = new HashMap<>();
    private final List<MIPSInstruction> instructions = new ArrayList<>();
    private int pc = 0x00400000;
    private boolean halted = false;

    public void loadTextFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    instructions.add(MIPSInstructionFactory.create(line.trim(), MIPSStringType.Hex));
                }
            }
        }
    }

    public void loadDataFile(String path) throws IOException {
        int address = 0x10010000;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    int value = Integer.parseUnsignedInt(line.trim().replace("0x", ""), 16);
                    memory.put(address, value);
                    byteMemory.put(address,     (byte) (value & 0xFF));
                    byteMemory.put(address + 1, (byte) ((value >> 8) & 0xFF));
                    byteMemory.put(address + 2, (byte) ((value >> 16) & 0xFF));
                    byteMemory.put(address + 3, (byte) ((value >> 24) & 0xFF));
                    address += 4;
                }
            }
        }
    }


    public void run() {
        while (!halted && pc < 0x00400000 + instructions.size() * 4) {
            int idx = (pc - 0x00400000) / 4;

            if (idx < 0 || idx >= instructions.size()) {
                return;
            }

            MIPSInstruction instr = instructions.get(idx);
            if (instr == null) {
                return;
            }

            pc += 4;
            execute(instr);
            registers[0] = 0;
        }
    }

    private void execute(MIPSInstruction instr) {
        if (instr instanceof MIPSInstructionR r) {
            executeR(r);
        } else if (instr instanceof MIPSInstructionI i) {
            executeI(i);
        } else if (instr instanceof MIPSInstructionJ j) {
            executeJ(j);
        } else if (instr instanceof MIPSInstructionPSEUDO p) {
            for (String s : p.toHex().split("\n")) {
                execute(MIPSInstructionFactory.create(s, MIPSStringType.Hex));
            }
        }
    }

    private void executeR(MIPSInstructionR instr) {
        String name = instr.getName();
        if (name == null) {
            return;
        }

        int rs = instr.getRs();
        int rt = instr.getRt();
        int rd = instr.getRd();

        switch (name) {
            case "add":
            case "addu":
                registers[rd] = registers[rs] + registers[rt];
                break;
            case "sub":
                registers[rd] = registers[rs] - registers[rt];
                break;
            case "and":
                registers[rd] = registers[rs] & registers[rt];
                break;
            case "or":
                registers[rd] = registers[rs] | registers[rt];
                break;
            case "slt":
                registers[rd] = (registers[rs] < registers[rt]) ? 1 : 0;
                break;
            case "syscall":
                handleSyscall();
                break;
        }
    }

    private void executeI(MIPSInstructionI instr) {
        String name = instr.getName();
        int rs = instr.getRs();
        int rt = instr.getRt();
        int imm = instr.getImmediate();

        switch (name) {
            case "addiu":
                registers[rt] = registers[rs] + imm;
                break;
            case "andi":
                registers[rt] = registers[rs] & imm;
                break;
            case "ori":
                registers[rt] = registers[rs] | imm;
                break;
            case "lui":
                registers[rt] = imm << 16;
                break;
            case "lw":
                registers[rt] = memory.getOrDefault(registers[rs] + imm, 0);
                break;
            case "sw":
                memory.put(registers[rs] + imm, registers[rt]);
                break;
            case "beq":
                if (registers[rs] == registers[rt])
                    pc += imm << 2;
                break;
            case "bne":
                if (registers[rs] != registers[rt])
                    pc += imm << 2;
                break;
        }
    }

    private void executeJ(MIPSInstructionJ instr) {
        int target = instr.getFullInstructionInt() & 0x03FFFFFF;
        int newPC = 0x00400000 | (target << 2);  // force upper bits to 0x00400000
        int index = (newPC - 0x00400000) / 4;
        if (index >= 0 && index < instructions.size()) {
            pc = newPC;
        } else {
            halted = true;
        }
    }







    private void handleSyscall() {
        int v0 = registers[2];
        Scanner scanner = new Scanner(System.in);

        switch (v0) {
            case 1:
                System.out.println(registers[4]);
                break;
            case 4: {
                int addr = registers[4];
                StringBuilder sb = new StringBuilder();
                while (byteMemory.containsKey(addr) && byteMemory.get(addr) != 0) {
                    sb.append((char) byteMemory.get(addr).byteValue());
                    addr++;
                }
                System.out.print(sb.toString());
                break;
            }
            case 5:
                try {
                    registers[2] = scanner.nextInt();
                } catch (NoSuchElementException e) {
                    registers[2] = 0;
                }
                break;
            case 10:
                System.out.println();
                System.out.println("-- program is finished running --");
                halted = true;
                break;
        }
    }

    public int getRegister(int regNum) {
        return registers[regNum];
    }
}