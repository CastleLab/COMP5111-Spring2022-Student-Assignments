package comp5111.assignment.cut;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression_0_Test0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 1, (int) 'a', (int) (byte) 10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notEmpty("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.TRUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray0, "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: true must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) (-1), (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("true", "true", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.YES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yes" + "'", str0, "yes");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.NO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "no" + "'", str0, "no");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("true");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must not be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("yes", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("no");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.OFF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "off" + "'", str0, "off");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("yes", "yes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("yes", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yes" + "'", str2, "yes");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("", '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("no", "off", "true");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "no" + "'", str3, "no");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        comp5111.assignment.cut.Subject.BooleanUtils booleanUtils0 = new comp5111.assignment.cut.Subject.BooleanUtils();
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        int int1 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("yes", "yes", "hi!", "off");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("yes");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(",");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) (-1), (java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("off", "no", "true", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "off" + "'", str4, "off");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!", "off", "no", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(10, 100, (int) (short) 0, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, 1, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames(",");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, ",");
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.UTF8_CHARSET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(true, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        int int0 = comp5111.assignment.cut.Subject.StringUtils.MNEMONIC_INDEX_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        boolean[] booleanArray0 = comp5111.assignment.cut.Subject.BooleanUtils.primitiveValues();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(booleanArray0), "[false, true]");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.FALSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "false" + "'", str0, "false");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) -1, (int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("no", (int) 'a', true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "no                                                                                               " + "'", str3, "no                                                                                               ");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("no                                                                                               ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"no\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("false", 'a', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("no                                                                                               ", (int) (byte) 100, true, '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no                                                                                                  " + "'", str4, "no                                                                                                  ");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 1, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd(",");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StrUtils.DELIM_CHARS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/:;.,%#" + "'", str0, "/:;.,%#");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("no", "/:;.,%#", "no                                                                                               ", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("UTF-8", "/:;.,%#", "off", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("/:;.,%#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/:;.,%#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.ELLIPSIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "..." + "'", str0, "...");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("no", "false", "no                                                                                               ", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine(",");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 1, (int) (short) 10, 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.negate((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isTrue((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("hi!", "no                                                                                               ", "no                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("no                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("yes", "off", "off", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        int int0 = comp5111.assignment.cut.Subject.StringUtils.MAX_COMMENT_DISPLAY_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 120 + "'", int0 == 120);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        comp5111.assignment.cut.Subject.StrUtils strUtils0 = new comp5111.assignment.cut.Subject.StrUtils();
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("UTF-8", "", ",", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("no                                                                                                  ", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 120);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.negate((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("UTF-8", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("/:;.,%#", "no", ",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) (short) 100, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("...", "yes");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes", '4', true);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.join("hi!", strList6);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("no", 'a', strList6);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "yes" + "'", str7, "yes");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("off");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 120, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, (int) (short) -1, 97, progressable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad(",", (int) (byte) -1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("", "/:;.,%#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(false, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) ' ', (int) (byte) 100, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("true", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("...", "", "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("false", (int) (short) 10, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     false" + "'", str3, "     false");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi!");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (-1), 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        comp5111.assignment.cut.Subject.Check.isTrue(true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("/:;.,%#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray0);
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.join(strArray0, "");
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        comp5111.assignment.cut.Subject.PrimUtils primUtils0 = new comp5111.assignment.cut.Subject.PrimUtils();
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("no");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 120, (java.lang.Integer) (-1), (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("no                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no" + "'", str1, "no");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 0, (int) '#', (int) (short) -1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((-1));
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("...", "off", "", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "..." + "'", str4, "...");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("     false", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     false" + "'", str2, "     false");
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: off");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic(",");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(100, (int) (byte) 100, 0, (int) ' ');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("UTF-8", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("no", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("no                                                                                                  ");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        int[] intArray8 = new int[] { (byte) 0, 1, '4', 1, (byte) 0, 97 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator9 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort(100, (int) (short) 0, intArray8, intComparator9);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[0, 1, 52, 1, 0, 97]");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("UTF-8", "...", "     false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTF-8" + "'", str3, "UTF-8");
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("     false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     false" + "'", str1, "     false");
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, ",");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "/:;.,%#");
        boolean boolean9 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "no");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("no                                                                                               ", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        comp5111.assignment.cut.Subject.UrlUtils urlUtils0 = new comp5111.assignment.cut.Subject.UrlUtils();
        java.lang.Class<?> wildcardClass1 = urlUtils0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("no                                                                                                  ", "no", "/:;.,%#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.ON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "on" + "'", str0, "on");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        comp5111.assignment.cut.Subject.Check.notEmpty("no                                                                                                  ", "yes");
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) '4', (int) (short) 1, 97);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes", 'a', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 120, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (short) 0, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        java.lang.String[] strArray9 = new java.lang.String[] { ",", "off", "hi!", "off", "yes", "true", "," };
        java.util.ArrayList<java.lang.String> strList10 = new java.util.ArrayList<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList10, strArray9);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("", '#', (java.util.List<java.lang.String>) strList10);
        java.lang.Class<?> wildcardClass13 = strList10.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("...", (int) (short) 100, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 ..." + "'", str3, "                                                                                                 ...");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) 0, 97, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("no                                                                                                  ", (int) ' ', false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                " + "'", str3, "                                ");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("                                                                                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 ..." + "'", str1, "                                                                                                 ...");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("no                                                                                               ", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (byte) 100, (int) (short) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 100L, (int) '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 100" + "'", str3, "                                                 100");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray0);
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray0, "no                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no                                                                                                   must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("no                                                                                                  ", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("hi!", true);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                                                                 ...", "                                                 100", "no                                                                                                  ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                 ..." + "'", str4, "                                                                                                 ...");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, ",");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "...");
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase(",", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("     false");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("no                                                                                               ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no                                                                                               " + "'", str2, "no                                                                                               ");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("no", '#');
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("false", ' ', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) -1, (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("true");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true" + "'", str1, "true");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd(",", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 100, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                                                                 ...", "                                                 100", "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (-1), (int) ' ', progressable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        int[] intArray4 = new int[] { (byte) 10, (byte) 10 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator5 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort(0, (int) (byte) 1, intArray4, intComparator5);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[10, 10]");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("yes", 100, true, ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes                                                                                                 " + "'", str4, "yes                                                                                                 ");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 10, 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("no                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"no\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("no", '#');
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("     false", (int) ' ', false, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                           false" + "'", str4, "                           false");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "0" + "'", str1, "0");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("", "/:;.,%#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase(",", "off");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("yes", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "yes" + "'", str2, "yes");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("false", "                                                 100", "off", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false" + "'", str4, "false");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("                                                                                                 ...", "on", "yes", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        comp5111.assignment.cut.Subject.Check.isTrue(true, ",");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("yes                                                                                                 ", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        comp5111.assignment.cut.Subject.Check.notEmpty("0", "/:;.,%#");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) 0.0d, "                                                 100");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("/:;.,%#", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "", "...", "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "..." + "'", str4, "...");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) '4');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("no", '#');
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join("hi!", strList5);
        java.util.List<java.lang.String> strList7 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList5);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes", 'a', strList7);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "no" + "'", str6, "no");
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("off", ",", "on");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off" + "'", str3, "off");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(100, 97, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.Object[] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty(objArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message:  must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, (int) (byte) 10);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        comp5111.assignment.cut.Subject.Progressable progressable8 = null;
        heapSort0.sort(indexedSortable5, (int) (short) 10, (int) (byte) -1, progressable8);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        heapSort0.sort(indexedSortable10, (-1), (int) (byte) 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable14, (int) (byte) 0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("                                ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 10.0d, 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      10.0" + "'", str3, "      10.0");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("UTF-8", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        int int1 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "");
        boolean boolean7 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "...");
        java.lang.String str8 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "," + "'", str8, ",");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 100, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("...");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                 100", "UTF-8", "no                                                                                                  ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                 100" + "'", str4, "                                                 100");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("no                                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no                                                                                               " + "'", str1, "no                                                                                               ");
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("no", "no                                                                                                  ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 1, 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("no");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("yes", "                                                 100");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, (int) (byte) 10);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        heapSort0.sort(indexedSortable5, 120, 97);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable9, 0, 120);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("UTF-8", "yes", "no                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("false", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad(",", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",                                                                                                   " + "'", str2, ",                                                                                                   ");
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("off", "...", "/:;.,%#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off" + "'", str3, "off");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("/:;.,%#", 97, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          /:;.,%#" + "'", str3, "                                                                                          /:;.,%#");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("true", "false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                                                          /:;.,%#", "/:;.,%#", "no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          no" + "'", str3, "                                                                                          no");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("...");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"...\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("hi!", "no");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 0, 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                   0" + "'", str3, "                                                                                                   0");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) -1, (-1), (int) 'a', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase(",", "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "on", "no");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("                                                                                          /:;.,%#");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "                                                                                                 ...", "/:;.,%#");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) (byte) -1, 97);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('4', 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("                                                                                                   0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("                           false", "off", "...", 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                           false" + "'", str4, "                           false");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("0", "                                                 100", "yes", (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                                                          /:;.,%#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                           false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (short) 1, (int) 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                1" + "'", str3, "                                                                                                1");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.lang.String[] strArray1 = new java.lang.String[] { "," };
        java.lang.String str2 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray1);
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray1);
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray1, "0");
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.join(strArray1, "                                                                                                1");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "," + "'", str7, ",");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("/:;.,%#", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/:;.,%#" + "'", str2, "/:;.,%#");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("off", "                                ", "/:;.,%#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off" + "'", str3, "off");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        java.lang.Boolean[] booleanArray0 = comp5111.assignment.cut.Subject.BooleanUtils.booleanValues();
        java.lang.Class<?> wildcardClass1 = booleanArray0.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("on", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "on" + "'", str2, "on");
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, (int) (byte) 10);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        heapSort0.sort(indexedSortable5, 120, 97);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable9 = null;
        comp5111.assignment.cut.Subject.Progressable progressable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable9, (int) (short) -1, (int) (short) 100, progressable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("                           false", "/:;.,%#", "                                                                                          /:;.,%#", "yes                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine(",                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "," + "'", str1, ",");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex(",                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("...", "                                                                                          no", "                                                                                                   0", (int) ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "..." + "'", str4, "...");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('a', 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a" + "'", str2, "a");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("yes                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes                                                                                                 " + "'", str1, "yes                                                                                                 ");
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                                                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                 ..." + "'", str1, "                                                                                                 ...");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("", "     fals", "0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String[] strArray0 = null;
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.join(strArray0, "                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString(' ', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("no                                                                                               ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no                                                                                                  " + "'", str2, "no                                                                                                  ");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 120, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (byte) 0, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) (short) 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) 'a');
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                " + "'", str1, "                                ");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("yes                                                                                                 ", "", "0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd(",                                                                                                   ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",                                                                                                   " + "'", str2, ",                                                                                                   ");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("                                ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                " + "'", str2, "                                ");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("true");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"true\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("                           false", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("                                                                                                 ...", "off");
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                 100", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 100" + "'", str3, "                                                 100");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                                                                                                1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                1" + "'", str1, "                                                                                                1");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(true, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("off", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notEmpty("", "UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: UTF-8 must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("                                                                                                 ...", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) '#', (int) '#', (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("      10.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"10.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        comp5111.assignment.cut.Subject.Check.notEmpty("                                                 100", "false");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce(",", "                                                 100", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "                                                                                                 ...");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("", ",", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (byte) -1, (int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("off", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "off" + "'", str2, "off");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!", "                                                                                                    ", "                           false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("                                                                                                 ...", "no");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) (byte) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, (int) (byte) 10);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        heapSort0.sort(indexedSortable5, 120, 97);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable9 = null;
        comp5111.assignment.cut.Subject.Progressable progressable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable9, (int) (short) 0, 100, progressable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("                           false", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           false                                                                    " + "'", str2, "                           false                                                                    ");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("                                                                                                 ...", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 ..." + "'", str2, "                                                                                                 ...");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                           false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                           false" + "'", str1, "                           false");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 120, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (short) 0, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("UTF-8", 'a', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                                                                 ...", "      10.0", "no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 ..." + "'", str3, "                                                                                                 ...");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("yes                                                                                                 ", "                                                                                                 ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("on", ' ');
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList3);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join("", strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "on" + "'", str5, "on");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 120, (java.lang.Integer) 1, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 35, (java.lang.Integer) 97, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("     false", "     false", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                                                          no", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("off", '#', false);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join("...", strList4);
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList4);
        java.util.List<java.lang.String> strList7 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList6);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "off" + "'", str5, "off");
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("                                                                                                 ...", "                                                                                                1");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                 ...", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("      10.0", "                                                                                                 ...", "no                                                                                                  ", 97);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      10.0" + "'", str4, "      10.0");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("      10.0", "      10.0");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitWS("no                                                                                               ", true);
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "");
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("no                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no                                                                                                  " + "'", str1, "no                                                                                                  ");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 97, (java.lang.Integer) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                ", "no                                                                                               ", "     false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("                                                                                                1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("      10.0", ' ', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        comp5111.assignment.cut.Subject.Check.notEmpty("/:;.,%#", "yes");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("     false", "                                                                                                 ...", "/:;.,%#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(35, (int) (byte) 10, (int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("                                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (byte) 10, (int) '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("                           false                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("false");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"false\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("true", (int) (byte) 0, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) (short) -1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("                           false", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("yes", "yes", "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("no                                                                                               ", 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no                                                                                               " + "'", str2, "no                                                                                               ");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes", '4', true);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.join("hi!", strList6);
        java.util.List<java.lang.String> strList8 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList6);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                 100", '4', strList6);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "yes" + "'", str7, "yes");
        org.junit.Assert.assertNotNull(strList8);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        int[] intArray8 = new int[] { 'a', (byte) 1 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator9 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort(100, (int) (short) 100, intArray8, intComparator9);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator11 = null;
        comp5111.assignment.cut.Subject.PrimUtils.sort((int) (short) 1, (int) (short) 0, intArray8, intComparator11);
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator13 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort(0, 32, intArray8, intComparator13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 16 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[97, 1]");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("on", "yes", "     false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "on" + "'", str3, "on");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("      10.0", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("1", "                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String[] strArray1 = new java.lang.String[] { "," };
        java.lang.String str2 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray1);
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray1);
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray1, "                                                                                          no");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "," + "'", str3, ",");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("                           false                                                                    ", "no                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("yes", "     false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin(",", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "," + "'", str2, ",");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(",", "on", "hi!", "     false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("no", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no" + "'", str2, "no");
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 35, (java.lang.Integer) 0, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 35);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("                                                                                                 ...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 120, (java.lang.Integer) 120, (java.lang.Integer) 32, (java.lang.Integer) 120);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 100, (int) (short) 1, 10, (int) (short) 100);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                           false                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false                                                                    " + "'", str1, "false                                                                    ");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("                                                                                          /:;.,%#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes", '4', true);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join("hi!", strList5);
        java.util.List<java.lang.String> strList7 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.join("false", strList5);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "yes" + "'", str6, "yes");
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "yes" + "'", str8, "yes");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        int[] intArray2 = new int[] {};
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort(32, (int) (short) 100, intArray2, intComparator3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray2), "[]");
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes                                                                                                 ", ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (byte) -1, (-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("hi!");
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) strList1, "                                                                                                    ");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "yes", "     false", "UTF-8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "yes" + "'", str4, "yes");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("no                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                           false", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                           false" + "'", str2, "                           false");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("      10.0", "                                                                                                 ...", ",");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      10.0" + "'", str3, "      10.0");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("no                                                                                                  ", 35, false, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                   " + "'", str4, "                                   ");
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 10, (int) (short) 100, 32);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("on", "UTF-8");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce(",                                                                                                   ", "                                   ", "                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",                                                                                                " + "'", str3, ",                                                                                                ");
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("      10.0", "     false", "                                   ", 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      10.0" + "'", str4, "      10.0");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("/:;.,%#", "");
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty("", "                           false                                                                    ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:                            false                                                                     must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray0, "                                                                                          /:;.,%#");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: candidates must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin(",                                                                                                   ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ",                                                                                                   " + "'", str2, ",                                                                                                   ");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("/:;.,%#", "true", "                                   ", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/:;.,%#" + "'", str4, "/:;.,%#");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!", ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("                                ", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          ..." + "'", str2, "          ...");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                           false", "a", "     false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("...", "      10.0", "no                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNull(obj0, ",");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: , must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("off");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                                                                   0", ",                                                                                                   ", "UTF-8", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                   0" + "'", str4, "                                                                                                   0");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("no", "...", ",                                                                                                ", ",                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("      10.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotTrue((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                 ...", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                   0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   0" + "'", str2, "                                                                                                   0");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("", "off", "false", 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("yes", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("on", ' ');
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList4);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("UTF-8", ' ', strList5);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                                                                1", "                           false                                                                    ", "                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                1" + "'", str3, "                                                                                                1");
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("      10.0");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("no                                                                                                  ", "                                   ");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("                                                                                          /:;.,%#", "/:;.,%#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("/:;.,%#", "yes                                                                                                 ", "...", (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/:;.,%#" + "'", str4, "/:;.,%#");
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (-1), (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(false, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (-1), (int) (short) -1, (int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("yes                                                                                                 ", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        int[] intArray7 = new int[] { 35, (byte) 0, (short) 100, 0, (byte) 0 };
        comp5111.assignment.cut.Subject.PrimUtils.IntComparator intComparator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.PrimUtils.sort((int) (short) 0, 97, intArray7, intComparator8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 12 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[35, 0, 100, 0, 0]");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("false");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty("", "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        char[] charArray6 = new char[] { '4', ' ', ' ', 'a' };
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!", charArray6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                          no", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4  a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4  a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4,  ,  , a]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "no" + "'", str8, "no");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("true", '4');
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("", '4', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("off");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.join("a", strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off" + "'", str3, "off");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                                                                1", 32, false, '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                               1" + "'", str4, "                               1");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("                                                 100");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(120, 32, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("      10.0", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("                                                                                                 ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("", 97, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 35, (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, 10, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("off", "false");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "alse" + "'", str3, "alse");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("a", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a                                                                                                " + "'", str2, "a                                                                                                ");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (byte) 1, (int) (short) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, 120, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, (int) (byte) 10);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        comp5111.assignment.cut.Subject.Progressable progressable8 = null;
        heapSort0.sort(indexedSortable5, (int) (short) 10, (int) (byte) -1, progressable8);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        heapSort0.sort(indexedSortable10, (-1), (int) (byte) 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable14 = null;
        comp5111.assignment.cut.Subject.Progressable progressable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable14, 0, 32, progressable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) 0L, "hi!");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        char[] charArray7 = new char[] { '4', 'a', ' ' };
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("off", charArray7);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("0", charArray7);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                                                                    ", charArray7);
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                           false                                                                    ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "4a ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, a,  ]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "off" + "'", str8, "off");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                           false" + "'", str11, "                           false");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("a                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"a\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("off", ' ');
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("     false", '#');
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("          ...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          ..." + "'", str2, "          ...");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "no                                                                                                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: no                                                                                                  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("     fals");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin(",                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + ",                                                                                                   " + "'", str1, ",                                                                                                   ");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("                                                 100", false);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                                                                   0", ",                                                                                                ", "", 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                   0" + "'", str4, "                                                                                                   0");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("                           false", "no                                                                                               ", "100", "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                                                                    ", ' ', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "a                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a                                                                                                ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes", '4', true);
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList3);
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "yes                                                                                                 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: yes                                                                                                 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "", "      10.0", "...");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      10.0" + "'", str4, "      10.0");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                                                                    ", "/:;.,%#", "no                                                                                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) ' ', 100, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 120, (java.lang.Integer) 35, (java.lang.Integer) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) (short) 0, 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 120 + "'", int3 == 120);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 120, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, 120, (int) 'a', progressable9);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 1, (java.lang.Integer) 10, (java.lang.Integer) 1, (java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                                                                   ", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("false", ' ');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("/:;.,%#");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("", 'a', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("no                                                                                                  ", "yes                                                                                                 ", "", ",");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!", "", "alse", 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("/:;.,%#", (int) (byte) 1, true, '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                                                                                          no");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                          no" + "'", str1, "                                                                                          no");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('a', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(0, (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("a");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a" + "'", str1, "a");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 120, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (byte) 0, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        heapSort0.sort(indexedSortable10, 10, (int) (byte) 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable14 = null;
        comp5111.assignment.cut.Subject.Progressable progressable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable14, (int) '#', 100, progressable17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) '4', (int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) ' ', (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) 'a', 100, 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("false                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (short) 10, (int) (short) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  10" + "'", str3, "                                                                                                  10");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                                                 100");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 100" + "'", str1, "                                                 100");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("     false");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("yes                                                                                                 ", '4', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) -1, 32, (-1), (int) '4');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                               1", "true", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(120, (int) (short) 1, (int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 32, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray0);
        boolean boolean3 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray0, "");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray0, "a");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: a must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("/:;.,%#", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/:;.,%#" + "'", str2, "/:;.,%#");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 0, 97, (int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("0", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 120, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (short) 0, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        heapSort0.sort(indexedSortable10, (int) 'a', 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable14 = null;
        heapSort0.sort(indexedSortable14, (int) '#', (int) (short) 10);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable18 = null;
        comp5111.assignment.cut.Subject.Progressable progressable21 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable18, 32, (int) (short) 100, progressable21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, 120, (int) (short) -1, progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (byte) 10, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        heapSort0.sort(indexedSortable10, (int) (short) -1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable14 = null;
        heapSort0.sort(indexedSortable14, (int) (short) 10, (int) (short) -1);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable18 = null;
        comp5111.assignment.cut.Subject.Progressable progressable21 = null;
        heapSort0.sort(indexedSortable18, (int) (byte) 0, 0, progressable21);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable23 = null;
        comp5111.assignment.cut.Subject.Progressable progressable26 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable23, 0, (int) (byte) 100, progressable26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) 100, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                ", "                                                                                                 ...", "                                   ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 97, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("hi!");
        comp5111.assignment.cut.Subject.StrUtils.splitSmart(",", 'a', strList4);
        java.lang.String str6 = comp5111.assignment.cut.Subject.StringUtils.join("/", strList4);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!/," + "'", str6, "hi!/,");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!/,", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!/," + "'", str2, "hi!/,");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("                               1", (int) (short) 1, true, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " " + "'", str4, " ");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) '#');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("yes                                                                                                 ", "     fals");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String str1 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray0);
        boolean boolean3 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray0, "");
        boolean boolean5 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray0, "no");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray0);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray0, "a                                                                                                ");
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("a", "                                ", "alse");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                               1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, 97, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('a', 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("no                                                                                                  ", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitWS("                                                                                                   0", false);
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join("yes", strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0" + "'", str4, "0");
    }
}

