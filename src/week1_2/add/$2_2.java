package week1_2.add;
  // cheque, is number paired
import java.util.Scanner;

public class $2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number ");
        int num = scanner.nextInt();

        if (cheque(num))
            System.out.println("Number is composite ");
        else
            System.out.println("Number is prime ");

    }

    public static boolean cheque(int num) {

        boolean isComposite = false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isComposite = true;
                break;
            }
        }

        return isComposite;
    }

}
