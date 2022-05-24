package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_2_Test0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.YES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yes" + "'", str0, "yes");
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) (-1), "yes");
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) 100.0d, "");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("yesyeshi!", (int) (short) 10, false, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " yesyeshi!" + "'", str4, " yesyeshi!");
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        comp5111.assignment.cut.Subject.BooleanUtils booleanUtils0 = new comp5111.assignment.cut.Subject.BooleanUtils();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex(" yesyeshi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.ELLIPSIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "..." + "'", str0, "...");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, " yesyeshi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  yesyeshi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "", " yesyeshi!", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(false, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                 " + "'", str2, "hi!                                                                                                 ");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!", "hi!", "yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        boolean[] booleanArray0 = comp5111.assignment.cut.Subject.BooleanUtils.primitiveValues();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[false, true]");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "yesyeshi!", "hi!                                                                                                 ", "...", "hi!", " yesyeshi!" };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.join(strArray6, "...");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!" + "'", str8, "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        comp5111.assignment.cut.Subject.UrlUtils urlUtils0 = new comp5111.assignment.cut.Subject.UrlUtils();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.lang.Boolean[] booleanArray0 = comp5111.assignment.cut.Subject.BooleanUtils.booleanValues();
        org.junit.Assert.assertNotNull(booleanArray0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((-1));
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!" + "'", str2, "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('a', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) (byte) 0, (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) ' ', (int) ' ', (int) (short) 0, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("yes", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String[] strArray2 = new java.lang.String[] { "yes", "hi!" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "yes");
        boolean boolean6 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yesyeshi!" + "'", str4, "yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 100, (int) '4', 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        int int1 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(true, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isTrue((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotTrue((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.UTF8_CHARSET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!", '4', false);
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.FALSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "false" + "'", str0, "false");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        comp5111.assignment.cut.Subject.Check.notEmpty("yes", "false");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) 100.0d, "hi!                                                                                                 ");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 100, (int) (byte) 10, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String[] strArray3 = new java.lang.String[] { "...", "...", " yesyeshi!" };
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray3, "");
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.join(strArray3, "yesyeshi!");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str7, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        comp5111.assignment.cut.Subject.Check.notEmpty("UTF-8", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("...", "false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("hi!", "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("hi!                                                                                                 ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("false", "hi!", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("", "UTF-8", "...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("yesyeshi!", "hi!");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("          ", "UTF-8", "yes");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) -1, (int) (short) 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        comp5111.assignment.cut.Subject.PrimUtils primUtils0 = new comp5111.assignment.cut.Subject.PrimUtils();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("UTF-8", "UTF-8");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.negate((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.negate((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) (byte) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("", ' ');
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join("", strList4);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.join("", strList4);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "          ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!" + "'", str4, "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("false", "false");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.ON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "on" + "'", str0, "on");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("yes,hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes,hi!" + "'", str1, "yes,hi!");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        int[] intArray4 = new int[] { (byte) -1, '#' };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator5 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort((int) '#', 0, intArray4, intComparator5);
        java.lang.Class<?> wildcardClass7 = intArray4.getClass();
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[-1, 35]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) (short) 0, 10, progressable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!", "hi!", "          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ...yesyes          ...                                                                                                           .........          ... yesyes          " + "'", str3, "          ...yesyes          ...                                                                                                           .........          ... yesyes          ");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("yes,hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must not be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml(" yesyeshi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " yesyeshi!" + "'", str1, " yesyeshi!");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 10.0d, 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!", '4', false);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("", '4', strList5);
        java.util.List<java.lang.String> strList7 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList5);
        java.lang.Class<?> wildcardClass8 = strList7.getClass();
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "...yesyeshi!...yesyeshi! yesyeshi!", "UTF-8", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str4, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        int int0 = comp5111.assignment.cut.Subject.StringUtils.MNEMONIC_INDEX_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.OFF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "off" + "'", str0, "off");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        comp5111.assignment.cut.Subject.Check.notEmpty("hi!", "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("yes,hi!", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("yes,hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes,hi!" + "'", str1, "yes,hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) (short) 10, (int) ' ', progressable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, 0, (int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.NO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "no" + "'", str0, "no");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("          ...yesyes          ...                                                                                                           .........          ... yesyes          ", "no", "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty(" yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("on");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "on" + "'", str1, "on");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("hi!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yesUTF-8          ...yesyes          ...                                                                             ..." + "'", str1, "yesUTF-8          ...yesyes          ...                                                                             ...");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) ' ', 100, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("", "yes", "false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 0.0d, (int) '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                0.0" + "'", str3, "                                0.0");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(0, (int) '#', (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("UTF-8", 100, false, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                               UTF-8" + "'", str4, "                                                                                               UTF-8");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.TRUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(1, (int) (short) -1, (int) (short) 1, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("hi!                                                                                                 ", "yes");
        boolean boolean4 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("false", 1, true, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "f" + "'", str4, "f");
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("                                                                                               UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("...yesyeshi!...yesyeshi! yesyeshi!", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                                                                                 " + "'", str1, "hi!                                                                                                 ");
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("yesUTF-8          ...yesyes          ...                                                                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(100, (-1), (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) '#', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", "yes,hi!", "                                0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) 0, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("off", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        comp5111.assignment.cut.Subject.Check.isTrue(true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "yesUTF-8          ...yesyes          ...                                                                             ...");
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, 1, (int) 'a', progressable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "yesUTF-8          ...yesyes          ...                                                                             ...", "                                0.0", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                0.0" + "'", str4, "                                0.0");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", "hi!", "                                0.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!" + "'", str3, "yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.split("false", 'a');
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!", strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "fhi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!lse" + "'", str4, "fhi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!lse");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 0, 0, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (short) 1, 1);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("true", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true" + "'", str2, "true");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                                                                                 " + "'", str1, "hi!                                                                                                 ");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("yesUTF-8          ...yesyes          ...                                                                             ...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"yesUTF-8          ...yesyes          ...                                                                             ...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("          ...yesyes          ...                                                                                                           .........          ... yesyes          ", "hi!                                                                                                 ", "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StrUtils.DELIM_CHARS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/:;.,%#" + "'", str0, "/:;.,%#");
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        comp5111.assignment.cut.Subject.StrUtils strUtils0 = new comp5111.assignment.cut.Subject.StrUtils();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (byte) 0, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 100, (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 0, 0, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, (int) 'a', (int) (byte) 0, progressable9);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable11 = null;
        heapSort0.sort(indexedSortable11, 100, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable15 = null;
        comp5111.assignment.cut.Subject.Progressable progressable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable15, (int) (byte) 0, (int) (short) 10, progressable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("...yesyeshi!...yesyeshi! yesyeshi!", "/:;.,%#", "          ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str4, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("          ", (int) '4', true, ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                    " + "'", str4, "                                                    ");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                    " + "'", str2, "                                                    ");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(10);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("", ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("f");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"f\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "hi!                                                                                                 ");
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        int int1 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String[] strArray0 = null;
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.join(strArray0, "yes");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) ' ', (int) '4', progressable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("...yesyeshi!...yesyeshi! yesyeshi!", "no");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(1, (int) (short) -1, (int) (short) 10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "          ", "...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(" yesyeshi!", "fhi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!lse", "fhi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!lse");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes,hi!", 'a', true);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!                                                                                                 ", '4', strList5);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        comp5111.assignment.cut.Subject.Check.notEmpty("UTF-8", "UTF-8");
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("true", "yes,hi!");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("...yesyeshi!...yesyeshi! yesyeshi!", "on");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('a', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("off", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "off       " + "'", str2, "off       ");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("...", " yesyeshi!");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('4', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (byte) 100, (int) '#', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                100" + "'", str3, "                                100");
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("off       ", "...yesyeshi!...yesyeshi! yesyeshi!", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        int int0 = comp5111.assignment.cut.Subject.StringUtils.MAX_COMMENT_DISPLAY_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 120 + "'", int0 == 120);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String[] strArray1 = new java.lang.String[] { " yesyeshi!" };
        boolean boolean3 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray1, "hi!");
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray1, "");
        boolean boolean7 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray1, "                                100");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " yesyeshi!" + "'", str5, " yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("true", "fhi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!lse");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String[] strArray2 = new java.lang.String[] { "yes", "hi!" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "yes");
        boolean boolean6 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yesyeshi!" + "'", str4, "yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str1, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("off       ", "yesyeshi!", "          ...yesyes          ...                                                                                                           .........          ... yesyes          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("yesUTF-8          ...yesyes          ...                                                                             ...", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad(" yesyeshi!", 0, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("false", "yes,hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("", '#', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) (byte) 10, "          ...yesyes          ...                                                                                                           .........          ... yesyes          ");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                                0.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                0.0" + "'", str1, "                                0.0");
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(0, (int) (short) 100, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("yesyeshi!", "                                100", "                                100", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yesyeshi!" + "'", str4, "yesyeshi!");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("yes");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("off       ", " yesyeshi!", "                                0.0", 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off       " + "'", str4, "off       ");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("fhi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!lse");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"fhi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!lse\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (byte) -1, 120, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                      -1" + "'", str3, "                                                                                                                      -1");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        char[] charArray8 = new char[] { 'a', '#', ' ', '4', ' ', 'a' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("yesyeshi!", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!                                                                                                 ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a# 4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a# 4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, #,  , 4,  , a]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "yesyeshi!" + "'", str9, "yesyeshi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(true, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("f");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitWS("UTF-8", false);
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join("                                                                                               UTF-8", strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", "yesUTF-8          ...yesyes          ...                                                                             ...", "                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("/:;.,%#", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) '#');
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("yes,hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("yesyeshi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("                                0.0", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 35, 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "5" + "'", str3, "5");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("false", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("off       ", "5", "                                100", "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!", '4', false);
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", strList4);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        char[] charArray1 = comp5111.assignment.cut.Subject.StrUtils.HEX_DIGITS;
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("", charArray1);
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "0123456789abcdef");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "0123456789abcdef");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("yesUTF-8          ...yesyes          ...                                                                             ...", (int) (short) 10, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ..." + "'", str3, "       ...");
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 120, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 35);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("                                100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("no", "          ");
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        comp5111.assignment.cut.Subject.Check.notEmpty("/:;.,%#", "5");
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: off");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("...yesyeshi!...yesyeshi! yesyeshi!", 35, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi! " + "'", str3, "...yesyeshi!...yesyeshi! yesyeshi! ");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("hi!                                                                                                 ", "yes");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yes" + "'", str3, "yes");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean(" yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###################################" + "'", str2, "###################################");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.util.List<java.lang.String> strList2 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.StrUtils.splitSmart("5", ' ', strList2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 100L, (int) (byte) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("yes", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("yes,hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes,hi!" + "'", str1, "yes,hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        char[] charArray9 = new char[] { '#', ' ', 'a', 'a', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...yesyeshi!...yesyeshi! yesyeshi!", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("          ", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("no", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "# aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "# aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#,  , a, a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str10, "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "no" + "'", str12, "no");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("hi!", "off");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "          ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:           ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 0, 0, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (short) 1, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) (short) 10, (int) (short) 100, progressable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("###################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty("", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: off must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("on", (int) (byte) 100, true, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on                                                                                                  " + "'", str4, "on                                                                                                  ");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("yes", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.split("false", 'a');
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join("          ...yesyes          ...                                                                                                           .........          ... yesyes          ", strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "f          ...yesyes          ...                                                                                                           .........          ... yesyes          lse" + "'", str4, "f          ...yesyes          ...                                                                                                           .........          ... yesyes          lse");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("                                                                                               UTF-8", "/:;.,%#");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "...yesyeshi!...yesyeshi! yesyeshi! ");
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                                                                                               UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                               UTF-8" + "'", str1, "                                                                                               UTF-8");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                    ", '#');
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("yesUTF-8          ...yesyes          ...                                                                             ...", 'a', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!...yesyeshi!...hi!                                                                                                ..." + "'", str1, "hi!...yesyeshi!...hi!                                                                                                ...");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("no");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "/:;.,%#", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String[] strArray1 = new java.lang.String[] { " yesyeshi!" };
        boolean boolean3 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray1, "hi!");
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray1, "yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "yes");
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(35, (int) 'a', (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("off");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("", "hi!...yesyeshi!...hi!                                                                                                ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", (int) (byte) 0, true, ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("true", "hi!                                                                                                 ", "          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "true" + "'", str3, "true");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("yesUTF-8          ...yesyes          ...                                                                             ...", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        int[] intArray8 = new int[] {};
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator9 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort((int) (short) 10, (-1), intArray8, intComparator9);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator11 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort((int) 'a', (int) '#', intArray8, intComparator11);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator13 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort((int) 'a', 35, intArray8, intComparator13);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator15 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort((int) (short) 10, 100, intArray8, intComparator15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("", ' ');
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) strList2, "       ...");
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        char[] charArray9 = new char[] { '#', ' ', 'a', 'a', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...yesyeshi!...yesyeshi! yesyeshi!", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("          ", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "# aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "# aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#,  , a, a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str10, "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str12, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 35, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(100);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "...", " yesyeshi!", "f");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " yesyeshi!" + "'", str4, " yesyeshi!");
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("       ...", (int) '4', true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       ...                                          " + "'", str3, "       ...                                          ");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        char[] charArray7 = new char[] { 'a', '#', ' ', '4', ' ', 'a' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("yesyeshi!", charArray7);
        java.lang.Class<?> wildcardClass9 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a# 4 a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a# 4 a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, #,  , 4,  , a]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "yesyeshi!" + "'", str8, "yesyeshi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "                                                                                                                      -1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:                                                                                                                       -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("yesyeshi!", "yesUTF-8          ...yesyes          ...                                                                             ...", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) 0.0f, " yesyeshi!");
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 0, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("...yesyeshi!...yesyeshi! yesyeshi! ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...yesyeshi!...yesyeshi! yesyeshi!\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("5");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "5" + "'", str1, "5");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("       ...                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ..." + "'", str1, "       ...");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("       ...", '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", 'a', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...,..., yesyeshi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...,..., yesyeshi!" + "'", str2, "...,..., yesyeshi!");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("yes,hi!", "/:;.,%#");
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("UTF-8", (int) (short) 10, false, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     UTF-8" + "'", str4, "     UTF-8");
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('a', 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("true", (int) (short) 1, false, '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("off", "5", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off" + "'", str3, "off");
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 10, (int) (short) 10, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("e", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "e" + "'", str2, "e");
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...,..., yesyeshi!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...,..., yesyeshi!" + "'", str2, "...,..., yesyeshi!");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        int[] intArray8 = new int[] { (byte) 0, 0, 1, (short) -1, 120, (byte) 100 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator9 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort((-1), (int) (short) 100, intArray8, intComparator9);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 0, 1, -1, 120, 100]");
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("off", "f", "hi!...yesyeshi!...hi!                                                                                                ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ohi!...yesyeshi!...hi!                                                                                                ...hi!...yesyeshi!...hi!                                                                                                ..." + "'", str3, "ohi!...yesyeshi!...hi!                                                                                                ...hi!...yesyeshi!...hi!                                                                                                ...");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) ' ', (int) (short) 1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("on", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "on" + "'", str2, "on");
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 0, 0, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (short) 1, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        heapSort0.sort(indexedSortable10, 120, 0);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "5", "hi!", "off       ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "5" + "'", str4, "5");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("e");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "e" + "'", str1, "e");
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("          ", "UTF-8");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (short) 0, (int) (byte) 1, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("                                100", 1, false, ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        comp5111.assignment.cut.Subject.StringUtils stringUtils0 = new comp5111.assignment.cut.Subject.StringUtils();
        java.lang.Class<?> wildcardClass1 = stringUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        char[] charArray9 = new char[] { '#', ' ', 'a', 'a', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...yesyeshi!...yesyeshi! yesyeshi!", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("          ", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                                      -1", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "# aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "# aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#,  , a, a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str10, "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1" + "'", str12, "-1");
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 120, (java.lang.Integer) (-1), (java.lang.Integer) 120, (java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("          ", "          ");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty(objArray0, "off       ");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: off        must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################################################################" + "'", str2, "####################################################################################################");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("e");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"e\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("5", 'a');
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("     UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("false", 'a');
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("no", "                                                                                               UTF-8", "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "no" + "'", str3, "no");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.lang.String[] strArray2 = new java.lang.String[] { "yes", "hi!" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "yes");
        boolean boolean6 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!");
        boolean boolean8 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "off");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yesyeshi!" + "'", str4, "yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (byte) -1, 120, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                      -1" + "'", str3, "                                                                                                                      -1");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, 120, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        char[] charArray9 = new char[] { '#', ' ', 'a', 'a', 'a', '#' };
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...yesyeshi!...yesyeshi! yesyeshi!", charArray9);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("yesyeshi!", charArray9);
        java.lang.String str12 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("...yesyeshi!...yesyeshi! yesyeshi! ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "# aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "# aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#,  , a, a, a, #]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str10, "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "yesyeshi!" + "'", str11, "yesyeshi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str12, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "on", "off", "                                                    ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("false", "UTF-8");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(120, 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("yes,hi!", "on                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("hi!                                                                                                 ", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("on                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "on                                                                                                  " + "'", str1, "on                                                                                                  ");
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        comp5111.assignment.cut.Subject.Check.notEmpty("          ...yesyes          ...                                                                                                           .........          ... yesyes          ", "off       ");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("5", "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!", "f          ...yesyes          ...                                                                                                           .........          ... yesyes          lse", "                                100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("yesUTF-8          ...yesyes          ...                                                                             ...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "...yesyeshi!...yesyeshi! yesyeshi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 10);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("-1", 120, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                      -1" + "'", str3, "                                                                                                                      -1");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", "     UTF-8", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("     UTF-8", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     UTF-8" + "'", str2, "     UTF-8");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("-1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "-1" + "'", str1, "-1");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("     UTF-8", ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "0");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("true", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true" + "'", str2, "true");
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("on                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 1, (java.lang.Integer) (-1), (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("-1");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaa");
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "100" + "'", str1, "100");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("       ...", "####################################################################################################", "       ...", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       ..." + "'", str4, "       ...");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("       ...                                          ", "                                0.0");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(0, 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("hi!...yesyeshi!...hi!                                                                                                ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!...yesyeshi!...hi!                                                                                                ..." + "'", str1, "hi!...yesyeshi!...hi!                                                                                                ...");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, 0, 100, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("          ...yesyes          ...                                                                                                           .........          ... yesyes          ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) 'a', (int) ' ', 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (short) -1, (int) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("", " yesyeshi!", "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        char[] charArray1 = comp5111.assignment.cut.Subject.StrUtils.HEX_DIGITS;
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...yesyeshi!...yesyeshi! yesyeshi!", charArray1);
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) str2, "");
        org.junit.Assert.assertNotNull(charArray1);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray1), "0123456789abcdef");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray1), "0123456789abcdef");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray1), "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str2, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("          ...yesyes          ...                                                                                                           .........          ... yesyes          ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("yes", "                                100", "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yes" + "'", str3, "yes");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("5", "on");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("/:;.,%#", "...,..., yesyeshi!");
        boolean boolean4 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("off       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        char[] charArray8 = new char[] { '#', ' ', 'a', 'a', 'a', '#' };
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...yesyeshi!...yesyeshi! yesyeshi!", charArray8);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!...yesyeshi!...hi!                                                                                                ...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "# aaa#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "# aaa#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[#,  , a, a, a, #]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str9, "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!...yesyeshi!...hi!                                                                                                ..." + "'", str10, "hi!...yesyeshi!...hi!                                                                                                ...");
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("on", "hi!...yesyeshi!...hi!                                                                                                ...", "/:;.,%#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "on" + "'", str3, "on");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "e", "yesyeshi!", "on                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "e" + "'", str4, "e");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("e", "UTF-8", "UTF-8");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e" + "'", str3, "e");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("false", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "f" + "'", str2, "f");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("yes");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) (short) 10, "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("e", "hi!                                                                                                 ", "...,..., yesyeshi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "e" + "'", str3, "e");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("          ...yesyes          ...                                                                                                           .........          ... yesyes          ", "...yesyeshi!...yesyeshi! yesyeshi!");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("       ...                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("off       ", "no");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("yes", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yes                                                                                              " + "'", str2, "yes                                                                                              ");
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) ' ', (int) (short) 10, (int) (short) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("          ", "yes                                                                                              ", "false", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 10, (java.lang.Integer) 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("          ", "off       ", " yesyeshi!", "       ...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!", '4', false);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("", '4', strList6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.join("hi!                                                                                                 ", strList6);
        java.util.List<java.lang.String> strList9 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList6);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) '4');
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("...yesyeshi!...yesyeshi! yesyeshi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str1, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 0, 1, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("###################################");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("/:;.,%#", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/:;.,%#" + "'", str2, "/:;.,%#");
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '4', (int) 'a', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("true");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("yesUTF-8          ...yesyes          ...                                                                             ...", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yesUTF-8          ...yesyes          ...                                                         " + "'", str2, "yesUTF-8          ...yesyes          ...                                                         ");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("f", "          ", "                                100");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "f" + "'", str3, "f");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("", (int) (byte) 0, true, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("yes                                                                                              ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (short) 10, (int) (byte) 1);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        heapSort0.sort(indexedSortable10, (-1), (int) (short) 0, progressable13);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable15 = null;
        comp5111.assignment.cut.Subject.Progressable progressable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable15, 10, (int) 'a', progressable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!", "...yesyeshi!...yesyeshi! yesyeshi! ", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split(" yesyeshi!", "aaaaaaaaaa");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "f          ...yesyes          ...                                                                                                           .........          ... yesyes          lse");
        boolean boolean6 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "true");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa" + "'", str1, "aaaaaaaaaa");
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("false", "", "          ", "###################################");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("       ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       ..." + "'", str1, "       ...");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("aaaaaaaaaa", "...,..., yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("f", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("yesyeshi!", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        comp5111.assignment.cut.Subject.Check.notEmpty("/:;.,%#", "          ");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.lang.String[] strArray2 = new java.lang.String[] { "yes", "hi!" };
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "yes");
        boolean boolean6 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "aaaaaaaaaa");
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "     UTF-8");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yesyeshi!" + "'", str4, "yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "yes     UTF-8hi!" + "'", str8, "yes     UTF-8hi!");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.lang.String[] strArray30 = new java.lang.String[] { "on", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "true", "                                100", "yesyeshi!", "hi!...yesyeshi!...hi!                                                                                                ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "5", "hi!                                                                                                 ", "f          ...yesyes          ...                                                                                                           .........          ... yesyes          lse", "fhi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!lse", "yesUTF-8          ...yesyes          ...                                                                             ...", "f          ...yesyes          ...                                                                                                           .........          ... yesyes          lse", "          ...yesyes          ...                                                                                                           .........          ... yesyes          ", "off       ", "...", "hi!                                                                                                 ", "off       ", "/:;.,%#", "f          ...yesyes          ...                                                                                                           .........          ... yesyes          lse", "###################################", "          ", "off", "off       ", "yesUTF-8          ...yesyes          ...                                                                             ...", "          ...yesyes          ...                                                                                                           .........          ... yesyes          " };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                                                                                      -1", '#', (java.util.List<java.lang.String>) strList31);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("", '4', (java.util.List<java.lang.String>) strList31);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "e", "          ...yesyes          ...                                                                                                           .........          ... yesyes          ", "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          ...yesyes          ...                                                                                                           .........          ... yesyes          " + "'", str4, "          ...yesyes          ...                                                                                                           .........          ... yesyes          ");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("yes     UTF-8hi!");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad(" yesyeshi!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " yesyeshi!                      " + "'", str2, " yesyeshi!                      ");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("on", "       ...", "off       ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("          ", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) 100.0f, "e");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("5", "hi!...yesyeshi!...hi!                                                                                                ...", "e", "yes                                                                                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(120, (int) ' ', (int) (byte) -1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                    ", '#');
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join("yes", strList5);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                0.0", ' ', strList5);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                    " + "'", str6, "                                                    ");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 0, 0, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (short) 1, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, 0, (int) (byte) 10, progressable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("     UTF-8");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("yes     UTF-8hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "                                0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:                                 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString(' ', (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), (int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yesUTF-8          ...yesyes     ..." + "'", str2, "yesUTF-8          ...yesyes     ...");
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("yesUTF-8          ...yesyes     ...", "off       ", "...,..., yesyeshi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad(" ", (int) (byte) 1, false, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("yesUTF-8          ...yesyes          ...                                                                             ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yesUTF-8          ...yesyes          ...                                                                             ..." + "'", str2, "yesUTF-8          ...yesyes          ...                                                                             ...");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.split("                                                                                                                      -1", 'a');
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join("          ...yesyes          ...                                                                                                           .........          ... yesyes          ", strList4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join("100", strList4);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                                      -1" + "'", str5, "                                                                                                                      -1");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                      -1" + "'", str6, "                                                                                                                      -1");
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("true", ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 0, (int) (byte) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, (int) (short) 100, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("####################################################################################################", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.lang.String[] strArray1 = new java.lang.String[] { " yesyeshi!" };
        boolean boolean3 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray1, "hi!");
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray1, "");
        boolean boolean7 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray1, "1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " yesyeshi!" + "'", str5, " yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 1, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("0", "100", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("####################################################################################################", "aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("                                   ");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("off", "          ...yesyes          ...                                                                                                           .........          ... yesyes          ", "                                0.0", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        comp5111.assignment.cut.Subject.Check.notEmpty("off       ", "true");
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!", ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("       ...                                          ", "       ...                                          ", "e");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) ' ', 1, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic(" yesyeshi!                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " yesyeshi!                      " + "'", str1, " yesyeshi!                      ");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "UTF-8", "       ...", "yes");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "       ..." + "'", str4, "       ...");
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                               UTF-8", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                               UTF-8" + "'", str2, "                                                                                               UTF-8");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        char[] charArray2 = comp5111.assignment.cut.Subject.StrUtils.HEX_DIGITS;
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...yesyeshi!...yesyeshi! yesyeshi!", charArray2);
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!...yesyeshi!...hi!                                                                                                ...", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "0123456789abcdef");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "0123456789abcdef");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, a, b, c, d, e, f]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str3, "...yesyeshi!...yesyeshi! yesyeshi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!...yesyeshi!...hi!                                                                                                ..." + "'", str4, "hi!...yesyeshi!...hi!                                                                                                ...");
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(97, (int) (byte) 1, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 0, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("yesUTF-8          ...yesyes     ...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yesUTF-8          ...yesyes     ..." + "'", str2, "yesUTF-8          ...yesyes     ...");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("1", (int) (short) 1, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("yes", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yes" + "'", str2, "yes");
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("          ...yesyes          ...                                                                                                           .........          ... yesyes          ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          ...yesyes          ...                                                                                                           .........          ... yesyes          " + "'", str2, "          ...yesyes          ...                                                                                                           .........          ... yesyes          ");
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("...", "yes", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("yesUTF-8          ...yesyes     ...", "       ...                                          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "...yesyeshi!...yesyeshi! yesyeshi!", " yesyeshi!", "                                                                                               UTF-8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str4, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "ohi!...yesyeshi!...hi!                                                                                                ...hi!...yesyeshi!...hi!                                                                                                ...");
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("       ...                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("                                   ", "yesUTF-8          ...yesyes          ...                                                                                                           .........          ... yesyes          UTF-8                                0.0...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!UTF-8noUTF-8yesyeshi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        char[] charArray6 = new char[] { '4', '4', 'a', '#', '#' };
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("yes,hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "44a##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "44a##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4, 4, a, #, #]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "yes,hi!" + "'", str7, "yes,hi!");
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 1, 100, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.String[] strArray1 = new java.lang.String[] { " yesyeshi!" };
        boolean boolean3 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray1, "hi!");
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray1, "");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray1, " yesyeshi!                      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " yesyeshi!" + "'", str5, " yesyeshi!");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("aaaaaaaaaa", ' ', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("...,..., yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "     UTF-8", "false", "0");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     UTF-8" + "'", str4, "     UTF-8");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "aaaaaaaaaa", "5", "hi!...yesyeshi!...hi!                                                                                                ...");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaa" + "'", str4, "aaaaaaaaaa");
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi!", "...,..., yesyeshi!", "0", "hi!...yesyeshi!...hi!                                                                                                ...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("f          ...yesyes          ...                                                                                                           .........          ... yesyes          lse", "hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("###################################", "                                100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("yes                                                                                              ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yes                          ..." + "'", str2, "yes                          ...");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        comp5111.assignment.cut.Subject.Check.notEmpty("hi!...yesyeshi!...hi!                                                                                                 .........hi!... yesyeshi!", "       ...                                          ");
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) '4', (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 120, (java.lang.Integer) 1, (java.lang.Integer) 120, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(100, 0, (int) (short) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 35, (java.lang.Integer) 120, (java.lang.Integer) 10, (java.lang.Integer) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.lang.String[] strArray1 = new java.lang.String[] { " yesyeshi!" };
        boolean boolean3 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray1, "hi!");
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray1, "");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " yesyeshi!" + "'", str5, " yesyeshi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " yesyeshi!" + "'", str6, " yesyeshi!");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(120, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) ' ', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "yesUTF-8          ...yesyes     ...", "       ...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "false", "yesUTF-8          ...yesyes          ...                                                         ", "                                   ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("     UTF-8", "", "yesUTF-8          ...yesyes     ...", "yes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!                                                                                                 ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                 " + "'", str2, "hi!                                                                                                 ");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("yes                                                                                              ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "hi!                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yes                                                                                              " + "'", str3, "yes                                                                                              ");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("...yesyeshi!...yesyeshi! yesyeshi!", "hi!                                                                                                 ", "          ...yesyes          ...                                                                                                           .........          ... yesyes          ", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...yesyeshi!...yesyeshi! yesyeshi!" + "'", str4, "...yesyeshi!...yesyeshi! yesyeshi!");
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("no", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no" + "'", str2, "no");
    }
}

