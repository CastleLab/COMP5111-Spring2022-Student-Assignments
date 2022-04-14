package comp5111.assignment.instrument.runtime;

@FunctionalInterface
public interface OnVisitCallback {
    public void onVisitTestRequirement(String className, String subSignature, String testRequirementId,
                                       TestRequirementCollection<? extends TestRequirement> testRequirementCollection);
}
