package comp5111.assignment;

import java.io.IOException;
import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        /* check the arguments */
        if (args.length <= 1 || (args[0].compareTo("0") != 0 && args[0].compareTo("1") != 0 && args[0].compareTo("2") != 0)) {
            System.err.println("Usage: java Assignment1 [coverage level] classnames ...");
            System.err.println("Usage: [coverage level] = 0 for statement coverage");
            System.err.println("Usage: [coverage level] = 1 for branch coverage");
            System.err.println("Usage: [coverage level] = 2 for line coverage");
            System.exit(0);
        }

        // these args will be passed into soot.
        String[] classNames = Arrays.copyOfRange(args, 1, args.length);

        if (args[0].compareTo("0") == 0) {
            // TODO invoke your statement coverage instrument function

            // TODO run tests on instrumented classes to generate coverage report

        } else if (args[0].compareTo("1") == 0) {
            // TODO invoke your branch coverage instrument function

            // TODO run tests on instrumented classes to generate coverage report

        } else if (args[0].compareTo("2") == 0) {
            // TODO invoke your line coverage instrument function

            // TODO run tests on instrumented classes to generate coverage report

        }
    }
}
