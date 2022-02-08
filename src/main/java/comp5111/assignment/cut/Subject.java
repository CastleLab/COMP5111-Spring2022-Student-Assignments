package comp5111.assignment.cut;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Locale;

public class Subject {

    public static class UrlUtils {
        /**
         * 
         * @param values
         *                  The array to be converted
         * @return string
         
         * <pre>
         * UrlUtils.arrayToString(new String[] {"a", "b", "c"})        = "a,b,c"
         * </pre>
         */

        public static String arrayToString(String[] values) {
            StringBuilder paramsString = new StringBuilder();
            for (int i = 0; i < values.length; i++) {
                if (i == 0) {
                    paramsString.append(values[i]);
                } else {
                    paramsString.append(",");
                    paramsString.append(values[i]);
                }
            }
            return paramsString.toString();
        }

    }

    public static class BooleanUtils {
        /**
         * The false String {@code "false"}.
         */
        public static final String FALSE = "false";

        /**
         * The no String {@code "no"}.
         */
        public static final String NO = "no";

        /**
         * The off String {@code "off"}.
         */
        public static final String OFF = "off";

        /**
         * The on String {@code "on"}.
         */
        public static final String ON = "on";

        /**
         * The true String {@code "true"}.
         */
        public static final String TRUE = "true";

        /**
         * The yes String {@code "yes"}.
         */
        public static final String YES = "yes";

        /**
         * Returns a new array of possible values (like an enum would).
         * 
         * @return a new array of possible values (like an enum would).
         */
        public static Boolean[] booleanValues() {
            return new Boolean[] { Boolean.FALSE, Boolean.TRUE };
        }

        /**
         * <p>
         * Compares two {@code boolean} values. This is the same functionality as
         * provided in Java 7.
         * </p>
         *
         * @param x the first {@code boolean} to compare
         * @param y the second {@code boolean} to compare
         * @return the value {@code 0} if {@code x == y};
         *         a value less than {@code 0} if {@code !x && y}; and
         *         a value greater than {@code 0} if {@code x && !y}
         */
        public static int compare(final boolean x, final boolean y) {
            if (x == y) {
                return 0;
            }
            return x ? 1 : -1;
        }

        /**
         * <p>
         * Checks if a {@code Boolean} value is {@code false},
         * handling {@code null} by returning {@code false}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.isFalse(Boolean.TRUE)  = false
         *   BooleanUtils.isFalse(Boolean.FALSE) = true
         *   BooleanUtils.isFalse(null)          = false
         * </pre>
         *
         * @param bool the boolean to check, null returns {@code false}
         * @return {@code true} only if the input is non-{@code null} and {@code false}
         */
        public static boolean isFalse(final Boolean bool) {
            return Boolean.FALSE.equals(bool);
        }

        /**
         * <p>
         * Checks if a {@code Boolean} value is <i>not</i> {@code false},
         * handling {@code null} by returning {@code true}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.isNotFalse(Boolean.TRUE)  = true
         *   BooleanUtils.isNotFalse(Boolean.FALSE) = false
         *   BooleanUtils.isNotFalse(null)          = true
         * </pre>
         *
         * @param bool the boolean to check, null returns {@code true}
         * @return {@code true} if the input is {@code null} or {@code true}
         */
        public static boolean isNotFalse(final Boolean bool) {
            return !isFalse(bool);
        }

        /**
         * <p>
         * Checks if a {@code Boolean} value is <i>not</i> {@code true},
         * handling {@code null} by returning {@code true}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.isNotTrue(Boolean.TRUE)  = false
         *   BooleanUtils.isNotTrue(Boolean.FALSE) = true
         *   BooleanUtils.isNotTrue(null)          = true
         * </pre>
         *
         * @param bool the boolean to check, null returns {@code true}
         * @return {@code true} if the input is null or false
         */
        public static boolean isNotTrue(final Boolean bool) {
            return !isTrue(bool);
        }

        /**
         * <p>
         * Checks if a {@code Boolean} value is {@code true},
         * handling {@code null} by returning {@code false}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.isTrue(Boolean.TRUE)  = true
         *   BooleanUtils.isTrue(Boolean.FALSE) = false
         *   BooleanUtils.isTrue(null)          = false
         * </pre>
         *
         * @param bool the boolean to check, {@code null} returns {@code false}
         * @return {@code true} only if the input is non-null and true
         */
        public static boolean isTrue(final Boolean bool) {
            return Boolean.TRUE.equals(bool);
        }

        /**
         * <p>
         * Negates the specified boolean.
         * </p>
         *
         * <p>
         * If {@code null} is passed in, {@code null} will be returned.
         * </p>
         *
         * <p>
         * NOTE: This returns {@code null} and will throw a {@code NullPointerException}
         * if unboxed to a boolean.
         * </p>
         *
         * <pre>
         * BooleanUtils.negate(Boolean.TRUE) = Boolean.FALSE;
         * BooleanUtils.negate(Boolean.FALSE) = Boolean.TRUE;
         * BooleanUtils.negate(null) = null;
         * </pre>
         *
         * @param bool the Boolean to negate, may be null
         * @return the negated Boolean, or {@code null} if {@code null} input
         */
        public static Boolean negate(final Boolean bool) {
            if (bool == null) {
                return null;
            }
            return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
        }

        /**
         * Returns a new array of possible values (like an enum would).
         * 
         * @return a new array of possible values (like an enum would).
         * @since 3.12.0
         */
        public static boolean[] primitiveValues() {
            return new boolean[] { false, true };
        }

        /**
         * <p>
         * Converts a Boolean to a boolean handling {@code null}
         * by returning {@code false}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBoolean(Boolean.TRUE)  = true
         *   BooleanUtils.toBoolean(Boolean.FALSE) = false
         *   BooleanUtils.toBoolean(null)          = false
         * </pre>
         *
         * @param bool the boolean to convert
         * @return {@code true} or {@code false}, {@code null} returns {@code false}
         */
        public static boolean toBoolean(final Boolean bool) {
            return bool != null && bool.booleanValue();
        }

        /**
         * <p>
         * Converts an int to a boolean using the convention that {@code zero}
         * is {@code false}, everything else is {@code true}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBoolean(0) = false
         *   BooleanUtils.toBoolean(1) = true
         *   BooleanUtils.toBoolean(2) = true
         * </pre>
         *
         * @param value the int to convert
         * @return {@code true} if non-zero, {@code false}
         *         if zero
         */
        public static boolean toBoolean(final int value) {
            return value != 0;
        }

        /**
         * <p>
         * Converts an int to a boolean specifying the conversion values.
         * </p>
         *
         * <p>
         * If the {@code trueValue} and {@code falseValue} are the same number then
         * the return value will be {@code true} in case {@code value} matches it.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBoolean(0, 1, 0) = false
         *   BooleanUtils.toBoolean(1, 1, 0) = true
         *   BooleanUtils.toBoolean(1, 1, 1) = true
         *   BooleanUtils.toBoolean(2, 1, 2) = false
         *   BooleanUtils.toBoolean(2, 2, 0) = true
         * </pre>
         *
         * @param value      the {@code Integer} to convert
         * @param trueValue  the value to match for {@code true}
         * @param falseValue the value to match for {@code false}
         * @return {@code true} or {@code false}
         * @throws IllegalArgumentException if {@code value} does not match neither
         *                                  {@code trueValue} no {@code falseValue}
         */
        public static boolean toBoolean(final int value, final int trueValue, final int falseValue) {
            if (value == trueValue) {
                return true;
            }
            if (value == falseValue) {
                return false;
            }
            throw new IllegalArgumentException("The Integer did not match either specified value");
        }

