import java.util.Scanner;

public class $4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = scanner.nextInt();
        System.out.println("Enter second num");
        int b = scanner.nextInt();

        if (a < b)
            System.out.println("a < b so sum is " + (a + b));
        else
            System.out.println("a >= b so difference is " + (a - b));
    }
}