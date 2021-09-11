package home_work_2.loops;

//1.2. Все цифры из числа введенного через аргумент к исполняемой программе перемножить между собой и вывести ход вычислений в консоль.
//Пользователь обязан ввести целое число. Если ввели не целое, то выдать сообщение о том что пользователь ввёл некорректные данные.
//1.2.1 Пример: Ввели 181232375, должно получиться в консоли: 1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10 080
//1.2.2 Пример: Ввели 99.2, должно получиться в консоли: Введено не целое число
//1.2.3 Пример: Ввели Привет, должно получиться в консоли: Введено не число

public class Loops12 {

    public static void main(String[] args) {

        String argument = args[0];

        int number;

        int result = 1;

        String str = "";

        try {

            number = Integer.parseInt(argument);

        } catch (NumberFormatException e1) {

            try {

                double doubleNumber = Double.parseDouble(argument);

                System.out.println("Введено не целое число: " + doubleNumber);

                return;

            } catch (NumberFormatException e2) {

                System.out.println("Введено не число: " + argument);

                return;

            }

        }

        while (number > 0) {

            int figure = number % 10;

            try {

                result = Math.multiplyExact(result, figure);

            } catch (ArithmeticException e1) {

                System.out.println("Переполнение!");
                return;

            }

            str += " * " + (number % 10);

            number /= 10;

        }

        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.setCharAt(1, '=');

        stringBuilder.reverse();

        str = stringBuilder.toString() + result;

        System.out.println(str);

    }

}
