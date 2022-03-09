# Assignment 1: Frequently Asked Questions (FAQs)

## 1. Do we need to modify the input parameter when using randoop to generate new test cases?

You can modify the given parameters or use your customized parameters. 
However, the generated test cases should be able to achieve enough coverage.

## 2. Why cannot Soot properly read the classpath and throws SootClassNotFoundexception for my implemented class?

Soot has its own classpath when analyzing the programs (different from the java classpath). This exception happened 
when you haven’t properly set soot-classpath before calling any soot APIs that use your own implemented classes.

You may set soot-classpath before invoking any Soot API by:

```java
Options.v().set_soot_classpath(Scene.v().defaultClassPath() + ":your/classpath/");
```
(Options is in package soot.options)

## 3. Why we got the exception "java.lang.RuntimeException: @param-assignment statements should precede all non-identity statements" ?

This exception happened when you try to instrument the code before the declaration statement in Jimple Body. 
The Jimple body requires that, the declaration of the statement and assignments of parameters (including this object) should be always be in the front of other statements in the method body.
For example:
```java
public static void main(java.lang.String[])
{
    java.lang.String[] r0;
    int i0, $i1;
    java.io.PrintStream $r1;
    java.lang.StringBuilder $r2, $r3, $r4;
    java.lang.String $r5;
    r0 := @parameter0: java.lang.String[];
    i0 = 0;
    goto label1;
 label0:
    staticinvoke <TestInvoke: void foo()>();
    i0 = i0 + 1;
 label1:
    if i0 < 10 goto label0;
    $r1 = <java.lang.System: java.io.PrintStream out>;
    $r2 = new java.lang.StringBuilder;
    specialinvoke $r2.<java.lang.StringBuilder: void <init>(java.lang.String)>("I made ");
    $i1 = <TestInvoke: int calls>;
    $r3 = virtualinvoke $r2.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>($i1);
    $r4 = virtualinvoke $r3.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" static calls");
    $r5 = virtualinvoke $r4.<java.lang.StringBuilder: java.lang.String toString()>();
    virtualinvoke $r1.<java.io.PrintStream: void println(java.lang.String)>($r5);
    return;
}
```
 
Therefore, please skip the instrumentation of these statements. 
We give a hint here, these statements are the objects of the class "soot.jimple.internal.JIdentityStmt".

## 4. Do we need to consider the classes other than `comp5111.assignment.cut.Subject` when measuring code coverage?

In our assignment, we only expect you to measure the code coverage of `comp5111.assignment.cut.Subject`, including the inner classes. 
Others classes, like `java.lang.String`, should not be instrumented.

## 5. Do we need to consider try and catch in branch coverage (task 2)?

In our assignment, there is no need to consider it.

## 6. How to run the junit test with the instrumented classes?

There are multiple ways.
1. run the test using command line.

``java -cp ./path_to_junit_jar:./path_to_soot_classes org.junit.runner.JUnitCore [test class name]
``
2. you can use the similar way shown by our [demo video](https://course.cse.ust.
hk/comp5111/assignment/asg01/ScreenShow_Turtorial_1_720p.mov).
   
3. **(Recommended)** Use junit runner to run tests programmatically. 
One tutorial can be found [here](https://github.com/junit-team/junit4/wiki/Test-runners).

## 7. The timeout mechanism in Randoop may not work well when running the program instrumented by Soot.

When applying Randoop to generate unit tests for the subject, some test cases will trigger an infinite loop. 
Randoop leverages the timeout mechanism to handle such cases.
Thus, there is no problem when running Randoop on the subject.

However, the timeout mechanism cannot work well when instrumenting the program using soot. There is currently no solution for such cases. 
You can skip such test cases in your assignment.

## 8. Why we got ClassNotFound Exception when executing the test cases with the instrumented subject?

There are ten inner classes used in Subject.java. 
If you use Soot to instrument only `comp5111.assignment.cut.Subject` class, inner classes will not be instrumented. 
ClassNotFound exception may occur when executing the test cases that invoking inner classes.

You may change the "-process-dir" argument passed to Soot to let Soot instrument all the class files in a folder.

## 9. How to preserve the line number in Soot?

You need two things to get the source code line numbers:

1) When you compile the code you will be analyzing, you need to use the `-g` switch to javac. 
   Otherwise, javac does not insert source line information into the bytecode, so Soot does not find it there.

2) You need to give the `-keep-line-number` command-line switch to Soot. 
   Otherwise, by default, it throws away the source line numbers to save memory.
   

## 10. The branch coverage reported by EclEmma is different with the result using Soot if exception occurs.
This is related to the implementation of EclEmma. 
Please read [here](https://github.com/jacoco/eclemma/issues/61). 
EclEmma is based on JaCoCo. 

## 11. For statement/line coverage of class Check and HeapSort, the difference between Soot and EclEmma can be huge.
If you encounter a large statement/line coverage difference (over 10%) between Soot and EclEmma on the class Check and HeapSort, don't worry because it can be caused by the implementation difference between EclEmma and Soot's instrumentation scheme. For other classes, the coverage result between Soot and EclEmma should be similar.


