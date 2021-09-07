package operatorsFromClass;

//Из двух случайных чисел, одно из которых четное, а другое нечетное, определить и вывести на экран нечетное число.

import java.util.Scanner;

public class OperatorMain1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();

        if (firstNumber % 2 == 0 && secondNumber % 2 == 0 || firstNumber % 2 != 0 && secondNumber % 2 != 0) {
            firstNumber++;
        }

        System.out.println("У нас есть следующие числа: " + firstNumber + " | " + secondNumber);

        if (firstNumber % 2 != 0) {

            System.out.println("Первое число нечетное и равно: " + firstNumber);

        } else {

            System.out.println("Так как первое число не является нечетным, выводим второе: " + secondNumber);

        }

    }

}
