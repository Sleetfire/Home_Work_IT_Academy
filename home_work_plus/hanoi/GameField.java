package gameplay;


import static gameplay.User.selectNumberRings;

public class GameField {

    public int[][] createNewGameField() {

        int numberRings = selectNumberRings();

        int numberStem = 3;

        int[][] gameField = new int[numberRings][numberStem];

        for (int i = 0; i < gameField.length; i++) {

            for (int j = 0; j < gameField[i].length; j++) {

                if (j == 0) {

                    gameField[i][j] = i + 1;

                } else {

                    gameField[i][j] = 0;

                }
            }
        }

        return gameField;

    }

    public void showGameField(int[][] gameField) {

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

    public int[][] addRing(int[][] gameField, int command) {

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

            if (gameField[i][stemTo] == 0) {

                gameField[i][stemTo] = buf;
                break;

            } else if (gameField[i][stemTo] > buf) {

                continue;

            } else {

                System.err.println("Ход не подходит!");

                return gameField;

            }

        }

        deleteRing(gameField, command);

        return gameField;
    }

    public int[][] deleteRing(int[][] gameField, int command) {

        if (command == 1 || command == 2) {

            for (int i = 0; i < gameField.length; i++) {

                if (gameField[i][0] != 0) {

                    gameField[i][0] = 0;

                    return gameField;

                }

            }

        } else if (command == 3 || command == 4) {

            for (int i = 0; i < gameField.length; i++) {

                if (gameField[i][1] != 0) {

                    gameField[i][1] = 0;

                    return gameField;

                }

            }

        } else {

            for (int i = 0; i < gameField.length; i++) {

                if (gameField[i][2] != 0) {

                    gameField[i][2] = 0;

                    return gameField;

                }

            }

        }

        return gameField;
    }

    public boolean isWin(int[][] gameField) {

        if (gameField[0][1] != 0 || gameField[0][2] != 0) {

            return true;

        } else {

            return false;
            
        }

    }

    public int[][] addRobotRing(int[][] gameField, int command) {

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

                command = reverseCommand(command);

                gameField = addRing(gameField, command);

                return gameField;

            }

        }

        deleteRing(gameField, command);

        return gameField;
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


}
