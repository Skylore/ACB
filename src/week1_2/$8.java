package week1_2;

public class $8 {
    public static void main(String[] args) {
        int mas[] = {234,523,523,425,67,5487,8583,4,63,32};
        int mas1[] = {2,3456,73,2434,543,634,6735,7887,434,2};
        int size = mas.length;
        int sum = 0;

        for (int i = 0; i < size; i++)
            sum += mas[i] + mas1[i];

        System.out.println(sum);
    }
}
