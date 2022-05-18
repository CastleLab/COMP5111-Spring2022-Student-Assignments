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
            System.out.format("%n%s%n", "Regression_0_Test0.test0001");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(0, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0002");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('4', 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0003");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0004");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.negate((java.lang.Boolean) true);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0005");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("", "hi!", "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0006");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0007");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("hi!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0008");
        comp5111.assignment.cut.Subject.StringUtils stringUtils0 = new comp5111.assignment.cut.Subject.StringUtils();
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0009");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.ELLIPSIS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "..." + "'", str0, "...");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0010");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0011");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("", "hi!", "", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0012");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.OFF;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "off" + "'", str0, "off");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0013");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0014");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(false, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0015");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("off", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0016");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("off", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "off" + "'", str2, "off");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0017");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0018");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi!", "hi!", "", "...");
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0019");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0020");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0021");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0022");
        int int1 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0023");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) (-1L), "off");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0024");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("off", "off");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0025");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('4', (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0026");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0027");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0028");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0029");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0030");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.FALSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "false" + "'", str0, "false");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0031");
        comp5111.assignment.cut.Subject subject0 = new comp5111.assignment.cut.Subject();
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ...");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0033");
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", true);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("...", 'a', strList5);
        java.lang.String str7 = comp5111.assignment.cut.Subject.StringUtils.join("hi!,off", strList5);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "..." + "'", str7, "...");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0034");
        comp5111.assignment.cut.Subject.StrUtils strUtils0 = new comp5111.assignment.cut.Subject.StrUtils();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0035");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0036");
        comp5111.assignment.cut.Subject.Check.isTrue(true);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0037");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.ON;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "on" + "'", str0, "on");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0038");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0039");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty("", "...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ... must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0040");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!,off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!,off" + "'", str1, "hi!,off");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0041");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("hi!", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0042");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 0);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0043");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 0, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0044");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.TRUE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "true" + "'", str0, "true");
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0045");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.negate((java.lang.Boolean) false);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0046");
        int int0 = comp5111.assignment.cut.Subject.StringUtils.MAX_COMMENT_DISPLAY_LENGTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 120 + "'", int0 == 120);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0047");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0048");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0049");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.NO;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "no" + "'", str0, "no");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0050");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("no");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no" + "'", str1, "no");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0051");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("true", "hi!", "false", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0052");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0053");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0054");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi!,off", "true", "", "true");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0055");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("no", "################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0056");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("false", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false" + "'", str2, "false");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("no");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"no\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0058");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must pass a delimiter.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0060");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 1, (int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0061");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("true");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0062");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isTrue((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0063");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 120, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!off", (-1), true, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0065");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StrUtils.DELIM_CHARS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/:;.,%#" + "'", str0, "/:;.,%#");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0066");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0067");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 120, (java.lang.Integer) 10, (java.lang.Integer) 120, (java.lang.Integer) (-1));
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0068");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "off" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) str3, "hi!,off");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,off" + "'", str3, "hi!,off");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0069");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("on", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "on" + "'", str2, "on");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0070");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 0, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0071");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("/:;.,%#");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0072");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("hi!,off");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0073");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!", 0, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0074");
        int int0 = comp5111.assignment.cut.Subject.StringUtils.MNEMONIC_INDEX_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0075");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, (int) '4', (int) (short) 0, progressable9);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable11, 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0076");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!off", "hi!", "/:;.,%#");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0077");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(true, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0078");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0079");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 97 + "'", int3 == 97);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0080");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("off", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "off" + "'", str2, "off");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(100, (int) (short) 1, (int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0082");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0083");
        int int1 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0084");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("true", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true" + "'", str2, "true");
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0085");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("no", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no" + "'", str2, "no");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0086");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("...", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0087");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (byte) -1, 0);
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0088");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("...", "", "false", 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "..." + "'", str4, "...");
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0089");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0090");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "...", "", "off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0091");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("on", 1, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "o" + "'", str3, "o");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0092");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0093");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0094");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "on");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: on");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0095");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, 10, (int) (short) 10, 120);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0096");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(false, false);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0097");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.EMPTY;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "" + "'", str0, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0098");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("on", "hi!,off", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "no");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0099");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("", "...");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Must pass a delimiter.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0100");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("/:;.,%#", (int) (short) 0, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0101");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("no", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no" + "'", str2, "no");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0102");
        java.lang.String str0 = comp5111.assignment.cut.Subject.BooleanUtils.YES;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "yes" + "'", str0, "yes");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0103");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "on", "", "...");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0104");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("################################", "yes");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0105");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNullOrEmpty("", "hi!,off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!,off must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0106");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotFalse((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0107");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isFalse((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0108");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 100);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0109");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("hi!,off", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0110");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0111");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 100);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0112");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0113");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (byte) -1, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) (short) 10, (int) 'a', progressable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0114");
        java.lang.String str0 = comp5111.assignment.cut.Subject.StringUtils.UTF8_CHARSET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0115");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("o", (int) (short) -1, true, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0116");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("false", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0117");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("no", '#');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0118");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("off", (int) '4', false, ' ');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                 off" + "'", str4, "                                                 off");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0119");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("false", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false" + "'", str2, "false");
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0120");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("", ' ');
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) (-1), (java.lang.Integer) 0, (java.lang.Integer) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0122");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 1);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0123");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0124");
        java.lang.Boolean[] booleanArray0 = comp5111.assignment.cut.Subject.BooleanUtils.booleanValues();
        java.lang.Class<?> wildcardClass1 = booleanArray0.getClass();
        org.junit.Assert.assertNotNull(booleanArray0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0125");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("off", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0126");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, (int) (short) 10, (int) (byte) 100, progressable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0127");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0128");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("", "hi!off");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0129");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("no", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no" + "'", str2, "no");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0130");
        comp5111.assignment.cut.Subject.BooleanUtils booleanUtils0 = new comp5111.assignment.cut.Subject.BooleanUtils();
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0131");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("false");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"false\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0132");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, 10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0133");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        java.lang.Class<?> wildcardClass6 = heapSort0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0134");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, (int) '4', (int) (short) 0, progressable9);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable11, 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0135");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("yes");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "yes" + "'", str1, "yes");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0136");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0137");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("o", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0138");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0139");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) ' ');
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0140");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("UTF-8");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"UTF-8\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0141");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("...", 0, false, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0142");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("no", "true", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0143");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("o", (int) (short) 100, false, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                   o" + "'", str4, "                                                                                                   o");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0144");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################################" + "'", str2, "################################");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0145");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("on", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "on" + "'", str2, "on");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0146");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) (byte) -1, "                                                                                                   o");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0147");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0148");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("true", "false");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0149");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!", (int) (byte) 1, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h" + "'", str3, "h");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0150");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0151");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0152");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0153");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0154");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.isNotTrue((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0155");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("/:;.,%#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/:;.,%#" + "'", str1, "/:;.,%#");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0156");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, (int) (byte) -1, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0157");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("/:;.,%#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/:;.,%#" + "'", str1, "/:;.,%#");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0158");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("on");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "on" + "'", str1, "on");
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0159");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("/:;.,%#");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0160");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("on", (int) (short) 10, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "on        " + "'", str3, "on        ");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0161");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must not be false");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0162");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: candidates must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0163");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (byte) -1, 100, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  -1" + "'", str3, "                                                                                                  -1");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0164");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("on        ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "on        " + "'", str2, "on        ");
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0165");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 97, (java.lang.Integer) 1, (java.lang.Integer) 97, (java.lang.Integer) 97);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("/:;.,%#");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"/:;.,%#\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0167");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("on        ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0168");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(97);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0169");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, 1, 100, progressable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0170");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) (byte) -1, 1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1" + "'", str3, "1");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0171");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("off", "no", "on", "o");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0172");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0173");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("on        ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "on" + "'", str2, "on");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0174");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("hi!yesoff", "...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0175");
        comp5111.assignment.cut.Subject.Check.notEmpty("hi!,off", "                                                 off");
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0176");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("h");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0177");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0178");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("on        ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"on\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0179");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("                                                                                                  -1", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -,[,] or & are not allowed in-conjunction with other delimiters ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0180");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, 0, (int) ' ', progressable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0181");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0182");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("false");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "false" + "'", str1, "false");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0183");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("hi!off");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"hi!off\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0184");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("                                                                                                   o", "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0185");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("on", "o");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0186");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("hi!", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0187");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("on");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0188");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 0.0d, (int) '4', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 0.0" + "'", str3, "                                                 0.0");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0189");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 1, (int) (byte) 1, (int) (byte) 100, (int) '4');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0190");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("on        ", (int) ' ', true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "on                              " + "'", str3, "on                              ");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0191");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("off", 'a', true);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0192");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("o", 'a');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0193");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("false");
        java.lang.Class<?> wildcardClass2 = strList1.getClass();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0194");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 0, 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0195");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable5, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0196");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("true", "o");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0197");
        int int2 = comp5111.assignment.cut.Subject.BooleanUtils.compare(true, true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) -1, 97, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0199");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 1, (int) (short) 0, (int) ' ', (int) (short) 1);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0200");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("yes", "...", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yes" + "'", str3, "yes");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0201");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("1", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0202");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0203");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                                                 off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 off" + "'", str1, "                                                 off");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0204");
        comp5111.assignment.cut.Subject.UrlUtils urlUtils0 = new comp5111.assignment.cut.Subject.UrlUtils();
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0205");
        java.util.List<java.lang.String> strList1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.join("UTF-8", strList1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0206");
        java.util.List<java.lang.String> strList6 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", true);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("...", 'a', strList6);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.join("################################", strList6);
        java.util.List<java.lang.String> strList9 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList6);
        java.lang.String str10 = comp5111.assignment.cut.Subject.StringUtils.join("                                                 off", strList9);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "..." + "'", str8, "...");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "..." + "'", str10, "...");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0207");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0208");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444off");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0209");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("                                                                                                  -1");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0210");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, (int) '4', (int) (short) 0, progressable9);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable11 = null;
        comp5111.assignment.cut.Subject.Progressable progressable14 = null;
        heapSort0.sort(indexedSortable11, 100, 0, progressable14);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable16 = null;
        heapSort0.sort(indexedSortable16, 100, 100);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable20 = null;
        comp5111.assignment.cut.Subject.Progressable progressable23 = null;
        heapSort0.sort(indexedSortable20, (int) ' ', 1, progressable23);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable25, (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0211");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) (byte) 1, 100, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.isTrue(false, "on                              ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: on                              ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("UTF-8", "hi!yesoff");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: -,[,] or & are not allowed in-conjunction with other delimiters ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0214");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("hi!yesoff", "yes", "no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!nooff" + "'", str3, "hi!nooff");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0215");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 10.0f, (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                             10.0" + "'", str3, "                                                                                             10.0");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0216");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(0, 0, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0217");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("                                                                                                   o", "                                                 0.0");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0218");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(0, (int) (byte) -1, (int) (byte) 1, 0);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0219");
        comp5111.assignment.cut.Subject.Check.notEmpty("1", "hi!onoff");
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0220");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) false, true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0221");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!yesoff");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0222");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("/:;.,%#", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "/:;.,%#" + "'", str2, "/:;.,%#");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0223");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!onoff", (int) (short) 10, true, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!onoff  " + "'", str4, "hi!onoff  ");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0224");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("on                              ", "");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0225");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("false", "1");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0226");
        comp5111.assignment.cut.Subject.Check.notEmpty("hi!onoff", "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444off");
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0227");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("                                                                                             10.0", "hi!onoff");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0228");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0229");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) (-1L), "hi!onoff");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0230");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("", "hi!onoff", "################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0231");
        java.util.List<java.lang.String> strList5 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", true);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("...", 'a', strList5);
        java.util.List<java.lang.String> strList7 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList5);
        java.lang.String str8 = comp5111.assignment.cut.Subject.StringUtils.join("off", strList5);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "..." + "'", str8, "...");
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0232");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!off", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!off" + "'", str2, "hi!off");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0233");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("false", '4');
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0234");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("                                                                                                  -1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0235");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "hi!,off");
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0236");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 97);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0237");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0238");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("hi!onoff  ", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0239");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) '4', (-1), 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0240");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("on        ", 0, false, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0241");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("1", "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444off");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0242");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("1");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0243");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable1, (int) (short) 0, 120, progressable4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0244");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("off", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "off       " + "'", str2, "off       ");
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0245");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("off", "hi!,off");
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(120, (int) '4', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0247");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("1", '4', true);
        java.lang.Class<?> wildcardClass4 = strList3.getClass();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0248");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("hi!,off", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0249");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("10.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0" + "'", str1, "10.0");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0250");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                                                                   o");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                   o" + "'", str1, "                                                                                                   o");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0251");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("off");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"off\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0252");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("################################", "UTF-8");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################" + "'", str3, "################################");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0253");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0254");
        java.lang.String[] strArray22 = new java.lang.String[] { "on", "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444off", "                                                 off", "                                                 0.0", "yes", "no", "hi!", "hi!onoff  ", "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444off", "h", "hi!,off", "yes", "                                                                                             10.0", "on", "on        ", "################################", "                                                                                             10.0", "/:;.,%#", "no", "h" };
        java.util.ArrayList<java.lang.String> strList23 = new java.util.ArrayList<java.lang.String>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList23, strArray22);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!onoff  ", '4', (java.util.List<java.lang.String>) strList23);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0255");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("false");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.join("on        ", strList2);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "false" + "'", str3, "false");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0256");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", true);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                                                             10.0", ' ', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0257");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!                                                 0.0off", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0258");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0259");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("", '#');
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.join("", strList3);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0260");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        heapSort0.sort(indexedSortable6, (int) (byte) -1, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable10, (int) (short) 10, (int) ' ', progressable13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0261");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("off");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0262");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0263");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 10L, (int) (byte) 100, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  10" + "'", str3, "                                                                                                  10");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0264");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0265");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("no", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "no" + "'", str2, "no");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((int) '#', (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0267");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 100.0d, 97, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            100.0" + "'", str3, "                                                                                            100.0");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0268");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0269");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("no");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "no" + "'", str1, "no");
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0270");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("                                                 off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0271");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "on", "o", "                                                 off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on" + "'", str4, "on");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0272");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("                                                                                             10.0", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0273");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("", 'a');
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0274");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("                                                                                                   o", "hi!onoff");
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0275");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "no", "10.0", "/:;.,%#");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "no" + "'", str4, "no");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0276");
        boolean boolean2 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanDefaultIfNull((java.lang.Boolean) true, false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0277");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "hi!onoff  ");
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0278");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("", "no", "1", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0279");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("1");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "1" + "'", str1, "1");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0280");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                                                                  10", (int) (short) 1, false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0281");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("10.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "10.0" + "'", str1, "10.0");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0282");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("                                                                                            100.0");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0283");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("hi!", true);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0284");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("hi!                                                 0.0off", "1", "                                                                                            100.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                                 0.0off" + "'", str3, "hi!                                                 0.0off");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0285");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("                                                 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0286");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "off" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "yes");
        boolean boolean11 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "hi!yesoff");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,off" + "'", str3, "hi!,off");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!off" + "'", str5, "hi!off");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,off" + "'", str6, "hi!,off");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,off" + "'", str7, "hi!,off");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!yesoff" + "'", str9, "hi!yesoff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0287");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!off");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0288");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("hi!off", "h", "hi!onoff  ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0289");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                                                                  10", (int) '4', true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0290");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi!off");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0291");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("                                                                                            100.0");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0292");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi!                                                                                                   ooff");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 120, (java.lang.Integer) 100, (java.lang.Integer) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0294");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("true", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true                                                                                             " + "'", str2, "true                                                                                             ");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0295");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("o");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0296");
        comp5111.assignment.cut.Subject.Check.notEmpty("true                                                                                             ", "");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0297");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "off" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "false");
        java.lang.String str11 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "                                                 0.0");
        java.lang.String str13 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "10.0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,off" + "'", str3, "hi!,off");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!off" + "'", str5, "hi!off");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,off" + "'", str6, "hi!,off");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,off" + "'", str7, "hi!,off");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!                                                 0.0off" + "'", str11, "hi!                                                 0.0off");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!10.0off" + "'", str13, "hi!10.0off");
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0298");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                                                                  -1", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0299");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("hi!yesoff", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!yesoff" + "'", str2, "hi!yesoff");
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0300");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("hi!                                                 0.0off");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0301");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0302");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!nooff");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!nooff" + "'", str1, "hi!nooff");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0303");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("on");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "on" + "'", str1, "on");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0304");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 100, (java.lang.Integer) 100, (java.lang.Integer) 120, (java.lang.Integer) 97);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0305");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(97);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0306");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!                                                                                                   ooff", (int) '#', true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!                                " + "'", str3, "hi!                                ");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0307");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "off" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str9 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "yes");
        boolean boolean11 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444off");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,off" + "'", str3, "hi!,off");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!off" + "'", str5, "hi!off");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,off" + "'", str6, "hi!,off");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,off" + "'", str7, "hi!,off");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!yesoff" + "'", str9, "hi!yesoff");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0308");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("true                                                                                             ", "true                                                                                             ");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0309");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("", "1", "no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0310");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('#', 97);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################" + "'", str2, "#################################################################################################");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0311");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("#################################################################################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0312");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off", "", "false");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off" + "'", str3, "                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off");
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0313");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("hi!,off", "hi!onoff");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0314");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, (int) '4', (int) (short) 0, progressable9);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable11 = null;
        comp5111.assignment.cut.Subject.Progressable progressable14 = null;
        heapSort0.sort(indexedSortable11, 100, 0, progressable14);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable16 = null;
        heapSort0.sort(indexedSortable16, 100, 100);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable20 = null;
        comp5111.assignment.cut.Subject.Progressable progressable23 = null;
        heapSort0.sort(indexedSortable20, (int) ' ', 1, progressable23);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable25 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable25, (int) (short) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0315");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("hi!onoff  ", "off       ", "/:;.,%#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!onoff  " + "'", str3, "hi!onoff  ");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0316");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("UTF-8");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0317");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("                                                 off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                 off" + "'", str1, "                                                 off");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0318");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 0, (int) 'a', (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0319");
        comp5111.assignment.cut.Subject.Check.notEmpty("################################", "");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0320");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("true                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "true                                                                                             " + "'", str1, "true                                                                                             ");
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0321");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("true                                                                                             ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "true                                                                                             " + "'", str2, "true                                                                                             ");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0322");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                 off", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                 off" + "'", str3, "                                                 off");
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0323");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                 off", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                 off                                                " + "'", str2, "                                                 off                                                ");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0324");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("h", "yes");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0325");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 10, (int) (short) 10, (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0326");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("                                                                                                  -1", "0", "hi!yesoff", "                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0327");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi!onoff  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0328");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0329");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("0", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "0" + "'", str2, "0");
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0330");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi!                                                 0.0off");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0331");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0332");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "hi!", "                                                 off                                                ", "hi!10.0off");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                 off                                                " + "'", str4, "                                                 off                                                ");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0333");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("false", 32, true, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "false                           " + "'", str4, "false                           ");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0334");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitWS("################################", false);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                                                                   o", ' ', strList4);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0335");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("                                                                                                   o", "", "hi!onoff  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                   o" + "'", str3, "                                                                                                   o");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0336");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 100, 32, (int) ' ', 100);
        org.junit.Assert.assertNull(boolean4);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0337");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 10, (java.lang.Integer) 100, (java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0338");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("hi!nooff");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0339");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable6, 97, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0340");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!                                                 0.0off", 'a', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0341");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!onoff  ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!onoff  " + "'", str2, "hi!onoff  ");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0342");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444off", "                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off", "hi!                                ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off" + "'", str4, "                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0343");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("o");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "o" + "'", str1, "o");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0344");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("                                                                                                  10", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0345");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0346");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("no");
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + false + "'", boolean1, false);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0347");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("                                                 0.0", 'a', false);
        org.junit.Assert.assertNotNull(strList3);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0349");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 0, (java.lang.Integer) 1, (java.lang.Integer) 100, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0350");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("hi!onoff  ", '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0351");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("                                                 0.0", "");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0352");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("################################", (int) '#', false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   ################################" + "'", str3, "   ################################");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0353");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                                                             10.0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             10.0" + "'", str2, "                                                                                             10.0");
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0354");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("false                           ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0355");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("false", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false" + "'", str2, "false");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0356");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", false);
        java.lang.Class<?> wildcardClass3 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0357");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("                                                                                                  -1", "#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0358");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#################################################################################################" + "'", str1, "#################################################################################################");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0359");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("hi!off", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0360");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!,off", (int) (short) 10, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,off   " + "'", str3, "hi!,off   ");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0361");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("h", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h                                                                                                " + "'", str2, "h                                                                                                ");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0362");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(32);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0363");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                 0.0", "hi!                                                                                                   ooff", "#################################################################################################", 120);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                 0.0" + "'", str4, "                                                 0.0");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0364");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("                                                                                                   o", "hi!                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0365");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0366");
        comp5111.assignment.cut.Subject.Check.notEmpty("h                                                                                                ", "hi!,off");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0367");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        comp5111.assignment.cut.Subject.Progressable progressable8 = null;
        heapSort0.sort(indexedSortable5, (int) (short) 1, (-1), progressable8);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable10 = null;
        comp5111.assignment.cut.Subject.Progressable progressable13 = null;
        heapSort0.sort(indexedSortable10, 120, (-1), progressable13);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable15 = null;
        comp5111.assignment.cut.Subject.Progressable progressable18 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable15, 0, (int) (short) 100, progressable18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0368");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, 100, (int) 'a', (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 97 + "'", int4 == 97);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0369");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("h                                                                                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"h\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0370");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, (int) '4', (int) (short) 0, progressable9);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable11 = null;
        comp5111.assignment.cut.Subject.Progressable progressable14 = null;
        heapSort0.sort(indexedSortable11, 100, 0, progressable14);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable16 = null;
        comp5111.assignment.cut.Subject.Progressable progressable19 = null;
        heapSort0.sort(indexedSortable16, (int) (byte) -1, (int) (byte) -1, progressable19);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable21 = null;
        heapSort0.sort(indexedSortable21, (int) '#', (int) ' ');
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable25 = null;
        heapSort0.sort(indexedSortable25, (int) (byte) 10, (int) (short) 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable29 = null;
        comp5111.assignment.cut.Subject.Progressable progressable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable29, 97, (int) (short) 100, progressable32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0371");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                                                                  -1", "0", "hi!,off   ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                  -1" + "'", str4, "                                                                                                  -1");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0372");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0373");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 100.0d, (int) '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                              100.0" + "'", str3, "                              100.0");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0374");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                 off                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off                                                " + "'", str1, "off                                                ");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0375");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("hi!                                ");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0376");
        comp5111.assignment.cut.Subject.Check.notEmpty("off       ", "hi!onoff");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0377");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 120, (java.lang.Integer) 120, (java.lang.Integer) 1, (java.lang.Integer) 1);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0378");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444off");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0379");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("false                           ", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0380");
        java.util.List<java.lang.String> strList1 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("                                                 0.0");
        org.junit.Assert.assertNotNull(strList1);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0381");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "off" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "off");
        boolean boolean10 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "################################");
        java.lang.String str13 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,off" + "'", str3, "hi!,off");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!off" + "'", str5, "hi!off");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,off" + "'", str6, "hi!,off");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!,off" + "'", str13, "hi!,off");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0382");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("true");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0383");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                                                             10.0", 0, true, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0384");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("1", "                                                                                                  10", "                                                                                            100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0385");
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.splitFileNames("hi!off");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList3);
        comp5111.assignment.cut.Subject.StrUtils.splitSmart("   ################################", 'a', strList4);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0386");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                 0.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0387");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("10.0", '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0388");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString('4', (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0389");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 120, (java.lang.Integer) 97, (java.lang.Integer) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0390");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("UTF-8", "                                                                                                  10");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(0, 97, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0392");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("on        ", "true                                                                                             ", "hi!                                                                                                   ooff", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "on        " + "'", str4, "on        ");
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0393");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.escapeXml("hi!onoff  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!onoff  " + "'", str1, "hi!onoff  ");
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0394");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("on                              ", "                                                 off                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0395");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, 32, (int) (short) 100, 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0396");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("hi!off", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!off" + "'", str2, "hi!off");
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0397");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(true, 0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0398");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 0, (java.lang.Integer) 10, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0399");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "off" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        boolean boolean8 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "off");
        boolean boolean10 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray2, "");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "", "                                                                                             10.0");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,off" + "'", str3, "hi!,off");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!off" + "'", str5, "hi!off");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,off" + "'", str6, "hi!,off");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0400");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("/:;.,%#", "yes");
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0401");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "44444444444444444444444444444444", "10.0", "hi!,off   ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444" + "'", str4, "44444444444444444444444444444444");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0402");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0403");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.formatCommentForOneLine("off                                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off" + "'", str1, "off");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0404");
        comp5111.assignment.cut.Subject.Check.isTrue(true, "                                                 0.0");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0405");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("   ################################");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"################################\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0406");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("10.0", "off       ", "                                                 off                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "10.0" + "'", str3, "10.0");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0407");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!                                ", "h", "                                                                                             10.0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                             10.0i!                                " + "'", str3, "                                                                                             10.0i!                                ");
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0408");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("false                           ", (int) (short) 10, false, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0409");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject(120, 1, (int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0410");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("1", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1" + "'", str2, "1");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0411");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("yes", "                                                    ", "          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "yes" + "'", str3, "yes");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0412");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("yes");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0413");
        int int1 = comp5111.assignment.cut.Subject.StringUtils.getMnemonicIndex("hi!yesoff");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + (-1) + "'", int1 == (-1));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("", '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0415");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                                                             10.0", (int) 'a', true, '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                             10.0" + "'", str4, "                                                                                             10.0");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0416");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("                                                                                             10.0", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             10.0" + "'", str2, "                                                                                             10.0");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0417");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("hi!onoff");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0418");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("h                                                                                                ", "                                                                                             10.0i!                                ", "o,n, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h                                                                                                " + "'", str4, "h                                                                                                ");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0419");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("hi!nooff", "                                                                                                   o", "true                                                                                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!nooff" + "'", str3, "hi!nooff");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0420");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 10.0f, (int) (byte) -1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0421");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.startsWithIgnoreCase("o,n, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ", "                                                                                                   o");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0422");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("o,n, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0423");
        char[] charArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                 0.0", charArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0424");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("hi!,off");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!,off" + "'", str1, "hi!,off");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0425");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("          ", "hi!onoff  ", "                                                 off                                                ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          " + "'", str4, "          ");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0426");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("h", true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0427");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("hi!                                                                                                   ooff", "", "hi!,off   ", 32);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!                                                                                                   ooff" + "'", str4, "hi!                                                                                                   ooff");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0428");
        boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                                                             10.0");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0429");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 120, (java.lang.Integer) 1, (java.lang.Integer) 120);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0430");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("false                           ", "hi!                                                 0.0off", "hi!off");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0431");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, (int) '4', (int) (short) 0, progressable9);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable11, (int) ' ', 120);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0432");
        comp5111.assignment.cut.Subject.Check.notEmpty("                                                 0.0", "hi!nooff");
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0433");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("off                                                ", "false", "1");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off                                                " + "'", str3, "off                                                ");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0434");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "off" };
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join(strArray2, "");
        java.lang.String str6 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        java.lang.String str7 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty((java.lang.Object[]) strArray2, "false");
        java.lang.String str10 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) str10, "44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,off" + "'", str3, "hi!,off");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!off" + "'", str5, "hi!off");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,off" + "'", str6, "hi!,off");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,off" + "'", str7, "hi!,off");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!,off" + "'", str10, "hi!,off");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0435");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        comp5111.assignment.cut.Subject.Progressable progressable8 = null;
        heapSort0.sort(indexedSortable5, (int) (short) 1, (-1), progressable8);
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) heapSort0, "0");
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable12 = null;
        comp5111.assignment.cut.Subject.Progressable progressable15 = null;
        heapSort0.sort(indexedSortable12, (int) (byte) 100, 32, progressable15);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable17 = null;
        heapSort0.sort(indexedSortable17, (int) (short) 1, (int) (byte) -1);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable21 = null;
        comp5111.assignment.cut.Subject.Progressable progressable24 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable21, (int) (short) -1, (int) '#', progressable24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0436");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("hi!off", '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0437");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) true, (int) (short) 100, 32, 120);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0438");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (byte) 10, (int) (short) 100, (int) 'a', 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match any specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0439");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString(' ', (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0440");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("#################################################################################################", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#################################################################################################" + "'", str2, "#################################################################################################");
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0441");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("          ", "                                                 off                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0442");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((java.lang.Integer) 32);
        org.junit.Assert.assertEquals("'" + boolean1 + "' != '" + true + "'", boolean1, true);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 0, (java.lang.Integer) 120);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0444");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("1", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0445");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("off                                                ", false);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0446");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            comp5111.assignment.cut.Subject.Check.notNull(obj0, "...");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: ... must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0447");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("true", "o,n, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ", "on                              ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "true" + "'", str4, "true");
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0448");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.newString(' ', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0449");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("hi!nooff", "                                                                                                  10");
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) "                                                                                                  10", "hi!onoff  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0450");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replaceOnce("off       ", "                                                    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "off       " + "'", str3, "off       ");
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("o", "                                                                                            100.0", "false");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0452");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 100.0f, 32, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                           100.0" + "'", str3, "                           100.0");
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0453");
        comp5111.assignment.cut.Subject.Check.notNullOrEmpty("          ", "on");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0454");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("                                                                                                  10", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0455");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.splitWS("", true);
        java.util.List<java.lang.String> strList3 = comp5111.assignment.cut.Subject.StrUtils.toLower(strList2);
        java.lang.Class<?> wildcardClass4 = strList2.getClass();
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0456");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("on        ", "                                                                                             10.0i!                                ", "0");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "on        " + "'", str3, "on        ");
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0457");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.truncateString("                                                                                             10.0", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             10.0" + "'", str2, "                                                                                             10.0");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0458");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    " + "'", str1, "                                                    ");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0459");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("hi!,off   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0460");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("false", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "false" + "'", str2, "false");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0461");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) false, "44444444444444444444444444444444", "                                                                                                   o", "#################################################################################################");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                   o" + "'", str4, "                                                                                                   o");
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0462");
        boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 97, (java.lang.Integer) 97, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0463");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("                                                                                                   o", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   o" + "'", str2, "                                                                                                   o");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0464");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.splitRemoveEmpties("10.0", "10.0");
        java.lang.String str3 = comp5111.assignment.cut.Subject.UrlUtils.arrayToString(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0465");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!", 10, true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!       " + "'", str3, "hi!       ");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0466");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("hi!onoff  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!onoff  " + "'", str1, "hi!onoff  ");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0467");
        java.util.List<java.lang.String> strList4 = comp5111.assignment.cut.Subject.StrUtils.splitSmart("", 'a', false);
        java.lang.String str5 = comp5111.assignment.cut.Subject.StringUtils.join("hi!10.0off", strList4);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0468");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, (int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0469");
        java.util.List<java.lang.String> strList2 = comp5111.assignment.cut.Subject.StrUtils.split("                                                                                             10.0", '4');
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 32, (java.lang.Integer) 10, (java.lang.Integer) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0471");
        int int3 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger(false, 120, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0472");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.trimEnd("/:;.,%#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "/:;.,%#" + "'", str1, "/:;.,%#");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0473");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.pad("hi!,off   ", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!,off   " + "'", str2, "hi!,off   ");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0474");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (int) (short) 0, (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0475");
        java.lang.String str4 = comp5111.assignment.cut.Subject.BooleanUtils.toString((java.lang.Boolean) true, "hi!onoff  ", "off       ", "                                                    ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!onoff  " + "'", str4, "hi!onoff  ");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0476");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.replace("                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off", "no", "hi!10.0off");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off" + "'", str3, "                                                                                            100.0,false,hi!off,/:;.,%#,                                                 0.0,off");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0477");
        java.lang.String str2 = comp5111.assignment.cut.Subject.StringUtils.trimBegin("off       ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "off       " + "'", str2, "off       ");
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0478");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        comp5111.assignment.cut.Subject.Progressable progressable4 = null;
        heapSort0.sort(indexedSortable1, (int) '#', (-1), progressable4);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable6 = null;
        comp5111.assignment.cut.Subject.Progressable progressable9 = null;
        heapSort0.sort(indexedSortable6, (int) '4', (int) (short) 0, progressable9);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable11 = null;
        comp5111.assignment.cut.Subject.Progressable progressable14 = null;
        heapSort0.sort(indexedSortable11, 100, 0, progressable14);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable16 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable16, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0479");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsStringInsensitive(strArray0, "                              100.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: candidates must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0480");
        java.lang.Boolean boolean4 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject((int) (short) 0, 32, 0, (int) '#');
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean("                                                                                             10.0i!                                ", "", "hi!                                ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The String did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0482");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.pad("", 0, true, 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0483");
        java.lang.String str4 = comp5111.assignment.cut.Subject.StringUtils.replace("", "true", "hi!10.0off", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0484");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), 1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0485");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean(1, 97, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0486");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("hi!       ", "off");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0487");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = comp5111.assignment.cut.Subject.BooleanUtils.toBoolean((java.lang.Integer) 100, (java.lang.Integer) 120, (java.lang.Integer) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Integer did not match either specified value");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0488");
        int int4 = comp5111.assignment.cut.Subject.BooleanUtils.toInteger((java.lang.Boolean) false, (-1), (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0489");
        comp5111.assignment.cut.Subject.HeapSort heapSort0 = new comp5111.assignment.cut.Subject.HeapSort();
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable1 = null;
        heapSort0.sort(indexedSortable1, (int) (short) 100, 0);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable5 = null;
        comp5111.assignment.cut.Subject.Progressable progressable8 = null;
        heapSort0.sort(indexedSortable5, (int) (short) 1, (-1), progressable8);
        comp5111.assignment.cut.Subject.Check.notNull((java.lang.Object) heapSort0, "0");
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable12 = null;
        comp5111.assignment.cut.Subject.Progressable progressable15 = null;
        heapSort0.sort(indexedSortable12, (int) (byte) 100, 32, progressable15);
        comp5111.assignment.cut.Subject.IndexedSortable indexedSortable17 = null;
        // The following exception was thrown during execution in test generation
        try {
            heapSort0.sort(indexedSortable17, (int) (short) 1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0490");
        boolean boolean2 = comp5111.assignment.cut.Subject.StrUtils.parseBool("                                                 off                                                ", false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0491");
        // The following exception was thrown during execution in test generation
        try {
            int int1 = comp5111.assignment.cut.Subject.StringUtils.toInt("                                                 0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"0.0\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0492");
        boolean boolean1 = comp5111.assignment.cut.Subject.StringUtils.isNullOrEmpty("44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0493");
        java.lang.Boolean boolean1 = comp5111.assignment.cut.Subject.BooleanUtils.toBooleanObject("44444444444444444444444444444444");
        org.junit.Assert.assertNull(boolean1);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0494");
        boolean boolean2 = comp5111.assignment.cut.Subject.StringUtils.containsIgnoreCase("o,n, , , , , , , , , , , , , , , , , , , , , , , , , , , , , , ", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0495");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0496");
        java.lang.String[] strArray2 = comp5111.assignment.cut.Subject.StringUtils.split("/:;.,%#", "h                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0497");
        java.lang.String str3 = comp5111.assignment.cut.Subject.StringUtils.pad((java.lang.Number) 100.0f, (int) (byte) 1, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "0" + "'", str3, "0");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0498");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("                                                                                             10.0i!                                ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                             10.0i!                                " + "'", str1, "                                                                                             10.0i!                                ");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0499");
        boolean boolean1 = comp5111.assignment.cut.Subject.StrUtils.parseBoolean("          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Regression_0_Test0.test0500");
        java.lang.String str1 = comp5111.assignment.cut.Subject.StringUtils.stripMnemonic("off       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "off       " + "'", str1, "off       ");
    }
}

