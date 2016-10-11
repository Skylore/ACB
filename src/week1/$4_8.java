package week1;

import java.util.Scanner;

public class $4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fist num");
        int a = scanner.nextInt();
        System.out.println("Enter second num");
        int b = scanner.nextInt();

        if (a%10 == b%10) System.out.println(true);
        else System.out.println(false);
    }
}
