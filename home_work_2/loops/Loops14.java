package home_work_2;

public class Loops14 {

    public static void main(String[] args) {

        long a = 1;

        try {

            while (true) {

                a *= 3;

                if (a >= Long.MAX_VALUE) break;

            }

        } catch (ArithmeticException e) {

            System.out.println("Максимальное значение числа типа long: " + Long.MAX_VALUE);
            System.out.println("Значение до переполнения: " + a / 3);
            System.out.println("Значение после переполнения: " + a);

        }

    }

}
