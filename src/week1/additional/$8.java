package week1.additional;

import java.util.Scanner;

public class $8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter price");
        int price = scanner.nextInt();
        double discount = 0.1;
        if (price > 1000)
            System.out.println("Your final price is " + (price - (price * discount)));
        else
            System.out.println("Your final price is " + price);

    }
}
