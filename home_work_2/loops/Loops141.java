package home_work_2.loops;

//1.4.* Умножать число long a = 1; пока не произойдёт переполнение. В конце в консоль вывести сообщение со значением до переполнения и после переполнения. Умножать на:
//1.4.1. 3

public class Loops141 {

    public static void main(String[] args) {

        long a = 1;
        long iterator = 3;
        long i = 0;
        System.out.println("Максимальное значение long: " + Long.MAX_VALUE); // 9223372036854775807
        System.out.println("Минимальное значение long: " + Long.MIN_VALUE); // -9223372036854775808
        while (true) {
            try {
                a = Math.multiplyExact(a, iterator);
            } catch (ArithmeticException e1) {
                System.out.println("Переполнение! Значение до переполнения: " + a); // 4052555153018976267
                long value = a * iterator;
                System.out.println("Значение после переполнения: " + value); // -6289078614652622815
                return;
            }
            i++;
            if (i == Long.MAX_VALUE) break; // чтобы не выдавало предупреждение про бесконечный цикл
        }
    }
}
