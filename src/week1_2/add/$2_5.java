package week1_2.add;
  // change all 'a' in line to '@'
import java.util.Scanner;

public class $2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word ");
        String line = scanner.next();

        char[] mas = line.toCharArray();
        int size = mas.length;

        for (int i = 0; i < size; i++) {
            if (mas[i] == 'a' || mas[i] == 'A')
                mas[i] = '@';
        }
        String fin = new String(mas);
        System.out.println(fin);
    }
}
