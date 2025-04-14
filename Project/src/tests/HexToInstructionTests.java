package tests;

import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;
import lib.mips.MIPSStringType;
import org.junit.Assert;
import org.junit.Test;

public class HexToInstructionTests {
    @Test
    public void test0() {
        String str = "02326822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t5, $s1, $s2", instruction.toString());
        Assert.assertEquals("02326822", instruction.toHex());
    }

    @Test
    public void test1() {
        String str = "31f5ffb1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s5, $t7, -79", instruction.toString());
        Assert.assertEquals("31f5ffb1", instruction.toHex());
    }

    @Test
    public void test2() {
        String str = "337d004e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $sp, $k1, 78", instruction.toString());
        Assert.assertEquals("337d004e", instruction.toHex());
    }

    @Test
    public void test3() {
        String str = "161b0079";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s0, $k1, 121", instruction.toString());
        Assert.assertEquals("161b0079", instruction.toHex());
    }

    @Test
    public void test4() {
        String str = "134f00a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $k0, $t7, 163", instruction.toString());
        Assert.assertEquals("134f00a3", instruction.toHex());
    }

    @Test
    public void test5() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test6() {
        String str = "02d81025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $v0, $s6, $t8", instruction.toString());
        Assert.assertEquals("02d81025", instruction.toHex());
    }

    @Test
    public void test7() {
        String str = "267000a7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s0, $s3, 167", instruction.toString());
        Assert.assertEquals("267000a7", instruction.toHex());
    }

    @Test
    public void test8() {
        String str = "aeee0072";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t6, 114($s7)", instruction.toString());
        Assert.assertEquals("aeee0072", instruction.toHex());
    }

    @Test
    public void test9() {
        String str = "3289ffc2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t1, $s4, -62", instruction.toString());
        Assert.assertEquals("3289ffc2", instruction.toHex());
    }

    @Test
    public void test10() {
        String str = "0363582a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t3, $k1, $v1", instruction.toString());
        Assert.assertEquals("0363582a", instruction.toHex());
    }

    @Test
    public void test11() {
        String str = "3c0200da";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $v0, 218", instruction.toString());
        Assert.assertEquals("3c0200da", instruction.toHex());
    }

    @Test
    public void test12() {
        String str = "3c0400d7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a0, 215", instruction.toString());
        Assert.assertEquals("3c0400d7", instruction.toHex());
    }

    @Test
    public void test13() {
        String str = "33c10090";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $at, $fp, 144", instruction.toString());
        Assert.assertEquals("33c10090", instruction.toHex());
    }

    @Test
    public void test14() {
        String str = "161eff06";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s0, $fp, -250", instruction.toString());
        Assert.assertEquals("161eff06", instruction.toHex());
    }

    @Test
    public void test15() {
        String str = "1306ff84";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t8, $a2, -124", instruction.toString());
        Assert.assertEquals("1306ff84", instruction.toHex());
    }

    @Test
    public void test16() {
        String str = "26f60063";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s6, $s7, 99", instruction.toString());
        Assert.assertEquals("26f60063", instruction.toHex());
    }

    @Test
    public void test17() {
        String str = "018c002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $zero, $t4, $t4", instruction.toString());
        Assert.assertEquals("018c002a", instruction.toHex());
    }

    @Test
    public void test18() {
        String str = "acb2ff2d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s2, -211($a1)", instruction.toString());
        Assert.assertEquals("acb2ff2d", instruction.toHex());
    }

    @Test
    public void test19() {
        String str = "8e3affa2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $k0, -94($s1)", instruction.toString());
        Assert.assertEquals("8e3affa2", instruction.toHex());
    }

    @Test
    public void test20() {
        String str = "01680025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $zero, $t3, $t0", instruction.toString());
        Assert.assertEquals("01680025", instruction.toHex());
    }

    @Test
    public void test21() {
        String str = "16c3fff0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s6, $v1, 65520", instruction.toString());
        Assert.assertEquals("16c3fff0", instruction.toHex());
    }

    @Test
    public void test22() {
        String str = "03533825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a3, $k0, $s3", instruction.toString());
        Assert.assertEquals("03533825", instruction.toHex());
    }

    @Test
    public void test23() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test24() {
        String str = "171000e9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t8, $s0, 233", instruction.toString());
        Assert.assertEquals("171000e9", instruction.toHex());
    }

    @Test
    public void test25() {
        String str = "08000074";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 116", instruction.toString());
        Assert.assertEquals("08000074", instruction.toHex());
    }

    @Test
    public void test26() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test27() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test28() {
        String str = "0354a825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s5, $k0, $s4", instruction.toString());
        Assert.assertEquals("0354a825", instruction.toHex());
    }

    @Test
    public void test29() {
        String str = "30f1ffe5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s1, $a3, -27", instruction.toString());
        Assert.assertEquals("30f1ffe5", instruction.toHex());
    }

    @Test
    public void test30() {
        String str = "03fd6025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t4, $ra, $sp", instruction.toString());
        Assert.assertEquals("03fd6025", instruction.toHex());
    }

    @Test
    public void test31() {
        String str = "08000048";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 72", instruction.toString());
        Assert.assertEquals("08000048", instruction.toHex());
    }

    @Test
    public void test32() {
        String str = "26ff00fc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $ra, $s7, 252", instruction.toString());
        Assert.assertEquals("26ff00fc", instruction.toHex());
    }

    @Test
    public void test33() {
        String str = "8e9c0070";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $gp, 112($s4)", instruction.toString());
        Assert.assertEquals("8e9c0070", instruction.toHex());
    }

    @Test
    public void test34() {
        String str = "36f00083";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s0, $s7, 131", instruction.toString());
        Assert.assertEquals("36f00083", instruction.toHex());
    }

    @Test
    public void test35() {
        String str = "002e002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $zero, $at, $t6", instruction.toString());
        Assert.assertEquals("002e002a", instruction.toHex());
    }

    @Test
    public void test36() {
        String str = "03192820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a1, $t8, $t9", instruction.toString());
        Assert.assertEquals("03192820", instruction.toHex());
    }

    @Test
    public void test37() {
        String str = "036fa825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s5, $k1, $t7", instruction.toString());
        Assert.assertEquals("036fa825", instruction.toHex());
    }

    @Test
    public void test38() {
        String str = "36100099";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s0, $s0, 153", instruction.toString());
        Assert.assertEquals("36100099", instruction.toHex());
    }

    @Test
    public void test39() {
        String str = "08000008";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 8", instruction.toString());
        Assert.assertEquals("08000008", instruction.toHex());
    }

    @Test
    public void test40() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test41() {
        String str = "028c3820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a3, $s4, $t4", instruction.toString());
        Assert.assertEquals("028c3820", instruction.toHex());
    }

    @Test
    public void test42() {
        String str = "00c8e02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $gp, $a2, $t0", instruction.toString());
        Assert.assertEquals("00c8e02a", instruction.toHex());
    }

    @Test
    public void test43() {
        String str = "01a41020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $v0, $t5, $a0", instruction.toString());
        Assert.assertEquals("01a41020", instruction.toHex());
    }

    @Test
    public void test44() {
        String str = "2468009b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t0, $v1, 155", instruction.toString());
        Assert.assertEquals("2468009b", instruction.toHex());
    }

    @Test
    public void test45() {
        String str = "1063ffdd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $v1, $v1, 65501", instruction.toString());
        Assert.assertEquals("1063ffdd", instruction.toHex());
    }

    @Test
    public void test46() {
        String str = "3c0b00db";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t3, 219", instruction.toString());
        Assert.assertEquals("3c0b00db", instruction.toHex());
    }

    @Test
    public void test47() {
        String str = "36c7000a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a3, $s6, 10", instruction.toString());
        Assert.assertEquals("36c7000a", instruction.toHex());
    }

    @Test
    public void test48() {
        String str = "8ea4ff4a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $a0, -182($s5)", instruction.toString());
        Assert.assertEquals("8ea4ff4a", instruction.toHex());
    }

    @Test
    public void test49() {
        String str = "02d89822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s3, $s6, $t8", instruction.toString());
        Assert.assertEquals("02d89822", instruction.toHex());
    }

    @Test
    public void test50() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test51() {
        String str = "01257824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t7, $t1, $a1", instruction.toString());
        Assert.assertEquals("01257824", instruction.toHex());
    }

    @Test
    public void test52() {
        String str = "019e002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $zero, $t4, $fp", instruction.toString());
        Assert.assertEquals("019e002a", instruction.toHex());
    }

    @Test
    public void test53() {
        String str = "01c69824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s3, $t6, $a2", instruction.toString());
        Assert.assertEquals("01c69824", instruction.toHex());
    }

    @Test
    public void test54() {
        String str = "3c040007";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a0, 7", instruction.toString());
        Assert.assertEquals("3c040007", instruction.toHex());
    }

    @Test
    public void test55() {
        String str = "3c0e006b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t6, 107", instruction.toString());
        Assert.assertEquals("3c0e006b", instruction.toHex());
    }

    @Test
    public void test56() {
        String str = "3c0500e0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a1, 224", instruction.toString());
        Assert.assertEquals("3c0500e0", instruction.toHex());
    }

    @Test
    public void test57() {
        String str = "018fb022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s6, $t4, $t7", instruction.toString());
        Assert.assertEquals("018fb022", instruction.toHex());
    }

    @Test
    public void test58() {
        String str = "26d900e3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t9, $s6, 227", instruction.toString());
        Assert.assertEquals("26d900e3", instruction.toHex());
    }

    @Test
    public void test59() {
        String str = "3c1a004f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $k0, 79", instruction.toString());
        Assert.assertEquals("3c1a004f", instruction.toHex());
    }

    @Test
    public void test60() {
        String str = "08000099";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 153", instruction.toString());
        Assert.assertEquals("08000099", instruction.toHex());
    }

    @Test
    public void test61() {
        String str = "080000d2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 210", instruction.toString());
        Assert.assertEquals("080000d2", instruction.toHex());
    }

    @Test
    public void test62() {
        String str = "007c7825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t7, $v1, $gp", instruction.toString());
        Assert.assertEquals("007c7825", instruction.toHex());
    }

    @Test
    public void test63() {
        String str = "08000029";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 41", instruction.toString());
        Assert.assertEquals("08000029", instruction.toHex());
    }

    @Test
    public void test64() {
        String str = "08000066";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 102", instruction.toString());
        Assert.assertEquals("08000066", instruction.toHex());
    }

    @Test
    public void test65() {
        String str = "8dfd0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $sp, ($t7)", instruction.toString());
        Assert.assertEquals("8dfd0000", instruction.toHex());
    }

    @Test
    public void test66() {
        String str = "08000052";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 82", instruction.toString());
        Assert.assertEquals("08000052", instruction.toHex());
    }

    @Test
    public void test67() {
        String str = "08000067";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 103", instruction.toString());
        Assert.assertEquals("08000067", instruction.toHex());
    }

    @Test
    public void test68() {
        String str = "3c0d0001";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t5, 1", instruction.toString());
        Assert.assertEquals("3c0d0001", instruction.toHex());
    }

    @Test
    public void test69() {
        String str = "01bab824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s7, $t5, $k0", instruction.toString());
        Assert.assertEquals("01bab824", instruction.toHex());
    }

    @Test
    public void test70() {
        String str = "02c45025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t2, $s6, $a0", instruction.toString());
        Assert.assertEquals("02c45025", instruction.toHex());
    }

    @Test
    public void test71() {
        String str = "8c7bff16";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $k1, -234($v1)", instruction.toString());
        Assert.assertEquals("8c7bff16", instruction.toHex());
    }

    @Test
    public void test72() {
        String str = "344dff89";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t5, $v0, -119", instruction.toString());
        Assert.assertEquals("344dff89", instruction.toHex());
    }

    @Test
    public void test73() {
        String str = "af73001a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s3, 26($k1)", instruction.toString());
        Assert.assertEquals("af73001a", instruction.toHex());
    }

    @Test
    public void test74() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test75() {
        String str = "08000077";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 119", instruction.toString());
        Assert.assertEquals("08000077", instruction.toHex());
    }

    @Test
    public void test76() {
        String str = "24f00005";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s0, $a3, 5", instruction.toString());
        Assert.assertEquals("24f00005", instruction.toHex());
    }

    @Test
    public void test77() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test78() {
        String str = "0299c825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t9, $s4, $t9", instruction.toString());
        Assert.assertEquals("0299c825", instruction.toHex());
    }

    @Test
    public void test79() {
        String str = "8f07ffae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $a3, -82($t8)", instruction.toString());
        Assert.assertEquals("8f07ffae", instruction.toHex());
    }

    @Test
    public void test80() {
        String str = "3c0700ba";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a3, 186", instruction.toString());
        Assert.assertEquals("3c0700ba", instruction.toHex());
    }

    @Test
    public void test81() {
        String str = "001ae820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $sp, $zero, $k0", instruction.toString());
        Assert.assertEquals("001ae820", instruction.toHex());
    }

    @Test
    public void test82() {
        String str = "ad2d00b5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t5, 181($t1)", instruction.toString());
        Assert.assertEquals("ad2d00b5", instruction.toHex());
    }

    @Test
    public void test83() {
        String str = "3706ff68";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a2, $t8, -152", instruction.toString());
        Assert.assertEquals("3706ff68", instruction.toHex());
    }

    @Test
    public void test84() {
        String str = "313100dd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s1, $t1, 221", instruction.toString());
        Assert.assertEquals("313100dd", instruction.toHex());
    }

    @Test
    public void test85() {
        String str = "2642004b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $v0, $s2, 75", instruction.toString());
        Assert.assertEquals("2642004b", instruction.toHex());
    }

    @Test
    public void test86() {
        String str = "34fe009b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $fp, $a3, 155", instruction.toString());
        Assert.assertEquals("34fe009b", instruction.toHex());
    }

    @Test
    public void test87() {
        String str = "acb90043";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t9, 67($a1)", instruction.toString());
        Assert.assertEquals("acb90043", instruction.toHex());
    }

    @Test
    public void test88() {
        String str = "171b0006";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t8, $k1, 6", instruction.toString());
        Assert.assertEquals("171b0006", instruction.toHex());
    }

    @Test
    public void test89() {
        String str = "17aeffe5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $sp, $t6, -27", instruction.toString());
        Assert.assertEquals("17aeffe5", instruction.toHex());
    }

    @Test
    public void test90() {
        String str = "8d680000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t0, ($t3)", instruction.toString());
        Assert.assertEquals("8d680000", instruction.toHex());
    }

    @Test
    public void test91() {
        String str = "03564024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t0, $k0, $s6", instruction.toString());
        Assert.assertEquals("03564024", instruction.toHex());
    }

    @Test
    public void test92() {
        String str = "255f000d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $ra, $t2, 13", instruction.toString());
        Assert.assertEquals("255f000d", instruction.toHex());
    }

    @Test
    public void test93() {
        String str = "14570097";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $v0, $s7, 151", instruction.toString());
        Assert.assertEquals("14570097", instruction.toHex());
    }

    @Test
    public void test94() {
        String str = "0800001f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 31", instruction.toString());
        Assert.assertEquals("0800001f", instruction.toHex());
    }

    @Test
    public void test95() {
        String str = "302d007d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t5, $at, 125", instruction.toString());
        Assert.assertEquals("302d007d", instruction.toHex());
    }

    @Test
    public void test96() {
        String str = "032d3824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a3, $t9, $t5", instruction.toString());
        Assert.assertEquals("032d3824", instruction.toHex());
    }

    @Test
    public void test97() {
        String str = "01022825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a1, $t0, $v0", instruction.toString());
        Assert.assertEquals("01022825", instruction.toHex());
    }

    @Test
    public void test98() {
        String str = "02108820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s1, $s0, $s0", instruction.toString());
        Assert.assertEquals("02108820", instruction.toHex());
    }

    @Test
    public void test99() {
        String str = "262500ae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $a1, $s1, 174", instruction.toString());
        Assert.assertEquals("262500ae", instruction.toHex());
    }

    @Test
    public void test100() {
        String str = "32a80097";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t0, $s5, 151", instruction.toString());
        Assert.assertEquals("32a80097", instruction.toHex());
    }

    @Test
    public void test101() {
        String str = "130700f2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t8, $a3, 242", instruction.toString());
        Assert.assertEquals("130700f2", instruction.toHex());
    }

    @Test
    public void test102() {
        String str = "369cff08";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $gp, $s4, 65288", instruction.toString());
        Assert.assertEquals("369cff08", instruction.toHex());
    }

    @Test
    public void test103() {
        String str = "08000021";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 33", instruction.toString());
        Assert.assertEquals("08000021", instruction.toHex());
    }

    @Test
    public void test104() {
        String str = "01636025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t4, $t3, $v1", instruction.toString());
        Assert.assertEquals("01636025", instruction.toHex());
    }

    @Test
    public void test105() {
        String str = "8d5e0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $fp, ($t2)", instruction.toString());
        Assert.assertEquals("8d5e0000", instruction.toHex());
    }

    @Test
    public void test106() {
        String str = "02316820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t5, $s1, $s1", instruction.toString());
        Assert.assertEquals("02316820", instruction.toHex());
    }

    @Test
    public void test107() {
        String str = "1052ff95";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $v0, $s2, 65429", instruction.toString());
        Assert.assertEquals("1052ff95", instruction.toHex());
    }

    @Test
    public void test108() {
        String str = "175ffff9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $k0, $ra, -7", instruction.toString());
        Assert.assertEquals("175ffff9", instruction.toHex());
    }

    @Test
    public void test109() {
        String str = "08000075";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 117", instruction.toString());
        Assert.assertEquals("08000075", instruction.toHex());
    }

    @Test
    public void test110() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test111() {
        String str = "028da82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s5, $s4, $t5", instruction.toString());
        Assert.assertEquals("028da82a", instruction.toHex());
    }

    @Test
    public void test112() {
        String str = "0124e820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $sp, $t1, $a0", instruction.toString());
        Assert.assertEquals("0124e820", instruction.toHex());
    }

    @Test
    public void test113() {
        String str = "af46ff40";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a2, -192($k0)", instruction.toString());
        Assert.assertEquals("af46ff40", instruction.toHex());
    }

    @Test
    public void test114() {
        String str = "01cc4822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t1, $t6, $t4", instruction.toString());
        Assert.assertEquals("01cc4822", instruction.toHex());
    }

    @Test
    public void test115() {
        String str = "3055ff78";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s5, $v0, 65400", instruction.toString());
        Assert.assertEquals("3055ff78", instruction.toHex());
    }

    @Test
    public void test116() {
        String str = "3770ffb6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s0, $k1, 65462", instruction.toString());
        Assert.assertEquals("3770ffb6", instruction.toHex());
    }

    @Test
    public void test117() {
        String str = "01106825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t5, $t0, $s0", instruction.toString());
        Assert.assertEquals("01106825", instruction.toHex());
    }

    @Test
    public void test118() {
        String str = "010af820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $ra, $t0, $t2", instruction.toString());
        Assert.assertEquals("010af820", instruction.toHex());
    }

    @Test
    public void test119() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test120() {
        String str = "116b001c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t3, $t3, 28", instruction.toString());
        Assert.assertEquals("116b001c", instruction.toHex());
    }

    @Test
    public void test121() {
        String str = "02ee4820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t1, $s7, $t6", instruction.toString());
        Assert.assertEquals("02ee4820", instruction.toHex());
    }

    @Test
    public void test122() {
        String str = "af630033";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $v1, 51($k1)", instruction.toString());
        Assert.assertEquals("af630033", instruction.toHex());
    }

    @Test
    public void test123() {
        String str = "1746000e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $k0, $a2, 14", instruction.toString());
        Assert.assertEquals("1746000e", instruction.toHex());
    }

    @Test
    public void test124() {
        String str = "1030ffaf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $at, $s0, 65455", instruction.toString());
        Assert.assertEquals("1030ffaf", instruction.toHex());
    }

    @Test
    public void test125() {
        String str = "35ea009f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t2, $t7, 159", instruction.toString());
        Assert.assertEquals("35ea009f", instruction.toHex());
    }

    @Test
    public void test126() {
        String str = "3034003c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s4, $at, 60", instruction.toString());
        Assert.assertEquals("3034003c", instruction.toHex());
    }

    @Test
    public void test127() {
        String str = "00315824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t3, $at, $s1", instruction.toString());
        Assert.assertEquals("00315824", instruction.toHex());
    }

    @Test
    public void test128() {
        String str = "3301ffc1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $at, $t8, 65473", instruction.toString());
        Assert.assertEquals("3301ffc1", instruction.toHex());
    }

    @Test
    public void test129() {
        String str = "01dd9825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s3, $t6, $sp", instruction.toString());
        Assert.assertEquals("01dd9825", instruction.toHex());
    }

    @Test
    public void test130() {
        String str = "117e0016";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t3, $fp, 22", instruction.toString());
        Assert.assertEquals("117e0016", instruction.toHex());
    }

    @Test
    public void test131() {
        String str = "007ed022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $k0, $v1, $fp", instruction.toString());
        Assert.assertEquals("007ed022", instruction.toHex());
    }

    @Test
    public void test132() {
        String str = "080000c4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 196", instruction.toString());
        Assert.assertEquals("080000c4", instruction.toHex());
    }

    @Test
    public void test133() {
        String str = "149a0093";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $a0, $k0, 147", instruction.toString());
        Assert.assertEquals("149a0093", instruction.toHex());
    }

    @Test
    public void test134() {
        String str = "08000028";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 40", instruction.toString());
        Assert.assertEquals("08000028", instruction.toHex());
    }

    @Test
    public void test135() {
        String str = "02566025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t4, $s2, $s6", instruction.toString());
        Assert.assertEquals("02566025", instruction.toHex());
    }

    @Test
    public void test136() {
        String str = "005c8824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s1, $v0, $gp", instruction.toString());
        Assert.assertEquals("005c8824", instruction.toHex());
    }

    @Test
    public void test137() {
        String str = "3209004e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t1, $s0, 78", instruction.toString());
        Assert.assertEquals("3209004e", instruction.toHex());
    }

    @Test
    public void test138() {
        String str = "3277ffd6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s7, $s3, -42", instruction.toString());
        Assert.assertEquals("3277ffd6", instruction.toHex());
    }

    @Test
    public void test139() {
        String str = "03faf825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $ra, $ra, $k0", instruction.toString());
        Assert.assertEquals("03faf825", instruction.toHex());
    }

    @Test
    public void test140() {
        String str = "265b00be";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $k1, $s2, 190", instruction.toString());
        Assert.assertEquals("265b00be", instruction.toHex());
    }

    @Test
    public void test141() {
        String str = "019c3822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $a3, $t4, $gp", instruction.toString());
        Assert.assertEquals("019c3822", instruction.toHex());
    }

    @Test
    public void test142() {
        String str = "02ea8822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s1, $s7, $t2", instruction.toString());
        Assert.assertEquals("02ea8822", instruction.toHex());
    }

    @Test
    public void test143() {
        String str = "019e0025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $zero, $t4, $fp", instruction.toString());
        Assert.assertEquals("019e0025", instruction.toHex());
    }

    @Test
    public void test144() {
        String str = "30500065";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s0, $v0, 101", instruction.toString());
        Assert.assertEquals("30500065", instruction.toHex());
    }

    @Test
    public void test145() {
        String str = "150e0039";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t0, $t6, 57", instruction.toString());
        Assert.assertEquals("150e0039", instruction.toHex());
    }

    @Test
    public void test146() {
        String str = "0310b025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s6, $t8, $s0", instruction.toString());
        Assert.assertEquals("0310b025", instruction.toHex());
    }

    @Test
    public void test147() {
        String str = "00f73024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a2, $a3, $s7", instruction.toString());
        Assert.assertEquals("00f73024", instruction.toHex());
    }

    @Test
    public void test148() {
        String str = "019f382a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $a3, $t4, $ra", instruction.toString());
        Assert.assertEquals("019f382a", instruction.toHex());
    }

    @Test
    public void test149() {
        String str = "ad01ff70";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $at, -144($t0)", instruction.toString());
        Assert.assertEquals("ad01ff70", instruction.toHex());
    }

    @Test
    public void test150() {
        String str = "3c160030";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s6, 48", instruction.toString());
        Assert.assertEquals("3c160030", instruction.toHex());
    }

    @Test
    public void test151() {
        String str = "8c51ff87";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s1, -121($v0)", instruction.toString());
        Assert.assertEquals("8c51ff87", instruction.toHex());
    }

    @Test
    public void test152() {
        String str = "26b3009a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s3, $s5, 154", instruction.toString());
        Assert.assertEquals("26b3009a", instruction.toHex());
    }

    @Test
    public void test153() {
        String str = "26d200fd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s2, $s6, 253", instruction.toString());
        Assert.assertEquals("26d200fd", instruction.toHex());
    }

    @Test
    public void test154() {
        String str = "1542ff77";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t2, $v0, 65399", instruction.toString());
        Assert.assertEquals("1542ff77", instruction.toHex());
    }

    @Test
    public void test155() {
        String str = "3c0c000e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t4, 14", instruction.toString());
        Assert.assertEquals("3c0c000e", instruction.toHex());
    }

    @Test
    public void test156() {
        String str = "02a33024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a2, $s5, $v1", instruction.toString());
        Assert.assertEquals("02a33024", instruction.toHex());
    }

    @Test
    public void test157() {
        String str = "279c00f0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $gp, $gp, 240", instruction.toString());
        Assert.assertEquals("279c00f0", instruction.toHex());
    }

    @Test
    public void test158() {
        String str = "1485000b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $a0, $a1, 11", instruction.toString());
        Assert.assertEquals("1485000b", instruction.toHex());
    }

    @Test
    public void test159() {
        String str = "160d0024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s0, $t5, 36", instruction.toString());
        Assert.assertEquals("160d0024", instruction.toHex());
    }

    @Test
    public void test160() {
        String str = "0015682a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t5, $zero, $s5", instruction.toString());
        Assert.assertEquals("0015682a", instruction.toHex());
    }

    @Test
    public void test161() {
        String str = "8c3000ad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s0, 173($at)", instruction.toString());
        Assert.assertEquals("8c3000ad", instruction.toHex());
    }

    @Test
    public void test162() {
        String str = "02e13020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a2, $s7, $at", instruction.toString());
        Assert.assertEquals("02e13020", instruction.toHex());
    }

    @Test
    public void test163() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test164() {
        String str = "034a9820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s3, $k0, $t2", instruction.toString());
        Assert.assertEquals("034a9820", instruction.toHex());
    }

    @Test
    public void test165() {
        String str = "8faa0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t2, ($sp)", instruction.toString());
        Assert.assertEquals("8faa0000", instruction.toHex());
    }

    @Test
    public void test166() {
        String str = "01936820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t5, $t4, $s3", instruction.toString());
        Assert.assertEquals("01936820", instruction.toHex());
    }

    @Test
    public void test167() {
        String str = "346effa8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t6, $v1, 65448", instruction.toString());
        Assert.assertEquals("346effa8", instruction.toHex());
    }

    @Test
    public void test168() {
        String str = "1669ffe7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s3, $t1, 65511", instruction.toString());
        Assert.assertEquals("1669ffe7", instruction.toHex());
    }

    @Test
    public void test169() {
        String str = "00ade825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $sp, $a1, $t5", instruction.toString());
        Assert.assertEquals("00ade825", instruction.toHex());
    }

    @Test
    public void test170() {
        String str = "080000a8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 168", instruction.toString());
        Assert.assertEquals("080000a8", instruction.toHex());
    }

    @Test
    public void test171() {
        String str = "1415003c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $zero, $s5, 60", instruction.toString());
        Assert.assertEquals("1415003c", instruction.toHex());
    }

    @Test
    public void test172() {
        String str = "0800000d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 13", instruction.toString());
        Assert.assertEquals("0800000d", instruction.toHex());
    }

    @Test
    public void test173() {
        String str = "3410ffe9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s0, $zero, -23", instruction.toString());
        Assert.assertEquals("3410ffe9", instruction.toHex());
    }

    @Test
    public void test174() {
        String str = "01b41025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $v0, $t5, $s4", instruction.toString());
        Assert.assertEquals("01b41025", instruction.toHex());
    }

    @Test
    public void test175() {
        String str = "0800008a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 138", instruction.toString());
        Assert.assertEquals("0800008a", instruction.toHex());
    }

    @Test
    public void test176() {
        String str = "3c160020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s6, 32", instruction.toString());
        Assert.assertEquals("3c160020", instruction.toHex());
    }

    @Test
    public void test177() {
        String str = "080000bf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 191", instruction.toString());
        Assert.assertEquals("080000bf", instruction.toHex());
    }

    @Test
    public void test178() {
        String str = "17f9ff24";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $ra, $t9, 65316", instruction.toString());
        Assert.assertEquals("17f9ff24", instruction.toHex());
    }

    @Test
    public void test179() {
        String str = "ae6dff42";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t5, -190($s3)", instruction.toString());
        Assert.assertEquals("ae6dff42", instruction.toHex());
    }

    @Test
    public void test180() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test181() {
        String str = "080000d8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 216", instruction.toString());
        Assert.assertEquals("080000d8", instruction.toHex());
    }

    @Test
    public void test182() {
        String str = "00dde82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $sp, $a2, $sp", instruction.toString());
        Assert.assertEquals("00dde82a", instruction.toHex());
    }

    @Test
    public void test183() {
        String str = "1441005b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $v0, $at, 91", instruction.toString());
        Assert.assertEquals("1441005b", instruction.toHex());
    }

    @Test
    public void test184() {
        String str = "33ad0046";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t5, $sp, 70", instruction.toString());
        Assert.assertEquals("33ad0046", instruction.toHex());
    }

    @Test
    public void test185() {
        String str = "0133e824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $sp, $t1, $s3", instruction.toString());
        Assert.assertEquals("0133e824", instruction.toHex());
    }

    @Test
    public void test186() {
        String str = "25d800ee";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t8, $t6, 238", instruction.toString());
        Assert.assertEquals("25d800ee", instruction.toHex());
    }

    @Test
    public void test187() {
        String str = "01101020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $v0, $t0, $s0", instruction.toString());
        Assert.assertEquals("01101020", instruction.toHex());
    }

    @Test
    public void test188() {
        String str = "014dc02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t8, $t2, $t5", instruction.toString());
        Assert.assertEquals("014dc02a", instruction.toHex());
    }

    @Test
    public void test189() {
        String str = "8c5e0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $fp, ($v0)", instruction.toString());
        Assert.assertEquals("8c5e0000", instruction.toHex());
    }

    @Test
    public void test190() {
        String str = "119fff21";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t4, $ra, 65313", instruction.toString());
        Assert.assertEquals("119fff21", instruction.toHex());
    }

    @Test
    public void test191() {
        String str = "26990098";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t9, $s4, 152", instruction.toString());
        Assert.assertEquals("26990098", instruction.toHex());
    }

    @Test
    public void test192() {
        String str = "00a58025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s0, $a1, $a1", instruction.toString());
        Assert.assertEquals("00a58025", instruction.toHex());
    }

    @Test
    public void test193() {
        String str = "131e0057";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t8, $fp, 87", instruction.toString());
        Assert.assertEquals("131e0057", instruction.toHex());
    }

    @Test
    public void test194() {
        String str = "32850037";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $a1, $s4, 55", instruction.toString());
        Assert.assertEquals("32850037", instruction.toHex());
    }

    @Test
    public void test195() {
        String str = "3c0d00f0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t5, 240", instruction.toString());
        Assert.assertEquals("3c0d00f0", instruction.toHex());
    }

    @Test
    public void test196() {
        String str = "01e62822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $a1, $t7, $a2", instruction.toString());
        Assert.assertEquals("01e62822", instruction.toHex());
    }

    @Test
    public void test197() {
        String str = "02edb02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s6, $s7, $t5", instruction.toString());
        Assert.assertEquals("02edb02a", instruction.toHex());
    }

    @Test
    public void test198() {
        String str = "039a2025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a0, $gp, $k0", instruction.toString());
        Assert.assertEquals("039a2025", instruction.toHex());
    }

    @Test
    public void test199() {
        String str = "080000e7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 231", instruction.toString());
        Assert.assertEquals("080000e7", instruction.toHex());
    }

    @Test
    public void test200() {
        String str = "0075f825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $ra, $v1, $s5", instruction.toString());
        Assert.assertEquals("0075f825", instruction.toHex());
    }

    @Test
    public void test201() {
        String str = "03363024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a2, $t9, $s6", instruction.toString());
        Assert.assertEquals("03363024", instruction.toHex());
    }

    @Test
    public void test202() {
        String str = "01ef2024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a0, $t7, $t7", instruction.toString());
        Assert.assertEquals("01ef2024", instruction.toHex());
    }

    @Test
    public void test203() {
        String str = "0323f824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $ra, $t9, $v1", instruction.toString());
        Assert.assertEquals("0323f824", instruction.toHex());
    }

    @Test
    public void test204() {
        String str = "33d000f3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s0, $fp, 243", instruction.toString());
        Assert.assertEquals("33d000f3", instruction.toHex());
    }

    @Test
    public void test205() {
        String str = "ac58ff18";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t8, -232($v0)", instruction.toString());
        Assert.assertEquals("ac58ff18", instruction.toHex());
    }

    @Test
    public void test206() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test207() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test208() {
        String str = "12eb0032";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s7, $t3, 50", instruction.toString());
        Assert.assertEquals("12eb0032", instruction.toHex());
    }

    @Test
    public void test209() {
        String str = "00e6602a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t4, $a3, $a2", instruction.toString());
        Assert.assertEquals("00e6602a", instruction.toHex());
    }

    @Test
    public void test210() {
        String str = "0273a025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s4, $s3, $s3", instruction.toString());
        Assert.assertEquals("0273a025", instruction.toHex());
    }

    @Test
    public void test211() {
        String str = "260100fe";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $at, $s0, 254", instruction.toString());
        Assert.assertEquals("260100fe", instruction.toHex());
    }

    @Test
    public void test212() {
        String str = "26ee007b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t6, $s7, 123", instruction.toString());
        Assert.assertEquals("26ee007b", instruction.toHex());
    }

    @Test
    public void test213() {
        String str = "00641024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $v0, $v1, $a0", instruction.toString());
        Assert.assertEquals("00641024", instruction.toHex());
    }

    @Test
    public void test214() {
        String str = "080000a6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 166", instruction.toString());
        Assert.assertEquals("080000a6", instruction.toHex());
    }

    @Test
    public void test215() {
        String str = "0111f020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $fp, $t0, $s1", instruction.toString());
        Assert.assertEquals("0111f020", instruction.toHex());
    }

    @Test
    public void test216() {
        String str = "26b900bb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t9, $s5, 187", instruction.toString());
        Assert.assertEquals("26b900bb", instruction.toHex());
    }

    @Test
    public void test217() {
        String str = "12ba0081";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s5, $k0, 129", instruction.toString());
        Assert.assertEquals("12ba0081", instruction.toHex());
    }

    @Test
    public void test218() {
        String str = "03ba5020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t2, $sp, $k0", instruction.toString());
        Assert.assertEquals("03ba5020", instruction.toHex());
    }

    @Test
    public void test219() {
        String str = "03991820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $v1, $gp, $t9", instruction.toString());
        Assert.assertEquals("03991820", instruction.toHex());
    }

    @Test
    public void test220() {
        String str = "119d005a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t4, $sp, 90", instruction.toString());
        Assert.assertEquals("119d005a", instruction.toHex());
    }

    @Test
    public void test221() {
        String str = "080000e7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 231", instruction.toString());
        Assert.assertEquals("080000e7", instruction.toHex());
    }

    @Test
    public void test222() {
        String str = "ae540000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s4, ($s2)", instruction.toString());
        Assert.assertEquals("ae540000", instruction.toHex());
    }

    @Test
    public void test223() {
        String str = "01f86820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t5, $t7, $t8", instruction.toString());
        Assert.assertEquals("01f86820", instruction.toHex());
    }

    @Test
    public void test224() {
        String str = "266100b4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $at, $s3, 180", instruction.toString());
        Assert.assertEquals("266100b4", instruction.toHex());
    }

    @Test
    public void test225() {
        String str = "3c0f0018";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t7, 24", instruction.toString());
        Assert.assertEquals("3c0f0018", instruction.toHex());
    }

    @Test
    public void test226() {
        String str = "3c110096";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s1, 150", instruction.toString());
        Assert.assertEquals("3c110096", instruction.toHex());
    }

    @Test
    public void test227() {
        String str = "26f40099";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s4, $s7, 153", instruction.toString());
        Assert.assertEquals("26f40099", instruction.toHex());
    }

    @Test
    public void test228() {
        String str = "1614ff35";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s0, $s4, 65333", instruction.toString());
        Assert.assertEquals("1614ff35", instruction.toHex());
    }

    @Test
    public void test229() {
        String str = "105a00d7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $v0, $k0, 215", instruction.toString());
        Assert.assertEquals("105a00d7", instruction.toHex());
    }

    @Test
    public void test230() {
        String str = "134f0038";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $k0, $t7, 56", instruction.toString());
        Assert.assertEquals("134f0038", instruction.toHex());
    }

    @Test
    public void test231() {
        String str = "00b6b022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s6, $a1, $s6", instruction.toString());
        Assert.assertEquals("00b6b022", instruction.toHex());
    }

    @Test
    public void test232() {
        String str = "032ca82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s5, $t9, $t4", instruction.toString());
        Assert.assertEquals("032ca82a", instruction.toHex());
    }

    @Test
    public void test233() {
        String str = "02c58820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s1, $s6, $a1", instruction.toString());
        Assert.assertEquals("02c58820", instruction.toHex());
    }

    @Test
    public void test234() {
        String str = "0168f822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $ra, $t3, $t0", instruction.toString());
        Assert.assertEquals("0168f822", instruction.toHex());
    }

    @Test
    public void test235() {
        String str = "3c1d00bd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $sp, 189", instruction.toString());
        Assert.assertEquals("3c1d00bd", instruction.toHex());
    }

    @Test
    public void test236() {
        String str = "00c11024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $v0, $a2, $at", instruction.toString());
        Assert.assertEquals("00c11024", instruction.toHex());
    }

    @Test
    public void test237() {
        String str = "ad1a0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $k0, ($t0)", instruction.toString());
        Assert.assertEquals("ad1a0000", instruction.toHex());
    }

    @Test
    public void test238() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test239() {
        String str = "00b58022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s0, $a1, $s5", instruction.toString());
        Assert.assertEquals("00b58022", instruction.toHex());
    }

    @Test
    public void test240() {
        String str = "171e00a6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t8, $fp, 166", instruction.toString());
        Assert.assertEquals("171e00a6", instruction.toHex());
    }

    @Test
    public void test241() {
        String str = "15f90055";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t7, $t9, 85", instruction.toString());
        Assert.assertEquals("15f90055", instruction.toHex());
    }

    @Test
    public void test242() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test243() {
        String str = "8ff5ff18";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s5, -232($ra)", instruction.toString());
        Assert.assertEquals("8ff5ff18", instruction.toHex());
    }

    @Test
    public void test244() {
        String str = "129100ba";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s4, $s1, 186", instruction.toString());
        Assert.assertEquals("129100ba", instruction.toHex());
    }

    @Test
    public void test245() {
        String str = "3506ffab";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a2, $t0, -85", instruction.toString());
        Assert.assertEquals("3506ffab", instruction.toHex());
    }

    @Test
    public void test246() {
        String str = "00186025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t4, $zero, $t8", instruction.toString());
        Assert.assertEquals("00186025", instruction.toHex());
    }

    @Test
    public void test247() {
        String str = "138400e9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $gp, $a0, 233", instruction.toString());
        Assert.assertEquals("138400e9", instruction.toHex());
    }

    @Test
    public void test248() {
        String str = "080000d3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 211", instruction.toString());
        Assert.assertEquals("080000d3", instruction.toHex());
    }

    @Test
    public void test249() {
        String str = "8e9900e0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t9, 224($s4)", instruction.toString());
        Assert.assertEquals("8e9900e0", instruction.toHex());
    }

    @Test
    public void test250() {
        String str = "0278682a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t5, $s3, $t8", instruction.toString());
        Assert.assertEquals("0278682a", instruction.toHex());
    }

    @Test
    public void test251() {
        String str = "31230097";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $v1, $t1, 151", instruction.toString());
        Assert.assertEquals("31230097", instruction.toHex());
    }

    @Test
    public void test252() {
        String str = "10d300be";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $a2, $s3, 190", instruction.toString());
        Assert.assertEquals("10d300be", instruction.toHex());
    }

    @Test
    public void test253() {
        String str = "8cb70000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s7, ($a1)", instruction.toString());
        Assert.assertEquals("8cb70000", instruction.toHex());
    }

    @Test
    public void test254() {
        String str = "167dff34";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s3, $sp, -204", instruction.toString());
        Assert.assertEquals("167dff34", instruction.toHex());
    }

    @Test
    public void test255() {
        String str = "3c0f0022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t7, 34", instruction.toString());
        Assert.assertEquals("3c0f0022", instruction.toHex());
    }

    @Test
    public void test256() {
        String str = "03706820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t5, $k1, $s0", instruction.toString());
        Assert.assertEquals("03706820", instruction.toHex());
    }

    @Test
    public void test257() {
        String str = "27b60093";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s6, $sp, 147", instruction.toString());
        Assert.assertEquals("27b60093", instruction.toHex());
    }

    @Test
    public void test258() {
        String str = "0800008c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 140", instruction.toString());
        Assert.assertEquals("0800008c", instruction.toHex());
    }

    @Test
    public void test259() {
        String str = "afaa0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t2, ($sp)", instruction.toString());
        Assert.assertEquals("afaa0000", instruction.toHex());
    }

    @Test
    public void test260() {
        String str = "020e1024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $v0, $s0, $t6", instruction.toString());
        Assert.assertEquals("020e1024", instruction.toHex());
    }

    @Test
    public void test261() {
        String str = "27ab002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t3, $sp, 42", instruction.toString());
        Assert.assertEquals("27ab002a", instruction.toHex());
    }

    @Test
    public void test262() {
        String str = "8ead0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t5, ($s5)", instruction.toString());
        Assert.assertEquals("8ead0000", instruction.toHex());
    }

    @Test
    public void test263() {
        String str = "ad1a0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $k0, ($t0)", instruction.toString());
        Assert.assertEquals("ad1a0000", instruction.toHex());
    }

    @Test
    public void test264() {
        String str = "158fff2c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t4, $t7, 65324", instruction.toString());
        Assert.assertEquals("158fff2c", instruction.toHex());
    }

    @Test
    public void test265() {
        String str = "16da00bd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s6, $k0, 189", instruction.toString());
        Assert.assertEquals("16da00bd", instruction.toHex());
    }

    @Test
    public void test266() {
        String str = "3c160021";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s6, 33", instruction.toString());
        Assert.assertEquals("3c160021", instruction.toHex());
    }

    @Test
    public void test267() {
        String str = "374500ad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a1, $k0, 173", instruction.toString());
        Assert.assertEquals("374500ad", instruction.toHex());
    }

    @Test
    public void test268() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test269() {
        String str = "08000023";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 35", instruction.toString());
        Assert.assertEquals("08000023", instruction.toHex());
    }

    @Test
    public void test270() {
        String str = "01c1b820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s7, $t6, $at", instruction.toString());
        Assert.assertEquals("01c1b820", instruction.toHex());
    }

    @Test
    public void test271() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test272() {
        String str = "3c07005e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a3, 94", instruction.toString());
        Assert.assertEquals("3c07005e", instruction.toHex());
    }

    @Test
    public void test273() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test274() {
        String str = "17b400d5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $sp, $s4, 213", instruction.toString());
        Assert.assertEquals("17b400d5", instruction.toHex());
    }

    @Test
    public void test275() {
        String str = "3c0d0082";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t5, 130", instruction.toString());
        Assert.assertEquals("3c0d0082", instruction.toHex());
    }

    @Test
    public void test276() {
        String str = "249200ea";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s2, $a0, 234", instruction.toString());
        Assert.assertEquals("249200ea", instruction.toHex());
    }

    @Test
    public void test277() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test278() {
        String str = "0195e022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $gp, $t4, $s5", instruction.toString());
        Assert.assertEquals("0195e022", instruction.toHex());
    }

    @Test
    public void test279() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test280() {
        String str = "8f43ffa6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $v1, -90($k0)", instruction.toString());
        Assert.assertEquals("8f43ffa6", instruction.toHex());
    }

    @Test
    public void test281() {
        String str = "01dde824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $sp, $t6, $sp", instruction.toString());
        Assert.assertEquals("01dde824", instruction.toHex());
    }

    @Test
    public void test282() {
        String str = "3c1a003c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $k0, 60", instruction.toString());
        Assert.assertEquals("3c1a003c", instruction.toHex());
    }

    @Test
    public void test283() {
        String str = "0061a025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s4, $v1, $at", instruction.toString());
        Assert.assertEquals("0061a025", instruction.toHex());
    }

    @Test
    public void test284() {
        String str = "ae060000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a2, ($s0)", instruction.toString());
        Assert.assertEquals("ae060000", instruction.toHex());
    }

    @Test
    public void test285() {
        String str = "27b7000d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s7, $sp, 13", instruction.toString());
        Assert.assertEquals("27b7000d", instruction.toHex());
    }

    @Test
    public void test286() {
        String str = "36a900ad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t1, $s5, 173", instruction.toString());
        Assert.assertEquals("36a900ad", instruction.toHex());
    }

    @Test
    public void test287() {
        String str = "1567ffa4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t3, $a3, -92", instruction.toString());
        Assert.assertEquals("1567ffa4", instruction.toHex());
    }

    @Test
    public void test288() {
        String str = "0172d022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $k0, $t3, $s2", instruction.toString());
        Assert.assertEquals("0172d022", instruction.toHex());
    }

    @Test
    public void test289() {
        String str = "252b003d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t3, $t1, 61", instruction.toString());
        Assert.assertEquals("252b003d", instruction.toHex());
    }

    @Test
    public void test290() {
        String str = "3c0b004c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t3, 76", instruction.toString());
        Assert.assertEquals("3c0b004c", instruction.toHex());
    }

    @Test
    public void test291() {
        String str = "3c090018";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t1, 24", instruction.toString());
        Assert.assertEquals("3c090018", instruction.toHex());
    }

    @Test
    public void test292() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test293() {
        String str = "36b5002b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s5, $s5, 43", instruction.toString());
        Assert.assertEquals("36b5002b", instruction.toHex());
    }

    @Test
    public void test294() {
        String str = "03b9a825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s5, $sp, $t9", instruction.toString());
        Assert.assertEquals("03b9a825", instruction.toHex());
    }

    @Test
    public void test295() {
        String str = "ac5eff33";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $fp, -205($v0)", instruction.toString());
        Assert.assertEquals("ac5eff33", instruction.toHex());
    }

    @Test
    public void test296() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test297() {
        String str = "00415020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t2, $v0, $at", instruction.toString());
        Assert.assertEquals("00415020", instruction.toHex());
    }

    @Test
    public void test298() {
        String str = "155a0054";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t2, $k0, 84", instruction.toString());
        Assert.assertEquals("155a0054", instruction.toHex());
    }

    @Test
    public void test299() {
        String str = "03e71824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $v1, $ra, $a3", instruction.toString());
        Assert.assertEquals("03e71824", instruction.toHex());
    }

    @Test
    public void test300() {
        String str = "af64ff5c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a0, -164($k1)", instruction.toString());
        Assert.assertEquals("af64ff5c", instruction.toHex());
    }

    @Test
    public void test301() {
        String str = "149cff84";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $a0, $gp, -124", instruction.toString());
        Assert.assertEquals("149cff84", instruction.toHex());
    }

    @Test
    public void test302() {
        String str = "16a3ffba";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s5, $v1, -70", instruction.toString());
        Assert.assertEquals("16a3ffba", instruction.toHex());
    }

    @Test
    public void test303() {
        String str = "248600e2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $a2, $a0, 226", instruction.toString());
        Assert.assertEquals("248600e2", instruction.toHex());
    }

    @Test
    public void test304() {
        String str = "3c160097";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s6, 151", instruction.toString());
        Assert.assertEquals("3c160097", instruction.toHex());
    }

    @Test
    public void test305() {
        String str = "01350824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $at, $t1, $s5", instruction.toString());
        Assert.assertEquals("01350824", instruction.toHex());
    }

    @Test
    public void test306() {
        String str = "24d60080";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s6, $a2, 128", instruction.toString());
        Assert.assertEquals("24d60080", instruction.toHex());
    }

    @Test
    public void test307() {
        String str = "0100182a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $v1, $t0, $zero", instruction.toString());
        Assert.assertEquals("0100182a", instruction.toHex());
    }

    @Test
    public void test308() {
        String str = "08000053";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 83", instruction.toString());
        Assert.assertEquals("08000053", instruction.toHex());
    }

    @Test
    public void test309() {
        String str = "03f4b025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s6, $ra, $s4", instruction.toString());
        Assert.assertEquals("03f4b025", instruction.toHex());
    }

    @Test
    public void test310() {
        String str = "112dff47";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t1, $t5, -185", instruction.toString());
        Assert.assertEquals("112dff47", instruction.toHex());
    }

    @Test
    public void test311() {
        String str = "120dff65";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s0, $t5, -155", instruction.toString());
        Assert.assertEquals("120dff65", instruction.toHex());
    }

    @Test
    public void test312() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test313() {
        String str = "24bc0068";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $gp, $a1, 104", instruction.toString());
        Assert.assertEquals("24bc0068", instruction.toHex());
    }

    @Test
    public void test314() {
        String str = "0139a02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s4, $t1, $t9", instruction.toString());
        Assert.assertEquals("0139a02a", instruction.toHex());
    }

    @Test
    public void test315() {
        String str = "14e80033";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $a3, $t0, 51", instruction.toString());
        Assert.assertEquals("14e80033", instruction.toHex());
    }

    @Test
    public void test316() {
        String str = "0800009c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 156", instruction.toString());
        Assert.assertEquals("0800009c", instruction.toHex());
    }

    @Test
    public void test317() {
        String str = "01d59825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s3, $t6, $s5", instruction.toString());
        Assert.assertEquals("01d59825", instruction.toHex());
    }

    @Test
    public void test318() {
        String str = "031e0824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $at, $t8, $fp", instruction.toString());
        Assert.assertEquals("031e0824", instruction.toHex());
    }

    @Test
    public void test319() {
        String str = "33bfffc3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $ra, $sp, -61", instruction.toString());
        Assert.assertEquals("33bfffc3", instruction.toHex());
    }

    @Test
    public void test320() {
        String str = "270c007d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t4, $t8, 125", instruction.toString());
        Assert.assertEquals("270c007d", instruction.toHex());
    }

    @Test
    public void test321() {
        String str = "3c0500ab";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a1, 171", instruction.toString());
        Assert.assertEquals("3c0500ab", instruction.toHex());
    }

    @Test
    public void test322() {
        String str = "01da6822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t5, $t6, $k0", instruction.toString());
        Assert.assertEquals("01da6822", instruction.toHex());
    }

    @Test
    public void test323() {
        String str = "02be3825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a3, $s5, $fp", instruction.toString());
        Assert.assertEquals("02be3825", instruction.toHex());
    }

    @Test
    public void test324() {
        String str = "10b7ffc2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $a1, $s7, 65474", instruction.toString());
        Assert.assertEquals("10b7ffc2", instruction.toHex());
    }

    @Test
    public void test325() {
        String str = "019de825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $sp, $t4, $sp", instruction.toString());
        Assert.assertEquals("019de825", instruction.toHex());
    }

    @Test
    public void test326() {
        String str = "08000099";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 153", instruction.toString());
        Assert.assertEquals("08000099", instruction.toHex());
    }

    @Test
    public void test327() {
        String str = "275d0070";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $sp, $k0, 112", instruction.toString());
        Assert.assertEquals("275d0070", instruction.toHex());
    }

    @Test
    public void test328() {
        String str = "31ce008b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t6, $t6, 139", instruction.toString());
        Assert.assertEquals("31ce008b", instruction.toHex());
    }

    @Test
    public void test329() {
        String str = "01acd025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $k0, $t5, $t4", instruction.toString());
        Assert.assertEquals("01acd025", instruction.toHex());
    }

    @Test
    public void test330() {
        String str = "023e2025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a0, $s1, $fp", instruction.toString());
        Assert.assertEquals("023e2025", instruction.toHex());
    }

    @Test
    public void test331() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test332() {
        String str = "01135820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t3, $t0, $s3", instruction.toString());
        Assert.assertEquals("01135820", instruction.toHex());
    }

    @Test
    public void test333() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test334() {
        String str = "27d60014";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s6, $fp, 20", instruction.toString());
        Assert.assertEquals("27d60014", instruction.toHex());
    }

    @Test
    public void test335() {
        String str = "03666820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t5, $k1, $a2", instruction.toString());
        Assert.assertEquals("03666820", instruction.toHex());
    }

    @Test
    public void test336() {
        String str = "1784ff8e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $gp, $a0, -114", instruction.toString());
        Assert.assertEquals("1784ff8e", instruction.toHex());
    }

    @Test
    public void test337() {
        String str = "037b5022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t2, $k1, $k1", instruction.toString());
        Assert.assertEquals("037b5022", instruction.toHex());
    }

    @Test
    public void test338() {
        String str = "08000019";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 25", instruction.toString());
        Assert.assertEquals("08000019", instruction.toHex());
    }

    @Test
    public void test339() {
        String str = "32350031";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s5, $s1, 49", instruction.toString());
        Assert.assertEquals("32350031", instruction.toHex());
    }

    @Test
    public void test340() {
        String str = "00c6b022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s6, $a2, $a2", instruction.toString());
        Assert.assertEquals("00c6b022", instruction.toHex());
    }

    @Test
    public void test341() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test342() {
        String str = "35cbff49";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t3, $t6, -183", instruction.toString());
        Assert.assertEquals("35cbff49", instruction.toHex());
    }

    @Test
    public void test343() {
        String str = "3c0a00e3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t2, 227", instruction.toString());
        Assert.assertEquals("3c0a00e3", instruction.toHex());
    }

    @Test
    public void test344() {
        String str = "024c8022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s0, $s2, $t4", instruction.toString());
        Assert.assertEquals("024c8022", instruction.toHex());
    }

    @Test
    public void test345() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test346() {
        String str = "03277025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t6, $t9, $a3", instruction.toString());
        Assert.assertEquals("03277025", instruction.toHex());
    }

    @Test
    public void test347() {
        String str = "0353a022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s4, $k0, $s3", instruction.toString());
        Assert.assertEquals("0353a022", instruction.toHex());
    }

    @Test
    public void test348() {
        String str = "3c16001b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s6, 27", instruction.toString());
        Assert.assertEquals("3c16001b", instruction.toHex());
    }

    @Test
    public void test349() {
        String str = "37beffc2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $fp, $sp, -62", instruction.toString());
        Assert.assertEquals("37beffc2", instruction.toHex());
    }

    @Test
    public void test350() {
        String str = "272d003d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t5, $t9, 61", instruction.toString());
        Assert.assertEquals("272d003d", instruction.toHex());
    }

    @Test
    public void test351() {
        String str = "0131002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $zero, $t1, $s1", instruction.toString());
        Assert.assertEquals("0131002a", instruction.toHex());
    }

    @Test
    public void test352() {
        String str = "08000029";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 41", instruction.toString());
        Assert.assertEquals("08000029", instruction.toHex());
    }

    @Test
    public void test353() {
        String str = "3c150008";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s5, 8", instruction.toString());
        Assert.assertEquals("3c150008", instruction.toHex());
    }

    @Test
    public void test354() {
        String str = "03b20825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $at, $sp, $s2", instruction.toString());
        Assert.assertEquals("03b20825", instruction.toHex());
    }

    @Test
    public void test355() {
        String str = "3486fff6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a2, $a0, 65526", instruction.toString());
        Assert.assertEquals("3486fff6", instruction.toHex());
    }

    @Test
    public void test356() {
        String str = "32b2ffbb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s2, $s5, -69", instruction.toString());
        Assert.assertEquals("32b2ffbb", instruction.toHex());
    }

    @Test
    public void test357() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test358() {
        String str = "33b9ffdb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t9, $sp, -37", instruction.toString());
        Assert.assertEquals("33b9ffdb", instruction.toHex());
    }

    @Test
    public void test359() {
        String str = "328dfffd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t5, $s4, 65533", instruction.toString());
        Assert.assertEquals("328dfffd", instruction.toHex());
    }

    @Test
    public void test360() {
        String str = "1222ff81";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s1, $v0, 65409", instruction.toString());
        Assert.assertEquals("1222ff81", instruction.toHex());
    }

    @Test
    public void test361() {
        String str = "03bb4020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t0, $sp, $k1", instruction.toString());
        Assert.assertEquals("03bb4020", instruction.toHex());
    }

    @Test
    public void test362() {
        String str = "02acd822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $k1, $s5, $t4", instruction.toString());
        Assert.assertEquals("02acd822", instruction.toHex());
    }

    @Test
    public void test363() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test364() {
        String str = "8da70000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $a3, ($t5)", instruction.toString());
        Assert.assertEquals("8da70000", instruction.toHex());
    }

    @Test
    public void test365() {
        String str = "080000e0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 224", instruction.toString());
        Assert.assertEquals("080000e0", instruction.toHex());
    }

    @Test
    public void test366() {
        String str = "15dfff57";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t6, $ra, 65367", instruction.toString());
        Assert.assertEquals("15dfff57", instruction.toHex());
    }

    @Test
    public void test367() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test368() {
        String str = "01c80822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $at, $t6, $t0", instruction.toString());
        Assert.assertEquals("01c80822", instruction.toHex());
    }

    @Test
    public void test369() {
        String str = "ae7000ef";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s0, 239($s3)", instruction.toString());
        Assert.assertEquals("ae7000ef", instruction.toHex());
    }

    @Test
    public void test370() {
        String str = "08000021";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 33", instruction.toString());
        Assert.assertEquals("08000021", instruction.toHex());
    }

    @Test
    public void test371() {
        String str = "ae3400e0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s4, 224($s1)", instruction.toString());
        Assert.assertEquals("ae3400e0", instruction.toHex());
    }

    @Test
    public void test372() {
        String str = "24e100b0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $at, $a3, 176", instruction.toString());
        Assert.assertEquals("24e100b0", instruction.toHex());
    }

    @Test
    public void test373() {
        String str = "01cf1020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $v0, $t6, $t7", instruction.toString());
        Assert.assertEquals("01cf1020", instruction.toHex());
    }

    @Test
    public void test374() {
        String str = "af84008f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a0, 143($gp)", instruction.toString());
        Assert.assertEquals("af84008f", instruction.toHex());
    }

    @Test
    public void test375() {
        String str = "0800008e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 142", instruction.toString());
        Assert.assertEquals("0800008e", instruction.toHex());
    }

    @Test
    public void test376() {
        String str = "0083f820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $ra, $a0, $v1", instruction.toString());
        Assert.assertEquals("0083f820", instruction.toHex());
    }

    @Test
    public void test377() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test378() {
        String str = "02dfb025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s6, $s6, $ra", instruction.toString());
        Assert.assertEquals("02dfb025", instruction.toHex());
    }

    @Test
    public void test379() {
        String str = "ad350000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s5, ($t1)", instruction.toString());
        Assert.assertEquals("ad350000", instruction.toHex());
    }

    @Test
    public void test380() {
        String str = "01650822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $at, $t3, $a1", instruction.toString());
        Assert.assertEquals("01650822", instruction.toHex());
    }

    @Test
    public void test381() {
        String str = "242a005b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t2, $at, 91", instruction.toString());
        Assert.assertEquals("242a005b", instruction.toHex());
    }

    @Test
    public void test382() {
        String str = "00496820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t5, $v0, $t1", instruction.toString());
        Assert.assertEquals("00496820", instruction.toHex());
    }

    @Test
    public void test383() {
        String str = "01e1682a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t5, $t7, $at", instruction.toString());
        Assert.assertEquals("01e1682a", instruction.toHex());
    }

    @Test
    public void test384() {
        String str = "321900cd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t9, $s0, 205", instruction.toString());
        Assert.assertEquals("321900cd", instruction.toHex());
    }

    @Test
    public void test385() {
        String str = "36eaff37";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t2, $s7, -201", instruction.toString());
        Assert.assertEquals("36eaff37", instruction.toHex());
    }

    @Test
    public void test386() {
        String str = "039fe824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $sp, $gp, $ra", instruction.toString());
        Assert.assertEquals("039fe824", instruction.toHex());
    }

    @Test
    public void test387() {
        String str = "36bb00a5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $k1, $s5, 165", instruction.toString());
        Assert.assertEquals("36bb00a5", instruction.toHex());
    }

    @Test
    public void test388() {
        String str = "ad3c0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $gp, ($t1)", instruction.toString());
        Assert.assertEquals("ad3c0000", instruction.toHex());
    }

    @Test
    public void test389() {
        String str = "15f1ff5a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t7, $s1, 65370", instruction.toString());
        Assert.assertEquals("15f1ff5a", instruction.toHex());
    }

    @Test
    public void test390() {
        String str = "0800001e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 30", instruction.toString());
        Assert.assertEquals("0800001e", instruction.toHex());
    }

    @Test
    public void test391() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test392() {
        String str = "8cccff99";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t4, -103($a2)", instruction.toString());
        Assert.assertEquals("8cccff99", instruction.toHex());
    }

    @Test
    public void test393() {
        String str = "132fff8b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t9, $t7, -117", instruction.toString());
        Assert.assertEquals("132fff8b", instruction.toHex());
    }

    @Test
    public void test394() {
        String str = "318b00f8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t3, $t4, 248", instruction.toString());
        Assert.assertEquals("318b00f8", instruction.toHex());
    }

    @Test
    public void test395() {
        String str = "32540095";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s4, $s2, 149", instruction.toString());
        Assert.assertEquals("32540095", instruction.toHex());
    }

    @Test
    public void test396() {
        String str = "27b6006c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s6, $sp, 108", instruction.toString());
        Assert.assertEquals("27b6006c", instruction.toHex());
    }

    @Test
    public void test397() {
        String str = "245c004e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $gp, $v0, 78", instruction.toString());
        Assert.assertEquals("245c004e", instruction.toHex());
    }

    @Test
    public void test398() {
        String str = "02a5f020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $fp, $s5, $a1", instruction.toString());
        Assert.assertEquals("02a5f020", instruction.toHex());
    }

    @Test
    public void test399() {
        String str = "01d8a02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s4, $t6, $t8", instruction.toString());
        Assert.assertEquals("01d8a02a", instruction.toHex());
    }

    @Test
    public void test400() {
        String str = "3c0700b2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a3, 178", instruction.toString());
        Assert.assertEquals("3c0700b2", instruction.toHex());
    }

    @Test
    public void test401() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test402() {
        String str = "03e2f82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $ra, $ra, $v0", instruction.toString());
        Assert.assertEquals("03e2f82a", instruction.toHex());
    }

    @Test
    public void test403() {
        String str = "10f600c0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $a3, $s6, 192", instruction.toString());
        Assert.assertEquals("10f600c0", instruction.toHex());
    }

    @Test
    public void test404() {
        String str = "ac10007c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s0, 124($zero)", instruction.toString());
        Assert.assertEquals("ac10007c", instruction.toHex());
    }

    @Test
    public void test405() {
        String str = "8dbe0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $fp, ($t5)", instruction.toString());
        Assert.assertEquals("8dbe0000", instruction.toHex());
    }

    @Test
    public void test406() {
        String str = "02cad024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $k0, $s6, $t2", instruction.toString());
        Assert.assertEquals("02cad024", instruction.toHex());
    }

    @Test
    public void test407() {
        String str = "106fffe9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $v1, $t7, 65513", instruction.toString());
        Assert.assertEquals("106fffe9", instruction.toHex());
    }

    @Test
    public void test408() {
        String str = "170500dd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t8, $a1, 221", instruction.toString());
        Assert.assertEquals("170500dd", instruction.toHex());
    }

    @Test
    public void test409() {
        String str = "3c1800bd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t8, 189", instruction.toString());
        Assert.assertEquals("3c1800bd", instruction.toHex());
    }

    @Test
    public void test410() {
        String str = "3254fffa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s4, $s2, 65530", instruction.toString());
        Assert.assertEquals("3254fffa", instruction.toHex());
    }

    @Test
    public void test411() {
        String str = "00be1024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $v0, $a1, $fp", instruction.toString());
        Assert.assertEquals("00be1024", instruction.toHex());
    }

    @Test
    public void test412() {
        String str = "010a6824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t5, $t0, $t2", instruction.toString());
        Assert.assertEquals("010a6824", instruction.toHex());
    }

    @Test
    public void test413() {
        String str = "00792824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a1, $v1, $t9", instruction.toString());
        Assert.assertEquals("00792824", instruction.toHex());
    }

    @Test
    public void test414() {
        String str = "080000ad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 173", instruction.toString());
        Assert.assertEquals("080000ad", instruction.toHex());
    }

    @Test
    public void test415() {
        String str = "8d7cff76";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $gp, -138($t3)", instruction.toString());
        Assert.assertEquals("8d7cff76", instruction.toHex());
    }

    @Test
    public void test416() {
        String str = "36720048";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s2, $s3, 72", instruction.toString());
        Assert.assertEquals("36720048", instruction.toHex());
    }

    @Test
    public void test417() {
        String str = "3c0300f3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $v1, 243", instruction.toString());
        Assert.assertEquals("3c0300f3", instruction.toHex());
    }

    @Test
    public void test418() {
        String str = "36fb00cf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $k1, $s7, 207", instruction.toString());
        Assert.assertEquals("36fb00cf", instruction.toHex());
    }

    @Test
    public void test419() {
        String str = "08000017";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 23", instruction.toString());
        Assert.assertEquals("08000017", instruction.toHex());
    }

    @Test
    public void test420() {
        String str = "029e2020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a0, $s4, $fp", instruction.toString());
        Assert.assertEquals("029e2020", instruction.toHex());
    }

    @Test
    public void test421() {
        String str = "00169024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s2, $zero, $s6", instruction.toString());
        Assert.assertEquals("00169024", instruction.toHex());
    }

    @Test
    public void test422() {
        String str = "34d50067";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s5, $a2, 103", instruction.toString());
        Assert.assertEquals("34d50067", instruction.toHex());
    }

    @Test
    public void test423() {
        String str = "3c1d005b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $sp, 91", instruction.toString());
        Assert.assertEquals("3c1d005b", instruction.toHex());
    }

    @Test
    public void test424() {
        String str = "00b95820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t3, $a1, $t9", instruction.toString());
        Assert.assertEquals("00b95820", instruction.toHex());
    }

    @Test
    public void test425() {
        String str = "16a6ff51";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s5, $a2, 65361", instruction.toString());
        Assert.assertEquals("16a6ff51", instruction.toHex());
    }

    @Test
    public void test426() {
        String str = "0110d825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $k1, $t0, $s0", instruction.toString());
        Assert.assertEquals("0110d825", instruction.toHex());
    }

    @Test
    public void test427() {
        String str = "8f6bff07";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t3, -249($k1)", instruction.toString());
        Assert.assertEquals("8f6bff07", instruction.toHex());
    }

    @Test
    public void test428() {
        String str = "01c68824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s1, $t6, $a2", instruction.toString());
        Assert.assertEquals("01c68824", instruction.toHex());
    }

    @Test
    public void test429() {
        String str = "3c11007b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s1, 123", instruction.toString());
        Assert.assertEquals("3c11007b", instruction.toHex());
    }

    @Test
    public void test430() {
        String str = "00d91020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $v0, $a2, $t9", instruction.toString());
        Assert.assertEquals("00d91020", instruction.toHex());
    }

    @Test
    public void test431() {
        String str = "0243b82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s7, $s2, $v1", instruction.toString());
        Assert.assertEquals("0243b82a", instruction.toHex());
    }

    @Test
    public void test432() {
        String str = "1365ff98";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $k1, $a1, 65432", instruction.toString());
        Assert.assertEquals("1365ff98", instruction.toHex());
    }

    @Test
    public void test433() {
        String str = "00532825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a1, $v0, $s3", instruction.toString());
        Assert.assertEquals("00532825", instruction.toHex());
    }

    @Test
    public void test434() {
        String str = "37740017";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s4, $k1, 23", instruction.toString());
        Assert.assertEquals("37740017", instruction.toHex());
    }

    @Test
    public void test435() {
        String str = "08000005";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 5", instruction.toString());
        Assert.assertEquals("08000005", instruction.toHex());
    }

    @Test
    public void test436() {
        String str = "0800006f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 111", instruction.toString());
        Assert.assertEquals("0800006f", instruction.toHex());
    }

    @Test
    public void test437() {
        String str = "02c38025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s0, $s6, $v1", instruction.toString());
        Assert.assertEquals("02c38025", instruction.toHex());
    }

    @Test
    public void test438() {
        String str = "ad8500c9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a1, 201($t4)", instruction.toString());
        Assert.assertEquals("ad8500c9", instruction.toHex());
    }

    @Test
    public void test439() {
        String str = "0800003b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 59", instruction.toString());
        Assert.assertEquals("0800003b", instruction.toHex());
    }

    @Test
    public void test440() {
        String str = "3128ff6c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t0, $t1, 65388", instruction.toString());
        Assert.assertEquals("3128ff6c", instruction.toHex());
    }

    @Test
    public void test441() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test442() {
        String str = "08000059";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 89", instruction.toString());
        Assert.assertEquals("08000059", instruction.toHex());
    }

    @Test
    public void test443() {
        String str = "00658824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s1, $v1, $a1", instruction.toString());
        Assert.assertEquals("00658824", instruction.toHex());
    }

    @Test
    public void test444() {
        String str = "3c1200bb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s2, 187", instruction.toString());
        Assert.assertEquals("3c1200bb", instruction.toHex());
    }

    @Test
    public void test445() {
        String str = "34c9ff90";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t1, $a2, 65424", instruction.toString());
        Assert.assertEquals("34c9ff90", instruction.toHex());
    }

    @Test
    public void test446() {
        String str = "080000e5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 229", instruction.toString());
        Assert.assertEquals("080000e5", instruction.toHex());
    }

    @Test
    public void test447() {
        String str = "268b00e7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t3, $s4, 231", instruction.toString());
        Assert.assertEquals("268b00e7", instruction.toHex());
    }

    @Test
    public void test448() {
        String str = "31e70008";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $a3, $t7, 8", instruction.toString());
        Assert.assertEquals("31e70008", instruction.toHex());
    }

    @Test
    public void test449() {
        String str = "3565ff34";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a1, $t3, -204", instruction.toString());
        Assert.assertEquals("3565ff34", instruction.toHex());
    }

    @Test
    public void test450() {
        String str = "af120000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s2, ($t8)", instruction.toString());
        Assert.assertEquals("af120000", instruction.toHex());
    }

    @Test
    public void test451() {
        String str = "00936024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t4, $a0, $s3", instruction.toString());
        Assert.assertEquals("00936024", instruction.toHex());
    }

    @Test
    public void test452() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test453() {
        String str = "ac6cff2a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t4, -214($v1)", instruction.toString());
        Assert.assertEquals("ac6cff2a", instruction.toHex());
    }

    @Test
    public void test454() {
        String str = "3c0400b9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a0, 185", instruction.toString());
        Assert.assertEquals("3c0400b9", instruction.toHex());
    }

    @Test
    public void test455() {
        String str = "10920058";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $a0, $s2, 88", instruction.toString());
        Assert.assertEquals("10920058", instruction.toHex());
    }

    @Test
    public void test456() {
        String str = "08000048";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 72", instruction.toString());
        Assert.assertEquals("08000048", instruction.toHex());
    }

    @Test
    public void test457() {
        String str = "3c1400b0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s4, 176", instruction.toString());
        Assert.assertEquals("3c1400b0", instruction.toHex());
    }

    @Test
    public void test458() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test459() {
        String str = "000b0020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $zero, $zero, $t3", instruction.toString());
        Assert.assertEquals("000b0020", instruction.toHex());
    }

    @Test
    public void test460() {
        String str = "3c1600a6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s6, 166", instruction.toString());
        Assert.assertEquals("3c1600a6", instruction.toHex());
    }

    @Test
    public void test461() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test462() {
        String str = "8c6d00dc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t5, 220($v1)", instruction.toString());
        Assert.assertEquals("8c6d00dc", instruction.toHex());
    }

    @Test
    public void test463() {
        String str = "01821825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $v1, $t4, $v0", instruction.toString());
        Assert.assertEquals("01821825", instruction.toHex());
    }

    @Test
    public void test464() {
        String str = "02f15822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t3, $s7, $s1", instruction.toString());
        Assert.assertEquals("02f15822", instruction.toHex());
    }

    @Test
    public void test465() {
        String str = "0800004e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 78", instruction.toString());
        Assert.assertEquals("0800004e", instruction.toHex());
    }

    @Test
    public void test466() {
        String str = "01e60825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $at, $t7, $a2", instruction.toString());
        Assert.assertEquals("01e60825", instruction.toHex());
    }

    @Test
    public void test467() {
        String str = "8c93ffe6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s3, -26($a0)", instruction.toString());
        Assert.assertEquals("8c93ffe6", instruction.toHex());
    }

    @Test
    public void test468() {
        String str = "08000084";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 132", instruction.toString());
        Assert.assertEquals("08000084", instruction.toHex());
    }

    @Test
    public void test469() {
        String str = "00eac020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t8, $a3, $t2", instruction.toString());
        Assert.assertEquals("00eac020", instruction.toHex());
    }

    @Test
    public void test470() {
        String str = "379cff96";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $gp, $gp, -106", instruction.toString());
        Assert.assertEquals("379cff96", instruction.toHex());
    }

    @Test
    public void test471() {
        String str = "275700f8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s7, $k0, 248", instruction.toString());
        Assert.assertEquals("275700f8", instruction.toHex());
    }

    @Test
    public void test472() {
        String str = "0270b825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s7, $s3, $s0", instruction.toString());
        Assert.assertEquals("0270b825", instruction.toHex());
    }

    @Test
    public void test473() {
        String str = "304b001b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t3, $v0, 27", instruction.toString());
        Assert.assertEquals("304b001b", instruction.toHex());
    }

    @Test
    public void test474() {
        String str = "ad360000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s6, ($t1)", instruction.toString());
        Assert.assertEquals("ad360000", instruction.toHex());
    }

    @Test
    public void test475() {
        String str = "36c40000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a0, $s6, 0", instruction.toString());
        Assert.assertEquals("36c40000", instruction.toHex());
    }

    @Test
    public void test476() {
        String str = "143fff84";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $at, $ra, 65412", instruction.toString());
        Assert.assertEquals("143fff84", instruction.toHex());
    }

    @Test
    public void test477() {
        String str = "aef2ffa3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s2, -93($s7)", instruction.toString());
        Assert.assertEquals("aef2ffa3", instruction.toHex());
    }

    @Test
    public void test478() {
        String str = "3785ffd0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a1, $gp, -48", instruction.toString());
        Assert.assertEquals("3785ffd0", instruction.toHex());
    }

    @Test
    public void test479() {
        String str = "08000097";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 151", instruction.toString());
        Assert.assertEquals("08000097", instruction.toHex());
    }

    @Test
    public void test480() {
        String str = "01de2025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a0, $t6, $fp", instruction.toString());
        Assert.assertEquals("01de2025", instruction.toHex());
    }

    @Test
    public void test481() {
        String str = "3c160083";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s6, 131", instruction.toString());
        Assert.assertEquals("3c160083", instruction.toHex());
    }

    @Test
    public void test482() {
        String str = "03764024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t0, $k1, $s6", instruction.toString());
        Assert.assertEquals("03764024", instruction.toHex());
    }

    @Test
    public void test483() {
        String str = "03cb5825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t3, $fp, $t3", instruction.toString());
        Assert.assertEquals("03cb5825", instruction.toHex());
    }

    @Test
    public void test484() {
        String str = "00978024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s0, $a0, $s7", instruction.toString());
        Assert.assertEquals("00978024", instruction.toHex());
    }

    @Test
    public void test485() {
        String str = "00999824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s3, $a0, $t9", instruction.toString());
        Assert.assertEquals("00999824", instruction.toHex());
    }

    @Test
    public void test486() {
        String str = "0170f82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $ra, $t3, $s0", instruction.toString());
        Assert.assertEquals("0170f82a", instruction.toHex());
    }

    @Test
    public void test487() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test488() {
        String str = "01522822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $a1, $t2, $s2", instruction.toString());
        Assert.assertEquals("01522822", instruction.toHex());
    }

    @Test
    public void test489() {
        String str = "1454ff86";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $v0, $s4, 65414", instruction.toString());
        Assert.assertEquals("1454ff86", instruction.toHex());
    }

    @Test
    public void test490() {
        String str = "3c0200ae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $v0, 174", instruction.toString());
        Assert.assertEquals("3c0200ae", instruction.toHex());
    }

    @Test
    public void test491() {
        String str = "3404ffcc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a0, $zero, -52", instruction.toString());
        Assert.assertEquals("3404ffcc", instruction.toHex());
    }

    @Test
    public void test492() {
        String str = "8c3e0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $fp, ($at)", instruction.toString());
        Assert.assertEquals("8c3e0000", instruction.toHex());
    }

    @Test
    public void test493() {
        String str = "009cf02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $fp, $a0, $gp", instruction.toString());
        Assert.assertEquals("009cf02a", instruction.toHex());
    }

    @Test
    public void test494() {
        String str = "00e6582a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t3, $a3, $a2", instruction.toString());
        Assert.assertEquals("00e6582a", instruction.toHex());
    }

    @Test
    public void test495() {
        String str = "ad14007e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s4, 126($t0)", instruction.toString());
        Assert.assertEquals("ad14007e", instruction.toHex());
    }

    @Test
    public void test496() {
        String str = "3c1a0025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $k0, 37", instruction.toString());
        Assert.assertEquals("3c1a0025", instruction.toHex());
    }

    @Test
    public void test497() {
        String str = "8f7bff18";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $k1, -232($k1)", instruction.toString());
        Assert.assertEquals("8f7bff18", instruction.toHex());
    }

    @Test
    public void test498() {
        String str = "3625ff64";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a1, $s1, -156", instruction.toString());
        Assert.assertEquals("3625ff64", instruction.toHex());
    }

    @Test
    public void test499() {
        String str = "080000fa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 250", instruction.toString());
        Assert.assertEquals("080000fa", instruction.toHex());
    }

    @Test
    public void test500() {
        String str = "01466024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t4, $t2, $a2", instruction.toString());
        Assert.assertEquals("01466024", instruction.toHex());
    }

    @Test
    public void test501() {
        String str = "01e8b022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s6, $t7, $t0", instruction.toString());
        Assert.assertEquals("01e8b022", instruction.toHex());
    }

    @Test
    public void test502() {
        String str = "378e0086";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t6, $gp, 134", instruction.toString());
        Assert.assertEquals("378e0086", instruction.toHex());
    }

    @Test
    public void test503() {
        String str = "08000008";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 8", instruction.toString());
        Assert.assertEquals("08000008", instruction.toHex());
    }

    @Test
    public void test504() {
        String str = "3c1600f1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s6, 241", instruction.toString());
        Assert.assertEquals("3c1600f1", instruction.toHex());
    }

    @Test
    public void test505() {
        String str = "0800004d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 77", instruction.toString());
        Assert.assertEquals("0800004d", instruction.toHex());
    }

    @Test
    public void test506() {
        String str = "8d0b0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t3, ($t0)", instruction.toString());
        Assert.assertEquals("8d0b0000", instruction.toHex());
    }

    @Test
    public void test507() {
        String str = "3c0a006d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t2, 109", instruction.toString());
        Assert.assertEquals("3c0a006d", instruction.toHex());
    }

    @Test
    public void test508() {
        String str = "006ea022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s4, $v1, $t6", instruction.toString());
        Assert.assertEquals("006ea022", instruction.toHex());
    }

    @Test
    public void test509() {
        String str = "12790031";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s3, $t9, 49", instruction.toString());
        Assert.assertEquals("12790031", instruction.toHex());
    }

    @Test
    public void test510() {
        String str = "01887022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t6, $t4, $t0", instruction.toString());
        Assert.assertEquals("01887022", instruction.toHex());
    }

    @Test
    public void test511() {
        String str = "16d200a4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s6, $s2, 164", instruction.toString());
        Assert.assertEquals("16d200a4", instruction.toHex());
    }

    @Test
    public void test512() {
        String str = "37a200b3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $v0, $sp, 179", instruction.toString());
        Assert.assertEquals("37a200b3", instruction.toHex());
    }

    @Test
    public void test513() {
        String str = "16e2ffec";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s7, $v0, -20", instruction.toString());
        Assert.assertEquals("16e2ffec", instruction.toHex());
    }

    @Test
    public void test514() {
        String str = "1457ff65";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $v0, $s7, -155", instruction.toString());
        Assert.assertEquals("1457ff65", instruction.toHex());
    }

    @Test
    public void test515() {
        String str = "000d4022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t0, $zero, $t5", instruction.toString());
        Assert.assertEquals("000d4022", instruction.toHex());
    }

    @Test
    public void test516() {
        String str = "00f3b822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s7, $a3, $s3", instruction.toString());
        Assert.assertEquals("00f3b822", instruction.toHex());
    }

    @Test
    public void test517() {
        String str = "3c1100d5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s1, 213", instruction.toString());
        Assert.assertEquals("3c1100d5", instruction.toHex());
    }

    @Test
    public void test518() {
        String str = "2625006c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $a1, $s1, 108", instruction.toString());
        Assert.assertEquals("2625006c", instruction.toHex());
    }

    @Test
    public void test519() {
        String str = "af3f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $ra, ($t9)", instruction.toString());
        Assert.assertEquals("af3f0000", instruction.toHex());
    }

    @Test
    public void test520() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test521() {
        String str = "08000061";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 97", instruction.toString());
        Assert.assertEquals("08000061", instruction.toHex());
    }

    @Test
    public void test522() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test523() {
        String str = "01129020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s2, $t0, $s2", instruction.toString());
        Assert.assertEquals("01129020", instruction.toHex());
    }

    @Test
    public void test524() {
        String str = "0800003c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 60", instruction.toString());
        Assert.assertEquals("0800003c", instruction.toHex());
    }

    @Test
    public void test525() {
        String str = "31960094";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s6, $t4, 148", instruction.toString());
        Assert.assertEquals("31960094", instruction.toHex());
    }

    @Test
    public void test526() {
        String str = "00f5a825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s5, $a3, $s5", instruction.toString());
        Assert.assertEquals("00f5a825", instruction.toHex());
    }

    @Test
    public void test527() {
        String str = "8c34ff6d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s4, -147($at)", instruction.toString());
        Assert.assertEquals("8c34ff6d", instruction.toHex());
    }

    @Test
    public void test528() {
        String str = "019a3024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a2, $t4, $k0", instruction.toString());
        Assert.assertEquals("019a3024", instruction.toHex());
    }

    @Test
    public void test529() {
        String str = "03e77820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t7, $ra, $a3", instruction.toString());
        Assert.assertEquals("03e77820", instruction.toHex());
    }

    @Test
    public void test530() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test531() {
        String str = "8df3ffef";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s3, -17($t7)", instruction.toString());
        Assert.assertEquals("8df3ffef", instruction.toHex());
    }

    @Test
    public void test532() {
        String str = "1235ff2c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s1, $s5, 65324", instruction.toString());
        Assert.assertEquals("1235ff2c", instruction.toHex());
    }

    @Test
    public void test533() {
        String str = "001ca822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s5, $zero, $gp", instruction.toString());
        Assert.assertEquals("001ca822", instruction.toHex());
    }

    @Test
    public void test534() {
        String str = "3c07005b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a3, 91", instruction.toString());
        Assert.assertEquals("3c07005b", instruction.toHex());
    }

    @Test
    public void test535() {
        String str = "ac85ff2f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a1, -209($a0)", instruction.toString());
        Assert.assertEquals("ac85ff2f", instruction.toHex());
    }

    @Test
    public void test536() {
        String str = "3c12008b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s2, 139", instruction.toString());
        Assert.assertEquals("3c12008b", instruction.toHex());
    }

    @Test
    public void test537() {
        String str = "032e1824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $v1, $t9, $t6", instruction.toString());
        Assert.assertEquals("032e1824", instruction.toHex());
    }

    @Test
    public void test538() {
        String str = "0368c820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t9, $k1, $t0", instruction.toString());
        Assert.assertEquals("0368c820", instruction.toHex());
    }

    @Test
    public void test539() {
        String str = "02be982a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s3, $s5, $fp", instruction.toString());
        Assert.assertEquals("02be982a", instruction.toHex());
    }

    @Test
    public void test540() {
        String str = "8fda0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $k0, ($fp)", instruction.toString());
        Assert.assertEquals("8fda0000", instruction.toHex());
    }

    @Test
    public void test541() {
        String str = "36d9ff3a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t9, $s6, -198", instruction.toString());
        Assert.assertEquals("36d9ff3a", instruction.toHex());
    }

    @Test
    public void test542() {
        String str = "080000ec";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 236", instruction.toString());
        Assert.assertEquals("080000ec", instruction.toHex());
    }

    @Test
    public void test543() {
        String str = "1176ffb2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t3, $s6, -78", instruction.toString());
        Assert.assertEquals("1176ffb2", instruction.toHex());
    }

    @Test
    public void test544() {
        String str = "acc900d9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t1, 217($a2)", instruction.toString());
        Assert.assertEquals("acc900d9", instruction.toHex());
    }

    @Test
    public void test545() {
        String str = "14e3ffc4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $a3, $v1, -60", instruction.toString());
        Assert.assertEquals("14e3ffc4", instruction.toHex());
    }

    @Test
    public void test546() {
        String str = "26b5004a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s5, $s5, 74", instruction.toString());
        Assert.assertEquals("26b5004a", instruction.toHex());
    }

    @Test
    public void test547() {
        String str = "acfd0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $sp, ($a3)", instruction.toString());
        Assert.assertEquals("acfd0000", instruction.toHex());
    }

    @Test
    public void test548() {
        String str = "022f5025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t2, $s1, $t7", instruction.toString());
        Assert.assertEquals("022f5025", instruction.toHex());
    }

    @Test
    public void test549() {
        String str = "08000031";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 49", instruction.toString());
        Assert.assertEquals("08000031", instruction.toHex());
    }

    @Test
    public void test550() {
        String str = "007f8025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s0, $v1, $ra", instruction.toString());
        Assert.assertEquals("007f8025", instruction.toHex());
    }

    @Test
    public void test551() {
        String str = "3c0b0008";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t3, 8", instruction.toString());
        Assert.assertEquals("3c0b0008", instruction.toHex());
    }

    @Test
    public void test552() {
        String str = "363100f6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s1, $s1, 246", instruction.toString());
        Assert.assertEquals("363100f6", instruction.toHex());
    }

    @Test
    public void test553() {
        String str = "008b9824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s3, $a0, $t3", instruction.toString());
        Assert.assertEquals("008b9824", instruction.toHex());
    }

    @Test
    public void test554() {
        String str = "00e3d02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $k0, $a3, $v1", instruction.toString());
        Assert.assertEquals("00e3d02a", instruction.toHex());
    }

    @Test
    public void test555() {
        String str = "0373d024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $k0, $k1, $s3", instruction.toString());
        Assert.assertEquals("0373d024", instruction.toHex());
    }

    @Test
    public void test556() {
        String str = "ac8400e7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a0, 231($a0)", instruction.toString());
        Assert.assertEquals("ac8400e7", instruction.toHex());
    }

    @Test
    public void test557() {
        String str = "02e7a82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s5, $s7, $a3", instruction.toString());
        Assert.assertEquals("02e7a82a", instruction.toHex());
    }

    @Test
    public void test558() {
        String str = "33ea00e9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t2, $ra, 233", instruction.toString());
        Assert.assertEquals("33ea00e9", instruction.toHex());
    }

    @Test
    public void test559() {
        String str = "370c005b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t4, $t8, 91", instruction.toString());
        Assert.assertEquals("370c005b", instruction.toHex());
    }

    @Test
    public void test560() {
        String str = "34b4ff29";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s4, $a1, -215", instruction.toString());
        Assert.assertEquals("34b4ff29", instruction.toHex());
    }

    @Test
    public void test561() {
        String str = "25be005f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $fp, $t5, 95", instruction.toString());
        Assert.assertEquals("25be005f", instruction.toHex());
    }

    @Test
    public void test562() {
        String str = "012ff024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $fp, $t1, $t7", instruction.toString());
        Assert.assertEquals("012ff024", instruction.toHex());
    }

    @Test
    public void test563() {
        String str = "ad8d0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t5, ($t4)", instruction.toString());
        Assert.assertEquals("ad8d0000", instruction.toHex());
    }

    @Test
    public void test564() {
        String str = "3237ff9d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s7, $s1, -99", instruction.toString());
        Assert.assertEquals("3237ff9d", instruction.toHex());
    }

    @Test
    public void test565() {
        String str = "011dc022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t8, $t0, $sp", instruction.toString());
        Assert.assertEquals("011dc022", instruction.toHex());
    }

    @Test
    public void test566() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test567() {
        String str = "24fa00d2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $k0, $a3, 210", instruction.toString());
        Assert.assertEquals("24fa00d2", instruction.toHex());
    }

    @Test
    public void test568() {
        String str = "3181000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $at, $t4, 12", instruction.toString());
        Assert.assertEquals("3181000c", instruction.toHex());
    }

    @Test
    public void test569() {
        String str = "00642020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a0, $v1, $a0", instruction.toString());
        Assert.assertEquals("00642020", instruction.toHex());
    }

    @Test
    public void test570() {
        String str = "34bc00a6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $gp, $a1, 166", instruction.toString());
        Assert.assertEquals("34bc00a6", instruction.toHex());
    }

    @Test
    public void test571() {
        String str = "003c9822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s3, $at, $gp", instruction.toString());
        Assert.assertEquals("003c9822", instruction.toHex());
    }

    @Test
    public void test572() {
        String str = "36acff00";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t4, $s5, -256", instruction.toString());
        Assert.assertEquals("36acff00", instruction.toHex());
    }

    @Test
    public void test573() {
        String str = "ae760000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s6, ($s3)", instruction.toString());
        Assert.assertEquals("ae760000", instruction.toHex());
    }

    @Test
    public void test574() {
        String str = "13a800a7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $sp, $t0, 167", instruction.toString());
        Assert.assertEquals("13a800a7", instruction.toHex());
    }

    @Test
    public void test575() {
        String str = "08000026";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 38", instruction.toString());
        Assert.assertEquals("08000026", instruction.toHex());
    }

    @Test
    public void test576() {
        String str = "addd0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $sp, ($t6)", instruction.toString());
        Assert.assertEquals("addd0000", instruction.toHex());
    }

    @Test
    public void test577() {
        String str = "1607ff12";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s0, $a3, -238", instruction.toString());
        Assert.assertEquals("1607ff12", instruction.toHex());
    }

    @Test
    public void test578() {
        String str = "0300b024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s6, $t8, $zero", instruction.toString());
        Assert.assertEquals("0300b024", instruction.toHex());
    }

    @Test
    public void test579() {
        String str = "024e3825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a3, $s2, $t6", instruction.toString());
        Assert.assertEquals("024e3825", instruction.toHex());
    }

    @Test
    public void test580() {
        String str = "247400a4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s4, $v1, 164", instruction.toString());
        Assert.assertEquals("247400a4", instruction.toHex());
    }

    @Test
    public void test581() {
        String str = "24d2002d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s2, $a2, 45", instruction.toString());
        Assert.assertEquals("24d2002d", instruction.toHex());
    }

    @Test
    public void test582() {
        String str = "af67005e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a3, 94($k1)", instruction.toString());
        Assert.assertEquals("af67005e", instruction.toHex());
    }

    @Test
    public void test583() {
        String str = "0007902a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s2, $zero, $a3", instruction.toString());
        Assert.assertEquals("0007902a", instruction.toHex());
    }

    @Test
    public void test584() {
        String str = "36dbff90";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $k1, $s6, -112", instruction.toString());
        Assert.assertEquals("36dbff90", instruction.toHex());
    }

    @Test
    public void test585() {
        String str = "13feffa9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $ra, $fp, 65449", instruction.toString());
        Assert.assertEquals("13feffa9", instruction.toHex());
    }

    @Test
    public void test586() {
        String str = "37bd008b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $sp, $sp, 139", instruction.toString());
        Assert.assertEquals("37bd008b", instruction.toHex());
    }

    @Test
    public void test587() {
        String str = "0299c820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t9, $s4, $t9", instruction.toString());
        Assert.assertEquals("0299c820", instruction.toHex());
    }

    @Test
    public void test588() {
        String str = "342200c5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $v0, $at, 197", instruction.toString());
        Assert.assertEquals("342200c5", instruction.toHex());
    }

    @Test
    public void test589() {
        String str = "100b00df";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $zero, $t3, 223", instruction.toString());
        Assert.assertEquals("100b00df", instruction.toHex());
    }

    @Test
    public void test590() {
        String str = "15acffbd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t5, $t4, 65469", instruction.toString());
        Assert.assertEquals("15acffbd", instruction.toHex());
    }

    @Test
    public void test591() {
        String str = "08000049";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 73", instruction.toString());
        Assert.assertEquals("08000049", instruction.toHex());
    }

    @Test
    public void test592() {
        String str = "00002024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a0, $zero, $zero", instruction.toString());
        Assert.assertEquals("00002024", instruction.toHex());
    }

    @Test
    public void test593() {
        String str = "8da30000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $v1, ($t5)", instruction.toString());
        Assert.assertEquals("8da30000", instruction.toHex());
    }

    @Test
    public void test594() {
        String str = "02622825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a1, $s3, $v0", instruction.toString());
        Assert.assertEquals("02622825", instruction.toHex());
    }

    @Test
    public void test595() {
        String str = "3609ff02";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t1, $s0, -254", instruction.toString());
        Assert.assertEquals("3609ff02", instruction.toHex());
    }

    @Test
    public void test596() {
        String str = "352c004a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t4, $t1, 74", instruction.toString());
        Assert.assertEquals("352c004a", instruction.toHex());
    }

    @Test
    public void test597() {
        String str = "8c0a0008";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t2, 8($zero)", instruction.toString());
        Assert.assertEquals("8c0a0008", instruction.toHex());
    }

    @Test
    public void test598() {
        String str = "00cb7022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t6, $a2, $t3", instruction.toString());
        Assert.assertEquals("00cb7022", instruction.toHex());
    }

    @Test
    public void test599() {
        String str = "3502ffb8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $v0, $t0, 65464", instruction.toString());
        Assert.assertEquals("3502ffb8", instruction.toHex());
    }

    @Test
    public void test600() {
        String str = "8d370081";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s7, 129($t1)", instruction.toString());
        Assert.assertEquals("8d370081", instruction.toHex());
    }

    @Test
    public void test601() {
        String str = "24100057";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s0, $zero, 87", instruction.toString());
        Assert.assertEquals("24100057", instruction.toHex());
    }

    @Test
    public void test602() {
        String str = "3c1400c4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s4, 196", instruction.toString());
        Assert.assertEquals("3c1400c4", instruction.toHex());
    }

    @Test
    public void test603() {
        String str = "27f8008c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t8, $ra, 140", instruction.toString());
        Assert.assertEquals("27f8008c", instruction.toHex());
    }

    @Test
    public void test604() {
        String str = "3565ffdc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a1, $t3, 65500", instruction.toString());
        Assert.assertEquals("3565ffdc", instruction.toHex());
    }

    @Test
    public void test605() {
        String str = "3c1e0054";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $fp, 84", instruction.toString());
        Assert.assertEquals("3c1e0054", instruction.toHex());
    }

    @Test
    public void test606() {
        String str = "0034d820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $k1, $at, $s4", instruction.toString());
        Assert.assertEquals("0034d820", instruction.toHex());
    }

    @Test
    public void test607() {
        String str = "3598ffd9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t8, $t4, -39", instruction.toString());
        Assert.assertEquals("3598ffd9", instruction.toHex());
    }

    @Test
    public void test608() {
        String str = "af190029";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t9, 41($t8)", instruction.toString());
        Assert.assertEquals("af190029", instruction.toHex());
    }

    @Test
    public void test609() {
        String str = "013c6822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t5, $t1, $gp", instruction.toString());
        Assert.assertEquals("013c6822", instruction.toHex());
    }

    @Test
    public void test610() {
        String str = "080000b1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 177", instruction.toString());
        Assert.assertEquals("080000b1", instruction.toHex());
    }

    @Test
    public void test611() {
        String str = "3705ff07";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a1, $t8, 65287", instruction.toString());
        Assert.assertEquals("3705ff07", instruction.toHex());
    }

    @Test
    public void test612() {
        String str = "3c060088";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a2, 136", instruction.toString());
        Assert.assertEquals("3c060088", instruction.toHex());
    }

    @Test
    public void test613() {
        String str = "01071824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $v1, $t0, $a3", instruction.toString());
        Assert.assertEquals("01071824", instruction.toHex());
    }

    @Test
    public void test614() {
        String str = "274d007f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t5, $k0, 127", instruction.toString());
        Assert.assertEquals("274d007f", instruction.toHex());
    }

    @Test
    public void test615() {
        String str = "8c0d0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t5, ($zero)", instruction.toString());
        Assert.assertEquals("8c0d0000", instruction.toHex());
    }

    @Test
    public void test616() {
        String str = "af1f0061";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $ra, 97($t8)", instruction.toString());
        Assert.assertEquals("af1f0061", instruction.toHex());
    }

    @Test
    public void test617() {
        String str = "32e1ffdc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $at, $s7, -36", instruction.toString());
        Assert.assertEquals("32e1ffdc", instruction.toHex());
    }

    @Test
    public void test618() {
        String str = "003a6825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t5, $at, $k0", instruction.toString());
        Assert.assertEquals("003a6825", instruction.toHex());
    }

    @Test
    public void test619() {
        String str = "305fff60";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $ra, $v0, 65376", instruction.toString());
        Assert.assertEquals("305fff60", instruction.toHex());
    }

    @Test
    public void test620() {
        String str = "10c2ff87";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $a2, $v0, 65415", instruction.toString());
        Assert.assertEquals("10c2ff87", instruction.toHex());
    }

    @Test
    public void test621() {
        String str = "8cdc0032";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $gp, 50($a2)", instruction.toString());
        Assert.assertEquals("8cdc0032", instruction.toHex());
    }

    @Test
    public void test622() {
        String str = "0800007e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 126", instruction.toString());
        Assert.assertEquals("0800007e", instruction.toHex());
    }

    @Test
    public void test623() {
        String str = "020e2820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a1, $s0, $t6", instruction.toString());
        Assert.assertEquals("020e2820", instruction.toHex());
    }

    @Test
    public void test624() {
        String str = "253d001c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $sp, $t1, 28", instruction.toString());
        Assert.assertEquals("253d001c", instruction.toHex());
    }

    @Test
    public void test625() {
        String str = "3c1b00fa";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $k1, 250", instruction.toString());
        Assert.assertEquals("3c1b00fa", instruction.toHex());
    }

    @Test
    public void test626() {
        String str = "080000b8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 184", instruction.toString());
        Assert.assertEquals("080000b8", instruction.toHex());
    }

    @Test
    public void test627() {
        String str = "08000093";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 147", instruction.toString());
        Assert.assertEquals("08000093", instruction.toHex());
    }

    @Test
    public void test628() {
        String str = "029a1020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $v0, $s4, $k0", instruction.toString());
        Assert.assertEquals("029a1020", instruction.toHex());
    }

    @Test
    public void test629() {
        String str = "011d8025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s0, $t0, $sp", instruction.toString());
        Assert.assertEquals("011d8025", instruction.toHex());
    }

    @Test
    public void test630() {
        String str = "17c70087";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $fp, $a3, 135", instruction.toString());
        Assert.assertEquals("17c70087", instruction.toHex());
    }

    @Test
    public void test631() {
        String str = "ad950000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s5, ($t4)", instruction.toString());
        Assert.assertEquals("ad950000", instruction.toHex());
    }

    @Test
    public void test632() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test633() {
        String str = "00b52025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a0, $a1, $s5", instruction.toString());
        Assert.assertEquals("00b52025", instruction.toHex());
    }

    @Test
    public void test634() {
        String str = "31dbff4b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $k1, $t6, 65355", instruction.toString());
        Assert.assertEquals("31dbff4b", instruction.toHex());
    }

    @Test
    public void test635() {
        String str = "3c1900d7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t9, 215", instruction.toString());
        Assert.assertEquals("3c1900d7", instruction.toHex());
    }

    @Test
    public void test636() {
        String str = "8e7b0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $k1, ($s3)", instruction.toString());
        Assert.assertEquals("8e7b0000", instruction.toHex());
    }

    @Test
    public void test637() {
        String str = "255900fb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t9, $t2, 251", instruction.toString());
        Assert.assertEquals("255900fb", instruction.toHex());
    }

    @Test
    public void test638() {
        String str = "ac3f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $ra, ($at)", instruction.toString());
        Assert.assertEquals("ac3f0000", instruction.toHex());
    }

    @Test
    public void test639() {
        String str = "080000ad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 173", instruction.toString());
        Assert.assertEquals("080000ad", instruction.toHex());
    }

    @Test
    public void test640() {
        String str = "0120e02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $gp, $t1, $zero", instruction.toString());
        Assert.assertEquals("0120e02a", instruction.toHex());
    }

    @Test
    public void test641() {
        String str = "ac2f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t7, ($at)", instruction.toString());
        Assert.assertEquals("ac2f0000", instruction.toHex());
    }

    @Test
    public void test642() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test643() {
        String str = "3c070072";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a3, 114", instruction.toString());
        Assert.assertEquals("3c070072", instruction.toHex());
    }

    @Test
    public void test644() {
        String str = "00de9820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s3, $a2, $fp", instruction.toString());
        Assert.assertEquals("00de9820", instruction.toHex());
    }

    @Test
    public void test645() {
        String str = "01d20025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $zero, $t6, $s2", instruction.toString());
        Assert.assertEquals("01d20025", instruction.toHex());
    }

    @Test
    public void test646() {
        String str = "002f382a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $a3, $at, $t7", instruction.toString());
        Assert.assertEquals("002f382a", instruction.toHex());
    }

    @Test
    public void test647() {
        String str = "1128ff1d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t1, $t0, 65309", instruction.toString());
        Assert.assertEquals("1128ff1d", instruction.toHex());
    }

    @Test
    public void test648() {
        String str = "08000043";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 67", instruction.toString());
        Assert.assertEquals("08000043", instruction.toHex());
    }

    @Test
    public void test649() {
        String str = "1061004a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $v1, $at, 74", instruction.toString());
        Assert.assertEquals("1061004a", instruction.toHex());
    }

    @Test
    public void test650() {
        String str = "02d1282a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $a1, $s6, $s1", instruction.toString());
        Assert.assertEquals("02d1282a", instruction.toHex());
    }

    @Test
    public void test651() {
        String str = "8ec20000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $v0, ($s6)", instruction.toString());
        Assert.assertEquals("8ec20000", instruction.toHex());
    }

    @Test
    public void test652() {
        String str = "340700e3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a3, $zero, 227", instruction.toString());
        Assert.assertEquals("340700e3", instruction.toHex());
    }

    @Test
    public void test653() {
        String str = "16abff63";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s5, $t3, -157", instruction.toString());
        Assert.assertEquals("16abff63", instruction.toHex());
    }

    @Test
    public void test654() {
        String str = "080000b9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 185", instruction.toString());
        Assert.assertEquals("080000b9", instruction.toHex());
    }

    @Test
    public void test655() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test656() {
        String str = "8f63ff26";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $v1, -218($k1)", instruction.toString());
        Assert.assertEquals("8f63ff26", instruction.toHex());
    }

    @Test
    public void test657() {
        String str = "260b003c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t3, $s0, 60", instruction.toString());
        Assert.assertEquals("260b003c", instruction.toHex());
    }

    @Test
    public void test658() {
        String str = "2623001b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $v1, $s1, 27", instruction.toString());
        Assert.assertEquals("2623001b", instruction.toHex());
    }

    @Test
    public void test659() {
        String str = "02023020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a2, $s0, $v0", instruction.toString());
        Assert.assertEquals("02023020", instruction.toHex());
    }

    @Test
    public void test660() {
        String str = "00dd4022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t0, $a2, $sp", instruction.toString());
        Assert.assertEquals("00dd4022", instruction.toHex());
    }

    @Test
    public void test661() {
        String str = "0227a024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $s4, $s1, $a3", instruction.toString());
        Assert.assertEquals("0227a024", instruction.toHex());
    }

    @Test
    public void test662() {
        String str = "36d60024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s6, $s6, 36", instruction.toString());
        Assert.assertEquals("36d60024", instruction.toHex());
    }

    @Test
    public void test663() {
        String str = "25fd0004";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $sp, $t7, 4", instruction.toString());
        Assert.assertEquals("25fd0004", instruction.toHex());
    }

    @Test
    public void test664() {
        String str = "30f6ff99";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s6, $a3, 65433", instruction.toString());
        Assert.assertEquals("30f6ff99", instruction.toHex());
    }

    @Test
    public void test665() {
        String str = "32190094";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t9, $s0, 148", instruction.toString());
        Assert.assertEquals("32190094", instruction.toHex());
    }

    @Test
    public void test666() {
        String str = "08000021";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 33", instruction.toString());
        Assert.assertEquals("08000021", instruction.toHex());
    }

    @Test
    public void test667() {
        String str = "01782024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a0, $t3, $t8", instruction.toString());
        Assert.assertEquals("01782024", instruction.toHex());
    }

    @Test
    public void test668() {
        String str = "01ca5825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t3, $t6, $t2", instruction.toString());
        Assert.assertEquals("01ca5825", instruction.toHex());
    }

    @Test
    public void test669() {
        String str = "01e1e020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $gp, $t7, $at", instruction.toString());
        Assert.assertEquals("01e1e020", instruction.toHex());
    }

    @Test
    public void test670() {
        String str = "af7f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $ra, ($k1)", instruction.toString());
        Assert.assertEquals("af7f0000", instruction.toHex());
    }

    @Test
    public void test671() {
        String str = "258b002f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t3, $t4, 47", instruction.toString());
        Assert.assertEquals("258b002f", instruction.toHex());
    }

    @Test
    public void test672() {
        String str = "01f6b820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s7, $t7, $s6", instruction.toString());
        Assert.assertEquals("01f6b820", instruction.toHex());
    }

    @Test
    public void test673() {
        String str = "242e00f6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t6, $at, 246", instruction.toString());
        Assert.assertEquals("242e00f6", instruction.toHex());
    }

    @Test
    public void test674() {
        String str = "ace6004c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a2, 76($a3)", instruction.toString());
        Assert.assertEquals("ace6004c", instruction.toHex());
    }

    @Test
    public void test675() {
        String str = "241800af";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t8, $zero, 175", instruction.toString());
        Assert.assertEquals("241800af", instruction.toHex());
    }

    @Test
    public void test676() {
        String str = "3c1e006d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $fp, 109", instruction.toString());
        Assert.assertEquals("3c1e006d", instruction.toHex());
    }

    @Test
    public void test677() {
        String str = "00fa4024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t0, $a3, $k0", instruction.toString());
        Assert.assertEquals("00fa4024", instruction.toHex());
    }

    @Test
    public void test678() {
        String str = "02e58825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s1, $s7, $a1", instruction.toString());
        Assert.assertEquals("02e58825", instruction.toHex());
    }

    @Test
    public void test679() {
        String str = "080000dc";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 220", instruction.toString());
        Assert.assertEquals("080000dc", instruction.toHex());
    }

    @Test
    public void test680() {
        String str = "244b00a7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t3, $v0, 167", instruction.toString());
        Assert.assertEquals("244b00a7", instruction.toHex());
    }

    @Test
    public void test681() {
        String str = "00ae6020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t4, $a1, $t6", instruction.toString());
        Assert.assertEquals("00ae6020", instruction.toHex());
    }

    @Test
    public void test682() {
        String str = "02a8b820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s7, $s5, $t0", instruction.toString());
        Assert.assertEquals("02a8b820", instruction.toHex());
    }

    @Test
    public void test683() {
        String str = "3c0400a3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a0, 163", instruction.toString());
        Assert.assertEquals("3c0400a3", instruction.toHex());
    }

    @Test
    public void test684() {
        String str = "017bd822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $k1, $t3, $k1", instruction.toString());
        Assert.assertEquals("017bd822", instruction.toHex());
    }

    @Test
    public void test685() {
        String str = "019b9820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s3, $t4, $k1", instruction.toString());
        Assert.assertEquals("019b9820", instruction.toHex());
    }

    @Test
    public void test686() {
        String str = "8f5f0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $ra, ($k0)", instruction.toString());
        Assert.assertEquals("8f5f0000", instruction.toHex());
    }

    @Test
    public void test687() {
        String str = "1721ffad";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t9, $at, 65453", instruction.toString());
        Assert.assertEquals("1721ffad", instruction.toHex());
    }

    @Test
    public void test688() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test689() {
        String str = "8c84ff19";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $a0, -231($a0)", instruction.toString());
        Assert.assertEquals("8c84ff19", instruction.toHex());
    }

    @Test
    public void test690() {
        String str = "00200822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $at, $at, $zero", instruction.toString());
        Assert.assertEquals("00200822", instruction.toHex());
    }

    @Test
    public void test691() {
        String str = "242b005a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t3, $at, 90", instruction.toString());
        Assert.assertEquals("242b005a", instruction.toHex());
    }

    @Test
    public void test692() {
        String str = "ace200a9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $v0, 169($a3)", instruction.toString());
        Assert.assertEquals("ace200a9", instruction.toHex());
    }

    @Test
    public void test693() {
        String str = "1319fffe";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t8, $t9, 65534", instruction.toString());
        Assert.assertEquals("1319fffe", instruction.toHex());
    }

    @Test
    public void test694() {
        String str = "244b0075";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t3, $v0, 117", instruction.toString());
        Assert.assertEquals("244b0075", instruction.toHex());
    }

    @Test
    public void test695() {
        String str = "02bca822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s5, $s5, $gp", instruction.toString());
        Assert.assertEquals("02bca822", instruction.toHex());
    }

    @Test
    public void test696() {
        String str = "00e1e82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $sp, $a3, $at", instruction.toString());
        Assert.assertEquals("00e1e82a", instruction.toHex());
    }

    @Test
    public void test697() {
        String str = "0357a022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s4, $k0, $s7", instruction.toString());
        Assert.assertEquals("0357a022", instruction.toHex());
    }

    @Test
    public void test698() {
        String str = "3378ff20";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t8, $k1, 65312", instruction.toString());
        Assert.assertEquals("3378ff20", instruction.toHex());
    }

    @Test
    public void test699() {
        String str = "af830000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $v1, ($gp)", instruction.toString());
        Assert.assertEquals("af830000", instruction.toHex());
    }

    @Test
    public void test700() {
        String str = "01fac020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t8, $t7, $k0", instruction.toString());
        Assert.assertEquals("01fac020", instruction.toHex());
    }

    @Test
    public void test701() {
        String str = "3c1400de";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s4, 222", instruction.toString());
        Assert.assertEquals("3c1400de", instruction.toHex());
    }

    @Test
    public void test702() {
        String str = "03a3a820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s5, $sp, $v1", instruction.toString());
        Assert.assertEquals("03a3a820", instruction.toHex());
    }

    @Test
    public void test703() {
        String str = "01fd1024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $v0, $t7, $sp", instruction.toString());
        Assert.assertEquals("01fd1024", instruction.toHex());
    }

    @Test
    public void test704() {
        String str = "02083824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a3, $s0, $t0", instruction.toString());
        Assert.assertEquals("02083824", instruction.toHex());
    }

    @Test
    public void test705() {
        String str = "080000ed";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 237", instruction.toString());
        Assert.assertEquals("080000ed", instruction.toHex());
    }

    @Test
    public void test706() {
        String str = "25c60018";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $a2, $t6, 24", instruction.toString());
        Assert.assertEquals("25c60018", instruction.toHex());
    }

    @Test
    public void test707() {
        String str = "1278008d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s3, $t8, 141", instruction.toString());
        Assert.assertEquals("1278008d", instruction.toHex());
    }

    @Test
    public void test708() {
        String str = "af01ff34";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $at, -204($t8)", instruction.toString());
        Assert.assertEquals("af01ff34", instruction.toHex());
    }

    @Test
    public void test709() {
        String str = "03353020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a2, $t9, $s5", instruction.toString());
        Assert.assertEquals("03353020", instruction.toHex());
    }

    @Test
    public void test710() {
        String str = "080000e1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 225", instruction.toString());
        Assert.assertEquals("080000e1", instruction.toHex());
    }

    @Test
    public void test711() {
        String str = "01af2022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $a0, $t5, $t7", instruction.toString());
        Assert.assertEquals("01af2022", instruction.toHex());
    }

    @Test
    public void test712() {
        String str = "12b60067";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s5, $s6, 103", instruction.toString());
        Assert.assertEquals("12b60067", instruction.toHex());
    }

    @Test
    public void test713() {
        String str = "080000e3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 227", instruction.toString());
        Assert.assertEquals("080000e3", instruction.toHex());
    }

    @Test
    public void test714() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test715() {
        String str = "138bffc7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $gp, $t3, 65479", instruction.toString());
        Assert.assertEquals("138bffc7", instruction.toHex());
    }

    @Test
    public void test716() {
        String str = "01d8682a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t5, $t6, $t8", instruction.toString());
        Assert.assertEquals("01d8682a", instruction.toHex());
    }

    @Test
    public void test717() {
        String str = "3698ff33";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t8, $s4, -205", instruction.toString());
        Assert.assertEquals("3698ff33", instruction.toHex());
    }

    @Test
    public void test718() {
        String str = "3c1f0013";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $ra, 19", instruction.toString());
        Assert.assertEquals("3c1f0013", instruction.toHex());
    }

    @Test
    public void test719() {
        String str = "01fc2025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a0, $t7, $gp", instruction.toString());
        Assert.assertEquals("01fc2025", instruction.toHex());
    }

    @Test
    public void test720() {
        String str = "0254b820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s7, $s2, $s4", instruction.toString());
        Assert.assertEquals("0254b820", instruction.toHex());
    }

    @Test
    public void test721() {
        String str = "01e26824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t5, $t7, $v0", instruction.toString());
        Assert.assertEquals("01e26824", instruction.toHex());
    }

    @Test
    public void test722() {
        String str = "8ccd0022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t5, 34($a2)", instruction.toString());
        Assert.assertEquals("8ccd0022", instruction.toHex());
    }

    @Test
    public void test723() {
        String str = "12ab006d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s5, $t3, 109", instruction.toString());
        Assert.assertEquals("12ab006d", instruction.toHex());
    }

    @Test
    public void test724() {
        String str = "02fef024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $fp, $s7, $fp", instruction.toString());
        Assert.assertEquals("02fef024", instruction.toHex());
    }

    @Test
    public void test725() {
        String str = "0800000f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 15", instruction.toString());
        Assert.assertEquals("0800000f", instruction.toHex());
    }

    @Test
    public void test726() {
        String str = "8e4c0045";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t4, 69($s2)", instruction.toString());
        Assert.assertEquals("8e4c0045", instruction.toHex());
    }

    @Test
    public void test727() {
        String str = "8edb0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $k1, ($s6)", instruction.toString());
        Assert.assertEquals("8edb0000", instruction.toHex());
    }

    @Test
    public void test728() {
        String str = "0080f820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $ra, $a0, $zero", instruction.toString());
        Assert.assertEquals("0080f820", instruction.toHex());
    }

    @Test
    public void test729() {
        String str = "34ab0060";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t3, $a1, 96", instruction.toString());
        Assert.assertEquals("34ab0060", instruction.toHex());
    }

    @Test
    public void test730() {
        String str = "01970824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $at, $t4, $s7", instruction.toString());
        Assert.assertEquals("01970824", instruction.toHex());
    }

    @Test
    public void test731() {
        String str = "0033a020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s4, $at, $s3", instruction.toString());
        Assert.assertEquals("0033a020", instruction.toHex());
    }

    @Test
    public void test732() {
        String str = "26f100c7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s1, $s7, 199", instruction.toString());
        Assert.assertEquals("26f100c7", instruction.toHex());
    }

    @Test
    public void test733() {
        String str = "1485004f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $a0, $a1, 79", instruction.toString());
        Assert.assertEquals("1485004f", instruction.toHex());
    }

    @Test
    public void test734() {
        String str = "027ad025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $k0, $s3, $k0", instruction.toString());
        Assert.assertEquals("027ad025", instruction.toHex());
    }

    @Test
    public void test735() {
        String str = "03311020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $v0, $t9, $s1", instruction.toString());
        Assert.assertEquals("03311020", instruction.toHex());
    }

    @Test
    public void test736() {
        String str = "17b2ff2a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $sp, $s2, -214", instruction.toString());
        Assert.assertEquals("17b2ff2a", instruction.toHex());
    }

    @Test
    public void test737() {
        String str = "11e9ff0d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t7, $t1, 65293", instruction.toString());
        Assert.assertEquals("11e9ff0d", instruction.toHex());
    }

    @Test
    public void test738() {
        String str = "01521022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $v0, $t2, $s2", instruction.toString());
        Assert.assertEquals("01521022", instruction.toHex());
    }

    @Test
    public void test739() {
        String str = "0223682a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t5, $s1, $v1", instruction.toString());
        Assert.assertEquals("0223682a", instruction.toHex());
    }

    @Test
    public void test740() {
        String str = "3c090058";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t1, 88", instruction.toString());
        Assert.assertEquals("3c090058", instruction.toHex());
    }

    @Test
    public void test741() {
        String str = "27c300c7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $v1, $fp, 199", instruction.toString());
        Assert.assertEquals("27c300c7", instruction.toHex());
    }

    @Test
    public void test742() {
        String str = "250e0042";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t6, $t0, 66", instruction.toString());
        Assert.assertEquals("250e0042", instruction.toHex());
    }

    @Test
    public void test743() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test744() {
        String str = "102a0022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $at, $t2, 34", instruction.toString());
        Assert.assertEquals("102a0022", instruction.toHex());
    }

    @Test
    public void test745() {
        String str = "af0000af";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $zero, 175($t8)", instruction.toString());
        Assert.assertEquals("af0000af", instruction.toHex());
    }

    @Test
    public void test746() {
        String str = "0279e82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $sp, $s3, $t9", instruction.toString());
        Assert.assertEquals("0279e82a", instruction.toHex());
    }

    @Test
    public void test747() {
        String str = "acb3ff06";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s3, -250($a1)", instruction.toString());
        Assert.assertEquals("acb3ff06", instruction.toHex());
    }

    @Test
    public void test748() {
        String str = "0033d82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $k1, $at, $s3", instruction.toString());
        Assert.assertEquals("0033d82a", instruction.toHex());
    }

    @Test
    public void test749() {
        String str = "00e4902a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s2, $a3, $a0", instruction.toString());
        Assert.assertEquals("00e4902a", instruction.toHex());
    }

    @Test
    public void test750() {
        String str = "159a003e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t4, $k0, 62", instruction.toString());
        Assert.assertEquals("159a003e", instruction.toHex());
    }

    @Test
    public void test751() {
        String str = "311b005c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $k1, $t0, 92", instruction.toString());
        Assert.assertEquals("311b005c", instruction.toHex());
    }

    @Test
    public void test752() {
        String str = "15c2fff9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t6, $v0, 65529", instruction.toString());
        Assert.assertEquals("15c2fff9", instruction.toHex());
    }

    @Test
    public void test753() {
        String str = "00a90825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $at, $a1, $t1", instruction.toString());
        Assert.assertEquals("00a90825", instruction.toHex());
    }

    @Test
    public void test754() {
        String str = "ac6a0045";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t2, 69($v1)", instruction.toString());
        Assert.assertEquals("ac6a0045", instruction.toHex());
    }

    @Test
    public void test755() {
        String str = "37affff5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $t7, $sp, 65525", instruction.toString());
        Assert.assertEquals("37affff5", instruction.toHex());
    }

    @Test
    public void test756() {
        String str = "3031ffc9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s1, $at, 65481", instruction.toString());
        Assert.assertEquals("3031ffc9", instruction.toHex());
    }

    @Test
    public void test757() {
        String str = "133500da";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t9, $s5, 218", instruction.toString());
        Assert.assertEquals("133500da", instruction.toHex());
    }

    @Test
    public void test758() {
        String str = "16b90061";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s5, $t9, 97", instruction.toString());
        Assert.assertEquals("16b90061", instruction.toHex());
    }

    @Test
    public void test759() {
        String str = "8c560000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s6, ($v0)", instruction.toString());
        Assert.assertEquals("8c560000", instruction.toHex());
    }

    @Test
    public void test760() {
        String str = "0316202a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $a0, $t8, $s6", instruction.toString());
        Assert.assertEquals("0316202a", instruction.toHex());
    }

    @Test
    public void test761() {
        String str = "020d002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $zero, $s0, $t5", instruction.toString());
        Assert.assertEquals("020d002a", instruction.toHex());
    }

    @Test
    public void test762() {
        String str = "014b9825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s3, $t2, $t3", instruction.toString());
        Assert.assertEquals("014b9825", instruction.toHex());
    }

    @Test
    public void test763() {
        String str = "00063822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $a3, $zero, $a2", instruction.toString());
        Assert.assertEquals("00063822", instruction.toHex());
    }

    @Test
    public void test764() {
        String str = "acd80000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t8, ($a2)", instruction.toString());
        Assert.assertEquals("acd80000", instruction.toHex());
    }

    @Test
    public void test765() {
        String str = "080000d7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 215", instruction.toString());
        Assert.assertEquals("080000d7", instruction.toHex());
    }

    @Test
    public void test766() {
        String str = "32c9fff4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t1, $s6, 65524", instruction.toString());
        Assert.assertEquals("32c9fff4", instruction.toHex());
    }

    @Test
    public void test767() {
        String str = "ad7fffdb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $ra, -37($t3)", instruction.toString());
        Assert.assertEquals("ad7fffdb", instruction.toHex());
    }

    @Test
    public void test768() {
        String str = "01a99025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s2, $t5, $t1", instruction.toString());
        Assert.assertEquals("01a99025", instruction.toHex());
    }

    @Test
    public void test769() {
        String str = "ac070000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a3, ($zero)", instruction.toString());
        Assert.assertEquals("ac070000", instruction.toHex());
    }

    @Test
    public void test770() {
        String str = "017fd022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $k0, $t3, $ra", instruction.toString());
        Assert.assertEquals("017fd022", instruction.toHex());
    }

    @Test
    public void test771() {
        String str = "0176b825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s7, $t3, $s6", instruction.toString());
        Assert.assertEquals("0176b825", instruction.toHex());
    }

    @Test
    public void test772() {
        String str = "15df00ae";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t6, $ra, 174", instruction.toString());
        Assert.assertEquals("15df00ae", instruction.toHex());
    }

    @Test
    public void test773() {
        String str = "033a9825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s3, $t9, $k0", instruction.toString());
        Assert.assertEquals("033a9825", instruction.toHex());
    }

    @Test
    public void test774() {
        String str = "17b2ffed";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $sp, $s2, 65517", instruction.toString());
        Assert.assertEquals("17b2ffed", instruction.toHex());
    }

    @Test
    public void test775() {
        String str = "25d20029";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s2, $t6, 41", instruction.toString());
        Assert.assertEquals("25d20029", instruction.toHex());
    }

    @Test
    public void test776() {
        String str = "329bff26";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $k1, $s4, -218", instruction.toString());
        Assert.assertEquals("329bff26", instruction.toHex());
    }

    @Test
    public void test777() {
        String str = "27dc00b1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $gp, $fp, 177", instruction.toString());
        Assert.assertEquals("27dc00b1", instruction.toHex());
    }

    @Test
    public void test778() {
        String str = "acc00000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $zero, ($a2)", instruction.toString());
        Assert.assertEquals("acc00000", instruction.toHex());
    }

    @Test
    public void test779() {
        String str = "8cb30000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s3, ($a1)", instruction.toString());
        Assert.assertEquals("8cb30000", instruction.toHex());
    }

    @Test
    public void test780() {
        String str = "ad670000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a3, ($t3)", instruction.toString());
        Assert.assertEquals("ad670000", instruction.toHex());
    }

    @Test
    public void test781() {
        String str = "3c010080";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $at, 128", instruction.toString());
        Assert.assertEquals("3c010080", instruction.toHex());
    }

    @Test
    public void test782() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test783() {
        String str = "03727822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t7, $k1, $s2", instruction.toString());
        Assert.assertEquals("03727822", instruction.toHex());
    }

    @Test
    public void test784() {
        String str = "174f006f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $k0, $t7, 111", instruction.toString());
        Assert.assertEquals("174f006f", instruction.toHex());
    }

    @Test
    public void test785() {
        String str = "3c1a0094";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $k0, 148", instruction.toString());
        Assert.assertEquals("3c1a0094", instruction.toHex());
    }

    @Test
    public void test786() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test787() {
        String str = "0315982a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s3, $t8, $s5", instruction.toString());
        Assert.assertEquals("0315982a", instruction.toHex());
    }

    @Test
    public void test788() {
        String str = "13eb0002";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $ra, $t3, 2", instruction.toString());
        Assert.assertEquals("13eb0002", instruction.toHex());
    }

    @Test
    public void test789() {
        String str = "103b00d1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $at, $k1, 209", instruction.toString());
        Assert.assertEquals("103b00d1", instruction.toHex());
    }

    @Test
    public void test790() {
        String str = "8c3b0000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $k1, ($at)", instruction.toString());
        Assert.assertEquals("8c3b0000", instruction.toHex());
    }

    @Test
    public void test791() {
        String str = "03564024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t0, $k0, $s6", instruction.toString());
        Assert.assertEquals("03564024", instruction.toHex());
    }

    @Test
    public void test792() {
        String str = "31a8001b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t0, $t5, 27", instruction.toString());
        Assert.assertEquals("31a8001b", instruction.toHex());
    }

    @Test
    public void test793() {
        String str = "3c1900b1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t9, 177", instruction.toString());
        Assert.assertEquals("3c1900b1", instruction.toHex());
    }

    @Test
    public void test794() {
        String str = "0208e825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $sp, $s0, $t0", instruction.toString());
        Assert.assertEquals("0208e825", instruction.toHex());
    }

    @Test
    public void test795() {
        String str = "25ec0095";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t4, $t7, 149", instruction.toString());
        Assert.assertEquals("25ec0095", instruction.toHex());
    }

    @Test
    public void test796() {
        String str = "0327c824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t9, $t9, $a3", instruction.toString());
        Assert.assertEquals("0327c824", instruction.toHex());
    }

    @Test
    public void test797() {
        String str = "03189022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s2, $t8, $t8", instruction.toString());
        Assert.assertEquals("03189022", instruction.toHex());
    }

    @Test
    public void test798() {
        String str = "334b003e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t3, $k0, 62", instruction.toString());
        Assert.assertEquals("334b003e", instruction.toHex());
    }

    @Test
    public void test799() {
        String str = "168c0010";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s4, $t4, 16", instruction.toString());
        Assert.assertEquals("168c0010", instruction.toHex());
    }

    @Test
    public void test800() {
        String str = "3c0f009c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t7, 156", instruction.toString());
        Assert.assertEquals("3c0f009c", instruction.toHex());
    }

    @Test
    public void test801() {
        String str = "13fbffde";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $ra, $k1, -34", instruction.toString());
        Assert.assertEquals("13fbffde", instruction.toHex());
    }

    @Test
    public void test802() {
        String str = "32a500b2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $a1, $s5, 178", instruction.toString());
        Assert.assertEquals("32a500b2", instruction.toHex());
    }

    @Test
    public void test803() {
        String str = "031f5024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t2, $t8, $ra", instruction.toString());
        Assert.assertEquals("031f5024", instruction.toHex());
    }

    @Test
    public void test804() {
        String str = "3c0200ac";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $v0, 172", instruction.toString());
        Assert.assertEquals("3c0200ac", instruction.toHex());
    }

    @Test
    public void test805() {
        String str = "ac740000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s4, ($v1)", instruction.toString());
        Assert.assertEquals("ac740000", instruction.toHex());
    }

    @Test
    public void test806() {
        String str = "8dfe008b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $fp, 139($t7)", instruction.toString());
        Assert.assertEquals("8dfe008b", instruction.toHex());
    }

    @Test
    public void test807() {
        String str = "0337a825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s5, $t9, $s7", instruction.toString());
        Assert.assertEquals("0337a825", instruction.toHex());
    }

    @Test
    public void test808() {
        String str = "080000cf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 207", instruction.toString());
        Assert.assertEquals("080000cf", instruction.toHex());
    }

    @Test
    public void test809() {
        String str = "af430000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $v1, ($k0)", instruction.toString());
        Assert.assertEquals("af430000", instruction.toHex());
    }

    @Test
    public void test810() {
        String str = "8d1aff49";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $k0, -183($t0)", instruction.toString());
        Assert.assertEquals("8d1aff49", instruction.toHex());
    }

    @Test
    public void test811() {
        String str = "13e4ff19";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $ra, $a0, -231", instruction.toString());
        Assert.assertEquals("13e4ff19", instruction.toHex());
    }

    @Test
    public void test812() {
        String str = "0120a020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s4, $t1, $zero", instruction.toString());
        Assert.assertEquals("0120a020", instruction.toHex());
    }

    @Test
    public void test813() {
        String str = "369affb5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $k0, $s4, -75", instruction.toString());
        Assert.assertEquals("369affb5", instruction.toHex());
    }

    @Test
    public void test814() {
        String str = "136b00c0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $k1, $t3, 192", instruction.toString());
        Assert.assertEquals("136b00c0", instruction.toHex());
    }

    @Test
    public void test815() {
        String str = "02ec7022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t6, $s7, $t4", instruction.toString());
        Assert.assertEquals("02ec7022", instruction.toHex());
    }

    @Test
    public void test816() {
        String str = "1339005b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t9, $t9, 91", instruction.toString());
        Assert.assertEquals("1339005b", instruction.toHex());
    }

    @Test
    public void test817() {
        String str = "01875024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t2, $t4, $a3", instruction.toString());
        Assert.assertEquals("01875024", instruction.toHex());
    }

    @Test
    public void test818() {
        String str = "1286ff4c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s4, $a2, 65356", instruction.toString());
        Assert.assertEquals("1286ff4c", instruction.toHex());
    }

    @Test
    public void test819() {
        String str = "03cee025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $gp, $fp, $t6", instruction.toString());
        Assert.assertEquals("03cee025", instruction.toHex());
    }

    @Test
    public void test820() {
        String str = "37040093";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a0, $t8, 147", instruction.toString());
        Assert.assertEquals("37040093", instruction.toHex());
    }

    @Test
    public void test821() {
        String str = "0217f020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $fp, $s0, $s7", instruction.toString());
        Assert.assertEquals("0217f020", instruction.toHex());
    }

    @Test
    public void test822() {
        String str = "af74ff55";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s4, -171($k1)", instruction.toString());
        Assert.assertEquals("af74ff55", instruction.toHex());
    }

    @Test
    public void test823() {
        String str = "00a01822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $v1, $a1, $zero", instruction.toString());
        Assert.assertEquals("00a01822", instruction.toHex());
    }

    @Test
    public void test824() {
        String str = "8c170000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $s7, ($zero)", instruction.toString());
        Assert.assertEquals("8c170000", instruction.toHex());
    }

    @Test
    public void test825() {
        String str = "3c0100b6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $at, 182", instruction.toString());
        Assert.assertEquals("3c0100b6", instruction.toHex());
    }

    @Test
    public void test826() {
        String str = "1559ffa6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t2, $t9, 65446", instruction.toString());
        Assert.assertEquals("1559ffa6", instruction.toHex());
    }

    @Test
    public void test827() {
        String str = "02b49020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s2, $s5, $s4", instruction.toString());
        Assert.assertEquals("02b49020", instruction.toHex());
    }

    @Test
    public void test828() {
        String str = "08000036";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 54", instruction.toString());
        Assert.assertEquals("08000036", instruction.toHex());
    }

    @Test
    public void test829() {
        String str = "3c1a00e6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $k0, 230", instruction.toString());
        Assert.assertEquals("3c1a00e6", instruction.toHex());
    }

    @Test
    public void test830() {
        String str = "02d81825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $v1, $s6, $t8", instruction.toString());
        Assert.assertEquals("02d81825", instruction.toHex());
    }

    @Test
    public void test831() {
        String str = "0292d025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $k0, $s4, $s2", instruction.toString());
        Assert.assertEquals("0292d025", instruction.toHex());
    }

    @Test
    public void test832() {
        String str = "03dd7820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t7, $fp, $sp", instruction.toString());
        Assert.assertEquals("03dd7820", instruction.toHex());
    }

    @Test
    public void test833() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test834() {
        String str = "3c0a007a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $t2, 122", instruction.toString());
        Assert.assertEquals("3c0a007a", instruction.toHex());
    }

    @Test
    public void test835() {
        String str = "164dff57";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s2, $t5, 65367", instruction.toString());
        Assert.assertEquals("164dff57", instruction.toHex());
    }

    @Test
    public void test836() {
        String str = "00ed0020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $zero, $a3, $t5", instruction.toString());
        Assert.assertEquals("00ed0020", instruction.toHex());
    }

    @Test
    public void test837() {
        String str = "02074824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t1, $s0, $a3", instruction.toString());
        Assert.assertEquals("02074824", instruction.toHex());
    }

    @Test
    public void test838() {
        String str = "ac710000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s1, ($v1)", instruction.toString());
        Assert.assertEquals("ac710000", instruction.toHex());
    }

    @Test
    public void test839() {
        String str = "019cb82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s7, $t4, $gp", instruction.toString());
        Assert.assertEquals("019cb82a", instruction.toHex());
    }

    @Test
    public void test840() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test841() {
        String str = "8ef80000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t8, ($s7)", instruction.toString());
        Assert.assertEquals("8ef80000", instruction.toHex());
    }

    @Test
    public void test842() {
        String str = "afb50000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s5, ($sp)", instruction.toString());
        Assert.assertEquals("afb50000", instruction.toHex());
    }

    @Test
    public void test843() {
        String str = "002a2824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a1, $at, $t2", instruction.toString());
        Assert.assertEquals("002a2824", instruction.toHex());
    }

    @Test
    public void test844() {
        String str = "032d2824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $a1, $t9, $t5", instruction.toString());
        Assert.assertEquals("032d2824", instruction.toHex());
    }

    @Test
    public void test845() {
        String str = "0309e024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $gp, $t8, $t1", instruction.toString());
        Assert.assertEquals("0309e024", instruction.toHex());
    }

    @Test
    public void test846() {
        String str = "0800006a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 106", instruction.toString());
        Assert.assertEquals("0800006a", instruction.toHex());
    }

    @Test
    public void test847() {
        String str = "241f00f3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $ra, $zero, 243", instruction.toString());
        Assert.assertEquals("241f00f3", instruction.toHex());
    }

    @Test
    public void test848() {
        String str = "111c00b6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t0, $gp, 182", instruction.toString());
        Assert.assertEquals("111c00b6", instruction.toHex());
    }

    @Test
    public void test849() {
        String str = "32aeff20";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t6, $s5, 65312", instruction.toString());
        Assert.assertEquals("32aeff20", instruction.toHex());
    }

    @Test
    public void test850() {
        String str = "01bd402a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $t0, $t5, $sp", instruction.toString());
        Assert.assertEquals("01bd402a", instruction.toHex());
    }

    @Test
    public void test851() {
        String str = "02c54025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t0, $s6, $a1", instruction.toString());
        Assert.assertEquals("02c54025", instruction.toHex());
    }

    @Test
    public void test852() {
        String str = "3443ff62";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $v1, $v0, -158", instruction.toString());
        Assert.assertEquals("3443ff62", instruction.toHex());
    }

    @Test
    public void test853() {
        String str = "00fe982a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s3, $a3, $fp", instruction.toString());
        Assert.assertEquals("00fe982a", instruction.toHex());
    }

    @Test
    public void test854() {
        String str = "8c060000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $a2, ($zero)", instruction.toString());
        Assert.assertEquals("8c060000", instruction.toHex());
    }

    @Test
    public void test855() {
        String str = "02c3f024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $fp, $s6, $v1", instruction.toString());
        Assert.assertEquals("02c3f024", instruction.toHex());
    }

    @Test
    public void test856() {
        String str = "0800006a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 106", instruction.toString());
        Assert.assertEquals("0800006a", instruction.toHex());
    }

    @Test
    public void test857() {
        String str = "aef00000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s0, ($s7)", instruction.toString());
        Assert.assertEquals("aef00000", instruction.toHex());
    }

    @Test
    public void test858() {
        String str = "155cff37";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t2, $gp, 65335", instruction.toString());
        Assert.assertEquals("155cff37", instruction.toHex());
    }

    @Test
    public void test859() {
        String str = "00f25822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t3, $a3, $s2", instruction.toString());
        Assert.assertEquals("00f25822", instruction.toHex());
    }

    @Test
    public void test860() {
        String str = "036b5825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t3, $k1, $t3", instruction.toString());
        Assert.assertEquals("036b5825", instruction.toHex());
    }

    @Test
    public void test861() {
        String str = "35d40034";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $s4, $t6, 52", instruction.toString());
        Assert.assertEquals("35d40034", instruction.toHex());
    }

    @Test
    public void test862() {
        String str = "3c03007a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $v1, 122", instruction.toString());
        Assert.assertEquals("3c03007a", instruction.toHex());
    }

    @Test
    public void test863() {
        String str = "ae450000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $a1, ($s2)", instruction.toString());
        Assert.assertEquals("ae450000", instruction.toHex());
    }

    @Test
    public void test864() {
        String str = "1151ffe6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t2, $s1, -26", instruction.toString());
        Assert.assertEquals("1151ffe6", instruction.toHex());
    }

    @Test
    public void test865() {
        String str = "ac310000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s1, ($at)", instruction.toString());
        Assert.assertEquals("ac310000", instruction.toHex());
    }

    @Test
    public void test866() {
        String str = "8e210000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $at, ($s1)", instruction.toString());
        Assert.assertEquals("8e210000", instruction.toHex());
    }

    @Test
    public void test867() {
        String str = "3c0300f0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $v1, 240", instruction.toString());
        Assert.assertEquals("3c0300f0", instruction.toHex());
    }

    @Test
    public void test868() {
        String str = "8f620000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $v0, ($k1)", instruction.toString());
        Assert.assertEquals("8f620000", instruction.toHex());
    }

    @Test
    public void test869() {
        String str = "3c040084";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $a0, 132", instruction.toString());
        Assert.assertEquals("3c040084", instruction.toHex());
    }

    @Test
    public void test870() {
        String str = "0183f820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $ra, $t4, $v1", instruction.toString());
        Assert.assertEquals("0183f820", instruction.toHex());
    }

    @Test
    public void test871() {
        String str = "118bff0b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t4, $t3, -245", instruction.toString());
        Assert.assertEquals("118bff0b", instruction.toHex());
    }

    @Test
    public void test872() {
        String str = "01e45024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t2, $t7, $a0", instruction.toString());
        Assert.assertEquals("01e45024", instruction.toHex());
    }

    @Test
    public void test873() {
        String str = "ae390000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t9, ($s1)", instruction.toString());
        Assert.assertEquals("ae390000", instruction.toHex());
    }

    @Test
    public void test874() {
        String str = "138c00de";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $gp, $t4, 222", instruction.toString());
        Assert.assertEquals("138c00de", instruction.toHex());
    }

    @Test
    public void test875() {
        String str = "307d0086";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $sp, $v1, 134", instruction.toString());
        Assert.assertEquals("307d0086", instruction.toHex());
    }

    @Test
    public void test876() {
        String str = "005fc020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $t8, $v0, $ra", instruction.toString());
        Assert.assertEquals("005fc020", instruction.toHex());
    }

    @Test
    public void test877() {
        String str = "02aff02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $fp, $s5, $t7", instruction.toString());
        Assert.assertEquals("02aff02a", instruction.toHex());
    }

    @Test
    public void test878() {
        String str = "24710063";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s1, $v1, 99", instruction.toString());
        Assert.assertEquals("24710063", instruction.toHex());
    }

    @Test
    public void test879() {
        String str = "03e50824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $at, $ra, $a1", instruction.toString());
        Assert.assertEquals("03e50824", instruction.toHex());
    }

    @Test
    public void test880() {
        String str = "08000072";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 114", instruction.toString());
        Assert.assertEquals("08000072", instruction.toHex());
    }

    @Test
    public void test881() {
        String str = "01c70824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $at, $t6, $a3", instruction.toString());
        Assert.assertEquals("01c70824", instruction.toHex());
    }

    @Test
    public void test882() {
        String str = "37fe0041";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $fp, $ra, 65", instruction.toString());
        Assert.assertEquals("37fe0041", instruction.toHex());
    }

    @Test
    public void test883() {
        String str = "014c5825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t3, $t2, $t4", instruction.toString());
        Assert.assertEquals("014c5825", instruction.toHex());
    }

    @Test
    public void test884() {
        String str = "02957022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t6, $s4, $s5", instruction.toString());
        Assert.assertEquals("02957022", instruction.toHex());
    }

    @Test
    public void test885() {
        String str = "339c0091";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $gp, $gp, 145", instruction.toString());
        Assert.assertEquals("339c0091", instruction.toHex());
    }

    @Test
    public void test886() {
        String str = "03c7e82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $sp, $fp, $a3", instruction.toString());
        Assert.assertEquals("03c7e82a", instruction.toHex());
    }

    @Test
    public void test887() {
        String str = "08000046";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 70", instruction.toString());
        Assert.assertEquals("08000046", instruction.toHex());
    }

    @Test
    public void test888() {
        String str = "103bff36";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $at, $k1, 65334", instruction.toString());
        Assert.assertEquals("103bff36", instruction.toHex());
    }

    @Test
    public void test889() {
        String str = "16dfff3b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s6, $ra, 65339", instruction.toString());
        Assert.assertEquals("16dfff3b", instruction.toHex());
    }

    @Test
    public void test890() {
        String str = "ac730000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s3, ($v1)", instruction.toString());
        Assert.assertEquals("ac730000", instruction.toHex());
    }

    @Test
    public void test891() {
        String str = "020a082a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $at, $s0, $t2", instruction.toString());
        Assert.assertEquals("020a082a", instruction.toHex());
    }

    @Test
    public void test892() {
        String str = "10160046";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $zero, $s6, 70", instruction.toString());
        Assert.assertEquals("10160046", instruction.toHex());
    }

    @Test
    public void test893() {
        String str = "3249fff4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t1, $s2, 65524", instruction.toString());
        Assert.assertEquals("3249fff4", instruction.toHex());
    }

    @Test
    public void test894() {
        String str = "01f50022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $zero, $t7, $s5", instruction.toString());
        Assert.assertEquals("01f50022", instruction.toHex());
    }

    @Test
    public void test895() {
        String str = "1210ff71";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s0, $s0, 65393", instruction.toString());
        Assert.assertEquals("1210ff71", instruction.toHex());
    }

    @Test
    public void test896() {
        String str = "359c00dd";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $gp, $t4, 221", instruction.toString());
        Assert.assertEquals("359c00dd", instruction.toHex());
    }

    @Test
    public void test897() {
        String str = "080000df";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 223", instruction.toString());
        Assert.assertEquals("080000df", instruction.toHex());
    }

    @Test
    public void test898() {
        String str = "03a15022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t2, $sp, $at", instruction.toString());
        Assert.assertEquals("03a15022", instruction.toHex());
    }

    @Test
    public void test899() {
        String str = "13d3ff0b";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $fp, $s3, -245", instruction.toString());
        Assert.assertEquals("13d3ff0b", instruction.toHex());
    }

    @Test
    public void test900() {
        String str = "01709022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $s2, $t3, $s0", instruction.toString());
        Assert.assertEquals("01709022", instruction.toHex());
    }

    @Test
    public void test901() {
        String str = "00370025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $zero, $at, $s7", instruction.toString());
        Assert.assertEquals("00370025", instruction.toHex());
    }

    @Test
    public void test902() {
        String str = "08000076";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 118", instruction.toString());
        Assert.assertEquals("08000076", instruction.toHex());
    }

    @Test
    public void test903() {
        String str = "24fb0077";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $k1, $a3, 119", instruction.toString());
        Assert.assertEquals("24fb0077", instruction.toHex());
    }

    @Test
    public void test904() {
        String str = "0800002a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 42", instruction.toString());
        Assert.assertEquals("0800002a", instruction.toHex());
    }

    @Test
    public void test905() {
        String str = "0800000a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 10", instruction.toString());
        Assert.assertEquals("0800000a", instruction.toHex());
    }

    @Test
    public void test906() {
        String str = "adccffe9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t4, -23($t6)", instruction.toString());
        Assert.assertEquals("adccffe9", instruction.toHex());
    }

    @Test
    public void test907() {
        String str = "26d7003d";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s7, $s6, 61", instruction.toString());
        Assert.assertEquals("26d7003d", instruction.toHex());
    }

    @Test
    public void test908() {
        String str = "028de022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $gp, $s4, $t5", instruction.toString());
        Assert.assertEquals("028de022", instruction.toHex());
    }

    @Test
    public void test909() {
        String str = "1591003c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t4, $s1, 60", instruction.toString());
        Assert.assertEquals("1591003c", instruction.toHex());
    }

    @Test
    public void test910() {
        String str = "009c7824";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t7, $a0, $gp", instruction.toString());
        Assert.assertEquals("009c7824", instruction.toHex());
    }

    @Test
    public void test911() {
        String str = "116f0026";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t3, $t7, 38", instruction.toString());
        Assert.assertEquals("116f0026", instruction.toHex());
    }

    @Test
    public void test912() {
        String str = "162400f3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s1, $a0, 243", instruction.toString());
        Assert.assertEquals("162400f3", instruction.toHex());
    }

    @Test
    public void test913() {
        String str = "aeccff59";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t4, -167($s6)", instruction.toString());
        Assert.assertEquals("aeccff59", instruction.toHex());
    }

    @Test
    public void test914() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test915() {
        String str = "02124025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $t0, $s0, $s2", instruction.toString());
        Assert.assertEquals("02124025", instruction.toHex());
    }

    @Test
    public void test916() {
        String str = "8e0dffa7";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t5, -89($s0)", instruction.toString());
        Assert.assertEquals("8e0dffa7", instruction.toHex());
    }

    @Test
    public void test917() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test918() {
        String str = "00f9b82a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $s7, $a3, $t9", instruction.toString());
        Assert.assertEquals("00f9b82a", instruction.toHex());
    }

    @Test
    public void test919() {
        String str = "0168a825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s5, $t3, $t0", instruction.toString());
        Assert.assertEquals("0168a825", instruction.toHex());
    }

    @Test
    public void test920() {
        String str = "15b200e8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t5, $s2, 232", instruction.toString());
        Assert.assertEquals("15b200e8", instruction.toHex());
    }

    @Test
    public void test921() {
        String str = "15cf00f5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t6, $t7, 245", instruction.toString());
        Assert.assertEquals("15cf00f5", instruction.toHex());
    }

    @Test
    public void test922() {
        String str = "080000a5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 165", instruction.toString());
        Assert.assertEquals("080000a5", instruction.toHex());
    }

    @Test
    public void test923() {
        String str = "08000070";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 112", instruction.toString());
        Assert.assertEquals("08000070", instruction.toHex());
    }

    @Test
    public void test924() {
        String str = "00d4c022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t8, $a2, $s4", instruction.toString());
        Assert.assertEquals("00d4c022", instruction.toHex());
    }

    @Test
    public void test925() {
        String str = "25d500b0";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s5, $t6, 176", instruction.toString());
        Assert.assertEquals("25d500b0", instruction.toHex());
    }

    @Test
    public void test926() {
        String str = "02cdf822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $ra, $s6, $t5", instruction.toString());
        Assert.assertEquals("02cdf822", instruction.toHex());
    }

    @Test
    public void test927() {
        String str = "10c100cb";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $a2, $at, 203", instruction.toString());
        Assert.assertEquals("10c100cb", instruction.toHex());
    }

    @Test
    public void test928() {
        String str = "1770ff28";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $k1, $s0, -216", instruction.toString());
        Assert.assertEquals("1770ff28", instruction.toHex());
    }

    @Test
    public void test929() {
        String str = "00822820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a1, $a0, $v0", instruction.toString());
        Assert.assertEquals("00822820", instruction.toHex());
    }

    @Test
    public void test930() {
        String str = "00b0e825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $sp, $a1, $s0", instruction.toString());
        Assert.assertEquals("00b0e825", instruction.toHex());
    }

    @Test
    public void test931() {
        String str = "145100f1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $v0, $s1, 241", instruction.toString());
        Assert.assertEquals("145100f1", instruction.toHex());
    }

    @Test
    public void test932() {
        String str = "104c00e1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $v0, $t4, 225", instruction.toString());
        Assert.assertEquals("104c00e1", instruction.toHex());
    }

    @Test
    public void test933() {
        String str = "1527001e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t1, $a3, 30", instruction.toString());
        Assert.assertEquals("1527001e", instruction.toHex());
    }

    @Test
    public void test934() {
        String str = "3c00009e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $zero, 158", instruction.toString());
        Assert.assertEquals("3c00009e", instruction.toHex());
    }

    @Test
    public void test935() {
        String str = "034bc024";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("and $t8, $k0, $t3", instruction.toString());
        Assert.assertEquals("034bc024", instruction.toHex());
    }

    @Test
    public void test936() {
        String str = "8cc00000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $zero, ($a2)", instruction.toString());
        Assert.assertEquals("8cc00000", instruction.toHex());
    }

    @Test
    public void test937() {
        String str = "ae1a00d9";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $k0, 217($s0)", instruction.toString());
        Assert.assertEquals("ae1a00d9", instruction.toHex());
    }

    @Test
    public void test938() {
        String str = "0800006e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 110", instruction.toString());
        Assert.assertEquals("0800006e", instruction.toHex());
    }

    @Test
    public void test939() {
        String str = "325600f1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s6, $s2, 241", instruction.toString());
        Assert.assertEquals("325600f1", instruction.toHex());
    }

    @Test
    public void test940() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test941() {
        String str = "027e8025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $s0, $s3, $fp", instruction.toString());
        Assert.assertEquals("027e8025", instruction.toHex());
    }

    @Test
    public void test942() {
        String str = "32b700ff";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s7, $s5, 255", instruction.toString());
        Assert.assertEquals("32b700ff", instruction.toHex());
    }

    @Test
    public void test943() {
        String str = "08000042";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 66", instruction.toString());
        Assert.assertEquals("08000042", instruction.toHex());
    }

    @Test
    public void test944() {
        String str = "006cd020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $k0, $v1, $t4", instruction.toString());
        Assert.assertEquals("006cd020", instruction.toHex());
    }

    @Test
    public void test945() {
        String str = "3c1300f2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $s3, 242", instruction.toString());
        Assert.assertEquals("3c1300f2", instruction.toHex());
    }

    @Test
    public void test946() {
        String str = "02370820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $at, $s1, $s7", instruction.toString());
        Assert.assertEquals("02370820", instruction.toHex());
    }

    @Test
    public void test947() {
        String str = "263500d2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s5, $s1, 210", instruction.toString());
        Assert.assertEquals("263500d2", instruction.toHex());
    }

    @Test
    public void test948() {
        String str = "080000fe";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 254", instruction.toString());
        Assert.assertEquals("080000fe", instruction.toHex());
    }

    @Test
    public void test949() {
        String str = "0302d025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $k0, $t8, $v0", instruction.toString());
        Assert.assertEquals("0302d025", instruction.toHex());
    }

    @Test
    public void test950() {
        String str = "08000050";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 80", instruction.toString());
        Assert.assertEquals("08000050", instruction.toHex());
    }

    @Test
    public void test951() {
        String str = "1101ffc8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t0, $at, 65480", instruction.toString());
        Assert.assertEquals("1101ffc8", instruction.toHex());
    }

    @Test
    public void test952() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test953() {
        String str = "026d0820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $at, $s3, $t5", instruction.toString());
        Assert.assertEquals("026d0820", instruction.toHex());
    }

    @Test
    public void test954() {
        String str = "3210ff64";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $s0, $s0, 65380", instruction.toString());
        Assert.assertEquals("3210ff64", instruction.toHex());
    }

    @Test
    public void test955() {
        String str = "252f00cf";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t7, $t1, 207", instruction.toString());
        Assert.assertEquals("252f00cf", instruction.toHex());
    }

    @Test
    public void test956() {
        String str = "15d7ffb4";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $t6, $s7, -76", instruction.toString());
        Assert.assertEquals("15d7ffb4", instruction.toHex());
    }

    @Test
    public void test957() {
        String str = "080000db";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 219", instruction.toString());
        Assert.assertEquals("080000db", instruction.toHex());
    }

    @Test
    public void test958() {
        String str = "348300c1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $v1, $a0, 193", instruction.toString());
        Assert.assertEquals("348300c1", instruction.toHex());
    }

    @Test
    public void test959() {
        String str = "080000e2";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 226", instruction.toString());
        Assert.assertEquals("080000e2", instruction.toHex());
    }

    @Test
    public void test960() {
        String str = "16390001";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $s1, $t9, 1", instruction.toString());
        Assert.assertEquals("16390001", instruction.toHex());
    }

    @Test
    public void test961() {
        String str = "00d54822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t1, $a2, $s5", instruction.toString());
        Assert.assertEquals("00d54822", instruction.toHex());
    }

    @Test
    public void test962() {
        String str = "146800f6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $v1, $t0, 246", instruction.toString());
        Assert.assertEquals("146800f6", instruction.toHex());
    }

    @Test
    public void test963() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test964() {
        String str = "3c000092";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lui $zero, 146", instruction.toString());
        Assert.assertEquals("3c000092", instruction.toHex());
    }

    @Test
    public void test965() {
        String str = "02363022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $a2, $s1, $s6", instruction.toString());
        Assert.assertEquals("02363022", instruction.toHex());
    }

    @Test
    public void test966() {
        String str = "8c99fff1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("lw $t9, -15($a0)", instruction.toString());
        Assert.assertEquals("8c99fff1", instruction.toHex());
    }

    @Test
    public void test967() {
        String str = "adf50000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s5, ($t7)", instruction.toString());
        Assert.assertEquals("adf50000", instruction.toHex());
    }

    @Test
    public void test968() {
        String str = "12a2ffa5";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s5, $v0, 65445", instruction.toString());
        Assert.assertEquals("12a2ffa5", instruction.toHex());
    }

    @Test
    public void test969() {
        String str = "1167ff58";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t3, $a3, -168", instruction.toString());
        Assert.assertEquals("1167ff58", instruction.toHex());
    }

    @Test
    public void test970() {
        String str = "26c60007";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $a2, $s6, 7", instruction.toString());
        Assert.assertEquals("26c60007", instruction.toHex());
    }

    @Test
    public void test971() {
        String str = "03dbf025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $fp, $fp, $k1", instruction.toString());
        Assert.assertEquals("03dbf025", instruction.toHex());
    }

    @Test
    public void test972() {
        String str = "0800002e";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("j 46", instruction.toString());
        Assert.assertEquals("0800002e", instruction.toHex());
    }

    @Test
    public void test973() {
        String str = "02822825";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a1, $s4, $v0", instruction.toString());
        Assert.assertEquals("02822825", instruction.toHex());
    }

    @Test
    public void test974() {
        String str = "03a24022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $t0, $sp, $v0", instruction.toString());
        Assert.assertEquals("03a24022", instruction.toHex());
    }

    @Test
    public void test975() {
        String str = "00cb2820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a1, $a2, $t3", instruction.toString());
        Assert.assertEquals("00cb2820", instruction.toHex());
    }

    @Test
    public void test976() {
        String str = "277100c8";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $s1, $k1, 200", instruction.toString());
        Assert.assertEquals("277100c8", instruction.toHex());
    }

    @Test
    public void test977() {
        String str = "028de02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $gp, $s4, $t5", instruction.toString());
        Assert.assertEquals("028de02a", instruction.toHex());
    }

    @Test
    public void test978() {
        String str = "0398f02a";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("slt $fp, $gp, $t8", instruction.toString());
        Assert.assertEquals("0398f02a", instruction.toHex());
    }

    @Test
    public void test979() {
        String str = "241800e1";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("addiu $t8, $zero, 225", instruction.toString());
        Assert.assertEquals("241800e1", instruction.toHex());
    }

    @Test
    public void test980() {
        String str = "03592022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $a0, $k0, $t9", instruction.toString());
        Assert.assertEquals("03592022", instruction.toHex());
    }

    @Test
    public void test981() {
        String str = "32ad00b6";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("andi $t5, $s5, 182", instruction.toString());
        Assert.assertEquals("32ad00b6", instruction.toHex());
    }

    @Test
    public void test982() {
        String str = "002e2020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a0, $at, $t6", instruction.toString());
        Assert.assertEquals("002e2020", instruction.toHex());
    }

    @Test
    public void test983() {
        String str = "1782000f";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("bne $gp, $v0, 15", instruction.toString());
        Assert.assertEquals("1782000f", instruction.toHex());
    }

    @Test
    public void test984() {
        String str = "01123025";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("or $a2, $t0, $s2", instruction.toString());
        Assert.assertEquals("01123025", instruction.toHex());
    }

    @Test
    public void test985() {
        String str = "02ab0022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $zero, $s5, $t3", instruction.toString());
        Assert.assertEquals("02ab0022", instruction.toHex());
    }

    @Test
    public void test986() {
        String str = "03d5b820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $s7, $fp, $s5", instruction.toString());
        Assert.assertEquals("03d5b820", instruction.toHex());
    }

    @Test
    public void test987() {
        String str = "36c7ffe3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("ori $a3, $s6, 65507", instruction.toString());
        Assert.assertEquals("36c7ffe3", instruction.toHex());
    }

    @Test
    public void test988() {
        String str = "ac78008c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $t8, 140($v1)", instruction.toString());
        Assert.assertEquals("ac78008c", instruction.toHex());
    }

    @Test
    public void test989() {
        String str = "0000000c";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("syscall", instruction.toString());
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test990() {
        String str = "004f0822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $at, $v0, $t7", instruction.toString());
        Assert.assertEquals("004f0822", instruction.toHex());
    }

    @Test
    public void test991() {
        String str = "af520000";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sw $s2, ($k0)", instruction.toString());
        Assert.assertEquals("af520000", instruction.toHex());
    }

    @Test
    public void test992() {
        String str = "03c63820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a3, $fp, $a2", instruction.toString());
        Assert.assertEquals("03c63820", instruction.toHex());
    }

    @Test
    public void test993() {
        String str = "1335ff57";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $t9, $s5, 65367", instruction.toString());
        Assert.assertEquals("1335ff57", instruction.toHex());
    }

    @Test
    public void test994() {
        String str = "0228e820";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $sp, $s1, $t0", instruction.toString());
        Assert.assertEquals("0228e820", instruction.toHex());
    }

    @Test
    public void test995() {
        String str = "02e12020";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("add $a0, $s7, $at", instruction.toString());
        Assert.assertEquals("02e12020", instruction.toHex());
    }

    @Test
    public void test996() {
        String str = "01a73022";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $a2, $t5, $a3", instruction.toString());
        Assert.assertEquals("01a73022", instruction.toHex());
    }

    @Test
    public void test997() {
        String str = "12b2ff57";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $s5, $s2, -169", instruction.toString());
        Assert.assertEquals("12b2ff57", instruction.toHex());
    }

    @Test
    public void test998() {
        String str = "10d6ffd3";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("beq $a2, $s6, -45", instruction.toString());
        Assert.assertEquals("10d6ffd3", instruction.toHex());
    }

    @Test
    public void test999() {
        String str = "011af822";
        MIPSInstruction instruction = MIPSInstructionFactory.create(str, MIPSStringType.Hex);
        Assert.assertEquals("sub $ra, $t0, $k0", instruction.toString());
        Assert.assertEquals("011af822", instruction.toHex());
    }
}
