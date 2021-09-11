package home_work_2.loops;

//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5,
//должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ


//1.1.1. Используя только цикл

public class Loops11 {

    public static void main(String[] args) {

        int iterator = 1;

        try {

            iterator = Integer.parseInt(args[0]);

            if (iterator == 0) {

                System.out.println("Вы ввели 0!");
                return;

            }

        } catch (NumberFormatException e1) {

            System.out.println("Неправильный формат числа!");
            return;

        }

        long result = 1;
        String str = "";

        for (int i = 1; i <= iterator; i++) {

            try {

                result = Math.multiplyExact(result, i);

            } catch (ArithmeticException e1) {

                System.out.println("Переполнение!");
                return;

            }

            if (i == iterator) {

                str += i + " = " + result;

            } else str += i + " * ";

        }

        System.out.println("Результат с использованием циклов: ");

        System.out.println(str);

        long factorialResult = factorial(iterator);

        System.out.println('\n' + "Результат с использованием рекурсии: " + factorialResult);

    }

//    1.1.2.* Используя рекурсию
    public static long factorial(int iterator) {

        String str = "";

        if (iterator == 1) {

            return 1;

        }

        return iterator * factorial(iterator - 1);

    }

}
