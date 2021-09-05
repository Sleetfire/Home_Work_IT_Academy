package fifthTask;

//5.3 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи switch

import java.util.Scanner;

public class OperatorSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        switch (name) {

            case "Вася":
                System.out.println("Привет!" + '\n' + "Я тебя так долго ждал");
                break;

            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;

            default:
                System.out.println("Добрый день, а вы кто?");

        }

    }

}
