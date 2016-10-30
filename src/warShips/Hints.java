package warShips;

public class Hints {

    public static void printHints(int inputX, int inputY, int enemyX, int enemyY) {

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
    }
}
