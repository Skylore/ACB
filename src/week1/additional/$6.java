package week1.additional;

import java.util.Scanner;

public class $6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speed");
        int speed = scanner.nextInt();
        System.out.println("Enter range");
        int range = scanner.nextInt();
        double time = range / speed;

        System.out.println("You will have arrived in a " + time + " hours");
    }
}
