package week1_2;

import java.util.Scanner;
  //fill an array with random numbers,
  // on paired indexes -> paired number on unpaired -> unpaired numbers
public class $5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set size of array ");
        int size = scanner.nextInt();
        System.out.println("Enter range of nums ");
        int range = scanner.nextInt();

        if (size < 0 || range <= 0) return;

        int mas[] = new int[size];

        for (int i = 1; i < size; i += 2) {
            int random = (int) (range * Math.random());
            if ((random % 2) == 0)
                mas[i] = random;
            else
                mas[i] = random + 1;
        }
        for (int i = 0; i < size; i += 2) {
            int random = (int) (range * Math.random());
            if ((random % 2) == 1)
                mas[i] = random;
            else
                mas[i] = random + 1;
        }
        for (int i = 0; i < size; i++)
            System.out.print(mas[i] + " ");
    }
}