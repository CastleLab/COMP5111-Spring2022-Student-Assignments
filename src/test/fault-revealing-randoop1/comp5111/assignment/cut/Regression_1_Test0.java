package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_1_Test0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.negate((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) '#', (int) '#', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!", (int) (byte) 0, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!", (int) '#', true, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!                                " + "'", str4, "hi!                                ");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        comp5111.assignment.cut.Subject.PrimUtils primUtils0 = new comp5111.assignment.cut.Subject.PrimUtils();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!", "hi!                                ", "", 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 0, 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!                                ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                " + "'", str2, "hi!                                ");
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("", "", "hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!,hi!,hi!", "", "hi!", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,hi!,hi!" + "'", str4, "hi!,hi!,hi!");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("hi!", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) (-1.0d), "hi!");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must not be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 1, (int) (short) 1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "hi!,hi!,hi!");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("hi!", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!                                ", "hi!                                ", "", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!,hi!,hi!", "hi!", "hi!                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.OFF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "off" + "'", str0, "off");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!,hi!,hi!" + "'", str1, "hi!,hi!,hi!");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.Boolean[] booleanArray0 = comp5111.assignment.cut.Subject.BooleanUtils.booleanValues();
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) booleanArray0, "hi!");
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("off");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"off\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("hi!                                ", "hi!                                ");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("off", (int) (short) 10, true, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off       " + "'", str4, "off       ");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!                                ", (int) 'a', false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              hi!                                " + "'", str3, "                                                              hi!                                ");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.TRUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("                                                              hi!                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                              hi!                                " + "'", str1, "                                                              hi!                                ");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        comp5111.assignment.cut.Subject.StringUtils stringUtils0 = new comp5111.assignment.cut.Subject.StringUtils();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                              hi!                                ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                              hi!                                " + "'", str2, "                                                              hi!                                ");
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) 'a', (int) (short) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "", "hi!                                ");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) 'a', (int) (byte) 1, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("", "                                                              hi!                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        int int0 = comp5111.assignment.cut.Subject.StringUtils.MAX_COMMENT_DISPLAY_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 120 + "'", int0 == 120);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "                                                              hi!                                ", "hi!", "                                                              hi!                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!                                ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("off       ", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                              hi!                                ", "off", "hi!                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              hi!                                " + "'", str3, "                                                              hi!                                ");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("", 0, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!", (int) '#', false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                hi!" + "'", str3, "                                hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 10, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isTrue((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        comp5111.assignment.cut.Subject.UrlUtils urlUtils0 = new comp5111.assignment.cut.Subject.UrlUtils();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.Boolean[] booleanArray0 = comp5111.assignment.cut.Subject.BooleanUtils.booleanValues();
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) booleanArray0, "                                hi!");
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotTrue((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        comp5111.assignment.cut.Subject.StrUtils strUtils0 = new comp5111.assignment.cut.Subject.StrUtils();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.YES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yes" + "'", str0, "yes");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StrUtils.DELIM_CHARS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/:;.,%#" + "'", str0, "/:;.,%#");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.UTF8_CHARSET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.ON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "on" + "'", str0, "on");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("yes", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yes" + "'", str2, "yes");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("hi!,hi!,hi!", "true", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,hi!,hi!" + "'", str3, "hi!,hi!,hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notEmpty("", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!,hi!,hi!" + "'", str1, "hi!,hi!,hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "on", "yes", "UTF-8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                hi!", "", "                                hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                hi!" + "'", str3, "                                hi!");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int1 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("/:;.,%#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/:;.,%#" + "'", str1, "/:;.,%#");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 100, 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 100" + "'", str3, "                                                                                                 100");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("off       ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "off       " + "'", str2, "off       ");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                              hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("on");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "on" + "'", str1, "on");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        comp5111.assignment.cut.Subject.BooleanUtils booleanUtils0 = new comp5111.assignment.cut.Subject.BooleanUtils();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) 'a');
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("yes", "                                hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("on");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 1.0d, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int int1 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("", "                                hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "hi!,hi!,hi!", "/:;.,%#", "on");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,hi!,hi!" + "'", str4, "hi!,hi!,hi!");
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "                                                                                                 100", "UTF-8", "UTF-8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("", "                                                                                                 100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) '4', 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("/:;.,%#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/:;.,%#" + "'", str1, "/:;.,%#");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 10, 120, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("yes", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!                                ", '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("", (int) '4', true, ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                    " + "'", str4, "                                                    ");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.ELLIPSIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "..." + "'", str0, "...");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.NO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "no" + "'", str0, "no");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.util.List<java.lang.String> strList0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("                                hi!", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("off       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("hi!                                ", "...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("/:;.,%#", "                                                                                                 100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, 120, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("off", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.FALSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "false" + "'", str0, "false");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) (byte) 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "", "hi!,hi!,hi!", "UTF-8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,hi!,hi!" + "'", str4, "hi!,hi!,hi!");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("false", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false" + "'", str2, "false");
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("on", "                                hi!", "UTF-8", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String[] strArray0 = null;
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.join(strArray0, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!                                ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                " + "'", str2, "hi!                                ");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("true");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("                                                    ", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("################################", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########..." + "'", str2, "##########...");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        int[] intArray5 = new int[] { (short) 100, (short) -1, 0 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator6 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort(0, (int) (short) 100, intArray5, intComparator6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[100, -1, 0]");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!", "false", "##########...", 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        comp5111.assignment.cut.Subject.Check.notEmpty("                                                              hi!                                ", "UTF-8");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("no", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!,hi!,hi!", ' ');
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("...", '#', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                 100", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 100" + "'", str2, "                                                                                                 100");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                    ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################" + "'", str1, "################################");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("true", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true" + "'", str2, "true");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString(' ', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("off       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                                                                                                 100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 100" + "'", str1, "                                                                                                 100");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                                                                 100", "/:;.,%#", "##########...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 100" + "'", str3, "                                                                                                 100");
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("off       ", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("yes");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("off       ", "hi!                                ", "...", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off       " + "'", str4, "off       ");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("on", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "on" + "'", str2, "on");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, 10, (int) '4', progressable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        comp5111.assignment.cut.Subject.Check.notEmpty("...", "                                                                                                 100");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("on");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, 1, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(false, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi!                                ", "no", "/:;.,%#", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("no", "/:;.,%#", "                                                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) (-1), (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                 100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi!hi!hi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("yes", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yes       " + "'", str2, "yes       ");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("/:;.,%#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/:;.,%#" + "'", str1, "/:;.,%#");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 10, (-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("false", '4', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((-1), (int) (byte) 1, (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("yes       ", "/:;.,%#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 10, 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        10" + "'", str3, "        10");
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 120);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: off");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("                                                                                                 100", "        10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("                                                    ", "yes       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("false", "                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                                                                 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!,hi!,hi!", "on", "hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,hi!,hi!" + "'", str3, "hi!,hi!,hi!");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, 10, (int) (short) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("hi!                                ", "true");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "true", "false");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("no", (int) 'a', false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                               no" + "'", str3, "                                                                                               no");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        int[] intArray10 = new int[] { (short) 0, (byte) 100, (short) -1, (short) -1 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator11 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort(1, 0, intArray10, intComparator11);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator13 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort((int) '#', (int) (byte) 1, intArray10, intComparator13);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort((int) (short) 10, 100, intArray10, intComparator15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[0, 100, -1, -1]");
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("                                                                                               no");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 0, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("                                                                                                 100", "true");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("true", "no");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(120, 0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) '#');
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "no", "true", " ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("on", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (-1), 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("...", "UTF-8", "                                                                                                    ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "..." + "'", str4, "...");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        char[] charArray9 = new char[] { '4', ' ', 'a', '4', ' ', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                    ", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!hi!hi!", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 a4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 a4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , a, 4,  , #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!hi!hi!" + "'", str12, "hi!hi!hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('a', (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "hi!,hi!,hi!", "100", "false");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,hi!,hi!" + "'", str4, "hi!,hi!,hi!");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("no", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no" + "'", str2, "no");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("...");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("                                                                                                 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) -1, (int) '#', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        int int0 = comp5111.assignment.cut.Subject.StringUtils.MNEMONIC_INDEX_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        comp5111.assignment.cut.Subject.Check.isTrue(true);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("##########...", "", "                                hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("                                                              hi!                                ", "                                                    ", "/:;.,%#", "                                                                                                 100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("off       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("/:;.,%#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/:;.,%#" + "'", str1, "/:;.,%#");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        int[] intArray8 = new int[] { (short) 0, (byte) 100, (short) -1, (short) -1 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator9 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort(1, 0, intArray8, intComparator9);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort(0, (int) 'a', intArray8, intComparator11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        boolean[] booleanArray0 = comp5111.assignment.cut.Subject.BooleanUtils.primitiveValues();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[false, true]");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool(" ", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 0, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "hi!,hi!,hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!,hi!,hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("off       ", '4', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray3, "                                                              hi!                                ");
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.join(strArray3, "");
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.join(strArray3, " ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,hi!,hi!" + "'", str4, "hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!hi!hi!" + "'", str8, "hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! hi! hi!" + "'", str10, "hi! hi! hi!");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                              hi!                                ", '4', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "################################" + "'", str1, "################################");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (-1), 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 10, (int) (byte) 1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, 10, (int) (short) 10);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) (short) 1, (int) '4', progressable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("on", (int) (byte) 10, false, ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "        on" + "'", str4, "        on");
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 120, (java.lang.Integer) 100, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(true, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("on", "        on");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("", "on", "                                hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("                                                                                               no", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("yes");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"yes\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("hi! hi! hi!", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi! hi" + "'", str2, "hi! hi! hi");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("UTF-8", "false", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 35);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("UTF-8", "yes       ", "                                hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!,hi!,hi!" + "'", str1, "hi!,hi!,hi!");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 1, (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        char[] charArray2 = new char[] { 'a' };
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("/:;.,%#", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[a]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/:;.,%#" + "'", str3, "/:;.,%#");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("                                                              hi!                                ", "on");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("hi! hi! hi", "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("yes       ", (int) (short) 1, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "y" + "'", str3, "y");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 120, (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 10, (int) (byte) 1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("aaaaaaaaaa", "100", "yes       ", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        comp5111.assignment.cut.Subject.Check.notEmpty("hi!,hi!,hi!", "yes       ");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("no", "off       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("        on", (int) (byte) 100, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        on                                                                                          " + "'", str3, "        on                                                                                          ");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("100", "");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UTF-8 must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("off", "off       ");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "                                                                                               no");
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "hi!,hi!,hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "off" + "'", str6, "off");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("off       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("on", "hi! hi! hi", "                                                                                                 100", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) (short) -1, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!", (int) ' ', false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             hi!" + "'", str3, "                             hi!");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitWS("##########...", true);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes", '#', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("yes       ", "/:;.,%#", "true", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes       " + "'", str4, "yes       ");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("hi!", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("hi!                                ", "true");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "off       ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                " + "'", str3, "hi!                                ");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                             hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 10, (int) (byte) 1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("off       ", "true", "hi! hi! hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off       " + "'", str3, "off       ");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.split("true", 'a');
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("##########...", 'a', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        comp5111.assignment.cut.Subject.Check.notEmpty("        10", "");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "off       ", "no,", "                                hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off       " + "'", str4, "off       ");
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("hi!,hi!,hi!", "hi!");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "off       ");
        java.lang.String str5 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: true must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("100", "");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "yes       ");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: false must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!,hi!,hi!", "off", "UTF-8", "                                                                                                    ", "UTF-8", "...", "UTF-8", "                                                              hi!                                ", "                                hi!", "                                                              hi!                                ", "hi!hi!hi!", "false", "...", "hi!", "                                                              hi!                                ", "                                hi!", "                                hi!", "                                                                                                    ", "UTF-8" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("", ' ', (java.util.List<java.lang.String>) strList22);
        java.lang.Class<?> wildcardClass25 = strList22.getClass();
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########" + "'", str2, "##########");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (short) 1, (int) (short) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi! hi! hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        java.lang.Class<?> wildcardClass1 = heapSort0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("100", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "100" + "'", str2, "100");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("100");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("aaaaaaaaaa", "        10", "                                                                                               no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) '4', (int) (short) 100, (int) (byte) -1, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("", "hi!hi!hi!", "/:;.,%#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", false);
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) strList2, "        on                                                                                          ");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("off       ", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("off       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("        on");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        char[] charArray4 = new char[] { '#', ' ', '4' };
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("no", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "# 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "# 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[#,  , 4]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "no" + "'", str5, "no");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("y");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "y" + "'", str1, "y");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase(" ", "100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("##########...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########..." + "'", str1, "##########...");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                              hi!                                ", "on", "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.String[] strArray2 = new java.lang.String[] { "no", "" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "                                                              hi!                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "no," + "'", str3, "no,");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!" + "'", str1, "hi!hi!hi!");
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("true");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("off", "off       ");
        boolean boolean4 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "                                                                                               no");
        boolean boolean6 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "                                                              hi!                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 10, (int) (byte) 1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, 10, (int) (short) 10);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, 0, (int) (short) 10, progressable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!                                ", (int) '4', false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 hi!                                " + "'", str3, "                 hi!                                ");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("no,", "                                                                                                 100", "1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "", "aaaaaaaaaa", "/:;.,%#");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("UTF-8", 35, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8                              " + "'", str3, "UTF-8                              ");
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("hi! hi! hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi! hi" + "'", str1, "hi! hi! hi");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "                                                                                               no", "hi! hi! hi!", "        10");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                               no" + "'", str4, "                                                                                               no");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("                             hi!", "                                hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("yes       ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "                 hi!                                ", "##########...", "off       ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                 hi!                                " + "'", str4, "                 hi!                                ");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("off       ", "                                                                                                 100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("                 hi!                                ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          ..." + "'", str2, "          ...");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase(" ", "1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("true", "hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 52);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("##########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("          ...", "                                                                                                 100", "                                                                                               no", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          ..." + "'", str4, "          ...");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 10.0f, 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("                                                                                                 100");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                    ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("hi! hi! hi", 'a');
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("true", "y", "false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("off", "yes       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("/:;.,%#", "                             hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("UTF-8", "hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("UTF-8                              ", "hi! hi! hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        char[] charArray9 = new char[] { '4', ' ', 'a', '4', ' ', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!                                ", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!                                ", charArray9);
        java.lang.Class<?> wildcardClass13 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4 a4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4 a4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4,  , a, 4,  , #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!                                " + "'", str11, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!                                " + "'", str12, "hi!                                ");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (byte) -1, 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  -1" + "'", str3, "                                                                                                  -1");
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, 35, (int) '4', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("        10", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("##########", '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("UTF-8                              ", 35, true, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8                              " + "'", str4, "UTF-8                              ");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        int[] intArray8 = new int[] { (short) 0, (byte) 100, (short) -1, (short) -1 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator9 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort(1, 0, intArray8, intComparator9);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator11 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort(1, (int) 'a', intArray8, intComparator11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 100, -1, -1]");
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 35, (java.lang.Integer) 52, (java.lang.Integer) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi! hi! hi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, 1, 120, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "", "", "                                                              hi!                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("/:;.,%#");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("100", "");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "yes       ");
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((-1), 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 1, (int) '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                  1" + "'", str3, "                                  1");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty(objArray0, "                                                              hi!                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message:                                                               hi!                                 must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa" + "'", str1, "aaaaaaaaaa");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        comp5111.assignment.cut.Subject.Check.notEmpty("                                                                                               no", "aaaaaaaaaa");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "                                                              hi!                                ", "        10");
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("hi!,hi!,hi!", "hi!");
        boolean boolean4 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "hi! hi! hi");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("UTF-8", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("yes       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("...", "yes");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("          ...", "", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        char[] charArray8 = new char[] { '4', ' ', 'a', '4', ' ', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                    ", charArray8);
        java.lang.Class<?> wildcardClass11 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "4 a4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "4 a4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[4,  , a, 4,  , #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("          ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "hi! hi! hi!", "0", "          ...");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!" + "'", str1, "hi!hi!hi!");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("                                                                                               no", "                                                                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("no,", '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                                                                  -1", "100", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) (byte) 100, (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("UTF-8                              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) '4', (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("off", "off       ");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "true");
        java.lang.String str5 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "off" + "'", str5, "off");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("", "true");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        char[] charArray10 = new char[] { '4', ' ', 'a', '4', ' ', '#' };
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!", charArray10);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!                                ", charArray10);
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!                                ", charArray10);
        java.lang.String str14 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!                                ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4 a4 #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4 a4 #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4,  , a, 4,  , #]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!                                " + "'", str12, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!                                " + "'", str13, "hi!                                ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(52);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("yes       ", "                                                                                                 100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        comp5111.assignment.cut.Subject.Check.notEmpty("100", "hi!hi!hi!");
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("off", "off       ");
        boolean boolean4 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "                                                                                               no");
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "UTF-8                              ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "off" + "'", str6, "off");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("          ...");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("true", "yes       ", "/:;.,%#", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("                                                    ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty(" ", "hi! hi! hi");
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        int[] intArray12 = new int[] { (short) 0, (byte) 100, (short) -1, (short) -1 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator13 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort(1, 0, intArray12, intComparator13);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator15 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort((int) (short) 10, 10, intArray12, intComparator15);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator17 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort((int) (short) 0, 0, intArray12, intComparator17);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator19 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort((int) (byte) 0, (int) (byte) 100, intArray12, intComparator19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[0, 100, -1, -1]");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) (short) 1, 52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("####################################################################################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"####################################################################################################\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.split("hi! hi! hi", 'a');
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("####################################################################################################", '#', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("", "yes       ", "                 hi!                                ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("                                  1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                  1" + "'", str1, "                                  1");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        comp5111.assignment.cut.Subject.Check.notEmpty("yes", "off");
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("        on", "                                                    ");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "                 hi!                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        on" + "'", str3, "        on");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "        on" + "'", str5, "        on");
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("UTF-8", (int) (byte) 100, true, '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8                                                                                               " + "'", str4, "UTF-8                                                                                               ");
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 35, (java.lang.Integer) 1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("        10", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(35, (int) (byte) 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("UTF-8                                                                                               ", (int) (short) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("UTF-8                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) (byte) -1, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 100, 0, (int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("                                                                                                  -1", "1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("                                                              hi!                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("################################", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.join("hi! hi! hi!", strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("yes       ", "", "false", "        on                                                                                          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("##########...", "false", "y");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########..." + "'", str3, "##########...");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.negate((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("hi! hi! hi", "off", "        10");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi! hi" + "'", str3, "hi! hi! hi");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 52, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("##########...");
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi! hi! hi", 'a', strList5);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                                                                    ", '4', strList5);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("yes       ", " ", "y", 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yesyyyyyyy" + "'", str4, "yesyyyyyyy");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", false);
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("                                                    ", ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (-1L), (int) (short) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("100", "");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "true");
        boolean boolean7 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "                                                              hi!                                ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) (short) 10, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.util.List<java.lang.String> strList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.join("on", strList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty(" ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("##########");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        comp5111.assignment.cut.Subject.Check.notEmpty("false", "UTF-8                              ");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray3);
        boolean boolean7 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray3, "                                                                                                  -1");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,hi!,hi!" + "'", str4, "hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!,hi!,hi!" + "'", str5, "hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("hi!hi!hi!", "                 hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("UTF-8                                                                                               ", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (byte) -1, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty(objArray0, "y");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: y must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "hi!                                ");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (byte) 100, (int) (short) 1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("no,", "yes       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("on", 'a', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                              hi!                                ", "hi! hi! hi", "##########...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              hi!                                " + "'", str3, "                                                              hi!                                ");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "                                                                                               no", "UTF-8                              ", "no,");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                               no" + "'", str4, "                                                                                               no");
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(52, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, (int) (short) 10, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, 10, (int) ' ', progressable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("...", 52, true, ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...                                                 " + "'", str4, "...                                                 ");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (-1), 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("off", '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (byte) -1, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, 35, (int) '4', progressable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("####################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                 hi!                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                 hi!" + "'", str1, "                 hi!");
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "                                hi!", "true");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(120);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitWS("hi!", false);
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join("        on", strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties(" ", "yes");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "UTF-8");
        java.lang.String str5 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " " + "'", str5, " ");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("UTF-8                                                                                               ", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("yes", "        10", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yes" + "'", str3, "yes");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("                                hi!", "UTF-8");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("        on                                                                                          ", (int) (byte) 0, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("hi! hi! hi", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(true, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad(number0, 35, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool(" ", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                 hi!", "                                                    ", "                                                                                                  -1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 hi!" + "'", str3, "                 hi!");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 1, (int) (byte) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("no,", "                             hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 10, (int) (byte) 1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (byte) 0, (int) (short) -1);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) 'a', 120, progressable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart(" ", ' ', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("UTF-8                              ", 'a');
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("100", "");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str4 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("                             hi!", "off");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "                                                              hi!");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 0.0f, (int) 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                              0.0" + "'", str3, "                                                                                              0.0");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("####################################################################################################", 52, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################" + "'", str3, "####################################################");
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("1", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1         " + "'", str2, "1         ");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, 1, 35, 52);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('a', 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("hi!                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("hi!,hi!,hi!", "hi!");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "off       ");
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("...", "yes       ", "                                                                                                    ", "                                                              hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        java.lang.Number number0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad(number0, (int) '4', ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 10, (int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("on", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yesyyyyyyy", '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("...                                                 ", "          ...", "                 hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                                 " + "'", str3, "...                                                 ");
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("                                                                                                 100");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                              hi!                                ", "                                                                                                  -1", "          ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                              hi!                                " + "'", str3, "                                                              hi!                                ");
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("y");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "y" + "'", str1, "y");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "y", "...", "                 hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "y" + "'", str4, "y");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("no,", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no,                                                                                              " + "'", str2, "no,                                                                                              ");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.StrUtils.split("/:;.,%#", 'a');
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                                                                 100", '#', strList6);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi! hi! hi!", ' ', strList6);
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("y");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "y" + "'", str1, "y");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray3);
        boolean boolean6 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray3, "                                                              hi!                                ");
        java.lang.String str7 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray3);
        java.lang.String str8 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!,hi!,hi!" + "'", str4, "hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,hi!,hi!" + "'", str7, "hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,hi!,hi!" + "'", str8, "hi!,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

