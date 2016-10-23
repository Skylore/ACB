package other.testFunctionsOfString;

public class MethodsOfString {

    public static int testIndexOff(String line) {

        return line.indexOf('f');
    }

    public static int testLastIndexOf(String line) {

        return line.lastIndexOf('t');
    }

    public static char[] testToCharArray(String line) {

        char[] mas = line.toCharArray();

        return mas;
    }

    public static String testSubstring(String line) {

        return line.substring(15, 21);
    }

    public static String testReplace(String line ) {

        return line.replace("F", "@");
    }

    public static int testLength(String line) {

        return line.length();
    }

    public static String testToLowerCase(String line) {

        return line.toLowerCase();
    }

    public static String testToUpperCase(String line) {

        return line.toUpperCase();
    }

    public static boolean testEquals(String line) {

        return line.equals("TestFunctionsOfString");
    }

    public static boolean testContains(String line) {
        return line.contains("String");
    }

    public static int testCompareTo(String line) {

        return line.compareTo("TestCompareTo");
    }

    public static boolean testStartWith(String line) {

        return line.startsWith("Test");
    }

    public static boolean testEndWith (String line) {

        return line.endsWith("String");
    }

    public static String testReplaceAll (String line) {

        return line.replaceAll("t", "@");
    }
}
