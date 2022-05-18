package comp5111.assignment.faultlocalization.algorithm;

import comp5111.assignment.faultlocalization.ScoreAlgorithm;

public class Ochiai implements ScoreAlgorithm {
    @Override
    public double calcStatementScore(int passed_s, int failed_s, int totalPassed, int totalFailed) {
        return failed_s / (Math.sqrt(totalFailed * (failed_s + passed_s)));
    }
}
