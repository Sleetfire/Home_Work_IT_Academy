package gameplay;

import java.util.Random;

public class RobotNoob {

    public int generateCommand () {

        Random random = new Random();

        int firstCommand = 1 + random.nextInt(5);

        return firstCommand;

    }

}