        /**
         * <p>
         * Converts an Integer to a boolean specifying the conversion values.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBoolean(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0)) = false
         *   BooleanUtils.toBoolean(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0)) = true
         *   BooleanUtils.toBoolean(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2)) = false
         *   BooleanUtils.toBoolean(Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(0)) = true
         *   BooleanUtils.toBoolean(null, null, Integer.valueOf(0))                     = true
         * </pre>
         *
         * @param value      the Integer to convert
         * @param trueValue  the value to match for {@code true}, may be {@code null}
         * @param falseValue the value to match for {@code false}, may be {@code null}
         * @return {@code true} or {@code false}
         * @throws IllegalArgumentException if no match
         */
        public static boolean toBoolean(final Integer value, final Integer trueValue, final Integer falseValue) {
            if (value == null) {
                if (trueValue == null) {
                    return true;
                }
                if (falseValue == null) {
                    return false;
                }
            } else if (value.equals(trueValue)) {
                return true;
            } else if (value.equals(falseValue)) {
                return false;
            }
            throw new IllegalArgumentException("The Integer did not match either specified value");
        }

        /**
         * <p>
         * Converts a String to a boolean (optimised for performance).
         * </p>
         *
         * <p>
         * {@code 'true'}, {@code 'on'}, {@code 'y'}, {@code 't'} or {@code 'yes'}
         * (case insensitive) will return {@code true}. Otherwise,
         * {@code false} is returned.
         * </p>
         *
         * <p>
         * This method performs 4 times faster (JDK1.4) than
         * {@code Boolean.valueOf(String)}. However, this method accepts
         * 'on' and 'yes', 't', 'y' as true values.
         *
         * <pre>
         *   BooleanUtils.toBoolean(null)    = false
         *   BooleanUtils.toBoolean("true")  = true
         *   BooleanUtils.toBoolean("TRUE")  = true
         *   BooleanUtils.toBoolean("tRUe")  = true
         *   BooleanUtils.toBoolean("on")    = true
         *   BooleanUtils.toBoolean("yes")   = true
         *   BooleanUtils.toBoolean("false") = false
         *   BooleanUtils.toBoolean("x gti") = false
         *   BooleanUtils.toBoolean("y") = true
         *   BooleanUtils.toBoolean("n") = false
         *   BooleanUtils.toBoolean("t") = true
         *   BooleanUtils.toBoolean("f") = false
         * </pre>
         *
         * @param str the String to check
         * @return the boolean value of the string, {@code false} if no match or the
         *         String is null
         */
        public static boolean toBoolean(final String str) {
            return toBooleanObject(str) == Boolean.TRUE;
        }

        /**
         * <p>
         * Converts a String to a Boolean throwing an exception if no match found.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBoolean("true", "true", "false")  = true
         *   BooleanUtils.toBoolean("false", "true", "false") = false
         * </pre>
         *
         * @param str         the String to check
         * @param trueString  the String to match for {@code true} (case sensitive), may
         *                    be {@code null}
         * @param falseString the String to match for {@code false} (case sensitive),
         *                    may be {@code null}
         * @return the boolean value of the string
         * @throws IllegalArgumentException if the String doesn't match
         */
        public static boolean toBoolean(final String str, final String trueString, final String falseString) {
            if (str == trueString) {
                return true;
            }
            if (str == falseString) {
                return false;
            }
            if (str != null) {
                if (str.equals(trueString)) {
                    return true;
                }
                if (str.equals(falseString)) {
                    return false;
                }
            }
            throw new IllegalArgumentException("The String did not match either specified value");
        }

        /**
         * <p>
         * Converts a Boolean to a boolean handling {@code null}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false)  = true
         *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, true)   = true
         *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true)  = false
         *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, false) = false
         *   BooleanUtils.toBooleanDefaultIfNull(null, true)           = true
         *   BooleanUtils.toBooleanDefaultIfNull(null, false)          = false
         * </pre>
         *
         * @param bool        the boolean object to convert to primitive
         * @param valueIfNull the boolean value to return if the parameter {@code bool}
         *                    is {@code null}
         * @return {@code true} or {@code false}
         */
        public static boolean toBooleanDefaultIfNull(final Boolean bool, final boolean valueIfNull) {
            if (bool == null) {
                return valueIfNull;
            }
            return bool.booleanValue();
        }

        /**
         * <p>
         * Converts an int to a Boolean using the convention that {@code zero}
         * is {@code false}, everything else is {@code true}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBoolean(0) = Boolean.FALSE
         *   BooleanUtils.toBoolean(1) = Boolean.TRUE
         *   BooleanUtils.toBoolean(2) = Boolean.TRUE
         * </pre>
         *
         * @param value the int to convert
         * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,
         *         {@code null} if {@code null}
         */
        public static Boolean toBooleanObject(final int value) {
            return value == 0 ? Boolean.FALSE : Boolean.TRUE;
        }

        /**
         * <p>
         * Converts an int to a Boolean specifying the conversion values.
         * </p>
         *
         * <p>
         * NOTE: This method may return {@code null} and may throw a
         * {@code NullPointerException}
         * if unboxed to a {@code boolean}.
         * </p>
         *
         * <p>
         * The checks are done first for the {@code trueValue}, then for the
         * {@code falseValue} and
         * finally for the {@code nullValue}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBooleanObject(0, 0, 2, 3) = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(0, 0, 0, 3) = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(0, 0, 0, 0) = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(2, 1, 2, 3) = Boolean.FALSE
         *   BooleanUtils.toBooleanObject(2, 1, 2, 2) = Boolean.FALSE
         *   BooleanUtils.toBooleanObject(3, 1, 2, 3) = null
         * </pre>
         *
         * @param value      the Integer to convert
         * @param trueValue  the value to match for {@code true}
         * @param falseValue the value to match for {@code false}
         * @param nullValue  the value to to match for {@code null}
         * @return Boolean.TRUE, Boolean.FALSE, or {@code null}
         * @throws IllegalArgumentException if no match
         */
        public static Boolean toBooleanObject(final int value, final int trueValue, final int falseValue,
                final int nullValue) {
            if (value == trueValue) {
                return Boolean.TRUE;
            }
            if (value == falseValue) {
                return Boolean.FALSE;
            }
            if (value == nullValue) {
                return null;
            }
            throw new IllegalArgumentException("The Integer did not match any specified value");
        }

        /**
         * <p>
         * Converts an Integer to a Boolean using the convention that {@code zero}
         * is {@code false}, every other numeric value is {@code true}.
         * </p>
         *
         * <p>
         * {@code null} will be converted to {@code null}.
         * </p>
         *
         * <p>
         * NOTE: This method may return {@code null} and may throw a
         * {@code NullPointerException}
         * if unboxed to a {@code boolean}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBooleanObject(Integer.valueOf(0))    = Boolean.FALSE
         *   BooleanUtils.toBooleanObject(Integer.valueOf(1))    = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(Integer.valueOf(null)) = null
         * </pre>
         *
         * @param value the Integer to convert
         * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,
         *         {@code null} if {@code null} input
         */
        public static Boolean toBooleanObject(final Integer value) {
            if (value == null) {
                return null;
            }
            return value.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
        }

        /**
         * <p>
         * Converts an Integer to a Boolean specifying the conversion values.
         * </p>
         *
         * <p>
         * NOTE: This method may return {@code null} and may throw a
         * {@code NullPointerException}
         * if unboxed to a {@code boolean}.
         * </p>
         *
         * <p>
         * The checks are done first for the {@code trueValue}, then for the
         * {@code falseValue} and
         * finally for the {@code nullValue}.
         * </p>
         **
         * <pre>
         *   BooleanUtils.toBooleanObject(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3)) = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(3)) = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0)) = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)) = Boolean.FALSE
         *   BooleanUtils.toBooleanObject(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(2)) = Boolean.FALSE
         *   BooleanUtils.toBooleanObject(Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)) = null
         * </pre>
         *
         * @param value      the Integer to convert
         * @param trueValue  the value to match for {@code true}, may be {@code null}
         * @param falseValue the value to match for {@code false}, may be {@code null}
         * @param nullValue  the value to to match for {@code null}, may be {@code null}
         * @return Boolean.TRUE, Boolean.FALSE, or {@code null}
         * @throws IllegalArgumentException if no match
         */
        public static Boolean toBooleanObject(final Integer value, final Integer trueValue, final Integer falseValue,
                final Integer nullValue) {
            if (value == null) {
                if (trueValue == null) {
                    return Boolean.TRUE;
                }
                if (falseValue == null) {
                    return Boolean.FALSE;
                }
                if (nullValue == null) {
                    return null;
                }
            } else if (value.equals(trueValue)) {
                return Boolean.TRUE;
            } else if (value.equals(falseValue)) {
                return Boolean.FALSE;
            } else if (value.equals(nullValue)) {
                return null;
            }
            throw new IllegalArgumentException("The Integer did not match any specified value");
        }

