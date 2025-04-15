package tests;

import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;
import lib.mips.MIPSStringType;
import org.junit.Assert;
import org.junit.Test;

public class Prog2Tests {
    @Test
    public void test0() {
        String str = "02b4e822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 15, rt: 14, rd: 1d, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02b4e822", instruction.toHex());
    }

    @Test
    public void test1() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test2() {
        String str = "027b4822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 13, rt: 1b, rd: 09, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("027b4822", instruction.toHex());
    }

    @Test
    public void test3() {
        String str = "3413ff20";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 00, rt: 13, immediate(offset): ff20}", instruction.toString());
        Assert.assertEquals("3413ff20", instruction.toHex());
    }

    @Test
    public void test4() {
        String str = "117e00df";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0b, rt: 1e, immediate(offset): 00df}", instruction.toString());
        Assert.assertEquals("117e00df", instruction.toHex());
    }

    @Test
    public void test5() {
        String str = "030a0820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 18, rt: 0a, rd: 01, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("030a0820", instruction.toHex());
    }

    @Test
    public void test6() {
        String str = "136affae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1b, rt: 0a, immediate(offset): ffae}", instruction.toString());
        Assert.assertEquals("136affae", instruction.toHex());
    }

    @Test
    public void test7() {
        String str = "10440017";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 02, rt: 04, immediate(offset): 0017}", instruction.toString());
        Assert.assertEquals("10440017", instruction.toHex());
    }

    @Test
    public void test8() {
        String str = "080000cd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000cd}", instruction.toString());
        Assert.assertEquals("080000cd", instruction.toHex());
    }

    @Test
    public void test9() {
        String str = "ae940000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 14, rt: 14, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ae940000", instruction.toHex());
    }

    @Test
    public void test10() {
        String str = "375300ae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 13, immediate(offset): 00ae}", instruction.toString());
        Assert.assertEquals("375300ae", instruction.toHex());
    }

    @Test
    public void test11() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test12() {
        String str = "00dfe02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 06, rt: 1f, rd: 1c, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("00dfe02a", instruction.toHex());
    }

    @Test
    public void test13() {
        String str = "0800008c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000008c}", instruction.toString());
        Assert.assertEquals("0800008c", instruction.toHex());
    }

    @Test
    public void test14() {
        String str = "1273ffe7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 13, rt: 13, immediate(offset): ffe7}", instruction.toString());
        Assert.assertEquals("1273ffe7", instruction.toHex());
    }

    @Test
    public void test15() {
        String str = "03dc0025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1e, rt: 1c, rd: 00, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03dc0025", instruction.toHex());
    }

    @Test
    public void test16() {
        String str = "10c900cd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 06, rt: 09, immediate(offset): 00cd}", instruction.toString());
        Assert.assertEquals("10c900cd", instruction.toHex());
    }

    @Test
    public void test17() {
        String str = "274700c3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1a, rt: 07, immediate(offset): 00c3}", instruction.toString());
        Assert.assertEquals("274700c3", instruction.toHex());
    }

    @Test
    public void test18() {
        String str = "02f43824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 17, rt: 14, rd: 07, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02f43824", instruction.toHex());
    }

    @Test
    public void test19() {
        String str = "aeed0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 17, rt: 0d, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("aeed0000", instruction.toHex());
    }

    @Test
    public void test20() {
        String str = "16cb00aa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 16, rt: 0b, immediate(offset): 00aa}", instruction.toString());
        Assert.assertEquals("16cb00aa", instruction.toHex());
    }

    @Test
    public void test21() {
        String str = "0103b824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 08, rt: 03, rd: 17, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0103b824", instruction.toHex());
    }

    @Test
    public void test22() {
        String str = "3c1d0071";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1d, immediate(offset): 0071}", instruction.toString());
        Assert.assertEquals("3c1d0071", instruction.toHex());
    }

    @Test
    public void test23() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test24() {
        String str = "25c6004d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0e, rt: 06, immediate(offset): 004d}", instruction.toString());
        Assert.assertEquals("25c6004d", instruction.toHex());
    }

    @Test
    public void test25() {
        String str = "32110039";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 10, rt: 11, immediate(offset): 0039}", instruction.toString());
        Assert.assertEquals("32110039", instruction.toHex());
    }

    @Test
    public void test26() {
        String str = "0161c822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0b, rt: 01, rd: 19, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0161c822", instruction.toHex());
    }

    @Test
    public void test27() {
        String str = "03bad020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1d, rt: 1a, rd: 1a, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03bad020", instruction.toHex());
    }

    @Test
    public void test28() {
        String str = "33b9ff27";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1d, rt: 19, immediate(offset): ff27}", instruction.toString());
        Assert.assertEquals("33b9ff27", instruction.toHex());
    }

    @Test
    public void test29() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test30() {
        String str = "0800002e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000002e}", instruction.toString());
        Assert.assertEquals("0800002e", instruction.toHex());
    }

    @Test
    public void test31() {
        String str = "3c08004f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 08, immediate(offset): 004f}", instruction.toString());
        Assert.assertEquals("3c08004f", instruction.toHex());
    }

    @Test
    public void test32() {
        String str = "038b2024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1c, rt: 0b, rd: 04, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("038b2024", instruction.toHex());
    }

    @Test
    public void test33() {
        String str = "0398802a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1c, rt: 18, rd: 10, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0398802a", instruction.toHex());
    }

    @Test
    public void test34() {
        String str = "25fe0085";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0f, rt: 1e, immediate(offset): 0085}", instruction.toString());
        Assert.assertEquals("25fe0085", instruction.toHex());
    }

    @Test
    public void test35() {
        String str = "24e900d4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 07, rt: 09, immediate(offset): 00d4}", instruction.toString());
        Assert.assertEquals("24e900d4", instruction.toHex());
    }

    @Test
    public void test36() {
        String str = "080000ef";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000ef}", instruction.toString());
        Assert.assertEquals("080000ef", instruction.toHex());
    }

    @Test
    public void test37() {
        String str = "3c030054";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 03, immediate(offset): 0054}", instruction.toString());
        Assert.assertEquals("3c030054", instruction.toHex());
    }

    @Test
    public void test38() {
        String str = "271500d5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 18, rt: 15, immediate(offset): 00d5}", instruction.toString());
        Assert.assertEquals("271500d5", instruction.toHex());
    }

    @Test
    public void test39() {
        String str = "3134fffe";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 09, rt: 14, immediate(offset): fffe}", instruction.toString());
        Assert.assertEquals("3134fffe", instruction.toHex());
    }

    @Test
    public void test40() {
        String str = "309d00ea";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 04, rt: 1d, immediate(offset): 00ea}", instruction.toString());
        Assert.assertEquals("309d00ea", instruction.toHex());
    }

    @Test
    public void test41() {
        String str = "0140a820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0a, rt: 00, rd: 15, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("0140a820", instruction.toHex());
    }

    @Test
    public void test42() {
        String str = "01082020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 08, rt: 08, rd: 04, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01082020", instruction.toHex());
    }

    @Test
    public void test43() {
        String str = "035ca020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1a, rt: 1c, rd: 14, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("035ca020", instruction.toHex());
    }

    @Test
    public void test44() {
        String str = "ac0d0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 00, rt: 0d, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac0d0000", instruction.toHex());
    }

    @Test
    public void test45() {
        String str = "03a40020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1d, rt: 04, rd: 00, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03a40020", instruction.toHex());
    }

    @Test
    public void test46() {
        String str = "8fb20000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1d, rt: 12, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8fb20000", instruction.toHex());
    }

    @Test
    public void test47() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test48() {
        String str = "03918824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1c, rt: 11, rd: 11, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03918824", instruction.toHex());
    }

    @Test
    public void test49() {
        String str = "3c01003d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 01, immediate(offset): 003d}", instruction.toString());
        Assert.assertEquals("3c01003d", instruction.toHex());
    }

    @Test
    public void test50() {
        String str = "00a7f82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 05, rt: 07, rd: 1f, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("00a7f82a", instruction.toHex());
    }

    @Test
    public void test51() {
        String str = "03518025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1a, rt: 11, rd: 10, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03518025", instruction.toHex());
    }

    @Test
    public void test52() {
        String str = "3c1400af";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 14, immediate(offset): 00af}", instruction.toString());
        Assert.assertEquals("3c1400af", instruction.toHex());
    }

    @Test
    public void test53() {
        String str = "0143b022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0a, rt: 03, rd: 16, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0143b022", instruction.toHex());
    }

    @Test
    public void test54() {
        String str = "0800006c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000006c}", instruction.toString());
        Assert.assertEquals("0800006c", instruction.toHex());
    }

    @Test
    public void test55() {
        String str = "35fdff2c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0f, rt: 1d, immediate(offset): ff2c}", instruction.toString());
        Assert.assertEquals("35fdff2c", instruction.toHex());
    }

    @Test
    public void test56() {
        String str = "080000ff";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000ff}", instruction.toString());
        Assert.assertEquals("080000ff", instruction.toHex());
    }

    @Test
    public void test57() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test58() {
        String str = "0245b824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 12, rt: 05, rd: 17, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0245b824", instruction.toHex());
    }

    @Test
    public void test59() {
        String str = "3c14000d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 14, immediate(offset): 000d}", instruction.toString());
        Assert.assertEquals("3c14000d", instruction.toHex());
    }

    @Test
    public void test60() {
        String str = "3610ff4d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 10, rt: 10, immediate(offset): ff4d}", instruction.toString());
        Assert.assertEquals("3610ff4d", instruction.toHex());
    }

    @Test
    public void test61() {
        String str = "245a00cf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 02, rt: 1a, immediate(offset): 00cf}", instruction.toString());
        Assert.assertEquals("245a00cf", instruction.toHex());
    }

    @Test
    public void test62() {
        String str = "027e0020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 13, rt: 1e, rd: 00, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("027e0020", instruction.toHex());
    }

    @Test
    public void test63() {
        String str = "34e2ff24";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 07, rt: 02, immediate(offset): ff24}", instruction.toString());
        Assert.assertEquals("34e2ff24", instruction.toHex());
    }

    @Test
    public void test64() {
        String str = "0260f024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 13, rt: 00, rd: 1e, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0260f024", instruction.toHex());
    }

    @Test
    public void test65() {
        String str = "001c1820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 00, rt: 1c, rd: 03, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("001c1820", instruction.toHex());
    }

    @Test
    public void test66() {
        String str = "080000e4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000e4}", instruction.toString());
        Assert.assertEquals("080000e4", instruction.toHex());
    }

    @Test
    public void test67() {
        String str = "ad6f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0b, rt: 0f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ad6f0000", instruction.toHex());
    }

    @Test
    public void test68() {
        String str = "02bfc820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 15, rt: 1f, rd: 19, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02bfc820", instruction.toHex());
    }

    @Test
    public void test69() {
        String str = "080000a0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000a0}", instruction.toString());
        Assert.assertEquals("080000a0", instruction.toHex());
    }

    @Test
    public void test70() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test71() {
        String str = "12d3ff02";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 16, rt: 13, immediate(offset): ff02}", instruction.toString());
        Assert.assertEquals("12d3ff02", instruction.toHex());
    }

    @Test
    public void test72() {
        String str = "27770089";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1b, rt: 17, immediate(offset): 0089}", instruction.toString());
        Assert.assertEquals("27770089", instruction.toHex());
    }

    @Test
    public void test73() {
        String str = "03ec782a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1f, rt: 0c, rd: 0f, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("03ec782a", instruction.toHex());
    }

    @Test
    public void test74() {
        String str = "3c180093";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 18, immediate(offset): 0093}", instruction.toString());
        Assert.assertEquals("3c180093", instruction.toHex());
    }

    @Test
    public void test75() {
        String str = "12ecff0e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 17, rt: 0c, immediate(offset): ff0e}", instruction.toString());
        Assert.assertEquals("12ecff0e", instruction.toHex());
    }

    @Test
    public void test76() {
        String str = "33630001";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1b, rt: 03, immediate(offset): 0001}", instruction.toString());
        Assert.assertEquals("33630001", instruction.toHex());
    }

    @Test
    public void test77() {
        String str = "0398c022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1c, rt: 18, rd: 18, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0398c022", instruction.toHex());
    }

    @Test
    public void test78() {
        String str = "25e40023";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0f, rt: 04, immediate(offset): 0023}", instruction.toString());
        Assert.assertEquals("25e40023", instruction.toHex());
    }

    @Test
    public void test79() {
        String str = "03d90822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1e, rt: 19, rd: 01, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03d90822", instruction.toHex());
    }

    @Test
    public void test80() {
        String str = "136900bc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1b, rt: 09, immediate(offset): 00bc}", instruction.toString());
        Assert.assertEquals("136900bc", instruction.toHex());
    }

    @Test
    public void test81() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test82() {
        String str = "03a91024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1d, rt: 09, rd: 02, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03a91024", instruction.toHex());
    }

    @Test
    public void test83() {
        String str = "0179b825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 0b, rt: 19, rd: 17, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("0179b825", instruction.toHex());
    }

    @Test
    public void test84() {
        String str = "02d5282a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 16, rt: 15, rd: 05, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02d5282a", instruction.toHex());
    }

    @Test
    public void test85() {
        String str = "0800005e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000005e}", instruction.toString());
        Assert.assertEquals("0800005e", instruction.toHex());
    }

    @Test
    public void test86() {
        String str = "024da025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 12, rt: 0d, rd: 14, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("024da025", instruction.toHex());
    }

    @Test
    public void test87() {
        String str = "03353022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 19, rt: 15, rd: 06, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03353022", instruction.toHex());
    }

    @Test
    public void test88() {
        String str = "ac270000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 01, rt: 07, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac270000", instruction.toHex());
    }

    @Test
    public void test89() {
        String str = "1004ffb1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 00, rt: 04, immediate(offset): ffb1}", instruction.toString());
        Assert.assertEquals("1004ffb1", instruction.toHex());
    }

    @Test
    public void test90() {
        String str = "aec50000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 16, rt: 05, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("aec50000", instruction.toHex());
    }

    @Test
    public void test91() {
        String str = "10fdffaf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 07, rt: 1d, immediate(offset): ffaf}", instruction.toString());
        Assert.assertEquals("10fdffaf", instruction.toHex());
    }

    @Test
    public void test92() {
        String str = "114300a4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0a, rt: 03, immediate(offset): 00a4}", instruction.toString());
        Assert.assertEquals("114300a4", instruction.toHex());
    }

    @Test
    public void test93() {
        String str = "34c3ff64";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 06, rt: 03, immediate(offset): ff64}", instruction.toString());
        Assert.assertEquals("34c3ff64", instruction.toHex());
    }

    @Test
    public void test94() {
        String str = "27b7000d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1d, rt: 17, immediate(offset): 000d}", instruction.toString());
        Assert.assertEquals("27b7000d", instruction.toHex());
    }

    @Test
    public void test95() {
        String str = "26fa0064";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 17, rt: 1a, immediate(offset): 0064}", instruction.toString());
        Assert.assertEquals("26fa0064", instruction.toHex());
    }

    @Test
    public void test96() {
        String str = "156bffd9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 0b, rt: 0b, immediate(offset): ffd9}", instruction.toString());
        Assert.assertEquals("156bffd9", instruction.toHex());
    }

    @Test
    public void test97() {
        String str = "3c150045";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 15, immediate(offset): 0045}", instruction.toString());
        Assert.assertEquals("3c150045", instruction.toHex());
    }

    @Test
    public void test98() {
        String str = "0036602a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 01, rt: 16, rd: 0c, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0036602a", instruction.toHex());
    }

    @Test
    public void test99() {
        String str = "34e9ff9e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 07, rt: 09, immediate(offset): ff9e}", instruction.toString());
        Assert.assertEquals("34e9ff9e", instruction.toHex());
    }

    @Test
    public void test100() {
        String str = "31aaffee";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 0a, immediate(offset): ffee}", instruction.toString());
        Assert.assertEquals("31aaffee", instruction.toHex());
    }

    @Test
    public void test101() {
        String str = "026e5024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 13, rt: 0e, rd: 0a, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("026e5024", instruction.toHex());
    }

    @Test
    public void test102() {
        String str = "0800007a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000007a}", instruction.toString());
        Assert.assertEquals("0800007a", instruction.toHex());
    }

    @Test
    public void test103() {
        String str = "0175a824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0b, rt: 15, rd: 15, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0175a824", instruction.toHex());
    }

    @Test
    public void test104() {
        String str = "3703ffa6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 18, rt: 03, immediate(offset): ffa6}", instruction.toString());
        Assert.assertEquals("3703ffa6", instruction.toHex());
    }

    @Test
    public void test105() {
        String str = "37340077";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 19, rt: 14, immediate(offset): 0077}", instruction.toString());
        Assert.assertEquals("37340077", instruction.toHex());
    }

    @Test
    public void test106() {
        String str = "03144025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 18, rt: 14, rd: 08, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03144025", instruction.toHex());
    }

    @Test
    public void test107() {
        String str = "02c2b025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 16, rt: 02, rd: 16, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("02c2b025", instruction.toHex());
    }

    @Test
    public void test108() {
        String str = "3c150060";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 15, immediate(offset): 0060}", instruction.toString());
        Assert.assertEquals("3c150060", instruction.toHex());
    }

    @Test
    public void test109() {
        String str = "130c00d2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 18, rt: 0c, immediate(offset): 00d2}", instruction.toString());
        Assert.assertEquals("130c00d2", instruction.toHex());
    }

    @Test
    public void test110() {
        String str = "8edd0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 16, rt: 1d, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8edd0000", instruction.toHex());
    }

    @Test
    public void test111() {
        String str = "ae240000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 11, rt: 04, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ae240000", instruction.toHex());
    }

    @Test
    public void test112() {
        String str = "8ddf0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0e, rt: 1f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8ddf0000", instruction.toHex());
    }

    @Test
    public void test113() {
        String str = "0264a825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 13, rt: 04, rd: 15, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("0264a825", instruction.toHex());
    }

    @Test
    public void test114() {
        String str = "007dc025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 03, rt: 1d, rd: 18, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("007dc025", instruction.toHex());
    }

    @Test
    public void test115() {
        String str = "329affc0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 14, rt: 1a, immediate(offset): ffc0}", instruction.toString());
        Assert.assertEquals("329affc0", instruction.toHex());
    }

    @Test
    public void test116() {
        String str = "105aff45";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 02, rt: 1a, immediate(offset): ff45}", instruction.toString());
        Assert.assertEquals("105aff45", instruction.toHex());
    }

    @Test
    public void test117() {
        String str = "36de0071";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 16, rt: 1e, immediate(offset): 0071}", instruction.toString());
        Assert.assertEquals("36de0071", instruction.toHex());
    }

    @Test
    public void test118() {
        String str = "31b900f0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 19, immediate(offset): 00f0}", instruction.toString());
        Assert.assertEquals("31b900f0", instruction.toHex());
    }

    @Test
    public void test119() {
        String str = "026df822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 13, rt: 0d, rd: 1f, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("026df822", instruction.toHex());
    }

    @Test
    public void test120() {
        String str = "0367102a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1b, rt: 07, rd: 02, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0367102a", instruction.toHex());
    }

    @Test
    public void test121() {
        String str = "ac690000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 03, rt: 09, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac690000", instruction.toHex());
    }

    @Test
    public void test122() {
        String str = "01c40822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0e, rt: 04, rd: 01, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01c40822", instruction.toHex());
    }

    @Test
    public void test123() {
        String str = "01695020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0b, rt: 09, rd: 0a, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01695020", instruction.toHex());
    }

    @Test
    public void test124() {
        String str = "3c11006a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 006a}", instruction.toString());
        Assert.assertEquals("3c11006a", instruction.toHex());
    }

    @Test
    public void test125() {
        String str = "acf20000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 07, rt: 12, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("acf20000", instruction.toHex());
    }

    @Test
    public void test126() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test127() {
        String str = "01408022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0a, rt: 00, rd: 10, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01408022", instruction.toHex());
    }

    @Test
    public void test128() {
        String str = "00a40024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 05, rt: 04, rd: 00, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00a40024", instruction.toHex());
    }

    @Test
    public void test129() {
        String str = "00f8a825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 07, rt: 18, rd: 15, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00f8a825", instruction.toHex());
    }

    @Test
    public void test130() {
        String str = "0158182a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 0a, rt: 18, rd: 03, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0158182a", instruction.toHex());
    }

    @Test
    public void test131() {
        String str = "3c010081";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 01, immediate(offset): 0081}", instruction.toString());
        Assert.assertEquals("3c010081", instruction.toHex());
    }

    @Test
    public void test132() {
        String str = "323400f6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 11, rt: 14, immediate(offset): 00f6}", instruction.toString());
        Assert.assertEquals("323400f6", instruction.toHex());
    }

    @Test
    public void test133() {
        String str = "3c16000a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 16, immediate(offset): 000a}", instruction.toString());
        Assert.assertEquals("3c16000a", instruction.toHex());
    }

    @Test
    public void test134() {
        String str = "009ed024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 04, rt: 1e, rd: 1a, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("009ed024", instruction.toHex());
    }

    @Test
    public void test135() {
        String str = "08000030";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000030}", instruction.toString());
        Assert.assertEquals("08000030", instruction.toHex());
    }

    @Test
    public void test136() {
        String str = "08000029";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000029}", instruction.toString());
        Assert.assertEquals("08000029", instruction.toHex());
    }

    @Test
    public void test137() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test138() {
        String str = "000ab820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 00, rt: 0a, rd: 17, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("000ab820", instruction.toHex());
    }

    @Test
    public void test139() {
        String str = "ae85ff94";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 14, rt: 05, immediate(offset): ff94}", instruction.toString());
        Assert.assertEquals("ae85ff94", instruction.toHex());
    }

    @Test
    public void test140() {
        String str = "8e0b00bc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 10, rt: 0b, immediate(offset): 00bc}", instruction.toString());
        Assert.assertEquals("8e0b00bc", instruction.toHex());
    }

    @Test
    public void test141() {
        String str = "00101024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 00, rt: 10, rd: 02, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00101024", instruction.toHex());
    }

    @Test
    public void test142() {
        String str = "0311d824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 18, rt: 11, rd: 1b, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0311d824", instruction.toHex());
    }

    @Test
    public void test143() {
        String str = "af9a0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1c, rt: 1a, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("af9a0000", instruction.toHex());
    }

    @Test
    public void test144() {
        String str = "027dd82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 13, rt: 1d, rd: 1b, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("027dd82a", instruction.toHex());
    }

    @Test
    public void test145() {
        String str = "359f00bb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0c, rt: 1f, immediate(offset): 00bb}", instruction.toString());
        Assert.assertEquals("359f00bb", instruction.toHex());
    }

    @Test
    public void test146() {
        String str = "00118022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 00, rt: 11, rd: 10, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("00118022", instruction.toHex());
    }

    @Test
    public void test147() {
        String str = "8c930000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 04, rt: 13, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8c930000", instruction.toHex());
    }

    @Test
    public void test148() {
        String str = "34750072";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 03, rt: 15, immediate(offset): 0072}", instruction.toString());
        Assert.assertEquals("34750072", instruction.toHex());
    }

    @Test
    public void test149() {
        String str = "08000002";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000002}", instruction.toString());
        Assert.assertEquals("08000002", instruction.toHex());
    }

    @Test
    public void test150() {
        String str = "3c0e0070";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 0070}", instruction.toString());
        Assert.assertEquals("3c0e0070", instruction.toHex());
    }

    @Test
    public void test151() {
        String str = "030a9824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 18, rt: 0a, rd: 13, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("030a9824", instruction.toHex());
    }

    @Test
    public void test152() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test153() {
        String str = "02068020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 10, rt: 06, rd: 10, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02068020", instruction.toHex());
    }

    @Test
    public void test154() {
        String str = "02864820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 14, rt: 06, rd: 09, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02864820", instruction.toHex());
    }

    @Test
    public void test155() {
        String str = "307c0071";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 03, rt: 1c, immediate(offset): 0071}", instruction.toString());
        Assert.assertEquals("307c0071", instruction.toHex());
    }

    @Test
    public void test156() {
        String str = "03de4825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1e, rt: 1e, rd: 09, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03de4825", instruction.toHex());
    }

    @Test
    public void test157() {
        String str = "02a1e822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 15, rt: 01, rd: 1d, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02a1e822", instruction.toHex());
    }

    @Test
    public void test158() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test159() {
        String str = "ad9dff58";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0c, rt: 1d, immediate(offset): ff58}", instruction.toString());
        Assert.assertEquals("ad9dff58", instruction.toHex());
    }

    @Test
    public void test160() {
        String str = "3577ff30";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 17, immediate(offset): ff30}", instruction.toString());
        Assert.assertEquals("3577ff30", instruction.toHex());
    }

    @Test
    public void test161() {
        String str = "02375020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 11, rt: 17, rd: 0a, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02375020", instruction.toHex());
    }

    @Test
    public void test162() {
        String str = "8d81ff91";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0c, rt: 01, immediate(offset): ff91}", instruction.toString());
        Assert.assertEquals("8d81ff91", instruction.toHex());
    }

    @Test
    public void test163() {
        String str = "8c760000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 03, rt: 16, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8c760000", instruction.toHex());
    }

    @Test
    public void test164() {
        String str = "af700000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1b, rt: 10, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("af700000", instruction.toHex());
    }

    @Test
    public void test165() {
        String str = "0130c022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 09, rt: 10, rd: 18, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0130c022", instruction.toHex());
    }

    @Test
    public void test166() {
        String str = "0268f020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 13, rt: 08, rd: 1e, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("0268f020", instruction.toHex());
    }

    @Test
    public void test167() {
        String str = "ae2000c8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 11, rt: 00, immediate(offset): 00c8}", instruction.toString());
        Assert.assertEquals("ae2000c8", instruction.toHex());
    }

    @Test
    public void test168() {
        String str = "316cff18";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 0c, immediate(offset): ff18}", instruction.toString());
        Assert.assertEquals("316cff18", instruction.toHex());
    }

    @Test
    public void test169() {
        String str = "0271982a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 13, rt: 11, rd: 13, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0271982a", instruction.toHex());
    }

    @Test
    public void test170() {
        String str = "080000f5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000f5}", instruction.toString());
        Assert.assertEquals("080000f5", instruction.toHex());
    }

    @Test
    public void test171() {
        String str = "03144025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 18, rt: 14, rd: 08, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03144025", instruction.toHex());
    }

    @Test
    public void test172() {
        String str = "3c0e0053";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 0053}", instruction.toString());
        Assert.assertEquals("3c0e0053", instruction.toHex());
    }

    @Test
    public void test173() {
        String str = "30870057";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 04, rt: 07, immediate(offset): 0057}", instruction.toString());
        Assert.assertEquals("30870057", instruction.toHex());
    }

    @Test
    public void test174() {
        String str = "8c08ff81";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 00, rt: 08, immediate(offset): ff81}", instruction.toString());
        Assert.assertEquals("8c08ff81", instruction.toHex());
    }

    @Test
    public void test175() {
        String str = "2641005c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 12, rt: 01, immediate(offset): 005c}", instruction.toString());
        Assert.assertEquals("2641005c", instruction.toHex());
    }

    @Test
    public void test176() {
        String str = "080000b7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000b7}", instruction.toString());
        Assert.assertEquals("080000b7", instruction.toHex());
    }

    @Test
    public void test177() {
        String str = "00353025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 01, rt: 15, rd: 06, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00353025", instruction.toHex());
    }

    @Test
    public void test178() {
        String str = "3378ff76";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1b, rt: 18, immediate(offset): ff76}", instruction.toString());
        Assert.assertEquals("3378ff76", instruction.toHex());
    }

    @Test
    public void test179() {
        String str = "005a9024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 02, rt: 1a, rd: 12, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("005a9024", instruction.toHex());
    }

    @Test
    public void test180() {
        String str = "003d682a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 01, rt: 1d, rd: 0d, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("003d682a", instruction.toHex());
    }

    @Test
    public void test181() {
        String str = "02cfd824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 16, rt: 0f, rd: 1b, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02cfd824", instruction.toHex());
    }

    @Test
    public void test182() {
        String str = "028e1824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 14, rt: 0e, rd: 03, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("028e1824", instruction.toHex());
    }

    @Test
    public void test183() {
        String str = "35b8ff04";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0d, rt: 18, immediate(offset): ff04}", instruction.toString());
        Assert.assertEquals("35b8ff04", instruction.toHex());
    }

    @Test
    public void test184() {
        String str = "02776822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 13, rt: 17, rd: 0d, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02776822", instruction.toHex());
    }

    @Test
    public void test185() {
        String str = "023b6020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 11, rt: 1b, rd: 0c, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("023b6020", instruction.toHex());
    }

    @Test
    public void test186() {
        String str = "313b0021";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 09, rt: 1b, immediate(offset): 0021}", instruction.toString());
        Assert.assertEquals("313b0021", instruction.toHex());
    }

    @Test
    public void test187() {
        String str = "3748ffe0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 08, immediate(offset): ffe0}", instruction.toString());
        Assert.assertEquals("3748ffe0", instruction.toHex());
    }

    @Test
    public void test188() {
        String str = "08000044";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000044}", instruction.toString());
        Assert.assertEquals("08000044", instruction.toHex());
    }

    @Test
    public void test189() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test190() {
        String str = "24d20060";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 06, rt: 12, immediate(offset): 0060}", instruction.toString());
        Assert.assertEquals("24d20060", instruction.toHex());
    }

    @Test
    public void test191() {
        String str = "0800005e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000005e}", instruction.toString());
        Assert.assertEquals("0800005e", instruction.toHex());
    }

    @Test
    public void test192() {
        String str = "024fa822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 12, rt: 0f, rd: 15, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("024fa822", instruction.toHex());
    }

    @Test
    public void test193() {
        String str = "0800002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000002a}", instruction.toString());
        Assert.assertEquals("0800002a", instruction.toHex());
    }

    @Test
    public void test194() {
        String str = "3004ffa1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 00, rt: 04, immediate(offset): ffa1}", instruction.toString());
        Assert.assertEquals("3004ffa1", instruction.toHex());
    }

    @Test
    public void test195() {
        String str = "037b8820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1b, rt: 1b, rd: 11, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("037b8820", instruction.toHex());
    }

    @Test
    public void test196() {
        String str = "3640008c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 12, rt: 00, immediate(offset): 008c}", instruction.toString());
        Assert.assertEquals("3640008c", instruction.toHex());
    }

    @Test
    public void test197() {
        String str = "3c0200ed";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 02, immediate(offset): 00ed}", instruction.toString());
        Assert.assertEquals("3c0200ed", instruction.toHex());
    }

    @Test
    public void test198() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test199() {
        String str = "018b8020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0c, rt: 0b, rd: 10, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("018b8020", instruction.toHex());
    }

    @Test
    public void test200() {
        String str = "36da0060";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 16, rt: 1a, immediate(offset): 0060}", instruction.toString());
        Assert.assertEquals("36da0060", instruction.toHex());
    }

    @Test
    public void test201() {
        String str = "033a7820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 19, rt: 1a, rd: 0f, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("033a7820", instruction.toHex());
    }

    @Test
    public void test202() {
        String str = "3c1f00f3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1f, immediate(offset): 00f3}", instruction.toString());
        Assert.assertEquals("3c1f00f3", instruction.toHex());
    }

    @Test
    public void test203() {
        String str = "03394025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 19, rt: 19, rd: 08, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03394025", instruction.toHex());
    }

    @Test
    public void test204() {
        String str = "01359824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 09, rt: 15, rd: 13, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01359824", instruction.toHex());
    }

    @Test
    public void test205() {
        String str = "1429000b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 01, rt: 09, immediate(offset): 000b}", instruction.toString());
        Assert.assertEquals("1429000b", instruction.toHex());
    }

    @Test
    public void test206() {
        String str = "34d6008e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 06, rt: 16, immediate(offset): 008e}", instruction.toString());
        Assert.assertEquals("34d6008e", instruction.toHex());
    }

    @Test
    public void test207() {
        String str = "277e0088";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1b, rt: 1e, immediate(offset): 0088}", instruction.toString());
        Assert.assertEquals("277e0088", instruction.toHex());
    }

    @Test
    public void test208() {
        String str = "00ad1822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 05, rt: 0d, rd: 03, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("00ad1822", instruction.toHex());
    }

    @Test
    public void test209() {
        String str = "272300d4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 19, rt: 03, immediate(offset): 00d4}", instruction.toString());
        Assert.assertEquals("272300d4", instruction.toHex());
    }

    @Test
    public void test210() {
        String str = "08000088";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000088}", instruction.toString());
        Assert.assertEquals("08000088", instruction.toHex());
    }

    @Test
    public void test211() {
        String str = "006e7820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 03, rt: 0e, rd: 0f, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("006e7820", instruction.toHex());
    }

    @Test
    public void test212() {
        String str = "8f310000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 19, rt: 11, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8f310000", instruction.toHex());
    }

    @Test
    public void test213() {
        String str = "afbf0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1d, rt: 1f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("afbf0000", instruction.toHex());
    }

    @Test
    public void test214() {
        String str = "adec0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0f, rt: 0c, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("adec0000", instruction.toHex());
    }

    @Test
    public void test215() {
        String str = "8ca60058";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 05, rt: 06, immediate(offset): 0058}", instruction.toString());
        Assert.assertEquals("8ca60058", instruction.toHex());
    }

    @Test
    public void test216() {
        String str = "017e4824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0b, rt: 1e, rd: 09, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("017e4824", instruction.toHex());
    }

    @Test
    public void test217() {
        String str = "0335c02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 19, rt: 15, rd: 18, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0335c02a", instruction.toHex());
    }

    @Test
    public void test218() {
        String str = "10700015";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 03, rt: 10, immediate(offset): 0015}", instruction.toString());
        Assert.assertEquals("10700015", instruction.toHex());
    }

    @Test
    public void test219() {
        String str = "020ba020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 10, rt: 0b, rd: 14, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("020ba020", instruction.toHex());
    }

    @Test
    public void test220() {
        String str = "3c1100a9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00a9}", instruction.toString());
        Assert.assertEquals("3c1100a9", instruction.toHex());
    }

    @Test
    public void test221() {
        String str = "08000078";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000078}", instruction.toString());
        Assert.assertEquals("08000078", instruction.toHex());
    }

    @Test
    public void test222() {
        String str = "0083502a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 04, rt: 03, rd: 0a, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0083502a", instruction.toHex());
    }

    @Test
    public void test223() {
        String str = "00cda025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 06, rt: 0d, rd: 14, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00cda025", instruction.toHex());
    }

    @Test
    public void test224() {
        String str = "10c100b9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 06, rt: 01, immediate(offset): 00b9}", instruction.toString());
        Assert.assertEquals("10c100b9", instruction.toHex());
    }

    @Test
    public void test225() {
        String str = "12adff60";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 15, rt: 0d, immediate(offset): ff60}", instruction.toString());
        Assert.assertEquals("12adff60", instruction.toHex());
    }

    @Test
    public void test226() {
        String str = "8cb80000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 05, rt: 18, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8cb80000", instruction.toHex());
    }

    @Test
    public void test227() {
        String str = "02800824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 14, rt: 00, rd: 01, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02800824", instruction.toHex());
    }

    @Test
    public void test228() {
        String str = "ade50000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0f, rt: 05, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ade50000", instruction.toHex());
    }

    @Test
    public void test229() {
        String str = "02c4d820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 16, rt: 04, rd: 1b, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02c4d820", instruction.toHex());
    }

    @Test
    public void test230() {
        String str = "0800007c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000007c}", instruction.toString());
        Assert.assertEquals("0800007c", instruction.toHex());
    }

    @Test
    public void test231() {
        String str = "0111c820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 08, rt: 11, rd: 19, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("0111c820", instruction.toHex());
    }

    @Test
    public void test232() {
        String str = "3219ff29";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 10, rt: 19, immediate(offset): ff29}", instruction.toString());
        Assert.assertEquals("3219ff29", instruction.toHex());
    }

    @Test
    public void test233() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test234() {
        String str = "31de002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0e, rt: 1e, immediate(offset): 002a}", instruction.toString());
        Assert.assertEquals("31de002a", instruction.toHex());
    }

    @Test
    public void test235() {
        String str = "ae9b0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 14, rt: 1b, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ae9b0000", instruction.toHex());
    }

    @Test
    public void test236() {
        String str = "02df6020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 16, rt: 1f, rd: 0c, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02df6020", instruction.toHex());
    }

    @Test
    public void test237() {
        String str = "3202ffa8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 10, rt: 02, immediate(offset): ffa8}", instruction.toString());
        Assert.assertEquals("3202ffa8", instruction.toHex());
    }

    @Test
    public void test238() {
        String str = "010c0025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 08, rt: 0c, rd: 00, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("010c0025", instruction.toHex());
    }

    @Test
    public void test239() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test240() {
        String str = "03e3b822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1f, rt: 03, rd: 17, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03e3b822", instruction.toHex());
    }

    @Test
    public void test241() {
        String str = "01071825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 08, rt: 07, rd: 03, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("01071825", instruction.toHex());
    }

    @Test
    public void test242() {
        String str = "003e4820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 01, rt: 1e, rd: 09, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("003e4820", instruction.toHex());
    }

    @Test
    public void test243() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test244() {
        String str = "0031e022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 01, rt: 11, rd: 1c, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0031e022", instruction.toHex());
    }

    @Test
    public void test245() {
        String str = "af7b0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1b, rt: 1b, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("af7b0000", instruction.toHex());
    }

    @Test
    public void test246() {
        String str = "32a8ffba";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 15, rt: 08, immediate(offset): ffba}", instruction.toString());
        Assert.assertEquals("32a8ffba", instruction.toHex());
    }

    @Test
    public void test247() {
        String str = "3c1b0020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1b, immediate(offset): 0020}", instruction.toString());
        Assert.assertEquals("3c1b0020", instruction.toHex());
    }

    @Test
    public void test248() {
        String str = "8f1f00f3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 18, rt: 1f, immediate(offset): 00f3}", instruction.toString());
        Assert.assertEquals("8f1f00f3", instruction.toHex());
    }

    @Test
    public void test249() {
        String str = "3c07009c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 07, immediate(offset): 009c}", instruction.toString());
        Assert.assertEquals("3c07009c", instruction.toHex());
    }

    @Test
    public void test250() {
        String str = "02eb0025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 17, rt: 0b, rd: 00, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("02eb0025", instruction.toHex());
    }

    @Test
    public void test251() {
        String str = "13feff3a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1f, rt: 1e, immediate(offset): ff3a}", instruction.toString());
        Assert.assertEquals("13feff3a", instruction.toHex());
    }

    @Test
    public void test252() {
        String str = "018df024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0c, rt: 0d, rd: 1e, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("018df024", instruction.toHex());
    }

    @Test
    public void test253() {
        String str = "023ed02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 11, rt: 1e, rd: 1a, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("023ed02a", instruction.toHex());
    }

    @Test
    public void test254() {
        String str = "ac810000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 04, rt: 01, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac810000", instruction.toHex());
    }

    @Test
    public void test255() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test256() {
        String str = "3c1f00e3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1f, immediate(offset): 00e3}", instruction.toString());
        Assert.assertEquals("3c1f00e3", instruction.toHex());
    }

    @Test
    public void test257() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test258() {
        String str = "1217ff64";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 10, rt: 17, immediate(offset): ff64}", instruction.toString());
        Assert.assertEquals("1217ff64", instruction.toHex());
    }

    @Test
    public void test259() {
        String str = "1517ff00";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 08, rt: 17, immediate(offset): ff00}", instruction.toString());
        Assert.assertEquals("1517ff00", instruction.toHex());
    }

    @Test
    public void test260() {
        String str = "36a8ffb1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 15, rt: 08, immediate(offset): ffb1}", instruction.toString());
        Assert.assertEquals("36a8ffb1", instruction.toHex());
    }

    @Test
    public void test261() {
        String str = "08000059";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000059}", instruction.toString());
        Assert.assertEquals("08000059", instruction.toHex());
    }

    @Test
    public void test262() {
        String str = "00761822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 03, rt: 16, rd: 03, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("00761822", instruction.toHex());
    }

    @Test
    public void test263() {
        String str = "00fc602a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 07, rt: 1c, rd: 0c, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("00fc602a", instruction.toHex());
    }

    @Test
    public void test264() {
        String str = "8f6a0090";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1b, rt: 0a, immediate(offset): 0090}", instruction.toString());
        Assert.assertEquals("8f6a0090", instruction.toHex());
    }

    @Test
    public void test265() {
        String str = "12dc00ac";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 16, rt: 1c, immediate(offset): 00ac}", instruction.toString());
        Assert.assertEquals("12dc00ac", instruction.toHex());
    }

    @Test
    public void test266() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test267() {
        String str = "ac4d0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 02, rt: 0d, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac4d0000", instruction.toHex());
    }

    @Test
    public void test268() {
        String str = "3c1d0005";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1d, immediate(offset): 0005}", instruction.toString());
        Assert.assertEquals("3c1d0005", instruction.toHex());
    }

    @Test
    public void test269() {
        String str = "00a22820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 05, rt: 02, rd: 05, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("00a22820", instruction.toHex());
    }

    @Test
    public void test270() {
        String str = "1585ff6c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 0c, rt: 05, immediate(offset): ff6c}", instruction.toString());
        Assert.assertEquals("1585ff6c", instruction.toHex());
    }

    @Test
    public void test271() {
        String str = "34c600b7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 06, rt: 06, immediate(offset): 00b7}", instruction.toString());
        Assert.assertEquals("34c600b7", instruction.toHex());
    }

    @Test
    public void test272() {
        String str = "01bd882a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 0d, rt: 1d, rd: 11, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("01bd882a", instruction.toHex());
    }

    @Test
    public void test273() {
        String str = "307cffca";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 03, rt: 1c, immediate(offset): ffca}", instruction.toString());
        Assert.assertEquals("307cffca", instruction.toHex());
    }

    @Test
    public void test274() {
        String str = "080000be";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000be}", instruction.toString());
        Assert.assertEquals("080000be", instruction.toHex());
    }

    @Test
    public void test275() {
        String str = "ac220000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 01, rt: 02, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac220000", instruction.toHex());
    }

    @Test
    public void test276() {
        String str = "080000c7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000c7}", instruction.toString());
        Assert.assertEquals("080000c7", instruction.toHex());
    }

    @Test
    public void test277() {
        String str = "17f7ffca";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 1f, rt: 17, immediate(offset): ffca}", instruction.toString());
        Assert.assertEquals("17f7ffca", instruction.toHex());
    }

    @Test
    public void test278() {
        String str = "0062f824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 03, rt: 02, rd: 1f, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0062f824", instruction.toHex());
    }

    @Test
    public void test279() {
        String str = "00de0824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 06, rt: 1e, rd: 01, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00de0824", instruction.toHex());
    }

    @Test
    public void test280() {
        String str = "03aad020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1d, rt: 0a, rd: 1a, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03aad020", instruction.toHex());
    }

    @Test
    public void test281() {
        String str = "02044822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 10, rt: 04, rd: 09, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02044822", instruction.toHex());
    }

    @Test
    public void test282() {
        String str = "023e0820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 11, rt: 1e, rd: 01, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("023e0820", instruction.toHex());
    }

    @Test
    public void test283() {
        String str = "30d80031";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 06, rt: 18, immediate(offset): 0031}", instruction.toString());
        Assert.assertEquals("30d80031", instruction.toHex());
    }

    @Test
    public void test284() {
        String str = "1482ff3f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 04, rt: 02, immediate(offset): ff3f}", instruction.toString());
        Assert.assertEquals("1482ff3f", instruction.toHex());
    }

    @Test
    public void test285() {
        String str = "022dd824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 11, rt: 0d, rd: 1b, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("022dd824", instruction.toHex());
    }

    @Test
    public void test286() {
        String str = "accf0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 06, rt: 0f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("accf0000", instruction.toHex());
    }

    @Test
    public void test287() {
        String str = "356400c4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 04, immediate(offset): 00c4}", instruction.toString());
        Assert.assertEquals("356400c4", instruction.toHex());
    }

    @Test
    public void test288() {
        String str = "178c00bb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 1c, rt: 0c, immediate(offset): 00bb}", instruction.toString());
        Assert.assertEquals("178c00bb", instruction.toHex());
    }

    @Test
    public void test289() {
        String str = "317800d0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 18, immediate(offset): 00d0}", instruction.toString());
        Assert.assertEquals("317800d0", instruction.toHex());
    }

    @Test
    public void test290() {
        String str = "15040040";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 08, rt: 04, immediate(offset): 0040}", instruction.toString());
        Assert.assertEquals("15040040", instruction.toHex());
    }

    @Test
    public void test291() {
        String str = "8cd10000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 06, rt: 11, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8cd10000", instruction.toHex());
    }

    @Test
    public void test292() {
        String str = "3c160078";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 16, immediate(offset): 0078}", instruction.toString());
        Assert.assertEquals("3c160078", instruction.toHex());
    }

    @Test
    public void test293() {
        String str = "03b0482a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1d, rt: 10, rd: 09, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("03b0482a", instruction.toHex());
    }

    @Test
    public void test294() {
        String str = "273a001b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 19, rt: 1a, immediate(offset): 001b}", instruction.toString());
        Assert.assertEquals("273a001b", instruction.toHex());
    }

    @Test
    public void test295() {
        String str = "8e9b0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 14, rt: 1b, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8e9b0000", instruction.toHex());
    }

    @Test
    public void test296() {
        String str = "14cb0001";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 06, rt: 0b, immediate(offset): 0001}", instruction.toString());
        Assert.assertEquals("14cb0001", instruction.toHex());
    }

    @Test
    public void test297() {
        String str = "3598fff7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0c, rt: 18, immediate(offset): fff7}", instruction.toString());
        Assert.assertEquals("3598fff7", instruction.toHex());
    }

    @Test
    public void test298() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test299() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test300() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test301() {
        String str = "01e59820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0f, rt: 05, rd: 13, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01e59820", instruction.toHex());
    }

    @Test
    public void test302() {
        String str = "0397c824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1c, rt: 17, rd: 19, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0397c824", instruction.toHex());
    }

    @Test
    public void test303() {
        String str = "01aa2822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0d, rt: 0a, rd: 05, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01aa2822", instruction.toHex());
    }

    @Test
    public void test304() {
        String str = "26e60029";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 17, rt: 06, immediate(offset): 0029}", instruction.toString());
        Assert.assertEquals("26e60029", instruction.toHex());
    }

    @Test
    public void test305() {
        String str = "37a0ff2d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 00, immediate(offset): ff2d}", instruction.toString());
        Assert.assertEquals("37a0ff2d", instruction.toHex());
    }

    @Test
    public void test306() {
        String str = "11c2001f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0e, rt: 02, immediate(offset): 001f}", instruction.toString());
        Assert.assertEquals("11c2001f", instruction.toHex());
    }

    @Test
    public void test307() {
        String str = "25be0019";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0d, rt: 1e, immediate(offset): 0019}", instruction.toString());
        Assert.assertEquals("25be0019", instruction.toHex());
    }

    @Test
    public void test308() {
        String str = "af200000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 19, rt: 00, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("af200000", instruction.toHex());
    }

    @Test
    public void test309() {
        String str = "00a20824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 05, rt: 02, rd: 01, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00a20824", instruction.toHex());
    }

    @Test
    public void test310() {
        String str = "267300b9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 13, rt: 13, immediate(offset): 00b9}", instruction.toString());
        Assert.assertEquals("267300b9", instruction.toHex());
    }

    @Test
    public void test311() {
        String str = "acb30018";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 05, rt: 13, immediate(offset): 0018}", instruction.toString());
        Assert.assertEquals("acb30018", instruction.toHex());
    }

    @Test
    public void test312() {
        String str = "356f0026";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 0f, immediate(offset): 0026}", instruction.toString());
        Assert.assertEquals("356f0026", instruction.toHex());
    }

    @Test
    public void test313() {
        String str = "1130006d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 09, rt: 10, immediate(offset): 006d}", instruction.toString());
        Assert.assertEquals("1130006d", instruction.toHex());
    }

    @Test
    public void test314() {
        String str = "3321ff82";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 19, rt: 01, immediate(offset): ff82}", instruction.toString());
        Assert.assertEquals("3321ff82", instruction.toHex());
    }

    @Test
    public void test315() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test316() {
        String str = "013f8024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 09, rt: 1f, rd: 10, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("013f8024", instruction.toHex());
    }

    @Test
    public void test317() {
        String str = "1025002b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 01, rt: 05, immediate(offset): 002b}", instruction.toString());
        Assert.assertEquals("1025002b", instruction.toHex());
    }

    @Test
    public void test318() {
        String str = "0351f822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1a, rt: 11, rd: 1f, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0351f822", instruction.toHex());
    }

    @Test
    public void test319() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test320() {
        String str = "00148020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 00, rt: 14, rd: 10, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("00148020", instruction.toHex());
    }

    @Test
    public void test321() {
        String str = "03371824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 19, rt: 17, rd: 03, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03371824", instruction.toHex());
    }

    @Test
    public void test322() {
        String str = "347dff6e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 03, rt: 1d, immediate(offset): ff6e}", instruction.toString());
        Assert.assertEquals("347dff6e", instruction.toHex());
    }

    @Test
    public void test323() {
        String str = "167300cf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 13, rt: 13, immediate(offset): 00cf}", instruction.toString());
        Assert.assertEquals("167300cf", instruction.toHex());
    }

    @Test
    public void test324() {
        String str = "02d0c02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 16, rt: 10, rd: 18, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02d0c02a", instruction.toHex());
    }

    @Test
    public void test325() {
        String str = "370affc5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 18, rt: 0a, immediate(offset): ffc5}", instruction.toString());
        Assert.assertEquals("370affc5", instruction.toHex());
    }

    @Test
    public void test326() {
        String str = "31b1ff39";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 11, immediate(offset): ff39}", instruction.toString());
        Assert.assertEquals("31b1ff39", instruction.toHex());
    }

    @Test
    public void test327() {
        String str = "00fe382a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 07, rt: 1e, rd: 07, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("00fe382a", instruction.toHex());
    }

    @Test
    public void test328() {
        String str = "3110fffb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 08, rt: 10, immediate(offset): fffb}", instruction.toString());
        Assert.assertEquals("3110fffb", instruction.toHex());
    }

    @Test
    public void test329() {
        String str = "3c130095";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 13, immediate(offset): 0095}", instruction.toString());
        Assert.assertEquals("3c130095", instruction.toHex());
    }

    @Test
    public void test330() {
        String str = "03696824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1b, rt: 09, rd: 0d, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03696824", instruction.toHex());
    }

    @Test
    public void test331() {
        String str = "01b35822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0d, rt: 13, rd: 0b, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01b35822", instruction.toHex());
    }

    @Test
    public void test332() {
        String str = "8cd3ff5b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 06, rt: 13, immediate(offset): ff5b}", instruction.toString());
        Assert.assertEquals("8cd3ff5b", instruction.toHex());
    }

    @Test
    public void test333() {
        String str = "02fa9824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 17, rt: 1a, rd: 13, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02fa9824", instruction.toHex());
    }

    @Test
    public void test334() {
        String str = "02ad502a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 15, rt: 0d, rd: 0a, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02ad502a", instruction.toHex());
    }

    @Test
    public void test335() {
        String str = "131a00e4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 18, rt: 1a, immediate(offset): 00e4}", instruction.toString());
        Assert.assertEquals("131a00e4", instruction.toHex());
    }

    @Test
    public void test336() {
        String str = "00ac1822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 05, rt: 0c, rd: 03, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("00ac1822", instruction.toHex());
    }

    @Test
    public void test337() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test338() {
        String str = "16ec0089";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 17, rt: 0c, immediate(offset): 0089}", instruction.toString());
        Assert.assertEquals("16ec0089", instruction.toHex());
    }

    @Test
    public void test339() {
        String str = "3c1c0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("3c1c0000", instruction.toHex());
    }

    @Test
    public void test340() {
        String str = "010ea822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 08, rt: 0e, rd: 15, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("010ea822", instruction.toHex());
    }

    @Test
    public void test341() {
        String str = "31cc0024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0e, rt: 0c, immediate(offset): 0024}", instruction.toString());
        Assert.assertEquals("31cc0024", instruction.toHex());
    }

    @Test
    public void test342() {
        String str = "3172ff4c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 12, immediate(offset): ff4c}", instruction.toString());
        Assert.assertEquals("3172ff4c", instruction.toHex());
    }

    @Test
    public void test343() {
        String str = "0800008f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000008f}", instruction.toString());
        Assert.assertEquals("0800008f", instruction.toHex());
    }

    @Test
    public void test344() {
        String str = "002b3022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 01, rt: 0b, rd: 06, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("002b3022", instruction.toHex());
    }

    @Test
    public void test345() {
        String str = "02d1e02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 16, rt: 11, rd: 1c, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02d1e02a", instruction.toHex());
    }

    @Test
    public void test346() {
        String str = "8dadff45";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0d, rt: 0d, immediate(offset): ff45}", instruction.toString());
        Assert.assertEquals("8dadff45", instruction.toHex());
    }

    @Test
    public void test347() {
        String str = "361a00a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 10, rt: 1a, immediate(offset): 00a1}", instruction.toString());
        Assert.assertEquals("361a00a1", instruction.toHex());
    }

    @Test
    public void test348() {
        String str = "35200006";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 09, rt: 00, immediate(offset): 0006}", instruction.toString());
        Assert.assertEquals("35200006", instruction.toHex());
    }

    @Test
    public void test349() {
        String str = "3c1400e6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 14, immediate(offset): 00e6}", instruction.toString());
        Assert.assertEquals("3c1400e6", instruction.toHex());
    }

    @Test
    public void test350() {
        String str = "01829824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0c, rt: 02, rd: 13, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01829824", instruction.toHex());
    }

    @Test
    public void test351() {
        String str = "165aff05";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 12, rt: 1a, immediate(offset): ff05}", instruction.toString());
        Assert.assertEquals("165aff05", instruction.toHex());
    }

    @Test
    public void test352() {
        String str = "0179f820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0b, rt: 19, rd: 1f, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("0179f820", instruction.toHex());
    }

    @Test
    public void test353() {
        String str = "0800000f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000000f}", instruction.toString());
        Assert.assertEquals("0800000f", instruction.toHex());
    }

    @Test
    public void test354() {
        String str = "03a59822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1d, rt: 05, rd: 13, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03a59822", instruction.toHex());
    }

    @Test
    public void test355() {
        String str = "00ac182a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 05, rt: 0c, rd: 03, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("00ac182a", instruction.toHex());
    }

    @Test
    public void test356() {
        String str = "3217ff0d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 10, rt: 17, immediate(offset): ff0d}", instruction.toString());
        Assert.assertEquals("3217ff0d", instruction.toHex());
    }

    @Test
    public void test357() {
        String str = "af170089";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 18, rt: 17, immediate(offset): 0089}", instruction.toString());
        Assert.assertEquals("af170089", instruction.toHex());
    }

    @Test
    public void test358() {
        String str = "012c4025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 09, rt: 0c, rd: 08, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("012c4025", instruction.toHex());
    }

    @Test
    public void test359() {
        String str = "008f2024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 04, rt: 0f, rd: 04, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("008f2024", instruction.toHex());
    }

    @Test
    public void test360() {
        String str = "03fbb020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1f, rt: 1b, rd: 16, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03fbb020", instruction.toHex());
    }

    @Test
    public void test361() {
        String str = "001e4020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 00, rt: 1e, rd: 08, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("001e4020", instruction.toHex());
    }

    @Test
    public void test362() {
        String str = "01b4e020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0d, rt: 14, rd: 1c, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01b4e020", instruction.toHex());
    }

    @Test
    public void test363() {
        String str = "080000ef";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000ef}", instruction.toString());
        Assert.assertEquals("080000ef", instruction.toHex());
    }

    @Test
    public void test364() {
        String str = "00fa5820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 07, rt: 1a, rd: 0b, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("00fa5820", instruction.toHex());
    }

    @Test
    public void test365() {
        String str = "00257822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 01, rt: 05, rd: 0f, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("00257822", instruction.toHex());
    }

    @Test
    public void test366() {
        String str = "3c0e00a8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 00a8}", instruction.toString());
        Assert.assertEquals("3c0e00a8", instruction.toHex());
    }

    @Test
    public void test367() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test368() {
        String str = "249300dc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 04, rt: 13, immediate(offset): 00dc}", instruction.toString());
        Assert.assertEquals("249300dc", instruction.toHex());
    }

    @Test
    public void test369() {
        String str = "258b0020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0c, rt: 0b, immediate(offset): 0020}", instruction.toString());
        Assert.assertEquals("258b0020", instruction.toHex());
    }

    @Test
    public void test370() {
        String str = "3071ff2f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 03, rt: 11, immediate(offset): ff2f}", instruction.toString());
        Assert.assertEquals("3071ff2f", instruction.toHex());
    }

    @Test
    public void test371() {
        String str = "0065e02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 03, rt: 05, rd: 1c, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0065e02a", instruction.toHex());
    }

    @Test
    public void test372() {
        String str = "009b5820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 04, rt: 1b, rd: 0b, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("009b5820", instruction.toHex());
    }

    @Test
    public void test373() {
        String str = "08000049";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000049}", instruction.toString());
        Assert.assertEquals("08000049", instruction.toHex());
    }

    @Test
    public void test374() {
        String str = "109fff47";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 04, rt: 1f, immediate(offset): ff47}", instruction.toString());
        Assert.assertEquals("109fff47", instruction.toHex());
    }

    @Test
    public void test375() {
        String str = "8fa40000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1d, rt: 04, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8fa40000", instruction.toHex());
    }

    @Test
    public void test376() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test377() {
        String str = "0800003a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000003a}", instruction.toString());
        Assert.assertEquals("0800003a", instruction.toHex());
    }

    @Test
    public void test378() {
        String str = "0258c024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 12, rt: 18, rd: 18, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0258c024", instruction.toHex());
    }

    @Test
    public void test379() {
        String str = "ae2b0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 11, rt: 0b, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ae2b0000", instruction.toHex());
    }

    @Test
    public void test380() {
        String str = "02c0b025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 16, rt: 00, rd: 16, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("02c0b025", instruction.toHex());
    }

    @Test
    public void test381() {
        String str = "339bff1b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 1b, immediate(offset): ff1b}", instruction.toString());
        Assert.assertEquals("339bff1b", instruction.toHex());
    }

    @Test
    public void test382() {
        String str = "08000070";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000070}", instruction.toString());
        Assert.assertEquals("08000070", instruction.toHex());
    }

    @Test
    public void test383() {
        String str = "01859022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0c, rt: 05, rd: 12, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01859022", instruction.toHex());
    }

    @Test
    public void test384() {
        String str = "aff70000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1f, rt: 17, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("aff70000", instruction.toHex());
    }

    @Test
    public void test385() {
        String str = "33a100ff";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1d, rt: 01, immediate(offset): 00ff}", instruction.toString());
        Assert.assertEquals("33a100ff", instruction.toHex());
    }

    @Test
    public void test386() {
        String str = "afb6ff92";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1d, rt: 16, immediate(offset): ff92}", instruction.toString());
        Assert.assertEquals("afb6ff92", instruction.toHex());
    }

    @Test
    public void test387() {
        String str = "304b0072";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 02, rt: 0b, immediate(offset): 0072}", instruction.toString());
        Assert.assertEquals("304b0072", instruction.toHex());
    }

    @Test
    public void test388() {
        String str = "01e7282a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 0f, rt: 07, rd: 05, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("01e7282a", instruction.toHex());
    }

    @Test
    public void test389() {
        String str = "aff1009e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1f, rt: 11, immediate(offset): 009e}", instruction.toString());
        Assert.assertEquals("aff1009e", instruction.toHex());
    }

    @Test
    public void test390() {
        String str = "0039a82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 01, rt: 19, rd: 15, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0039a82a", instruction.toHex());
    }

    @Test
    public void test391() {
        String str = "038b6822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1c, rt: 0b, rd: 0d, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("038b6822", instruction.toHex());
    }

    @Test
    public void test392() {
        String str = "01d29022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0e, rt: 12, rd: 12, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01d29022", instruction.toHex());
    }

    @Test
    public void test393() {
        String str = "0376f824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1b, rt: 16, rd: 1f, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0376f824", instruction.toHex());
    }

    @Test
    public void test394() {
        String str = "14c900b2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 06, rt: 09, immediate(offset): 00b2}", instruction.toString());
        Assert.assertEquals("14c900b2", instruction.toHex());
    }

    @Test
    public void test395() {
        String str = "15860032";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 0c, rt: 06, immediate(offset): 0032}", instruction.toString());
        Assert.assertEquals("15860032", instruction.toHex());
    }

    @Test
    public void test396() {
        String str = "01847824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0c, rt: 04, rd: 0f, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01847824", instruction.toHex());
    }

    @Test
    public void test397() {
        String str = "002d6820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 01, rt: 0d, rd: 0d, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("002d6820", instruction.toHex());
    }

    @Test
    public void test398() {
        String str = "152b0048";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 09, rt: 0b, immediate(offset): 0048}", instruction.toString());
        Assert.assertEquals("152b0048", instruction.toHex());
    }

    @Test
    public void test399() {
        String str = "ad5100fa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0a, rt: 11, immediate(offset): 00fa}", instruction.toString());
        Assert.assertEquals("ad5100fa", instruction.toHex());
    }

    @Test
    public void test400() {
        String str = "3c1c0093";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 0093}", instruction.toString());
        Assert.assertEquals("3c1c0093", instruction.toHex());
    }

    @Test
    public void test401() {
        String str = "00e46024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 07, rt: 04, rd: 0c, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00e46024", instruction.toHex());
    }

    @Test
    public void test402() {
        String str = "143000bb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 01, rt: 10, immediate(offset): 00bb}", instruction.toString());
        Assert.assertEquals("143000bb", instruction.toHex());
    }

    @Test
    public void test403() {
        String str = "025e502a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 12, rt: 1e, rd: 0a, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("025e502a", instruction.toHex());
    }

    @Test
    public void test404() {
        String str = "8e080000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 10, rt: 08, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8e080000", instruction.toHex());
    }

    @Test
    public void test405() {
        String str = "01009820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 08, rt: 00, rd: 13, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01009820", instruction.toHex());
    }

    @Test
    public void test406() {
        String str = "af7f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1b, rt: 1f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("af7f0000", instruction.toHex());
    }

    @Test
    public void test407() {
        String str = "135b002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1a, rt: 1b, immediate(offset): 002a}", instruction.toString());
        Assert.assertEquals("135b002a", instruction.toHex());
    }

    @Test
    public void test408() {
        String str = "24610047";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 03, rt: 01, immediate(offset): 0047}", instruction.toString());
        Assert.assertEquals("24610047", instruction.toHex());
    }

    @Test
    public void test409() {
        String str = "0800006f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000006f}", instruction.toString());
        Assert.assertEquals("0800006f", instruction.toHex());
    }

    @Test
    public void test410() {
        String str = "03cd8022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1e, rt: 0d, rd: 10, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03cd8022", instruction.toHex());
    }

    @Test
    public void test411() {
        String str = "266d00ac";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 13, rt: 0d, immediate(offset): 00ac}", instruction.toString());
        Assert.assertEquals("266d00ac", instruction.toHex());
    }

    @Test
    public void test412() {
        String str = "340eff39";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 00, rt: 0e, immediate(offset): ff39}", instruction.toString());
        Assert.assertEquals("340eff39", instruction.toHex());
    }

    @Test
    public void test413() {
        String str = "10f300c5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 07, rt: 13, immediate(offset): 00c5}", instruction.toString());
        Assert.assertEquals("10f300c5", instruction.toHex());
    }

    @Test
    public void test414() {
        String str = "24910095";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 04, rt: 11, immediate(offset): 0095}", instruction.toString());
        Assert.assertEquals("24910095", instruction.toHex());
    }

    @Test
    public void test415() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test416() {
        String str = "3160ffe4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 00, immediate(offset): ffe4}", instruction.toString());
        Assert.assertEquals("3160ffe4", instruction.toHex());
    }

    @Test
    public void test417() {
        String str = "263600f7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 11, rt: 16, immediate(offset): 00f7}", instruction.toString());
        Assert.assertEquals("263600f7", instruction.toHex());
    }

    @Test
    public void test418() {
        String str = "00856825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 04, rt: 05, rd: 0d, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00856825", instruction.toHex());
    }

    @Test
    public void test419() {
        String str = "13cfffbd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1e, rt: 0f, immediate(offset): ffbd}", instruction.toString());
        Assert.assertEquals("13cfffbd", instruction.toHex());
    }

    @Test
    public void test420() {
        String str = "3c1c0031";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 0031}", instruction.toString());
        Assert.assertEquals("3c1c0031", instruction.toHex());
    }

    @Test
    public void test421() {
        String str = "3c0c0004";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0c, immediate(offset): 0004}", instruction.toString());
        Assert.assertEquals("3c0c0004", instruction.toHex());
    }

    @Test
    public void test422() {
        String str = "322200d7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 11, rt: 02, immediate(offset): 00d7}", instruction.toString());
        Assert.assertEquals("322200d7", instruction.toHex());
    }

    @Test
    public void test423() {
        String str = "327600a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 13, rt: 16, immediate(offset): 00a2}", instruction.toString());
        Assert.assertEquals("327600a2", instruction.toHex());
    }

    @Test
    public void test424() {
        String str = "8e770000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 13, rt: 17, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8e770000", instruction.toHex());
    }

    @Test
    public void test425() {
        String str = "8fa600f8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1d, rt: 06, immediate(offset): 00f8}", instruction.toString());
        Assert.assertEquals("8fa600f8", instruction.toHex());
    }

    @Test
    public void test426() {
        String str = "ae840000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 14, rt: 04, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ae840000", instruction.toHex());
    }

    @Test
    public void test427() {
        String str = "02d8e020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 16, rt: 18, rd: 1c, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02d8e020", instruction.toHex());
    }

    @Test
    public void test428() {
        String str = "32e8ffca";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 17, rt: 08, immediate(offset): ffca}", instruction.toString());
        Assert.assertEquals("32e8ffca", instruction.toHex());
    }

    @Test
    public void test429() {
        String str = "3266ff6b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 13, rt: 06, immediate(offset): ff6b}", instruction.toString());
        Assert.assertEquals("3266ff6b", instruction.toHex());
    }

    @Test
    public void test430() {
        String str = "01f28020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0f, rt: 12, rd: 10, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01f28020", instruction.toHex());
    }

    @Test
    public void test431() {
        String str = "00e14020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 07, rt: 01, rd: 08, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("00e14020", instruction.toHex());
    }

    @Test
    public void test432() {
        String str = "103cff29";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 01, rt: 1c, immediate(offset): ff29}", instruction.toString());
        Assert.assertEquals("103cff29", instruction.toHex());
    }

    @Test
    public void test433() {
        String str = "080000f7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000f7}", instruction.toString());
        Assert.assertEquals("080000f7", instruction.toHex());
    }

    @Test
    public void test434() {
        String str = "1510005c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 08, rt: 10, immediate(offset): 005c}", instruction.toString());
        Assert.assertEquals("1510005c", instruction.toHex());
    }

    @Test
    public void test435() {
        String str = "32f0ff75";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 17, rt: 10, immediate(offset): ff75}", instruction.toString());
        Assert.assertEquals("32f0ff75", instruction.toHex());
    }

    @Test
    public void test436() {
        String str = "0282a025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 14, rt: 02, rd: 14, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("0282a025", instruction.toHex());
    }

    @Test
    public void test437() {
        String str = "1175ffbd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0b, rt: 15, immediate(offset): ffbd}", instruction.toString());
        Assert.assertEquals("1175ffbd", instruction.toHex());
    }

    @Test
    public void test438() {
        String str = "37ec0064";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1f, rt: 0c, immediate(offset): 0064}", instruction.toString());
        Assert.assertEquals("37ec0064", instruction.toHex());
    }

    @Test
    public void test439() {
        String str = "3c090051";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 09, immediate(offset): 0051}", instruction.toString());
        Assert.assertEquals("3c090051", instruction.toHex());
    }

    @Test
    public void test440() {
        String str = "adac0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0d, rt: 0c, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("adac0000", instruction.toHex());
    }

    @Test
    public void test441() {
        String str = "35230093";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 09, rt: 03, immediate(offset): 0093}", instruction.toString());
        Assert.assertEquals("35230093", instruction.toHex());
    }

    @Test
    public void test442() {
        String str = "0023c825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 01, rt: 03, rd: 19, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("0023c825", instruction.toHex());
    }

    @Test
    public void test443() {
        String str = "130bffe0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 18, rt: 0b, immediate(offset): ffe0}", instruction.toString());
        Assert.assertEquals("130bffe0", instruction.toHex());
    }

    @Test
    public void test444() {
        String str = "0383c822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1c, rt: 03, rd: 19, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0383c822", instruction.toHex());
    }

    @Test
    public void test445() {
        String str = "352b0048";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 09, rt: 0b, immediate(offset): 0048}", instruction.toString());
        Assert.assertEquals("352b0048", instruction.toHex());
    }

    @Test
    public void test446() {
        String str = "3c0e00d7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 00d7}", instruction.toString());
        Assert.assertEquals("3c0e00d7", instruction.toHex());
    }

    @Test
    public void test447() {
        String str = "ae720000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 13, rt: 12, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ae720000", instruction.toHex());
    }

    @Test
    public void test448() {
        String str = "0800000b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000000b}", instruction.toString());
        Assert.assertEquals("0800000b", instruction.toHex());
    }

    @Test
    public void test449() {
        String str = "2786009a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1c, rt: 06, immediate(offset): 009a}", instruction.toString());
        Assert.assertEquals("2786009a", instruction.toHex());
    }

    @Test
    public void test450() {
        String str = "372f0006";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 19, rt: 0f, immediate(offset): 0006}", instruction.toString());
        Assert.assertEquals("372f0006", instruction.toHex());
    }

    @Test
    public void test451() {
        String str = "08000050";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000050}", instruction.toString());
        Assert.assertEquals("08000050", instruction.toHex());
    }

    @Test
    public void test452() {
        String str = "3208004b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 10, rt: 08, immediate(offset): 004b}", instruction.toString());
        Assert.assertEquals("3208004b", instruction.toHex());
    }

    @Test
    public void test453() {
        String str = "03596020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1a, rt: 19, rd: 0c, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03596020", instruction.toHex());
    }

    @Test
    public void test454() {
        String str = "002a8025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 01, rt: 0a, rd: 10, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("002a8025", instruction.toHex());
    }

    @Test
    public void test455() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test456() {
        String str = "0008e82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 00, rt: 08, rd: 1d, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0008e82a", instruction.toHex());
    }

    @Test
    public void test457() {
        String str = "036f3025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1b, rt: 0f, rd: 06, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("036f3025", instruction.toHex());
    }

    @Test
    public void test458() {
        String str = "8cfc0037";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 07, rt: 1c, immediate(offset): 0037}", instruction.toString());
        Assert.assertEquals("8cfc0037", instruction.toHex());
    }

    @Test
    public void test459() {
        String str = "0017b820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 00, rt: 17, rd: 17, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("0017b820", instruction.toHex());
    }

    @Test
    public void test460() {
        String str = "24ab00cc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 05, rt: 0b, immediate(offset): 00cc}", instruction.toString());
        Assert.assertEquals("24ab00cc", instruction.toHex());
    }

    @Test
    public void test461() {
        String str = "10d40037";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 06, rt: 14, immediate(offset): 0037}", instruction.toString());
        Assert.assertEquals("10d40037", instruction.toHex());
    }

    @Test
    public void test462() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test463() {
        String str = "02ff9825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 17, rt: 1f, rd: 13, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("02ff9825", instruction.toHex());
    }

    @Test
    public void test464() {
        String str = "12bcffcc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 15, rt: 1c, immediate(offset): ffcc}", instruction.toString());
        Assert.assertEquals("12bcffcc", instruction.toHex());
    }

    @Test
    public void test465() {
        String str = "8c0b0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 00, rt: 0b, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8c0b0000", instruction.toHex());
    }

    @Test
    public void test466() {
        String str = "0800002e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000002e}", instruction.toString());
        Assert.assertEquals("0800002e", instruction.toHex());
    }

    @Test
    public void test467() {
        String str = "019d5825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 0c, rt: 1d, rd: 0b, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("019d5825", instruction.toHex());
    }

    @Test
    public void test468() {
        String str = "25de0088";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0e, rt: 1e, immediate(offset): 0088}", instruction.toString());
        Assert.assertEquals("25de0088", instruction.toHex());
    }

    @Test
    public void test469() {
        String str = "0262402a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 13, rt: 02, rd: 08, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0262402a", instruction.toHex());
    }

    @Test
    public void test470() {
        String str = "325cff89";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 12, rt: 1c, immediate(offset): ff89}", instruction.toString());
        Assert.assertEquals("325cff89", instruction.toHex());
    }

    @Test
    public void test471() {
        String str = "00016024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 00, rt: 01, rd: 0c, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00016024", instruction.toHex());
    }

    @Test
    public void test472() {
        String str = "3c0b0024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0b, immediate(offset): 0024}", instruction.toString());
        Assert.assertEquals("3c0b0024", instruction.toHex());
    }

    @Test
    public void test473() {
        String str = "2414004e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 00, rt: 14, immediate(offset): 004e}", instruction.toString());
        Assert.assertEquals("2414004e", instruction.toHex());
    }

    @Test
    public void test474() {
        String str = "154900ce";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 0a, rt: 09, immediate(offset): 00ce}", instruction.toString());
        Assert.assertEquals("154900ce", instruction.toHex());
    }

    @Test
    public void test475() {
        String str = "8f710000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1b, rt: 11, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8f710000", instruction.toHex());
    }

    @Test
    public void test476() {
        String str = "3483ffc0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 04, rt: 03, immediate(offset): ffc0}", instruction.toString());
        Assert.assertEquals("3483ffc0", instruction.toHex());
    }

    @Test
    public void test477() {
        String str = "8f300000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 19, rt: 10, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8f300000", instruction.toHex());
    }

    @Test
    public void test478() {
        String str = "24ae00d4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 05, rt: 0e, immediate(offset): 00d4}", instruction.toString());
        Assert.assertEquals("24ae00d4", instruction.toHex());
    }

    @Test
    public void test479() {
        String str = "1013ff4c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 00, rt: 13, immediate(offset): ff4c}", instruction.toString());
        Assert.assertEquals("1013ff4c", instruction.toHex());
    }

    @Test
    public void test480() {
        String str = "37d9ffc3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1e, rt: 19, immediate(offset): ffc3}", instruction.toString());
        Assert.assertEquals("37d9ffc3", instruction.toHex());
    }

    @Test
    public void test481() {
        String str = "002b382a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 01, rt: 0b, rd: 07, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("002b382a", instruction.toHex());
    }

    @Test
    public void test482() {
        String str = "8d100000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 08, rt: 10, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d100000", instruction.toHex());
    }

    @Test
    public void test483() {
        String str = "08000024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000024}", instruction.toString());
        Assert.assertEquals("08000024", instruction.toHex());
    }

    @Test
    public void test484() {
        String str = "148affd4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 04, rt: 0a, immediate(offset): ffd4}", instruction.toString());
        Assert.assertEquals("148affd4", instruction.toHex());
    }

    @Test
    public void test485() {
        String str = "08000019";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000019}", instruction.toString());
        Assert.assertEquals("08000019", instruction.toHex());
    }

    @Test
    public void test486() {
        String str = "08000039";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000039}", instruction.toString());
        Assert.assertEquals("08000039", instruction.toHex());
    }

    @Test
    public void test487() {
        String str = "03a8d022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1d, rt: 08, rd: 1a, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03a8d022", instruction.toHex());
    }

    @Test
    public void test488() {
        String str = "13b50024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1d, rt: 15, immediate(offset): 0024}", instruction.toString());
        Assert.assertEquals("13b50024", instruction.toHex());
    }

    @Test
    public void test489() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test490() {
        String str = "03d5e025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1e, rt: 15, rd: 1c, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03d5e025", instruction.toHex());
    }

    @Test
    public void test491() {
        String str = "3c1f0095";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1f, immediate(offset): 0095}", instruction.toString());
        Assert.assertEquals("3c1f0095", instruction.toHex());
    }

    @Test
    public void test492() {
        String str = "ac7f0095";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 03, rt: 1f, immediate(offset): 0095}", instruction.toString());
        Assert.assertEquals("ac7f0095", instruction.toHex());
    }

    @Test
    public void test493() {
        String str = "27d300a7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1e, rt: 13, immediate(offset): 00a7}", instruction.toString());
        Assert.assertEquals("27d300a7", instruction.toHex());
    }

    @Test
    public void test494() {
        String str = "080000e2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000e2}", instruction.toString());
        Assert.assertEquals("080000e2", instruction.toHex());
    }

    @Test
    public void test495() {
        String str = "ac9f001b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 04, rt: 1f, immediate(offset): 001b}", instruction.toString());
        Assert.assertEquals("ac9f001b", instruction.toHex());
    }

    @Test
    public void test496() {
        String str = "10a0ff0a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 05, rt: 00, immediate(offset): ff0a}", instruction.toString());
        Assert.assertEquals("10a0ff0a", instruction.toHex());
    }

    @Test
    public void test497() {
        String str = "0800004f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000004f}", instruction.toString());
        Assert.assertEquals("0800004f", instruction.toHex());
    }

    @Test
    public void test498() {
        String str = "3029fff1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 01, rt: 09, immediate(offset): fff1}", instruction.toString());
        Assert.assertEquals("3029fff1", instruction.toHex());
    }

    @Test
    public void test499() {
        String str = "02d89825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 16, rt: 18, rd: 13, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("02d89825", instruction.toHex());
    }

    @Test
    public void test500() {
        String str = "10c6ffbf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 06, rt: 06, immediate(offset): ffbf}", instruction.toString());
        Assert.assertEquals("10c6ffbf", instruction.toHex());
    }

    @Test
    public void test501() {
        String str = "8d250000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 09, rt: 05, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d250000", instruction.toHex());
    }

    @Test
    public void test502() {
        String str = "adc40000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0e, rt: 04, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("adc40000", instruction.toHex());
    }

    @Test
    public void test503() {
        String str = "080000a8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000a8}", instruction.toString());
        Assert.assertEquals("080000a8", instruction.toHex());
    }

    @Test
    public void test504() {
        String str = "026a3824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 13, rt: 0a, rd: 07, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("026a3824", instruction.toHex());
    }

    @Test
    public void test505() {
        String str = "01408024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0a, rt: 00, rd: 10, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01408024", instruction.toHex());
    }

    @Test
    public void test506() {
        String str = "3c130067";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 13, immediate(offset): 0067}", instruction.toString());
        Assert.assertEquals("3c130067", instruction.toHex());
    }

    @Test
    public void test507() {
        String str = "026e3024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 13, rt: 0e, rd: 06, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("026e3024", instruction.toHex());
    }

    @Test
    public void test508() {
        String str = "005d1025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 02, rt: 1d, rd: 02, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("005d1025", instruction.toHex());
    }

    @Test
    public void test509() {
        String str = "ac620000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 03, rt: 02, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac620000", instruction.toHex());
    }

    @Test
    public void test510() {
        String str = "02a29822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 15, rt: 02, rd: 13, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02a29822", instruction.toHex());
    }

    @Test
    public void test511() {
        String str = "1752ffdc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 1a, rt: 12, immediate(offset): ffdc}", instruction.toString());
        Assert.assertEquals("1752ffdc", instruction.toHex());
    }

    @Test
    public void test512() {
        String str = "080000e4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000e4}", instruction.toString());
        Assert.assertEquals("080000e4", instruction.toHex());
    }

    @Test
    public void test513() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test514() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test515() {
        String str = "3738ffd0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 19, rt: 18, immediate(offset): ffd0}", instruction.toString());
        Assert.assertEquals("3738ffd0", instruction.toHex());
    }

    @Test
    public void test516() {
        String str = "0154b025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 0a, rt: 14, rd: 16, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("0154b025", instruction.toHex());
    }

    @Test
    public void test517() {
        String str = "3c0b001f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0b, immediate(offset): 001f}", instruction.toString());
        Assert.assertEquals("3c0b001f", instruction.toHex());
    }

    @Test
    public void test518() {
        String str = "af1100cb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 18, rt: 11, immediate(offset): 00cb}", instruction.toString());
        Assert.assertEquals("af1100cb", instruction.toHex());
    }

    @Test
    public void test519() {
        String str = "329c0035";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 14, rt: 1c, immediate(offset): 0035}", instruction.toString());
        Assert.assertEquals("329c0035", instruction.toHex());
    }

    @Test
    public void test520() {
        String str = "031b182a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 18, rt: 1b, rd: 03, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("031b182a", instruction.toHex());
    }

    @Test
    public void test521() {
        String str = "8c5f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 02, rt: 1f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8c5f0000", instruction.toHex());
    }

    @Test
    public void test522() {
        String str = "33b7ff98";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1d, rt: 17, immediate(offset): ff98}", instruction.toString());
        Assert.assertEquals("33b7ff98", instruction.toHex());
    }

    @Test
    public void test523() {
        String str = "3c0e0081";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 0081}", instruction.toString());
        Assert.assertEquals("3c0e0081", instruction.toHex());
    }

    @Test
    public void test524() {
        String str = "371e002f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 18, rt: 1e, immediate(offset): 002f}", instruction.toString());
        Assert.assertEquals("371e002f", instruction.toHex());
    }

    @Test
    public void test525() {
        String str = "3285ffbf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 14, rt: 05, immediate(offset): ffbf}", instruction.toString());
        Assert.assertEquals("3285ffbf", instruction.toHex());
    }

    @Test
    public void test526() {
        String str = "339affb8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 1a, immediate(offset): ffb8}", instruction.toString());
        Assert.assertEquals("339affb8", instruction.toHex());
    }

    @Test
    public void test527() {
        String str = "0800004d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000004d}", instruction.toString());
        Assert.assertEquals("0800004d", instruction.toHex());
    }

    @Test
    public void test528() {
        String str = "00b2b022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 05, rt: 12, rd: 16, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("00b2b022", instruction.toHex());
    }

    @Test
    public void test529() {
        String str = "3218ffa3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 10, rt: 18, immediate(offset): ffa3}", instruction.toString());
        Assert.assertEquals("3218ffa3", instruction.toHex());
    }

    @Test
    public void test530() {
        String str = "14d700b3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 06, rt: 17, immediate(offset): 00b3}", instruction.toString());
        Assert.assertEquals("14d700b3", instruction.toHex());
    }

    @Test
    public void test531() {
        String str = "13bcfffd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1d, rt: 1c, immediate(offset): fffd}", instruction.toString());
        Assert.assertEquals("13bcfffd", instruction.toHex());
    }

    @Test
    public void test532() {
        String str = "37b900dd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 19, immediate(offset): 00dd}", instruction.toString());
        Assert.assertEquals("37b900dd", instruction.toHex());
    }

    @Test
    public void test533() {
        String str = "00d5402a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 06, rt: 15, rd: 08, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("00d5402a", instruction.toHex());
    }

    @Test
    public void test534() {
        String str = "256f00aa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0b, rt: 0f, immediate(offset): 00aa}", instruction.toString());
        Assert.assertEquals("256f00aa", instruction.toHex());
    }

    @Test
    public void test535() {
        String str = "25410067";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0a, rt: 01, immediate(offset): 0067}", instruction.toString());
        Assert.assertEquals("25410067", instruction.toHex());
    }

    @Test
    public void test536() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test537() {
        String str = "347400da";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 03, rt: 14, immediate(offset): 00da}", instruction.toString());
        Assert.assertEquals("347400da", instruction.toHex());
    }

    @Test
    public void test538() {
        String str = "147f00f7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 03, rt: 1f, immediate(offset): 00f7}", instruction.toString());
        Assert.assertEquals("147f00f7", instruction.toHex());
    }

    @Test
    public void test539() {
        String str = "1348ff5e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1a, rt: 08, immediate(offset): ff5e}", instruction.toString());
        Assert.assertEquals("1348ff5e", instruction.toHex());
    }

    @Test
    public void test540() {
        String str = "8d200000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 09, rt: 00, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d200000", instruction.toHex());
    }

    @Test
    public void test541() {
        String str = "02723825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 13, rt: 12, rd: 07, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("02723825", instruction.toHex());
    }

    @Test
    public void test542() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test543() {
        String str = "02dce825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 16, rt: 1c, rd: 1d, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("02dce825", instruction.toHex());
    }

    @Test
    public void test544() {
        String str = "0146682a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 0a, rt: 06, rd: 0d, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0146682a", instruction.toHex());
    }

    @Test
    public void test545() {
        String str = "08000060";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000060}", instruction.toString());
        Assert.assertEquals("08000060", instruction.toHex());
    }

    @Test
    public void test546() {
        String str = "080000dd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000dd}", instruction.toString());
        Assert.assertEquals("080000dd", instruction.toHex());
    }

    @Test
    public void test547() {
        String str = "321eff28";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 10, rt: 1e, immediate(offset): ff28}", instruction.toString());
        Assert.assertEquals("321eff28", instruction.toHex());
    }

    @Test
    public void test548() {
        String str = "0129802a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 09, rt: 09, rd: 10, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0129802a", instruction.toHex());
    }

    @Test
    public void test549() {
        String str = "12a600ee";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 15, rt: 06, immediate(offset): 00ee}", instruction.toString());
        Assert.assertEquals("12a600ee", instruction.toHex());
    }

    @Test
    public void test550() {
        String str = "02756820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 13, rt: 15, rd: 0d, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02756820", instruction.toHex());
    }

    @Test
    public void test551() {
        String str = "8cf80000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 07, rt: 18, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8cf80000", instruction.toHex());
    }

    @Test
    public void test552() {
        String str = "25470080";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0a, rt: 07, immediate(offset): 0080}", instruction.toString());
        Assert.assertEquals("25470080", instruction.toHex());
    }

    @Test
    public void test553() {
        String str = "338600bb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 06, immediate(offset): 00bb}", instruction.toString());
        Assert.assertEquals("338600bb", instruction.toHex());
    }

    @Test
    public void test554() {
        String str = "3c1a00f2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1a, immediate(offset): 00f2}", instruction.toString());
        Assert.assertEquals("3c1a00f2", instruction.toHex());
    }

    @Test
    public void test555() {
        String str = "3c0c0063";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0c, immediate(offset): 0063}", instruction.toString());
        Assert.assertEquals("3c0c0063", instruction.toHex());
    }

    @Test
    public void test556() {
        String str = "03a3202a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1d, rt: 03, rd: 04, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("03a3202a", instruction.toHex());
    }

    @Test
    public void test557() {
        String str = "8f37ffe2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 19, rt: 17, immediate(offset): ffe2}", instruction.toString());
        Assert.assertEquals("8f37ffe2", instruction.toHex());
    }

    @Test
    public void test558() {
        String str = "0800003c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000003c}", instruction.toString());
        Assert.assertEquals("0800003c", instruction.toHex());
    }

    @Test
    public void test559() {
        String str = "102000dd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 01, rt: 00, immediate(offset): 00dd}", instruction.toString());
        Assert.assertEquals("102000dd", instruction.toHex());
    }

    @Test
    public void test560() {
        String str = "30b3ffcf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 05, rt: 13, immediate(offset): ffcf}", instruction.toString());
        Assert.assertEquals("30b3ffcf", instruction.toHex());
    }

    @Test
    public void test561() {
        String str = "03d68825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1e, rt: 16, rd: 11, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03d68825", instruction.toHex());
    }

    @Test
    public void test562() {
        String str = "3c1100fb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00fb}", instruction.toString());
        Assert.assertEquals("3c1100fb", instruction.toHex());
    }

    @Test
    public void test563() {
        String str = "03317825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 19, rt: 11, rd: 0f, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03317825", instruction.toHex());
    }

    @Test
    public void test564() {
        String str = "080000a4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000a4}", instruction.toString());
        Assert.assertEquals("080000a4", instruction.toHex());
    }

    @Test
    public void test565() {
        String str = "08000044";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000044}", instruction.toString());
        Assert.assertEquals("08000044", instruction.toHex());
    }

    @Test
    public void test566() {
        String str = "080000e0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000e0}", instruction.toString());
        Assert.assertEquals("080000e0", instruction.toHex());
    }

    @Test
    public void test567() {
        String str = "3c03006e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 03, immediate(offset): 006e}", instruction.toString());
        Assert.assertEquals("3c03006e", instruction.toHex());
    }

    @Test
    public void test568() {
        String str = "25ef00ce";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0f, rt: 0f, immediate(offset): 00ce}", instruction.toString());
        Assert.assertEquals("25ef00ce", instruction.toHex());
    }

    @Test
    public void test569() {
        String str = "3c1300ac";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 13, immediate(offset): 00ac}", instruction.toString());
        Assert.assertEquals("3c1300ac", instruction.toHex());
    }

    @Test
    public void test570() {
        String str = "3c1100d3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00d3}", instruction.toString());
        Assert.assertEquals("3c1100d3", instruction.toHex());
    }

    @Test
    public void test571() {
        String str = "16dfff2c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 16, rt: 1f, immediate(offset): ff2c}", instruction.toString());
        Assert.assertEquals("16dfff2c", instruction.toHex());
    }

    @Test
    public void test572() {
        String str = "018ec02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 0c, rt: 0e, rd: 18, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("018ec02a", instruction.toHex());
    }

    @Test
    public void test573() {
        String str = "142600b1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 01, rt: 06, immediate(offset): 00b1}", instruction.toString());
        Assert.assertEquals("142600b1", instruction.toHex());
    }

    @Test
    public void test574() {
        String str = "133a0076";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 19, rt: 1a, immediate(offset): 0076}", instruction.toString());
        Assert.assertEquals("133a0076", instruction.toHex());
    }

    @Test
    public void test575() {
        String str = "ae0f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 10, rt: 0f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ae0f0000", instruction.toHex());
    }

    @Test
    public void test576() {
        String str = "371d00ca";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 18, rt: 1d, immediate(offset): 00ca}", instruction.toString());
        Assert.assertEquals("371d00ca", instruction.toHex());
    }

    @Test
    public void test577() {
        String str = "02f57020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 17, rt: 15, rd: 0e, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02f57020", instruction.toHex());
    }

    @Test
    public void test578() {
        String str = "02e8a02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 17, rt: 08, rd: 14, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02e8a02a", instruction.toHex());
    }

    @Test
    public void test579() {
        String str = "0095d020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 04, rt: 15, rd: 1a, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("0095d020", instruction.toHex());
    }

    @Test
    public void test580() {
        String str = "10c90082";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 06, rt: 09, immediate(offset): 0082}", instruction.toString());
        Assert.assertEquals("10c90082", instruction.toHex());
    }

    @Test
    public void test581() {
        String str = "0257f02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 12, rt: 17, rd: 1e, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0257f02a", instruction.toHex());
    }

    @Test
    public void test582() {
        String str = "00a1a024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 05, rt: 01, rd: 14, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00a1a024", instruction.toHex());
    }

    @Test
    public void test583() {
        String str = "02db502a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 16, rt: 1b, rd: 0a, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02db502a", instruction.toHex());
    }

    @Test
    public void test584() {
        String str = "080000a6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000a6}", instruction.toString());
        Assert.assertEquals("080000a6", instruction.toHex());
    }

    @Test
    public void test585() {
        String str = "00489022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 02, rt: 08, rd: 12, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("00489022", instruction.toHex());
    }

    @Test
    public void test586() {
        String str = "31e5ff68";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0f, rt: 05, immediate(offset): ff68}", instruction.toString());
        Assert.assertEquals("31e5ff68", instruction.toHex());
    }

    @Test
    public void test587() {
        String str = "146b00b0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 03, rt: 0b, immediate(offset): 00b0}", instruction.toString());
        Assert.assertEquals("146b00b0", instruction.toHex());
    }

    @Test
    public void test588() {
        String str = "34d2009b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 06, rt: 12, immediate(offset): 009b}", instruction.toString());
        Assert.assertEquals("34d2009b", instruction.toHex());
    }

    @Test
    public void test589() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test590() {
        String str = "176600cf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 1b, rt: 06, immediate(offset): 00cf}", instruction.toString());
        Assert.assertEquals("176600cf", instruction.toHex());
    }

    @Test
    public void test591() {
        String str = "01691024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0b, rt: 09, rd: 02, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01691024", instruction.toHex());
    }

    @Test
    public void test592() {
        String str = "0145f822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0a, rt: 05, rd: 1f, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0145f822", instruction.toHex());
    }

    @Test
    public void test593() {
        String str = "16ce0033";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 16, rt: 0e, immediate(offset): 0033}", instruction.toString());
        Assert.assertEquals("16ce0033", instruction.toHex());
    }

    @Test
    public void test594() {
        String str = "8d970000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0c, rt: 17, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d970000", instruction.toHex());
    }

    @Test
    public void test595() {
        String str = "25020088";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 08, rt: 02, immediate(offset): 0088}", instruction.toString());
        Assert.assertEquals("25020088", instruction.toHex());
    }

    @Test
    public void test596() {
        String str = "00959025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 04, rt: 15, rd: 12, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00959025", instruction.toHex());
    }

    @Test
    public void test597() {
        String str = "1340ff0a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1a, rt: 00, immediate(offset): ff0a}", instruction.toString());
        Assert.assertEquals("1340ff0a", instruction.toHex());
    }

    @Test
    public void test598() {
        String str = "accb0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 06, rt: 0b, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("accb0000", instruction.toHex());
    }

    @Test
    public void test599() {
        String str = "00168020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 00, rt: 16, rd: 10, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("00168020", instruction.toHex());
    }

    @Test
    public void test600() {
        String str = "8df60000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0f, rt: 16, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8df60000", instruction.toHex());
    }

    @Test
    public void test601() {
        String str = "35fd0007";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0f, rt: 1d, immediate(offset): 0007}", instruction.toString());
        Assert.assertEquals("35fd0007", instruction.toHex());
    }

    @Test
    public void test602() {
        String str = "24520058";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 02, rt: 12, immediate(offset): 0058}", instruction.toString());
        Assert.assertEquals("24520058", instruction.toHex());
    }

    @Test
    public void test603() {
        String str = "169200eb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 14, rt: 12, immediate(offset): 00eb}", instruction.toString());
        Assert.assertEquals("169200eb", instruction.toHex());
    }

    @Test
    public void test604() {
        String str = "ae5efffd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 12, rt: 1e, immediate(offset): fffd}", instruction.toString());
        Assert.assertEquals("ae5efffd", instruction.toHex());
    }

    @Test
    public void test605() {
        String str = "24a50082";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 05, rt: 05, immediate(offset): 0082}", instruction.toString());
        Assert.assertEquals("24a50082", instruction.toHex());
    }

    @Test
    public void test606() {
        String str = "004f0024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 02, rt: 0f, rd: 00, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("004f0024", instruction.toHex());
    }

    @Test
    public void test607() {
        String str = "379c0049";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1c, rt: 1c, immediate(offset): 0049}", instruction.toString());
        Assert.assertEquals("379c0049", instruction.toHex());
    }

    @Test
    public void test608() {
        String str = "1681003d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 14, rt: 01, immediate(offset): 003d}", instruction.toString());
        Assert.assertEquals("1681003d", instruction.toHex());
    }

    @Test
    public void test609() {
        String str = "aeb20000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 15, rt: 12, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("aeb20000", instruction.toHex());
    }

    @Test
    public void test610() {
        String str = "318e00ce";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0c, rt: 0e, immediate(offset): 00ce}", instruction.toString());
        Assert.assertEquals("318e00ce", instruction.toHex());
    }

    @Test
    public void test611() {
        String str = "14dcfff1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 06, rt: 1c, immediate(offset): fff1}", instruction.toString());
        Assert.assertEquals("14dcfff1", instruction.toHex());
    }

    @Test
    public void test612() {
        String str = "ad9d0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0c, rt: 1d, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ad9d0000", instruction.toHex());
    }

    @Test
    public void test613() {
        String str = "10d7ffcb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 06, rt: 17, immediate(offset): ffcb}", instruction.toString());
        Assert.assertEquals("10d7ffcb", instruction.toHex());
    }

    @Test
    public void test614() {
        String str = "37a90043";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 09, immediate(offset): 0043}", instruction.toString());
        Assert.assertEquals("37a90043", instruction.toHex());
    }

    @Test
    public void test615() {
        String str = "8e68ff83";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 13, rt: 08, immediate(offset): ff83}", instruction.toString());
        Assert.assertEquals("8e68ff83", instruction.toHex());
    }

    @Test
    public void test616() {
        String str = "3c040098";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 04, immediate(offset): 0098}", instruction.toString());
        Assert.assertEquals("3c040098", instruction.toHex());
    }

    @Test
    public void test617() {
        String str = "8e9000b7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 14, rt: 10, immediate(offset): 00b7}", instruction.toString());
        Assert.assertEquals("8e9000b7", instruction.toHex());
    }

    @Test
    public void test618() {
        String str = "01619025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 0b, rt: 01, rd: 12, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("01619025", instruction.toHex());
    }

    @Test
    public void test619() {
        String str = "24c50039";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 06, rt: 05, immediate(offset): 0039}", instruction.toString());
        Assert.assertEquals("24c50039", instruction.toHex());
    }

    @Test
    public void test620() {
        String str = "8f8d00fe";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1c, rt: 0d, immediate(offset): 00fe}", instruction.toString());
        Assert.assertEquals("8f8d00fe", instruction.toHex());
    }

    @Test
    public void test621() {
        String str = "33adffe1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1d, rt: 0d, immediate(offset): ffe1}", instruction.toString());
        Assert.assertEquals("33adffe1", instruction.toHex());
    }

    @Test
    public void test622() {
        String str = "1106ffb2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 08, rt: 06, immediate(offset): ffb2}", instruction.toString());
        Assert.assertEquals("1106ffb2", instruction.toHex());
    }

    @Test
    public void test623() {
        String str = "038be022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1c, rt: 0b, rd: 1c, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("038be022", instruction.toHex());
    }

    @Test
    public void test624() {
        String str = "34df004c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 06, rt: 1f, immediate(offset): 004c}", instruction.toString());
        Assert.assertEquals("34df004c", instruction.toHex());
    }

    @Test
    public void test625() {
        String str = "03b33022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1d, rt: 13, rd: 06, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03b33022", instruction.toHex());
    }

    @Test
    public void test626() {
        String str = "8d2e0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 09, rt: 0e, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d2e0000", instruction.toHex());
    }

    @Test
    public void test627() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test628() {
        String str = "11090041";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 08, rt: 09, immediate(offset): 0041}", instruction.toString());
        Assert.assertEquals("11090041", instruction.toHex());
    }

    @Test
    public void test629() {
        String str = "01664020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0b, rt: 06, rd: 08, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01664020", instruction.toHex());
    }

    @Test
    public void test630() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test631() {
        String str = "37e4004b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1f, rt: 04, immediate(offset): 004b}", instruction.toString());
        Assert.assertEquals("37e4004b", instruction.toHex());
    }

    @Test
    public void test632() {
        String str = "acaffffd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 05, rt: 0f, immediate(offset): fffd}", instruction.toString());
        Assert.assertEquals("acaffffd", instruction.toHex());
    }

    @Test
    public void test633() {
        String str = "03b9e022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1d, rt: 19, rd: 1c, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03b9e022", instruction.toHex());
    }

    @Test
    public void test634() {
        String str = "01b60824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0d, rt: 16, rd: 01, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01b60824", instruction.toHex());
    }

    @Test
    public void test635() {
        String str = "8d720000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0b, rt: 12, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d720000", instruction.toHex());
    }

    @Test
    public void test636() {
        String str = "03030822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 18, rt: 03, rd: 01, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03030822", instruction.toHex());
    }

    @Test
    public void test637() {
        String str = "afd30001";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1e, rt: 13, immediate(offset): 0001}", instruction.toString());
        Assert.assertEquals("afd30001", instruction.toHex());
    }

    @Test
    public void test638() {
        String str = "8ec30000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 16, rt: 03, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8ec30000", instruction.toHex());
    }

    @Test
    public void test639() {
        String str = "3c10009f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 10, immediate(offset): 009f}", instruction.toString());
        Assert.assertEquals("3c10009f", instruction.toHex());
    }

    @Test
    public void test640() {
        String str = "333c00a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 19, rt: 1c, immediate(offset): 00a1}", instruction.toString());
        Assert.assertEquals("333c00a1", instruction.toHex());
    }

    @Test
    public void test641() {
        String str = "3c1c0056";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 0056}", instruction.toString());
        Assert.assertEquals("3c1c0056", instruction.toHex());
    }

    @Test
    public void test642() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test643() {
        String str = "178b0041";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 1c, rt: 0b, immediate(offset): 0041}", instruction.toString());
        Assert.assertEquals("178b0041", instruction.toHex());
    }

    @Test
    public void test644() {
        String str = "ae200000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 11, rt: 00, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ae200000", instruction.toHex());
    }

    @Test
    public void test645() {
        String str = "11ae0098";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0d, rt: 0e, immediate(offset): 0098}", instruction.toString());
        Assert.assertEquals("11ae0098", instruction.toHex());
    }

    @Test
    public void test646() {
        String str = "02e3182a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 17, rt: 03, rd: 03, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02e3182a", instruction.toHex());
    }

    @Test
    public void test647() {
        String str = "10e6008e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 07, rt: 06, immediate(offset): 008e}", instruction.toString());
        Assert.assertEquals("10e6008e", instruction.toHex());
    }

    @Test
    public void test648() {
        String str = "13c2ff8d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1e, rt: 02, immediate(offset): ff8d}", instruction.toString());
        Assert.assertEquals("13c2ff8d", instruction.toHex());
    }

    @Test
    public void test649() {
        String str = "11550052";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0a, rt: 15, immediate(offset): 0052}", instruction.toString());
        Assert.assertEquals("11550052", instruction.toHex());
    }

    @Test
    public void test650() {
        String str = "af87ff21";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1c, rt: 07, immediate(offset): ff21}", instruction.toString());
        Assert.assertEquals("af87ff21", instruction.toHex());
    }

    @Test
    public void test651() {
        String str = "01695024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0b, rt: 09, rd: 0a, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01695024", instruction.toHex());
    }

    @Test
    public void test652() {
        String str = "8dac0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0d, rt: 0c, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8dac0000", instruction.toHex());
    }

    @Test
    public void test653() {
        String str = "012d1025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 09, rt: 0d, rd: 02, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("012d1025", instruction.toHex());
    }

    @Test
    public void test654() {
        String str = "3569ff01";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 09, immediate(offset): ff01}", instruction.toString());
        Assert.assertEquals("3569ff01", instruction.toHex());
    }

    @Test
    public void test655() {
        String str = "08000006";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000006}", instruction.toString());
        Assert.assertEquals("08000006", instruction.toHex());
    }

    @Test
    public void test656() {
        String str = "34e5ff9b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 07, rt: 05, immediate(offset): ff9b}", instruction.toString());
        Assert.assertEquals("34e5ff9b", instruction.toHex());
    }

    @Test
    public void test657() {
        String str = "0800004c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000004c}", instruction.toString());
        Assert.assertEquals("0800004c", instruction.toHex());
    }

    @Test
    public void test658() {
        String str = "142600e8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 01, rt: 06, immediate(offset): 00e8}", instruction.toString());
        Assert.assertEquals("142600e8", instruction.toHex());
    }

    @Test
    public void test659() {
        String str = "1400ff55";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 00, rt: 00, immediate(offset): ff55}", instruction.toString());
        Assert.assertEquals("1400ff55", instruction.toHex());
    }

    @Test
    public void test660() {
        String str = "01cee024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0e, rt: 0e, rd: 1c, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01cee024", instruction.toHex());
    }

    @Test
    public void test661() {
        String str = "3235ffb9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 11, rt: 15, immediate(offset): ffb9}", instruction.toString());
        Assert.assertEquals("3235ffb9", instruction.toHex());
    }

    @Test
    public void test662() {
        String str = "1208005e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 10, rt: 08, immediate(offset): 005e}", instruction.toString());
        Assert.assertEquals("1208005e", instruction.toHex());
    }

    @Test
    public void test663() {
        String str = "10770042";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 03, rt: 17, immediate(offset): 0042}", instruction.toString());
        Assert.assertEquals("10770042", instruction.toHex());
    }

    @Test
    public void test664() {
        String str = "aca2ffee";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 05, rt: 02, immediate(offset): ffee}", instruction.toString());
        Assert.assertEquals("aca2ffee", instruction.toHex());
    }

    @Test
    public void test665() {
        String str = "3090ff4d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 04, rt: 10, immediate(offset): ff4d}", instruction.toString());
        Assert.assertEquals("3090ff4d", instruction.toHex());
    }

    @Test
    public void test666() {
        String str = "00724824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 03, rt: 12, rd: 09, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00724824", instruction.toHex());
    }

    @Test
    public void test667() {
        String str = "3554ffa2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0a, rt: 14, immediate(offset): ffa2}", instruction.toString());
        Assert.assertEquals("3554ffa2", instruction.toHex());
    }

    @Test
    public void test668() {
        String str = "3c020062";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 02, immediate(offset): 0062}", instruction.toString());
        Assert.assertEquals("3c020062", instruction.toHex());
    }

    @Test
    public void test669() {
        String str = "13590092";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1a, rt: 19, immediate(offset): 0092}", instruction.toString());
        Assert.assertEquals("13590092", instruction.toHex());
    }

    @Test
    public void test670() {
        String str = "114800fa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0a, rt: 08, immediate(offset): 00fa}", instruction.toString());
        Assert.assertEquals("114800fa", instruction.toHex());
    }

    @Test
    public void test671() {
        String str = "0344202a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1a, rt: 04, rd: 04, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0344202a", instruction.toHex());
    }

    @Test
    public void test672() {
        String str = "02b2682a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 15, rt: 12, rd: 0d, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02b2682a", instruction.toHex());
    }

    @Test
    public void test673() {
        String str = "27e3007f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1f, rt: 03, immediate(offset): 007f}", instruction.toString());
        Assert.assertEquals("27e3007f", instruction.toHex());
    }

    @Test
    public void test674() {
        String str = "00958025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 04, rt: 15, rd: 10, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00958025", instruction.toHex());
    }

    @Test
    public void test675() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test676() {
        String str = "0357702a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1a, rt: 17, rd: 0e, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0357702a", instruction.toHex());
    }

    @Test
    public void test677() {
        String str = "0207b02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 10, rt: 07, rd: 16, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0207b02a", instruction.toHex());
    }

    @Test
    public void test678() {
        String str = "02664822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 13, rt: 06, rd: 09, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02664822", instruction.toHex());
    }

    @Test
    public void test679() {
        String str = "37aa0004";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 0a, immediate(offset): 0004}", instruction.toString());
        Assert.assertEquals("37aa0004", instruction.toHex());
    }

    @Test
    public void test680() {
        String str = "0336f025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 19, rt: 16, rd: 1e, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("0336f025", instruction.toHex());
    }

    @Test
    public void test681() {
        String str = "144cff60";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 02, rt: 0c, immediate(offset): ff60}", instruction.toString());
        Assert.assertEquals("144cff60", instruction.toHex());
    }

    @Test
    public void test682() {
        String str = "14bb0004";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 05, rt: 1b, immediate(offset): 0004}", instruction.toString());
        Assert.assertEquals("14bb0004", instruction.toHex());
    }

    @Test
    public void test683() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test684() {
        String str = "136c00b6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1b, rt: 0c, immediate(offset): 00b6}", instruction.toString());
        Assert.assertEquals("136c00b6", instruction.toHex());
    }

    @Test
    public void test685() {
        String str = "27cd0035";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1e, rt: 0d, immediate(offset): 0035}", instruction.toString());
        Assert.assertEquals("27cd0035", instruction.toHex());
    }

    @Test
    public void test686() {
        String str = "ac7d0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 03, rt: 1d, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac7d0000", instruction.toHex());
    }

    @Test
    public void test687() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test688() {
        String str = "3c0f0058";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0f, immediate(offset): 0058}", instruction.toString());
        Assert.assertEquals("3c0f0058", instruction.toHex());
    }

    @Test
    public void test689() {
        String str = "acd00000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 06, rt: 10, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("acd00000", instruction.toHex());
    }

    @Test
    public void test690() {
        String str = "af600077";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1b, rt: 00, immediate(offset): 0077}", instruction.toString());
        Assert.assertEquals("af600077", instruction.toHex());
    }

    @Test
    public void test691() {
        String str = "3c0900ec";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 09, immediate(offset): 00ec}", instruction.toString());
        Assert.assertEquals("3c0900ec", instruction.toHex());
    }

    @Test
    public void test692() {
        String str = "01ad582a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 0d, rt: 0d, rd: 0b, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("01ad582a", instruction.toHex());
    }

    @Test
    public void test693() {
        String str = "080000e1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000e1}", instruction.toString());
        Assert.assertEquals("080000e1", instruction.toHex());
    }

    @Test
    public void test694() {
        String str = "8c2e003f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 01, rt: 0e, immediate(offset): 003f}", instruction.toString());
        Assert.assertEquals("8c2e003f", instruction.toHex());
    }

    @Test
    public void test695() {
        String str = "10f700e3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 07, rt: 17, immediate(offset): 00e3}", instruction.toString());
        Assert.assertEquals("10f700e3", instruction.toHex());
    }

    @Test
    public void test696() {
        String str = "03f51025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1f, rt: 15, rd: 02, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03f51025", instruction.toHex());
    }

    @Test
    public void test697() {
        String str = "317900af";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 19, immediate(offset): 00af}", instruction.toString());
        Assert.assertEquals("317900af", instruction.toHex());
    }

    @Test
    public void test698() {
        String str = "26fd007c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 17, rt: 1d, immediate(offset): 007c}", instruction.toString());
        Assert.assertEquals("26fd007c", instruction.toHex());
    }

    @Test
    public void test699() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test700() {
        String str = "8fe7ffb6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1f, rt: 07, immediate(offset): ffb6}", instruction.toString());
        Assert.assertEquals("8fe7ffb6", instruction.toHex());
    }

    @Test
    public void test701() {
        String str = "02cf5025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 16, rt: 0f, rd: 0a, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("02cf5025", instruction.toHex());
    }

    @Test
    public void test702() {
        String str = "080000e2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000e2}", instruction.toString());
        Assert.assertEquals("080000e2", instruction.toHex());
    }

    @Test
    public void test703() {
        String str = "3c040030";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 04, immediate(offset): 0030}", instruction.toString());
        Assert.assertEquals("3c040030", instruction.toHex());
    }

    @Test
    public void test704() {
        String str = "3005002c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 00, rt: 05, immediate(offset): 002c}", instruction.toString());
        Assert.assertEquals("3005002c", instruction.toHex());
    }

    @Test
    public void test705() {
        String str = "03e99820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1f, rt: 09, rd: 13, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03e99820", instruction.toHex());
    }

    @Test
    public void test706() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test707() {
        String str = "3703ff45";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 18, rt: 03, immediate(offset): ff45}", instruction.toString());
        Assert.assertEquals("3703ff45", instruction.toHex());
    }

    @Test
    public void test708() {
        String str = "2776008f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 1b, rt: 16, immediate(offset): 008f}", instruction.toString());
        Assert.assertEquals("2776008f", instruction.toHex());
    }

    @Test
    public void test709() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test710() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test711() {
        String str = "3173ffa8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 13, immediate(offset): ffa8}", instruction.toString());
        Assert.assertEquals("3173ffa8", instruction.toHex());
    }

    @Test
    public void test712() {
        String str = "1422ff98";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 01, rt: 02, immediate(offset): ff98}", instruction.toString());
        Assert.assertEquals("1422ff98", instruction.toHex());
    }

    @Test
    public void test713() {
        String str = "3790ff41";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1c, rt: 10, immediate(offset): ff41}", instruction.toString());
        Assert.assertEquals("3790ff41", instruction.toHex());
    }

    @Test
    public void test714() {
        String str = "080000e9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000e9}", instruction.toString());
        Assert.assertEquals("080000e9", instruction.toHex());
    }

    @Test
    public void test715() {
        String str = "373bff4c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 19, rt: 1b, immediate(offset): ff4c}", instruction.toString());
        Assert.assertEquals("373bff4c", instruction.toHex());
    }

    @Test
    public void test716() {
        String str = "01f8e020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0f, rt: 18, rd: 1c, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01f8e020", instruction.toHex());
    }

    @Test
    public void test717() {
        String str = "025a9022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 12, rt: 1a, rd: 12, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("025a9022", instruction.toHex());
    }

    @Test
    public void test718() {
        String str = "260f00ae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 10, rt: 0f, immediate(offset): 00ae}", instruction.toString());
        Assert.assertEquals("260f00ae", instruction.toHex());
    }

    @Test
    public void test719() {
        String str = "0210902a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 10, rt: 10, rd: 12, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0210902a", instruction.toHex());
    }

    @Test
    public void test720() {
        String str = "02c99824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 16, rt: 09, rd: 13, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02c99824", instruction.toHex());
    }

    @Test
    public void test721() {
        String str = "02331822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 11, rt: 13, rd: 03, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02331822", instruction.toHex());
    }

    @Test
    public void test722() {
        String str = "10500049";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 02, rt: 10, immediate(offset): 0049}", instruction.toString());
        Assert.assertEquals("10500049", instruction.toHex());
    }

    @Test
    public void test723() {
        String str = "aead0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 15, rt: 0d, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("aead0000", instruction.toHex());
    }

    @Test
    public void test724() {
        String str = "02315822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 11, rt: 11, rd: 0b, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02315822", instruction.toHex());
    }

    @Test
    public void test725() {
        String str = "039b1822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1c, rt: 1b, rd: 03, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("039b1822", instruction.toHex());
    }

    @Test
    public void test726() {
        String str = "11ca00bb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0e, rt: 0a, immediate(offset): 00bb}", instruction.toString());
        Assert.assertEquals("11ca00bb", instruction.toHex());
    }

    @Test
    public void test727() {
        String str = "03f9d022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1f, rt: 19, rd: 1a, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03f9d022", instruction.toHex());
    }

    @Test
    public void test728() {
        String str = "02bad022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 15, rt: 1a, rd: 1a, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02bad022", instruction.toHex());
    }

    @Test
    public void test729() {
        String str = "3473ff4f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 03, rt: 13, immediate(offset): ff4f}", instruction.toString());
        Assert.assertEquals("3473ff4f", instruction.toHex());
    }

    @Test
    public void test730() {
        String str = "1051ffbb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 02, rt: 11, immediate(offset): ffbb}", instruction.toString());
        Assert.assertEquals("1051ffbb", instruction.toHex());
    }

    @Test
    public void test731() {
        String str = "02034822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 10, rt: 03, rd: 09, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02034822", instruction.toHex());
    }

    @Test
    public void test732() {
        String str = "1480006c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 04, rt: 00, immediate(offset): 006c}", instruction.toString());
        Assert.assertEquals("1480006c", instruction.toHex());
    }

    @Test
    public void test733() {
        String str = "039fd024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1c, rt: 1f, rd: 1a, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("039fd024", instruction.toHex());
    }

    @Test
    public void test734() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test735() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test736() {
        String str = "3c0b007a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0b, immediate(offset): 007a}", instruction.toString());
        Assert.assertEquals("3c0b007a", instruction.toHex());
    }

    @Test
    public void test737() {
        String str = "3c1a004e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1a, immediate(offset): 004e}", instruction.toString());
        Assert.assertEquals("3c1a004e", instruction.toHex());
    }

    @Test
    public void test738() {
        String str = "00463820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 02, rt: 06, rd: 07, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("00463820", instruction.toHex());
    }

    @Test
    public void test739() {
        String str = "134dff98";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 1a, rt: 0d, immediate(offset): ff98}", instruction.toString());
        Assert.assertEquals("134dff98", instruction.toHex());
    }

    @Test
    public void test740() {
        String str = "037c482a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1b, rt: 1c, rd: 09, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("037c482a", instruction.toHex());
    }

    @Test
    public void test741() {
        String str = "378dff77";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1c, rt: 0d, immediate(offset): ff77}", instruction.toString());
        Assert.assertEquals("378dff77", instruction.toHex());
    }

    @Test
    public void test742() {
        String str = "37aa00a6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1d, rt: 0a, immediate(offset): 00a6}", instruction.toString());
        Assert.assertEquals("37aa00a6", instruction.toHex());
    }

    @Test
    public void test743() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test744() {
        String str = "14f2fffd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 07, rt: 12, immediate(offset): fffd}", instruction.toString());
        Assert.assertEquals("14f2fffd", instruction.toHex());
    }

    @Test
    public void test745() {
        String str = "3285ffc4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 14, rt: 05, immediate(offset): ffc4}", instruction.toString());
        Assert.assertEquals("3285ffc4", instruction.toHex());
    }

    @Test
    public void test746() {
        String str = "01372020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 09, rt: 17, rd: 04, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01372020", instruction.toHex());
    }

    @Test
    public void test747() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test748() {
        String str = "8d9a0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0c, rt: 1a, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d9a0000", instruction.toHex());
    }

    @Test
    public void test749() {
        String str = "03e8c020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1f, rt: 08, rd: 18, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03e8c020", instruction.toHex());
    }

    @Test
    public void test750() {
        String str = "01c21820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0e, rt: 02, rd: 03, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01c21820", instruction.toHex());
    }

    @Test
    public void test751() {
        String str = "00e3e025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 07, rt: 03, rd: 1c, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00e3e025", instruction.toHex());
    }

    @Test
    public void test752() {
        String str = "aefc0052";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 17, rt: 1c, immediate(offset): 0052}", instruction.toString());
        Assert.assertEquals("aefc0052", instruction.toHex());
    }

    @Test
    public void test753() {
        String str = "325f001c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 12, rt: 1f, immediate(offset): 001c}", instruction.toString());
        Assert.assertEquals("325f001c", instruction.toHex());
    }

    @Test
    public void test754() {
        String str = "0251f824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 12, rt: 11, rd: 1f, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0251f824", instruction.toHex());
    }

    @Test
    public void test755() {
        String str = "34eb0003";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 07, rt: 0b, immediate(offset): 0003}", instruction.toString());
        Assert.assertEquals("34eb0003", instruction.toHex());
    }

    @Test
    public void test756() {
        String str = "11c5ff06";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0e, rt: 05, immediate(offset): ff06}", instruction.toString());
        Assert.assertEquals("11c5ff06", instruction.toHex());
    }

    @Test
    public void test757() {
        String str = "10caffbd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 06, rt: 0a, immediate(offset): ffbd}", instruction.toString());
        Assert.assertEquals("10caffbd", instruction.toHex());
    }

    @Test
    public void test758() {
        String str = "301a0081";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 00, rt: 1a, immediate(offset): 0081}", instruction.toString());
        Assert.assertEquals("301a0081", instruction.toHex());
    }

    @Test
    public void test759() {
        String str = "02e1982a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 17, rt: 01, rd: 13, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02e1982a", instruction.toHex());
    }

    @Test
    public void test760() {
        String str = "01549020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0a, rt: 14, rd: 12, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01549020", instruction.toHex());
    }

    @Test
    public void test761() {
        String str = "02188822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 10, rt: 18, rd: 11, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02188822", instruction.toHex());
    }

    @Test
    public void test762() {
        String str = "ad5dff47";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0a, rt: 1d, immediate(offset): ff47}", instruction.toString());
        Assert.assertEquals("ad5dff47", instruction.toHex());
    }

    @Test
    public void test763() {
        String str = "319aff74";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0c, rt: 1a, immediate(offset): ff74}", instruction.toString());
        Assert.assertEquals("319aff74", instruction.toHex());
    }

    @Test
    public void test764() {
        String str = "3614ff08";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 10, rt: 14, immediate(offset): ff08}", instruction.toString());
        Assert.assertEquals("3614ff08", instruction.toHex());
    }

    @Test
    public void test765() {
        String str = "8c460000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 02, rt: 06, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8c460000", instruction.toHex());
    }

    @Test
    public void test766() {
        String str = "018a3024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0c, rt: 0a, rd: 06, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("018a3024", instruction.toHex());
    }

    @Test
    public void test767() {
        String str = "35730084";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0b, rt: 13, immediate(offset): 0084}", instruction.toString());
        Assert.assertEquals("35730084", instruction.toHex());
    }

    @Test
    public void test768() {
        String str = "af47ffa0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1a, rt: 07, immediate(offset): ffa0}", instruction.toString());
        Assert.assertEquals("af47ffa0", instruction.toHex());
    }

    @Test
    public void test769() {
        String str = "0086d822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 04, rt: 06, rd: 1b, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0086d822", instruction.toHex());
    }

    @Test
    public void test770() {
        String str = "26350035";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 11, rt: 15, immediate(offset): 0035}", instruction.toString());
        Assert.assertEquals("26350035", instruction.toHex());
    }

    @Test
    public void test771() {
        String str = "ad590000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0a, rt: 19, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ad590000", instruction.toHex());
    }

    @Test
    public void test772() {
        String str = "333000d3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 19, rt: 10, immediate(offset): 00d3}", instruction.toString());
        Assert.assertEquals("333000d3", instruction.toHex());
    }

    @Test
    public void test773() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test774() {
        String str = "32c5ffcc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 16, rt: 05, immediate(offset): ffcc}", instruction.toString());
        Assert.assertEquals("32c5ffcc", instruction.toHex());
    }

    @Test
    public void test775() {
        String str = "01c25024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0e, rt: 02, rd: 0a, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01c25024", instruction.toHex());
    }

    @Test
    public void test776() {
        String str = "31770000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0b, rt: 17, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("31770000", instruction.toHex());
    }

    @Test
    public void test777() {
        String str = "af510000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1a, rt: 11, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("af510000", instruction.toHex());
    }

    @Test
    public void test778() {
        String str = "ac710000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 03, rt: 11, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac710000", instruction.toHex());
    }

    @Test
    public void test779() {
        String str = "3326006c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 19, rt: 06, immediate(offset): 006c}", instruction.toString());
        Assert.assertEquals("3326006c", instruction.toHex());
    }

    @Test
    public void test780() {
        String str = "8c200000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 01, rt: 00, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8c200000", instruction.toHex());
    }

    @Test
    public void test781() {
        String str = "264d0007";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 12, rt: 0d, immediate(offset): 0007}", instruction.toString());
        Assert.assertEquals("264d0007", instruction.toHex());
    }

    @Test
    public void test782() {
        String str = "af150097";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 18, rt: 15, immediate(offset): 0097}", instruction.toString());
        Assert.assertEquals("af150097", instruction.toHex());
    }

    @Test
    public void test783() {
        String str = "03145825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 18, rt: 14, rd: 0b, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03145825", instruction.toHex());
    }

    @Test
    public void test784() {
        String str = "32acffab";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 15, rt: 0c, immediate(offset): ffab}", instruction.toString());
        Assert.assertEquals("32acffab", instruction.toHex());
    }

    @Test
    public void test785() {
        String str = "37c70053";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1e, rt: 07, immediate(offset): 0053}", instruction.toString());
        Assert.assertEquals("37c70053", instruction.toHex());
    }

    @Test
    public void test786() {
        String str = "261e0066";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 10, rt: 1e, immediate(offset): 0066}", instruction.toString());
        Assert.assertEquals("261e0066", instruction.toHex());
    }

    @Test
    public void test787() {
        String str = "000e382a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 00, rt: 0e, rd: 07, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("000e382a", instruction.toHex());
    }

    @Test
    public void test788() {
        String str = "01e9e022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0f, rt: 09, rd: 1c, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01e9e022", instruction.toHex());
    }

    @Test
    public void test789() {
        String str = "ad580000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0a, rt: 18, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ad580000", instruction.toHex());
    }

    @Test
    public void test790() {
        String str = "080000af";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000af}", instruction.toString());
        Assert.assertEquals("080000af", instruction.toHex());
    }

    @Test
    public void test791() {
        String str = "03b25025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1d, rt: 12, rd: 0a, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03b25025", instruction.toHex());
    }

    @Test
    public void test792() {
        String str = "8e440062";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 12, rt: 04, immediate(offset): 0062}", instruction.toString());
        Assert.assertEquals("8e440062", instruction.toHex());
    }

    @Test
    public void test793() {
        String str = "144effe4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 02, rt: 0e, immediate(offset): ffe4}", instruction.toString());
        Assert.assertEquals("144effe4", instruction.toHex());
    }

    @Test
    public void test794() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test795() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test796() {
        String str = "012f2022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 09, rt: 0f, rd: 04, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("012f2022", instruction.toHex());
    }

    @Test
    public void test797() {
        String str = "03aa2024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1d, rt: 0a, rd: 04, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03aa2024", instruction.toHex());
    }

    @Test
    public void test798() {
        String str = "02204820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 11, rt: 00, rd: 09, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02204820", instruction.toHex());
    }

    @Test
    public void test799() {
        String str = "080000fd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000fd}", instruction.toString());
        Assert.assertEquals("080000fd", instruction.toHex());
    }

    @Test
    public void test800() {
        String str = "01c91025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 0e, rt: 09, rd: 02, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("01c91025", instruction.toHex());
    }

    @Test
    public void test801() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test802() {
        String str = "24f1000b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 07, rt: 11, immediate(offset): 000b}", instruction.toString());
        Assert.assertEquals("24f1000b", instruction.toHex());
    }

    @Test
    public void test803() {
        String str = "02b3002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 15, rt: 13, rd: 00, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02b3002a", instruction.toHex());
    }

    @Test
    public void test804() {
        String str = "3745ffd0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 05, immediate(offset): ffd0}", instruction.toString());
        Assert.assertEquals("3745ffd0", instruction.toHex());
    }

    @Test
    public void test805() {
        String str = "03d98020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1e, rt: 19, rd: 10, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03d98020", instruction.toHex());
    }

    @Test
    public void test806() {
        String str = "3c1100fc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00fc}", instruction.toString());
        Assert.assertEquals("3c1100fc", instruction.toHex());
    }

    @Test
    public void test807() {
        String str = "0800004e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000004e}", instruction.toString());
        Assert.assertEquals("0800004e", instruction.toHex());
    }

    @Test
    public void test808() {
        String str = "32e7ffcb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 17, rt: 07, immediate(offset): ffcb}", instruction.toString());
        Assert.assertEquals("32e7ffcb", instruction.toHex());
    }

    @Test
    public void test809() {
        String str = "01b80025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 0d, rt: 18, rd: 00, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("01b80025", instruction.toHex());
    }

    @Test
    public void test810() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test811() {
        String str = "2733002e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 19, rt: 13, immediate(offset): 002e}", instruction.toString());
        Assert.assertEquals("2733002e", instruction.toHex());
    }

    @Test
    public void test812() {
        String str = "8f82ffd3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1c, rt: 02, immediate(offset): ffd3}", instruction.toString());
        Assert.assertEquals("8f82ffd3", instruction.toHex());
    }

    @Test
    public void test813() {
        String str = "01a02022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0d, rt: 00, rd: 04, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01a02022", instruction.toHex());
    }

    @Test
    public void test814() {
        String str = "035b382a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1a, rt: 1b, rd: 07, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("035b382a", instruction.toHex());
    }

    @Test
    public void test815() {
        String str = "08000059";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000059}", instruction.toString());
        Assert.assertEquals("08000059", instruction.toHex());
    }

    @Test
    public void test816() {
        String str = "01d5c824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 0e, rt: 15, rd: 19, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("01d5c824", instruction.toHex());
    }

    @Test
    public void test817() {
        String str = "8c00000f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 00, rt: 00, immediate(offset): 000f}", instruction.toString());
        Assert.assertEquals("8c00000f", instruction.toHex());
    }

    @Test
    public void test818() {
        String str = "30c3009f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 06, rt: 03, immediate(offset): 009f}", instruction.toString());
        Assert.assertEquals("30c3009f", instruction.toHex());
    }

    @Test
    public void test819() {
        String str = "109800e2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 04, rt: 18, immediate(offset): 00e2}", instruction.toString());
        Assert.assertEquals("109800e2", instruction.toHex());
    }

    @Test
    public void test820() {
        String str = "24e200fc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 07, rt: 02, immediate(offset): 00fc}", instruction.toString());
        Assert.assertEquals("24e200fc", instruction.toHex());
    }

    @Test
    public void test821() {
        String str = "af990000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1c, rt: 19, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("af990000", instruction.toHex());
    }

    @Test
    public void test822() {
        String str = "0021a020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 01, rt: 01, rd: 14, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("0021a020", instruction.toHex());
    }

    @Test
    public void test823() {
        String str = "039f9824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1c, rt: 1f, rd: 13, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("039f9824", instruction.toHex());
    }

    @Test
    public void test824() {
        String str = "080000c1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000c1}", instruction.toString());
        Assert.assertEquals("080000c1", instruction.toHex());
    }

    @Test
    public void test825() {
        String str = "adf60000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0f, rt: 16, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("adf60000", instruction.toHex());
    }

    @Test
    public void test826() {
        String str = "02b6b82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 15, rt: 16, rd: 17, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("02b6b82a", instruction.toHex());
    }

    @Test
    public void test827() {
        String str = "246f00f6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 03, rt: 0f, immediate(offset): 00f6}", instruction.toString());
        Assert.assertEquals("246f00f6", instruction.toHex());
    }

    @Test
    public void test828() {
        String str = "8ea30000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 15, rt: 03, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8ea30000", instruction.toHex());
    }

    @Test
    public void test829() {
        String str = "33940080";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 14, immediate(offset): 0080}", instruction.toString());
        Assert.assertEquals("33940080", instruction.toHex());
    }

    @Test
    public void test830() {
        String str = "2449005e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 02, rt: 09, immediate(offset): 005e}", instruction.toString());
        Assert.assertEquals("2449005e", instruction.toHex());
    }

    @Test
    public void test831() {
        String str = "034b6024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1a, rt: 0b, rd: 0c, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("034b6024", instruction.toHex());
    }

    @Test
    public void test832() {
        String str = "02f55822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 17, rt: 15, rd: 0b, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02f55822", instruction.toHex());
    }

    @Test
    public void test833() {
        String str = "001cf820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 00, rt: 1c, rd: 1f, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("001cf820", instruction.toHex());
    }

    @Test
    public void test834() {
        String str = "024a6024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 12, rt: 0a, rd: 0c, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("024a6024", instruction.toHex());
    }

    @Test
    public void test835() {
        String str = "14d8ffa2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 06, rt: 18, immediate(offset): ffa2}", instruction.toString());
        Assert.assertEquals("14d8ffa2", instruction.toHex());
    }

    @Test
    public void test836() {
        String str = "11b1ff05";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 0d, rt: 11, immediate(offset): ff05}", instruction.toString());
        Assert.assertEquals("11b1ff05", instruction.toHex());
    }

    @Test
    public void test837() {
        String str = "34f70034";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 07, rt: 17, immediate(offset): 0034}", instruction.toString());
        Assert.assertEquals("34f70034", instruction.toHex());
    }

    @Test
    public void test838() {
        String str = "360c0042";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 10, rt: 0c, immediate(offset): 0042}", instruction.toString());
        Assert.assertEquals("360c0042", instruction.toHex());
    }

    @Test
    public void test839() {
        String str = "01c31022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0e, rt: 03, rd: 02, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01c31022", instruction.toHex());
    }

    @Test
    public void test840() {
        String str = "31a9ffa9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 09, immediate(offset): ffa9}", instruction.toString());
        Assert.assertEquals("31a9ffa9", instruction.toHex());
    }

    @Test
    public void test841() {
        String str = "151e0006";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 08, rt: 1e, immediate(offset): 0006}", instruction.toString());
        Assert.assertEquals("151e0006", instruction.toHex());
    }

    @Test
    public void test842() {
        String str = "afc3ffeb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1e, rt: 03, immediate(offset): ffeb}", instruction.toString());
        Assert.assertEquals("afc3ffeb", instruction.toHex());
    }

    @Test
    public void test843() {
        String str = "080000a4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000a4}", instruction.toString());
        Assert.assertEquals("080000a4", instruction.toHex());
    }

    @Test
    public void test844() {
        String str = "33310091";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 19, rt: 11, immediate(offset): 0091}", instruction.toString());
        Assert.assertEquals("33310091", instruction.toHex());
    }

    @Test
    public void test845() {
        String str = "02c16824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 16, rt: 01, rd: 0d, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02c16824", instruction.toHex());
    }

    @Test
    public void test846() {
        String str = "ac930000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 04, rt: 13, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ac930000", instruction.toHex());
    }

    @Test
    public void test847() {
        String str = "01d3e825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 0e, rt: 13, rd: 1d, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("01d3e825", instruction.toHex());
    }

    @Test
    public void test848() {
        String str = "080000b5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000b5}", instruction.toString());
        Assert.assertEquals("080000b5", instruction.toHex());
    }

    @Test
    public void test849() {
        String str = "8ffe003e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1f, rt: 1e, immediate(offset): 003e}", instruction.toString());
        Assert.assertEquals("8ffe003e", instruction.toHex());
    }

    @Test
    public void test850() {
        String str = "3c09006b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 09, immediate(offset): 006b}", instruction.toString());
        Assert.assertEquals("3c09006b", instruction.toHex());
    }

    @Test
    public void test851() {
        String str = "15c1ffa2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 0e, rt: 01, immediate(offset): ffa2}", instruction.toString());
        Assert.assertEquals("15c1ffa2", instruction.toHex());
    }

    @Test
    public void test852() {
        String str = "039d482a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1c, rt: 1d, rd: 09, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("039d482a", instruction.toHex());
    }

    @Test
    public void test853() {
        String str = "15dcff3a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 0e, rt: 1c, immediate(offset): ff3a}", instruction.toString());
        Assert.assertEquals("15dcff3a", instruction.toHex());
    }

    @Test
    public void test854() {
        String str = "0078b024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 03, rt: 18, rd: 16, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0078b024", instruction.toHex());
    }

    @Test
    public void test855() {
        String str = "010a8820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 08, rt: 0a, rd: 11, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("010a8820", instruction.toHex());
    }

    @Test
    public void test856() {
        String str = "8f860000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1c, rt: 06, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8f860000", instruction.toHex());
    }

    @Test
    public void test857() {
        String str = "0082582a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 04, rt: 02, rd: 0b, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0082582a", instruction.toHex());
    }

    @Test
    public void test858() {
        String str = "0800008a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000008a}", instruction.toString());
        Assert.assertEquals("0800008a", instruction.toHex());
    }

    @Test
    public void test859() {
        String str = "3c05008a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 05, immediate(offset): 008a}", instruction.toString());
        Assert.assertEquals("3c05008a", instruction.toHex());
    }

    @Test
    public void test860() {
        String str = "adb4ffe0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0d, rt: 14, immediate(offset): ffe0}", instruction.toString());
        Assert.assertEquals("adb4ffe0", instruction.toHex());
    }

    @Test
    public void test861() {
        String str = "266a0025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 13, rt: 0a, immediate(offset): 0025}", instruction.toString());
        Assert.assertEquals("266a0025", instruction.toHex());
    }

    @Test
    public void test862() {
        String str = "3740ff13";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 00, immediate(offset): ff13}", instruction.toString());
        Assert.assertEquals("3740ff13", instruction.toHex());
    }

    @Test
    public void test863() {
        String str = "0217b82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 10, rt: 17, rd: 17, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0217b82a", instruction.toHex());
    }

    @Test
    public void test864() {
        String str = "3c0f002b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0f, immediate(offset): 002b}", instruction.toString());
        Assert.assertEquals("3c0f002b", instruction.toHex());
    }

    @Test
    public void test865() {
        String str = "8ebd00ac";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 15, rt: 1d, immediate(offset): 00ac}", instruction.toString());
        Assert.assertEquals("8ebd00ac", instruction.toHex());
    }

    @Test
    public void test866() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test867() {
        String str = "02628820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 13, rt: 02, rd: 11, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("02628820", instruction.toHex());
    }

    @Test
    public void test868() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test869() {
        String str = "8d550000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0a, rt: 15, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d550000", instruction.toHex());
    }

    @Test
    public void test870() {
        String str = "126dffc2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 13, rt: 0d, immediate(offset): ffc2}", instruction.toString());
        Assert.assertEquals("126dffc2", instruction.toHex());
    }

    @Test
    public void test871() {
        String str = "00b6f025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 05, rt: 16, rd: 1e, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00b6f025", instruction.toHex());
    }

    @Test
    public void test872() {
        String str = "35ca0027";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0e, rt: 0a, immediate(offset): 0027}", instruction.toString());
        Assert.assertEquals("35ca0027", instruction.toHex());
    }

    @Test
    public void test873() {
        String str = "35aeffa8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 0d, rt: 0e, immediate(offset): ffa8}", instruction.toString());
        Assert.assertEquals("35aeffa8", instruction.toHex());
    }

    @Test
    public void test874() {
        String str = "af2bff38";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 19, rt: 0b, immediate(offset): ff38}", instruction.toString());
        Assert.assertEquals("af2bff38", instruction.toHex());
    }

    @Test
    public void test875() {
        String str = "addeffd2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0e, rt: 1e, immediate(offset): ffd2}", instruction.toString());
        Assert.assertEquals("addeffd2", instruction.toHex());
    }

    @Test
    public void test876() {
        String str = "0015382a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 00, rt: 15, rd: 07, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0015382a", instruction.toHex());
    }

    @Test
    public void test877() {
        String str = "8f5a0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1a, rt: 1a, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8f5a0000", instruction.toHex());
    }

    @Test
    public void test878() {
        String str = "0077e024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 03, rt: 17, rd: 1c, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("0077e024", instruction.toHex());
    }

    @Test
    public void test879() {
        String str = "080000a9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000a9}", instruction.toString());
        Assert.assertEquals("080000a9", instruction.toHex());
    }

    @Test
    public void test880() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test881() {
        String str = "00ddf025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 06, rt: 1d, rd: 1e, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("00ddf025", instruction.toHex());
    }

    @Test
    public void test882() {
        String str = "02b42022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 15, rt: 14, rd: 04, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02b42022", instruction.toHex());
    }

    @Test
    public void test883() {
        String str = "12fdffcf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 17, rt: 1d, immediate(offset): ffcf}", instruction.toString());
        Assert.assertEquals("12fdffcf", instruction.toHex());
    }

    @Test
    public void test884() {
        String str = "02bd7822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 15, rt: 1d, rd: 0f, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02bd7822", instruction.toHex());
    }

    @Test
    public void test885() {
        String str = "3c0a00ed";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0a, immediate(offset): 00ed}", instruction.toString());
        Assert.assertEquals("3c0a00ed", instruction.toHex());
    }

    @Test
    public void test886() {
        String str = "8d7f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0b, rt: 1f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8d7f0000", instruction.toHex());
    }

    @Test
    public void test887() {
        String str = "03df182a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1e, rt: 1f, rd: 03, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("03df182a", instruction.toHex());
    }

    @Test
    public void test888() {
        String str = "34a7009b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 05, rt: 07, immediate(offset): 009b}", instruction.toString());
        Assert.assertEquals("34a7009b", instruction.toHex());
    }

    @Test
    public void test889() {
        String str = "368900c7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 14, rt: 09, immediate(offset): 00c7}", instruction.toString());
        Assert.assertEquals("368900c7", instruction.toHex());
    }

    @Test
    public void test890() {
        String str = "33d20023";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1e, rt: 12, immediate(offset): 0023}", instruction.toString());
        Assert.assertEquals("33d20023", instruction.toHex());
    }

    @Test
    public void test891() {
        String str = "0232c82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 11, rt: 12, rd: 19, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0232c82a", instruction.toHex());
    }

    @Test
    public void test892() {
        String str = "aff4ff4e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 1f, rt: 14, immediate(offset): ff4e}", instruction.toString());
        Assert.assertEquals("aff4ff4e", instruction.toHex());
    }

    @Test
    public void test893() {
        String str = "0121f022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 09, rt: 01, rd: 1e, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0121f022", instruction.toHex());
    }

    @Test
    public void test894() {
        String str = "01bf2022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0d, rt: 1f, rd: 04, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01bf2022", instruction.toHex());
    }

    @Test
    public void test895() {
        String str = "031ae020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 18, rt: 1a, rd: 1c, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("031ae020", instruction.toHex());
    }

    @Test
    public void test896() {
        String str = "00a0a024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 05, rt: 00, rd: 14, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00a0a024", instruction.toHex());
    }

    @Test
    public void test897() {
        String str = "3c0d00bd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0d, immediate(offset): 00bd}", instruction.toString());
        Assert.assertEquals("3c0d00bd", instruction.toHex());
    }

    @Test
    public void test898() {
        String str = "3c1700a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 17, immediate(offset): 00a1}", instruction.toString());
        Assert.assertEquals("3c1700a1", instruction.toHex());
    }

    @Test
    public void test899() {
        String str = "374b0033";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 1a, rt: 0b, immediate(offset): 0033}", instruction.toString());
        Assert.assertEquals("374b0033", instruction.toHex());
    }

    @Test
    public void test900() {
        String str = "8e4cffd4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 12, rt: 0c, immediate(offset): ffd4}", instruction.toString());
        Assert.assertEquals("8e4cffd4", instruction.toHex());
    }

    @Test
    public void test901() {
        String str = "3c0400c5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 04, immediate(offset): 00c5}", instruction.toString());
        Assert.assertEquals("3c0400c5", instruction.toHex());
    }

    @Test
    public void test902() {
        String str = "03a67822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 1d, rt: 06, rd: 0f, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("03a67822", instruction.toHex());
    }

    @Test
    public void test903() {
        String str = "3266ff37";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 13, rt: 06, immediate(offset): ff37}", instruction.toString());
        Assert.assertEquals("3266ff37", instruction.toHex());
    }

    @Test
    public void test904() {
        String str = "3c09003c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 09, immediate(offset): 003c}", instruction.toString());
        Assert.assertEquals("3c09003c", instruction.toHex());
    }

    @Test
    public void test905() {
        String str = "01424025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 0a, rt: 02, rd: 08, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("01424025", instruction.toHex());
    }

    @Test
    public void test906() {
        String str = "33f80042";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1f, rt: 18, immediate(offset): 0042}", instruction.toString());
        Assert.assertEquals("33f80042", instruction.toHex());
    }

    @Test
    public void test907() {
        String str = "34150046";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 00, rt: 15, immediate(offset): 0046}", instruction.toString());
        Assert.assertEquals("34150046", instruction.toHex());
    }

    @Test
    public void test908() {
        String str = "110fff9c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 08, rt: 0f, immediate(offset): ff9c}", instruction.toString());
        Assert.assertEquals("110fff9c", instruction.toHex());
    }

    @Test
    public void test909() {
        String str = "8cba0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 05, rt: 1a, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8cba0000", instruction.toHex());
    }

    @Test
    public void test910() {
        String str = "ad010000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 08, rt: 01, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ad010000", instruction.toHex());
    }

    @Test
    public void test911() {
        String str = "1327ffd0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 19, rt: 07, immediate(offset): ffd0}", instruction.toString());
        Assert.assertEquals("1327ffd0", instruction.toHex());
    }

    @Test
    public void test912() {
        String str = "029bf824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 14, rt: 1b, rd: 1f, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("029bf824", instruction.toHex());
    }

    @Test
    public void test913() {
        String str = "08000050";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000050}", instruction.toString());
        Assert.assertEquals("08000050", instruction.toHex());
    }

    @Test
    public void test914() {
        String str = "3c1c008a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1c, immediate(offset): 008a}", instruction.toString());
        Assert.assertEquals("3c1c008a", instruction.toHex());
    }

    @Test
    public void test915() {
        String str = "307bffba";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 03, rt: 1b, immediate(offset): ffba}", instruction.toString());
        Assert.assertEquals("307bffba", instruction.toHex());
    }

    @Test
    public void test916() {
        String str = "26500012";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 12, rt: 10, immediate(offset): 0012}", instruction.toString());
        Assert.assertEquals("26500012", instruction.toHex());
    }

    @Test
    public void test917() {
        String str = "0800004d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000004d}", instruction.toString());
        Assert.assertEquals("0800004d", instruction.toHex());
    }

    @Test
    public void test918() {
        String str = "02f83024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 17, rt: 18, rd: 06, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02f83024", instruction.toHex());
    }

    @Test
    public void test919() {
        String str = "8cda0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 06, rt: 1a, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8cda0000", instruction.toHex());
    }

    @Test
    public void test920() {
        String str = "03a57020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 1d, rt: 05, rd: 0e, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("03a57020", instruction.toHex());
    }

    @Test
    public void test921() {
        String str = "03c01025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1e, rt: 00, rd: 02, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03c01025", instruction.toHex());
    }

    @Test
    public void test922() {
        String str = "12e100ec";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 17, rt: 01, immediate(offset): 00ec}", instruction.toString());
        Assert.assertEquals("12e100ec", instruction.toHex());
    }

    @Test
    public void test923() {
        String str = "8d41ff43";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 0a, rt: 01, immediate(offset): ff43}", instruction.toString());
        Assert.assertEquals("8d41ff43", instruction.toHex());
    }

    @Test
    public void test924() {
        String str = "03674824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1b, rt: 07, rd: 09, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03674824", instruction.toHex());
    }

    @Test
    public void test925() {
        String str = "256500e4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0b, rt: 05, immediate(offset): 00e4}", instruction.toString());
        Assert.assertEquals("256500e4", instruction.toHex());
    }

    @Test
    public void test926() {
        String str = "3192ff63";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0c, rt: 12, immediate(offset): ff63}", instruction.toString());
        Assert.assertEquals("3192ff63", instruction.toHex());
    }

    @Test
    public void test927() {
        String str = "1682ff18";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 14, rt: 02, immediate(offset): ff18}", instruction.toString());
        Assert.assertEquals("1682ff18", instruction.toHex());
    }

    @Test
    public void test928() {
        String str = "15bc0023";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 0d, rt: 1c, immediate(offset): 0023}", instruction.toString());
        Assert.assertEquals("15bc0023", instruction.toHex());
    }

    @Test
    public void test929() {
        String str = "03db0024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1e, rt: 1b, rd: 00, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03db0024", instruction.toHex());
    }

    @Test
    public void test930() {
        String str = "ae3f0011";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 11, rt: 1f, immediate(offset): 0011}", instruction.toString());
        Assert.assertEquals("ae3f0011", instruction.toHex());
    }

    @Test
    public void test931() {
        String str = "08000040";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000040}", instruction.toString());
        Assert.assertEquals("08000040", instruction.toHex());
    }

    @Test
    public void test932() {
        String str = "110cff63";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 08, rt: 0c, immediate(offset): ff63}", instruction.toString());
        Assert.assertEquals("110cff63", instruction.toHex());
    }

    @Test
    public void test933() {
        String str = "08000038";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000038}", instruction.toString());
        Assert.assertEquals("08000038", instruction.toHex());
    }

    @Test
    public void test934() {
        String str = "338a0070";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 0a, immediate(offset): 0070}", instruction.toString());
        Assert.assertEquals("338a0070", instruction.toHex());
    }

    @Test
    public void test935() {
        String str = "015be020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0a, rt: 1b, rd: 1c, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("015be020", instruction.toHex());
    }

    @Test
    public void test936() {
        String str = "3c0700a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 07, immediate(offset): 00a2}", instruction.toString());
        Assert.assertEquals("3c0700a2", instruction.toHex());
    }

    @Test
    public void test937() {
        String str = "03518024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1a, rt: 11, rd: 10, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03518024", instruction.toHex());
    }

    @Test
    public void test938() {
        String str = "00a2402a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 05, rt: 02, rd: 08, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("00a2402a", instruction.toHex());
    }

    @Test
    public void test939() {
        String str = "361f00a7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 10, rt: 1f, immediate(offset): 00a7}", instruction.toString());
        Assert.assertEquals("361f00a7", instruction.toHex());
    }

    @Test
    public void test940() {
        String str = "03cd882a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1e, rt: 0d, rd: 11, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("03cd882a", instruction.toHex());
    }

    @Test
    public void test941() {
        String str = "0255a822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 12, rt: 15, rd: 15, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("0255a822", instruction.toHex());
    }

    @Test
    public void test942() {
        String str = "3389ff81";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 1c, rt: 09, immediate(offset): ff81}", instruction.toString());
        Assert.assertEquals("3389ff81", instruction.toHex());
    }

    @Test
    public void test943() {
        String str = "107bffbc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq {opcode: 04, rs(base): 03, rt: 1b, immediate(offset): ffbc}", instruction.toString());
        Assert.assertEquals("107bffbc", instruction.toHex());
    }

    @Test
    public void test944() {
        String str = "3074ff4f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 03, rt: 14, immediate(offset): ff4f}", instruction.toString());
        Assert.assertEquals("3074ff4f", instruction.toHex());
    }

    @Test
    public void test945() {
        String str = "3c0e0073";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 0e, immediate(offset): 0073}", instruction.toString());
        Assert.assertEquals("3c0e0073", instruction.toHex());
    }

    @Test
    public void test946() {
        String str = "0800000d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000000d}", instruction.toString());
        Assert.assertEquals("0800000d", instruction.toHex());
    }

    @Test
    public void test947() {
        String str = "26290049";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 11, rt: 09, immediate(offset): 0049}", instruction.toString());
        Assert.assertEquals("26290049", instruction.toHex());
    }

    @Test
    public void test948() {
        String str = "02964024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 14, rt: 16, rd: 08, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02964024", instruction.toHex());
    }

    @Test
    public void test949() {
        String str = "8c110098";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 00, rt: 11, immediate(offset): 0098}", instruction.toString());
        Assert.assertEquals("8c110098", instruction.toHex());
    }

    @Test
    public void test950() {
        String str = "01201022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 09, rt: 00, rd: 02, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01201022", instruction.toHex());
    }

    @Test
    public void test951() {
        String str = "08000096";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 0000096}", instruction.toString());
        Assert.assertEquals("08000096", instruction.toHex());
    }

    @Test
    public void test952() {
        String str = "080000e5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000e5}", instruction.toString());
        Assert.assertEquals("080000e5", instruction.toHex());
    }

    @Test
    public void test953() {
        String str = "161300ad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 10, rt: 13, immediate(offset): 00ad}", instruction.toString());
        Assert.assertEquals("161300ad", instruction.toHex());
    }

    @Test
    public void test954() {
        String str = "333d00f3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 19, rt: 1d, immediate(offset): 00f3}", instruction.toString());
        Assert.assertEquals("333d00f3", instruction.toHex());
    }

    @Test
    public void test955() {
        String str = "31dd0048";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0e, rt: 1d, immediate(offset): 0048}", instruction.toString());
        Assert.assertEquals("31dd0048", instruction.toHex());
    }

    @Test
    public void test956() {
        String str = "17200024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 19, rt: 00, immediate(offset): 0024}", instruction.toString());
        Assert.assertEquals("17200024", instruction.toHex());
    }

    @Test
    public void test957() {
        String str = "0104282a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 08, rt: 04, rd: 05, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0104282a", instruction.toHex());
    }

    @Test
    public void test958() {
        String str = "af000000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 18, rt: 00, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("af000000", instruction.toHex());
    }

    @Test
    public void test959() {
        String str = "30f1ffc2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 07, rt: 11, immediate(offset): ffc2}", instruction.toString());
        Assert.assertEquals("30f1ffc2", instruction.toHex());
    }

    @Test
    public void test960() {
        String str = "03ca2825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1e, rt: 0a, rd: 05, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("03ca2825", instruction.toHex());
    }

    @Test
    public void test961() {
        String str = "1450ff3e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 02, rt: 10, immediate(offset): ff3e}", instruction.toString());
        Assert.assertEquals("1450ff3e", instruction.toHex());
    }

    @Test
    public void test962() {
        String str = "ad0a0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 08, rt: 0a, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("ad0a0000", instruction.toHex());
    }

    @Test
    public void test963() {
        String str = "0072d02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 03, rt: 12, rd: 1a, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0072d02a", instruction.toHex());
    }

    @Test
    public void test964() {
        String str = "038f0025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1c, rt: 0f, rd: 00, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("038f0025", instruction.toHex());
    }

    @Test
    public void test965() {
        String str = "025a5825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 12, rt: 1a, rd: 0b, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("025a5825", instruction.toHex());
    }

    @Test
    public void test966() {
        String str = "01d14822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 0e, rt: 11, rd: 09, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("01d14822", instruction.toHex());
    }

    @Test
    public void test967() {
        String str = "3467ffeb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori {opcode: 0d, rs(base): 03, rt: 07, immediate(offset): ffeb}", instruction.toString());
        Assert.assertEquals("3467ffeb", instruction.toHex());
    }

    @Test
    public void test968() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test969() {
        String str = "2547004d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0a, rt: 07, immediate(offset): 004d}", instruction.toString());
        Assert.assertEquals("2547004d", instruction.toHex());
    }

    @Test
    public void test970() {
        String str = "8fca0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1e, rt: 0a, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8fca0000", instruction.toHex());
    }

    @Test
    public void test971() {
        String str = "3c1e0082";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 1e, immediate(offset): 0082}", instruction.toString());
        Assert.assertEquals("3c1e0082", instruction.toHex());
    }

    @Test
    public void test972() {
        String str = "03329824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 19, rt: 12, rd: 13, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03329824", instruction.toHex());
    }

    @Test
    public void test973() {
        String str = "035ee825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or {opcode: 00, rs: 1a, rt: 1e, rd: 1d, shmt: 00, funct: 25}", instruction.toString());
        Assert.assertEquals("035ee825", instruction.toHex());
    }

    @Test
    public void test974() {
        String str = "3c1100f9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui {opcode: 0f, rs(base): 00, rt: 11, immediate(offset): 00f9}", instruction.toString());
        Assert.assertEquals("3c1100f9", instruction.toHex());
    }

    @Test
    public void test975() {
        String str = "25a300a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0d, rt: 03, immediate(offset): 00a1}", instruction.toString());
        Assert.assertEquals("25a300a1", instruction.toHex());
    }

    @Test
    public void test976() {
        String str = "16a5ff2f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne {opcode: 05, rs(base): 15, rt: 05, immediate(offset): ff2f}", instruction.toString());
        Assert.assertEquals("16a5ff2f", instruction.toHex());
    }

    @Test
    public void test977() {
        String str = "24b00071";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 05, rt: 10, immediate(offset): 0071}", instruction.toString());
        Assert.assertEquals("24b00071", instruction.toHex());
    }

    @Test
    public void test978() {
        String str = "080000bd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 00000bd}", instruction.toString());
        Assert.assertEquals("080000bd", instruction.toHex());
    }

    @Test
    public void test979() {
        String str = "01dcb020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0e, rt: 1c, rd: 16, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("01dcb020", instruction.toHex());
    }

    @Test
    public void test980() {
        String str = "02fd5024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 17, rt: 1d, rd: 0a, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("02fd5024", instruction.toHex());
    }

    @Test
    public void test981() {
        String str = "0800001a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j {opcode: 02, index: 000001a}", instruction.toString());
        Assert.assertEquals("0800001a", instruction.toHex());
    }

    @Test
    public void test982() {
        String str = "31ac007b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 0d, rt: 0c, immediate(offset): 007b}", instruction.toString());
        Assert.assertEquals("31ac007b", instruction.toHex());
    }

    @Test
    public void test983() {
        String str = "32feffed";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 17, rt: 1e, immediate(offset): ffed}", instruction.toString());
        Assert.assertEquals("32feffed", instruction.toHex());
    }

    @Test
    public void test984() {
        String str = "00491820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 02, rt: 09, rd: 03, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("00491820", instruction.toHex());
    }

    @Test
    public void test985() {
        String str = "32c9ff05";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 16, rt: 09, immediate(offset): ff05}", instruction.toString());
        Assert.assertEquals("32c9ff05", instruction.toHex());
    }

    @Test
    public void test986() {
        String str = "8fcf0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 1e, rt: 0f, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("8fcf0000", instruction.toHex());
    }

    @Test
    public void test987() {
        String str = "32a80039";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi {opcode: 0c, rs(base): 15, rt: 08, immediate(offset): 0039}", instruction.toString());
        Assert.assertEquals("32a80039", instruction.toHex());
    }

    @Test
    public void test988() {
        String str = "02723822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub {opcode: 00, rs: 13, rt: 12, rd: 07, shmt: 00, funct: 22}", instruction.toString());
        Assert.assertEquals("02723822", instruction.toHex());
    }

    @Test
    public void test989() {
        String str = "03d49824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 1e, rt: 14, rd: 13, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("03d49824", instruction.toHex());
    }

    @Test
    public void test990() {
        String str = "8e6e0020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw {opcode: 23, rs(base): 13, rt: 0e, immediate(offset): 0020}", instruction.toString());
        Assert.assertEquals("8e6e0020", instruction.toHex());
    }

    @Test
    public void test991() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test992() {
        String str = "25f20002";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu {opcode: 09, rs(base): 0f, rt: 12, immediate(offset): 0002}", instruction.toString());
        Assert.assertEquals("25f20002", instruction.toHex());
    }

    @Test
    public void test993() {
        String str = "0361302a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1b, rt: 01, rd: 06, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0361302a", instruction.toHex());
    }

    @Test
    public void test994() {
        String str = "0140c020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add {opcode: 00, rs: 0a, rt: 00, rd: 18, shmt: 00, funct: 20}", instruction.toString());
        Assert.assertEquals("0140c020", instruction.toHex());
    }

    @Test
    public void test995() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test996() {
        String str = "00fc7824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and {opcode: 00, rs: 07, rt: 1c, rd: 0f, shmt: 00, funct: 24}", instruction.toString());
        Assert.assertEquals("00fc7824", instruction.toHex());
    }

    @Test
    public void test997() {
        String str = "0394382a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt {opcode: 00, rs: 1c, rt: 14, rd: 07, shmt: 00, funct: 2a}", instruction.toString());
        Assert.assertEquals("0394382a", instruction.toHex());
    }

    @Test
    public void test998() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall {opcode: 00, code: 000000, funct: 0c}", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test999() {
        String str = "adfe0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw {opcode: 2b, rs(base): 0f, rt: 1e, immediate(offset): 0000}", instruction.toString());
        Assert.assertEquals("adfe0000", instruction.toHex());
    }
}
