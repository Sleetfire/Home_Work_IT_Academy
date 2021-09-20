package game;

public class User {

    public void userPlay (Menu menu, int rings, int stems) {

        int counter = 0;

        GameField gameField = new GameField(rings, stems);

        gameField.startGame();

        do {

            int command = menu.selectUserCommand();

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

        }

    }





