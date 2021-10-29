package home_work_plus.hanoi.game;

public class Game {
    public static void main(String[] args) {
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


