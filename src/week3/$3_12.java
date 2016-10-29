package week3;

import java.util.Scanner;

public class $3_12 {
    public static void main(String[] args) {

        cheque();

        generateRandomPassword();

    }

    public static void cheque() {

        System.out.println("Input your password: ");
        String ln = new Scanner(System.in).next();

        System.out.println("Once else: ");
        String ln1 = new Scanner(System.in).next();

        int counter = 0;

        // cheque equals
        if (!ln.equals(ln1)){
            System.out.println("passwords need to be equals");
            return;
        }

        // cheque length
        if (!(ln.length() >= 8 && ln.length() <= 20)) {
            System.out.println("password must be length of 8 - 20 symbols");
            counter++;
        }

        // cheque upper and lower case
        if (ln.toLowerCase().equals(ln)) {
            System.out.println("word must contain symbols of upper and lower case");
            counter++;
        }

        // cheque containing numbers
        boolean containNums = false;

        for (int i = 0; i < ln.length(); i++) {
            if (ln.contains(i + "")) {
                containNums = true;
                break;
            }
        }

        if (!containNums) {
            System.out.println("password must contain numbers");
            counter++;
        }


        // cheque of containing parts "password", "pass", "gfhjkm"
        if (ln.contains("password") || ln.contains("pass") || ln.contains("gfhjkm")) {
            System.out.println("password mustn't contain words like 'password', 'pass' or 'gfhjkm'");
        }

        System.out.println(counter == 0 ? "excellent\n" : "\n");
    }

    public static void generateRandomPassword() {

        int size = 8 +  ((int) (Math.random() * 12));

        char[] mas = new char[size];

        System.out.println("recommend password: ");
        for (int i = 0; i < size; i++) {
            int choose = ((int) (Math.random() * 3));

            if (choose == 0) {
                mas[i] = ((char) (122 - (25 * Math.random())));
            } else if (choose == 1){
                mas[i] = ((char) (57 - (9 * Math.random())));
            } else {
                mas[i] = ((char) (90 - (25 * Math.random())));
            }

            System.out.print(mas[i]);
        }
    }
}