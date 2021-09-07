package operatorsFromClass;

//Определить, является ли год, который ввел пользователем, високосным или невисокосным.

import java.util.Scanner;

public class OperatorMain6 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год");
        int year = scanner.nextInt();

        System.out.println("Является ли високосным год? " + (year % 4 == 0 ? true : false));

    }

}
