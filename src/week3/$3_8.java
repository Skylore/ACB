package week3;

import java.util.Scanner;

public class $3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input line: ");
        String ln = scanner.nextLine();

        String arr[] = toUpperCase(ln);

        System.out.println("\nFirst letters to upper case: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static String[] toUpperCase(String line) {

        String mas[] = line.split(" ");

        String ln = line.toUpperCase();
        String arr[] = ln.split(" ");

        for (int i = 0; i < mas.length; i++) {
            char[] mm = mas[i].toCharArray();
            char[] tomm = arr[i].toCharArray();

            mm[0] = tomm[0];

            mas[i] = new String(mm);

        }

        return mas;
    }
}
