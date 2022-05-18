package comp5111.assignment.faultlocalization.algorithm;

import comp5111.assignment.faultlocalization.ScoreAlgorithm;

public class Jaccard implements ScoreAlgorithm {
    @Override
    public double calcStatementScore(int passed_s, int failed_s, int totalPassed, int totalFailed) {
        return (double) failed_s / (totalFailed + passed_s);
    }
}
