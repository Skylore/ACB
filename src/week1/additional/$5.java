package week1.additional;

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
        boolean a1 = a == b;
        boolean a2 = b == c;
        boolean a3 = a == c;
        
        if (a1 && a2)
            System.out.println("All numbers are equal");
        else if (a1 || a2 || a3)
            System.out.println("Couple of numbers are equal");
        else
            System.out.println("Numbers aren't equal");
    }
}
