package week1.additional;

import java.util.Scanner;

public class $11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int a1 = a % 10;
        int a2 = a / 10;
        
        if (a1 == 1 || a2 == 0.1)
            System.out.println(a + " копейка");
        else if (a1 == 2 || a2 == 0.2)
            System.out.println(a + " копейки");
        else if (a1 == 3 || a2 == 0.3)
            System.out.println(a + " копейки");
        else if (a1 == 4 || a2 == 0.4)
            System.out.println(a + " копейки");
        else
            System.out.println(a + " копеек");
    }
}
