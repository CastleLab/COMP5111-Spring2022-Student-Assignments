package comp5111.assignment.tools;

import javax.tools.JavaCompiler;
import javax.tools.JavaFileObject;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.File;
import java.util.Arrays;

public class Compilation {
    public static void CompileFiles(String pathToTarget, String... pathToFiles) {
        for (String p :
            pathToFiles) {
            CompileFile(pathToTarget, p);
        }
    }

    public static void CompileFiles(String... pathToFiles) {
        for (String p :
            pathToFiles) {
            CompileFile(p);
        }
    }

    public static void CompileFile(String pathToTarget, String pathToFile) {
        JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager fileManager = compiler.getStandardFileManager(null, null, null);
        File file = new File(pathToFile);
        Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjects(file);
        JavaCompiler.CompilationTask task = compiler.getTask(null, fileManager, null, Arrays.asList("-g", "-d",
            pathToTarget), null,
            compilationUnits);
        task.call();
    }

    public static void CompileFile(String pathToClass) {
        CompileFile("target/classes", pathToClass);
    }
}
