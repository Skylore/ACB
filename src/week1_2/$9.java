package week1_2;
  //fill array with random numbers in range of 25 - 75,
  //define an array with more paired numbers
import java.util.Scanner;

public class $9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of firs array ");
        int size = scanner.nextInt();
        int mas[] = new int[size];
        System.out.println("Enter size of second array ");
        int size1 = scanner.nextInt();
        int mas1[] = new int[size1];
        int counter = 0;
        int counter1 = 0;

        for (int i = 0; i < size; i++) {
            int random = ((int) (75 * Math.random()));

            if (random > 24) ;
            else
                random += 20;
            mas[i] = random;

            if ((mas[i] % 2) == 0)
                counter += 1;
        }
        for (int i = 0; i < size1; i++) {
            int random = ((int) (75 * Math.random()));

            if (random > 24) ;
            else
                random += 20;

            mas1[i] = random;

            if ((mas1[i] % 2) == 0)
                counter1 += 1;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size1; i++) {
            System.out.print(mas1[i] + " ");
        }
        System.out.println();
        if (counter > counter1)
            System.out.println("In first array more paired numbers ");
        else if (counter1 > counter)
            System.out.println("In second array more paired numbers ");
        else
            System.out.println("Quantity of paired numbers in both arrays is equal ");
    }
}
