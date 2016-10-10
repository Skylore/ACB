package additional;

import java.util.Scanner;

public class $10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter date of a conversation (1 - 7)");
        int date = scanner.nextInt();
        System.out.println("Enter duration");
        int duration = scanner.nextInt();
        int priceByHour = 250;

        if (date > 0 && date < 8) {
            if (date > 0 || date < 6)
                System.out.println("Your price is " + (duration * priceByHour) + " dollars");
            else
                System.out.println("Your price is " +
                        ((duration * priceByHour) - ((duration * priceByHour) * 0.2)) + " dollars");
        } else
            System.out.println("Please enter right date");
    }
}
