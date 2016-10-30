package warShips;

import week3.PrintMatrix;

import java.util.Scanner;

public class Run {

    public static void core() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input size of map");
        int height = scanner.nextInt();
        int width = scanner.nextInt();

        int[][] mat = new int[width][height];
        PrintMatrix.printMat(mat);

        System.out.println("shoot! ");


        int enemyX = ((int) (Math.random() * width));

        int enemyY = ((int) (Math.random() * height));


        while (mat[enemyY][enemyX] == 0) {

            System.out.println("Input x: ");
            int inputX = scanner.nextInt() - 1;

            if (inputX < 0 && inputX > width) {
                return;
            }

            System.out.println("Input y: ");
            int inputY = scanner.nextInt() - 1;

            if (inputY < 0 && inputY >= height) {
                return;
            }

            mat[inputY][inputX] = 1;
            PrintMatrix.printMat(mat);

            Hints.printHints(inputX, inputY, enemyX, enemyY);


        }
    }
}
