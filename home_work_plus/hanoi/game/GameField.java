package game;

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

    public void setGameField(int[][] gameField) {
        this.gameField = gameField;
    }

    public int getRings() {
        return rings;
    }

    public void setRings(int rings) {
        this.rings = rings;
    }

    public int getStems() {
        return stems;
    }

    public void setStems(int stems) {
        this.stems = stems;
    }

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

    public void showGameField() {

        for (int i = 0; i < gameField.length; i++) {

            System.out.println();

            for (int j = 0; j < gameField[i].length; j++) {

                if (gameField[i][j] == 0) {

                    System.out.print("*" + " ");

                } else System.out.print(gameField[i][j] + " ");

            }

        }

        System.out.println();
        System.out.println();

    }

    public void startGame() {

        createNewGameField();
        showGameField();

    }

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

        for (int i = 0; i < gameField.length; i++) {

            if (gameField[i][stemFrom] != 0) {

                buf = gameField[i][stemFrom];

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

    public boolean isWin() {

        if (gameField[0][1] != 0 || gameField[0][2] != 0) {

            return true;

        } else {

            return false;

        }

    }

    public void writeInFile(String name, int counter, String filename) throws IOException {

        BufferedWriter outWriter = new BufferedWriter(new FileWriter(filename, true));

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

        for (int i = 0; i < gameField.length; i++) {

            outWriter.newLine();

            for (int j = 0; j < gameField[i].length; j++) {

                if (gameField[i][j] == 0) {

                    outWriter.write("*" + " ");

                } else outWriter.write(gameField[i][j] + " ");

            }

        }

        outWriter.newLine();
        outWriter.write("-------------------------");
        outWriter.flush();
        outWriter.close();

    }

}
