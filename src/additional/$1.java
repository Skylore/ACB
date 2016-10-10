package additional;

import java.util.Scanner;

public class $1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your triangle");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int A = a * a;
        int B = b * b;
        int C = c * c;

        if (C == (A + B) | B == (C + A) | A == (C + B))
            System.out.println("Triangle is right");
        else
            System.out.println("Triangle isn't right");
    }
}
