package week3;

import java.util.Scanner;

public class $3_7 {
    public static void main(String[] args) {
        String line = new Scanner(System.in).nextLine();

        String mas[] = line.split(" ");

        System.out.println("The longest word is: " + findBiggest(mas));
    }

    public static String findBiggest(String mas[]) {

        int max = mas[0].length();

        int index = 0;

        for (int i = 1; i < mas.length; i++) {
            if (max < mas[i].length()) {
                max = mas[i].length();

                index = i;
            }
        }

        return mas[index];
    }
}
