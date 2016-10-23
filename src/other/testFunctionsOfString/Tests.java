package other.testFunctionsOfString;

abstract class Tests {

    public static void testIndexOf(String line) {

        int index = MethodsOfString.testIndexOff(line);

        System.out.println("index of t is " + index);

        if (index == 14) {
            System.out.println(true);
        }
        System.out.println();
    }

    public static void testLastIndexOf(String line) {

        int index = MethodsOfString.testLastIndexOf(line);

        System.out.println("index of last 'c' is:  " + index);

        if (index == 16) {
            System.out.println(true);
        }
        System.out.println();
    }

    public static void testToCharArray(String line) {

        char[] mas = MethodsOfString.testToCharArray(line);

        System.out.println("your array is: ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        boolean cheque = false;

        char expectedMas[] = {'T','e','s','t','F','u','n','c','t','i','o','n','s','O','f','S','t','r','i','n','g'};

        for (int i = 0; i < mas.length; i++) {

            if (expectedMas.length != mas.length) {
                System.out.println(false);
                return;
            }

            cheque = mas[i] == expectedMas[i];

            if (!cheque) {
                System.out.println(false);
                return;
            }
        }

        System.out.println("\n" + cheque);

        System.out.println();
    }

    public static void testSubstring(String line) {

        String sub = MethodsOfString.testSubstring(line);

        System.out.println("word between indexes 15 and 20 is:");

        System.out.println(sub);

        if (sub.equals("String")) {
            System.out.println(true);
        }
        System.out.println();

    }

    public static void testReplace(String line) {

        String repLine = MethodsOfString.testReplace(line);

        System.out.println("F is replaced to @");

        System.out.println(repLine);

        if (repLine.equals("Test@unctionsOfString")) {
            System.out.println(true);
        }
        System.out.println();
    }

    public static void testLength(String line) {

        int length = MethodsOfString.testLength(line);

        System.out.println("length is " + length);

        if (length == 21) {
            System.out.println(true);
        }

        System.out.println();
    }

    public static void testToLowerCase(String line) {

        String ln = MethodsOfString.testToLowerCase(line);

        System.out.println("line in lower case is: \n" + ln);

        if (ln.equals("testfunctionsofstring")) {
            System.out.println(true);
        }

        System.out.println();
    }

    public static void testToUpperCase(String line) {

        String ln = MethodsOfString.testToUpperCase(line);

        System.out.println("line in upper case is: \n" + ln);

        if (ln.equals("TESTFUNCTIONSOFSTRING")) {
            System.out.println(true);
        }

        System.out.println();
    }

    public static void testEquals(String line) {

        boolean eq = MethodsOfString.testEquals(line);

        String bool = eq ? "yes" : "no";

        System.out.println("is line equals TestFunctionsOsString? \n" + bool);

        if (eq) {
            System.out.println(eq);
        }

        System.out.println();
    }

    public static void testContains(String line) {

        boolean contain = MethodsOfString.testContains(line);

        String con = contain ? "yes" : "no";

        System.out.println("Is line contain word 'String' \n" + con);

        if (contain) {
            System.out.println(true);
        }

        System.out.println();
    }

    public static void testCompareTo(String line) {

        int compare = MethodsOfString.testCompareTo(line);

        System.out.println("Compare line and 'TestCompareTo'");

        if (compare > 0) {
            System.out.println("line is bigger");
        } else if (compare < 0){
            System.out.println("Word is bigger");
        } else {
            System.out.println("lines are equals");
        }

        if (compare > 0) {
            System.out.println(true);
        }

        System.out.println();
    }

    public static void testStartWith(String line) {

        boolean start = MethodsOfString.testStartWith(line);

        String ln = start ? "yes" : "no";

        System.out.println("Is line start with 'Test' \n" + ln);

        if (start) {
            System.out.println(true);
        }
    }

    public static void testEndWith (String line) {

        boolean end = MethodsOfString.testEndWith(line);

        String ln = end ? "yes" : "no";

        System.out.println("Is line ending with\n" + ln);

        if (end) {
            System.out.println("true");
        }

        System.out.println();
    }

    public static void testReplaceAll (String line) {

        String ln = MethodsOfString.testReplaceAll(line);

        System.out.println("Replase all 't' to '@' \n" + ln);

        if (ln.equals("Tes@Func@ionsOfS@ring")) {
            System.out.println(true);
        }
    }
}
