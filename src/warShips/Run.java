package warShips;

import warShips.Hints;
import week3.PrintMatrix;

import java.util.Scanner;

public class Run {

    public static void core() {

        int[][] mat = new int[10][10];

        int enemyX = ((int) (Math.random() * 10));

        int enemyY = ((int) (Math.random() * 10));


        while (mat[enemyY][enemyX] == 0) {

            System.out.println("Input x: ");
            int inputX = new Scanner(System.in).nextInt();

            System.out.println("Input y: ");
            int inputY = new Scanner(System.in).nextInt();

            mat[inputY][inputX] = 1;
            PrintMatrix.printMat(mat);

            Hints.printHints(inputX, inputY, enemyX, enemyY);


        }
    }
}
