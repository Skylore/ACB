package week1.additional;

import java.util.Scanner;

public class $7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date");
        int a = scanner.nextInt();

        if (a >= 0 && a <= 12) {
            if (a == 12 || a == 1 || a == 2)
                System.out.println("It's winter");
            else if (a >= 3 && a <= 5)
                System.out.println("It's spring");
            else if (a >= 6 && a <= 8)
                System.out.println("It's summer");
            else
                System.out.println("It's autumn");
        }
        else
            System.out.println("Please enter right date");
    }
}
