package week3;

import java.util.Scanner;

public class $3_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input side of matrix: ");
        int side = scanner.nextInt();

        System.out.println("Input turning angle, that divides by 90: ");
        int turn = scanner.nextInt();

        if (!(turn % 90 == 0 && turn >= 90)) {
            System.out.println("Invalid angle.");
            return;
        }

        int numOfTurns = turn / 90;

        int defaultMatrix[][] = GenerateMatrix.matrix(side, side);

        int[][] turnedMatrix = TurnMatrix.finalTurn(defaultMatrix, numOfTurns);

        System.out.println("Default matrix is: ");
        PrintMatrix.printMat(defaultMatrix);

        System.out.println("\nTurned matrix is: ");
        PrintMatrix.printMat(turnedMatrix);
    }
}
