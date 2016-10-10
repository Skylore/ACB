import java.util.Scanner;

public class $4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();

        if(time >= 0 && time <=  24) {
            if (time > 8 && time < 19) System.out.println("Я на работе");
            else System.out.println("Я отдыхаю");
        }
    }
}
