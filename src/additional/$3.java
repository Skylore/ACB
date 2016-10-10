package additional;

import java.util.Scanner;

public class $3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = a / 100;
        int a2 = a / 10 % 10;
        int a3 = a % 10 % 10;

        if (a1 == a2 && a2 == a3)
            System.out.println("All digits equal");
        else if (a1 == a2 || a2 == a3)
            System.out.println("Couple of digits are equal");
        else
            System.out.println("Digits aren't equal");
    }
}
