package week1_2;
  //find min and max values of array and sout them
public class $1 {
    public static void main(String[] args) {
        int mas[] = {234,523,5235,53,-23,35,-3252,3256246,543252,233,4545,-234456};
        int length = mas.length;

        for (int a = 1; a < length; a++)
            for (int b = length - 1; b >= a; b--) {
                if (mas[b - 1] > mas[b]) {
                    int c = mas[b - 1];
                    mas[b - 1] = mas[b];
                    mas[b] = c;
                }
            }
        System.out.println("Min value is " + mas[0]);
        System.out.println("Max value is " + mas[length - 1]);
    }
}