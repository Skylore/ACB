package additional;

import java.util.Scanner;

public class $11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if ((a % 10 == 1) || (a / 10 == 0.1))
            System.out.println(a + " копейка");
        else if ((a % 10 == 2) || (a / 10 == 0.2))
            System.out.println(a + " копейки");
        else if ((a % 10) == 3 || (a / 10 == 0.3))
            System.out.println(a + " копейки");
        else if ((a % 10) == 4 || (a / 10 == 0.4))
            System.out.println(a + " копейки");
        else
            System.out.println(a + " копеек");
    }
}
