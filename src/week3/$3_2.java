package week3;

public class $3_2 {
    public static void main(String[] args) {

        int height = Intro.height();
        int width = Intro.width();

        System.out.println(matrix(height,width));

    }
    public static String matrix(int height, int width) {
        boolean mat[][] = new boolean[height][width];

        String matrix = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                mat[i][j] = mat[i] == mat[j] ? true : false;
                matrix += mat[i][j] + " ";
            }
            matrix += "\n";
        }

        return matrix;
    }
}