        /**
         * <p>
         * Converts a String to a Boolean.
         * </p>
         *
         * <p>
         * {@code 'true'}, {@code 'on'}, {@code 'y'}, {@code 't'}, {@code 'yes'}
         * or {@code '1'} (case insensitive) will return {@code true}.
         * {@code 'false'}, {@code 'off'}, {@code 'n'}, {@code 'f'}, {@code 'no'}
         * or {@code '0'} (case insensitive) will return {@code false}.
         * Otherwise, {@code null} is returned.
         * </p>
         *
         * <p>
         * NOTE: This method may return {@code null} and may throw a
         * {@code NullPointerException}
         * if unboxed to a {@code boolean}.
         * </p>
         *
         * <pre>
         *   // N.B. case is not significant
         *   BooleanUtils.toBooleanObject(null)    = null
         *   BooleanUtils.toBooleanObject("true")  = Boolean.TRUE
         *   BooleanUtils.toBooleanObject("T")     = Boolean.TRUE // i.e. T[RUE]
         *   BooleanUtils.toBooleanObject("false") = Boolean.FALSE
         *   BooleanUtils.toBooleanObject("f")     = Boolean.FALSE // i.e. f[alse]
         *   BooleanUtils.toBooleanObject("No")    = Boolean.FALSE
         *   BooleanUtils.toBooleanObject("n")     = Boolean.FALSE // i.e. n[o]
         *   BooleanUtils.toBooleanObject("on")    = Boolean.TRUE
         *   BooleanUtils.toBooleanObject("ON")    = Boolean.TRUE
         *   BooleanUtils.toBooleanObject("off")   = Boolean.FALSE
         *   BooleanUtils.toBooleanObject("oFf")   = Boolean.FALSE
         *   BooleanUtils.toBooleanObject("yes")   = Boolean.TRUE
         *   BooleanUtils.toBooleanObject("Y")     = Boolean.TRUE // i.e. Y[ES]
         *   BooleanUtils.toBooleanObject("1")     = Boolean.TRUE
         *   BooleanUtils.toBooleanObject("0")     = Boolean.FALSE
         *   BooleanUtils.toBooleanObject("blue")  = null
         *   BooleanUtils.toBooleanObject("true ") = null // trailing space (too long)
         *   BooleanUtils.toBooleanObject("ono")   = null // does not match on or no
         * </pre>
         *
         * @param str the String to check; upper and lower case are treated as the same
         * @return the Boolean value of the string, {@code null} if no match or
         *         {@code null} input
         */
        public static Boolean toBooleanObject(final String str) {
            // Previously used equalsIgnoreCase, which was fast for interned 'true'.
            // Non interned 'true' matched 15 times slower.
            //
            // Optimisation provides same performance as before for interned 'true'.
            // Similar performance for null, 'false', and other strings not length 2/3/4.
            // 'true'/'TRUE' match 4 times slower, 'tRUE'/'True' 7 times slower.
            if (str == TRUE) {
                return Boolean.TRUE;
            }
            if (str == null) {
                return null;
            }
            switch (str.length()) {
                case 1: {
                    final char ch0 = str.charAt(0);
                    if (ch0 == 'y' || ch0 == 'Y' ||
                            ch0 == 't' || ch0 == 'T' ||
                            ch0 == '1') {
                        return Boolean.TRUE;
                    }
                    if (ch0 == 'n' || ch0 == 'N' ||
                            ch0 == 'f' || ch0 == 'F' ||
                            ch0 == '0') {
                        return Boolean.FALSE;
                    }
                    break;
                }
                case 2: {
                    final char ch0 = str.charAt(0);
                    final char ch1 = str.charAt(1);
                    if ((ch0 == 'o' || ch0 == 'O') &&
                            (ch1 == 'n' || ch1 == 'N')) {
                        return Boolean.TRUE;
                    }
                    if ((ch0 == 'n' || ch0 == 'N') &&
                            (ch1 == 'o' || ch1 == 'O')) {
                        return Boolean.FALSE;
                    }
                    break;
                }
                case 3: {
                    final char ch0 = str.charAt(0);
                    final char ch1 = str.charAt(1);
                    final char ch2 = str.charAt(2);
                    if ((ch0 == 'y' || ch0 == 'Y') &&
                            (ch1 == 'e' || ch1 == 'E') &&
                            (ch2 == 's' || ch2 == 'S')) {
                        return Boolean.TRUE;
                    }
                    if ((ch0 == 'o' || ch0 == 'O') &&
                            (ch1 == 'f' || ch1 == 'F') &&
                            (ch2 == 'f' || ch2 == 'F')) {
                        return Boolean.FALSE;
                    }
                    break;
                }
                case 4: {
                    final char ch0 = str.charAt(0);
                    final char ch1 = str.charAt(1);
                    final char ch2 = str.charAt(2);
                    final char ch3 = str.charAt(3);
                    if ((ch0 == 't' || ch0 == 'T') &&
                            (ch1 == 'r' || ch1 == 'R') &&
                            (ch2 == 'u' || ch2 == 'U') &&
                            (ch3 == 'e' || ch3 == 'E')) {
                        return Boolean.TRUE;
                    }
                    break;
                }
                case 5: {
                    final char ch0 = str.charAt(0);
                    final char ch1 = str.charAt(1);
                    final char ch2 = str.charAt(2);
                    final char ch3 = str.charAt(3);
                    final char ch4 = str.charAt(4);
                    if ((ch0 == 'f' || ch0 == 'F') &&
                            (ch1 == 'a' || ch1 == 'A') &&
                            (ch2 == 'l' || ch2 == 'L') &&
                            (ch3 == 's' || ch3 == 'S') &&
                            (ch4 == 'e' || ch4 == 'E')) {
                        return Boolean.FALSE;
                    }
                    break;
                }
                default:
                    break;
            }

            return null;
        }

        /**
         * <p>
         * Converts a String to a Boolean throwing an exception if no match.
         * </p>
         *
         * <p>
         * NOTE: This method may return {@code null} and may throw a
         * {@code NullPointerException}
         * if unboxed to a {@code boolean}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toBooleanObject("true", "true", "false", "null")   = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(null, null, "false", "null")       = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(null, null, null, "null")          = Boolean.TRUE
         *   BooleanUtils.toBooleanObject(null, null, null, null)            = Boolean.TRUE
         *   BooleanUtils.toBooleanObject("false", "true", "false", "null")  = Boolean.FALSE
         *   BooleanUtils.toBooleanObject("false", "true", "false", "false") = Boolean.FALSE
         *   BooleanUtils.toBooleanObject(null, "true", null, "false")       = Boolean.FALSE
         *   BooleanUtils.toBooleanObject(null, "true", null, null)          = Boolean.FALSE
         *   BooleanUtils.toBooleanObject("null", "true", "false", "null")   = null
         * </pre>
         *
         * @param str         the String to check
         * @param trueString  the String to match for {@code true} (case sensitive), may
         *                    be {@code null}
         * @param falseString the String to match for {@code false} (case sensitive),
         *                    may be {@code null}
         * @param nullString  the String to match for {@code null} (case sensitive), may
         *                    be {@code null}
         * @return the Boolean value of the string, {@code null} if either the String
         *         matches {@code nullString}
         *         or if {@code null} input and {@code nullString} is {@code null}
         * @throws IllegalArgumentException if the String doesn't match
         */
        public static Boolean toBooleanObject(final String str, final String trueString, final String falseString,
                final String nullString) {
            if (str == null) {
                if (trueString == null) {
                    return Boolean.TRUE;
                }
                if (falseString == null) {
                    return Boolean.FALSE;
                }
                if (nullString == null) {
                    return null;
                }
            } else if (str.equals(trueString)) {
                return Boolean.TRUE;
            } else if (str.equals(falseString)) {
                return Boolean.FALSE;
            } else if (str.equals(nullString)) {
                return null;
            }
            // no match
            throw new IllegalArgumentException("The String did not match any specified value");
        }

