import java.util.Scanner;

public class $4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = scanner.nextInt();
        System.out.println("Enter second num");
        int b = scanner.nextInt();
        System.out.println("Enter third num");
        int c = scanner.nextInt();

        if(a < b && a < c && b < c)
            System.out.println("The smallest is " + a + " The biggest is " + c);
        else if(a < b && a < c && b > c)
            System.out.println("The smallest is " + a + " The biggest is " + b);
        else if(b < a && b < c && a < c)
            System.out.println("The smallest is " +  b + " The biggest is " + c);
        else if(b < a && b < c && a > c)
            System.out.println("The smallest is " + b + " The biggest is " + a);
        else if(c < a && c < b && a < b)
            System.out.println("The smallest is " + c + " The biggest is " + b);
        else if(c < a && c < b && a < b)
            System.out.println("The smallest is " + c + " The biggest is " + a);
    }
}