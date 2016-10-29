package week3.warships;

import java.util.Scanner;

public class Steps {

    public static int inputX() {
        int                       x = new Scanner(System.in).nextInt();

        return x;
    }

    public static int inputY() {
        int                       y = new Scanner(System.in).nextInt();

        return y;
    }

    public static int[][] step(int[][] mat) {

        System.out.println("Input your shoot: \nx - ");
        int                                            x = inputX();
        System.out.println("y - ");
        int                                            y = inputY();

        if (y <= 0 && y > 10 && x <= 0 && x > 10) {
            return mat;
        }

        mat[y][x] = 1;

        return mat;
    }
}
