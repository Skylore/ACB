package week1_2;

public class $7 {
    public static void main(String[] args) {
        int mas[] = {23,4235,6,74,3,3,4,45,7,8,234,3,356,63,1};
        int size = mas.length / 2;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0;i < size; i++)
            sum1 += mas[i];
        for (int i = size * 2; i > size; i--)
            sum2 += mas[i];
        if (sum1 / size > sum2 / size)
            for (int i = 0; i < size; i++)
                System.out.print(mas[i] + " ");
        else
            for (int i = size * 2; i > size; i--)
                System.out.print(mas[i] + " ");
    }
}
