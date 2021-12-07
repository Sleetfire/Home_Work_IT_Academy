package home_work_plus.tic_tac_toe.games;

import home_work_plus.tic_tac_toe.GameField;
import home_work_plus.tic_tac_toe.api.IGame;
import home_work_plus.tic_tac_toe.api.IPlayer;

public class PersonGame implements IGame {

    @Override
    public void play(IPlayer player1, IPlayer player2, int gameFieldSize) {
        GameField field = new GameField();
        field.createNewGameField(gameFieldSize);
        int team = chooseTeam();

        if (team == 1) {
            do {
                doStep(player1, field, gameFieldSize, team);
                doStep(player2, field, gameFieldSize, -team);
            } while (!field.isGameOver());
        } else {
            do {
                doStep(player2, field, gameFieldSize, -team);
                doStep(player1, field, gameFieldSize, team);
            } while (!field.isGameOver());
        }
        System.out.println();
        System.out.println(field.getWinner());
    }

    @Override
    public void doStep(IPlayer player, GameField field, int gameFieldSize, int team) {
        IGame.super.doStep(player, field, gameFieldSize, team);
    }

    @Override
    public int chooseTeam() {
        return IGame.super.chooseTeam();
    }
}
