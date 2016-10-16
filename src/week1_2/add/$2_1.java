package week1_2.add;

import java.util.Scanner;
  // Invert random array
public class $2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input size of array ");
        int size = scanner.nextInt();

        int mas[] = returnArray(size);

        System.out.println("Default array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int invMas[] = invertArray(mas);

        System.out.println("Inverted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(invMas[i] + " ");
        }
    }
    
    public static int[] invertArray(int[] mas) {

        for (int a = 0; a < mas.length; a++) {
            int c = mas[a];
            mas[a] = mas[mas.length - a - 1];
            mas[mas.length - a - 1] = c;
        }
        return mas;
    }

    public static int[] returnArray(int size) {
        int mas[] = new int[size];

        for (int i = 0; i < size; i++) {
            mas[i] = ((int) (100 * Math.random()));
        }
        return mas;
    }
}
