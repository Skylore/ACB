package week1_2.add;

import java.util.Scanner;

public class $2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word ");
        String line = scanner.next();

        char[] chMas = line.toCharArray();
        int size = chMas.length;
        int counter = 0;

        for (int i = 0; i < size; i++) {
            if (chMas[i] == 'a' || chMas[i] == 'A')
                counter += 1;
        }
        System.out.println("Quantity of 'a' in this word is: " + counter);
    }
}
