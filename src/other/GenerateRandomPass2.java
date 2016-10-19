package other;

import java.util.Scanner;

public class GenerateRandomPass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input size of your password");
        int size = scanner.nextInt();

        if (size < 0) {
            return;
        }

        System.out.println("What language of password do you want\n1 - Russian\n2 - English\nInput yout answer");
        String answer = scanner.next();

        if (!(answer.equals("1") || answer.equals("2"))) {
            System.out.println("Incorrect answer");
            return;
        }
        if (answer.equals("1")) {
            System.out.println(fillRandomRus(size));

            System.out.println("Do you satisfied? (Input yes or no)");

            String ans = scanner.next();

            if (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("Incorrect answer");
                return;
            }

            if (ans.equals("yes")) {
                return;
            } else if (ans.equals("no")) {
                System.out.println(fillRandomRus(size));
            }

        } else {
            System.out.println(fillRandomEng(size));

            System.out.println("Do you satisfied? (Input yes or no)");

            String ans = scanner.next();

            if (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("Incorrect answer");
                return;
            }

            if (ans.equals("yes")) {
                return;

            } else if (ans.equals("no")) {
                System.out.println(fillRandomEng(size));
            }
        }
    }

    private static String fillRandomRus(int size) {

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

    private static String fillRandomEng(int size) {

        char[] mas = new char[size];

        for (int i = 0; i < size; i++) {
            int choose = ((int) (Math.random() * 2));

            if (choose < 1) {
                mas[i] = ((char) (122 - (25 * Math.random())));
            } else {
                mas[i] = ((char) (57 - (9 * Math.random())));
            }
        }

        String arr = new String(mas);

        return arr;
    }
}
