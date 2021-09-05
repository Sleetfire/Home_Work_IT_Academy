package operatorsFromClass;

//Вводятся два целых числа не равных нулю. Проверить делится ли первое на второе.
//Вывести на экран сообщение об этом, а также остаток (если он есть) и частное (в любом случае).

import java.util.Scanner;

public class OperatorMain3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        if (firstNumber % secondNumber == 0) System.out.println("Первое число делится на второе");
        else System.out.println("Первое число не делится на второе и его остаток равен: " + firstNumber % secondNumber);

        System.out.println("Частное равно: " + firstNumber / secondNumber);

    }

}
