package home_work_2;

// 1.3. Возведение в степень. Через консоль пользователь вводит два числа. Первое число это число которое мы будем возводить.
//Второе число это степень в которую возводят первое число. Степень - только положительная и целая.
//Возводимое число - может быть отрицательным и оно будет дробным. Math использовать нельзя.
//1.3.1 Пример: Ввели 18 и 5, должно получиться в консоли: 18.0 ^ 5 = 1 889 568.0
//1.3.2 Пример: Ввели 7.5 и 2, должно получиться в консоли: 7.5 ^ 2 = 56.25

public class Loops13 {

    public static void main(String[] args) {

        double number = 0;

        int degree = 0;

        try {

            number = Double.parseDouble(args[0]);

        } catch (NumberFormatException e0) {

            System.out.println("Вы ввели не число!");

            return;

        }

        try {

            degree = Integer.parseInt(args[1]);

            if (degree <= 0) {
                System.out.println("Степень не положительная!");

                return;
            }

        } catch (NumberFormatException e1) {

            try {

                double doubleDegree = Double.parseDouble(args[1]);

                System.out.println("Степень дробная!");

                return;

            } catch (NumberFormatException e2) {

                System.out.println("Степень не является числом!");

                return;

            }

        }

        for (int i = 1; i < degree; i++) {

            number *= number;

        }

        System.out.println(args[0] + " ^ " + args[1] + " = " + number);

    }
}
