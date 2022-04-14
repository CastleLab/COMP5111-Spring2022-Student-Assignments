package comp5111.assignment.tools;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class JUnit {
    public static Result run(Class<?>... testSuiteClasses) {
        JUnitCore junit = new JUnitCore();
        return junit.run(testSuiteClasses);
    }

    public static Result[] run(RunListener listener, Class<?>... testSuiteClasses) {
        Result[] results = new Result[testSuiteClasses.length];
        for (int i = 0; i < testSuiteClasses.length; i++) {
            Class<?> suite = testSuiteClasses[i];
            results[i] = run(listener, suite);
        }
        return results;
    }

    public static Result run(RunListener listener, Class<?> testSuiteClass) {
        try {
            TestRunner runner = new TestRunner(testSuiteClass, listener);
            JUnitCore junit = new JUnitCore();
            return junit.run(runner);
        } catch (InitializationError error) {
            error.printStackTrace();
            System.err.println(error.toString());
            return null;
        }
    }

    private static class TestRunner extends BlockJUnit4ClassRunner {
        RunListener listener;

        public TestRunner(Class testClass, RunListener listener) throws InitializationError {
            super(testClass);
            this.listener = listener;
        }

        @Override
        public void run(RunNotifier notifier) {
            notifier.addListener(this.listener);
            notifier.fireTestRunStarted(getDescription());
            super.run(notifier);
        }
    }
}
