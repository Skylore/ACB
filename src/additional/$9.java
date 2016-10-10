package additional;

import java.util.Scanner;

public class $9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight");
        double weight = scanner.nextDouble();

        if (weight > 15 && weight < 16)
            System.out.println("You're normal");
        else if (weight > 16.4)
            System.out.println("You need to lose weight");
        else
            System.out.println("You need to gain weight");
    }
}
