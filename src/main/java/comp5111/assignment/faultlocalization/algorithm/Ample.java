package comp5111.assignment.faultlocalization.algorithm;

import comp5111.assignment.faultlocalization.ScoreAlgorithm;

public class Ample implements ScoreAlgorithm {
    @Override
    public double calcStatementScore(int passed_s, int failed_s, int totalPassed, int totalFailed) {
        return Math.abs((double) failed_s / totalFailed - (double) passed_s / totalPassed);
    }
}
