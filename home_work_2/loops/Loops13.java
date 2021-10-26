package home_work_2.loops;

// 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить.
//Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
//Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loops13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        int degree = 0;
        System.out.println("Введите число, если дробное, использовать ',' вместо '.' ");
        try {
            number = scanner.nextDouble();
        } catch (InputMismatchException e1) {
            System.out.println("Вы ввели не число!");
            return;
        }
        double result = number;
        System.out.println("Введите степень числа");
        try {
            degree = scanner.nextInt();
            if (degree < 0) {
                System.out.println("Вы ввели отрицательную степень!");
                return;
            }
        } catch (InputMismatchException e2) {
            System.out.println("Вы ввели некорректное число!");
            return;
        }
        if (degree == 0) {
            System.out.println(number + " ^ " + degree + " = 1" );
            return;
        }


        System.out.println(number + " ^ " + degree + " = " + result);
    }
}
