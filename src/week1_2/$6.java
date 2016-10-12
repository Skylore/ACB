package week1_2;

public class $6 {
    public static void main(String[] args) {
        int mas[] = {23, 4523, 66, 54, 2, 45, 2, 4};
        int size = mas.length;
        int sum = 0;

        System.out.print("Default array: ");
        for (int i = 0; i < size; i++) {
            sum += mas[i];
            System.out.print(mas[i] + " ");
        }
        int average = sum / size;
        System.out.println("\nAverage is: " + average);
    }
}
