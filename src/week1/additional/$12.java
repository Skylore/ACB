package week1.additional;

import java.util.Scanner;

public class $12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed of wind");
        double a = scanner.nextDouble();
        if (a > 0) {
            if (a >= 1 && a <= 4)
                System.out.println("слабый");
            else if (a >= 5 && a < 10)
                System.out.println("умеренный");
            else if (a > 9 && a <= 18)
                System.out.println("сильный");
            else
                System.out.println("ураганный");
        } else
            System.out.println("Введите корректную скорость ");
    }
}
