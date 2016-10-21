package week3;

import java.util.Scanner;

public class Intro {
    public static int width() {
        System.out.println("Input width of matrix: ");
        int width = new Scanner(System.in).nextInt();

        return width;
    }

    public static int height() {
        System.out.println("Input height of matrix: ");
        int height = new Scanner(System.in).nextInt();

        return height;
    }
}
