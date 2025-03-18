package tests;

import lib.mips.MIPSInstruction;
import lib.mips.MIPSInstructionFactory;
import org.junit.Assert;
import org.junit.Test;

public class ProgramTest {

    @Test
    public void test0() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t5, $s1, $s2");
        Assert.assertEquals("02326822", instruction.toHex());
    }

    @Test
    public void test1() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s5, $t7, -79");
        Assert.assertEquals("31f5ffb1", instruction.toHex());
    }

    @Test
    public void test2() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $sp, $k1, 0x4e# Comment");
        Assert.assertEquals("337d004e", instruction.toHex());
    }

    @Test
    public void test3() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s0, $k1, 0x79");
        Assert.assertEquals("161b0079", instruction.toHex());
    }

    @Test
    public void test4() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $k0, $t7, 0xa3# Comment");
        Assert.assertEquals("134f00a3", instruction.toHex());
    }

    @Test
    public void test5() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test6() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $v0, $s6, $t8");
        Assert.assertEquals("02d81025", instruction.toHex());
    }

    @Test
    public void test7() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s0, $s3, 167");
        Assert.assertEquals("267000a7", instruction.toHex());
    }

    @Test
    public void test8() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t6, 114($s7)");
        Assert.assertEquals("aeee0072", instruction.toHex());
    }

    @Test
    public void test9() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t1, $s4, -62");
        Assert.assertEquals("3289ffc2", instruction.toHex());
    }

    @Test
    public void test10() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t3, $k1, $v1");
        Assert.assertEquals("0363582a", instruction.toHex());
    }

    @Test
    public void test11() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $v0, 0xda");
        Assert.assertEquals("3c0200da", instruction.toHex());
    }

    @Test
    public void test12() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a0, 0xd7");
        Assert.assertEquals("3c0400d7", instruction.toHex());
    }

    @Test
    public void test13() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $at, $fp, 0x90");
        Assert.assertEquals("33c10090", instruction.toHex());
    }

    @Test
    public void test14() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s0, $fp, -250");
        Assert.assertEquals("161eff06", instruction.toHex());
    }

    @Test
    public void test15() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t8, $a2, -124");
        Assert.assertEquals("1306ff84", instruction.toHex());
    }

    @Test
    public void test16() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s6, $s7, 99");
        Assert.assertEquals("26f60063", instruction.toHex());
    }

    @Test
    public void test17() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $zero, $t4, $t4");
        Assert.assertEquals("018c002a", instruction.toHex());
    }

    @Test
    public void test18() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s2, -211($a1)");
        Assert.assertEquals("acb2ff2d", instruction.toHex());
    }

    @Test
    public void test19() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $k0, -94($s1)");
        Assert.assertEquals("8e3affa2", instruction.toHex());
    }

    @Test
    public void test20() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $zero, $t3, $t0");
        Assert.assertEquals("01680025", instruction.toHex());
    }

    @Test
    public void test21() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s6, $v1, 0xfff0");
        Assert.assertEquals("16c3fff0", instruction.toHex());
    }

    @Test
    public void test22() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a3, $k0, $s3# Comment");
        Assert.assertEquals("03533825", instruction.toHex());
    }

    @Test
    public void test23() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test24() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t8, $s0, 233# Comment");
        Assert.assertEquals("171000e9", instruction.toHex());
    }

    @Test
    public void test25() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x74");
        Assert.assertEquals("08000074", instruction.toHex());
    }

    @Test
    public void test26() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test27() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test28() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s5, $k0, $s4");
        Assert.assertEquals("0354a825", instruction.toHex());
    }

    @Test
    public void test29() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s1, $a3, -27");
        Assert.assertEquals("30f1ffe5", instruction.toHex());
    }

    @Test
    public void test30() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t4, $ra, $sp");
        Assert.assertEquals("03fd6025", instruction.toHex());
    }

    @Test
    public void test31() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x48");
        Assert.assertEquals("08000048", instruction.toHex());
    }

    @Test
    public void test32() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $ra, $s7, 0xfc");
        Assert.assertEquals("26ff00fc", instruction.toHex());
    }

    @Test
    public void test33() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $gp, 112($s4)");
        Assert.assertEquals("8e9c0070", instruction.toHex());
    }

    @Test
    public void test34() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s0, $s7, 131");
        Assert.assertEquals("36f00083", instruction.toHex());
    }

    @Test
    public void test35() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $zero, $at, $t6");
        Assert.assertEquals("002e002a", instruction.toHex());
    }

    @Test
    public void test36() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a1, $t8, $t9");
        Assert.assertEquals("03192820", instruction.toHex());
    }

    @Test
    public void test37() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s5, $k1, $t7");
        Assert.assertEquals("036fa825", instruction.toHex());
    }

    @Test
    public void test38() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s0, $s0, 0x99");
        Assert.assertEquals("36100099", instruction.toHex());
    }

    @Test
    public void test39() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x8");
        Assert.assertEquals("08000008", instruction.toHex());
    }

    @Test
    public void test40() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test41() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a3, $s4, $t4");
        Assert.assertEquals("028c3820", instruction.toHex());
    }

    @Test
    public void test42() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $gp, $a2, $t0# Comment");
        Assert.assertEquals("00c8e02a", instruction.toHex());
    }

    @Test
    public void test43() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $v0, $t5, $a0");
        Assert.assertEquals("01a41020", instruction.toHex());
    }

    @Test
    public void test44() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t0, $v1, 0x9b# Comment");
        Assert.assertEquals("2468009b", instruction.toHex());
    }

    @Test
    public void test45() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $v1, $v1, 0xffdd");
        Assert.assertEquals("1063ffdd", instruction.toHex());
    }

    @Test
    public void test46() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t3, 0xdb");
        Assert.assertEquals("3c0b00db", instruction.toHex());
    }

    @Test
    public void test47() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a3, $s6, 0xa");
        Assert.assertEquals("36c7000a", instruction.toHex());
    }

    @Test
    public void test48() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $a0, -182($s5)");
        Assert.assertEquals("8ea4ff4a", instruction.toHex());
    }

    @Test
    public void test49() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s3, $s6, $t8");
        Assert.assertEquals("02d89822", instruction.toHex());
    }

    @Test
    public void test50() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test51() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t7, $t1, $a1");
        Assert.assertEquals("01257824", instruction.toHex());
    }

    @Test
    public void test52() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $zero, $t4, $fp");
        Assert.assertEquals("019e002a", instruction.toHex());
    }

    @Test
    public void test53() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s3, $t6, $a2# Comment");
        Assert.assertEquals("01c69824", instruction.toHex());
    }

    @Test
    public void test54() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a0, 0x7");
        Assert.assertEquals("3c040007", instruction.toHex());
    }

    @Test
    public void test55() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t6, 0x6b");
        Assert.assertEquals("3c0e006b", instruction.toHex());
    }

    @Test
    public void test56() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a1, 0xe0");
        Assert.assertEquals("3c0500e0", instruction.toHex());
    }

    @Test
    public void test57() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s6, $t4, $t7");
        Assert.assertEquals("018fb022", instruction.toHex());
    }

    @Test
    public void test58() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t9, $s6, 0xe3");
        Assert.assertEquals("26d900e3", instruction.toHex());
    }

    @Test
    public void test59() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $k0, 0x4f");
        Assert.assertEquals("3c1a004f", instruction.toHex());
    }

    @Test
    public void test60() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x99");
        Assert.assertEquals("08000099", instruction.toHex());
    }

    @Test
    public void test61() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xd2");
        Assert.assertEquals("080000d2", instruction.toHex());
    }

    @Test
    public void test62() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t7, $v1, $gp");
        Assert.assertEquals("007c7825", instruction.toHex());
    }

    @Test
    public void test63() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x29# Comment");
        Assert.assertEquals("08000029", instruction.toHex());
    }

    @Test
    public void test64() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x66");
        Assert.assertEquals("08000066", instruction.toHex());
    }

    @Test
    public void test65() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $sp, ($t7)");
        Assert.assertEquals("8dfd0000", instruction.toHex());
    }

    @Test
    public void test66() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x52");
        Assert.assertEquals("08000052", instruction.toHex());
    }

    @Test
    public void test67() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x67");
        Assert.assertEquals("08000067", instruction.toHex());
    }

    @Test
    public void test68() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t5, 0x1");
        Assert.assertEquals("3c0d0001", instruction.toHex());
    }

    @Test
    public void test69() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s7, $t5, $k0");
        Assert.assertEquals("01bab824", instruction.toHex());
    }

    @Test
    public void test70() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t2, $s6, $a0");
        Assert.assertEquals("02c45025", instruction.toHex());
    }

    @Test
    public void test71() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $k1, -234($v1)");
        Assert.assertEquals("8c7bff16", instruction.toHex());
    }

    @Test
    public void test72() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t5, $v0, -119");
        Assert.assertEquals("344dff89", instruction.toHex());
    }

    @Test
    public void test73() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s3, 26($k1)");
        Assert.assertEquals("af73001a", instruction.toHex());
    }

    @Test
    public void test74() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test75() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x77");
        Assert.assertEquals("08000077", instruction.toHex());
    }

    @Test
    public void test76() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s0, $a3, 5");
        Assert.assertEquals("24f00005", instruction.toHex());
    }

    @Test
    public void test77() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test78() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t9, $s4, $t9");
        Assert.assertEquals("0299c825", instruction.toHex());
    }

    @Test
    public void test79() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $a3, -82($t8)");
        Assert.assertEquals("8f07ffae", instruction.toHex());
    }

    @Test
    public void test80() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a3, 0xba");
        Assert.assertEquals("3c0700ba", instruction.toHex());
    }

    @Test
    public void test81() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $sp, $zero, $k0");
        Assert.assertEquals("001ae820", instruction.toHex());
    }

    @Test
    public void test82() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t5, 181($t1)");
        Assert.assertEquals("ad2d00b5", instruction.toHex());
    }

    @Test
    public void test83() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a2, $t8, -152");
        Assert.assertEquals("3706ff68", instruction.toHex());
    }

    @Test
    public void test84() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s1, $t1, 0xdd# Comment");
        Assert.assertEquals("313100dd", instruction.toHex());
    }

    @Test
    public void test85() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $v0, $s2, 0x4b");
        Assert.assertEquals("2642004b", instruction.toHex());
    }

    @Test
    public void test86() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $fp, $a3, 155");
        Assert.assertEquals("34fe009b", instruction.toHex());
    }

    @Test
    public void test87() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t9, 67($a1)");
        Assert.assertEquals("acb90043", instruction.toHex());
    }

    @Test
    public void test88() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t8, $k1, 0x6");
        Assert.assertEquals("171b0006", instruction.toHex());
    }

    @Test
    public void test89() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $sp, $t6, -27");
        Assert.assertEquals("17aeffe5", instruction.toHex());
    }

    @Test
    public void test90() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t0, ($t3)");
        Assert.assertEquals("8d680000", instruction.toHex());
    }

    @Test
    public void test91() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t0, $k0, $s6");
        Assert.assertEquals("03564024", instruction.toHex());
    }

    @Test
    public void test92() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $ra, $t2, 13");
        Assert.assertEquals("255f000d", instruction.toHex());
    }

    @Test
    public void test93() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $v0, $s7, 151");
        Assert.assertEquals("14570097", instruction.toHex());
    }

    @Test
    public void test94() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x1f");
        Assert.assertEquals("0800001f", instruction.toHex());
    }

    @Test
    public void test95() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t5, $at, 0x7d");
        Assert.assertEquals("302d007d", instruction.toHex());
    }

    @Test
    public void test96() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a3, $t9, $t5");
        Assert.assertEquals("032d3824", instruction.toHex());
    }

    @Test
    public void test97() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a1, $t0, $v0");
        Assert.assertEquals("01022825", instruction.toHex());
    }

    @Test
    public void test98() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s1, $s0, $s0");
        Assert.assertEquals("02108820", instruction.toHex());
    }

    @Test
    public void test99() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $a1, $s1, 174");
        Assert.assertEquals("262500ae", instruction.toHex());
    }

    @Test
    public void test100() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t0, $s5, 151");
        Assert.assertEquals("32a80097", instruction.toHex());
    }

    @Test
    public void test101() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t8, $a3, 0xf2");
        Assert.assertEquals("130700f2", instruction.toHex());
    }

    @Test
    public void test102() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $gp, $s4, 0xff08");
        Assert.assertEquals("369cff08", instruction.toHex());
    }

    @Test
    public void test103() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x21");
        Assert.assertEquals("08000021", instruction.toHex());
    }

    @Test
    public void test104() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t4, $t3, $v1");
        Assert.assertEquals("01636025", instruction.toHex());
    }

    @Test
    public void test105() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $fp, ($t2)");
        Assert.assertEquals("8d5e0000", instruction.toHex());
    }

    @Test
    public void test106() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t5, $s1, $s1");
        Assert.assertEquals("02316820", instruction.toHex());
    }

    @Test
    public void test107() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $v0, $s2, 0xff95");
        Assert.assertEquals("1052ff95", instruction.toHex());
    }

    @Test
    public void test108() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $k0, $ra, -7");
        Assert.assertEquals("175ffff9", instruction.toHex());
    }

    @Test
    public void test109() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x75");
        Assert.assertEquals("08000075", instruction.toHex());
    }

    @Test
    public void test110() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test111() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s5, $s4, $t5");
        Assert.assertEquals("028da82a", instruction.toHex());
    }

    @Test
    public void test112() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $sp, $t1, $a0");
        Assert.assertEquals("0124e820", instruction.toHex());
    }

    @Test
    public void test113() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a2, -192($k0)");
        Assert.assertEquals("af46ff40", instruction.toHex());
    }

    @Test
    public void test114() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t1, $t6, $t4");
        Assert.assertEquals("01cc4822", instruction.toHex());
    }

    @Test
    public void test115() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s5, $v0, 0xff78");
        Assert.assertEquals("3055ff78", instruction.toHex());
    }

    @Test
    public void test116() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s0, $k1, 0xffb6# Comment");
        Assert.assertEquals("3770ffb6", instruction.toHex());
    }

    @Test
    public void test117() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t5, $t0, $s0");
        Assert.assertEquals("01106825", instruction.toHex());
    }

    @Test
    public void test118() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $ra, $t0, $t2");
        Assert.assertEquals("010af820", instruction.toHex());
    }

    @Test
    public void test119() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test120() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t3, $t3, 0x1c");
        Assert.assertEquals("116b001c", instruction.toHex());
    }

    @Test
    public void test121() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t1, $s7, $t6");
        Assert.assertEquals("02ee4820", instruction.toHex());
    }

    @Test
    public void test122() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $v1, 51($k1)# Comment");
        Assert.assertEquals("af630033", instruction.toHex());
    }

    @Test
    public void test123() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $k0, $a2, 14");
        Assert.assertEquals("1746000e", instruction.toHex());
    }

    @Test
    public void test124() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $at, $s0, 0xffaf");
        Assert.assertEquals("1030ffaf", instruction.toHex());
    }

    @Test
    public void test125() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t2, $t7, 159");
        Assert.assertEquals("35ea009f", instruction.toHex());
    }

    @Test
    public void test126() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s4, $at, 60");
        Assert.assertEquals("3034003c", instruction.toHex());
    }

    @Test
    public void test127() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t3, $at, $s1");
        Assert.assertEquals("00315824", instruction.toHex());
    }

    @Test
    public void test128() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $at, $t8, 0xffc1");
        Assert.assertEquals("3301ffc1", instruction.toHex());
    }

    @Test
    public void test129() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s3, $t6, $sp");
        Assert.assertEquals("01dd9825", instruction.toHex());
    }

    @Test
    public void test130() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t3, $fp, 22");
        Assert.assertEquals("117e0016", instruction.toHex());
    }

    @Test
    public void test131() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $k0, $v1, $fp");
        Assert.assertEquals("007ed022", instruction.toHex());
    }

    @Test
    public void test132() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xc4");
        Assert.assertEquals("080000c4", instruction.toHex());
    }

    @Test
    public void test133() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $a0, $k0, 0x93");
        Assert.assertEquals("149a0093", instruction.toHex());
    }

    @Test
    public void test134() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x28");
        Assert.assertEquals("08000028", instruction.toHex());
    }

    @Test
    public void test135() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t4, $s2, $s6");
        Assert.assertEquals("02566025", instruction.toHex());
    }

    @Test
    public void test136() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s1, $v0, $gp");
        Assert.assertEquals("005c8824", instruction.toHex());
    }

    @Test
    public void test137() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t1, $s0, 78");
        Assert.assertEquals("3209004e", instruction.toHex());
    }

    @Test
    public void test138() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s7, $s3, -42");
        Assert.assertEquals("3277ffd6", instruction.toHex());
    }

    @Test
    public void test139() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $ra, $ra, $k0");
        Assert.assertEquals("03faf825", instruction.toHex());
    }

    @Test
    public void test140() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $k1, $s2, 190# Comment");
        Assert.assertEquals("265b00be", instruction.toHex());
    }

    @Test
    public void test141() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $a3, $t4, $gp# Comment");
        Assert.assertEquals("019c3822", instruction.toHex());
    }

    @Test
    public void test142() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s1, $s7, $t2");
        Assert.assertEquals("02ea8822", instruction.toHex());
    }

    @Test
    public void test143() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $zero, $t4, $fp");
        Assert.assertEquals("019e0025", instruction.toHex());
    }

    @Test
    public void test144() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s0, $v0, 101");
        Assert.assertEquals("30500065", instruction.toHex());
    }

    @Test
    public void test145() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t0, $t6, 0x39");
        Assert.assertEquals("150e0039", instruction.toHex());
    }

    @Test
    public void test146() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s6, $t8, $s0");
        Assert.assertEquals("0310b025", instruction.toHex());
    }

    @Test
    public void test147() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a2, $a3, $s7");
        Assert.assertEquals("00f73024", instruction.toHex());
    }

    @Test
    public void test148() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $a3, $t4, $ra");
        Assert.assertEquals("019f382a", instruction.toHex());
    }

    @Test
    public void test149() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $at, -144($t0)");
        Assert.assertEquals("ad01ff70", instruction.toHex());
    }

    @Test
    public void test150() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s6, 0x30");
        Assert.assertEquals("3c160030", instruction.toHex());
    }

    @Test
    public void test151() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s1, -121($v0)");
        Assert.assertEquals("8c51ff87", instruction.toHex());
    }

    @Test
    public void test152() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s3, $s5, 154");
        Assert.assertEquals("26b3009a", instruction.toHex());
    }

    @Test
    public void test153() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s2, $s6, 0xfd");
        Assert.assertEquals("26d200fd", instruction.toHex());
    }

    @Test
    public void test154() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t2, $v0, 0xff77");
        Assert.assertEquals("1542ff77", instruction.toHex());
    }

    @Test
    public void test155() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t4, 0xe");
        Assert.assertEquals("3c0c000e", instruction.toHex());
    }

    @Test
    public void test156() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a2, $s5, $v1# Comment");
        Assert.assertEquals("02a33024", instruction.toHex());
    }

    @Test
    public void test157() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $gp, $gp, 0xf0");
        Assert.assertEquals("279c00f0", instruction.toHex());
    }

    @Test
    public void test158() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $a0, $a1, 11# Comment");
        Assert.assertEquals("1485000b", instruction.toHex());
    }

    @Test
    public void test159() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s0, $t5, 0x24");
        Assert.assertEquals("160d0024", instruction.toHex());
    }

    @Test
    public void test160() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t5, $zero, $s5");
        Assert.assertEquals("0015682a", instruction.toHex());
    }

    @Test
    public void test161() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s0, 173($at)");
        Assert.assertEquals("8c3000ad", instruction.toHex());
    }

    @Test
    public void test162() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a2, $s7, $at");
        Assert.assertEquals("02e13020", instruction.toHex());
    }

    @Test
    public void test163() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test164() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s3, $k0, $t2# Comment");
        Assert.assertEquals("034a9820", instruction.toHex());
    }

    @Test
    public void test165() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t2, ($sp)");
        Assert.assertEquals("8faa0000", instruction.toHex());
    }

    @Test
    public void test166() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t5, $t4, $s3");
        Assert.assertEquals("01936820", instruction.toHex());
    }

    @Test
    public void test167() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t6, $v1, 0xffa8# Comment");
        Assert.assertEquals("346effa8", instruction.toHex());
    }

    @Test
    public void test168() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s3, $t1, 0xffe7");
        Assert.assertEquals("1669ffe7", instruction.toHex());
    }

    @Test
    public void test169() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $sp, $a1, $t5");
        Assert.assertEquals("00ade825", instruction.toHex());
    }

    @Test
    public void test170() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xa8");
        Assert.assertEquals("080000a8", instruction.toHex());
    }

    @Test
    public void test171() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $zero, $s5, 0x3c");
        Assert.assertEquals("1415003c", instruction.toHex());
    }

    @Test
    public void test172() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xd# Comment");
        Assert.assertEquals("0800000d", instruction.toHex());
    }

    @Test
    public void test173() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s0, $zero, -23");
        Assert.assertEquals("3410ffe9", instruction.toHex());
    }

    @Test
    public void test174() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $v0, $t5, $s4");
        Assert.assertEquals("01b41025", instruction.toHex());
    }

    @Test
    public void test175() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x8a");
        Assert.assertEquals("0800008a", instruction.toHex());
    }

    @Test
    public void test176() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s6, 0x20");
        Assert.assertEquals("3c160020", instruction.toHex());
    }

    @Test
    public void test177() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xbf");
        Assert.assertEquals("080000bf", instruction.toHex());
    }

    @Test
    public void test178() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $ra, $t9, 0xff24");
        Assert.assertEquals("17f9ff24", instruction.toHex());
    }

    @Test
    public void test179() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t5, -190($s3)");
        Assert.assertEquals("ae6dff42", instruction.toHex());
    }

    @Test
    public void test180() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test181() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xd8");
        Assert.assertEquals("080000d8", instruction.toHex());
    }

    @Test
    public void test182() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $sp, $a2, $sp");
        Assert.assertEquals("00dde82a", instruction.toHex());
    }

    @Test
    public void test183() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $v0, $at, 0x5b");
        Assert.assertEquals("1441005b", instruction.toHex());
    }

    @Test
    public void test184() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t5, $sp, 0x46");
        Assert.assertEquals("33ad0046", instruction.toHex());
    }

    @Test
    public void test185() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $sp, $t1, $s3");
        Assert.assertEquals("0133e824", instruction.toHex());
    }

    @Test
    public void test186() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t8, $t6, 0xee");
        Assert.assertEquals("25d800ee", instruction.toHex());
    }

    @Test
    public void test187() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $v0, $t0, $s0");
        Assert.assertEquals("01101020", instruction.toHex());
    }

    @Test
    public void test188() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t8, $t2, $t5");
        Assert.assertEquals("014dc02a", instruction.toHex());
    }

    @Test
    public void test189() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $fp, ($v0)");
        Assert.assertEquals("8c5e0000", instruction.toHex());
    }

    @Test
    public void test190() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t4, $ra, 0xff21");
        Assert.assertEquals("119fff21", instruction.toHex());
    }

    @Test
    public void test191() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t9, $s4, 152# Comment");
        Assert.assertEquals("26990098", instruction.toHex());
    }

    @Test
    public void test192() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s0, $a1, $a1");
        Assert.assertEquals("00a58025", instruction.toHex());
    }

    @Test
    public void test193() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t8, $fp, 87");
        Assert.assertEquals("131e0057", instruction.toHex());
    }

    @Test
    public void test194() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $a1, $s4, 0x37");
        Assert.assertEquals("32850037", instruction.toHex());
    }

    @Test
    public void test195() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t5, 0xf0");
        Assert.assertEquals("3c0d00f0", instruction.toHex());
    }

    @Test
    public void test196() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $a1, $t7, $a2");
        Assert.assertEquals("01e62822", instruction.toHex());
    }

    @Test
    public void test197() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s6, $s7, $t5");
        Assert.assertEquals("02edb02a", instruction.toHex());
    }

    @Test
    public void test198() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a0, $gp, $k0");
        Assert.assertEquals("039a2025", instruction.toHex());
    }

    @Test
    public void test199() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xe7");
        Assert.assertEquals("080000e7", instruction.toHex());
    }

    @Test
    public void test200() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $ra, $v1, $s5");
        Assert.assertEquals("0075f825", instruction.toHex());
    }

    @Test
    public void test201() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a2, $t9, $s6");
        Assert.assertEquals("03363024", instruction.toHex());
    }

    @Test
    public void test202() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a0, $t7, $t7");
        Assert.assertEquals("01ef2024", instruction.toHex());
    }

    @Test
    public void test203() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $ra, $t9, $v1");
        Assert.assertEquals("0323f824", instruction.toHex());
    }

    @Test
    public void test204() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s0, $fp, 243");
        Assert.assertEquals("33d000f3", instruction.toHex());
    }

    @Test
    public void test205() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t8, -232($v0)");
        Assert.assertEquals("ac58ff18", instruction.toHex());
    }

    @Test
    public void test206() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test207() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test208() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s7, $t3, 50");
        Assert.assertEquals("12eb0032", instruction.toHex());
    }

    @Test
    public void test209() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t4, $a3, $a2");
        Assert.assertEquals("00e6602a", instruction.toHex());
    }

    @Test
    public void test210() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s4, $s3, $s3");
        Assert.assertEquals("0273a025", instruction.toHex());
    }

    @Test
    public void test211() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $at, $s0, 254");
        Assert.assertEquals("260100fe", instruction.toHex());
    }

    @Test
    public void test212() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t6, $s7, 123");
        Assert.assertEquals("26ee007b", instruction.toHex());
    }

    @Test
    public void test213() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $v0, $v1, $a0");
        Assert.assertEquals("00641024", instruction.toHex());
    }

    @Test
    public void test214() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xa6");
        Assert.assertEquals("080000a6", instruction.toHex());
    }

    @Test
    public void test215() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $fp, $t0, $s1");
        Assert.assertEquals("0111f020", instruction.toHex());
    }

    @Test
    public void test216() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t9, $s5, 0xbb");
        Assert.assertEquals("26b900bb", instruction.toHex());
    }

    @Test
    public void test217() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s5, $k0, 0x81");
        Assert.assertEquals("12ba0081", instruction.toHex());
    }

    @Test
    public void test218() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t2, $sp, $k0");
        Assert.assertEquals("03ba5020", instruction.toHex());
    }

    @Test
    public void test219() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $v1, $gp, $t9");
        Assert.assertEquals("03991820", instruction.toHex());
    }

    @Test
    public void test220() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t4, $sp, 90");
        Assert.assertEquals("119d005a", instruction.toHex());
    }

    @Test
    public void test221() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xe7# Comment");
        Assert.assertEquals("080000e7", instruction.toHex());
    }

    @Test
    public void test222() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s4, ($s2)# Comment");
        Assert.assertEquals("ae540000", instruction.toHex());
    }

    @Test
    public void test223() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t5, $t7, $t8");
        Assert.assertEquals("01f86820", instruction.toHex());
    }

    @Test
    public void test224() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $at, $s3, 180");
        Assert.assertEquals("266100b4", instruction.toHex());
    }

    @Test
    public void test225() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t7, 0x18");
        Assert.assertEquals("3c0f0018", instruction.toHex());
    }

    @Test
    public void test226() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s1, 0x96");
        Assert.assertEquals("3c110096", instruction.toHex());
    }

    @Test
    public void test227() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s4, $s7, 0x99# Comment");
        Assert.assertEquals("26f40099", instruction.toHex());
    }

    @Test
    public void test228() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s0, $s4, 0xff35");
        Assert.assertEquals("1614ff35", instruction.toHex());
    }

    @Test
    public void test229() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $v0, $k0, 215");
        Assert.assertEquals("105a00d7", instruction.toHex());
    }

    @Test
    public void test230() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $k0, $t7, 56");
        Assert.assertEquals("134f0038", instruction.toHex());
    }

    @Test
    public void test231() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s6, $a1, $s6# Comment");
        Assert.assertEquals("00b6b022", instruction.toHex());
    }

    @Test
    public void test232() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s5, $t9, $t4");
        Assert.assertEquals("032ca82a", instruction.toHex());
    }

    @Test
    public void test233() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s1, $s6, $a1");
        Assert.assertEquals("02c58820", instruction.toHex());
    }

    @Test
    public void test234() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $ra, $t3, $t0");
        Assert.assertEquals("0168f822", instruction.toHex());
    }

    @Test
    public void test235() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $sp, 0xbd");
        Assert.assertEquals("3c1d00bd", instruction.toHex());
    }

    @Test
    public void test236() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $v0, $a2, $at");
        Assert.assertEquals("00c11024", instruction.toHex());
    }

    @Test
    public void test237() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $k0, ($t0)");
        Assert.assertEquals("ad1a0000", instruction.toHex());
    }

    @Test
    public void test238() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test239() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s0, $a1, $s5# Comment");
        Assert.assertEquals("00b58022", instruction.toHex());
    }

    @Test
    public void test240() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t8, $fp, 0xa6");
        Assert.assertEquals("171e00a6", instruction.toHex());
    }

    @Test
    public void test241() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t7, $t9, 85# Comment");
        Assert.assertEquals("15f90055", instruction.toHex());
    }

    @Test
    public void test242() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test243() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s5, -232($ra)");
        Assert.assertEquals("8ff5ff18", instruction.toHex());
    }

    @Test
    public void test244() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s4, $s1, 186");
        Assert.assertEquals("129100ba", instruction.toHex());
    }

    @Test
    public void test245() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a2, $t0, -85");
        Assert.assertEquals("3506ffab", instruction.toHex());
    }

    @Test
    public void test246() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t4, $zero, $t8");
        Assert.assertEquals("00186025", instruction.toHex());
    }

    @Test
    public void test247() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $gp, $a0, 0xe9");
        Assert.assertEquals("138400e9", instruction.toHex());
    }

    @Test
    public void test248() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xd3");
        Assert.assertEquals("080000d3", instruction.toHex());
    }

    @Test
    public void test249() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t9, 224($s4)");
        Assert.assertEquals("8e9900e0", instruction.toHex());
    }

    @Test
    public void test250() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t5, $s3, $t8");
        Assert.assertEquals("0278682a", instruction.toHex());
    }

    @Test
    public void test251() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $v1, $t1, 0x97");
        Assert.assertEquals("31230097", instruction.toHex());
    }

    @Test
    public void test252() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $a2, $s3, 190");
        Assert.assertEquals("10d300be", instruction.toHex());
    }

    @Test
    public void test253() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s7, ($a1)");
        Assert.assertEquals("8cb70000", instruction.toHex());
    }

    @Test
    public void test254() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s3, $sp, -204");
        Assert.assertEquals("167dff34", instruction.toHex());
    }

    @Test
    public void test255() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t7, 0x22");
        Assert.assertEquals("3c0f0022", instruction.toHex());
    }

    @Test
    public void test256() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t5, $k1, $s0");
        Assert.assertEquals("03706820", instruction.toHex());
    }

    @Test
    public void test257() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s6, $sp, 147");
        Assert.assertEquals("27b60093", instruction.toHex());
    }

    @Test
    public void test258() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x8c");
        Assert.assertEquals("0800008c", instruction.toHex());
    }

    @Test
    public void test259() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t2, ($sp)");
        Assert.assertEquals("afaa0000", instruction.toHex());
    }

    @Test
    public void test260() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $v0, $s0, $t6");
        Assert.assertEquals("020e1024", instruction.toHex());
    }

    @Test
    public void test261() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t3, $sp, 42");
        Assert.assertEquals("27ab002a", instruction.toHex());
    }

    @Test
    public void test262() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t5, ($s5)");
        Assert.assertEquals("8ead0000", instruction.toHex());
    }

    @Test
    public void test263() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $k0, ($t0)");
        Assert.assertEquals("ad1a0000", instruction.toHex());
    }

    @Test
    public void test264() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t4, $t7, 0xff2c");
        Assert.assertEquals("158fff2c", instruction.toHex());
    }

    @Test
    public void test265() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s6, $k0, 189");
        Assert.assertEquals("16da00bd", instruction.toHex());
    }

    @Test
    public void test266() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s6, 0x21# Comment");
        Assert.assertEquals("3c160021", instruction.toHex());
    }

    @Test
    public void test267() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a1, $k0, 173");
        Assert.assertEquals("374500ad", instruction.toHex());
    }

    @Test
    public void test268() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test269() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x23");
        Assert.assertEquals("08000023", instruction.toHex());
    }

    @Test
    public void test270() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s7, $t6, $at");
        Assert.assertEquals("01c1b820", instruction.toHex());
    }

    @Test
    public void test271() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test272() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a3, 0x5e");
        Assert.assertEquals("3c07005e", instruction.toHex());
    }

    @Test
    public void test273() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test274() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $sp, $s4, 213# Comment");
        Assert.assertEquals("17b400d5", instruction.toHex());
    }

    @Test
    public void test275() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t5, 0x82");
        Assert.assertEquals("3c0d0082", instruction.toHex());
    }

    @Test
    public void test276() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s2, $a0, 234# Comment");
        Assert.assertEquals("249200ea", instruction.toHex());
    }

    @Test
    public void test277() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test278() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $gp, $t4, $s5");
        Assert.assertEquals("0195e022", instruction.toHex());
    }

    @Test
    public void test279() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test280() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $v1, -90($k0)");
        Assert.assertEquals("8f43ffa6", instruction.toHex());
    }

    @Test
    public void test281() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $sp, $t6, $sp");
        Assert.assertEquals("01dde824", instruction.toHex());
    }

    @Test
    public void test282() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $k0, 0x3c");
        Assert.assertEquals("3c1a003c", instruction.toHex());
    }

    @Test
    public void test283() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s4, $v1, $at");
        Assert.assertEquals("0061a025", instruction.toHex());
    }

    @Test
    public void test284() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a2, ($s0)");
        Assert.assertEquals("ae060000", instruction.toHex());
    }

    @Test
    public void test285() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s7, $sp, 0xd");
        Assert.assertEquals("27b7000d", instruction.toHex());
    }

    @Test
    public void test286() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t1, $s5, 0xad");
        Assert.assertEquals("36a900ad", instruction.toHex());
    }

    @Test
    public void test287() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t3, $a3, -92");
        Assert.assertEquals("1567ffa4", instruction.toHex());
    }

    @Test
    public void test288() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $k0, $t3, $s2");
        Assert.assertEquals("0172d022", instruction.toHex());
    }

    @Test
    public void test289() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t3, $t1, 61");
        Assert.assertEquals("252b003d", instruction.toHex());
    }

    @Test
    public void test290() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t3, 0x4c");
        Assert.assertEquals("3c0b004c", instruction.toHex());
    }

    @Test
    public void test291() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t1, 0x18");
        Assert.assertEquals("3c090018", instruction.toHex());
    }

    @Test
    public void test292() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test293() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s5, $s5, 0x2b# Comment");
        Assert.assertEquals("36b5002b", instruction.toHex());
    }

    @Test
    public void test294() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s5, $sp, $t9");
        Assert.assertEquals("03b9a825", instruction.toHex());
    }

    @Test
    public void test295() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $fp, -205($v0)");
        Assert.assertEquals("ac5eff33", instruction.toHex());
    }

    @Test
    public void test296() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test297() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t2, $v0, $at");
        Assert.assertEquals("00415020", instruction.toHex());
    }

    @Test
    public void test298() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t2, $k0, 0x54");
        Assert.assertEquals("155a0054", instruction.toHex());
    }

    @Test
    public void test299() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $v1, $ra, $a3");
        Assert.assertEquals("03e71824", instruction.toHex());
    }

    @Test
    public void test300() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a0, -164($k1)");
        Assert.assertEquals("af64ff5c", instruction.toHex());
    }

    @Test
    public void test301() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $a0, $gp, -124");
        Assert.assertEquals("149cff84", instruction.toHex());
    }

    @Test
    public void test302() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s5, $v1, -70");
        Assert.assertEquals("16a3ffba", instruction.toHex());
    }

    @Test
    public void test303() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $a2, $a0, 226# Comment");
        Assert.assertEquals("248600e2", instruction.toHex());
    }

    @Test
    public void test304() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s6, 0x97");
        Assert.assertEquals("3c160097", instruction.toHex());
    }

    @Test
    public void test305() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $at, $t1, $s5");
        Assert.assertEquals("01350824", instruction.toHex());
    }

    @Test
    public void test306() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s6, $a2, 0x80");
        Assert.assertEquals("24d60080", instruction.toHex());
    }

    @Test
    public void test307() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $v1, $t0, $zero");
        Assert.assertEquals("0100182a", instruction.toHex());
    }

    @Test
    public void test308() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x53# Comment");
        Assert.assertEquals("08000053", instruction.toHex());
    }

    @Test
    public void test309() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s6, $ra, $s4");
        Assert.assertEquals("03f4b025", instruction.toHex());
    }

    @Test
    public void test310() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t1, $t5, -185");
        Assert.assertEquals("112dff47", instruction.toHex());
    }

    @Test
    public void test311() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s0, $t5, -155# Comment");
        Assert.assertEquals("120dff65", instruction.toHex());
    }

    @Test
    public void test312() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test313() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $gp, $a1, 0x68");
        Assert.assertEquals("24bc0068", instruction.toHex());
    }

    @Test
    public void test314() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s4, $t1, $t9");
        Assert.assertEquals("0139a02a", instruction.toHex());
    }

    @Test
    public void test315() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $a3, $t0, 51");
        Assert.assertEquals("14e80033", instruction.toHex());
    }

    @Test
    public void test316() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x9c");
        Assert.assertEquals("0800009c", instruction.toHex());
    }

    @Test
    public void test317() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s3, $t6, $s5");
        Assert.assertEquals("01d59825", instruction.toHex());
    }

    @Test
    public void test318() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $at, $t8, $fp");
        Assert.assertEquals("031e0824", instruction.toHex());
    }

    @Test
    public void test319() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $ra, $sp, -61");
        Assert.assertEquals("33bfffc3", instruction.toHex());
    }

    @Test
    public void test320() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t4, $t8, 0x7d");
        Assert.assertEquals("270c007d", instruction.toHex());
    }

    @Test
    public void test321() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a1, 0xab");
        Assert.assertEquals("3c0500ab", instruction.toHex());
    }

    @Test
    public void test322() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t5, $t6, $k0");
        Assert.assertEquals("01da6822", instruction.toHex());
    }

    @Test
    public void test323() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a3, $s5, $fp");
        Assert.assertEquals("02be3825", instruction.toHex());
    }

    @Test
    public void test324() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $a1, $s7, 0xffc2");
        Assert.assertEquals("10b7ffc2", instruction.toHex());
    }

    @Test
    public void test325() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $sp, $t4, $sp");
        Assert.assertEquals("019de825", instruction.toHex());
    }

    @Test
    public void test326() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x99");
        Assert.assertEquals("08000099", instruction.toHex());
    }

    @Test
    public void test327() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $sp, $k0, 0x70");
        Assert.assertEquals("275d0070", instruction.toHex());
    }

    @Test
    public void test328() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t6, $t6, 139");
        Assert.assertEquals("31ce008b", instruction.toHex());
    }

    @Test
    public void test329() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $k0, $t5, $t4");
        Assert.assertEquals("01acd025", instruction.toHex());
    }

    @Test
    public void test330() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a0, $s1, $fp");
        Assert.assertEquals("023e2025", instruction.toHex());
    }

    @Test
    public void test331() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test332() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t3, $t0, $s3# Comment");
        Assert.assertEquals("01135820", instruction.toHex());
    }

    @Test
    public void test333() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test334() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s6, $fp, 0x14");
        Assert.assertEquals("27d60014", instruction.toHex());
    }

    @Test
    public void test335() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t5, $k1, $a2");
        Assert.assertEquals("03666820", instruction.toHex());
    }

    @Test
    public void test336() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $gp, $a0, -114# Comment");
        Assert.assertEquals("1784ff8e", instruction.toHex());
    }

    @Test
    public void test337() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t2, $k1, $k1");
        Assert.assertEquals("037b5022", instruction.toHex());
    }

    @Test
    public void test338() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x19");
        Assert.assertEquals("08000019", instruction.toHex());
    }

    @Test
    public void test339() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s5, $s1, 0x31");
        Assert.assertEquals("32350031", instruction.toHex());
    }

    @Test
    public void test340() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s6, $a2, $a2# Comment");
        Assert.assertEquals("00c6b022", instruction.toHex());
    }

    @Test
    public void test341() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test342() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t3, $t6, -183");
        Assert.assertEquals("35cbff49", instruction.toHex());
    }

    @Test
    public void test343() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t2, 0xe3");
        Assert.assertEquals("3c0a00e3", instruction.toHex());
    }

    @Test
    public void test344() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s0, $s2, $t4");
        Assert.assertEquals("024c8022", instruction.toHex());
    }

    @Test
    public void test345() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test346() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t6, $t9, $a3");
        Assert.assertEquals("03277025", instruction.toHex());
    }

    @Test
    public void test347() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s4, $k0, $s3");
        Assert.assertEquals("0353a022", instruction.toHex());
    }

    @Test
    public void test348() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s6, 0x1b");
        Assert.assertEquals("3c16001b", instruction.toHex());
    }

    @Test
    public void test349() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $fp, $sp, -62");
        Assert.assertEquals("37beffc2", instruction.toHex());
    }

    @Test
    public void test350() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t5, $t9, 0x3d");
        Assert.assertEquals("272d003d", instruction.toHex());
    }

    @Test
    public void test351() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $zero, $t1, $s1");
        Assert.assertEquals("0131002a", instruction.toHex());
    }

    @Test
    public void test352() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x29# Comment");
        Assert.assertEquals("08000029", instruction.toHex());
    }

    @Test
    public void test353() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s5, 0x8");
        Assert.assertEquals("3c150008", instruction.toHex());
    }

    @Test
    public void test354() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $at, $sp, $s2");
        Assert.assertEquals("03b20825", instruction.toHex());
    }

    @Test
    public void test355() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a2, $a0, 0xfff6");
        Assert.assertEquals("3486fff6", instruction.toHex());
    }

    @Test
    public void test356() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s2, $s5, -69");
        Assert.assertEquals("32b2ffbb", instruction.toHex());
    }

    @Test
    public void test357() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test358() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t9, $sp, -37");
        Assert.assertEquals("33b9ffdb", instruction.toHex());
    }

    @Test
    public void test359() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t5, $s4, 0xfffd");
        Assert.assertEquals("328dfffd", instruction.toHex());
    }

    @Test
    public void test360() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s1, $v0, 0xff81");
        Assert.assertEquals("1222ff81", instruction.toHex());
    }

    @Test
    public void test361() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t0, $sp, $k1");
        Assert.assertEquals("03bb4020", instruction.toHex());
    }

    @Test
    public void test362() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $k1, $s5, $t4");
        Assert.assertEquals("02acd822", instruction.toHex());
    }

    @Test
    public void test363() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test364() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $a3, ($t5)");
        Assert.assertEquals("8da70000", instruction.toHex());
    }

    @Test
    public void test365() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xe0");
        Assert.assertEquals("080000e0", instruction.toHex());
    }

    @Test
    public void test366() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t6, $ra, 0xff57");
        Assert.assertEquals("15dfff57", instruction.toHex());
    }

    @Test
    public void test367() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test368() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $at, $t6, $t0");
        Assert.assertEquals("01c80822", instruction.toHex());
    }

    @Test
    public void test369() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s0, 239($s3)");
        Assert.assertEquals("ae7000ef", instruction.toHex());
    }

    @Test
    public void test370() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x21");
        Assert.assertEquals("08000021", instruction.toHex());
    }

    @Test
    public void test371() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s4, 224($s1)");
        Assert.assertEquals("ae3400e0", instruction.toHex());
    }

    @Test
    public void test372() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $at, $a3, 176");
        Assert.assertEquals("24e100b0", instruction.toHex());
    }

    @Test
    public void test373() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $v0, $t6, $t7");
        Assert.assertEquals("01cf1020", instruction.toHex());
    }

    @Test
    public void test374() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a0, 143($gp)");
        Assert.assertEquals("af84008f", instruction.toHex());
    }

    @Test
    public void test375() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x8e");
        Assert.assertEquals("0800008e", instruction.toHex());
    }

    @Test
    public void test376() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $ra, $a0, $v1");
        Assert.assertEquals("0083f820", instruction.toHex());
    }

    @Test
    public void test377() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test378() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s6, $s6, $ra");
        Assert.assertEquals("02dfb025", instruction.toHex());
    }

    @Test
    public void test379() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s5, ($t1)");
        Assert.assertEquals("ad350000", instruction.toHex());
    }

    @Test
    public void test380() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $at, $t3, $a1");
        Assert.assertEquals("01650822", instruction.toHex());
    }

    @Test
    public void test381() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t2, $at, 91");
        Assert.assertEquals("242a005b", instruction.toHex());
    }

    @Test
    public void test382() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t5, $v0, $t1");
        Assert.assertEquals("00496820", instruction.toHex());
    }

    @Test
    public void test383() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t5, $t7, $at# Comment");
        Assert.assertEquals("01e1682a", instruction.toHex());
    }

    @Test
    public void test384() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t9, $s0, 0xcd");
        Assert.assertEquals("321900cd", instruction.toHex());
    }

    @Test
    public void test385() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t2, $s7, -201");
        Assert.assertEquals("36eaff37", instruction.toHex());
    }

    @Test
    public void test386() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $sp, $gp, $ra");
        Assert.assertEquals("039fe824", instruction.toHex());
    }

    @Test
    public void test387() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $k1, $s5, 165");
        Assert.assertEquals("36bb00a5", instruction.toHex());
    }

    @Test
    public void test388() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $gp, ($t1)");
        Assert.assertEquals("ad3c0000", instruction.toHex());
    }

    @Test
    public void test389() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t7, $s1, 0xff5a");
        Assert.assertEquals("15f1ff5a", instruction.toHex());
    }

    @Test
    public void test390() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x1e");
        Assert.assertEquals("0800001e", instruction.toHex());
    }

    @Test
    public void test391() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test392() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t4, -103($a2)# Comment");
        Assert.assertEquals("8cccff99", instruction.toHex());
    }

    @Test
    public void test393() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t9, $t7, -117");
        Assert.assertEquals("132fff8b", instruction.toHex());
    }

    @Test
    public void test394() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t3, $t4, 248");
        Assert.assertEquals("318b00f8", instruction.toHex());
    }

    @Test
    public void test395() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s4, $s2, 0x95# Comment");
        Assert.assertEquals("32540095", instruction.toHex());
    }

    @Test
    public void test396() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s6, $sp, 108");
        Assert.assertEquals("27b6006c", instruction.toHex());
    }

    @Test
    public void test397() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $gp, $v0, 0x4e");
        Assert.assertEquals("245c004e", instruction.toHex());
    }

    @Test
    public void test398() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $fp, $s5, $a1");
        Assert.assertEquals("02a5f020", instruction.toHex());
    }

    @Test
    public void test399() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s4, $t6, $t8");
        Assert.assertEquals("01d8a02a", instruction.toHex());
    }

    @Test
    public void test400() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a3, 0xb2");
        Assert.assertEquals("3c0700b2", instruction.toHex());
    }

    @Test
    public void test401() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test402() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $ra, $ra, $v0");
        Assert.assertEquals("03e2f82a", instruction.toHex());
    }

    @Test
    public void test403() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $a3, $s6, 192");
        Assert.assertEquals("10f600c0", instruction.toHex());
    }

    @Test
    public void test404() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s0, 124($zero)# Comment");
        Assert.assertEquals("ac10007c", instruction.toHex());
    }

    @Test
    public void test405() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $fp, ($t5)");
        Assert.assertEquals("8dbe0000", instruction.toHex());
    }

    @Test
    public void test406() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $k0, $s6, $t2");
        Assert.assertEquals("02cad024", instruction.toHex());
    }

    @Test
    public void test407() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $v1, $t7, 0xffe9");
        Assert.assertEquals("106fffe9", instruction.toHex());
    }

    @Test
    public void test408() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t8, $a1, 221");
        Assert.assertEquals("170500dd", instruction.toHex());
    }

    @Test
    public void test409() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t8, 0xbd");
        Assert.assertEquals("3c1800bd", instruction.toHex());
    }

    @Test
    public void test410() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s4, $s2, 0xfffa");
        Assert.assertEquals("3254fffa", instruction.toHex());
    }

    @Test
    public void test411() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $v0, $a1, $fp");
        Assert.assertEquals("00be1024", instruction.toHex());
    }

    @Test
    public void test412() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t5, $t0, $t2");
        Assert.assertEquals("010a6824", instruction.toHex());
    }

    @Test
    public void test413() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a1, $v1, $t9");
        Assert.assertEquals("00792824", instruction.toHex());
    }

    @Test
    public void test414() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xad");
        Assert.assertEquals("080000ad", instruction.toHex());
    }

    @Test
    public void test415() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $gp, -138($t3)");
        Assert.assertEquals("8d7cff76", instruction.toHex());
    }

    @Test
    public void test416() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s2, $s3, 72");
        Assert.assertEquals("36720048", instruction.toHex());
    }

    @Test
    public void test417() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $v1, 0xf3");
        Assert.assertEquals("3c0300f3", instruction.toHex());
    }

    @Test
    public void test418() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $k1, $s7, 207");
        Assert.assertEquals("36fb00cf", instruction.toHex());
    }

    @Test
    public void test419() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x17");
        Assert.assertEquals("08000017", instruction.toHex());
    }

    @Test
    public void test420() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a0, $s4, $fp");
        Assert.assertEquals("029e2020", instruction.toHex());
    }

    @Test
    public void test421() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s2, $zero, $s6");
        Assert.assertEquals("00169024", instruction.toHex());
    }

    @Test
    public void test422() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s5, $a2, 103");
        Assert.assertEquals("34d50067", instruction.toHex());
    }

    @Test
    public void test423() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $sp, 0x5b");
        Assert.assertEquals("3c1d005b", instruction.toHex());
    }

    @Test
    public void test424() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t3, $a1, $t9");
        Assert.assertEquals("00b95820", instruction.toHex());
    }

    @Test
    public void test425() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s5, $a2, 0xff51");
        Assert.assertEquals("16a6ff51", instruction.toHex());
    }

    @Test
    public void test426() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $k1, $t0, $s0");
        Assert.assertEquals("0110d825", instruction.toHex());
    }

    @Test
    public void test427() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t3, -249($k1)");
        Assert.assertEquals("8f6bff07", instruction.toHex());
    }

    @Test
    public void test428() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s1, $t6, $a2");
        Assert.assertEquals("01c68824", instruction.toHex());
    }

    @Test
    public void test429() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s1, 0x7b# Comment");
        Assert.assertEquals("3c11007b", instruction.toHex());
    }

    @Test
    public void test430() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $v0, $a2, $t9");
        Assert.assertEquals("00d91020", instruction.toHex());
    }

    @Test
    public void test431() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s7, $s2, $v1");
        Assert.assertEquals("0243b82a", instruction.toHex());
    }

    @Test
    public void test432() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $k1, $a1, 0xff98");
        Assert.assertEquals("1365ff98", instruction.toHex());
    }

    @Test
    public void test433() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a1, $v0, $s3");
        Assert.assertEquals("00532825", instruction.toHex());
    }

    @Test
    public void test434() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s4, $k1, 0x17");
        Assert.assertEquals("37740017", instruction.toHex());
    }

    @Test
    public void test435() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x5");
        Assert.assertEquals("08000005", instruction.toHex());
    }

    @Test
    public void test436() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x6f# Comment");
        Assert.assertEquals("0800006f", instruction.toHex());
    }

    @Test
    public void test437() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s0, $s6, $v1");
        Assert.assertEquals("02c38025", instruction.toHex());
    }

    @Test
    public void test438() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a1, 201($t4)");
        Assert.assertEquals("ad8500c9", instruction.toHex());
    }

    @Test
    public void test439() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x3b");
        Assert.assertEquals("0800003b", instruction.toHex());
    }

    @Test
    public void test440() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t0, $t1, 0xff6c# Comment");
        Assert.assertEquals("3128ff6c", instruction.toHex());
    }

    @Test
    public void test441() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test442() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x59");
        Assert.assertEquals("08000059", instruction.toHex());
    }

    @Test
    public void test443() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s1, $v1, $a1# Comment");
        Assert.assertEquals("00658824", instruction.toHex());
    }

    @Test
    public void test444() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s2, 0xbb");
        Assert.assertEquals("3c1200bb", instruction.toHex());
    }

    @Test
    public void test445() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t1, $a2, 0xff90");
        Assert.assertEquals("34c9ff90", instruction.toHex());
    }

    @Test
    public void test446() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xe5");
        Assert.assertEquals("080000e5", instruction.toHex());
    }

    @Test
    public void test447() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t3, $s4, 0xe7");
        Assert.assertEquals("268b00e7", instruction.toHex());
    }

    @Test
    public void test448() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $a3, $t7, 0x8");
        Assert.assertEquals("31e70008", instruction.toHex());
    }

    @Test
    public void test449() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a1, $t3, -204");
        Assert.assertEquals("3565ff34", instruction.toHex());
    }

    @Test
    public void test450() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s2, ($t8)");
        Assert.assertEquals("af120000", instruction.toHex());
    }

    @Test
    public void test451() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t4, $a0, $s3");
        Assert.assertEquals("00936024", instruction.toHex());
    }

    @Test
    public void test452() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test453() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t4, -214($v1)");
        Assert.assertEquals("ac6cff2a", instruction.toHex());
    }

    @Test
    public void test454() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a0, 0xb9");
        Assert.assertEquals("3c0400b9", instruction.toHex());
    }

    @Test
    public void test455() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $a0, $s2, 0x58# Comment");
        Assert.assertEquals("10920058", instruction.toHex());
    }

    @Test
    public void test456() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x48# Comment");
        Assert.assertEquals("08000048", instruction.toHex());
    }

    @Test
    public void test457() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s4, 0xb0");
        Assert.assertEquals("3c1400b0", instruction.toHex());
    }

    @Test
    public void test458() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test459() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $zero, $zero, $t3");
        Assert.assertEquals("000b0020", instruction.toHex());
    }

    @Test
    public void test460() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s6, 0xa6");
        Assert.assertEquals("3c1600a6", instruction.toHex());
    }

    @Test
    public void test461() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test462() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t5, 220($v1)");
        Assert.assertEquals("8c6d00dc", instruction.toHex());
    }

    @Test
    public void test463() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $v1, $t4, $v0");
        Assert.assertEquals("01821825", instruction.toHex());
    }

    @Test
    public void test464() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t3, $s7, $s1");
        Assert.assertEquals("02f15822", instruction.toHex());
    }

    @Test
    public void test465() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x4e");
        Assert.assertEquals("0800004e", instruction.toHex());
    }

    @Test
    public void test466() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $at, $t7, $a2");
        Assert.assertEquals("01e60825", instruction.toHex());
    }

    @Test
    public void test467() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s3, -26($a0)");
        Assert.assertEquals("8c93ffe6", instruction.toHex());
    }

    @Test
    public void test468() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x84");
        Assert.assertEquals("08000084", instruction.toHex());
    }

    @Test
    public void test469() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t8, $a3, $t2");
        Assert.assertEquals("00eac020", instruction.toHex());
    }

    @Test
    public void test470() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $gp, $gp, -106");
        Assert.assertEquals("379cff96", instruction.toHex());
    }

    @Test
    public void test471() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s7, $k0, 248");
        Assert.assertEquals("275700f8", instruction.toHex());
    }

    @Test
    public void test472() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s7, $s3, $s0");
        Assert.assertEquals("0270b825", instruction.toHex());
    }

    @Test
    public void test473() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t3, $v0, 27");
        Assert.assertEquals("304b001b", instruction.toHex());
    }

    @Test
    public void test474() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s6, ($t1)");
        Assert.assertEquals("ad360000", instruction.toHex());
    }

    @Test
    public void test475() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a0, $s6, 0x0");
        Assert.assertEquals("36c40000", instruction.toHex());
    }

    @Test
    public void test476() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $at, $ra, 0xff84");
        Assert.assertEquals("143fff84", instruction.toHex());
    }

    @Test
    public void test477() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s2, -93($s7)");
        Assert.assertEquals("aef2ffa3", instruction.toHex());
    }

    @Test
    public void test478() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a1, $gp, -48# Comment");
        Assert.assertEquals("3785ffd0", instruction.toHex());
    }

    @Test
    public void test479() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x97");
        Assert.assertEquals("08000097", instruction.toHex());
    }

    @Test
    public void test480() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a0, $t6, $fp# Comment");
        Assert.assertEquals("01de2025", instruction.toHex());
    }

    @Test
    public void test481() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s6, 0x83");
        Assert.assertEquals("3c160083", instruction.toHex());
    }

    @Test
    public void test482() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t0, $k1, $s6");
        Assert.assertEquals("03764024", instruction.toHex());
    }

    @Test
    public void test483() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t3, $fp, $t3");
        Assert.assertEquals("03cb5825", instruction.toHex());
    }

    @Test
    public void test484() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s0, $a0, $s7");
        Assert.assertEquals("00978024", instruction.toHex());
    }

    @Test
    public void test485() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s3, $a0, $t9");
        Assert.assertEquals("00999824", instruction.toHex());
    }

    @Test
    public void test486() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $ra, $t3, $s0");
        Assert.assertEquals("0170f82a", instruction.toHex());
    }

    @Test
    public void test487() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test488() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $a1, $t2, $s2");
        Assert.assertEquals("01522822", instruction.toHex());
    }

    @Test
    public void test489() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $v0, $s4, 0xff86");
        Assert.assertEquals("1454ff86", instruction.toHex());
    }

    @Test
    public void test490() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $v0, 0xae");
        Assert.assertEquals("3c0200ae", instruction.toHex());
    }

    @Test
    public void test491() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a0, $zero, -52");
        Assert.assertEquals("3404ffcc", instruction.toHex());
    }

    @Test
    public void test492() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $fp, ($at)");
        Assert.assertEquals("8c3e0000", instruction.toHex());
    }

    @Test
    public void test493() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $fp, $a0, $gp");
        Assert.assertEquals("009cf02a", instruction.toHex());
    }

    @Test
    public void test494() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t3, $a3, $a2");
        Assert.assertEquals("00e6582a", instruction.toHex());
    }

    @Test
    public void test495() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s4, 126($t0)");
        Assert.assertEquals("ad14007e", instruction.toHex());
    }

    @Test
    public void test496() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $k0, 0x25");
        Assert.assertEquals("3c1a0025", instruction.toHex());
    }

    @Test
    public void test497() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $k1, -232($k1)");
        Assert.assertEquals("8f7bff18", instruction.toHex());
    }

    @Test
    public void test498() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a1, $s1, -156");
        Assert.assertEquals("3625ff64", instruction.toHex());
    }

    @Test
    public void test499() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xfa");
        Assert.assertEquals("080000fa", instruction.toHex());
    }

    @Test
    public void test500() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t4, $t2, $a2");
        Assert.assertEquals("01466024", instruction.toHex());
    }

    @Test
    public void test501() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s6, $t7, $t0");
        Assert.assertEquals("01e8b022", instruction.toHex());
    }

    @Test
    public void test502() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t6, $gp, 134");
        Assert.assertEquals("378e0086", instruction.toHex());
    }

    @Test
    public void test503() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x8");
        Assert.assertEquals("08000008", instruction.toHex());
    }

    @Test
    public void test504() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s6, 0xf1");
        Assert.assertEquals("3c1600f1", instruction.toHex());
    }

    @Test
    public void test505() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x4d");
        Assert.assertEquals("0800004d", instruction.toHex());
    }

    @Test
    public void test506() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t3, ($t0)");
        Assert.assertEquals("8d0b0000", instruction.toHex());
    }

    @Test
    public void test507() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t2, 0x6d");
        Assert.assertEquals("3c0a006d", instruction.toHex());
    }

    @Test
    public void test508() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s4, $v1, $t6");
        Assert.assertEquals("006ea022", instruction.toHex());
    }

    @Test
    public void test509() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s3, $t9, 0x31");
        Assert.assertEquals("12790031", instruction.toHex());
    }

    @Test
    public void test510() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t6, $t4, $t0");
        Assert.assertEquals("01887022", instruction.toHex());
    }

    @Test
    public void test511() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s6, $s2, 164");
        Assert.assertEquals("16d200a4", instruction.toHex());
    }

    @Test
    public void test512() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $v0, $sp, 0xb3");
        Assert.assertEquals("37a200b3", instruction.toHex());
    }

    @Test
    public void test513() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s7, $v0, -20");
        Assert.assertEquals("16e2ffec", instruction.toHex());
    }

    @Test
    public void test514() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $v0, $s7, -155");
        Assert.assertEquals("1457ff65", instruction.toHex());
    }

    @Test
    public void test515() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t0, $zero, $t5");
        Assert.assertEquals("000d4022", instruction.toHex());
    }

    @Test
    public void test516() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s7, $a3, $s3");
        Assert.assertEquals("00f3b822", instruction.toHex());
    }

    @Test
    public void test517() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s1, 0xd5");
        Assert.assertEquals("3c1100d5", instruction.toHex());
    }

    @Test
    public void test518() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $a1, $s1, 0x6c");
        Assert.assertEquals("2625006c", instruction.toHex());
    }

    @Test
    public void test519() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $ra, ($t9)");
        Assert.assertEquals("af3f0000", instruction.toHex());
    }

    @Test
    public void test520() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test521() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x61");
        Assert.assertEquals("08000061", instruction.toHex());
    }

    @Test
    public void test522() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test523() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s2, $t0, $s2");
        Assert.assertEquals("01129020", instruction.toHex());
    }

    @Test
    public void test524() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x3c");
        Assert.assertEquals("0800003c", instruction.toHex());
    }

    @Test
    public void test525() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s6, $t4, 148");
        Assert.assertEquals("31960094", instruction.toHex());
    }

    @Test
    public void test526() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s5, $a3, $s5");
        Assert.assertEquals("00f5a825", instruction.toHex());
    }

    @Test
    public void test527() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s4, -147($at)");
        Assert.assertEquals("8c34ff6d", instruction.toHex());
    }

    @Test
    public void test528() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a2, $t4, $k0");
        Assert.assertEquals("019a3024", instruction.toHex());
    }

    @Test
    public void test529() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t7, $ra, $a3# Comment");
        Assert.assertEquals("03e77820", instruction.toHex());
    }

    @Test
    public void test530() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test531() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s3, -17($t7)");
        Assert.assertEquals("8df3ffef", instruction.toHex());
    }

    @Test
    public void test532() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s1, $s5, 0xff2c# Comment");
        Assert.assertEquals("1235ff2c", instruction.toHex());
    }

    @Test
    public void test533() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s5, $zero, $gp# Comment");
        Assert.assertEquals("001ca822", instruction.toHex());
    }

    @Test
    public void test534() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a3, 0x5b");
        Assert.assertEquals("3c07005b", instruction.toHex());
    }

    @Test
    public void test535() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a1, -209($a0)");
        Assert.assertEquals("ac85ff2f", instruction.toHex());
    }

    @Test
    public void test536() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s2, 0x8b");
        Assert.assertEquals("3c12008b", instruction.toHex());
    }

    @Test
    public void test537() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $v1, $t9, $t6");
        Assert.assertEquals("032e1824", instruction.toHex());
    }

    @Test
    public void test538() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t9, $k1, $t0");
        Assert.assertEquals("0368c820", instruction.toHex());
    }

    @Test
    public void test539() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s3, $s5, $fp");
        Assert.assertEquals("02be982a", instruction.toHex());
    }

    @Test
    public void test540() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $k0, ($fp)");
        Assert.assertEquals("8fda0000", instruction.toHex());
    }

    @Test
    public void test541() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t9, $s6, -198");
        Assert.assertEquals("36d9ff3a", instruction.toHex());
    }

    @Test
    public void test542() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xec# Comment");
        Assert.assertEquals("080000ec", instruction.toHex());
    }

    @Test
    public void test543() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t3, $s6, -78# Comment");
        Assert.assertEquals("1176ffb2", instruction.toHex());
    }

    @Test
    public void test544() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t1, 217($a2)");
        Assert.assertEquals("acc900d9", instruction.toHex());
    }

    @Test
    public void test545() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $a3, $v1, -60");
        Assert.assertEquals("14e3ffc4", instruction.toHex());
    }

    @Test
    public void test546() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s5, $s5, 74");
        Assert.assertEquals("26b5004a", instruction.toHex());
    }

    @Test
    public void test547() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $sp, ($a3)# Comment");
        Assert.assertEquals("acfd0000", instruction.toHex());
    }

    @Test
    public void test548() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t2, $s1, $t7");
        Assert.assertEquals("022f5025", instruction.toHex());
    }

    @Test
    public void test549() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x31");
        Assert.assertEquals("08000031", instruction.toHex());
    }

    @Test
    public void test550() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s0, $v1, $ra");
        Assert.assertEquals("007f8025", instruction.toHex());
    }

    @Test
    public void test551() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t3, 0x8");
        Assert.assertEquals("3c0b0008", instruction.toHex());
    }

    @Test
    public void test552() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s1, $s1, 0xf6");
        Assert.assertEquals("363100f6", instruction.toHex());
    }

    @Test
    public void test553() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s3, $a0, $t3");
        Assert.assertEquals("008b9824", instruction.toHex());
    }

    @Test
    public void test554() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $k0, $a3, $v1");
        Assert.assertEquals("00e3d02a", instruction.toHex());
    }

    @Test
    public void test555() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $k0, $k1, $s3");
        Assert.assertEquals("0373d024", instruction.toHex());
    }

    @Test
    public void test556() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a0, 231($a0)# Comment");
        Assert.assertEquals("ac8400e7", instruction.toHex());
    }

    @Test
    public void test557() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s5, $s7, $a3");
        Assert.assertEquals("02e7a82a", instruction.toHex());
    }

    @Test
    public void test558() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t2, $ra, 233");
        Assert.assertEquals("33ea00e9", instruction.toHex());
    }

    @Test
    public void test559() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t4, $t8, 0x5b");
        Assert.assertEquals("370c005b", instruction.toHex());
    }

    @Test
    public void test560() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s4, $a1, -215# Comment");
        Assert.assertEquals("34b4ff29", instruction.toHex());
    }

    @Test
    public void test561() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $fp, $t5, 95");
        Assert.assertEquals("25be005f", instruction.toHex());
    }

    @Test
    public void test562() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $fp, $t1, $t7# Comment");
        Assert.assertEquals("012ff024", instruction.toHex());
    }

    @Test
    public void test563() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t5, ($t4)");
        Assert.assertEquals("ad8d0000", instruction.toHex());
    }

    @Test
    public void test564() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s7, $s1, -99");
        Assert.assertEquals("3237ff9d", instruction.toHex());
    }

    @Test
    public void test565() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t8, $t0, $sp");
        Assert.assertEquals("011dc022", instruction.toHex());
    }

    @Test
    public void test566() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test567() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $k0, $a3, 0xd2");
        Assert.assertEquals("24fa00d2", instruction.toHex());
    }

    @Test
    public void test568() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $at, $t4, 0xc");
        Assert.assertEquals("3181000c", instruction.toHex());
    }

    @Test
    public void test569() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a0, $v1, $a0");
        Assert.assertEquals("00642020", instruction.toHex());
    }

    @Test
    public void test570() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $gp, $a1, 166");
        Assert.assertEquals("34bc00a6", instruction.toHex());
    }

    @Test
    public void test571() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s3, $at, $gp");
        Assert.assertEquals("003c9822", instruction.toHex());
    }

    @Test
    public void test572() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t4, $s5, -256");
        Assert.assertEquals("36acff00", instruction.toHex());
    }

    @Test
    public void test573() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s6, ($s3)");
        Assert.assertEquals("ae760000", instruction.toHex());
    }

    @Test
    public void test574() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $sp, $t0, 167");
        Assert.assertEquals("13a800a7", instruction.toHex());
    }

    @Test
    public void test575() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x26");
        Assert.assertEquals("08000026", instruction.toHex());
    }

    @Test
    public void test576() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $sp, ($t6)");
        Assert.assertEquals("addd0000", instruction.toHex());
    }

    @Test
    public void test577() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s0, $a3, -238");
        Assert.assertEquals("1607ff12", instruction.toHex());
    }

    @Test
    public void test578() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s6, $t8, $zero");
        Assert.assertEquals("0300b024", instruction.toHex());
    }

    @Test
    public void test579() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a3, $s2, $t6");
        Assert.assertEquals("024e3825", instruction.toHex());
    }

    @Test
    public void test580() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s4, $v1, 164");
        Assert.assertEquals("247400a4", instruction.toHex());
    }

    @Test
    public void test581() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s2, $a2, 45");
        Assert.assertEquals("24d2002d", instruction.toHex());
    }

    @Test
    public void test582() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a3, 94($k1)");
        Assert.assertEquals("af67005e", instruction.toHex());
    }

    @Test
    public void test583() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s2, $zero, $a3");
        Assert.assertEquals("0007902a", instruction.toHex());
    }

    @Test
    public void test584() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $k1, $s6, -112");
        Assert.assertEquals("36dbff90", instruction.toHex());
    }

    @Test
    public void test585() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $ra, $fp, 0xffa9");
        Assert.assertEquals("13feffa9", instruction.toHex());
    }

    @Test
    public void test586() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $sp, $sp, 139");
        Assert.assertEquals("37bd008b", instruction.toHex());
    }

    @Test
    public void test587() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t9, $s4, $t9");
        Assert.assertEquals("0299c820", instruction.toHex());
    }

    @Test
    public void test588() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $v0, $at, 0xc5");
        Assert.assertEquals("342200c5", instruction.toHex());
    }

    @Test
    public void test589() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $zero, $t3, 0xdf");
        Assert.assertEquals("100b00df", instruction.toHex());
    }

    @Test
    public void test590() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t5, $t4, 0xffbd");
        Assert.assertEquals("15acffbd", instruction.toHex());
    }

    @Test
    public void test591() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x49");
        Assert.assertEquals("08000049", instruction.toHex());
    }

    @Test
    public void test592() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a0, $zero, $zero");
        Assert.assertEquals("00002024", instruction.toHex());
    }

    @Test
    public void test593() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $v1, ($t5)");
        Assert.assertEquals("8da30000", instruction.toHex());
    }

    @Test
    public void test594() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a1, $s3, $v0");
        Assert.assertEquals("02622825", instruction.toHex());
    }

    @Test
    public void test595() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t1, $s0, -254");
        Assert.assertEquals("3609ff02", instruction.toHex());
    }

    @Test
    public void test596() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t4, $t1, 74");
        Assert.assertEquals("352c004a", instruction.toHex());
    }

    @Test
    public void test597() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t2, 8($zero)");
        Assert.assertEquals("8c0a0008", instruction.toHex());
    }

    @Test
    public void test598() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t6, $a2, $t3");
        Assert.assertEquals("00cb7022", instruction.toHex());
    }

    @Test
    public void test599() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $v0, $t0, 0xffb8");
        Assert.assertEquals("3502ffb8", instruction.toHex());
    }

    @Test
    public void test600() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s7, 129($t1)");
        Assert.assertEquals("8d370081", instruction.toHex());
    }

    @Test
    public void test601() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s0, $zero, 0x57");
        Assert.assertEquals("24100057", instruction.toHex());
    }

    @Test
    public void test602() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s4, 0xc4");
        Assert.assertEquals("3c1400c4", instruction.toHex());
    }

    @Test
    public void test603() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t8, $ra, 0x8c");
        Assert.assertEquals("27f8008c", instruction.toHex());
    }

    @Test
    public void test604() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a1, $t3, 0xffdc");
        Assert.assertEquals("3565ffdc", instruction.toHex());
    }

    @Test
    public void test605() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $fp, 0x54");
        Assert.assertEquals("3c1e0054", instruction.toHex());
    }

    @Test
    public void test606() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $k1, $at, $s4");
        Assert.assertEquals("0034d820", instruction.toHex());
    }

    @Test
    public void test607() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t8, $t4, -39");
        Assert.assertEquals("3598ffd9", instruction.toHex());
    }

    @Test
    public void test608() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t9, 41($t8)");
        Assert.assertEquals("af190029", instruction.toHex());
    }

    @Test
    public void test609() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t5, $t1, $gp");
        Assert.assertEquals("013c6822", instruction.toHex());
    }

    @Test
    public void test610() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xb1# Comment");
        Assert.assertEquals("080000b1", instruction.toHex());
    }

    @Test
    public void test611() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a1, $t8, 0xff07# Comment");
        Assert.assertEquals("3705ff07", instruction.toHex());
    }

    @Test
    public void test612() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a2, 0x88");
        Assert.assertEquals("3c060088", instruction.toHex());
    }

    @Test
    public void test613() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $v1, $t0, $a3");
        Assert.assertEquals("01071824", instruction.toHex());
    }

    @Test
    public void test614() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t5, $k0, 127");
        Assert.assertEquals("274d007f", instruction.toHex());
    }

    @Test
    public void test615() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t5, ($zero)");
        Assert.assertEquals("8c0d0000", instruction.toHex());
    }

    @Test
    public void test616() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $ra, 97($t8)");
        Assert.assertEquals("af1f0061", instruction.toHex());
    }

    @Test
    public void test617() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $at, $s7, -36");
        Assert.assertEquals("32e1ffdc", instruction.toHex());
    }

    @Test
    public void test618() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t5, $at, $k0");
        Assert.assertEquals("003a6825", instruction.toHex());
    }

    @Test
    public void test619() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $ra, $v0, 0xff60");
        Assert.assertEquals("305fff60", instruction.toHex());
    }

    @Test
    public void test620() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $a2, $v0, 0xff87# Comment");
        Assert.assertEquals("10c2ff87", instruction.toHex());
    }

    @Test
    public void test621() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $gp, 50($a2)");
        Assert.assertEquals("8cdc0032", instruction.toHex());
    }

    @Test
    public void test622() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x7e");
        Assert.assertEquals("0800007e", instruction.toHex());
    }

    @Test
    public void test623() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a1, $s0, $t6");
        Assert.assertEquals("020e2820", instruction.toHex());
    }

    @Test
    public void test624() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $sp, $t1, 0x1c");
        Assert.assertEquals("253d001c", instruction.toHex());
    }

    @Test
    public void test625() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $k1, 0xfa");
        Assert.assertEquals("3c1b00fa", instruction.toHex());
    }

    @Test
    public void test626() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xb8");
        Assert.assertEquals("080000b8", instruction.toHex());
    }

    @Test
    public void test627() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x93");
        Assert.assertEquals("08000093", instruction.toHex());
    }

    @Test
    public void test628() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $v0, $s4, $k0");
        Assert.assertEquals("029a1020", instruction.toHex());
    }

    @Test
    public void test629() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s0, $t0, $sp");
        Assert.assertEquals("011d8025", instruction.toHex());
    }

    @Test
    public void test630() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $fp, $a3, 135");
        Assert.assertEquals("17c70087", instruction.toHex());
    }

    @Test
    public void test631() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s5, ($t4)");
        Assert.assertEquals("ad950000", instruction.toHex());
    }

    @Test
    public void test632() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test633() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a0, $a1, $s5");
        Assert.assertEquals("00b52025", instruction.toHex());
    }

    @Test
    public void test634() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $k1, $t6, 0xff4b");
        Assert.assertEquals("31dbff4b", instruction.toHex());
    }

    @Test
    public void test635() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t9, 0xd7");
        Assert.assertEquals("3c1900d7", instruction.toHex());
    }

    @Test
    public void test636() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $k1, ($s3)");
        Assert.assertEquals("8e7b0000", instruction.toHex());
    }

    @Test
    public void test637() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t9, $t2, 0xfb");
        Assert.assertEquals("255900fb", instruction.toHex());
    }

    @Test
    public void test638() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $ra, ($at)");
        Assert.assertEquals("ac3f0000", instruction.toHex());
    }

    @Test
    public void test639() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xad");
        Assert.assertEquals("080000ad", instruction.toHex());
    }

    @Test
    public void test640() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $gp, $t1, $zero");
        Assert.assertEquals("0120e02a", instruction.toHex());
    }

    @Test
    public void test641() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t7, ($at)");
        Assert.assertEquals("ac2f0000", instruction.toHex());
    }

    @Test
    public void test642() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test643() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a3, 0x72");
        Assert.assertEquals("3c070072", instruction.toHex());
    }

    @Test
    public void test644() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s3, $a2, $fp");
        Assert.assertEquals("00de9820", instruction.toHex());
    }

    @Test
    public void test645() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $zero, $t6, $s2");
        Assert.assertEquals("01d20025", instruction.toHex());
    }

    @Test
    public void test646() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $a3, $at, $t7");
        Assert.assertEquals("002f382a", instruction.toHex());
    }

    @Test
    public void test647() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t1, $t0, 0xff1d");
        Assert.assertEquals("1128ff1d", instruction.toHex());
    }

    @Test
    public void test648() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x43");
        Assert.assertEquals("08000043", instruction.toHex());
    }

    @Test
    public void test649() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $v1, $at, 74");
        Assert.assertEquals("1061004a", instruction.toHex());
    }

    @Test
    public void test650() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $a1, $s6, $s1");
        Assert.assertEquals("02d1282a", instruction.toHex());
    }

    @Test
    public void test651() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $v0, ($s6)");
        Assert.assertEquals("8ec20000", instruction.toHex());
    }

    @Test
    public void test652() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a3, $zero, 0xe3");
        Assert.assertEquals("340700e3", instruction.toHex());
    }

    @Test
    public void test653() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s5, $t3, -157");
        Assert.assertEquals("16abff63", instruction.toHex());
    }

    @Test
    public void test654() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xb9");
        Assert.assertEquals("080000b9", instruction.toHex());
    }

    @Test
    public void test655() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test656() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $v1, -218($k1)");
        Assert.assertEquals("8f63ff26", instruction.toHex());
    }

    @Test
    public void test657() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t3, $s0, 0x3c");
        Assert.assertEquals("260b003c", instruction.toHex());
    }

    @Test
    public void test658() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $v1, $s1, 0x1b");
        Assert.assertEquals("2623001b", instruction.toHex());
    }

    @Test
    public void test659() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a2, $s0, $v0");
        Assert.assertEquals("02023020", instruction.toHex());
    }

    @Test
    public void test660() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t0, $a2, $sp");
        Assert.assertEquals("00dd4022", instruction.toHex());
    }

    @Test
    public void test661() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $s4, $s1, $a3# Comment");
        Assert.assertEquals("0227a024", instruction.toHex());
    }

    @Test
    public void test662() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s6, $s6, 36");
        Assert.assertEquals("36d60024", instruction.toHex());
    }

    @Test
    public void test663() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $sp, $t7, 4");
        Assert.assertEquals("25fd0004", instruction.toHex());
    }

    @Test
    public void test664() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s6, $a3, 0xff99");
        Assert.assertEquals("30f6ff99", instruction.toHex());
    }

    @Test
    public void test665() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t9, $s0, 0x94");
        Assert.assertEquals("32190094", instruction.toHex());
    }

    @Test
    public void test666() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x21");
        Assert.assertEquals("08000021", instruction.toHex());
    }

    @Test
    public void test667() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a0, $t3, $t8");
        Assert.assertEquals("01782024", instruction.toHex());
    }

    @Test
    public void test668() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t3, $t6, $t2");
        Assert.assertEquals("01ca5825", instruction.toHex());
    }

    @Test
    public void test669() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $gp, $t7, $at");
        Assert.assertEquals("01e1e020", instruction.toHex());
    }

    @Test
    public void test670() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $ra, ($k1)");
        Assert.assertEquals("af7f0000", instruction.toHex());
    }

    @Test
    public void test671() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t3, $t4, 0x2f# Comment");
        Assert.assertEquals("258b002f", instruction.toHex());
    }

    @Test
    public void test672() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s7, $t7, $s6");
        Assert.assertEquals("01f6b820", instruction.toHex());
    }

    @Test
    public void test673() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t6, $at, 0xf6");
        Assert.assertEquals("242e00f6", instruction.toHex());
    }

    @Test
    public void test674() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a2, 76($a3)");
        Assert.assertEquals("ace6004c", instruction.toHex());
    }

    @Test
    public void test675() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t8, $zero, 0xaf");
        Assert.assertEquals("241800af", instruction.toHex());
    }

    @Test
    public void test676() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $fp, 0x6d");
        Assert.assertEquals("3c1e006d", instruction.toHex());
    }

    @Test
    public void test677() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t0, $a3, $k0");
        Assert.assertEquals("00fa4024", instruction.toHex());
    }

    @Test
    public void test678() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s1, $s7, $a1");
        Assert.assertEquals("02e58825", instruction.toHex());
    }

    @Test
    public void test679() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xdc");
        Assert.assertEquals("080000dc", instruction.toHex());
    }

    @Test
    public void test680() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t3, $v0, 167");
        Assert.assertEquals("244b00a7", instruction.toHex());
    }

    @Test
    public void test681() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t4, $a1, $t6# Comment");
        Assert.assertEquals("00ae6020", instruction.toHex());
    }

    @Test
    public void test682() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s7, $s5, $t0");
        Assert.assertEquals("02a8b820", instruction.toHex());
    }

    @Test
    public void test683() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a0, 0xa3# Comment");
        Assert.assertEquals("3c0400a3", instruction.toHex());
    }

    @Test
    public void test684() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $k1, $t3, $k1");
        Assert.assertEquals("017bd822", instruction.toHex());
    }

    @Test
    public void test685() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s3, $t4, $k1");
        Assert.assertEquals("019b9820", instruction.toHex());
    }

    @Test
    public void test686() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $ra, ($k0)");
        Assert.assertEquals("8f5f0000", instruction.toHex());
    }

    @Test
    public void test687() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t9, $at, 0xffad# Comment");
        Assert.assertEquals("1721ffad", instruction.toHex());
    }

    @Test
    public void test688() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test689() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $a0, -231($a0)");
        Assert.assertEquals("8c84ff19", instruction.toHex());
    }

    @Test
    public void test690() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $at, $at, $zero");
        Assert.assertEquals("00200822", instruction.toHex());
    }

    @Test
    public void test691() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t3, $at, 90");
        Assert.assertEquals("242b005a", instruction.toHex());
    }

    @Test
    public void test692() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $v0, 169($a3)# Comment");
        Assert.assertEquals("ace200a9", instruction.toHex());
    }

    @Test
    public void test693() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t8, $t9, 0xfffe");
        Assert.assertEquals("1319fffe", instruction.toHex());
    }

    @Test
    public void test694() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t3, $v0, 117");
        Assert.assertEquals("244b0075", instruction.toHex());
    }

    @Test
    public void test695() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s5, $s5, $gp");
        Assert.assertEquals("02bca822", instruction.toHex());
    }

    @Test
    public void test696() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $sp, $a3, $at");
        Assert.assertEquals("00e1e82a", instruction.toHex());
    }

    @Test
    public void test697() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s4, $k0, $s7");
        Assert.assertEquals("0357a022", instruction.toHex());
    }

    @Test
    public void test698() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t8, $k1, 0xff20");
        Assert.assertEquals("3378ff20", instruction.toHex());
    }

    @Test
    public void test699() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $v1, ($gp)");
        Assert.assertEquals("af830000", instruction.toHex());
    }

    @Test
    public void test700() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t8, $t7, $k0");
        Assert.assertEquals("01fac020", instruction.toHex());
    }

    @Test
    public void test701() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s4, 0xde# Comment");
        Assert.assertEquals("3c1400de", instruction.toHex());
    }

    @Test
    public void test702() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s5, $sp, $v1");
        Assert.assertEquals("03a3a820", instruction.toHex());
    }

    @Test
    public void test703() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $v0, $t7, $sp");
        Assert.assertEquals("01fd1024", instruction.toHex());
    }

    @Test
    public void test704() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a3, $s0, $t0");
        Assert.assertEquals("02083824", instruction.toHex());
    }

    @Test
    public void test705() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xed");
        Assert.assertEquals("080000ed", instruction.toHex());
    }

    @Test
    public void test706() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $a2, $t6, 24");
        Assert.assertEquals("25c60018", instruction.toHex());
    }

    @Test
    public void test707() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s3, $t8, 0x8d");
        Assert.assertEquals("1278008d", instruction.toHex());
    }

    @Test
    public void test708() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $at, -204($t8)");
        Assert.assertEquals("af01ff34", instruction.toHex());
    }

    @Test
    public void test709() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a2, $t9, $s5");
        Assert.assertEquals("03353020", instruction.toHex());
    }

    @Test
    public void test710() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xe1");
        Assert.assertEquals("080000e1", instruction.toHex());
    }

    @Test
    public void test711() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $a0, $t5, $t7");
        Assert.assertEquals("01af2022", instruction.toHex());
    }

    @Test
    public void test712() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s5, $s6, 0x67");
        Assert.assertEquals("12b60067", instruction.toHex());
    }

    @Test
    public void test713() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xe3");
        Assert.assertEquals("080000e3", instruction.toHex());
    }

    @Test
    public void test714() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test715() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $gp, $t3, 0xffc7");
        Assert.assertEquals("138bffc7", instruction.toHex());
    }

    @Test
    public void test716() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t5, $t6, $t8");
        Assert.assertEquals("01d8682a", instruction.toHex());
    }

    @Test
    public void test717() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t8, $s4, -205");
        Assert.assertEquals("3698ff33", instruction.toHex());
    }

    @Test
    public void test718() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $ra, 0x13");
        Assert.assertEquals("3c1f0013", instruction.toHex());
    }

    @Test
    public void test719() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a0, $t7, $gp");
        Assert.assertEquals("01fc2025", instruction.toHex());
    }

    @Test
    public void test720() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s7, $s2, $s4# Comment");
        Assert.assertEquals("0254b820", instruction.toHex());
    }

    @Test
    public void test721() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t5, $t7, $v0");
        Assert.assertEquals("01e26824", instruction.toHex());
    }

    @Test
    public void test722() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t5, 34($a2)");
        Assert.assertEquals("8ccd0022", instruction.toHex());
    }

    @Test
    public void test723() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s5, $t3, 109");
        Assert.assertEquals("12ab006d", instruction.toHex());
    }

    @Test
    public void test724() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $fp, $s7, $fp");
        Assert.assertEquals("02fef024", instruction.toHex());
    }

    @Test
    public void test725() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xf");
        Assert.assertEquals("0800000f", instruction.toHex());
    }

    @Test
    public void test726() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t4, 69($s2)");
        Assert.assertEquals("8e4c0045", instruction.toHex());
    }

    @Test
    public void test727() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $k1, ($s6)");
        Assert.assertEquals("8edb0000", instruction.toHex());
    }

    @Test
    public void test728() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $ra, $a0, $zero");
        Assert.assertEquals("0080f820", instruction.toHex());
    }

    @Test
    public void test729() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t3, $a1, 0x60# Comment");
        Assert.assertEquals("34ab0060", instruction.toHex());
    }

    @Test
    public void test730() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $at, $t4, $s7");
        Assert.assertEquals("01970824", instruction.toHex());
    }

    @Test
    public void test731() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s4, $at, $s3");
        Assert.assertEquals("0033a020", instruction.toHex());
    }

    @Test
    public void test732() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s1, $s7, 199");
        Assert.assertEquals("26f100c7", instruction.toHex());
    }

    @Test
    public void test733() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $a0, $a1, 79");
        Assert.assertEquals("1485004f", instruction.toHex());
    }

    @Test
    public void test734() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $k0, $s3, $k0");
        Assert.assertEquals("027ad025", instruction.toHex());
    }

    @Test
    public void test735() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $v0, $t9, $s1");
        Assert.assertEquals("03311020", instruction.toHex());
    }

    @Test
    public void test736() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $sp, $s2, -214");
        Assert.assertEquals("17b2ff2a", instruction.toHex());
    }

    @Test
    public void test737() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t7, $t1, 0xff0d# Comment");
        Assert.assertEquals("11e9ff0d", instruction.toHex());
    }

    @Test
    public void test738() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $v0, $t2, $s2");
        Assert.assertEquals("01521022", instruction.toHex());
    }

    @Test
    public void test739() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t5, $s1, $v1");
        Assert.assertEquals("0223682a", instruction.toHex());
    }

    @Test
    public void test740() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t1, 0x58");
        Assert.assertEquals("3c090058", instruction.toHex());
    }

    @Test
    public void test741() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $v1, $fp, 199");
        Assert.assertEquals("27c300c7", instruction.toHex());
    }

    @Test
    public void test742() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t6, $t0, 0x42");
        Assert.assertEquals("250e0042", instruction.toHex());
    }

    @Test
    public void test743() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test744() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $at, $t2, 0x22");
        Assert.assertEquals("102a0022", instruction.toHex());
    }

    @Test
    public void test745() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $zero, 175($t8)");
        Assert.assertEquals("af0000af", instruction.toHex());
    }

    @Test
    public void test746() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $sp, $s3, $t9");
        Assert.assertEquals("0279e82a", instruction.toHex());
    }

    @Test
    public void test747() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s3, -250($a1)");
        Assert.assertEquals("acb3ff06", instruction.toHex());
    }

    @Test
    public void test748() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $k1, $at, $s3");
        Assert.assertEquals("0033d82a", instruction.toHex());
    }

    @Test
    public void test749() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s2, $a3, $a0");
        Assert.assertEquals("00e4902a", instruction.toHex());
    }

    @Test
    public void test750() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t4, $k0, 62");
        Assert.assertEquals("159a003e", instruction.toHex());
    }

    @Test
    public void test751() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $k1, $t0, 0x5c");
        Assert.assertEquals("311b005c", instruction.toHex());
    }

    @Test
    public void test752() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t6, $v0, 0xfff9");
        Assert.assertEquals("15c2fff9", instruction.toHex());
    }

    @Test
    public void test753() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $at, $a1, $t1");
        Assert.assertEquals("00a90825", instruction.toHex());
    }

    @Test
    public void test754() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t2, 69($v1)");
        Assert.assertEquals("ac6a0045", instruction.toHex());
    }

    @Test
    public void test755() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $t7, $sp, 0xfff5");
        Assert.assertEquals("37affff5", instruction.toHex());
    }

    @Test
    public void test756() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s1, $at, 0xffc9");
        Assert.assertEquals("3031ffc9", instruction.toHex());
    }

    @Test
    public void test757() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t9, $s5, 0xda");
        Assert.assertEquals("133500da", instruction.toHex());
    }

    @Test
    public void test758() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s5, $t9, 97");
        Assert.assertEquals("16b90061", instruction.toHex());
    }

    @Test
    public void test759() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s6, ($v0)");
        Assert.assertEquals("8c560000", instruction.toHex());
    }

    @Test
    public void test760() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $a0, $t8, $s6");
        Assert.assertEquals("0316202a", instruction.toHex());
    }

    @Test
    public void test761() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $zero, $s0, $t5# Comment");
        Assert.assertEquals("020d002a", instruction.toHex());
    }

    @Test
    public void test762() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s3, $t2, $t3");
        Assert.assertEquals("014b9825", instruction.toHex());
    }

    @Test
    public void test763() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $a3, $zero, $a2");
        Assert.assertEquals("00063822", instruction.toHex());
    }

    @Test
    public void test764() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t8, ($a2)");
        Assert.assertEquals("acd80000", instruction.toHex());
    }

    @Test
    public void test765() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xd7");
        Assert.assertEquals("080000d7", instruction.toHex());
    }

    @Test
    public void test766() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t1, $s6, 0xfff4");
        Assert.assertEquals("32c9fff4", instruction.toHex());
    }

    @Test
    public void test767() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $ra, -37($t3)");
        Assert.assertEquals("ad7fffdb", instruction.toHex());
    }

    @Test
    public void test768() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s2, $t5, $t1");
        Assert.assertEquals("01a99025", instruction.toHex());
    }

    @Test
    public void test769() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a3, ($zero)");
        Assert.assertEquals("ac070000", instruction.toHex());
    }

    @Test
    public void test770() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $k0, $t3, $ra# Comment");
        Assert.assertEquals("017fd022", instruction.toHex());
    }

    @Test
    public void test771() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s7, $t3, $s6");
        Assert.assertEquals("0176b825", instruction.toHex());
    }

    @Test
    public void test772() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t6, $ra, 0xae");
        Assert.assertEquals("15df00ae", instruction.toHex());
    }

    @Test
    public void test773() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s3, $t9, $k0");
        Assert.assertEquals("033a9825", instruction.toHex());
    }

    @Test
    public void test774() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $sp, $s2, 0xffed");
        Assert.assertEquals("17b2ffed", instruction.toHex());
    }

    @Test
    public void test775() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s2, $t6, 0x29");
        Assert.assertEquals("25d20029", instruction.toHex());
    }

    @Test
    public void test776() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $k1, $s4, -218# Comment");
        Assert.assertEquals("329bff26", instruction.toHex());
    }

    @Test
    public void test777() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $gp, $fp, 0xb1");
        Assert.assertEquals("27dc00b1", instruction.toHex());
    }

    @Test
    public void test778() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $zero, ($a2)");
        Assert.assertEquals("acc00000", instruction.toHex());
    }

    @Test
    public void test779() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s3, ($a1)");
        Assert.assertEquals("8cb30000", instruction.toHex());
    }

    @Test
    public void test780() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a3, ($t3)");
        Assert.assertEquals("ad670000", instruction.toHex());
    }

    @Test
    public void test781() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $at, 0x80# Comment");
        Assert.assertEquals("3c010080", instruction.toHex());
    }

    @Test
    public void test782() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test783() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t7, $k1, $s2");
        Assert.assertEquals("03727822", instruction.toHex());
    }

    @Test
    public void test784() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $k0, $t7, 0x6f");
        Assert.assertEquals("174f006f", instruction.toHex());
    }

    @Test
    public void test785() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $k0, 0x94");
        Assert.assertEquals("3c1a0094", instruction.toHex());
    }

    @Test
    public void test786() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test787() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s3, $t8, $s5");
        Assert.assertEquals("0315982a", instruction.toHex());
    }

    @Test
    public void test788() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $ra, $t3, 0x2");
        Assert.assertEquals("13eb0002", instruction.toHex());
    }

    @Test
    public void test789() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $at, $k1, 209# Comment");
        Assert.assertEquals("103b00d1", instruction.toHex());
    }

    @Test
    public void test790() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $k1, ($at)");
        Assert.assertEquals("8c3b0000", instruction.toHex());
    }

    @Test
    public void test791() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t0, $k0, $s6");
        Assert.assertEquals("03564024", instruction.toHex());
    }

    @Test
    public void test792() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t0, $t5, 0x1b");
        Assert.assertEquals("31a8001b", instruction.toHex());
    }

    @Test
    public void test793() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t9, 0xb1");
        Assert.assertEquals("3c1900b1", instruction.toHex());
    }

    @Test
    public void test794() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $sp, $s0, $t0");
        Assert.assertEquals("0208e825", instruction.toHex());
    }

    @Test
    public void test795() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t4, $t7, 0x95");
        Assert.assertEquals("25ec0095", instruction.toHex());
    }

    @Test
    public void test796() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t9, $t9, $a3");
        Assert.assertEquals("0327c824", instruction.toHex());
    }

    @Test
    public void test797() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s2, $t8, $t8");
        Assert.assertEquals("03189022", instruction.toHex());
    }

    @Test
    public void test798() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t3, $k0, 0x3e");
        Assert.assertEquals("334b003e", instruction.toHex());
    }

    @Test
    public void test799() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s4, $t4, 16");
        Assert.assertEquals("168c0010", instruction.toHex());
    }

    @Test
    public void test800() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t7, 0x9c");
        Assert.assertEquals("3c0f009c", instruction.toHex());
    }

    @Test
    public void test801() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $ra, $k1, -34");
        Assert.assertEquals("13fbffde", instruction.toHex());
    }

    @Test
    public void test802() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $a1, $s5, 0xb2");
        Assert.assertEquals("32a500b2", instruction.toHex());
    }

    @Test
    public void test803() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t2, $t8, $ra");
        Assert.assertEquals("031f5024", instruction.toHex());
    }

    @Test
    public void test804() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $v0, 0xac");
        Assert.assertEquals("3c0200ac", instruction.toHex());
    }

    @Test
    public void test805() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s4, ($v1)");
        Assert.assertEquals("ac740000", instruction.toHex());
    }

    @Test
    public void test806() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $fp, 139($t7)");
        Assert.assertEquals("8dfe008b", instruction.toHex());
    }

    @Test
    public void test807() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s5, $t9, $s7# Comment");
        Assert.assertEquals("0337a825", instruction.toHex());
    }

    @Test
    public void test808() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xcf# Comment");
        Assert.assertEquals("080000cf", instruction.toHex());
    }

    @Test
    public void test809() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $v1, ($k0)");
        Assert.assertEquals("af430000", instruction.toHex());
    }

    @Test
    public void test810() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $k0, -183($t0)");
        Assert.assertEquals("8d1aff49", instruction.toHex());
    }

    @Test
    public void test811() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $ra, $a0, -231# Comment");
        Assert.assertEquals("13e4ff19", instruction.toHex());
    }

    @Test
    public void test812() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s4, $t1, $zero");
        Assert.assertEquals("0120a020", instruction.toHex());
    }

    @Test
    public void test813() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $k0, $s4, -75");
        Assert.assertEquals("369affb5", instruction.toHex());
    }

    @Test
    public void test814() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $k1, $t3, 192");
        Assert.assertEquals("136b00c0", instruction.toHex());
    }

    @Test
    public void test815() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t6, $s7, $t4# Comment");
        Assert.assertEquals("02ec7022", instruction.toHex());
    }

    @Test
    public void test816() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t9, $t9, 91");
        Assert.assertEquals("1339005b", instruction.toHex());
    }

    @Test
    public void test817() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t2, $t4, $a3");
        Assert.assertEquals("01875024", instruction.toHex());
    }

    @Test
    public void test818() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s4, $a2, 0xff4c");
        Assert.assertEquals("1286ff4c", instruction.toHex());
    }

    @Test
    public void test819() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $gp, $fp, $t6");
        Assert.assertEquals("03cee025", instruction.toHex());
    }

    @Test
    public void test820() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a0, $t8, 0x93");
        Assert.assertEquals("37040093", instruction.toHex());
    }

    @Test
    public void test821() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $fp, $s0, $s7");
        Assert.assertEquals("0217f020", instruction.toHex());
    }

    @Test
    public void test822() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s4, -171($k1)# Comment");
        Assert.assertEquals("af74ff55", instruction.toHex());
    }

    @Test
    public void test823() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $v1, $a1, $zero");
        Assert.assertEquals("00a01822", instruction.toHex());
    }

    @Test
    public void test824() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $s7, ($zero)");
        Assert.assertEquals("8c170000", instruction.toHex());
    }

    @Test
    public void test825() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $at, 0xb6");
        Assert.assertEquals("3c0100b6", instruction.toHex());
    }

    @Test
    public void test826() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t2, $t9, 0xffa6");
        Assert.assertEquals("1559ffa6", instruction.toHex());
    }

    @Test
    public void test827() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s2, $s5, $s4");
        Assert.assertEquals("02b49020", instruction.toHex());
    }

    @Test
    public void test828() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x36# Comment");
        Assert.assertEquals("08000036", instruction.toHex());
    }

    @Test
    public void test829() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $k0, 0xe6");
        Assert.assertEquals("3c1a00e6", instruction.toHex());
    }

    @Test
    public void test830() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $v1, $s6, $t8");
        Assert.assertEquals("02d81825", instruction.toHex());
    }

    @Test
    public void test831() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $k0, $s4, $s2");
        Assert.assertEquals("0292d025", instruction.toHex());
    }

    @Test
    public void test832() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t7, $fp, $sp");
        Assert.assertEquals("03dd7820", instruction.toHex());
    }

    @Test
    public void test833() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test834() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $t2, 0x7a");
        Assert.assertEquals("3c0a007a", instruction.toHex());
    }

    @Test
    public void test835() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s2, $t5, 0xff57");
        Assert.assertEquals("164dff57", instruction.toHex());
    }

    @Test
    public void test836() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $zero, $a3, $t5# Comment");
        Assert.assertEquals("00ed0020", instruction.toHex());
    }

    @Test
    public void test837() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t1, $s0, $a3");
        Assert.assertEquals("02074824", instruction.toHex());
    }

    @Test
    public void test838() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s1, ($v1)");
        Assert.assertEquals("ac710000", instruction.toHex());
    }

    @Test
    public void test839() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s7, $t4, $gp");
        Assert.assertEquals("019cb82a", instruction.toHex());
    }

    @Test
    public void test840() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test841() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t8, ($s7)");
        Assert.assertEquals("8ef80000", instruction.toHex());
    }

    @Test
    public void test842() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s5, ($sp)");
        Assert.assertEquals("afb50000", instruction.toHex());
    }

    @Test
    public void test843() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a1, $at, $t2");
        Assert.assertEquals("002a2824", instruction.toHex());
    }

    @Test
    public void test844() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $a1, $t9, $t5");
        Assert.assertEquals("032d2824", instruction.toHex());
    }

    @Test
    public void test845() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $gp, $t8, $t1");
        Assert.assertEquals("0309e024", instruction.toHex());
    }

    @Test
    public void test846() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x6a");
        Assert.assertEquals("0800006a", instruction.toHex());
    }

    @Test
    public void test847() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $ra, $zero, 243");
        Assert.assertEquals("241f00f3", instruction.toHex());
    }

    @Test
    public void test848() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t0, $gp, 182");
        Assert.assertEquals("111c00b6", instruction.toHex());
    }

    @Test
    public void test849() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t6, $s5, 0xff20");
        Assert.assertEquals("32aeff20", instruction.toHex());
    }

    @Test
    public void test850() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $t0, $t5, $sp");
        Assert.assertEquals("01bd402a", instruction.toHex());
    }

    @Test
    public void test851() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t0, $s6, $a1");
        Assert.assertEquals("02c54025", instruction.toHex());
    }

    @Test
    public void test852() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $v1, $v0, -158");
        Assert.assertEquals("3443ff62", instruction.toHex());
    }

    @Test
    public void test853() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s3, $a3, $fp");
        Assert.assertEquals("00fe982a", instruction.toHex());
    }

    @Test
    public void test854() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $a2, ($zero)");
        Assert.assertEquals("8c060000", instruction.toHex());
    }

    @Test
    public void test855() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $fp, $s6, $v1");
        Assert.assertEquals("02c3f024", instruction.toHex());
    }

    @Test
    public void test856() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x6a");
        Assert.assertEquals("0800006a", instruction.toHex());
    }

    @Test
    public void test857() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s0, ($s7)");
        Assert.assertEquals("aef00000", instruction.toHex());
    }

    @Test
    public void test858() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t2, $gp, 0xff37");
        Assert.assertEquals("155cff37", instruction.toHex());
    }

    @Test
    public void test859() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t3, $a3, $s2");
        Assert.assertEquals("00f25822", instruction.toHex());
    }

    @Test
    public void test860() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t3, $k1, $t3");
        Assert.assertEquals("036b5825", instruction.toHex());
    }

    @Test
    public void test861() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $s4, $t6, 52# Comment");
        Assert.assertEquals("35d40034", instruction.toHex());
    }

    @Test
    public void test862() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $v1, 0x7a");
        Assert.assertEquals("3c03007a", instruction.toHex());
    }

    @Test
    public void test863() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $a1, ($s2)");
        Assert.assertEquals("ae450000", instruction.toHex());
    }

    @Test
    public void test864() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t2, $s1, -26");
        Assert.assertEquals("1151ffe6", instruction.toHex());
    }

    @Test
    public void test865() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s1, ($at)");
        Assert.assertEquals("ac310000", instruction.toHex());
    }

    @Test
    public void test866() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $at, ($s1)# Comment");
        Assert.assertEquals("8e210000", instruction.toHex());
    }

    @Test
    public void test867() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $v1, 0xf0");
        Assert.assertEquals("3c0300f0", instruction.toHex());
    }

    @Test
    public void test868() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $v0, ($k1)");
        Assert.assertEquals("8f620000", instruction.toHex());
    }

    @Test
    public void test869() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $a0, 0x84# Comment");
        Assert.assertEquals("3c040084", instruction.toHex());
    }

    @Test
    public void test870() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $ra, $t4, $v1");
        Assert.assertEquals("0183f820", instruction.toHex());
    }

    @Test
    public void test871() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t4, $t3, -245");
        Assert.assertEquals("118bff0b", instruction.toHex());
    }

    @Test
    public void test872() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t2, $t7, $a0");
        Assert.assertEquals("01e45024", instruction.toHex());
    }

    @Test
    public void test873() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t9, ($s1)");
        Assert.assertEquals("ae390000", instruction.toHex());
    }

    @Test
    public void test874() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $gp, $t4, 222");
        Assert.assertEquals("138c00de", instruction.toHex());
    }

    @Test
    public void test875() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $sp, $v1, 134");
        Assert.assertEquals("307d0086", instruction.toHex());
    }

    @Test
    public void test876() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $t8, $v0, $ra");
        Assert.assertEquals("005fc020", instruction.toHex());
    }

    @Test
    public void test877() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $fp, $s5, $t7");
        Assert.assertEquals("02aff02a", instruction.toHex());
    }

    @Test
    public void test878() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s1, $v1, 0x63");
        Assert.assertEquals("24710063", instruction.toHex());
    }

    @Test
    public void test879() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $at, $ra, $a1");
        Assert.assertEquals("03e50824", instruction.toHex());
    }

    @Test
    public void test880() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x72");
        Assert.assertEquals("08000072", instruction.toHex());
    }

    @Test
    public void test881() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $at, $t6, $a3");
        Assert.assertEquals("01c70824", instruction.toHex());
    }

    @Test
    public void test882() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $fp, $ra, 65");
        Assert.assertEquals("37fe0041", instruction.toHex());
    }

    @Test
    public void test883() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t3, $t2, $t4# Comment");
        Assert.assertEquals("014c5825", instruction.toHex());
    }

    @Test
    public void test884() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t6, $s4, $s5");
        Assert.assertEquals("02957022", instruction.toHex());
    }

    @Test
    public void test885() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $gp, $gp, 0x91");
        Assert.assertEquals("339c0091", instruction.toHex());
    }

    @Test
    public void test886() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $sp, $fp, $a3");
        Assert.assertEquals("03c7e82a", instruction.toHex());
    }

    @Test
    public void test887() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x46");
        Assert.assertEquals("08000046", instruction.toHex());
    }

    @Test
    public void test888() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $at, $k1, 0xff36");
        Assert.assertEquals("103bff36", instruction.toHex());
    }

    @Test
    public void test889() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s6, $ra, 0xff3b");
        Assert.assertEquals("16dfff3b", instruction.toHex());
    }

    @Test
    public void test890() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s3, ($v1)");
        Assert.assertEquals("ac730000", instruction.toHex());
    }

    @Test
    public void test891() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $at, $s0, $t2");
        Assert.assertEquals("020a082a", instruction.toHex());
    }

    @Test
    public void test892() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $zero, $s6, 70");
        Assert.assertEquals("10160046", instruction.toHex());
    }

    @Test
    public void test893() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t1, $s2, 0xfff4");
        Assert.assertEquals("3249fff4", instruction.toHex());
    }

    @Test
    public void test894() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $zero, $t7, $s5");
        Assert.assertEquals("01f50022", instruction.toHex());
    }

    @Test
    public void test895() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s0, $s0, 0xff71");
        Assert.assertEquals("1210ff71", instruction.toHex());
    }

    @Test
    public void test896() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $gp, $t4, 0xdd# Comment");
        Assert.assertEquals("359c00dd", instruction.toHex());
    }

    @Test
    public void test897() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xdf");
        Assert.assertEquals("080000df", instruction.toHex());
    }

    @Test
    public void test898() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t2, $sp, $at");
        Assert.assertEquals("03a15022", instruction.toHex());
    }

    @Test
    public void test899() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $fp, $s3, -245");
        Assert.assertEquals("13d3ff0b", instruction.toHex());
    }

    @Test
    public void test900() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $s2, $t3, $s0");
        Assert.assertEquals("01709022", instruction.toHex());
    }

    @Test
    public void test901() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $zero, $at, $s7");
        Assert.assertEquals("00370025", instruction.toHex());
    }

    @Test
    public void test902() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x76");
        Assert.assertEquals("08000076", instruction.toHex());
    }

    @Test
    public void test903() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $k1, $a3, 119");
        Assert.assertEquals("24fb0077", instruction.toHex());
    }

    @Test
    public void test904() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x2a# Comment");
        Assert.assertEquals("0800002a", instruction.toHex());
    }

    @Test
    public void test905() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xa");
        Assert.assertEquals("0800000a", instruction.toHex());
    }

    @Test
    public void test906() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t4, -23($t6)");
        Assert.assertEquals("adccffe9", instruction.toHex());
    }

    @Test
    public void test907() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s7, $s6, 0x3d");
        Assert.assertEquals("26d7003d", instruction.toHex());
    }

    @Test
    public void test908() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $gp, $s4, $t5");
        Assert.assertEquals("028de022", instruction.toHex());
    }

    @Test
    public void test909() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t4, $s1, 0x3c# Comment");
        Assert.assertEquals("1591003c", instruction.toHex());
    }

    @Test
    public void test910() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t7, $a0, $gp");
        Assert.assertEquals("009c7824", instruction.toHex());
    }

    @Test
    public void test911() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t3, $t7, 0x26");
        Assert.assertEquals("116f0026", instruction.toHex());
    }

    @Test
    public void test912() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s1, $a0, 0xf3");
        Assert.assertEquals("162400f3", instruction.toHex());
    }

    @Test
    public void test913() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t4, -167($s6)");
        Assert.assertEquals("aeccff59", instruction.toHex());
    }

    @Test
    public void test914() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test915() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $t0, $s0, $s2");
        Assert.assertEquals("02124025", instruction.toHex());
    }

    @Test
    public void test916() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t5, -89($s0)");
        Assert.assertEquals("8e0dffa7", instruction.toHex());
    }

    @Test
    public void test917() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test918() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $s7, $a3, $t9");
        Assert.assertEquals("00f9b82a", instruction.toHex());
    }

    @Test
    public void test919() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s5, $t3, $t0");
        Assert.assertEquals("0168a825", instruction.toHex());
    }

    @Test
    public void test920() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t5, $s2, 0xe8");
        Assert.assertEquals("15b200e8", instruction.toHex());
    }

    @Test
    public void test921() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t6, $t7, 0xf5");
        Assert.assertEquals("15cf00f5", instruction.toHex());
    }

    @Test
    public void test922() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xa5# Comment");
        Assert.assertEquals("080000a5", instruction.toHex());
    }

    @Test
    public void test923() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x70");
        Assert.assertEquals("08000070", instruction.toHex());
    }

    @Test
    public void test924() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t8, $a2, $s4# Comment");
        Assert.assertEquals("00d4c022", instruction.toHex());
    }

    @Test
    public void test925() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s5, $t6, 0xb0");
        Assert.assertEquals("25d500b0", instruction.toHex());
    }

    @Test
    public void test926() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $ra, $s6, $t5");
        Assert.assertEquals("02cdf822", instruction.toHex());
    }

    @Test
    public void test927() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $a2, $at, 0xcb");
        Assert.assertEquals("10c100cb", instruction.toHex());
    }

    @Test
    public void test928() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $k1, $s0, -216");
        Assert.assertEquals("1770ff28", instruction.toHex());
    }

    @Test
    public void test929() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a1, $a0, $v0");
        Assert.assertEquals("00822820", instruction.toHex());
    }

    @Test
    public void test930() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $sp, $a1, $s0");
        Assert.assertEquals("00b0e825", instruction.toHex());
    }

    @Test
    public void test931() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $v0, $s1, 0xf1");
        Assert.assertEquals("145100f1", instruction.toHex());
    }

    @Test
    public void test932() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $v0, $t4, 0xe1");
        Assert.assertEquals("104c00e1", instruction.toHex());
    }

    @Test
    public void test933() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t1, $a3, 0x1e");
        Assert.assertEquals("1527001e", instruction.toHex());
    }

    @Test
    public void test934() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $zero, 0x9e");
        Assert.assertEquals("3c00009e", instruction.toHex());
    }

    @Test
    public void test935() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("and $t8, $k0, $t3");
        Assert.assertEquals("034bc024", instruction.toHex());
    }

    @Test
    public void test936() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $zero, ($a2)");
        Assert.assertEquals("8cc00000", instruction.toHex());
    }

    @Test
    public void test937() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $k0, 217($s0)");
        Assert.assertEquals("ae1a00d9", instruction.toHex());
    }

    @Test
    public void test938() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x6e");
        Assert.assertEquals("0800006e", instruction.toHex());
    }

    @Test
    public void test939() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s6, $s2, 0xf1");
        Assert.assertEquals("325600f1", instruction.toHex());
    }

    @Test
    public void test940() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test941() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $s0, $s3, $fp");
        Assert.assertEquals("027e8025", instruction.toHex());
    }

    @Test
    public void test942() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s7, $s5, 0xff");
        Assert.assertEquals("32b700ff", instruction.toHex());
    }

    @Test
    public void test943() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x42");
        Assert.assertEquals("08000042", instruction.toHex());
    }

    @Test
    public void test944() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $k0, $v1, $t4# Comment");
        Assert.assertEquals("006cd020", instruction.toHex());
    }

    @Test
    public void test945() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $s3, 0xf2");
        Assert.assertEquals("3c1300f2", instruction.toHex());
    }

    @Test
    public void test946() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $at, $s1, $s7# Comment");
        Assert.assertEquals("02370820", instruction.toHex());
    }

    @Test
    public void test947() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s5, $s1, 210");
        Assert.assertEquals("263500d2", instruction.toHex());
    }

    @Test
    public void test948() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xfe# Comment");
        Assert.assertEquals("080000fe", instruction.toHex());
    }

    @Test
    public void test949() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $k0, $t8, $v0");
        Assert.assertEquals("0302d025", instruction.toHex());
    }

    @Test
    public void test950() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x50");
        Assert.assertEquals("08000050", instruction.toHex());
    }

    @Test
    public void test951() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t0, $at, 0xffc8");
        Assert.assertEquals("1101ffc8", instruction.toHex());
    }

    @Test
    public void test952() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test953() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $at, $s3, $t5");
        Assert.assertEquals("026d0820", instruction.toHex());
    }

    @Test
    public void test954() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $s0, $s0, 0xff64");
        Assert.assertEquals("3210ff64", instruction.toHex());
    }

    @Test
    public void test955() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t7, $t1, 0xcf");
        Assert.assertEquals("252f00cf", instruction.toHex());
    }

    @Test
    public void test956() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $t6, $s7, -76");
        Assert.assertEquals("15d7ffb4", instruction.toHex());
    }

    @Test
    public void test957() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xdb");
        Assert.assertEquals("080000db", instruction.toHex());
    }

    @Test
    public void test958() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $v1, $a0, 193");
        Assert.assertEquals("348300c1", instruction.toHex());
    }

    @Test
    public void test959() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0xe2");
        Assert.assertEquals("080000e2", instruction.toHex());
    }

    @Test
    public void test960() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $s1, $t9, 0x1# Comment");
        Assert.assertEquals("16390001", instruction.toHex());
    }

    @Test
    public void test961() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t1, $a2, $s5# Comment");
        Assert.assertEquals("00d54822", instruction.toHex());
    }

    @Test
    public void test962() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $v1, $t0, 246");
        Assert.assertEquals("146800f6", instruction.toHex());
    }

    @Test
    public void test963() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test964() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lui $zero, 0x92");
        Assert.assertEquals("3c000092", instruction.toHex());
    }

    @Test
    public void test965() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $a2, $s1, $s6");
        Assert.assertEquals("02363022", instruction.toHex());
    }

    @Test
    public void test966() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("lw $t9, -15($a0)");
        Assert.assertEquals("8c99fff1", instruction.toHex());
    }

    @Test
    public void test967() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s5, ($t7)");
        Assert.assertEquals("adf50000", instruction.toHex());
    }

    @Test
    public void test968() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s5, $v0, 0xffa5");
        Assert.assertEquals("12a2ffa5", instruction.toHex());
    }

    @Test
    public void test969() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t3, $a3, -168");
        Assert.assertEquals("1167ff58", instruction.toHex());
    }

    @Test
    public void test970() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $a2, $s6, 7# Comment");
        Assert.assertEquals("26c60007", instruction.toHex());
    }

    @Test
    public void test971() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $fp, $fp, $k1");
        Assert.assertEquals("03dbf025", instruction.toHex());
    }

    @Test
    public void test972() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("j 0x2e");
        Assert.assertEquals("0800002e", instruction.toHex());
    }

    @Test
    public void test973() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a1, $s4, $v0");
        Assert.assertEquals("02822825", instruction.toHex());
    }

    @Test
    public void test974() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $t0, $sp, $v0");
        Assert.assertEquals("03a24022", instruction.toHex());
    }

    @Test
    public void test975() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a1, $a2, $t3");
        Assert.assertEquals("00cb2820", instruction.toHex());
    }

    @Test
    public void test976() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $s1, $k1, 200");
        Assert.assertEquals("277100c8", instruction.toHex());
    }

    @Test
    public void test977() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $gp, $s4, $t5");
        Assert.assertEquals("028de02a", instruction.toHex());
    }

    @Test
    public void test978() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("slt $fp, $gp, $t8");
        Assert.assertEquals("0398f02a", instruction.toHex());
    }

    @Test
    public void test979() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("addiu $t8, $zero, 0xe1# Comment");
        Assert.assertEquals("241800e1", instruction.toHex());
    }

    @Test
    public void test980() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $a0, $k0, $t9");
        Assert.assertEquals("03592022", instruction.toHex());
    }

    @Test
    public void test981() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("andi $t5, $s5, 0xb6");
        Assert.assertEquals("32ad00b6", instruction.toHex());
    }

    @Test
    public void test982() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a0, $at, $t6");
        Assert.assertEquals("002e2020", instruction.toHex());
    }

    @Test
    public void test983() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("bne $gp, $v0, 0xf");
        Assert.assertEquals("1782000f", instruction.toHex());
    }

    @Test
    public void test984() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("or $a2, $t0, $s2");
        Assert.assertEquals("01123025", instruction.toHex());
    }

    @Test
    public void test985() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $zero, $s5, $t3");
        Assert.assertEquals("02ab0022", instruction.toHex());
    }

    @Test
    public void test986() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $s7, $fp, $s5");
        Assert.assertEquals("03d5b820", instruction.toHex());
    }

    @Test
    public void test987() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("ori $a3, $s6, 0xffe3");
        Assert.assertEquals("36c7ffe3", instruction.toHex());
    }

    @Test
    public void test988() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $t8, 140($v1)");
        Assert.assertEquals("ac78008c", instruction.toHex());
    }

    @Test
    public void test989() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("syscall");
        Assert.assertEquals("0000000c", instruction.toHex());
    }

    @Test
    public void test990() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $at, $v0, $t7");
        Assert.assertEquals("004f0822", instruction.toHex());
    }

    @Test
    public void test991() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sw $s2, ($k0)# Comment");
        Assert.assertEquals("af520000", instruction.toHex());
    }

    @Test
    public void test992() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a3, $fp, $a2");
        Assert.assertEquals("03c63820", instruction.toHex());
    }

    @Test
    public void test993() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $t9, $s5, 0xff57");
        Assert.assertEquals("1335ff57", instruction.toHex());
    }

    @Test
    public void test994() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $sp, $s1, $t0");
        Assert.assertEquals("0228e820", instruction.toHex());
    }

    @Test
    public void test995() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("add $a0, $s7, $at");
        Assert.assertEquals("02e12020", instruction.toHex());
    }

    @Test
    public void test996() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $a2, $t5, $a3");
        Assert.assertEquals("01a73022", instruction.toHex());
    }

    @Test
    public void test997() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $s5, $s2, -169");
        Assert.assertEquals("12b2ff57", instruction.toHex());
    }

    @Test
    public void test998() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("beq $a2, $s6, -45");
        Assert.assertEquals("10d6ffd3", instruction.toHex());
    }

    @Test
    public void test999() {
        MIPSInstruction instruction = MIPSInstructionFactory.create("sub $ra, $t0, $k0");
        Assert.assertEquals("011af822", instruction.toHex());
    }
}