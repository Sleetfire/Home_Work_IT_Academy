package gameplay;

import java.math.BigDecimal;

public class PlayMain {

    public static void main(String[] args) {

        User user = new User();

        int gameMode = user.selectGameMode();

        if (gameMode == 1) {

            toUserPlay();

        } else {

            toRobotNoobPlay();

        }

    }

    public static void toUserPlay() {

        int counter = 0;

        User user = new User();

        GameField gameField = new GameField();

        int[][] arr = gameField.createNewGameField();

        do {

            gameField.showGameField(arr);

            int command = user.selectCommand();

            gameField.addRing(arr, command);

            counter++;

        } while (!gameField.isWin(arr));

        gameField.showGameField(arr);

        System.out.println("Вы победили! ");
        System.out.println("Было произведено " + counter + " шагов!");


    }

    public static void toRobotNoobPlay (){

        long counter = 0;


               GameField gameField = new GameField();

        int[][] arr = gameField.createNewGameField();

        RobotNoob robotNoob = new RobotNoob();

        int oldCommand = robotNoob.generateCommand();

        do {

            gameField.showGameField(arr);

            int newCommand = robotNoob.generateCommand();

            while (oldCommand == newCommand) {

                newCommand = robotNoob.generateCommand();

            }

            gameField.addRing(arr, newCommand);

            oldCommand = newCommand;

            counter++;

        } while (!gameField.isWin(arr));

        gameField.showGameField(arr);

        System.out.println("Вы победили! ");
        System.out.println("Было произведено " + counter + " шагов!");


    }

}
