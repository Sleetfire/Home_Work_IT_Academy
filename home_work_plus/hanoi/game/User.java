package game;

import java.io.IOException;

public class User {

    public void userPlay(Menu menu, int rings, int stems) throws IOException {

        int counter = 0;

        GameField gameField = new GameField(rings, stems);

        gameField.startGame();

        do {

            int command = menu.selectUserCommand(gameField, counter);

            boolean result = gameField.addRing(command);

            if (result) {

                gameField.showGameField();

                counter++;

            } else {

                System.err.println("Так ходить нельзя!");
                gameField.showGameField();

            }

        } while (!gameField.isWin());

        gameField.showGameField();

        menu.printResult(counter);

        menu.toExitGame(gameField, counter);


    }

}





