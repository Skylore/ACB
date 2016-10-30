package week3;

import java.util.Scanner;

public class $3_6 {
    public static void main(String[] args) {

        String input = new Scanner(System.in).next();

        int mas[] = indexOfLongestPathNulls(input);

        System.out.println("indexes of longest path of nulls");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();

        int mas1[] = indexOfLongestPass1(input);

        System.out.println("indexes of longest pass of '1'");
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + " ");
        }

    }

    public static int[] indexOfLongestPathNulls(String ln) {

        int finMas[] = new int[2];

        String mas[] = ln.split("1");
        String max = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (max.length() < mas[i].length()) {
                max = mas[i];
            }
        }

        finMas[0] = ln.indexOf(max) + 1;
        finMas[1] = ln.indexOf(max) + max.length();

        return finMas;
    }

    public static int[] indexOfLongestPass1 (String ln) {

        int finMas[] = new int[2];

        String mas[] = ln.split("0");
        String max = mas[0];

        for (int i = 1; i < mas.length; i++) {
            if (max.length() < mas[i].length()) {
                max = mas[i];
            }
        }

        finMas[0] = ln.indexOf(max) + 1;
        finMas[1] = ln.indexOf(max) + max.length();

        return finMas;
    }
}