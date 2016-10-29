package week3.warships;

import week3.PrintMatrix;

public class GameLoop {


    private static int                     enemyX = ((int) (Math.random() * 10));

    public static int getEnemyX() {
        return enemyX;
    }

    private static int                     enemyY = ((int) (Math.random() * 10));

    public static int getEnemyY() {
        return enemyY;
    }

    public static void run() {

        int[][] mat = new int[10][10];

        while (mat[enemyX][enemyY] == 0) {
            mat = Steps.step(mat);
            PrintMatrix.printMat(mat);
            Hints.hint();
        }
    }
}
