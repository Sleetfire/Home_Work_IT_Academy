package gameplay;

public class RobotPro {

    public void toRobotProPlay() {

        long counter = 0;

        int command = 0;

        GameField gameField = new GameField();

        int[][] arr = gameField.createNewGameField();

        gameField.showGameField(arr);

        do {

            if (arr.length % 2 == 0) {

                command = 1;
                gameField.addRobotRing(arr, command);
                gameField.showGameField(arr);
                counter++;
                if (gameField.isWin(arr)) break;

                command = 2;
                gameField.addRobotRing(arr, command);
                gameField.showGameField(arr);
                counter++;
                if (gameField.isWin(arr)) break;

                command = 4;
                gameField.addRobotRing(arr, command);
                gameField.showGameField(arr);
                counter++;
                if (gameField.isWin(arr)) break;

            } else {

                command = 2;
                gameField.addRobotRing(arr, command);
                gameField.showGameField(arr);
                counter++;
                if (gameField.isWin(arr)) break;

                command = 1;
                gameField.addRobotRing(arr, command);
                gameField.showGameField(arr);
                counter++;
                if (gameField.isWin(arr)) break;

                command = 4;
                gameField.addRobotRing(arr, command);
                gameField.showGameField(arr);
                counter++;
                if (gameField.isWin(arr)) break;

            }

        } while (true);

        System.out.println("Вы победили! ");
        System.out.println("Было произведено " + counter + " шагов!");

    }

}
