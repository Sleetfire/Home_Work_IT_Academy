package game;

import java.io.IOException;

public class Game {
    public static void main(String[] args) throws IOException {

    Menu menu = new Menu();

    int gameMode = menu.selectGameMode();

    int rings = menu.selectRings();

    if (gameMode == 1) {

        User user = new User();

        user.userPlay(menu, rings, 3);

    } else {

        Robot robot = new Robot();

        robot.robotPlay(menu, rings, 3);

    }

    }

    }


