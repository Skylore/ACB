package week1_2;
  //copy array
public class $3 {
    public static void main(String[] args) {
        int mas[] = {23,45,-232,456,745};
        int mas1[] = {-456,4576,-24,67,34};
        int size = mas.length;
        mas1 = mas.clone();

        for (int i = 0; i < size; i++)
            System.out.print(" " + mas1[i]);
    }
}
