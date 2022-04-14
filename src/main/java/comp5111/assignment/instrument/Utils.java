package comp5111.assignment.instrument;

import comp5111.assignment.tools.Pair;
import soot.*;
import soot.javaToJimple.LocalGenerator;
import soot.jimple.*;
import soot.util.Chain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * a collection of utilities to help Instrumentation
 */
public class Utils {
    /**
     * initialize a new object
     *
     * @param body:
     * @param sootClass:        the class of the object
     * @param argListSignature: the signature of argument list on constructor
     * @param args:             arguments for constructor
     * @return object, a list of statements that instantiate the object
     */
    public static Pair<Local, List<Unit>> newLocal(Body body, SootClass sootClass, String argListSignature,
                                                   Value... args) {
        return Utils.newLocal(body, sootClass, argListSignature, Arrays.asList(args));
    }

    /**
     * initialize a new object
     *
     * @param body:
     * @param sootClass:        the class of the object
     * @param argListSignature: the signature of argument list on constructor
     * @param args:             arguments for constructor
     * @return object, a list of statements that instantiate the object
     */
    public static Pair<Local, List<Unit>> newLocal(Body body, SootClass sootClass, String argListSignature,
                                                   List<Value> args) {
        NewExpr newExpr = Jimple.v().newNewExpr(sootClass.getType());
        Pair<Local, List<AssignStmt>> pair = Utils.newLocal(body, sootClass.getType(), newExpr);
        List<Unit> stmts = new ArrayList<>(pair.getValue());
        Local obj = pair.getKey();
        InvokeExpr constructExpr = Jimple.v().newSpecialInvokeExpr(obj,
            sootClass.getMethod(String.format("void <init>(%s)", argListSignature)).makeRef(), args);
        InvokeStmt constructStmt = Jimple.v().newInvokeStmt(constructExpr);
        stmts.add(constructStmt);
        return new Pair<>(obj, stmts);
    }

    /**
     * define a new local variable
     *
     * @param body:
     * @param type: the type of the variable
     * @return local variable
     */
    public static Local newLocal(Body body, Type type) {
        LocalGenerator lg = new LocalGenerator(body);
        return lg.generateLocal(type);
    }

    /**
     * define a new local variable and assign value to it
     *
     * @param body:
     * @param type:  the type of the variable
     * @param value: the initial value to assign
     * @return local variable and the assignment statement
     */
    public static Pair<Local, List<AssignStmt>> newLocal(Body body, Type type, Value value) {
        Local local = Utils.newLocal(body, type);
        AssignStmt assign = Jimple.v().newAssignStmt(local, value);
        return new Pair<>(local, Collections.singletonList(assign));
    }

    /**
     * define a new local with specific name
     *
     * @param body:
     * @param name:  the specific name
     * @param type:  the type of the variable
     * @param value: the initial value to assign
     * @return local variable and the assignment statement
     */
    public static Pair<Local, List<AssignStmt>> newLocal(Body body, String name, Type type, Value value) {
        Local local = Jimple.v().newLocal(name, type);
        body.getLocals().add(local);
        AssignStmt assignStmt = Jimple.v().newAssignStmt(local, value);
        return new Pair<>(local, Collections.singletonList(assignStmt));
    }

    /**
     * create a new array with given elementList and add to Unit Chain
     *
     * @param body:        the function body
     * @param type:        the element type in the array
     * @param elementList: the list of values in array
     * @return Local: the local variable of created array
     */
    public static Pair<Local, List<AssignStmt>> newArray(Body body, Type type, List<Value> elementList) {
        NewArrayExpr arrayExpr = Jimple.v().newNewArrayExpr(type, IntConstant.v(elementList.size()));
        Pair<Local, List<AssignStmt>> pair = Utils.newLocal(body, type, arrayExpr);
        List<AssignStmt> stmts = new ArrayList<>(pair.getValue());
        Local array = pair.getKey();

        for (int i = 0; i < elementList.size(); i++) {
            ArrayRef leftSide = Jimple.v().newArrayRef(array, IntConstant.v(i));
            AssignStmt assign = Jimple.v().newAssignStmt(leftSide, elementList.get(i));
            stmts.add(assign);
        }
        return new Pair<>(array, stmts);
    }

    /**
     * getBasicBlockByIndex a local variable from localChain, provided the name of local variable
     *
     * @param localChain: the LocalChain
     * @param name:       the name of the local variable
     * @return Local if it exists, null otherwise
     */
    public static Local getLocal(Chain<Local> localChain, String name) {
        Local local = null;
        for (Local l : localChain) {
            if (l.getName().equals(name)) {
                local = l;
                break;
            }
        }
        return local;
    }

    /**
     * getBasicBlockByIndex the <clinit> method of a SootClass
     *
     * @param sootClass: the class to getBasicBlockByIndex <clinit> method
     * @return the <clinit> method
     */
    public static SootMethod getClassInitMethod(SootClass sootClass) {
        SootMethod clinit = sootClass.getMethodUnsafe("void <clinit>()");
        if (clinit == null) {
            clinit = new SootMethod("<clinit>",
                null,
                VoidType.v(), Modifier.STATIC);
            sootClass.addMethod(clinit);
            JimpleBody body = Jimple.v().newBody(clinit);
            clinit.setActiveBody(body);
            body.getUnits().add(Jimple.v().newReturnVoidStmt());
        }
        return clinit;
    }

    /**
     * check if the SootMethod is Class init method (<clinit>)
     *
     * @param method Soot method
     * @return boolean
     */
    public static boolean isClassInitMethod(SootMethod method) {
        return method.getSubSignature().equals("void <clinit>()");
    }
}
