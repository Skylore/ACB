package additional;

import java.util.Scanner;

public class $14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter six-digit");
        int a = scanner.nextInt();

        int a1 = a / 100000;
        int a2 = a / 10000 % 10;
        int a3 = a / 1000 % 10 % 10;
        int a4 = a / 100 % 10 % 10 % 10;
        int a5 = a / 10 % 10 % 10 % 10 % 10;
        int a6 = a % 10 % 10 % 10 % 10 % 10;

        if (a1 + a2 + a3 == a4 + a5 + a6)
            System.out.println("Your number is lucky");
        else
            System.out.println("Your number isn't lucky");
    }
}
