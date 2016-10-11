package week1.additional;

import java.util.Scanner;

public class $2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = scanner.nextInt();
        System.out.println("Enter second num");
        int b = scanner.nextInt();
        System.out.println("Enter third num");
        int c = scanner.nextInt();

        if (a > 0)
            System.out.println(a * a * a);
        else
            System.out.println(0);
        if (b > 0)
            System.out.println(b * b * b);
        else
            System.out.println(0);
        if (c > 0)
            System.out.println(c * c * c);
        else
            System.out.println(0);
    }
}
