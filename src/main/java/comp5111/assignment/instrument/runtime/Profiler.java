package comp5111.assignment.instrument.runtime;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * Profiler is a singleton class that collection profile information of coverage analysis
 */
public class Profiler<TestRequirementType extends TestRequirement> {
    private static Profiler<? extends TestRequirement> profiler = null;
    private static List<OnVisitCallback> visitCallbacks = null;
    private static List<OnRegisterCallback> registerCallbacks = null;
    public final TestRequirementCollection<TestRequirementType> testRequirementCollection;

    private Profiler() {
        this.testRequirementCollection = new TestRequirementCollection<>();
    }

    // singleton for the profiler of coverage analysis
    public static <T extends TestRequirement> Profiler<T> v() {
        if (Profiler.profiler == null) {
            Profiler.profiler = new Profiler<T>();
        }
        return (Profiler<T>) Profiler.profiler;
    }

    public static boolean isLoaded() {
        return Profiler.profiler != null;
    }

    public static void addOnVisitCallback(OnVisitCallback callback) {
        if (Profiler.visitCallbacks == null) {
            Profiler.visitCallbacks = new LinkedList<>();
        }
        Profiler.visitCallbacks.add(callback);
    }

    public static void addOnRegisterCallback(OnRegisterCallback callback) {
        if (Profiler.registerCallbacks == null) {
            Profiler.registerCallbacks = new LinkedList<>();
        }
        Profiler.registerCallbacks.add(callback);
    }

    /**
     * visit a coverage unit in one method of the class
     *
     * @param className:    the class name (with package)
     * @param subSignature: the subSignature of the method
     * @param id:           the id of the coverage unit
     */
    public void visitTestRequirement(String className, String subSignature, String id) {
        this.testRequirementCollection.visitTestRequirement(className, subSignature, id);
        if (Profiler.visitCallbacks != null) {
            Profiler.visitCallbacks.forEach(callback -> callback.onVisitTestRequirement(className, subSignature, id, this.testRequirementCollection));
        }
    }

    public void noop() {
    }

    /**
     * this method is called at the beginning of execution, to set the coverage units
     *
     * @param className    :    the class name (with package)
     * @param subSignature : the subSignature of the method
     * @param unitList     :     the list of coverage units in the method body
     */
    public void registerTestRequirements(String className, String subSignature, Collection<TestRequirementType> unitList) {
        this.testRequirementCollection.registerTestRequirements(className, subSignature, unitList);
        if (Profiler.registerCallbacks != null) {
            Profiler.registerCallbacks.forEach(callback -> {
                callback.onRegisterTestRequirement(className, subSignature, unitList);
            });
        }
    }

    /**
     * this method is called at the beginning of execution, to set the coverage units
     *
     * @param className    :    the class name (with package)
     * @param subSignature : the subSignature of the method
     * @param unitList     :     the list of coverage units in the method body
     */
    public void registerTestRequirements(String className, String subSignature, TestRequirementType[] unitList) {
        Collection<TestRequirementType> trs = new HashSet<>(Arrays.asList(unitList));
        this.testRequirementCollection.registerTestRequirements(className, subSignature, trs);
        if (Profiler.registerCallbacks != null) {
            Profiler.registerCallbacks.forEach(callback -> {
                callback.onRegisterTestRequirement(className, subSignature, trs);
            });
        }
    }

    public TestRequirementCollection<TestRequirementType> getTestRequirementCollection() {
        return testRequirementCollection;
    }

    /**
     * Clear the profiler data, deleting all registered test requirements
     */
    public void clear() {
        this.testRequirementCollection.clear();
    }

    /**
     * Reset the profiler data, resetting all counters for all test requirements
     */
    public void reset() {
        this.testRequirementCollection.reset();
    }

    public String toReportString(String title) {
        return String.format("%s\n\n%s\n" +
                "********************************************************************************************\n%s" +
                "\n\n%s\n********************************************************************************************\n%s",
            title,
            "Overview:",
            this.testRequirementCollection.toOverviewString(),
            "Details:",
            this.testRequirementCollection.toDetailString());
    }

    /**
     * generate a coverage report and write to file
     */
    public void generateReport(String outputDir, String testSuiteName, String coverageType) throws IOException {
        String filename = String.format("%s-report-%s.txt"
            , testSuiteName, coverageType);
        String path = Paths.get(outputDir, filename).toString();
        if (!Files.exists(Paths.get(outputDir))) {
            Files.createDirectories(Paths.get(outputDir));
        }
        FileWriter fileWriter = new FileWriter(path);
        String title = testSuiteName + " - " + coverageType + " Coverage";
        fileWriter.write(this.toReportString(title));
        fileWriter.close();
        System.out.printf("Coverage report is generated at %s\n", path);
    }
}
