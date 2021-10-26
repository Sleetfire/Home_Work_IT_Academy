package home_work_2.loops;

//1.4.* Умножать число long a = 1; пока не произойдёт переполнение.
// В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:

//1.4.4. Да и вообще на любое целочисленное

import org.junit.jupiter.params.ParameterizedTest;

import java.util.Scanner;

public class Loops144n {

    public String doOverflow(long iterator) {
        long a = 1;
        long i = 0;

        if (iterator == 0 || iterator == 1) {
            return null;
        }
        System.out.println("Максимальное значение long: " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Минимальное значение long: " + Long.MIN_VALUE); // -9223372036854775808
        do {
            try {
                a = Math.multiplyExact(a, iterator);
            } catch (ArithmeticException e1) {
                System.out.println("Переполнение! Значение до переполнения: " + a);
                long value = a * iterator;
                System.out.println("Значение после переполнения: " + value);
                return "Переполнение! Значение до переполнения: " + a + "\n" + "Значение после переполнения: " + value;
            }
            i++;
        } while (i != Long.MAX_VALUE);
        return "" + iterator;
    }
}