        /**
         * <p>
         * Converts a boolean to an int using the convention that
         * {@code true} is {@code 1} and {@code false} is {@code 0}.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toInteger(true)  = 1
         *   BooleanUtils.toInteger(false) = 0
         * </pre>
         *
         * @param bool the boolean to convert
         * @return one if {@code true}, zero if {@code false}
         */
        public static int toInteger(final boolean bool) {
            return bool ? 1 : 0;
        }

        /**
         * <p>
         * Converts a boolean to an int specifying the conversion values.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toInteger(true, 1, 0)  = 1
         *   BooleanUtils.toInteger(false, 1, 0) = 0
         * </pre>
         *
         * @param bool       the to convert
         * @param trueValue  the value to return if {@code true}
         * @param falseValue the value to return if {@code false}
         * @return the appropriate value
         */
        public static int toInteger(final boolean bool, final int trueValue, final int falseValue) {
            return bool ? trueValue : falseValue;
        }

        /**
         * <p>
         * Converts a Boolean to an int specifying the conversion values.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  = 1
         *   BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) = 0
         *   BooleanUtils.toInteger(null, 1, 0, 2)          = 2
         * </pre>
         *
         * @param bool       the Boolean to convert
         * @param trueValue  the value to return if {@code true}
         * @param falseValue the value to return if {@code false}
         * @param nullValue  the value to return if {@code null}
         * @return the appropriate value
         */
        public static int toInteger(final Boolean bool, final int trueValue, final int falseValue,
                final int nullValue) {
            if (bool == null) {
                return nullValue;
            }
            return bool.booleanValue() ? trueValue : falseValue;
        }

        /**
         * <p>
         * Converts a Boolean to a String returning one of the input Strings.
         * </p>
         *
         * <pre>
         *   BooleanUtils.toString(Boolean.TRUE, "true", "false", null)   = "true"
         *   BooleanUtils.toString(Boolean.FALSE, "true", "false", null)  = "false"
         *   BooleanUtils.toString(null, "true", "false", null)           = null;
         * </pre>
         *
         * @param bool        the Boolean to check
         * @param trueString  the String to return if {@code true}, may be {@code null}
         * @param falseString the String to return if {@code false}, may be {@code null}
         * @param nullString  the String to return if {@code null}, may be {@code null}
         * @return one of the three input Strings
         */
        public static String toString(final Boolean bool, final String trueString, final String falseString,
                final String nullString) {
            if (bool == null) {
                return nullString;
            }
            return bool.booleanValue() ? trueString : falseString;
        }

        /**
         * <p>
         * {@code BooleanUtils} instances should NOT be constructed in standard
         * programming.
         * Instead, the class should be used as {@code BooleanUtils.negate(true);}.
         * </p>
         *
         * <p>
         * This constructor is public to permit tools that require a JavaBean instance
         * to operate.
         * </p>
         */
        public BooleanUtils() {
        }
    }

    public static abstract class Check {
        /**
         * Throws NullPointerException if the given object is null.
         *
         * @param o
         *                     the object to check.
         * @param variableName
         *                     the name of the variable being checked (may be null).
         */
        public static void notNull(final Object o, final String variableName) {
            if (o == null) {
                throwForNull(variableName);
            }
        }

        /**
         * Throws IllegalArgumentException if the given string is not null and its
         * length is 0.
         *
         * @param string
         *                     the string to check.
         * @param variableName
         *                     the name of the variable being checked (may be null).
         */
        public static void notEmpty(final String string, final String variableName) {
            if (string != null && string.length() == 0) {
                throwForEmpty(variableName);
            }
        }

        /**
         * Throws NullPointerException if the given string is null,
         * IllegalArgumentException if the given string's length is 0.
         *
         * @param string
         *                     the string to check.
         * @param variableName
         *                     the name of the variable being checked (may be null).
         */
        public static void notNullOrEmpty(final String string, final String variableName) {
            if (string == null) {
                throwForNull(variableName);
            }
            if (string.length() == 0) {
                throwForEmpty(variableName);
            }
        }

        /**
         * Throws NullPointerException if the given array is null,
         * IllegalArgumentException if the given array's length is 0.
         *
         * @param array
         *                     the array to check.
         * @param variableName
         *                     the name of the variable being checked (may be null).
         */
        public static void notNullOrEmpty(final Object[] array, final String variableName) {
            if (array == null) {
                throwForNull(variableName);
            }
            if (array.length == 0) {
                throwForEmpty(variableName);
            }
        }

        /**
         * Throws IllegalArgumentException if the given condition is false.
         *
         * @param condition
         *                  the condition to test.
         */
        public static void isTrue(final boolean condition) {
            isTrue(condition, null);
        }

        /**
         * Throws IllegalArgumentException if the given condition is false.
         *
         * @param condition
         *                  the condition to test.
         * @param message
         *                  the message to put in the exception (may be null for a
         *                  generic
         *                  message).
         */
        public static void isTrue(final boolean condition, final String message) {
            if (condition == false) {
                throwForFalse(message);
            }
        }

        /**
         * Throws a NullPointerException formatted with a string for the given
         * variable name.
         *
         * @param variableName
         *                     the name of the variable being checked (may be null for a
         *                     generic
         *                     message).
         */
        private static void throwForNull(String variableName) {
            // This is the best we can do.
            if (variableName == null) {
                variableName = "argument"; //$NON-NLS-1$
            }

            throw new NullPointerException(variableName + " must not be null"); //$NON-NLS-1$
        }

        /**
         * Throws an IllegalArgumentException formatted with a string for the given
         * variable name.
         *
         * @param variableName
         *                     the name of the variable being checked (may be null for a
         *                     generic
         *                     message).
         */
        private static void throwForEmpty(String variableName) {
            // This is the best we can do.
            if (variableName == null) {
                variableName = "argument"; //$NON-NLS-1$
            }

            throw new IllegalArgumentException(variableName + " must not be empty"); //$NON-NLS-1$
        }

        /**
         * Throws an IllegalArgumentException formatted with a message for when a
         * boolean condition is false.
         *
         * @param message
         *                the message to be included in the exception (may be null for a
         *                generic message).
         */
        private static void throwForFalse(String message) {
            // This is the best we can do.
            if (message == null) {
                message = "condition must not be false"; //$NON-NLS-1$
            }

            throw new IllegalArgumentException(message);
        }
    }

    public static class StringUtils {
        public static final int MNEMONIC_INDEX_NONE = -1;

        /**
         * Truncates a string.
         * 
         * @param text       the text value
         * @param truncateAt the number of characters at which the
         *                   string should be truncated. Strings will never be truncated
         *                   to less than 13 characters.
         */
        static public String truncateString(
                String text,
                int truncateAt) {
            if (text == null)
                return null;

            if (truncateAt < _TRUNCATE_AT_MINIMUM)
                truncateAt = _TRUNCATE_AT_MINIMUM;

            if (text.length() > truncateAt) {
                text = text.substring(1, truncateAt - _ELLIPSIS_LENGTH) +
                        _ELLIPSIS;
            }

            return text;
        }

        /**
         * Returns the index of the inline mnemonic in the specified string.
         * <p>
         * This method assumes that inline mnemonics are indicated via the ampersand
         * ('&') character. It returns the index of the first ampersand character
         * followed by a non-ampersand character in the string. If no inline
         * mnemonic character is found, MNEMONIC_INDEX_NONE is returned.
         * <p>
         * Strings which may contain mnemonics should be passed to
         * stripMnemonic() to strip the inline mnemonic indicator as
         * well as any escaped ampersands.
         * <p>
         * 
         * @see #stripMnemonic
         */
        public static int getMnemonicIndex(String string) {
            if (string == null) {
                return MNEMONIC_INDEX_NONE;
            }

            // Minus one, because a trailing ampersand doesn't count
            int lengthMinusOne = string.length() - 1;
            int i = 0; // Index in the source sting
            int count = 0;

            while (i < lengthMinusOne) {
                int index = string.indexOf(_MNEMONIC_INDICATOR, i);
                // Are we at the end of the string?
                if ((index == -1) || (index >= lengthMinusOne))
                    break;

                // if this isn't a double ampersand, return
                if (string.charAt(index + 1) != _MNEMONIC_INDICATOR)
                    // This index has to be relative to the _stripped_ string,
                    // so subtract off one character for every double ampersand found
                    return (index - count);

                // Skip over the double ampersand
                i = index + 2;
                count++;
            }

            return MNEMONIC_INDEX_NONE;
        }

