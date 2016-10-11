package week1;

import java.util.Scanner;

public class $4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fist num");
        int a = scanner.nextInt();
        System.out.println("Enter second num");
        int b = scanner.nextInt();
        int sum = a + b;

        if (sum > 10 && sum < 19)
            System.out.println("Sum is " + sum);
        else
            System.out.println("Nope");
    }
}
