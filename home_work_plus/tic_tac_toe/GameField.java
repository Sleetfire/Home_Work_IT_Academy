package home_work_plus.tic_tac_toe;

public class GameField {

    private int[][] field;

    public void createNewGameField(int size) {
        field = new int[size][size];
    }

    public void showGameField() {
        for (int[] ints : field) {
            System.out.println();
            for (int anInt : ints) {
                if (anInt == -1) {
                    System.out.print("o");
                } else if (anInt == 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

    private int getResult() {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int result = 0;
        int z = field.length - 1;
        int positiveCount = field.length;
        int negativeCount = -field.length;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                sum1 += field[i][j];
                sum2 += field[j][i];
            }
            if (sum1 == positiveCount || sum1 == negativeCount) {
                result = sum1;
                break;
            } else if (sum2 == positiveCount || sum2 == negativeCount) {
                result = sum2;
            }
            sum1 = 0;
            sum2 = 0;
            sum3 += field[i][i];
            sum4 += field[z][i];
            z--;

        }
        if (sum3 == positiveCount || sum3 == negativeCount) {
            result = sum3;
        } else if (sum4 == positiveCount || sum4 == negativeCount) {
            result = sum4;
        }
        return result;
    }

    public String getWinner() {
        String answer;
        if (getResult() == field.length) {
            answer = "Победили крестики";
        } else if (getResult() == -field.length) {
            answer = "Победили нолики";
        } else {
            answer = "Ничья";
        }
        return answer;
    }

    public boolean isGameOver() {
        return getResult() == field.length || getResult() == -field.length;
    }

    public boolean putToField (Point point, int team) {
        int x = point.getX();
        int y = point.getY();
        if (x >= field.length || x < 0 || y >= field.length || y < 0) {
            System.out.println("Выход за пределы поля!");
            return false;
        }
        if (field[x][y] != 1 && field[x][y] != -1) {
            field[x][y] = team;
            return true;
        } else {
            System.out.println("Занято!");
            return false;
        }
    }
}
