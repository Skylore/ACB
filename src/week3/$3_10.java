package week3;

import java.util.Scanner;

public class $3_10 {
    public static void main(String[] args) {

        String line = new Scanner(System.in).nextLine();

        String array[] = deleteRepeated(line);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public static String[] deleteRepeated(String line) {


        String mas[] = line.trim().split(" ");

        String arr = "";

        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i].equals(mas[i + 1])) {
                mas[i] = "\t";
            }
            arr += mas[i] + " ";
        }

        String array[] = arr.trim().split(" ");

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].trim();
        }

        return array;
    }
}
