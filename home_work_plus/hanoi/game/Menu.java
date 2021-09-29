package game;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public int selectGameMode() {

        Scanner scanner = new Scanner(System.in);

        int gameMode = 0;

        do {

            System.out.println("Выберите режим игры! \n1 - Ручной режим \n2 - Автоматический режим");

            try {

                gameMode = scanner.nextInt();

            } catch (InputMismatchException e1) {

                System.err.println("Проверьте правильность ввода режима игры!");

                System.exit(0);

            }

        } while (gameMode != 1 && gameMode != 2);

        return gameMode;

    }

    public int selectRings() {

        Scanner scanner = new Scanner(System.in);

        int rings = 0;

        do {

            System.out.println("Введите количество колец от 3 до 8:");

            try {

                rings = scanner.nextInt();

            } catch (InputMismatchException e1) {

                System.err.println("Проверьте правильность ввода количества колец!");

                System.exit(0);

            }

        } while (rings < 3 || rings > 8);

        return rings;
    }

    public int selectUserCommand(GameField gameField, int counter) throws IOException {

        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        do {

            System.out.println("Выберите откуда и куда вы хотите переместить диск: ");
            System.out.println("1 -->> 2 (1)   2 -->> 1 (3)   3 -->> 1 (5)");
            System.out.println("1 -->> 3 (2)   2 -->> 3 (4)   3 -->> 2 (6)");
            System.out.println("Чтобы покинуть игру, введите не цифру!");

            try {

                answer = scanner.nextInt();

            } catch (InputMismatchException e1) {

                toExitGame(gameField, counter);

            }

        } while (answer < 1 || answer > 6);

        return answer;

    }

    public void toExitGame (GameField gameField, int counter) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.err.println("Хотите сохранить игру?\n1 - Да\n2 - Нет");

        try {

            int result = scanner.nextInt();

            if (result == 1) {

                System.out.println("Введите ваше имя:");
                String name = scanner.next();

                gameField.writeInFile(name, counter,"result.txt");

            } else {

                System.err.println("Игра завершена без сохранений");

            }
            System.exit(0);

        } catch (InputMismatchException e1) {

            System.err.println("Вы даже это не смогли нормально сделать!");
            System.exit(0);

        }

    }

    public int selectRobotMode() {

        Scanner scanner = new Scanner(System.in);

        int robotMode = 0;

        do {

            System.out.println("Выберите режим игры робота: \n1 - Робот умеет играть в эту игру \n2 - Робот полный нубас");

            try {

                robotMode = scanner.nextInt();

            } catch (InputMismatchException e1) {

                System.err.println("Проверьте правильность ввода режима игры робота!");

                System.exit(0);

            }

        } while (robotMode < 1 || robotMode > 2);

        return robotMode;

    }

    public void printResult (int counter) {

        System.out.println("Вы победили! ");
        System.out.println("Было произведено " + counter + " шагов!");

    }

}
