package comp5111.assignment;

import comp5111.assignment.instrument.coverage.*;
import comp5111.assignment.instrument.runtime.Profiler;
import comp5111.assignment.tools.JUnit;

import java.io.IOException;
import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        /* check the arguments */
        if (args.length <= 1 || (args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
            System.err.println("Usage: java comp5111.assignment.Assignment1 [coverage level] test-suite [soot options] " +
                "classname");
            System.err.println("Usage: [coverage level] = 0 for statement coverage");
            System.err.println("Usage: [coverage level] = 1 for branch coverage");
            System.err.println("Usage: [coverage level] = 2 for line coverage");
            System.exit(0);
        }
        String coverage = "Unknown";

        String testSuite = args[1];

        // these args will be passed into soot.
        String[] sootArgs = Arrays.copyOfRange(args, 2, args.length);

        if (args[0].compareTo("0") == 0) {
            coverage = "Statement";
            // invoke your statement coverage instrument function
            SootDriver.instrument(StatementTestRequirement.class, StatementInstrumenter.class, sootArgs);
        } else if (args[0].compareTo("1") == 0) {
            coverage = "Branch";
            // invoke your branch coverage instrument function
            SootDriver.instrument(BranchTestRequirement.class, BranchInstrumenter.class, sootArgs);
        } else if (args[0].compareTo("2") == 0) {
            coverage = "Line";
            // invoke your line coverage instrument function
            SootDriver.instrument(LineTestRequirement.class, LineInstrumenter.class, sootArgs);
        }
        Class<?> testClass = Class.forName(testSuite);
        Profiler.v().reset();
        System.out.println("Running test suite " + testSuite);
        System.out.println("Measuring " + coverage + " coverage");
        JUnit.run(testClass);
        Profiler.v().generateReport("src/test/report", testSuite, coverage);
    }
}
