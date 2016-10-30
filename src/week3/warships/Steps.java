package week3.warships;

import java.util.Scanner;

public class Steps {


    public static int                     enemyX = ((int) (Math.random() * 10));

    public static int                     enemyY = ((int) (Math.random() * 10));

    public static int[][] step(int[][] mat) {
         

        System.out.println("Input your shoot: \nx - ");
        int                               inputX = new Scanner(System.in).nextInt();
        System.out.println("y - ");
        int                               inputY = new Scanner(System.in).nextInt();
        
        
        if (inputY <= 0 && inputY > 10 && inputX <= 0 && inputX > 10) {
            return mat;
        }
        

        mat[inputY][inputX] = 1;

        //    Hints, TODO fix this

        if (inputX == enemyX && inputY == enemyY) {
            System.out.println("You win");

        } else if (inputX < enemyX && inputY < enemyY) {
            System.out.println("you need to shoot righter and lower");

        } else if (inputX < enemyX && inputY > enemyY) {
            System.out.println("you need to shoot righter and higher");

        } else if (inputX > enemyX && inputY < enemyY) {
            System.out.println("you need to shot lefter and lower");

        } else if (inputX > enemyX && inputY > enemyY) {
            System.out.println("you need to shoot lefter and higher");

        } else if (inputX < enemyX && inputY == enemyY) {
            System.out.println("you need to shoot righter");

        } else if (inputX > enemyX && inputY == enemyY) {
            System.out.println("you need to shoot lefter");

        } else if (inputX == enemyX && inputY < enemyY) {
            System.out.println("you need to shoot lower");

        } else if (inputX == enemyX && inputY > enemyY) {
            System.out.println("you need to shoot upper");
        }

        return mat;
    }
}
