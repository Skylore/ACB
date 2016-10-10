import java.util.Scanner;

public class $4_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your num");
        double a = scanner.nextDouble();

        if (a >= 0 && a <= 1) System.out.println(a >= 0 && a <= 1);
        else System.out.println(false);
    }
}
