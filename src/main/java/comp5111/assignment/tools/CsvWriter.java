package comp5111.assignment.tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CsvWriter {
    private final String separator;

    private final List<String> headers;

    private final List<List<String>> entries;

    public CsvWriter(List<String> headers, String separator) {
        this.separator = separator;
        this.headers = headers;
        this.entries = new ArrayList<>();
    }

    public CsvWriter(String separator) {
        this(null, separator);
    }

    public void append(List<String> entry) {
        if (headers != null) {
            assert entry.size() == headers.size();
        }
        this.entries.add(entry);
    }

    public void export(String path) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(new File(path));
        if (headers != null) {
            String payload = String.join(this.separator, this.headers);
            writer.append(payload).append("\n");
        }
        for (List<String> entry :
            this.entries) {
            String payload = String.join(this.separator, entry);
            writer.append(payload).append("\n");
        }
        writer.close();
    }
}