        /**
         * Removes non-displayable inline mnemonic characters.
         * <p>
         * In order to specify a mnemonic character in a translatable string
         * (eg. in a resource file), a special character is used to indicate which
         * character in the string should be treated as the mnemonic. This method
         * assumes that an ampersand ('&') character is used as the mnemonic
         * indicator, and removes (single) ampersands from the input string. A
         * double ampersand sequence is used to indicate that an ampersand should
         * actually appear in the output stream, in which case one of the ampersands
         * is removed.
         * <p>
         * Clients should call this method after calling
         * StringUtils.getMnemonicIndex() and before displaying the string. The
         * returned string should be used in place of the input string when
         * displaying the string to the end user. The returned string may be the
         * same as the input string if no mnemonic indicator characters are found,
         * but this is not guaranteed.
         * <p>
         * 
         * @see #getMnemonicIndex
         */
        public static String stripMnemonic(String string) {
            if (string == null) {
                return null;
            }

            int length = string.length();

            // Single character (or empty) strings can't have a mnemonic
            if (length <= 1)
                return string;

            StringBuffer buffer = null;
            int i = 0;

            while (i < length) {
                int index = string.indexOf(_MNEMONIC_INDICATOR, i);

                // We've reached the append. Append the rest of the
                // string to the buffer, if one exists, then exit
                if ((index < 0) || (index >= length - 1)) {
                    if (buffer != null)
                        buffer.append(string.substring(i));

                    break;
                }

                if (buffer == null) {
                    // If the string starts with an ampersand, but not a double
                    // ampersand, then we just want to return
                    // stripMnemonic(string.substring(1)). This is basically
                    // what we do here, only I've optimized the tail recursion away.
                    if ((index == 0) && (string.charAt(1) != _MNEMONIC_INDICATOR)) {
                        string = string.substring(1);
                        length--;
                        continue;
                    } else {
                        // Allocate the buffer. We can reserve only space
                        // (length - 1), because, by now, we know there's at least
                        // 1 ampersand
                        buffer = new StringBuffer(length - 1);
                    }
                }

                // Append the bits of the string before the ampersand
                buffer.append(string.substring(i, index));

                // And append the character after the ampersand
                buffer.append(string.charAt(index + 1));

                // And skip to after that character
                i = index + 2;
            }

            // If we never allocated a buffer, then there's no mnemonic
            // at all, and we can just return the whole string
            if (buffer == null)
                return string;

            return new String(buffer);
        }

        private static final char _MNEMONIC_INDICATOR = '&';
        static private final String _ELLIPSIS = "...";
        static private final int _ELLIPSIS_LENGTH = _ELLIPSIS.length();
        static private final int _TRUNCATE_AT_MINIMUM = 13;

        public static final int MAX_COMMENT_DISPLAY_LENGTH = 120;
        public static final String ELLIPSIS = "..."; //$NON-NLS-1$
        public static final String EMPTY = ""; //$NON-NLS-1$
        public final static String UTF8_CHARSET = "UTF-8"; //$NON-NLS-1$

        private final static String PASSWORD_TOKEN = "Password="; //$NON-NLS-1$
        private final static String PWD_TOKEN = "Pwd="; //$NON-NLS-1$
        private final static String ACCOUNT_KEY_TOKEN = "AccountKey="; //$NON-NLS-1$
        private final static String PASSWORD_MASK = "******"; //$NON-NLS-1$

        private final static List<Character> VALID_PASSWORD_ENDING = Arrays.asList(';', '\'', '"');
        private static String[] TOKENS_TO_SCRUB = new String[] {
                PASSWORD_TOKEN,
                PWD_TOKEN,
                ACCOUNT_KEY_TOKEN
        };

        /**
         * Returns the given string without leading whitespace.
         *
         * @param s
         *          the string to strip leading whitespace from (not null).
         * @return the given string with all leading whitespace removed.
         */
        public static String trimBegin(final String s) {
            Check.notNull(s, "s"); //$NON-NLS-1$

            final int length = s.length();
            int index = 0;

            while (index < length && s.charAt(index) <= ' ') {
                index++;
            }

            return (index > 0) ? s.substring(index) : s;
        }

        /**
         * Return the given string without the specified leading characters.
         *
         * @param s
         *           the string to strip leading characters from (not null).
         * @param ch
         *           the leading character to remove.
         * @return the given string with all leading characters removed.
         */
        public static String trimBegin(final String s, final char ch) {
            Check.notNull(s, "s"); //$NON-NLS-1$

            final int length = s.length();
            int index = 0;

            while (index < length && s.charAt(index) == ch) {
                index++;
            }

            return (index > 0) ? s.substring(index) : s;
        }

        /**
         * Return the given string without the specified leading characters.
         *
         * @param s
         *                  the string to strip leading characters from (not null).
         * @param trimChars
         *                  the leading characters to remove.
         * @return the given string with all leading characters removed.
         */
        public static String trimBegin(final String s, final char[] trimChars) {
            Check.notNull(s, "s"); //$NON-NLS-1$

            final int length = s.length();
            int index = 0;

            while (index < length && isTrimChar(s.charAt(index), trimChars)) {
                index++;
            }

            return (index > 0) ? s.substring(index) : s;
        }

        /**
         * Returns the given string without trailing whitespace.
         *
         * @param s
         *          the string to strip trailing whitespace from (not null).
         * @return the given string with all trailing whitespace removed.
         */
        public static String trimEnd(final String s) {
            Check.notNull(s, "s"); //$NON-NLS-1$

            final int length = s.length();
            int index = s.length() - 1;

            while (index >= 0 && s.charAt(index) < ' ') {
                index--;
            }

            return (index < length - 1) ? s.substring(0, index + 1) : s;
        }

        /**
         * Return the given string without specified trailing character.
         *
         * @param s
         *           the string to strip trailing characters from (not null).
         * @param ch
         *           the trailing character to eliminate.
         * @return the given string with all trailing characters removed.
         */
        public static String trimEnd(final String s, final char ch) {
            Check.notNull(s, "s"); //$NON-NLS-1$

            final int length = s.length();
            int index = s.length() - 1;

            while (index >= 0 && s.charAt(index) == ch) {
                index--;
            }

            return (index < length - 1) ? s.substring(0, index + 1) : s;
        }

        /**
         * Return the given string without specified trailing character.
         *
         * @param s
         *                  the string to strip trailing characters from (not null).
         * @param trimChars
         *                  the trailing characters to eliminate.
         * @return the given string with all trailing characters removed.
         */
        public static String trimEnd(final String s, final char[] trimChars) {
            Check.notNull(s, "s"); //$NON-NLS-1$

            final int length = s.length();
            int index = s.length() - 1;

            while (index >= 0 && isTrimChar(s.charAt(index), trimChars)) {
                index--;
            }

            return (index < length - 1) ? s.substring(0, index + 1) : s;

        }

        /**
         * Return true if the specified character appears in the character array.
         *
         * @param ch
         *                  The character to test.
         * @param trimChars
         *                  The set of trim characters.
         * @return true if the character is in the trim characters array.
         */
        private static boolean isTrimChar(final char ch, final char[] trimChars) {
            for (int i = 0; i < trimChars.length; i++) {
                if (trimChars[i] == ch) {
                    return true;
                }
            }

            return false;
        }

