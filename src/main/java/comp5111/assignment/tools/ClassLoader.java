package comp5111.assignment.tools;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoader {
    public static Class<?> reload(Class<?> targetClass) throws ClassNotFoundException, IOException {
//        System.out.printf("my class is Class@%x%n", targetClass.hashCode());
//        System.out.println("reloading");
        URL[] urls = {targetClass.getProtectionDomain().getCodeSource().getLocation()};
        java.lang.ClassLoader delegateParent = targetClass.getClassLoader().getParent();
        try (URLClassLoader cl = new URLClassLoader(urls, delegateParent)) {
            Class<?> reloaded = cl.loadClass(targetClass.getName());
            System.out.printf("reloaded class: %s@%x%n", targetClass.getName(), reloaded.hashCode());
//            System.out.println("Different classes: " + (targetClass != reloaded));
            return reloaded;
        }
    }
}
