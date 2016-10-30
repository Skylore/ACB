package week3.warships;

import week3.PrintMatrix;

public class GameLoop {

    public static void run() {

        int enemyX = Steps.enemyX;
        int enemyY = Steps.enemyY;

        int[][] mat = new int[10][10];
        System.out.println(enemyX + " " + enemyY);

        while (mat[enemyY][enemyX] == 0) {
            mat = Steps.step(mat);
            PrintMatrix.printMat(mat);
        }
    }
}
