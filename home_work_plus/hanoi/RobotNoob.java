package gameplay;

import java.util.Random;

public class RobotNoob {

    public int generateCommand() {

        Random random = new Random();

        int firstCommand = 1 + random.nextInt(5);

        return firstCommand;

    }

    public void toRobotNoobPlay() {

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

            gameField.addRobotRing(arr, newCommand); // читерство, чтобы стать простым смертным поменять на addRing();
            //gameField.addRing(arr, newCommand);

            oldCommand = newCommand;

            counter++;

        } while (!gameField.isWin(arr));

        gameField.showGameField(arr);

        System.out.println("Вы победили! ");
        System.out.println("Было произведено " + counter + " шагов!");

    }

}
