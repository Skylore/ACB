package week1.additional;

import java.util.Scanner;

public class $13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = scanner.nextInt();
        System.out.println("Enter second num");
        int b = scanner.nextInt();
        System.out.println("Enter third num");
        int c = scanner.nextInt();

        if ((a + b + c) > 0)
            System.out.println((a * 2) + " " + (b * 2) + " " + (c * 2));
        else
            System.out.println(0 + " " + 0 + " " + 0);
    }
}
