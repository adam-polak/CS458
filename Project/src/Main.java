import lib.files.MIPSProcessor;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: java -jar CS458.jar <text file> <data file>");
            return;
        }

        try {
            MIPSProcessor sim = new MIPSProcessor();
            sim.loadTextFile(args[0]);
            sim.loadDataFile(args[1]);
            sim.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
