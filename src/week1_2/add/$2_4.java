package week1_2.add;

import java.util.Scanner;
  //shift array to given quantity cells
public class $2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input size of array ");
        int size = scanner.nextInt();

        System.out.println("Input range of shift ");
        int shift = scanner.nextInt();

        // sout shifted array
        System.out.println("\nShifted array is ");
        int random[] = fillRandom(size);
        int finMas[] = shiftArray(random, shift);

        for (int i = 0; i < finMas.length; i++) {
            System.out.print(finMas[i] + " ");
        }

    }
    public static int[] shiftArray(int[] mas, int shift) {
        int arr[] = new int[mas.length];

        for (int i = mas.length - 1; i >= 0; i--) {
            if (i + shift >= mas.length) {
                arr[i + shift - mas.length] = mas[i];
            }
            else {
                arr[i + shift] = mas[i];
            }
        }
        return arr;
    }

    public static int[] fillRandom(int size) {
        int mas[] = new int[size];

        for (int i = 0; i < size; i++) {
            mas[i] = ((int) (100 * Math.random()));
        }
        return mas;
    }
}
