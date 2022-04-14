package comp5111.assignment;

import comp5111.assignment.instrument.InstrumentTransformer;
import comp5111.assignment.instrument.runtime.TestRequirement;
import soot.*;
import soot.options.Options;

public class SootDriver {
    public static void instrument(Class<? extends TestRequirement> testRequirementClass, Class<? extends InstrumentTransformer> instrumenterClass, String... sootArgs) {
        instrument("./target/classes", testRequirementClass, instrumenterClass, sootArgs);
    }

    public static void instrument(String targetPath, Class<? extends TestRequirement> testRequirementClass, Class<? extends InstrumentTransformer> instrumenterClass, String... sootArgs) {
        G.v().resetSpark();
        // reset soot in case of multiple instrumentation run
        G.reset();

        /*Set the soot-classpath to include the helper class and class to analyze*/
        String classPathSeparator = ":";
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            classPathSeparator = ";";
        }
        String classPath =Scene.v().defaultClassPath() + 
        		classPathSeparator + "./lib/junit-4.12.jar" +
        		classPathSeparator + "./lib/hamcrest-core-1.3.jar" +
        		classPathSeparator + targetPath;
        Options.v().set_soot_classpath(classPath);
        Options.v().set_output_dir("./target/classes");

        // retain line numbers
        Options.v().set_keep_line_number(true);
        // retain the original variable names
        Options.v().setPhaseOption("jb", "use-original-names:true");

        // try to load the test requirement class, because soot only makes it possible to load class in static methods
        if (testRequirementClass != null) {
            Scene.v().loadClassAndSupport(testRequirementClass.getName());
        }

        InstrumentTransformer instrumenter = null;
        try {
            instrumenter = instrumenterClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        /* add a phase to transformer pack by call Pack.add */
        Pack jtp = PackManager.v().getPack("jtp");

        jtp.add(new Transform("jtp.instrumenter", instrumenter));

        // for debug only
        for (String arg : sootArgs) {
            System.out.println(arg);
        }
        soot.Main.main(sootArgs);

        jtp.remove("jtp.instrumenter");
    }
}
