import java.util.Scanner;

public class $4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fist num");
        int a = scanner.nextInt();
        System.out.println("Enter second num");
        int b = scanner.nextInt();
        int a1 = a % b;
        int a2 = b % a;
        
        if (a1 == 0)
            System.out.println("true, " + (a / b));
        else if (a2 == 0)
            System.out.println("" + (b / a));
        else if (a % b != 0)
            System.out.println("false, " + a1);
        else if (a2 != 0)
            System.out.println("false, " + a2);
    }
}
