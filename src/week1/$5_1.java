package week1;

import java.util.Scanner;
 
public class $5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What type of convert do you want to do? " +
                "\n1: Convert to binary \n2: Convert to decimal");
        int choose = scanner.nextInt();

        int decToBin = 0;
        String binToDec = "";

        if (choose == 1) {
            System.out.println("Input code");
            decToBin = scanner.nextInt();
            convertToBinary(decToBin);
        }
        else {
            System.out.println("Input number ");
            binToDec = scanner.next();
            convertToDecimal(binToDec);
        }

    }

    public static void convertToBinary(int num) {
        System.out.println(Integer.toBinaryString(num));
    }
    public static void convertToDecimal(String num) {
        System.out.println(Integer.parseInt(num, 2));
    }
}
