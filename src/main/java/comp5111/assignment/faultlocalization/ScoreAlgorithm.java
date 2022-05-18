package comp5111.assignment.faultlocalization;

@FunctionalInterface
public interface ScoreAlgorithm {
    double calcStatementScore(int passed_s, int failed_s, int totalPassed, int totalFailed);
}
