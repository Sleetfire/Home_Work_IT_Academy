package home_work_plus.tic_tac_toe.players;

import home_work_plus.tic_tac_toe.Point;
import home_work_plus.tic_tac_toe.api.IPlayer;

import java.util.concurrent.ThreadLocalRandom;

public class BotNoobPlayer implements IPlayer {
    @Override
    public Point doStep(int fieldSize) {
        int x = ThreadLocalRandom.current().nextInt(fieldSize);
        int y = ThreadLocalRandom.current().nextInt(fieldSize);
        return new Point(x, y);
    }
}