        /**
         * Parse the pass string text into a resulting array of strings using the
         * passed delimeters. Note that the strings can be quoted using a pair of
         * single or double qutoes.
         *
         * @param delimiters
         *                   String containing list of delimters that can be used,
         *                   invalid
         *                   delimters are &quot;,' or one of the special regex classes
         *                   in-conjunction with another seperator i.e. a-z
         * @param text
         *                   String to split using the passed delimters.
         * @return
         */
        public static String[] split(final String delimiters, final String text) {
            if (delimiters == null || delimiters.length() == 0) {
                throw new IllegalArgumentException("Must pass a delimiter."); //$NON-NLS-1$
            }
            if (delimiters.indexOf('\'') >= 0 || delimiters.indexOf('"') >= 0) {
                throw new IllegalArgumentException("' and \" are not allowed as delimiters"); //$NON-NLS-1$
            }
            if ((delimiters.indexOf('-') >= 0
                    || delimiters.indexOf('[') >= 0
                    || delimiters.indexOf(']') >= 0
                    || delimiters.indexOf('&') >= 0) && delimiters.length() > 1) {
                throw new IllegalArgumentException("-,[,] or & are not allowed in-conjunction with other delimiters "); //$NON-NLS-1$
            }

            if (text == null) {
                return new String[0];
            }

            // Find text in-between " or ' or not a delimter.
            final String delimRegex = "\"[^\"]*\"|'[^']*'|[^" + delimiters + "]+"; //$NON-NLS-1$ //$NON-NLS-2$

            final Pattern pattern = Pattern.compile(delimRegex);
            final Matcher matcher = pattern.matcher(text);
            final ArrayList matches = new ArrayList();
            if (matcher.find()) {
                do {
                    String matchText = matcher.group().trim();
                    if ((matchText.startsWith("\"") && matchText.endsWith("\"")) //$NON-NLS-1$ //$NON-NLS-2$
                            || (matchText.startsWith("\'") && matchText.endsWith("\'"))) //$NON-NLS-1$ //$NON-NLS-2$
                    {
                        // Remove quotes if used.
                        matchText = matchText.substring(1, matchText.length() - 1);
                    }
                    matches.add(matchText);
                } while (matcher.find());
            }

            return (String[]) matches.toArray(new String[matches.size()]);
        }

        /**
         * Call the java.lang.String.split(regx) with the supplied regex. Remove
         * empties from the resulting arrary.
         *
         * @param stringToSplit
         *                      The string to split.
         * @param regex
         *                      The regex to pass to java.lang.String.split
         * @return An array of split string with empties removed.
         */
        public static String[] splitRemoveEmpties(final String stringToSplit, final String regex) {
            Check.notNull(stringToSplit, "stringToSplit"); //$NON-NLS-1$
            Check.notNull(regex, "regex"); //$NON-NLS-1$

            final String[] strings = stringToSplit.split(regex);
            boolean hasEmpties = false;

            for (final String string : strings) {
                if (isNullOrEmpty(string)) {
                    hasEmpties = true;
                    break;
                }
            }

            if (!hasEmpties) {
                return strings;
            }

            final List<String> ret = new ArrayList<String>();

            for (final String string : strings) {
                if (!isNullOrEmpty(string)) {
                    ret.add(string);
                }
            }

            return ret.toArray(new String[ret.size()]);
        }

        /**
         * Tests whether one of the strings in the given array of candidates equals
         * the given search string, ignoring character case.
         *
         * @param candidates
         *                   the candidates to search (not null).
         * @param searchFor
         *                   the string to search for in the candidates (not null).
         * @return true if the search string was found in the candidates ignoring
         *         character case, false if it was not found.
         */
        public static boolean containsStringInsensitive(final String[] candidates, final String searchString) {
            Check.notNull(candidates, "candidates"); //$NON-NLS-1$
            Check.notNull(searchString, "searchString"); //$NON-NLS-1$

            for (int i = 0; i < candidates.length; i++) {
                if (searchString.equalsIgnoreCase(candidates[i])) {
                    return true;
                }
            }

            return false;
        }

        /**
         * Tests whether one of the strings in the given array of candidates equals
         * the given search string, ignoring character case.
         *
         * @param s
         *                  the string to search (not null).
         * @param searchFor
         *                  the string to search for in the string (not null).
         * @return true if the search string was found in s ignoring character case,
         *         false if it was not found.
         */
        public static boolean containsIgnoreCase(final String s, final String searchFor) {
            Check.notNull(s, "s"); //$NON-NLS-1$
            Check.notNull(searchFor, "searchFor"); //$NON-NLS-1$

            return s.toLowerCase().contains(searchFor.toLowerCase());
        }

        /**
         * Test if the passed {@link String} is <code>null</code> or has a length of
         * zero.
         *
         * @param s
         *          {@link String} to be tested
         * @return true if null or empty.
         */
        public static boolean isNullOrEmpty(final String s) {
            return s == null || s.length() == 0;
        }

        // Replacing
        // -----------------------------------------------------------------------
        /**
         * <p>
         * Replaces a String with another String inside a larger String, once.
         * </p>
         *
         * <p>
         * A <code>null</code> reference passed to this method is a no-op.
         * </p>
         *
         * <pre>
         * StringUtils.replaceOnce(null, *, *)        = null
         * StringUtils.replaceOnce(&quot;&quot;, *, *)          = &quot;&quot;
         * StringUtils.replaceOnce(&quot;any&quot;, null, *)    = &quot;any&quot;
         * StringUtils.replaceOnce(&quot;any&quot;, *, null)    = &quot;any&quot;
         * StringUtils.replaceOnce(&quot;any&quot;, &quot;&quot;, *)      = &quot;any&quot;
         * StringUtils.replaceOnce(&quot;aba&quot;, &quot;a&quot;, null)  = &quot;aba&quot;
         * StringUtils.replaceOnce(&quot;aba&quot;, &quot;a&quot;, &quot;&quot;)    = &quot;ba&quot;
         * StringUtils.replaceOnce(&quot;aba&quot;, &quot;a&quot;, &quot;z&quot;)   = &quot;zba&quot;
         * </pre>
         *
         * @see #replace(String text, String repl, String with, int max)
         * @param text
         *             text to search and replace in, may be null
         * @param repl
         *             the String to search for, may be null
         * @param with
         *             the String to replace with, may be null
         * @return the text with any replacements processed, <code>null</code> if
         *         null String input
         */
        public static String replaceOnce(final String text, final String repl, final String with) {
            return replace(text, repl, with, 1);
        }

        /**
         * <p>
         * Replaces all occurrences of a String within another String.
         * </p>
         *
         * <p>
         * A <code>null</code> reference passed to this method is a no-op.
         * </p>
         *
         * <pre>
         * StringUtils.replace(null, *, *)        = null
         * StringUtils.replace(&quot;&quot;, *, *)          = &quot;&quot;
         * StringUtils.replace(&quot;any&quot;, null, *)    = &quot;any&quot;
         * StringUtils.replace(&quot;any&quot;, *, null)    = &quot;any&quot;
         * StringUtils.replace(&quot;any&quot;, &quot;&quot;, *)      = &quot;any&quot;
         * StringUtils.replace(&quot;aba&quot;, &quot;a&quot;, null)  = &quot;aba&quot;
         * StringUtils.replace(&quot;aba&quot;, &quot;a&quot;, &quot;&quot;)    = &quot;b&quot;
         * StringUtils.replace(&quot;aba&quot;, &quot;a&quot;, &quot;z&quot;)   = &quot;zbz&quot;
         * </pre>
         *
         * @see #replace(String text, String repl, String with, int max)
         * @param text
         *             text to search and replace in, may be null
         * @param repl
         *             the String to search for, may be null
         * @param with
         *             the String to replace with, may be null
         * @return the text with any replacements processed, <code>null</code> if
         *         null String input
         */
        public static String replace(final String text, final String repl, final String with) {
            return replace(text, repl, with, -1);
        }

