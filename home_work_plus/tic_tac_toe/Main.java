package home_work_plus.tic_tac_toe;

import home_work_plus.tic_tac_toe.games.PersonGame;
import home_work_plus.tic_tac_toe.players.BotNoobPlayer;
import home_work_plus.tic_tac_toe.players.PersonPlayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PersonGame game = new PersonGame();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер поля:");
        int size = scanner.nextInt();
        System.out.println("Выберите вариант игры:");
        System.out.println(" 1 - человек против бота.");
        System.out.println(" 2 - человек против человека.");
        System.out.println(" 3 - бот против бота.");
        int variant = scanner.nextInt();
        switch (variant) {
            case 1: {
                game.play(new PersonPlayer(), new BotNoobPlayer(), size);
            }
            break;
            case 2: {
                game.play(new PersonPlayer(), new PersonPlayer(), size);
            }
            break;
            case 3: {
                game.play(new BotNoobPlayer(), new BotNoobPlayer(), size);
            }
            break;
            default: {
                System.err.println("DELETE THIS GAME!");
            }
        }


    }
}
