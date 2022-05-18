package comp5111.assignment.faultlocalization;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringJoiner;

public class SuspiciousRanking extends ArrayList<TestExecutionTracer.Statement> {
    @Override
    public void add(int index, TestExecutionTracer.Statement element) {
        super.add(index, element);
        Collections.sort(this);
        this.rank();
    }

    @Override
    public boolean addAll(Collection<? extends TestExecutionTracer.Statement> c) {
        boolean r = super.addAll(c);
        Collections.sort(this);
        this.rank();
        return r;
    }

    @Override
    public boolean addAll(int index, Collection<? extends TestExecutionTracer.Statement> c) {
        boolean r = super.addAll(index, c);
        Collections.sort(this);
        this.rank();
        return r;
    }

    @Override
    public boolean add(TestExecutionTracer.Statement faultLocalizationStatement) {
        boolean r = super.add(faultLocalizationStatement);
        Collections.sort(this);
        this.rank();
        return r;
    }

    private void rank() {
        // this private method assumes the statement list is sorted by score
        for (TestExecutionTracer.Statement entry : this) {
            int N = 0, M = 0;
            for (TestExecutionTracer.Statement stmt : this) {
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
    }

    public void genReport(String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write(new StringJoiner("\t")
                .add("Class")
                .add("MethodSignature")
                .add("FaultLocalizationStatement")
                .add("lineNumber")
                .add("Score")
                .add("Ranking")
                .add("passed_s")
                .add("failed_s")
                .toString() + "\n"
        );
        this.forEach(entry -> {
            try {
                writer.write(entry.toString() + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();
    }
}
