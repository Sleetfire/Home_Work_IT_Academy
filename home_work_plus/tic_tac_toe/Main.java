package home_work_plus.tic_tac_toe;

public class Main {
    public static void main(String[] args) {

        GameField field = new GameField();
        field.createNewGameField(3);
        field.showGameField();
        field.putToField(0, 0, 1);
        field.putToField(1, 0, 1);
        field.putToField(2, 0, 1);
        field.showGameField();


        field.putToField(2, 0, 1);
        field.showGameField();
        System.out.println();
        System.out.println(field.isGameOver());





    }
}
