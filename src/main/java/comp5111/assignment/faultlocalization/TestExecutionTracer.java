package comp5111.assignment.faultlocalization;

import comp5111.assignment.instrument.coverage.StatementTestRequirement;
import comp5111.assignment.instrument.runtime.Profiler;
import comp5111.assignment.instrument.runtime.TestRequirementCollection;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.util.*;

public class TestExecutionTracer extends RunListener {
    public static class Statement extends StatementTestRequirement implements Comparable<Statement> {
        /**
         * name of the class that this statement belongs to
         */
        public final String className;

        /**
         * the subSignature of the method this statement belongs to
         */
        public final String subSignature;

        /**
         * suspicious score
         */
        double score = -2;

        /**
         * suspicious rank
         */
        int rank = -2;

        /**
         * number of passed tests reaching this statement
         */
        int passedTestsCount = 0;

        /**
         * number of failed tests reaching this statement
         */
        int failedTestsCount = 0;

        Statement(String className, String subSignature, StatementTestRequirement stmt) {
            super(stmt);
            this.className = className;
            this.subSignature = subSignature;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Statement entry = (Statement) o;
            return this.id.equals(entry.id) &&
                className.equals(entry.className) &&
                subSignature.equals(entry.subSignature);
        }

        @Override
        public int hashCode() {
            return Objects.hash(className, subSignature, this.id);
        }

        @Override
        public int compareTo(Statement o) {
            if (this.score > o.score) {
                return -1;
            } else if (this.score < o.score) {
                return 1;
            } else {
                // if score is equal, sort in alphabetical order of method name, subSignature and statement
                int clsCmp = this.className.compareTo(o.className);
                if (clsCmp == 0) {
                    int sigCmp = this.subSignature.compareTo(o.subSignature);
                    if (sigCmp == 0) {
                        return this.getStmt().compareTo(o.getStmt());
                    } else {
                        return sigCmp;
                    }
                } else {
                    return clsCmp;
                }
            }
        }

        @Override
        public String toString() {
            return new StringJoiner("\t")
                .add(className)
                .add(subSignature)
                .add(this.getStmt())
                .add(Integer.toString(this.getLineNumber()))
                .add(Double.toString(score))
                .add(Integer.toString(rank))
                .add(Integer.toString(this.passedTestsCount))
                .add(Integer.toString(this.failedTestsCount))
                .toString();
        }
    }

    // temp variables
    private boolean currentTestFailed = false;

    // execution information
    private int totalPassedTestsCount = 0;
    private int totalFailedTestsCount = 0;

    private final TestRequirementCollection<Statement> testRequirementCollection;

    public TestExecutionTracer() {
        this.testRequirementCollection = new TestRequirementCollection<>();
        // add callback on test requirement is visited during test execution.
        // save the visit on our own test requirement collection.
        Profiler.v().testRequirementCollection.forEach((className, subSignature, id, testRequirement) -> {
            Statement statement = new Statement(className, subSignature, (StatementTestRequirement) testRequirement);
            this.testRequirementCollection.registerTestRequirements(className, subSignature, Collections.singletonList(statement));
            return true;
        });
        Profiler.addOnVisitCallback((className, subSignature, testRequirementId, collection) -> {
            this.testRequirementCollection.visitTestRequirement(className, subSignature, testRequirementId);
        });
    }

    /* BEGIN JUnit hooks*/

    @Override
    public void testRunStarted(Description description) throws Exception {
        System.out.println("Start running test suite: " + description.getDisplayName());
        super.testRunStarted(description);
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        if (!Profiler.isLoaded()) {
            System.err.println("Coverage profiler is not loaded, check if java bytecode is correctly instrumented.");
        }
        System.out.println("Finish running test suite, total: " + result.getRunCount() + " failed: " + result.getFailureCount());
        super.testRunFinished(result);
    }

    @Override
    public void testStarted(Description description) {
        this.currentTestFailed = false;
    }

    @Override
    public void testFinished(Description description) {
        this.testRequirementCollection.forEach((className, subSignature, id, statement) -> {
            if (!statement.isVisited()) return true;
            if (this.currentTestFailed) {
                statement.failedTestsCount++;
            } else {
                statement.passedTestsCount++;
            }
            return true;
        });
        if (currentTestFailed) {
            this.totalFailedTestsCount++;
            System.out.println("Test case " + description.getDisplayName() + " failed");
        } else {
            this.totalPassedTestsCount++;
            System.out.println("Test case " + description.getDisplayName() + " passed");
        }
        this.testRequirementCollection.reset();
    }

    @Override
    public void testFailure(Failure failure) {
        this.currentTestFailed = true;
    }

    /* END JUnit hooks*/

    /* BEGIN ranking */

    /**
     * Rank statements in {@link TestExecutionTracer#testRequirementCollection}.
     */
    public SuspiciousRanking rank(ScoreAlgorithm scoreAlgorithm) {
        // collect all statements
        SuspiciousRanking ranking = new SuspiciousRanking();
        this.testRequirementCollection.forEach((className, subSignature, id, testRequirement) -> {
            double score = scoreAlgorithm.calcStatementScore(
                testRequirement.passedTestsCount,
                testRequirement.failedTestsCount,
                this.totalPassedTestsCount,
                this.totalFailedTestsCount
            );
            if (Double.isNaN(score)) {
                score = -1;
            }
            testRequirement.score = score;
            ranking.add(testRequirement);
            return true;
        });

        // the statement list is sorted by score, calculate its ranking
        for (Statement entry : ranking) {
            int N = 0, M = 0;
            for (Statement stmt : ranking) {
                if (stmt.score > entry.score) {
                    N++;
                    M++;
                } else if (stmt.score == entry.score) {
                    M++;
                } else {
                    break;
                }
            }
            entry.rank = (int) ((double) N + M + 1) / 2;
        }

        return ranking;
    }

    /* END ranking */

}
