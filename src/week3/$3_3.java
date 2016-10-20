package week3;

import java.util.Scanner;

public class $3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something ");
        String line = scanner.next();

        if (cheque(line)) {
            System.out.println("Line is palindrome ");
        } else {
            System.out.println("Line isn't palindrome ");
        }

    }
    public static boolean cheque(String line) {
        char[] mas = line.toCharArray();

        for (int i = 0; i < mas.length / 2; i++) {
            char c = mas[i];
            mas[i] = mas[mas.length - i - 1];
            mas[mas.length - i - 1] = c;
        }
        String arr = new String(mas);

        boolean ret = line.equals(arr) ? true : false;

        return ret;
    }
}
