package comp5111.assignment.instrument.runtime;

import java.util.Collection;

@FunctionalInterface
public interface OnRegisterCallback {
    public void onRegisterTestRequirement(String className, String subSignature,
                                          Collection<? extends TestRequirement> unitList);
}
