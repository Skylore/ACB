package week1_2;
  //swap min and max values
public class $2 {
    public static void main(String[] args) {
        int mas[] = {234,523,5235,53,-23,35,-3252,
                3256246,543252,233,4545,-234456};
        int length = mas.length;

        for (int a = 1; a < length; a++)
            for (int b = length - 1; b >= a; b--) {
                if (mas[b - 1] > mas[b]) {
                    int c = mas[b - 1];
                    mas[b - 1] = mas[b];
                    mas[b] = c;
                }
            }
            int c = mas[length - 1];
            mas[length - 1] = mas[0];
            mas[0] = c;

        for (int i = 0; i < length; i++)
            System.out.print(" " + mas[i]);
    }
}
