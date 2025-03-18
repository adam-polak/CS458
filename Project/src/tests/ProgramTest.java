package tests;

import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;
import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {
    @Test
    public void test0() {
        String str = "sub $t5, $s1, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02326822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test1() {
        String str = "andi $s5, $t7, -79";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("31f5ffb1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test2() {
        String str = "andi $sp, $k1, 0x4e# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("337d004e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test3() {
        String str = "bne $s0, $k1, 0x79";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("161b0079", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test4() {
        String str = "beq $k0, $t7, 0xa3# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("134f00a3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test5() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test6() {
        String str = "or $v0, $s6, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02d81025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test7() {
        String str = "addiu $s0, $s3, 167";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("267000a7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test8() {
        String str = "sw $t6, 114($s7)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("aeee0072", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test9() {
        String str = "andi $t1, $s4, -62";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3289ffc2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test10() {
        String str = "slt $t3, $k1, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0363582a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test11() {
        String str = "lui $v0, 0xda";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0200da", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test12() {
        String str = "lui $a0, 0xd7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0400d7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test13() {
        String str = "andi $at, $fp, 0x90";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("33c10090", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test14() {
        String str = "bne $s0, $fp, -250";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("161eff06", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test15() {
        String str = "beq $t8, $a2, -124";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1306ff84", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test16() {
        String str = "addiu $s6, $s7, 99";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26f60063", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test17() {
        String str = "slt $zero, $t4, $t4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("018c002a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test18() {
        String str = "sw $s2, -211($a1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("acb2ff2d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test19() {
        String str = "lw $k0, -94($s1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8e3affa2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test20() {
        String str = "or $zero, $t3, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01680025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test21() {
        String str = "bne $s6, $v1, 0xfff0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16c3fff0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test22() {
        String str = "or $a3, $k0, $s3# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03533825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test23() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test24() {
        String str = "bne $t8, $s0, 233# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("171000e9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test25() {
        String str = "j 0x74";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000074", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test26() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test27() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test28() {
        String str = "or $s5, $k0, $s4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0354a825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test29() {
        String str = "andi $s1, $a3, -27";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("30f1ffe5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test30() {
        String str = "or $t4, $ra, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03fd6025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test31() {
        String str = "j 0x48";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000048", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test32() {
        String str = "addiu $ra, $s7, 0xfc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26ff00fc", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test33() {
        String str = "lw $gp, 112($s4)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8e9c0070", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test34() {
        String str = "ori $s0, $s7, 131";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36f00083", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test35() {
        String str = "slt $zero, $at, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("002e002a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test36() {
        String str = "add $a1, $t8, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03192820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test37() {
        String str = "or $s5, $k1, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("036fa825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test38() {
        String str = "ori $s0, $s0, 0x99";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36100099", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test39() {
        String str = "j 0x8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000008", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test40() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test41() {
        String str = "add $a3, $s4, $t4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("028c3820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test42() {
        String str = "slt $gp, $a2, $t0# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00c8e02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test43() {
        String str = "add $v0, $t5, $a0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01a41020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test44() {
        String str = "addiu $t0, $v1, 0x9b# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("2468009b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test45() {
        String str = "beq $v1, $v1, 0xffdd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1063ffdd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test46() {
        String str = "lui $t3, 0xdb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0b00db", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test47() {
        String str = "ori $a3, $s6, 0xa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36c7000a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test48() {
        String str = "lw $a0, -182($s5)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8ea4ff4a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test49() {
        String str = "sub $s3, $s6, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02d89822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test50() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test51() {
        String str = "and $t7, $t1, $a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01257824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test52() {
        String str = "slt $zero, $t4, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("019e002a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test53() {
        String str = "and $s3, $t6, $a2# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01c69824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test54() {
        String str = "lui $a0, 0x7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c040007", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test55() {
        String str = "lui $t6, 0x6b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0e006b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test56() {
        String str = "lui $a1, 0xe0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0500e0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test57() {
        String str = "sub $s6, $t4, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("018fb022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test58() {
        String str = "addiu $t9, $s6, 0xe3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26d900e3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test59() {
        String str = "lui $k0, 0x4f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1a004f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test60() {
        String str = "j 0x99";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000099", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test61() {
        String str = "j 0xd2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000d2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test62() {
        String str = "or $t7, $v1, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("007c7825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test63() {
        String str = "j 0x29# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000029", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test64() {
        String str = "j 0x66";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000066", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test65() {
        String str = "lw $sp, ($t7)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8dfd0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test66() {
        String str = "j 0x52";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000052", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test67() {
        String str = "j 0x67";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000067", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test68() {
        String str = "lui $t5, 0x1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0d0001", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test69() {
        String str = "and $s7, $t5, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01bab824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test70() {
        String str = "or $t2, $s6, $a0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02c45025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test71() {
        String str = "lw $k1, -234($v1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c7bff16", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test72() {
        String str = "ori $t5, $v0, -119";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("344dff89", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test73() {
        String str = "sw $s3, 26($k1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af73001a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test74() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test75() {
        String str = "j 0x77";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000077", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test76() {
        String str = "addiu $s0, $a3, 5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24f00005", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test77() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test78() {
        String str = "or $t9, $s4, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0299c825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test79() {
        String str = "lw $a3, -82($t8)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8f07ffae", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test80() {
        String str = "lui $a3, 0xba";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0700ba", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test81() {
        String str = "add $sp, $zero, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("001ae820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test82() {
        String str = "sw $t5, 181($t1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad2d00b5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test83() {
        String str = "ori $a2, $t8, -152";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3706ff68", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test84() {
        String str = "andi $s1, $t1, 0xdd# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("313100dd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test85() {
        String str = "addiu $v0, $s2, 0x4b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("2642004b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test86() {
        String str = "ori $fp, $a3, 155";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("34fe009b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test87() {
        String str = "sw $t9, 67($a1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("acb90043", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test88() {
        String str = "bne $t8, $k1, 0x6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("171b0006", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test89() {
        String str = "bne $sp, $t6, -27";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("17aeffe5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test90() {
        String str = "lw $t0, ($t3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8d680000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test91() {
        String str = "and $t0, $k0, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03564024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test92() {
        String str = "addiu $ra, $t2, 13";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("255f000d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test93() {
        String str = "bne $v0, $s7, 151";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("14570097", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test94() {
        String str = "j 0x1f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800001f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test95() {
        String str = "andi $t5, $at, 0x7d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("302d007d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test96() {
        String str = "and $a3, $t9, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("032d3824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test97() {
        String str = "or $a1, $t0, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01022825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test98() {
        String str = "add $s1, $s0, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02108820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test99() {
        String str = "addiu $a1, $s1, 174";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("262500ae", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test100() {
        String str = "andi $t0, $s5, 151";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32a80097", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test101() {
        String str = "beq $t8, $a3, 0xf2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("130700f2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test102() {
        String str = "ori $gp, $s4, 0xff08";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("369cff08", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test103() {
        String str = "j 0x21";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000021", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test104() {
        String str = "or $t4, $t3, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01636025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test105() {
        String str = "lw $fp, ($t2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8d5e0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test106() {
        String str = "add $t5, $s1, $s1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02316820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test107() {
        String str = "beq $v0, $s2, 0xff95";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1052ff95", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test108() {
        String str = "bne $k0, $ra, -7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("175ffff9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test109() {
        String str = "j 0x75";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000075", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test110() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test111() {
        String str = "slt $s5, $s4, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("028da82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test112() {
        String str = "add $sp, $t1, $a0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0124e820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test113() {
        String str = "sw $a2, -192($k0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af46ff40", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test114() {
        String str = "sub $t1, $t6, $t4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01cc4822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test115() {
        String str = "andi $s5, $v0, 0xff78";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3055ff78", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test116() {
        String str = "ori $s0, $k1, 0xffb6# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3770ffb6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test117() {
        String str = "or $t5, $t0, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01106825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test118() {
        String str = "add $ra, $t0, $t2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("010af820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test119() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test120() {
        String str = "beq $t3, $t3, 0x1c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("116b001c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test121() {
        String str = "add $t1, $s7, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02ee4820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test122() {
        String str = "sw $v1, 51($k1)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af630033", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test123() {
        String str = "bne $k0, $a2, 14";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1746000e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test124() {
        String str = "beq $at, $s0, 0xffaf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1030ffaf", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test125() {
        String str = "ori $t2, $t7, 159";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("35ea009f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test126() {
        String str = "andi $s4, $at, 60";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3034003c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test127() {
        String str = "and $t3, $at, $s1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00315824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test128() {
        String str = "andi $at, $t8, 0xffc1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3301ffc1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test129() {
        String str = "or $s3, $t6, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01dd9825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test130() {
        String str = "beq $t3, $fp, 22";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("117e0016", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test131() {
        String str = "sub $k0, $v1, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("007ed022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test132() {
        String str = "j 0xc4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000c4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test133() {
        String str = "bne $a0, $k0, 0x93";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("149a0093", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test134() {
        String str = "j 0x28";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000028", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test135() {
        String str = "or $t4, $s2, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02566025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test136() {
        String str = "and $s1, $v0, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("005c8824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test137() {
        String str = "andi $t1, $s0, 78";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3209004e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test138() {
        String str = "andi $s7, $s3, -42";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3277ffd6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test139() {
        String str = "or $ra, $ra, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03faf825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test140() {
        String str = "addiu $k1, $s2, 190# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("265b00be", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test141() {
        String str = "sub $a3, $t4, $gp# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("019c3822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test142() {
        String str = "sub $s1, $s7, $t2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02ea8822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test143() {
        String str = "or $zero, $t4, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("019e0025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test144() {
        String str = "andi $s0, $v0, 101";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("30500065", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test145() {
        String str = "bne $t0, $t6, 0x39";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("150e0039", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test146() {
        String str = "or $s6, $t8, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0310b025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test147() {
        String str = "and $a2, $a3, $s7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00f73024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test148() {
        String str = "slt $a3, $t4, $ra";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("019f382a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test149() {
        String str = "sw $at, -144($t0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad01ff70", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test150() {
        String str = "lui $s6, 0x30";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c160030", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test151() {
        String str = "lw $s1, -121($v0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c51ff87", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test152() {
        String str = "addiu $s3, $s5, 154";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26b3009a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test153() {
        String str = "addiu $s2, $s6, 0xfd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26d200fd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test154() {
        String str = "bne $t2, $v0, 0xff77";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1542ff77", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test155() {
        String str = "lui $t4, 0xe";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0c000e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test156() {
        String str = "and $a2, $s5, $v1# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02a33024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test157() {
        String str = "addiu $gp, $gp, 0xf0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("279c00f0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test158() {
        String str = "bne $a0, $a1, 11# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1485000b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test159() {
        String str = "bne $s0, $t5, 0x24";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("160d0024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test160() {
        String str = "slt $t5, $zero, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0015682a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test161() {
        String str = "lw $s0, 173($at)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c3000ad", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test162() {
        String str = "add $a2, $s7, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02e13020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test163() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test164() {
        String str = "add $s3, $k0, $t2# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("034a9820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test165() {
        String str = "lw $t2, ($sp)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8faa0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test166() {
        String str = "add $t5, $t4, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01936820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test167() {
        String str = "ori $t6, $v1, 0xffa8# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("346effa8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test168() {
        String str = "bne $s3, $t1, 0xffe7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1669ffe7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test169() {
        String str = "or $sp, $a1, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00ade825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test170() {
        String str = "j 0xa8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000a8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test171() {
        String str = "bne $zero, $s5, 0x3c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1415003c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test172() {
        String str = "j 0xd# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800000d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test173() {
        String str = "ori $s0, $zero, -23";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3410ffe9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test174() {
        String str = "or $v0, $t5, $s4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01b41025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test175() {
        String str = "j 0x8a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800008a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test176() {
        String str = "lui $s6, 0x20";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c160020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test177() {
        String str = "j 0xbf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000bf", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test178() {
        String str = "bne $ra, $t9, 0xff24";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("17f9ff24", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test179() {
        String str = "sw $t5, -190($s3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae6dff42", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test180() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test181() {
        String str = "j 0xd8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000d8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test182() {
        String str = "slt $sp, $a2, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00dde82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test183() {
        String str = "bne $v0, $at, 0x5b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1441005b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test184() {
        String str = "andi $t5, $sp, 0x46";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("33ad0046", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test185() {
        String str = "and $sp, $t1, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0133e824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test186() {
        String str = "addiu $t8, $t6, 0xee";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("25d800ee", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test187() {
        String str = "add $v0, $t0, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01101020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test188() {
        String str = "slt $t8, $t2, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("014dc02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test189() {
        String str = "lw $fp, ($v0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c5e0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test190() {
        String str = "beq $t4, $ra, 0xff21";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("119fff21", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test191() {
        String str = "addiu $t9, $s4, 152# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26990098", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test192() {
        String str = "or $s0, $a1, $a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00a58025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test193() {
        String str = "beq $t8, $fp, 87";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("131e0057", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test194() {
        String str = "andi $a1, $s4, 0x37";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32850037", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test195() {
        String str = "lui $t5, 0xf0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0d00f0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test196() {
        String str = "sub $a1, $t7, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01e62822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test197() {
        String str = "slt $s6, $s7, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02edb02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test198() {
        String str = "or $a0, $gp, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("039a2025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test199() {
        String str = "j 0xe7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000e7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test200() {
        String str = "or $ra, $v1, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0075f825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test201() {
        String str = "and $a2, $t9, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03363024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test202() {
        String str = "and $a0, $t7, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01ef2024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test203() {
        String str = "and $ra, $t9, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0323f824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test204() {
        String str = "andi $s0, $fp, 243";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("33d000f3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test205() {
        String str = "sw $t8, -232($v0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac58ff18", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test206() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test207() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test208() {
        String str = "beq $s7, $t3, 50";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("12eb0032", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test209() {
        String str = "slt $t4, $a3, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00e6602a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test210() {
        String str = "or $s4, $s3, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0273a025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test211() {
        String str = "addiu $at, $s0, 254";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("260100fe", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test212() {
        String str = "addiu $t6, $s7, 123";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26ee007b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test213() {
        String str = "and $v0, $v1, $a0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00641024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test214() {
        String str = "j 0xa6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000a6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test215() {
        String str = "add $fp, $t0, $s1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0111f020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test216() {
        String str = "addiu $t9, $s5, 0xbb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26b900bb", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test217() {
        String str = "beq $s5, $k0, 0x81";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("12ba0081", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test218() {
        String str = "add $t2, $sp, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03ba5020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test219() {
        String str = "add $v1, $gp, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03991820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test220() {
        String str = "beq $t4, $sp, 90";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("119d005a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test221() {
        String str = "j 0xe7# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000e7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test222() {
        String str = "sw $s4, ($s2)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae540000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test223() {
        String str = "add $t5, $t7, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01f86820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test224() {
        String str = "addiu $at, $s3, 180";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("266100b4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test225() {
        String str = "lui $t7, 0x18";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0f0018", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test226() {
        String str = "lui $s1, 0x96";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c110096", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test227() {
        String str = "addiu $s4, $s7, 0x99# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26f40099", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test228() {
        String str = "bne $s0, $s4, 0xff35";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1614ff35", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test229() {
        String str = "beq $v0, $k0, 215";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("105a00d7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test230() {
        String str = "beq $k0, $t7, 56";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("134f0038", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test231() {
        String str = "sub $s6, $a1, $s6# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00b6b022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test232() {
        String str = "slt $s5, $t9, $t4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("032ca82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test233() {
        String str = "add $s1, $s6, $a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02c58820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test234() {
        String str = "sub $ra, $t3, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0168f822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test235() {
        String str = "lui $sp, 0xbd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1d00bd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test236() {
        String str = "and $v0, $a2, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00c11024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test237() {
        String str = "sw $k0, ($t0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad1a0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test238() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test239() {
        String str = "sub $s0, $a1, $s5# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00b58022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test240() {
        String str = "bne $t8, $fp, 0xa6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("171e00a6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test241() {
        String str = "bne $t7, $t9, 85# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15f90055", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test242() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test243() {
        String str = "lw $s5, -232($ra)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8ff5ff18", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test244() {
        String str = "beq $s4, $s1, 186";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("129100ba", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test245() {
        String str = "ori $a2, $t0, -85";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3506ffab", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test246() {
        String str = "or $t4, $zero, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00186025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test247() {
        String str = "beq $gp, $a0, 0xe9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("138400e9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test248() {
        String str = "j 0xd3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000d3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test249() {
        String str = "lw $t9, 224($s4)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8e9900e0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test250() {
        String str = "slt $t5, $s3, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0278682a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test251() {
        String str = "andi $v1, $t1, 0x97";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("31230097", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test252() {
        String str = "beq $a2, $s3, 190";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("10d300be", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test253() {
        String str = "lw $s7, ($a1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8cb70000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test254() {
        String str = "bne $s3, $sp, -204";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("167dff34", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test255() {
        String str = "lui $t7, 0x22";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0f0022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test256() {
        String str = "add $t5, $k1, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03706820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test257() {
        String str = "addiu $s6, $sp, 147";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("27b60093", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test258() {
        String str = "j 0x8c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800008c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test259() {
        String str = "sw $t2, ($sp)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("afaa0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test260() {
        String str = "and $v0, $s0, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("020e1024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test261() {
        String str = "addiu $t3, $sp, 42";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("27ab002a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test262() {
        String str = "lw $t5, ($s5)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8ead0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test263() {
        String str = "sw $k0, ($t0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad1a0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test264() {
        String str = "bne $t4, $t7, 0xff2c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("158fff2c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test265() {
        String str = "bne $s6, $k0, 189";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16da00bd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test266() {
        String str = "lui $s6, 0x21# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c160021", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test267() {
        String str = "ori $a1, $k0, 173";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("374500ad", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test268() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test269() {
        String str = "j 0x23";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000023", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test270() {
        String str = "add $s7, $t6, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01c1b820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test271() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test272() {
        String str = "lui $a3, 0x5e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c07005e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test273() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test274() {
        String str = "bne $sp, $s4, 213# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("17b400d5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test275() {
        String str = "lui $t5, 0x82";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0d0082", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test276() {
        String str = "addiu $s2, $a0, 234# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("249200ea", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test277() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test278() {
        String str = "sub $gp, $t4, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0195e022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test279() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test280() {
        String str = "lw $v1, -90($k0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8f43ffa6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test281() {
        String str = "and $sp, $t6, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01dde824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test282() {
        String str = "lui $k0, 0x3c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1a003c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test283() {
        String str = "or $s4, $v1, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0061a025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test284() {
        String str = "sw $a2, ($s0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae060000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test285() {
        String str = "addiu $s7, $sp, 0xd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("27b7000d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test286() {
        String str = "ori $t1, $s5, 0xad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36a900ad", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test287() {
        String str = "bne $t3, $a3, -92";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1567ffa4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test288() {
        String str = "sub $k0, $t3, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0172d022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test289() {
        String str = "addiu $t3, $t1, 61";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("252b003d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test290() {
        String str = "lui $t3, 0x4c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0b004c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test291() {
        String str = "lui $t1, 0x18";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c090018", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test292() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test293() {
        String str = "ori $s5, $s5, 0x2b# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36b5002b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test294() {
        String str = "or $s5, $sp, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03b9a825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test295() {
        String str = "sw $fp, -205($v0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac5eff33", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test296() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test297() {
        String str = "add $t2, $v0, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00415020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test298() {
        String str = "bne $t2, $k0, 0x54";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("155a0054", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test299() {
        String str = "and $v1, $ra, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03e71824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test300() {
        String str = "sw $a0, -164($k1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af64ff5c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test301() {
        String str = "bne $a0, $gp, -124";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("149cff84", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test302() {
        String str = "bne $s5, $v1, -70";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16a3ffba", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test303() {
        String str = "addiu $a2, $a0, 226# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("248600e2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test304() {
        String str = "lui $s6, 0x97";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c160097", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test305() {
        String str = "and $at, $t1, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01350824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test306() {
        String str = "addiu $s6, $a2, 0x80";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24d60080", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test307() {
        String str = "slt $v1, $t0, $zero";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0100182a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test308() {
        String str = "j 0x53# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000053", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test309() {
        String str = "or $s6, $ra, $s4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03f4b025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test310() {
        String str = "beq $t1, $t5, -185";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("112dff47", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test311() {
        String str = "beq $s0, $t5, -155# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("120dff65", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test312() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test313() {
        String str = "addiu $gp, $a1, 0x68";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24bc0068", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test314() {
        String str = "slt $s4, $t1, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0139a02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test315() {
        String str = "bne $a3, $t0, 51";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("14e80033", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test316() {
        String str = "j 0x9c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800009c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test317() {
        String str = "or $s3, $t6, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01d59825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test318() {
        String str = "and $at, $t8, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("031e0824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test319() {
        String str = "andi $ra, $sp, -61";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("33bfffc3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test320() {
        String str = "addiu $t4, $t8, 0x7d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("270c007d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test321() {
        String str = "lui $a1, 0xab";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0500ab", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test322() {
        String str = "sub $t5, $t6, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01da6822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test323() {
        String str = "or $a3, $s5, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02be3825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test324() {
        String str = "beq $a1, $s7, 0xffc2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("10b7ffc2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test325() {
        String str = "or $sp, $t4, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("019de825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test326() {
        String str = "j 0x99";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000099", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test327() {
        String str = "addiu $sp, $k0, 0x70";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("275d0070", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test328() {
        String str = "andi $t6, $t6, 139";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("31ce008b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test329() {
        String str = "or $k0, $t5, $t4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01acd025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test330() {
        String str = "or $a0, $s1, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("023e2025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test331() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test332() {
        String str = "add $t3, $t0, $s3# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01135820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test333() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test334() {
        String str = "addiu $s6, $fp, 0x14";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("27d60014", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test335() {
        String str = "add $t5, $k1, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03666820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test336() {
        String str = "bne $gp, $a0, -114# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1784ff8e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test337() {
        String str = "sub $t2, $k1, $k1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("037b5022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test338() {
        String str = "j 0x19";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000019", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test339() {
        String str = "andi $s5, $s1, 0x31";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32350031", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test340() {
        String str = "sub $s6, $a2, $a2# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00c6b022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test341() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test342() {
        String str = "ori $t3, $t6, -183";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("35cbff49", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test343() {
        String str = "lui $t2, 0xe3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0a00e3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test344() {
        String str = "sub $s0, $s2, $t4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("024c8022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test345() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test346() {
        String str = "or $t6, $t9, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03277025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test347() {
        String str = "sub $s4, $k0, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0353a022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test348() {
        String str = "lui $s6, 0x1b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c16001b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test349() {
        String str = "ori $fp, $sp, -62";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("37beffc2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test350() {
        String str = "addiu $t5, $t9, 0x3d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("272d003d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test351() {
        String str = "slt $zero, $t1, $s1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0131002a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test352() {
        String str = "j 0x29# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000029", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test353() {
        String str = "lui $s5, 0x8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c150008", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test354() {
        String str = "or $at, $sp, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03b20825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test355() {
        String str = "ori $a2, $a0, 0xfff6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3486fff6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test356() {
        String str = "andi $s2, $s5, -69";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32b2ffbb", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test357() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test358() {
        String str = "andi $t9, $sp, -37";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("33b9ffdb", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test359() {
        String str = "andi $t5, $s4, 0xfffd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("328dfffd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test360() {
        String str = "beq $s1, $v0, 0xff81";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1222ff81", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test361() {
        String str = "add $t0, $sp, $k1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03bb4020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test362() {
        String str = "sub $k1, $s5, $t4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02acd822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test363() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test364() {
        String str = "lw $a3, ($t5)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8da70000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test365() {
        String str = "j 0xe0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000e0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test366() {
        String str = "bne $t6, $ra, 0xff57";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15dfff57", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test367() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test368() {
        String str = "sub $at, $t6, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01c80822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test369() {
        String str = "sw $s0, 239($s3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae7000ef", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test370() {
        String str = "j 0x21";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000021", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test371() {
        String str = "sw $s4, 224($s1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae3400e0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test372() {
        String str = "addiu $at, $a3, 176";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24e100b0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test373() {
        String str = "add $v0, $t6, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01cf1020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test374() {
        String str = "sw $a0, 143($gp)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af84008f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test375() {
        String str = "j 0x8e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800008e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test376() {
        String str = "add $ra, $a0, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0083f820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test377() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test378() {
        String str = "or $s6, $s6, $ra";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02dfb025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test379() {
        String str = "sw $s5, ($t1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad350000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test380() {
        String str = "sub $at, $t3, $a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01650822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test381() {
        String str = "addiu $t2, $at, 91";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("242a005b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test382() {
        String str = "add $t5, $v0, $t1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00496820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test383() {
        String str = "slt $t5, $t7, $at# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01e1682a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test384() {
        String str = "andi $t9, $s0, 0xcd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("321900cd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test385() {
        String str = "ori $t2, $s7, -201";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36eaff37", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test386() {
        String str = "and $sp, $gp, $ra";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("039fe824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test387() {
        String str = "ori $k1, $s5, 165";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36bb00a5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test388() {
        String str = "sw $gp, ($t1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad3c0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test389() {
        String str = "bne $t7, $s1, 0xff5a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15f1ff5a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test390() {
        String str = "j 0x1e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800001e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test391() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test392() {
        String str = "lw $t4, -103($a2)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8cccff99", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test393() {
        String str = "beq $t9, $t7, -117";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("132fff8b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test394() {
        String str = "andi $t3, $t4, 248";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("318b00f8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test395() {
        String str = "andi $s4, $s2, 0x95# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32540095", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test396() {
        String str = "addiu $s6, $sp, 108";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("27b6006c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test397() {
        String str = "addiu $gp, $v0, 0x4e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("245c004e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test398() {
        String str = "add $fp, $s5, $a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02a5f020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test399() {
        String str = "slt $s4, $t6, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01d8a02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test400() {
        String str = "lui $a3, 0xb2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0700b2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test401() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test402() {
        String str = "slt $ra, $ra, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03e2f82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test403() {
        String str = "beq $a3, $s6, 192";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("10f600c0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test404() {
        String str = "sw $s0, 124($zero)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac10007c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test405() {
        String str = "lw $fp, ($t5)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8dbe0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test406() {
        String str = "and $k0, $s6, $t2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02cad024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test407() {
        String str = "beq $v1, $t7, 0xffe9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("106fffe9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test408() {
        String str = "bne $t8, $a1, 221";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("170500dd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test409() {
        String str = "lui $t8, 0xbd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1800bd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test410() {
        String str = "andi $s4, $s2, 0xfffa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3254fffa", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test411() {
        String str = "and $v0, $a1, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00be1024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test412() {
        String str = "and $t5, $t0, $t2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("010a6824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test413() {
        String str = "and $a1, $v1, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00792824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test414() {
        String str = "j 0xad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000ad", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test415() {
        String str = "lw $gp, -138($t3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8d7cff76", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test416() {
        String str = "ori $s2, $s3, 72";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36720048", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test417() {
        String str = "lui $v1, 0xf3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0300f3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test418() {
        String str = "ori $k1, $s7, 207";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36fb00cf", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test419() {
        String str = "j 0x17";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000017", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test420() {
        String str = "add $a0, $s4, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("029e2020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test421() {
        String str = "and $s2, $zero, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00169024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test422() {
        String str = "ori $s5, $a2, 103";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("34d50067", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test423() {
        String str = "lui $sp, 0x5b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1d005b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test424() {
        String str = "add $t3, $a1, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00b95820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test425() {
        String str = "bne $s5, $a2, 0xff51";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16a6ff51", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test426() {
        String str = "or $k1, $t0, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0110d825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test427() {
        String str = "lw $t3, -249($k1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8f6bff07", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test428() {
        String str = "and $s1, $t6, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01c68824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test429() {
        String str = "lui $s1, 0x7b# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c11007b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test430() {
        String str = "add $v0, $a2, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00d91020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test431() {
        String str = "slt $s7, $s2, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0243b82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test432() {
        String str = "beq $k1, $a1, 0xff98";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1365ff98", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test433() {
        String str = "or $a1, $v0, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00532825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test434() {
        String str = "ori $s4, $k1, 0x17";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("37740017", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test435() {
        String str = "j 0x5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000005", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test436() {
        String str = "j 0x6f# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800006f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test437() {
        String str = "or $s0, $s6, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02c38025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test438() {
        String str = "sw $a1, 201($t4)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad8500c9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test439() {
        String str = "j 0x3b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800003b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test440() {
        String str = "andi $t0, $t1, 0xff6c# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3128ff6c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test441() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test442() {
        String str = "j 0x59";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000059", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test443() {
        String str = "and $s1, $v1, $a1# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00658824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test444() {
        String str = "lui $s2, 0xbb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1200bb", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test445() {
        String str = "ori $t1, $a2, 0xff90";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("34c9ff90", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test446() {
        String str = "j 0xe5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000e5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test447() {
        String str = "addiu $t3, $s4, 0xe7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("268b00e7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test448() {
        String str = "andi $a3, $t7, 0x8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("31e70008", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test449() {
        String str = "ori $a1, $t3, -204";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3565ff34", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test450() {
        String str = "sw $s2, ($t8)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af120000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test451() {
        String str = "and $t4, $a0, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00936024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test452() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test453() {
        String str = "sw $t4, -214($v1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac6cff2a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test454() {
        String str = "lui $a0, 0xb9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0400b9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test455() {
        String str = "beq $a0, $s2, 0x58# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("10920058", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test456() {
        String str = "j 0x48# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000048", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test457() {
        String str = "lui $s4, 0xb0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1400b0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test458() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test459() {
        String str = "add $zero, $zero, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("000b0020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test460() {
        String str = "lui $s6, 0xa6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1600a6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test461() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test462() {
        String str = "lw $t5, 220($v1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c6d00dc", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test463() {
        String str = "or $v1, $t4, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01821825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test464() {
        String str = "sub $t3, $s7, $s1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02f15822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test465() {
        String str = "j 0x4e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800004e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test466() {
        String str = "or $at, $t7, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01e60825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test467() {
        String str = "lw $s3, -26($a0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c93ffe6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test468() {
        String str = "j 0x84";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000084", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test469() {
        String str = "add $t8, $a3, $t2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00eac020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test470() {
        String str = "ori $gp, $gp, -106";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("379cff96", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test471() {
        String str = "addiu $s7, $k0, 248";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("275700f8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test472() {
        String str = "or $s7, $s3, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0270b825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test473() {
        String str = "andi $t3, $v0, 27";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("304b001b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test474() {
        String str = "sw $s6, ($t1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad360000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test475() {
        String str = "ori $a0, $s6, 0x0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36c40000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test476() {
        String str = "bne $at, $ra, 0xff84";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("143fff84", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test477() {
        String str = "sw $s2, -93($s7)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("aef2ffa3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test478() {
        String str = "ori $a1, $gp, -48# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3785ffd0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test479() {
        String str = "j 0x97";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000097", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test480() {
        String str = "or $a0, $t6, $fp# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01de2025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test481() {
        String str = "lui $s6, 0x83";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c160083", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test482() {
        String str = "and $t0, $k1, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03764024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test483() {
        String str = "or $t3, $fp, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03cb5825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test484() {
        String str = "and $s0, $a0, $s7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00978024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test485() {
        String str = "and $s3, $a0, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00999824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test486() {
        String str = "slt $ra, $t3, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0170f82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test487() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test488() {
        String str = "sub $a1, $t2, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01522822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test489() {
        String str = "bne $v0, $s4, 0xff86";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1454ff86", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test490() {
        String str = "lui $v0, 0xae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0200ae", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test491() {
        String str = "ori $a0, $zero, -52";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3404ffcc", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test492() {
        String str = "lw $fp, ($at)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c3e0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test493() {
        String str = "slt $fp, $a0, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("009cf02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test494() {
        String str = "slt $t3, $a3, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00e6582a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test495() {
        String str = "sw $s4, 126($t0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad14007e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test496() {
        String str = "lui $k0, 0x25";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1a0025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test497() {
        String str = "lw $k1, -232($k1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8f7bff18", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test498() {
        String str = "ori $a1, $s1, -156";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3625ff64", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test499() {
        String str = "j 0xfa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000fa", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test500() {
        String str = "and $t4, $t2, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01466024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test501() {
        String str = "sub $s6, $t7, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01e8b022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test502() {
        String str = "ori $t6, $gp, 134";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("378e0086", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test503() {
        String str = "j 0x8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000008", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test504() {
        String str = "lui $s6, 0xf1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1600f1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test505() {
        String str = "j 0x4d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800004d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test506() {
        String str = "lw $t3, ($t0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8d0b0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test507() {
        String str = "lui $t2, 0x6d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0a006d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test508() {
        String str = "sub $s4, $v1, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("006ea022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test509() {
        String str = "beq $s3, $t9, 0x31";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("12790031", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test510() {
        String str = "sub $t6, $t4, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01887022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test511() {
        String str = "bne $s6, $s2, 164";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16d200a4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test512() {
        String str = "ori $v0, $sp, 0xb3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("37a200b3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test513() {
        String str = "bne $s7, $v0, -20";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16e2ffec", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test514() {
        String str = "bne $v0, $s7, -155";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1457ff65", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test515() {
        String str = "sub $t0, $zero, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("000d4022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test516() {
        String str = "sub $s7, $a3, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00f3b822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test517() {
        String str = "lui $s1, 0xd5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1100d5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test518() {
        String str = "addiu $a1, $s1, 0x6c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("2625006c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test519() {
        String str = "sw $ra, ($t9)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af3f0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test520() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test521() {
        String str = "j 0x61";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000061", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test522() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test523() {
        String str = "add $s2, $t0, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01129020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test524() {
        String str = "j 0x3c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800003c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test525() {
        String str = "andi $s6, $t4, 148";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("31960094", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test526() {
        String str = "or $s5, $a3, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00f5a825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test527() {
        String str = "lw $s4, -147($at)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c34ff6d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test528() {
        String str = "and $a2, $t4, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("019a3024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test529() {
        String str = "add $t7, $ra, $a3# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03e77820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test530() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test531() {
        String str = "lw $s3, -17($t7)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8df3ffef", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test532() {
        String str = "beq $s1, $s5, 0xff2c# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1235ff2c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test533() {
        String str = "sub $s5, $zero, $gp# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("001ca822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test534() {
        String str = "lui $a3, 0x5b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c07005b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test535() {
        String str = "sw $a1, -209($a0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac85ff2f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test536() {
        String str = "lui $s2, 0x8b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c12008b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test537() {
        String str = "and $v1, $t9, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("032e1824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test538() {
        String str = "add $t9, $k1, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0368c820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test539() {
        String str = "slt $s3, $s5, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02be982a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test540() {
        String str = "lw $k0, ($fp)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8fda0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test541() {
        String str = "ori $t9, $s6, -198";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36d9ff3a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test542() {
        String str = "j 0xec# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000ec", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test543() {
        String str = "beq $t3, $s6, -78# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1176ffb2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test544() {
        String str = "sw $t1, 217($a2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("acc900d9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test545() {
        String str = "bne $a3, $v1, -60";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("14e3ffc4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test546() {
        String str = "addiu $s5, $s5, 74";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26b5004a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test547() {
        String str = "sw $sp, ($a3)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("acfd0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test548() {
        String str = "or $t2, $s1, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("022f5025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test549() {
        String str = "j 0x31";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000031", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test550() {
        String str = "or $s0, $v1, $ra";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("007f8025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test551() {
        String str = "lui $t3, 0x8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0b0008", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test552() {
        String str = "ori $s1, $s1, 0xf6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("363100f6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test553() {
        String str = "and $s3, $a0, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("008b9824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test554() {
        String str = "slt $k0, $a3, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00e3d02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test555() {
        String str = "and $k0, $k1, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0373d024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test556() {
        String str = "sw $a0, 231($a0)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac8400e7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test557() {
        String str = "slt $s5, $s7, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02e7a82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test558() {
        String str = "andi $t2, $ra, 233";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("33ea00e9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test559() {
        String str = "ori $t4, $t8, 0x5b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("370c005b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test560() {
        String str = "ori $s4, $a1, -215# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("34b4ff29", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test561() {
        String str = "addiu $fp, $t5, 95";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("25be005f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test562() {
        String str = "and $fp, $t1, $t7# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("012ff024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test563() {
        String str = "sw $t5, ($t4)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad8d0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test564() {
        String str = "andi $s7, $s1, -99";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3237ff9d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test565() {
        String str = "sub $t8, $t0, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("011dc022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test566() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test567() {
        String str = "addiu $k0, $a3, 0xd2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24fa00d2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test568() {
        String str = "andi $at, $t4, 0xc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3181000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test569() {
        String str = "add $a0, $v1, $a0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00642020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test570() {
        String str = "ori $gp, $a1, 166";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("34bc00a6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test571() {
        String str = "sub $s3, $at, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("003c9822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test572() {
        String str = "ori $t4, $s5, -256";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36acff00", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test573() {
        String str = "sw $s6, ($s3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae760000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test574() {
        String str = "beq $sp, $t0, 167";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("13a800a7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test575() {
        String str = "j 0x26";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000026", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test576() {
        String str = "sw $sp, ($t6)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("addd0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test577() {
        String str = "bne $s0, $a3, -238";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1607ff12", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test578() {
        String str = "and $s6, $t8, $zero";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0300b024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test579() {
        String str = "or $a3, $s2, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("024e3825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test580() {
        String str = "addiu $s4, $v1, 164";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("247400a4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test581() {
        String str = "addiu $s2, $a2, 45";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24d2002d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test582() {
        String str = "sw $a3, 94($k1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af67005e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test583() {
        String str = "slt $s2, $zero, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0007902a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test584() {
        String str = "ori $k1, $s6, -112";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36dbff90", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test585() {
        String str = "beq $ra, $fp, 0xffa9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("13feffa9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test586() {
        String str = "ori $sp, $sp, 139";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("37bd008b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test587() {
        String str = "add $t9, $s4, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0299c820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test588() {
        String str = "ori $v0, $at, 0xc5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("342200c5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test589() {
        String str = "beq $zero, $t3, 0xdf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("100b00df", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test590() {
        String str = "bne $t5, $t4, 0xffbd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15acffbd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test591() {
        String str = "j 0x49";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000049", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test592() {
        String str = "and $a0, $zero, $zero";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00002024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test593() {
        String str = "lw $v1, ($t5)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8da30000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test594() {
        String str = "or $a1, $s3, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02622825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test595() {
        String str = "ori $t1, $s0, -254";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3609ff02", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test596() {
        String str = "ori $t4, $t1, 74";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("352c004a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test597() {
        String str = "lw $t2, 8($zero)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c0a0008", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test598() {
        String str = "sub $t6, $a2, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00cb7022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test599() {
        String str = "ori $v0, $t0, 0xffb8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3502ffb8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test600() {
        String str = "lw $s7, 129($t1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8d370081", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test601() {
        String str = "addiu $s0, $zero, 0x57";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24100057", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test602() {
        String str = "lui $s4, 0xc4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1400c4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test603() {
        String str = "addiu $t8, $ra, 0x8c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("27f8008c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test604() {
        String str = "ori $a1, $t3, 0xffdc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3565ffdc", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test605() {
        String str = "lui $fp, 0x54";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1e0054", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test606() {
        String str = "add $k1, $at, $s4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0034d820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test607() {
        String str = "ori $t8, $t4, -39";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3598ffd9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test608() {
        String str = "sw $t9, 41($t8)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af190029", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test609() {
        String str = "sub $t5, $t1, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("013c6822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test610() {
        String str = "j 0xb1# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000b1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test611() {
        String str = "ori $a1, $t8, 0xff07# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3705ff07", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test612() {
        String str = "lui $a2, 0x88";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c060088", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test613() {
        String str = "and $v1, $t0, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01071824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test614() {
        String str = "addiu $t5, $k0, 127";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("274d007f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test615() {
        String str = "lw $t5, ($zero)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c0d0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test616() {
        String str = "sw $ra, 97($t8)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af1f0061", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test617() {
        String str = "andi $at, $s7, -36";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32e1ffdc", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test618() {
        String str = "or $t5, $at, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("003a6825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test619() {
        String str = "andi $ra, $v0, 0xff60";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("305fff60", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test620() {
        String str = "beq $a2, $v0, 0xff87# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("10c2ff87", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test621() {
        String str = "lw $gp, 50($a2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8cdc0032", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test622() {
        String str = "j 0x7e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800007e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test623() {
        String str = "add $a1, $s0, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("020e2820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test624() {
        String str = "addiu $sp, $t1, 0x1c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("253d001c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test625() {
        String str = "lui $k1, 0xfa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1b00fa", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test626() {
        String str = "j 0xb8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000b8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test627() {
        String str = "j 0x93";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000093", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test628() {
        String str = "add $v0, $s4, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("029a1020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test629() {
        String str = "or $s0, $t0, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("011d8025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test630() {
        String str = "bne $fp, $a3, 135";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("17c70087", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test631() {
        String str = "sw $s5, ($t4)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad950000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test632() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test633() {
        String str = "or $a0, $a1, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00b52025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test634() {
        String str = "andi $k1, $t6, 0xff4b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("31dbff4b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test635() {
        String str = "lui $t9, 0xd7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1900d7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test636() {
        String str = "lw $k1, ($s3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8e7b0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test637() {
        String str = "addiu $t9, $t2, 0xfb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("255900fb", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test638() {
        String str = "sw $ra, ($at)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac3f0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test639() {
        String str = "j 0xad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000ad", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test640() {
        String str = "slt $gp, $t1, $zero";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0120e02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test641() {
        String str = "sw $t7, ($at)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac2f0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test642() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test643() {
        String str = "lui $a3, 0x72";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c070072", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test644() {
        String str = "add $s3, $a2, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00de9820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test645() {
        String str = "or $zero, $t6, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01d20025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test646() {
        String str = "slt $a3, $at, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("002f382a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test647() {
        String str = "beq $t1, $t0, 0xff1d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1128ff1d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test648() {
        String str = "j 0x43";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000043", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test649() {
        String str = "beq $v1, $at, 74";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1061004a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test650() {
        String str = "slt $a1, $s6, $s1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02d1282a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test651() {
        String str = "lw $v0, ($s6)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8ec20000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test652() {
        String str = "ori $a3, $zero, 0xe3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("340700e3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test653() {
        String str = "bne $s5, $t3, -157";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16abff63", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test654() {
        String str = "j 0xb9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000b9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test655() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test656() {
        String str = "lw $v1, -218($k1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8f63ff26", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test657() {
        String str = "addiu $t3, $s0, 0x3c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("260b003c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test658() {
        String str = "addiu $v1, $s1, 0x1b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("2623001b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test659() {
        String str = "add $a2, $s0, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02023020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test660() {
        String str = "sub $t0, $a2, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00dd4022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test661() {
        String str = "and $s4, $s1, $a3# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0227a024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test662() {
        String str = "ori $s6, $s6, 36";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36d60024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test663() {
        String str = "addiu $sp, $t7, 4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("25fd0004", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test664() {
        String str = "andi $s6, $a3, 0xff99";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("30f6ff99", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test665() {
        String str = "andi $t9, $s0, 0x94";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32190094", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test666() {
        String str = "j 0x21";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000021", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test667() {
        String str = "and $a0, $t3, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01782024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test668() {
        String str = "or $t3, $t6, $t2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01ca5825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test669() {
        String str = "add $gp, $t7, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01e1e020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test670() {
        String str = "sw $ra, ($k1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af7f0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test671() {
        String str = "addiu $t3, $t4, 0x2f# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("258b002f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test672() {
        String str = "add $s7, $t7, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01f6b820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test673() {
        String str = "addiu $t6, $at, 0xf6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("242e00f6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test674() {
        String str = "sw $a2, 76($a3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ace6004c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test675() {
        String str = "addiu $t8, $zero, 0xaf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("241800af", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test676() {
        String str = "lui $fp, 0x6d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1e006d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test677() {
        String str = "and $t0, $a3, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00fa4024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test678() {
        String str = "or $s1, $s7, $a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02e58825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test679() {
        String str = "j 0xdc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000dc", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test680() {
        String str = "addiu $t3, $v0, 167";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("244b00a7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test681() {
        String str = "add $t4, $a1, $t6# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00ae6020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test682() {
        String str = "add $s7, $s5, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02a8b820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test683() {
        String str = "lui $a0, 0xa3# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0400a3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test684() {
        String str = "sub $k1, $t3, $k1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("017bd822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test685() {
        String str = "add $s3, $t4, $k1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("019b9820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test686() {
        String str = "lw $ra, ($k0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8f5f0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test687() {
        String str = "bne $t9, $at, 0xffad# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1721ffad", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test688() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test689() {
        String str = "lw $a0, -231($a0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c84ff19", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test690() {
        String str = "sub $at, $at, $zero";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00200822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test691() {
        String str = "addiu $t3, $at, 90";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("242b005a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test692() {
        String str = "sw $v0, 169($a3)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ace200a9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test693() {
        String str = "beq $t8, $t9, 0xfffe";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1319fffe", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test694() {
        String str = "addiu $t3, $v0, 117";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("244b0075", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test695() {
        String str = "sub $s5, $s5, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02bca822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test696() {
        String str = "slt $sp, $a3, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00e1e82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test697() {
        String str = "sub $s4, $k0, $s7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0357a022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test698() {
        String str = "andi $t8, $k1, 0xff20";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3378ff20", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test699() {
        String str = "sw $v1, ($gp)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af830000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test700() {
        String str = "add $t8, $t7, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01fac020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test701() {
        String str = "lui $s4, 0xde# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1400de", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test702() {
        String str = "add $s5, $sp, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03a3a820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test703() {
        String str = "and $v0, $t7, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01fd1024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test704() {
        String str = "and $a3, $s0, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02083824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test705() {
        String str = "j 0xed";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000ed", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test706() {
        String str = "addiu $a2, $t6, 24";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("25c60018", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test707() {
        String str = "beq $s3, $t8, 0x8d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1278008d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test708() {
        String str = "sw $at, -204($t8)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af01ff34", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test709() {
        String str = "add $a2, $t9, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03353020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test710() {
        String str = "j 0xe1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000e1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test711() {
        String str = "sub $a0, $t5, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01af2022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test712() {
        String str = "beq $s5, $s6, 0x67";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("12b60067", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test713() {
        String str = "j 0xe3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000e3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test714() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test715() {
        String str = "beq $gp, $t3, 0xffc7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("138bffc7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test716() {
        String str = "slt $t5, $t6, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01d8682a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test717() {
        String str = "ori $t8, $s4, -205";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3698ff33", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test718() {
        String str = "lui $ra, 0x13";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1f0013", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test719() {
        String str = "or $a0, $t7, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01fc2025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test720() {
        String str = "add $s7, $s2, $s4# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0254b820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test721() {
        String str = "and $t5, $t7, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01e26824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test722() {
        String str = "lw $t5, 34($a2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8ccd0022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test723() {
        String str = "beq $s5, $t3, 109";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("12ab006d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test724() {
        String str = "and $fp, $s7, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02fef024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test725() {
        String str = "j 0xf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800000f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test726() {
        String str = "lw $t4, 69($s2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8e4c0045", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test727() {
        String str = "lw $k1, ($s6)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8edb0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test728() {
        String str = "add $ra, $a0, $zero";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0080f820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test729() {
        String str = "ori $t3, $a1, 0x60# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("34ab0060", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test730() {
        String str = "and $at, $t4, $s7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01970824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test731() {
        String str = "add $s4, $at, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0033a020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test732() {
        String str = "addiu $s1, $s7, 199";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26f100c7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test733() {
        String str = "bne $a0, $a1, 79";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1485004f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test734() {
        String str = "or $k0, $s3, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("027ad025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test735() {
        String str = "add $v0, $t9, $s1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03311020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test736() {
        String str = "bne $sp, $s2, -214";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("17b2ff2a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test737() {
        String str = "beq $t7, $t1, 0xff0d# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("11e9ff0d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test738() {
        String str = "sub $v0, $t2, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01521022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test739() {
        String str = "slt $t5, $s1, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0223682a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test740() {
        String str = "lui $t1, 0x58";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c090058", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test741() {
        String str = "addiu $v1, $fp, 199";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("27c300c7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test742() {
        String str = "addiu $t6, $t0, 0x42";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("250e0042", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test743() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test744() {
        String str = "beq $at, $t2, 0x22";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("102a0022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test745() {
        String str = "sw $zero, 175($t8)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af0000af", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test746() {
        String str = "slt $sp, $s3, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0279e82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test747() {
        String str = "sw $s3, -250($a1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("acb3ff06", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test748() {
        String str = "slt $k1, $at, $s3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0033d82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test749() {
        String str = "slt $s2, $a3, $a0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00e4902a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test750() {
        String str = "bne $t4, $k0, 62";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("159a003e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test751() {
        String str = "andi $k1, $t0, 0x5c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("311b005c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test752() {
        String str = "bne $t6, $v0, 0xfff9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15c2fff9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test753() {
        String str = "or $at, $a1, $t1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00a90825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test754() {
        String str = "sw $t2, 69($v1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac6a0045", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test755() {
        String str = "ori $t7, $sp, 0xfff5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("37affff5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test756() {
        String str = "andi $s1, $at, 0xffc9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3031ffc9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test757() {
        String str = "beq $t9, $s5, 0xda";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("133500da", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test758() {
        String str = "bne $s5, $t9, 97";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16b90061", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test759() {
        String str = "lw $s6, ($v0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c560000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test760() {
        String str = "slt $a0, $t8, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0316202a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test761() {
        String str = "slt $zero, $s0, $t5# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("020d002a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test762() {
        String str = "or $s3, $t2, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("014b9825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test763() {
        String str = "sub $a3, $zero, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00063822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test764() {
        String str = "sw $t8, ($a2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("acd80000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test765() {
        String str = "j 0xd7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000d7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test766() {
        String str = "andi $t1, $s6, 0xfff4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32c9fff4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test767() {
        String str = "sw $ra, -37($t3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad7fffdb", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test768() {
        String str = "or $s2, $t5, $t1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01a99025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test769() {
        String str = "sw $a3, ($zero)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac070000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test770() {
        String str = "sub $k0, $t3, $ra# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("017fd022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test771() {
        String str = "or $s7, $t3, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0176b825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test772() {
        String str = "bne $t6, $ra, 0xae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15df00ae", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test773() {
        String str = "or $s3, $t9, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("033a9825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test774() {
        String str = "bne $sp, $s2, 0xffed";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("17b2ffed", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test775() {
        String str = "addiu $s2, $t6, 0x29";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("25d20029", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test776() {
        String str = "andi $k1, $s4, -218# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("329bff26", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test777() {
        String str = "addiu $gp, $fp, 0xb1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("27dc00b1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test778() {
        String str = "sw $zero, ($a2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("acc00000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test779() {
        String str = "lw $s3, ($a1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8cb30000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test780() {
        String str = "sw $a3, ($t3)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ad670000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test781() {
        String str = "lui $at, 0x80# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c010080", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test782() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test783() {
        String str = "sub $t7, $k1, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03727822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test784() {
        String str = "bne $k0, $t7, 0x6f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("174f006f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test785() {
        String str = "lui $k0, 0x94";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1a0094", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test786() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test787() {
        String str = "slt $s3, $t8, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0315982a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test788() {
        String str = "beq $ra, $t3, 0x2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("13eb0002", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test789() {
        String str = "beq $at, $k1, 209# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("103b00d1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test790() {
        String str = "lw $k1, ($at)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c3b0000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test791() {
        String str = "and $t0, $k0, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03564024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test792() {
        String str = "andi $t0, $t5, 0x1b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("31a8001b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test793() {
        String str = "lui $t9, 0xb1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1900b1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test794() {
        String str = "or $sp, $s0, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0208e825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test795() {
        String str = "addiu $t4, $t7, 0x95";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("25ec0095", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test796() {
        String str = "and $t9, $t9, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0327c824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test797() {
        String str = "sub $s2, $t8, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03189022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test798() {
        String str = "andi $t3, $k0, 0x3e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("334b003e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test799() {
        String str = "bne $s4, $t4, 16";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("168c0010", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test800() {
        String str = "lui $t7, 0x9c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0f009c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test801() {
        String str = "beq $ra, $k1, -34";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("13fbffde", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test802() {
        String str = "andi $a1, $s5, 0xb2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32a500b2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test803() {
        String str = "and $t2, $t8, $ra";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("031f5024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test804() {
        String str = "lui $v0, 0xac";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0200ac", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test805() {
        String str = "sw $s4, ($v1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac740000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test806() {
        String str = "lw $fp, 139($t7)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8dfe008b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test807() {
        String str = "or $s5, $t9, $s7# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0337a825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test808() {
        String str = "j 0xcf# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000cf", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test809() {
        String str = "sw $v1, ($k0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af430000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test810() {
        String str = "lw $k0, -183($t0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8d1aff49", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test811() {
        String str = "beq $ra, $a0, -231# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("13e4ff19", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test812() {
        String str = "add $s4, $t1, $zero";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0120a020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test813() {
        String str = "ori $k0, $s4, -75";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("369affb5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test814() {
        String str = "beq $k1, $t3, 192";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("136b00c0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test815() {
        String str = "sub $t6, $s7, $t4# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02ec7022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test816() {
        String str = "beq $t9, $t9, 91";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1339005b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test817() {
        String str = "and $t2, $t4, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01875024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test818() {
        String str = "beq $s4, $a2, 0xff4c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1286ff4c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test819() {
        String str = "or $gp, $fp, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03cee025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test820() {
        String str = "ori $a0, $t8, 0x93";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("37040093", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test821() {
        String str = "add $fp, $s0, $s7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0217f020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test822() {
        String str = "sw $s4, -171($k1)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af74ff55", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test823() {
        String str = "sub $v1, $a1, $zero";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00a01822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test824() {
        String str = "lw $s7, ($zero)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c170000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test825() {
        String str = "lui $at, 0xb6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0100b6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test826() {
        String str = "bne $t2, $t9, 0xffa6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1559ffa6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test827() {
        String str = "add $s2, $s5, $s4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02b49020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test828() {
        String str = "j 0x36# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000036", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test829() {
        String str = "lui $k0, 0xe6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1a00e6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test830() {
        String str = "or $v1, $s6, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02d81825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test831() {
        String str = "or $k0, $s4, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0292d025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test832() {
        String str = "add $t7, $fp, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03dd7820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test833() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test834() {
        String str = "lui $t2, 0x7a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0a007a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test835() {
        String str = "bne $s2, $t5, 0xff57";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("164dff57", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test836() {
        String str = "add $zero, $a3, $t5# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00ed0020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test837() {
        String str = "and $t1, $s0, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02074824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test838() {
        String str = "sw $s1, ($v1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac710000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test839() {
        String str = "slt $s7, $t4, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("019cb82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test840() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test841() {
        String str = "lw $t8, ($s7)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8ef80000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test842() {
        String str = "sw $s5, ($sp)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("afb50000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test843() {
        String str = "and $a1, $at, $t2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("002a2824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test844() {
        String str = "and $a1, $t9, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("032d2824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test845() {
        String str = "and $gp, $t8, $t1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0309e024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test846() {
        String str = "j 0x6a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800006a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test847() {
        String str = "addiu $ra, $zero, 243";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("241f00f3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test848() {
        String str = "beq $t0, $gp, 182";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("111c00b6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test849() {
        String str = "andi $t6, $s5, 0xff20";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32aeff20", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test850() {
        String str = "slt $t0, $t5, $sp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01bd402a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test851() {
        String str = "or $t0, $s6, $a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02c54025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test852() {
        String str = "ori $v1, $v0, -158";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3443ff62", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test853() {
        String str = "slt $s3, $a3, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00fe982a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test854() {
        String str = "lw $a2, ($zero)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c060000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test855() {
        String str = "and $fp, $s6, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02c3f024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test856() {
        String str = "j 0x6a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800006a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test857() {
        String str = "sw $s0, ($s7)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("aef00000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test858() {
        String str = "bne $t2, $gp, 0xff37";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("155cff37", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test859() {
        String str = "sub $t3, $a3, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00f25822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test860() {
        String str = "or $t3, $k1, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("036b5825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test861() {
        String str = "ori $s4, $t6, 52# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("35d40034", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test862() {
        String str = "lui $v1, 0x7a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c03007a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test863() {
        String str = "sw $a1, ($s2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae450000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test864() {
        String str = "beq $t2, $s1, -26";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1151ffe6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test865() {
        String str = "sw $s1, ($at)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac310000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test866() {
        String str = "lw $at, ($s1)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8e210000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test867() {
        String str = "lui $v1, 0xf0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c0300f0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test868() {
        String str = "lw $v0, ($k1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8f620000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test869() {
        String str = "lui $a0, 0x84# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c040084", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test870() {
        String str = "add $ra, $t4, $v1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0183f820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test871() {
        String str = "beq $t4, $t3, -245";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("118bff0b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test872() {
        String str = "and $t2, $t7, $a0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01e45024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test873() {
        String str = "sw $t9, ($s1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae390000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test874() {
        String str = "beq $gp, $t4, 222";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("138c00de", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test875() {
        String str = "andi $sp, $v1, 134";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("307d0086", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test876() {
        String str = "add $t8, $v0, $ra";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("005fc020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test877() {
        String str = "slt $fp, $s5, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02aff02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test878() {
        String str = "addiu $s1, $v1, 0x63";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24710063", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test879() {
        String str = "and $at, $ra, $a1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03e50824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test880() {
        String str = "j 0x72";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000072", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test881() {
        String str = "and $at, $t6, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01c70824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test882() {
        String str = "ori $fp, $ra, 65";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("37fe0041", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test883() {
        String str = "or $t3, $t2, $t4# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("014c5825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test884() {
        String str = "sub $t6, $s4, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02957022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test885() {
        String str = "andi $gp, $gp, 0x91";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("339c0091", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test886() {
        String str = "slt $sp, $fp, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03c7e82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test887() {
        String str = "j 0x46";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000046", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test888() {
        String str = "beq $at, $k1, 0xff36";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("103bff36", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test889() {
        String str = "bne $s6, $ra, 0xff3b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16dfff3b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test890() {
        String str = "sw $s3, ($v1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac730000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test891() {
        String str = "slt $at, $s0, $t2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("020a082a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test892() {
        String str = "beq $zero, $s6, 70";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("10160046", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test893() {
        String str = "andi $t1, $s2, 0xfff4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3249fff4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test894() {
        String str = "sub $zero, $t7, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01f50022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test895() {
        String str = "beq $s0, $s0, 0xff71";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1210ff71", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test896() {
        String str = "ori $gp, $t4, 0xdd# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("359c00dd", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test897() {
        String str = "j 0xdf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000df", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test898() {
        String str = "sub $t2, $sp, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03a15022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test899() {
        String str = "beq $fp, $s3, -245";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("13d3ff0b", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test900() {
        String str = "sub $s2, $t3, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01709022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test901() {
        String str = "or $zero, $at, $s7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00370025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test902() {
        String str = "j 0x76";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000076", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test903() {
        String str = "addiu $k1, $a3, 119";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("24fb0077", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test904() {
        String str = "j 0x2a# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800002a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test905() {
        String str = "j 0xa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800000a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test906() {
        String str = "sw $t4, -23($t6)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("adccffe9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test907() {
        String str = "addiu $s7, $s6, 0x3d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26d7003d", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test908() {
        String str = "sub $gp, $s4, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("028de022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test909() {
        String str = "bne $t4, $s1, 0x3c# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1591003c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test910() {
        String str = "and $t7, $a0, $gp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("009c7824", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test911() {
        String str = "beq $t3, $t7, 0x26";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("116f0026", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test912() {
        String str = "bne $s1, $a0, 0xf3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("162400f3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test913() {
        String str = "sw $t4, -167($s6)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("aeccff59", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test914() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test915() {
        String str = "or $t0, $s0, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02124025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test916() {
        String str = "lw $t5, -89($s0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8e0dffa7", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test917() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test918() {
        String str = "slt $s7, $a3, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00f9b82a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test919() {
        String str = "or $s5, $t3, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0168a825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test920() {
        String str = "bne $t5, $s2, 0xe8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15b200e8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test921() {
        String str = "bne $t6, $t7, 0xf5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15cf00f5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test922() {
        String str = "j 0xa5# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000a5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test923() {
        String str = "j 0x70";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000070", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test924() {
        String str = "sub $t8, $a2, $s4# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00d4c022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test925() {
        String str = "addiu $s5, $t6, 0xb0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("25d500b0", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test926() {
        String str = "sub $ra, $s6, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02cdf822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test927() {
        String str = "beq $a2, $at, 0xcb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("10c100cb", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test928() {
        String str = "bne $k1, $s0, -216";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1770ff28", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test929() {
        String str = "add $a1, $a0, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00822820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test930() {
        String str = "or $sp, $a1, $s0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00b0e825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test931() {
        String str = "bne $v0, $s1, 0xf1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("145100f1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test932() {
        String str = "beq $v0, $t4, 0xe1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("104c00e1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test933() {
        String str = "bne $t1, $a3, 0x1e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1527001e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test934() {
        String str = "lui $zero, 0x9e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c00009e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test935() {
        String str = "and $t8, $k0, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("034bc024", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test936() {
        String str = "lw $zero, ($a2)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8cc00000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test937() {
        String str = "sw $k0, 217($s0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ae1a00d9", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test938() {
        String str = "j 0x6e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800006e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test939() {
        String str = "andi $s6, $s2, 0xf1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("325600f1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test940() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test941() {
        String str = "or $s0, $s3, $fp";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("027e8025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test942() {
        String str = "andi $s7, $s5, 0xff";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32b700ff", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test943() {
        String str = "j 0x42";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000042", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test944() {
        String str = "add $k0, $v1, $t4# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("006cd020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test945() {
        String str = "lui $s3, 0xf2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c1300f2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test946() {
        String str = "add $at, $s1, $s7# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02370820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test947() {
        String str = "addiu $s5, $s1, 210";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("263500d2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test948() {
        String str = "j 0xfe# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000fe", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test949() {
        String str = "or $k0, $t8, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0302d025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test950() {
        String str = "j 0x50";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("08000050", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test951() {
        String str = "beq $t0, $at, 0xffc8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1101ffc8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test952() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test953() {
        String str = "add $at, $s3, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("026d0820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test954() {
        String str = "andi $s0, $s0, 0xff64";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3210ff64", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test955() {
        String str = "addiu $t7, $t1, 0xcf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("252f00cf", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test956() {
        String str = "bne $t6, $s7, -76";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("15d7ffb4", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test957() {
        String str = "j 0xdb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000db", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test958() {
        String str = "ori $v1, $a0, 193";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("348300c1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test959() {
        String str = "j 0xe2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("080000e2", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test960() {
        String str = "bne $s1, $t9, 0x1# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("16390001", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test961() {
        String str = "sub $t1, $a2, $s5# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00d54822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test962() {
        String str = "bne $v1, $t0, 246";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("146800f6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test963() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test964() {
        String str = "lui $zero, 0x92";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("3c000092", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test965() {
        String str = "sub $a2, $s1, $s6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02363022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test966() {
        String str = "lw $t9, -15($a0)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("8c99fff1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test967() {
        String str = "sw $s5, ($t7)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("adf50000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test968() {
        String str = "beq $s5, $v0, 0xffa5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("12a2ffa5", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test969() {
        String str = "beq $t3, $a3, -168";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1167ff58", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test970() {
        String str = "addiu $a2, $s6, 7# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("26c60007", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test971() {
        String str = "or $fp, $fp, $k1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03dbf025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test972() {
        String str = "j 0x2e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0800002e", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test973() {
        String str = "or $a1, $s4, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02822825", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test974() {
        String str = "sub $t0, $sp, $v0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03a24022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test975() {
        String str = "add $a1, $a2, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("00cb2820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test976() {
        String str = "addiu $s1, $k1, 200";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("277100c8", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test977() {
        String str = "slt $gp, $s4, $t5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("028de02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test978() {
        String str = "slt $fp, $gp, $t8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0398f02a", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test979() {
        String str = "addiu $t8, $zero, 0xe1# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("241800e1", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test980() {
        String str = "sub $a0, $k0, $t9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03592022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test981() {
        String str = "andi $t5, $s5, 0xb6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("32ad00b6", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test982() {
        String str = "add $a0, $at, $t6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("002e2020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test983() {
        String str = "bne $gp, $v0, 0xf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1782000f", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test984() {
        String str = "or $a2, $t0, $s2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01123025", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test985() {
        String str = "sub $zero, $s5, $t3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02ab0022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test986() {
        String str = "add $s7, $fp, $s5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03d5b820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test987() {
        String str = "ori $a3, $s6, 0xffe3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("36c7ffe3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test988() {
        String str = "sw $t8, 140($v1)";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("ac78008c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test989() {
        String str = "syscall";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0000000c", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test990() {
        String str = "sub $at, $v0, $t7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("004f0822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test991() {
        String str = "sw $s2, ($k0)# Comment";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("af520000", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test992() {
        String str = "add $a3, $fp, $a2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("03c63820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test993() {
        String str = "beq $t9, $s5, 0xff57";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("1335ff57", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test994() {
        String str = "add $sp, $s1, $t0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("0228e820", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test995() {
        String str = "add $a0, $s7, $at";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("02e12020", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test996() {
        String str = "sub $a2, $t5, $a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("01a73022", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test997() {
        String str = "beq $s5, $s2, -169";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("12b2ff57", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test998() {
        String str = "beq $a2, $s6, -45";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("10d6ffd3", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }

    @Test
    public void test999() {
        String str = "sub $ra, $t0, $k0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str);
        Assert.assertEquals("011af822", instruction.toHex());
        String ins = instruction.toString();
        String comp = ins.length() <= str.length() ? str.substring(0, ins.length()) : str;
        Assert.assertEquals(comp, ins);
    }
}