        /**
         * <p>
         * Replaces a String with another String inside a larger String, for the
         * first <code>max</code> values of the search String.
         * </p>
         *
         * <p>
         * A <code>null</code> reference passed to this method is a no-op.
         * </p>
         *
         * <pre>
         * StringUtils.replace(null, *, *, *)         = null
         * StringUtils.replace(&quot;&quot;, *, *, *)           = &quot;&quot;
         * StringUtils.replace(&quot;any&quot;, null, *, *)     = &quot;any&quot;
         * StringUtils.replace(&quot;any&quot;, *, null, *)     = &quot;any&quot;
         * StringUtils.replace(&quot;any&quot;, &quot;&quot;, *, *)       = &quot;any&quot;
         * StringUtils.replace(&quot;any&quot;, *, *, 0)        = &quot;any&quot;
         * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, null, -1) = &quot;abaa&quot;
         * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;&quot;, -1)   = &quot;b&quot;
         * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;z&quot;, 0)   = &quot;abaa&quot;
         * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;z&quot;, 1)   = &quot;zbaa&quot;
         * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;z&quot;, 2)   = &quot;zbza&quot;
         * StringUtils.replace(&quot;abaa&quot;, &quot;a&quot;, &quot;z&quot;, -1)  = &quot;zbzz&quot;
         * </pre>
         *
         * @param text
         *             text to search and replace in, may be null
         * @param repl
         *             the String to search for, may be null
         * @param with
         *             the String to replace with, may be null
         * @param max
         *             maximum number of values to replace, or <code>-1</code> if no
         *             maximum
         * @return the text with any replacements processed, <code>null</code> if
         *         null String input
         */
        public static String replace(final String text, final String repl, final String with, int max) {
            if (isNullOrEmpty(text) || isNullOrEmpty(repl) || with == null || max == 0) {
                return text;
            }
            int start = 0;
            int end = text.indexOf(repl, start);
            if (end == -1) {
                return text;
            }
            final int replLength = repl.length();
            int increase = with.length() - replLength;
            increase = (increase < 0 ? 0 : increase);
            increase *= (max < 0 ? 16 : (max > 64 ? 64 : max));
            final StringBuffer buf = new StringBuffer(text.length() + increase);
            while (end != -1) {
                buf.append(text.substring(start, end)).append(with);
                start = end + replLength;
                if (--max == 0) {
                    break;
                }
                end = text.indexOf(repl, start);
            }
            buf.append(text.substring(start));
            return buf.toString();
        }

        public static String join(final String[] strings, final String joinString) {
            final StringBuffer buffer = new StringBuffer();
            if (strings != null && strings.length > 0) {
                buffer.append(strings[0]);

                for (int i = 1; i < strings.length; i++) {
                    buffer.append(joinString);
                    buffer.append(strings[i]);
                }
            }
            return buffer.toString();
        }

        public static boolean startsWithIgnoreCase(final String value, final String possiblePrefix) {
            if (value == null || possiblePrefix == null || value.length() < possiblePrefix.length()) {
                return false;
            }

            return value.substring(0, possiblePrefix.length()).equalsIgnoreCase(possiblePrefix);
        }

        /**
         * Format a comment for one line display. Removes all new line characters
         * and tabs then trims any whitespace from the end of the comment and adds
         * an ellipsis if the comment is greater than
         * {@link MAX_COMMENT_DISPLAY_LENGTH}
         *
         * @param comment
         * @return
         */
        public static String formatCommentForOneLine(String comment) {
            if (isNullOrEmpty(comment)) {
                return EMPTY;
            }

            // Remove new lines
            comment = comment.replace('\n', ' ').replace('\r', ' ');
            // Replace tabs with 4 spaces
            comment = replace(comment, "\t", "    ").trim(); //$NON-NLS-1$ //$NON-NLS-2$

            // If the comment is greater than 120 characters trim it and add
            // ellipsis.
            if (comment.length() > MAX_COMMENT_DISPLAY_LENGTH) {
                comment = comment.substring(0, MAX_COMMENT_DISPLAY_LENGTH - 3);
                comment = comment + ELLIPSIS;
            }

            return comment;
        }

        /**
         * Join values to string
         *
         * @param delimiter
         * @param values
         * @return String
         */
        public static String join(final String delimiter, final List<?> values) {
            final StringBuilder sb = new StringBuilder();

            for (final Object v : values) {
                if (sb.length() > 0) {
                    sb.append(delimiter);
                }

                sb.append(v);
            }

            return sb.toString();
        }

        /**
         * Create new string
         *
         * @param padChar
         * @param width
         * @return String
         */
        public static String newString(final char padChar, final int width) {
            final char[] buf = new char[width];

            for (int i = 0; i < width; i++) {
                buf[i] = padChar;
            }

            return new String(buf);
        }

        /**
         * Pad string
         *
         * @param s
         * @param width
         * @param leftJustified
         * @param padChar
         * @return String
         */
        public static String pad(final String s, final int width, final boolean leftJustified, final char padChar) {
            if (leftJustified) {
                return (s + newString(' ', width)).substring(0, width);
            } else {
                return (newString(' ', width) + s).substring(s.length());
            }
        }

        /**
         * Pad string
         *
         * @param s
         * @param width
         * @param leftJustified
         * @return String
         */
        public static String pad(final String s, final int width, final boolean leftJustified) {
            return pad(s, width, leftJustified, ' ');
        }

        /**
         * Pad string
         *
         * @param s
         * @param width
         * @return String
         */
        public static String pad(final String s, final int width) {
            return pad(s, width, true, ' ');
        }

        /**
         * Pad string
         *
         * @param n
         * @param width
         * @param padChar
         * @return String
         */
        public static String pad(final Number n, final int width, final char padChar) {
            return pad(n.toString(), width, false, padChar);
        }

        public static int toInt(final String s) {
            final int number;
            switch (s.charAt(s.length() - 1)) {
                case 'K':
                case 'k':
                    number = Integer.parseInt(s.substring(0, s.length() - 1).trim()) * 1024;
                    break;
                case 'M':
                case 'm':
                    number = Integer.parseInt(s.substring(0, s.length() - 1).trim()) * 1024 * 1024;
                    break;
                default:
                    number = Integer.parseInt(s.trim());
            }

            return number;

        }

        public static String escapeXml(final String s) {
            return s.replace("&", "&amp;").replace("<", "&lt;"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$
        }

    }

    public interface IndexedSortable {

        /**
         * Compare items at the given addresses consistent with the semantics of
         * {@link java.util.Comparator#compare(Object, Object)}.
         */
        int compare(int i, int j);

        /**
         * Swap items at the given addresses.
         */
        void swap(int i, int j);
    }

    public interface Progressable {
        /**
         * Report progress to the Hadoop framework.
         */
        public void progress();
    }

    public interface IndexedSorter {

        /**
         * Sort the items accessed through the given IndexedSortable over the given
         * range of logical indices. From the perspective of the sort algorithm,
         * each index between l (inclusive) and r (exclusive) is an addressable
         * entry.
         * 
         * @see IndexedSortable#compare
         * @see IndexedSortable#swap
         */
        void sort(IndexedSortable s, int l, int r);

        /**
         * Same as {@link #sort(IndexedSortable,int,int)}, but indicate progress
         * periodically.
         * 
         * @see #sort(IndexedSortable,int,int)
         */
        void sort(IndexedSortable s, int l, int r, Progressable rep);

    }

    public static final class HeapSort implements IndexedSorter {

        public HeapSort() {
        }

        private static void downHeap(final IndexedSortable s, final int b,
                int i, final int N) {
            for (int idx = i << 1; idx < N; idx = i << 1) {
                if (idx + 1 < N && s.compare(b + idx, b + idx + 1) < 0) {
                    if (s.compare(b + i, b + idx + 1) < 0) {
                        s.swap(b + i, b + idx + 1);
                    } else
                        return;
                    i = idx + 1;
                } else if (s.compare(b + i, b + idx) < 0) {
                    s.swap(b + i, b + idx);
                    i = idx;
                } else
                    return;
            }
        }

        /**
         * Sort the given range of items using heap sort.
         * {@inheritDoc}
         */
        @Override
        public void sort(IndexedSortable s, int p, int r) {
            sort(s, p, r, null);
        }

