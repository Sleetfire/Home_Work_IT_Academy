package home_work_plus.hanoi.game;

import java.util.Random;

public class Robot {

    /**
     * Метод, который реализует игру робота
     * @param menu меню с интерфейсом
     * @param rings количество колец
     * @param stems количество стержней
     */
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

    /**
     * Метод, который переворачивает команду (по алгоритму)
     * @param command команда
     * @return перевернутая команда
     */
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

    /**
     * Метод, который генерирует случайную команду
     * @return
     */
    public int generateCommand() {
        Random random = new Random();
        return 1 + random.nextInt(5);
    }

    /**
     * Метод, который реализует игру робота новичка
     * @param menu меню с интерфейсом
     * @param gameField игровое поле
     */
    public void robotNoobPlay(Menu menu, GameField gameField){
        int counter = 0;
        do {
            int command = generateCommand();
            boolean result = gameField.addRing(command);
            if (!result) {
                command = reverseCommand(command);
                gameField.addRing(command);
            }
            gameField.showGameField();
            counter++;
        } while (!gameField.isWin());
        menu.printResult(counter);
        gameField.writeInFile("RobotNoob", counter, "result.txt");
    }

    /**
     * Метод, который реализует игру робота профессионала
     * @param menu меню с интерфейсом
     * @param gameField игровое поле
     */
    public void robotProPlayer(Menu menu, GameField gameField){
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
        gameField.writeInFile("RobotPro", counter, "result.txt");
    }
}
