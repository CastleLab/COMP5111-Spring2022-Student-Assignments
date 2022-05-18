package comp5111.assignment.faultlocalization.algorithm;

import comp5111.assignment.faultlocalization.ScoreAlgorithm;

public class DStar implements ScoreAlgorithm {
    private final double star;

    public DStar(double star) {
        this.star = star;
    }

    @Override
    public double calcStatementScore(int passed_s, int failed_s, int totalPassed, int totalFailed) {
        double dividend = Math.pow(failed_s, star);
        double divisor = passed_s + totalFailed - failed_s;
        return dividend / divisor;
    }
}
