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
        boolean a1 = a < b;
        boolean a2 = a < c;
        boolean a3 = b < c;

        if(a1 && a2 && a3)
            System.out.println("The smallest is " + a + " The biggest is " + c);
        else if(a1 && a2 && !a3)
            System.out.println("The smallest is " + a + " The biggest is " + b);
        else if(!a1 && a3 && a2)
            System.out.println("The smallest is " +  b + " The biggest is " + c);
        else if(!a1 && a3 && !a2)
            System.out.println("The smallest is " + b + " The biggest is " + a);
        else if(!a2 && !a3 && a1)
            System.out.println("The smallest is " + c + " The biggest is " + b);
        else if(!a2 && !a3 && !a1)
            System.out.println("The smallest is " + c + " The biggest is " + a);
    }
}
