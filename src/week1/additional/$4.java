package week1.additional;

import java.util.Scanner;

public class $4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed by kilometers per hour");
        double a = sc.nextDouble();
        System.out.println("Enter speed by meters per second");
        double b = sc.nextDouble();
        double B = b * 3.6;

        if (a > B)
            System.out.println("Speed by kilometers per hour is bigger");
        else if (B > a)
            System.out.println("Speed by meters per second is bigger");
        else
            System.out.println("Speeds equal");
    }
}
