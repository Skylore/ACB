import java.util.Scanner;

public class $4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fist num");
        int a = scanner.nextInt();
        System.out.println("Enter second num");
        int b = scanner.nextInt();

        if (a % b == 0)
            System.out.println("true, " + (a / b));
        else if (b % a == 0)
            System.out.println("" + (b / a));
        else if (a % b != 0)
            System.out.println("false, " + (a % b));
        else if (b % a != 0)
            System.out.println("false, " + (b % a));
    }
}
