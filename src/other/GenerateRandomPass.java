package other;

import java.util.Scanner;

public class GenerateRandomPass {
    public static void main(String[] args) {
        System.out.println("Input length of your password ");
        int size = new Scanner(System.in).nextInt();

        String arr = fillRandom(size);

        System.out.println(arr);

        System.out.println("Are you satisfied (Input yes or no)");

        String answer = new Scanner(System.in).next();
        if (answer.equals("yes")) {
            return;
        } else if (answer.equals("no")) {
            System.out.println(fillRandom(size));
        }

    }
    public static String fillRandom(int size) {

        char[] mas = new char[size];

        for (int i = 0; i < size; i++) {
            int choose = ((int) (Math.random() * 2));

            if (choose < 1) {
                mas[i] = ((char) (1103 - (31 * Math.random())));
            } else {
                mas[i] = ((char) (57 - (9 * Math.random())));
            }
        }

        String arr = new String(mas);

        return arr;
    }
}

