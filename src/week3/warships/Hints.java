package week3.warships;

public class Hints {

    public static void hint() {

        int inputX = Steps.inputX();
        int inputY = Steps.inputY();

        int enemyX = GameLoop.getEnemyX();
        int enemyY = GameLoop.getEnemyY();

        // TODO fix this

        if (inputX == enemyX && inputY == enemyY) {
            System.out.println("You win");

        } else if (inputX < enemyX && inputY < enemyY) {
            System.out.println("you need to shoot righter and higher");

        } else if (inputX < enemyX && inputY > enemyY) {
            System.out.println("you need to shoot righter and lower");

        } else if (inputX > enemyX && inputY < enemyY) {
            System.out.println("you need to shot lefter and higher");

        } else if (inputX > enemyX && inputY > enemyY) {
            System.out.println("you need to shoot lefter and lower");

        } else if (inputX < enemyX && inputY == enemyY) {
            System.out.println("you need to shoot righter");

        } else if (inputX > enemyX && inputY == enemyY) {
            System.out.println("you need to shoot lefter");

        } else if (inputX == enemyX && inputY < enemyY) {
            System.out.println("you need to shoot upper");

        } else if (inputX == enemyX && inputY > enemyY) {
            System.out.println("you need to shoot lower");
        }
    }
}
