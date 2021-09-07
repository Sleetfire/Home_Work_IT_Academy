package fifthTask;

//5.1 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if

import java.util.Scanner;

public class OperatorIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        if (name.equals("Вася")) {
            System.out.println("Привет!" + '\n' + "Я тебя так долго ждал");
            return;
        }

        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
            return;
        }

        System.out.println("Добрый день, а вы кто?");

    }

}
