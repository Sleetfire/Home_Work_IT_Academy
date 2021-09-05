package fifthTask;

//5.2 Написать в отдельном классе в отдельном main код который будет выполнять общее условие при помощи if else if

import java.util.Scanner;

public class OperatorIfElseIf {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        if (name.equals("Вася")) {
            System.out.println("Привет!" + '\n' + "Я тебя так долго ждал");

        } else if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");

        } else System.out.println("Добрый день, а вы кто?");

    }

}