        @Override
        public void sort(final IndexedSortable s, final int p, final int r,
                final Progressable rep) {
            final int N = r - p;
            // build heap w/ reverse comparator, then write in-place from end
            final int t = Integer.highestOneBit(N);
            for (int i = t; i > 1; i >>>= 1) {
                for (int j = i >>> 1; j < i; ++j) {
                    downHeap(s, p - 1, j, N + 1);
                }
                if (null != rep) {
                    rep.progress();
                }
            }
            for (int i = r - 1; i > p; --i) {
                s.swap(p, i);
                downHeap(s, p - 1, 1, i - p + 1);
            }
        }
    }

    public static class PrimUtils {

        /** Utilities for primitive Java data types. */
        public static abstract class IntComparator {
            public abstract int compare(int a, int b);

            public boolean lessThan(int a, int b) {
                return compare(a, b) < 0;
            }

            public boolean equals(int a, int b) {
                return compare(a, b) == 0;
            }
        }

        /**
         * Sort the integer array from "start" inclusive to "end" exclusive in ascending
         * order,
         * using the provided comparator.
         */
        public static void sort(int start, int end, int[] array, IntComparator comparator) {
            int temp;
            int length = end - start;
            if (length < 7) {
                for (int i = start + 1; i < end; i++) {
                    for (int j = i; j > start && comparator.lessThan(array[j], array[j - 1]); j--) {
                        temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
                return;
            }
            int middle = (start + end) >>> 1;
            if (length > 7) {
                int bottom = start;
                int top = end - 1;
                if (length > 40) {
                    length >>= 3;
                    bottom = med3(array, bottom, bottom + length, bottom
                            + (length << 1), comparator);
                    middle = med3(array, middle - length, middle, middle + length, comparator);
                    top = med3(array, top - (length << 1), top - length, top, comparator);
                }
                middle = med3(array, bottom, middle, top, comparator);
            }
            int partionValue = array[middle];
            int a, b, c, d;
            a = b = start;
            c = d = end - 1;
            while (true) {
                while (b <= c && !comparator.lessThan(partionValue, array[b])) {
                    if (comparator.equals(array[b], partionValue)) {
                        temp = array[a];
                        array[a++] = array[b];
                        array[b] = temp;
                    }
                    b++;
                }
                while (c >= b && !comparator.lessThan(array[c], partionValue)) {
                    if (comparator.equals(array[c], partionValue)) {
                        temp = array[c];
                        array[c] = array[d];
                        array[d--] = temp;
                    }
                    c--;
                }
                if (b > c) {
                    break;
                }
                temp = array[b];
                array[b++] = array[c];
                array[c--] = temp;
            }
            length = a - start < b - a ? a - start : b - a;
            int l = start;
            int h = b - length;
            while (length-- > 0) {
                temp = array[l];
                array[l++] = array[h];
                array[h++] = temp;
            }
            length = d - c < end - 1 - d ? d - c : end - 1 - d;
            l = b;
            h = end - length;
            while (length-- > 0) {
                temp = array[l];
                array[l++] = array[h];
                array[h++] = temp;
            }
            if ((length = b - a) > 0) {
                sort(start, start + length, array, comparator);
            }
            if ((length = d - c) > 0) {
                sort(end - length, end, array, comparator);
            }
        }

        private static int med3(int[] array, int a, int b, int c, IntComparator comparator) {
            int x = array[a], y = array[b], z = array[c];
            return comparator.lessThan(x, y) ? (comparator.lessThan(y, z) ? b : (comparator.lessThan(x, z) ? c : a))
                    : (comparator.lessThan(z, y) ? b : (comparator.lessThan(z, x) ? c : a));
        }
    }

    public static class StrUtils {
        public static final char[] HEX_DIGITS = { '0', '1', '2', '3', '4', '5', '6',
                '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

        public static List<String> splitSmart(String s, char separator) {
            ArrayList<String> lst = new ArrayList<>(4);
            splitSmart(s, separator, lst);
            return lst;

        }

        static final String DELIM_CHARS = "/:;.,%#";

        public static List<String> split(String s, char sep) {
            if (DELIM_CHARS.indexOf(s.charAt(0)) > -1) {
                sep = s.charAt(0);
            }
            return splitSmart(s, sep, true);

        }

        public static List<String> splitSmart(String s, char separator, boolean trimEmpty) {
            List<String> l = splitSmart(s, separator);
            if (trimEmpty) {
                if (l.size() > 0 && l.get(0).isEmpty())
                    l.remove(0);
            }
            return l;
        }

        /**
         * Split a string based on a separator, but don't split if it's inside
         * a string. Assume '\' escapes the next char both inside and
         * outside strings.
         */
        public static void splitSmart(String s, char separator, List<String> lst) {
            int pos = 0, start = 0, end = s.length();
            char inString = 0;
            char ch = 0;
            while (pos < end) {
                char prevChar = ch;
                ch = s.charAt(pos++);
                if (ch == '\\') { // skip escaped chars
                    pos++;
                } else if (inString != 0 && ch == inString) {
                    inString = 0;
                } else if (ch == '\'' || ch == '"') {
                    // If char is directly preceeded by a number or letter
                    // then don't treat it as the start of a string.
                    // Examples: 50" TV, or can't
                    if (!Character.isLetterOrDigit(prevChar)) {
                        inString = ch;
                    }
                } else if (ch == separator && inString == 0) {
                    lst.add(s.substring(start, pos - 1));
                    start = pos;
                }
            }
            if (start < end) {
                lst.add(s.substring(start, end));
            }

            /***
             * if (SolrCore.log.isLoggable(Level.FINEST)) {
             * SolrCore.log.trace("splitCommand={}", lst);
             * }
             ***/

        }

        /**
         * Splits file names separated by comma character.
         * File names can contain comma characters escaped by backslash '\'
         *
         * @param fileNames the string containing file names
         * @return a list of file names with the escaping backslashed removed
         */
        public static List<String> splitFileNames(String fileNames) {
            if (fileNames == null)
                return Collections.<String>emptyList();

            List<String> result = new ArrayList<>();
            for (String file : fileNames.split("(?<!\\\\),")) {
                result.add(file.replaceAll("\\\\(?=,)", ""));
            }

            return result;
        }

        public static List<String> splitWS(String s, boolean decode) {
            ArrayList<String> lst = new ArrayList<>(2);
            StringBuilder sb = new StringBuilder();
            int pos = 0, end = s.length();
            while (pos < end) {
                char ch = s.charAt(pos++);
                if (Character.isWhitespace(ch)) {
                    if (sb.length() > 0) {
                        lst.add(sb.toString());
                        sb = new StringBuilder();
                    }
                    continue;
                }

                if (ch == '\\') {
                    if (!decode)
                        sb.append(ch);
                    if (pos >= end)
                        break;
                    ch = s.charAt(pos++);
                    if (decode) {
                        switch (ch) {
                            case 'n':
                                ch = '\n';
                                break;
                            case 't':
                                ch = '\t';
                                break;
                            case 'r':
                                ch = '\r';
                                break;
                            case 'b':
                                ch = '\b';
                                break;
                            case 'f':
                                ch = '\f';
                                break;
                        }
                    }
                }

                sb.append(ch);
            }

            if (sb.length() > 0) {
                lst.add(sb.toString());
            }

            return lst;
        }

        public static List<String> toLower(List<String> strings) {
            ArrayList<String> ret = new ArrayList<>(strings.size());
            for (String str : strings) {
                ret.add(str.toLowerCase(Locale.ROOT));
            }
            return ret;
        }

        /**
         * Return if a string starts with '1', 't', or 'T'
         * and return false otherwise.
         */
        public static boolean parseBoolean(String s) {
            char ch = s.length() - 1 > 0 ? s.charAt(0) : 0;
            return (ch == '1' || ch == 't' || ch == 'T');
        }

        /**
         * {@link NullPointerException} and {@link SolrException} free version of
         * {@link #parseBool(String)}
         *
         * @return parsed boolean value (or def, if s is null or invalid)
         */
        public static boolean parseBool(String s, boolean def) {
            if (s != null) {
                if (s.startsWith("true") || s.startsWith("on") || s.startsWith("yes")) {
                    return true;
                }
                if (s.startsWith("false") || s.startsWith("off") || s.equals("no")) {
                    return false;
                }
            }
            return def;
        }

    }

}
