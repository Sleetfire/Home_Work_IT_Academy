package gameplay;

public class PlayMain {

    public static void main(String[] args) {

        toPlay();

    }

    public static void toPlay() {

        User user = new User();
        RobotNoob robotNoob = new RobotNoob();
        RobotPro robotPro = new RobotPro();

        int gameMode = user.selectGameMode();

        if (gameMode == 1) {

            user.toUserPlay();

        } else {

            int robotMode = user.selectRobotMode();

            if (robotMode == 1) {

                robotPro.toRobotProPlay();

            } else {

                robotNoob.toRobotNoobPlay();

            }

        }

    }

}
