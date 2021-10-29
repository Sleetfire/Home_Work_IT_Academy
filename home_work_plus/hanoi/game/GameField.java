package home_work_plus.hanoi.game;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class GameField {

    private int[][] gameField;

    private int rings;

    private int stems;

    public GameField(int rings, int stems) {
        this.rings = rings;
        this.stems = stems;
    }

    public int[][] getGameField() {
        return gameField;
    }

    /**
     * Метод, который создает новое игровое поле
     */
    private void createNewGameField() {
        gameField = new int[rings][stems];
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (j == 0) {
                    gameField[i][j] = i + 1;
                } else {
                    gameField[i][j] = 0;
                }
            }
        }
    }

    /**
     * Метод, который печатает в консоль игровое поле
     */
    public void showGameField() {
        for (int[] ints : gameField) {
            System.out.println();
            for (int j = 0; j < ints.length; j++) {
                if (ints[j] == 0) {
                    System.out.print("*" + " ");
                } else System.out.print(ints[j] + " ");
            }
        }
        System.out.println();
        System.out.println();
    }

    /**
     * Метод, который начинает игру
     */
    public void startGame() {
        createNewGameField();
        showGameField();
    }

    /**
     * Метод, который удаляет кольцо с игрового поля
     * @param command команда, по которой происходит удаление
     */
    private void deleteRing(int command) {
        if (command == 1 || command == 2) {
            for (int i = 0; i < gameField.length; i++) {
                if (gameField[i][0] != 0) {
                    gameField[i][0] = 0;
                    return;
                }
            }
        } else if (command == 3 || command == 4) {
            for (int i = 0; i < gameField.length; i++) {
                if (gameField[i][1] != 0) {
                    gameField[i][1] = 0;
                    return;
                }
            }
        } else {
            for (int i = 0; i < gameField.length; i++) {
                if (gameField[i][2] != 0) {
                    gameField[i][2] = 0;
                    return;
                }
            }
        }
    }

    /**
     * Метод, который добавляет кольцо в игровое поле
     * @param command команда, по которой происходит добавление в игровое поле
     * @return true, если добавление произошло успешно, иначе false
     */
    public boolean addRing(int command) {
        int buf = 0;
        int stemFrom = 0;
        int stemTo = 0;
        switch (command) {
            case 1: {
                stemFrom = 0;
                stemTo = 1;
            }
            break;
            case 2: {
                stemFrom = 0;
                stemTo = 2;
            }
            break;
            case 3: {
                stemFrom = 1;
                stemTo = 0;
            }
            break;
            case 4: {
                stemFrom = 1;
                stemTo = 2;
            }
            break;
            case 5: {
                stemFrom = 2;
                stemTo = 0;
            }
            break;
            case 6: {
                stemFrom = 2;
                stemTo = 1;
            }
            break;
            default:
                System.out.println("Error");
        }
        for (int[] ints : gameField) {
            if (ints[stemFrom] != 0) {
                buf = ints[stemFrom];
                break;
            }
        }
        for (int i = gameField.length - 1; i >= 0; i--) {
            if (gameField[i][stemTo] == 0 && buf != 0) {
                gameField[i][stemTo] = buf;
                break;
            } else if (gameField[i][stemTo] > buf) {
                continue;
            } else {
                return false;
            }
        }
        deleteRing(command);
        return true;
    }

    /**
     * Метод, который проверяет завершена ли игра
     * @return
     */
    public boolean isWin() {
        return gameField[0][1] != 0 || gameField[0][2] != 0;
    }

    /**
     * Метод, который записывает результаты игры в файл
     * @param name имя игрока
     * @param counter счетчик количества шагов
     * @param filename название файла
     */
    public void writeInFile(String name, int counter, String filename) {
        try (BufferedWriter outWriter = new BufferedWriter(new FileWriter(filename, true))) {
            LocalDate date = LocalDate.now();
            String playerInfo = "Player: " + name;
            String countSteps = "Steps: " + counter;
            String dateInfo = "Date: " + date.getDayOfMonth() + " " + date.getMonth() + " " + date.getYear();
            outWriter.newLine();
            outWriter.write(playerInfo);
            outWriter.newLine();
            outWriter.write(countSteps);
            outWriter.newLine();
            outWriter.write(dateInfo);
            outWriter.newLine();
            for (int[] ints : gameField) {
                outWriter.newLine();
                for (int anInt : ints) {
                    if (anInt == 0) {
                        outWriter.write("*" + " ");
                    } else outWriter.write(anInt + " ");
                }
            }
            outWriter.newLine();
            outWriter.write("-------------------------");
            outWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
