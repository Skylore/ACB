package week1_2;
  //find min and max values of array and sout them
public class $1 {
    public static void main(String[] args) {
        int mas[] = new int[10];
        randomArray(mas);

        for (int a = 1; a < mas.length; a++) {
            for (int b = mas.length - 1; b >= a; b--) {
                if (mas[b - 1] > mas[b]) {
                    int c = mas[b - 1];
                    mas[b - 1] = mas[b];
                    mas[b] = c;
                }
            }
        }

        System.out.println("Min value is " + mas[0]
         + "\nMax value is " + mas[mas.length - 1]);
        
    }
    public static int[] randomArray(int mas[]) {
        for (int i = 0; i < mas.length; i++) {
            int random = ((int) (100 * Math.random()));
            mas[i] = random;
        }
        return mas;
    }
}