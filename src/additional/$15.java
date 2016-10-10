package additional;

import java.util.Scanner;

public class $15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter area of a circle");
        int s1 = scanner.nextInt();
        System.out.println("area of a square now");
        int s2 = scanner.nextInt();

        double sqrt = Math.sqrt(s1 / 3.14);
        double D1 = sqrt * 2;
        double D2 =  Math.sqrt(s2);

        if (D1 <= D2)
            System.out.println("Circle can fit in the square");
        else
            System.out.println("Square  can fit in the circle");
    }
}
