package additional;

import java.util.Scanner;

public class $5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter fist num");
        int a = sc.nextInt();
        System.out.println("Enter second num");
        int b = sc.nextInt();
        System.out.println("Enter third num");
        int c = sc.nextInt();

        if (a == b && b == c)
            System.out.println("All numbers are equal");
        else if (a == b || b == c || a == c)
            System.out.println("Couple of numbers are equal");
        else
            System.out.println("Numbers aren't equal");
    }
}
