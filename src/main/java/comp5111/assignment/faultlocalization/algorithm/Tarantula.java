package comp5111.assignment.faultlocalization.algorithm;

import comp5111.assignment.faultlocalization.ScoreAlgorithm;

public class Tarantula implements ScoreAlgorithm {
    @Override
    public double calcStatementScore(int passed_s, int failed_s, int totalPassed, int totalFailed) {
        double dividend = (double) failed_s / totalFailed;
        double divisor = (double) failed_s / totalFailed + (double) passed_s / totalFailed;
        return dividend / divisor;
    }
}
