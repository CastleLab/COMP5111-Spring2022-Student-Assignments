package comp5111.assignment.instrument.runtime;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class TestRequirementCollection<TestRequirementType extends TestRequirement> implements HumanReadable {

    private final Map<String, Class> classMap;

    public TestRequirementCollection() {
        this.classMap = new HashMap<>();
    }

    public void visitTestRequirement(String className, String subSignature, String id) {
        this.classMap.get(className).visitTestRequirement(subSignature, id);
    }

    public void visitOrRegisterTestRequirement(String className, String subSignature, TestRequirementType testRequirement) {
        TestRequirementType tr = this.get(className, subSignature, testRequirement.id);
        if (tr == null) {
            this.registerTestRequirements(className, subSignature, Collections.singleton(testRequirement));
        }
        this.visitTestRequirement(className, subSignature, testRequirement.id);
    }

    public void registerTestRequirements(String className, String subSignature,
                                         Collection<TestRequirementType> unitList) {
        if (!this.classMap.containsKey(className)) {
            this.classMap.put(className, new Class(className));
        }
        this.classMap.get(className).registerTestRequirements(subSignature, unitList);
    }

    public Class get(String className) {
        return this.classMap.get(className);
    }

    public Method get(String className, String subSignature) {
        Class classObj = this.classMap.get(className);
        if (classObj == null) {
            return null;
        }
        return classObj.methodMap.get(subSignature);
    }

    public TestRequirementType get(String className, String subSignature, String id) {
        Method method = this.get(className, subSignature);
        if (method == null) {
            return null;
        }
        return method.testRequirementMap.get(id);
    }

    public int getTotalCount() {
        int total = 0;
        for (Map.Entry<String, Class> entry :
            classMap.entrySet()) {
            total += entry.getValue().getTotalCount();
        }
        return total;
    }

    public int getCoveredCount() {
        int coveredCount = 0;
        for (Map.Entry<String, Class> entry :
            classMap.entrySet()) {
            coveredCount += entry.getValue().getCoveredCount();
        }
        return coveredCount;
    }

    public float getCoverPercentage() {
        if (this.getTotalCount() == 0) {
            return 0;
        }
        return ((float) this.getCoveredCount()) / this.getTotalCount();
    }

    public void forEach(ClassConsumer<TestRequirementType> consumer) {
        for (Map.Entry<String, Class> entry :
            classMap.entrySet()) {
            if (!consumer.consume(entry.getKey(), entry.getValue())) {
                break;
            }
        }
    }

    public void forEach(MethodConsumer<TestRequirementType> consumer) {
        this.forEach((className, classObj) -> {
            for (Map.Entry<String, Method> methodEntry :
                classObj.methodMap.entrySet()) {
                if (!consumer.consume(className, methodEntry.getKey(), methodEntry.getValue())) {
                    return false;
                }
            }
            return true;
        });
    }

    public void forEach(TestRequirementConsumer<TestRequirementType> consumer) {
        this.forEach((className, subSignature, method) -> {
            for (Map.Entry<String, TestRequirementType> testRequirementEntry :
                method.testRequirementMap.entrySet()) {
                if (!consumer.consume(className, subSignature, testRequirementEntry.getKey(),
                    testRequirementEntry.getValue())) {
                    return false;
                }
            }
            return true;
        });
    }

    public void clear() {
        this.classMap.clear();
    }

    public void reset() {
        this.classMap.forEach((k0, classObj) -> {
            classObj.reset();
            classObj.methodMap.forEach((k1, methodObj) -> {
                methodObj.reset();
                methodObj.testRequirementMap.forEach((k2, tr) -> {
                    tr.reset();
                });
            });
        });
    }

    /**
     * summarize the profile into a string
     *
     * @return string
     */
    @Override
    public String toOverviewString() {
        List<String> list = new ArrayList<>();
        list.add(String.format("Overall: \ntotal: %-4d  covered: %-4d  percentage: %.1f%%\n", this.getTotalCount(),
            this.getCoveredCount(), this.getCoverPercentage() * 100));
        for (Map.Entry<String, Class> entry :
            this.classMap.entrySet()) {
            list.add(String.format("%s\n%s",
                entry.getKey(), entry.getValue().toOverviewString()));
        }
        return String.join("\n==============================================================\n\n", list);
    }

    @Override
    public String toDetailString() {
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Class> entry :
            this.classMap.entrySet()) {
            list.add(String.format(
                "%s\n%s",
                entry.getKey(), entry.getValue().toDetailString()));
        }
        return String.join("\n==============================================================\n\n", list);
    }

    // iterators
    @FunctionalInterface
    public interface ClassConsumer<T extends TestRequirement> {
        // return false to interrupt iteration
        boolean consume(String className, TestRequirementCollection<T>.Class classObj);
    }

    @FunctionalInterface
    public interface MethodConsumer<T extends TestRequirement> {
        // return false to interrupt iteration
        boolean consume(String className, String subSignature, TestRequirementCollection<T>.Method method);
    }

    @FunctionalInterface
    public interface TestRequirementConsumer<TestRequirementType extends TestRequirement> {
        // return false to interrupt iteration
        boolean consume(String className, String subSignature, String id,
                        TestRequirementType testRequirement);
    }

    /**
     * This class represents a Class in the java code to calculate coverage
     * summarize the coverage result of a class
     */
    public class Class extends CoverageCounter implements HumanReadable {
        private final String name;

        // the map from method subSignature to method (coverage.runtime.Method) object
        private final Map<String, Method> methodMap;

        private Class(String name) {
            this.name = name;
            this.methodMap = new TreeMap<>((o1, o2) -> {
                String fn1, fn2;
                if (o1.contains(" ")) {
                    fn1 = o1.split(" ")[1];
                } else {
                    fn1 = o1;
                }
                if (o2.contains(" ")) {
                    fn2 = o2.split(" ")[1];
                } else {
                    fn2 = o2;
                }
                return fn1.compareTo(fn2);
            });
        }

        /**
         * visit one test requirement in the method
         *
         * @param subSignature: the subSignature of the method
         * @param id:           the id of the coverage unit in the method
         */
        private void visitTestRequirement(String subSignature, String id) {
            this.methodMap.get(subSignature).visitTestRequirement(id);
        }

        /**
         * register a test requirement
         *
         * @param subSignature        the subSignature of the method
         * @param testRequirementList the list of test requirements to register
         */
        private void registerTestRequirements(String subSignature, Collection<TestRequirementType> testRequirementList) {
            if (!methodMap.containsKey(subSignature)) {
                this.methodMap.put(subSignature, new Method(subSignature));
            }
            this.methodMap.get(subSignature).registerTestRequirements(testRequirementList);
        }

        public int getTotalCount() {
            int total = 0;
            for (Map.Entry<String, Method> entry :
                methodMap.entrySet()) {
                total += entry.getValue().getTotalCount();
            }
            return total;
        }

        public int getCoveredCount() {
            int coveredCount = 0;
            for (Map.Entry<String, Method> entry :
                methodMap.entrySet()) {
                coveredCount += entry.getValue().getCoveredCount();
            }
            return coveredCount;
        }

        public float getCoverPercentage() {
            if (this.getTotalCount() == 0) {
                return 0;
            }
            return ((float) this.getCoveredCount()) / this.getTotalCount();
        }

        @Override
        public String toOverviewString() {
            List<String> list = new ArrayList<>();
            list.add(String.format("total: %-4d  covered: %-4d  percentage: %.1f%%", this.getTotalCount(),
                this.getCoveredCount(), this.getCoverPercentage() * 100));
            for (Map.Entry<String, Method> entry :
                this.methodMap.entrySet()) {
                list.add(String.format("\t%s\n\t\t%s", entry.getKey(), entry.getValue().toOverviewString()));
            }
            return String.join("\n", list);
        }

        @Override
        public String toDetailString() {
            List<String> list = new ArrayList<>();
            list.add(String.format("total: %-4d  covered: %-4d  percentage: %.1f%%", this.getTotalCount(),
                this.getCoveredCount(), this.getCoverPercentage() * 100));
            for (Map.Entry<String, Method> entry :
                this.methodMap.entrySet()) {
                list.add(String.format("%s\n%s", entry.getKey(), entry.getValue().toDetailString()));
            }
            return String.join("\n\n", list);
        }

        @Override
        public String toString() {
            return name;
        }
    }

    /**
     * Method summarizes the coverage analysis result of one method
     */
    public class Method extends CoverageCounter implements HumanReadable {
        private final String subSignature;
        // the mapping from the index number (a int number) to TestRequirement (can be Statement, Instruction, Branch, etc.)
        private final Map<String, TestRequirementType> testRequirementMap;

        private Method(String subSignature) {
            this.subSignature = subSignature;
            this.testRequirementMap = new TreeMap<>(String::compareTo);
        }

        /**
         * initialize the Method with a list of all coverage unit
         *
         * @param unitList: a list of all coverage unit
         */
        private void registerTestRequirements(Collection<TestRequirementType> unitList) {
            // put every coverage unit to the map
            for (TestRequirementType tr :
                unitList) {
                this.testRequirementMap.put(tr.id, tr);
            }
        }

        /**
         * visit test requirement one time
         *
         * @param id: the id of the coverage unit
         */
        private void visitTestRequirement(String id) {
            this.testRequirementMap.get(id).visit();
        }

        public int getTotalCount() {
            return this.testRequirementMap.size();
        }

        public int getCoveredCount() {
            AtomicInteger coveredCount = new AtomicInteger();
            this.testRequirementMap.forEach((k, v) -> {
                if (v.isVisited()) {
                    coveredCount.getAndIncrement();
                }
            });
            return coveredCount.get();
        }

        public float getCoverPercentage() {
            if (this.getTotalCount() == 0) {
                return 0;
            }
            return ((float) this.getCoveredCount()) / this.getTotalCount();
        }


        @Override
        public String toOverviewString() {
            return String.format("total: %-4d  covered: %-4d  percentage: %.1f%%", this.getTotalCount(),
                this.getCoveredCount(), this.getCoverPercentage() * 100);
        }

        @Override
        public String toDetailString() {
            List<String> list = new ArrayList<>();
            this.testRequirementMap.forEach((k, v) -> {
                String str = v.toDetailString();
                list.add(str);
            });
            list.add(String.format("Coverage: total: %-4d  covered:%-4d  percentage: %.1f%%", this.getTotalCount(),
                this.getCoveredCount(), this.getCoverPercentage() * 100));
            return String.join("\n", list);
        }

        @Override
        public String toString() {
            return subSignature;
        }
    }
}
