package week3;

public class TurnMatrix {

    public static int[][] turn(int[][] mat) {

        int mat1[][] = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                mat1[i][j] = mat[mat.length - 1 - j][i];
            }
        }

        return mat1;
    }

    public static int[][] finalTurn(int mat[][], int turn) {

        for (int i = 0; i < turn; i++) {
            mat = TurnMatrix.turn(mat);
        }

        return mat;
    }
}
