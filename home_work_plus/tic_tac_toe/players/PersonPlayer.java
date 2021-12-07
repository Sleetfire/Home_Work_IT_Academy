package home_work_plus.tic_tac_toe.players;

import home_work_plus.tic_tac_toe.GameField;
import home_work_plus.tic_tac_toe.Point;
import home_work_plus.tic_tac_toe.api.IPlayer;

import java.util.Scanner;

public class PersonPlayer implements IPlayer{


    @Override
    public Point doStep(int fieldSize) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x:");
        int x = scanner.nextInt();
        System.out.println("Input y:");
        int y = scanner.nextInt();
        return new Point(x, y);
    }
}
