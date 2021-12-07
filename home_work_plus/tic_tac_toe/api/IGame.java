package home_work_plus.tic_tac_toe.api;

import home_work_plus.tic_tac_toe.GameField;

import java.util.Scanner;

public interface IGame {

    void play (IPlayer player1, IPlayer player2, int gameFieldSize);

    default void doStep(IPlayer player, GameField field, int gameFieldSize, int team) {
        boolean canPut;
        do {
            System.out.println();
            canPut = field.putToField(player.doStep(gameFieldSize), team);
            System.out.println();
        } while (!canPut);
        field.showGameField();
    }

    default int chooseTeam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input team for first player: -1 or 1");
        return scanner.nextInt();
    }
}
