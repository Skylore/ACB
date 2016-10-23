package other.testFunctionsOfString;

public class Main extends Tests {
    public static void main(String[] args) {

        String line = "TestFunctionsOfString";
        System.out.println(line + "\n");

        //indexOff
        testIndexOf(line);
        //lastIndexOff
        testLastIndexOf(line);
        //toCharArray
        testToCharArray(line);
        //substring
        testSubstring(line);
        //replace
        testReplace(line);
        //length
        testLength(line);
        //toLowerCase
        testToLowerCase(line);
        //toUpperCase
        testToUpperCase(line);
        //equals
        testEquals(line);
        //contains
        testContains(line);
        //compareTo
        testCompareTo(line);
        //startWith
        testStartWith(line);
        //endWith
        testEndWith(line);
        //replaceAll
        testReplaceAll(line);
    }

}
