package week1;

import java.util.Scanner;

public class $5_2 {
    public static void main(String[] args) {

        System.out.println("Input integer number");
        int num = new Scanner(System.in).nextInt();

        System.out.println("Factorial of " + num + " is " + factorial(num));

    }

    public static long factorial(int num) {
        long fac = 1;

        for (int i = 1; i < num + 1; i++) {
            fac *= i;
        }

        return fac;
    }
}
