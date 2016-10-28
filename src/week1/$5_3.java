package week1;

import java.util.Scanner;

public class $5_3 {
    public static void main(String[] args) {

        System.out.println("Input number:");
        long num = new Scanner(System.in).nextLong();

        System.out.println("Quantity of 8 in this number is " + quantityOf8(num));

    }

    public static int quantityOf8 (long num) {

        int counter = 0;

        while (num > 0) {
            if (num % 10 == 8) {
                counter++;
            }

            num /= 10;
        }

        return counter;
    }
}
