package comp5111.assignment;

import comp5111.assignment.faultlocalization.ScoreAlgorithm;
import comp5111.assignment.faultlocalization.SuspiciousRanking;
import comp5111.assignment.faultlocalization.TestExecutionTracer;
import comp5111.assignment.faultlocalization.algorithm.*;
import comp5111.assignment.instrument.coverage.*;
import comp5111.assignment.instrument.runtime.Profiler;
import comp5111.assignment.tools.JUnit;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;

public class Assignment2 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        /* check the arguments */
        if (args.length <= 1 ) {
            System.err.println("Usage: java comp5111.assignment.Assignment2 [FL-Algorithm] test-suite [soot options] classname");
            System.err.println("Usage: [FL-Algorithm] = Ochiai for Ochiai algorithm");
            System.err.println("Usage: [FL-Algorithm] = Jaccard for Jaccard algorithm");
            System.err.println("Usage: [FL-Algorithm] = Tarantula for Tarantula algorithm");
            System.err.println("Usage: [FL-Algorithm] = AMPLE for AMPLE algorithm");
            System.exit(0);
        }

        String testSuite = args[2];

        // these args will be passed into soot.
        String[] sootArgs = Arrays.copyOfRange(args, 3, args.length);

        ScoreAlgorithm flAlgorithm;
        if (args[0].toLowerCase(Locale.ROOT).compareTo("ochiai") == 0) {
            flAlgorithm = new Ochiai();
        } else if (args[0].toLowerCase(Locale.ROOT).compareTo("tarantula") == 0) {
            flAlgorithm = new Tarantula();
        } else if (args[0].toLowerCase(Locale.ROOT).compareTo("jaccard") == 0) {
            flAlgorithm = new Jaccard();
        } else if (args[0].toLowerCase(Locale.ROOT).compareTo("ample") == 0) {
            flAlgorithm = new Ample();
        }else {
            throw new IllegalArgumentException("Unknown fault-localization algorithm '" + args[0] + "'");
        }

        // instrument CUT
        SootDriver.instrument(StatementTestRequirement.class, StatementInstrumenter.class, sootArgs);

        Profiler.v().reset();
        TestExecutionTracer tracer = new TestExecutionTracer();
        Class<?> testClass = Class.forName(testSuite);
        System.out.println("Running test suite " + testSuite);
        JUnit.run(tracer, testClass);

        System.out.println("Locating faults...");
        SuspiciousRanking ranking = tracer.rank(flAlgorithm);
        Path file = Paths.get(args[1]+"/spectrum_fl_" + args[0].toLowerCase(Locale.ROOT) + "_" + testSuite + ".tsv");
        ranking.genReport(file.toString());
        System.out.println("Fault localization report generated at " + file);
    }
}
