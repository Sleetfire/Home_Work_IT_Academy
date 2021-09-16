package gameplay;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {

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

    public static int selectNumberRings() {

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

    public int selectCommand() {

        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        do {

            System.out.println("Выберите откуда и куда вы хотите переместить диск: ");
            System.out.println("1 -->> 2 (1)   2 -->> 1 (3)   3 -->> 1 (5)");
            System.out.println("1 -->> 3 (2)   2 -->> 3 (4)   3 -->> 2 (6)");

            try {

                answer = scanner.nextInt();

            } catch (InputMismatchException e1) {

                System.err.println("Проверьте правильность ввода направления перемещения диска!");

                System.exit(0);

            }
        } while (answer < 1 || answer > 6);

        return answer;
    }

}
