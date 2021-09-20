package game;

import java.util.Random;

public class Robot {

    public void robotPlay(Menu menu, int rings, int stems) {

        int robotMode = menu.selectRobotMode();

        GameField gameField = new GameField(rings, stems);

        gameField.startGame();

        if (robotMode == 1) {

            robotProPlayer(menu, gameField);

        } else {

            robotNoobPlay(menu, gameField);

        }

    }


    public int reverseCommand(int command) {

        switch (command) {

            case 1:
                command = 3;
                break;

            case 2:
                command = 5;
                break;

            case 3:
                command = 1;
                break;

            case 4:
                command = 6;
                break;

            case 5:
                command = 2;
                break;

            case 6:
                command = 4;
                break;

            default:
                command = 1;

        }

        return command;

    }

    public int generateCommand() {

        Random random = new Random();

        return 1 + random.nextInt(5);

    }

    public void robotNoobPlay(Menu menu, GameField gameField) {

        int counter = 0;

        do {

            int command = generateCommand();

            boolean result = gameField.addRing(command);

            if (result) {

                gameField.showGameField();

                counter++;

            } else {

                command = reverseCommand(command);
                gameField.addRing(command);
                gameField.showGameField();
                counter++;

            }

        } while (!gameField.isWin());

        menu.printResult(counter);

    }

    public void robotProPlayer(Menu menu, GameField gameField) {

        int counter = 0;

        do {

            if (gameField.getGameField().length % 2 == 0) {

                int command = 1;
                boolean result = gameField.addRing(command);
                if (!result) {
                    command = reverseCommand(command);
                    gameField.addRing(command);
                }
                counter++;
                gameField.showGameField();
                if (gameField.isWin()) break;

                command = 2;
                result = gameField.addRing(command);
                if (!result) {
                    command = reverseCommand(command);
                    gameField.addRing(command);
                }
                counter++;
                gameField.showGameField();
                if (gameField.isWin()) break;

                command = 4;
                result = gameField.addRing(command);
                if (!result) {
                    command = reverseCommand(command);
                    gameField.addRing(command);
                }
                counter++;
                gameField.showGameField();
                if (gameField.isWin()) break;

            } else {

                int command = 2;
                boolean result = gameField.addRing(command);
                if (!result) {
                    command = reverseCommand(command);
                    gameField.addRing(command);
                }
                counter++;
                gameField.showGameField();
                if (gameField.isWin()) break;

                command = 1;
                result = gameField.addRing(command);
                if (!result) {
                    command = reverseCommand(command);
                    gameField.addRing(command);
                }
                counter++;
                gameField.showGameField();
                if (gameField.isWin()) break;

                command = 4;
                result = gameField.addRing(command);
                if (!result) {
                    command = reverseCommand(command);
                    gameField.addRing(command);
                }
                counter++;
                gameField.showGameField();
                if (gameField.isWin()) break;

            }

        } while (true);

        menu.printResult(counter);

    }


}
