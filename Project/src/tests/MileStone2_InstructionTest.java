package tests;

import lib.files.MIPSProcessor;
import org.junit.Test;

import java.io.*;
import static org.junit.Assert.*;

public class MileStone2_InstructionTest {

    private MIPSProcessor setupAndRun(String text, String data, ByteArrayOutputStream outputCapture) throws Exception {
        File textFile = File.createTempFile("prog", ".text");
        File dataFile = File.createTempFile("prog", ".data");

        try (PrintWriter out = new PrintWriter(textFile)) {
            out.print(text);
        }
        try (PrintWriter out = new PrintWriter(dataFile)) {
            out.print(data);
        }

        PrintStream originalOut = System.out;
        if (outputCapture != null) {
            System.setOut(new PrintStream(outputCapture));
        }

        MIPSProcessor processor = new MIPSProcessor();
        processor.loadTextFile(textFile.getAbsolutePath());
        processor.loadDataFile(dataFile.getAbsolutePath());
        processor.run();

        if (outputCapture != null) {
            System.setOut(originalOut);
        }

        return processor;
    }

    @Test public void testAdd() throws Exception {
        String text = "24080005\n24090003\n01095020\n"; // $t0 = 5; $t1 = 3; add $t2, $t0, $t1
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(8, p.getRegister(10)); // $t2
    }

    @Test public void testSub() throws Exception {
        String text = "24080005\n24090002\n01095022\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(3, p.getRegister(10));
    }

    @Test public void testAnd() throws Exception {
        String text = "2408000f\n240900f0\n01095024\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(0x00, p.getRegister(10));
    }

    @Test public void testOr() throws Exception {
        String text = "2408000f\n240900f0\n01095025\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(0xff, p.getRegister(10));
    }

    @Test public void testSlt() throws Exception {
        String text = "24080001\n24090002\n0109502a\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(1, p.getRegister(10));
    }

    @Test public void testAddiu() throws Exception {
        String text = "2408002a\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(42, p.getRegister(8));
    }

    @Test public void testAndi() throws Exception {
        String text = "240800ff\n3108000f\n";  // li $t0, 0xff; andi $t0, $t0, 0x0f
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(0x0f, p.getRegister(8));
    }

    @Test public void testOri() throws Exception {
        String text = "340800f0\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(0xf0, p.getRegister(8));
    }

    @Test public void testLui() throws Exception {
        String text = "3c081001\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(0x10010000, p.getRegister(8));
    }

    @Test public void testSwLw() throws Exception {
        String text = "3c081001\n35080000\n2409002a\nad090000\n8d0a0000\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(0x2a, p.getRegister(10));
    }

    @Test public void testBeq() throws Exception {
        String text = "20080001\n20090001\n11090001\n200a002a\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(0, p.getRegister(10));
    }

    @Test public void testBne() throws Exception {
        String text = "20080001\n20090002\n15090001\n200a002a\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(0, p.getRegister(10));
    }

    @Test public void testJump() throws Exception {
        String text =
                "08000004\n" +
                        "00000000\n" +
                        "00000000\n" +
                        "00000000\n" +
                        "240a001e\n";
        MIPSProcessor p = setupAndRun(text, "", null);
        assertEquals(30, p.getRegister(10)); // $t2
    }



    @Test public void testSyscallPrintInt() throws Exception {
        String text = "24020001\n2404002a\n0000000c\n";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        setupAndRun(text, "", output);
        assertTrue(output.toString().contains("42"));
    }

    @Test public void testSyscallExit() throws Exception {
        String text = "2402000a\n0000000c\n";
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        setupAndRun(text, "", output);
        assertTrue(output.toString().contains("-- program is finished running --"));
    }
}
