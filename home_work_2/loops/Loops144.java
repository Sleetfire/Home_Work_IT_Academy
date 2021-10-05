package home_work_2.loops;

//1.4.* Умножать число long a = 1; пока не произойдёт переполнение.
// В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:

//1.4.4. Да и вообще на любое целочисленное

import java.util.InputMismatchException;
import java.util.Scanner;

public class Loops144 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = 1;
        long i = 0;
        long iterator;
        System.out.println("Введите любое целочисленное число: ");
        try {
            iterator = scanner.nextLong();
        } catch (InputMismatchException e1) {
            System.out.println("Вы ввели некорректное число!");
            return;
        }
        System.out.println("Максимальное значение long: " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Минимальное значение long: " + Long.MIN_VALUE); // -9223372036854775808
        while (true) {
            try {
                a = Math.multiplyExact(a, iterator);
            } catch (ArithmeticException e1) {
                System.out.println("Переполнение! Значение до переполнения: " + a);
                long value = a * iterator;
                System.out.println("Значение после переполнения: " + value);
                return;
            }
            i++;
            if (i == Long.MAX_VALUE) break; // чтобы не выдавало предупреждение про бесконечный цикл
        }
    }
}


