package home_work_2.loops;

//1.1. Перемножить числа от 1 до числа (включительно) введенного через аргумент к исполняемой программе.
//Есть нюанс с переполнением, можно добавить проверки и сообщения пользователю. Пример: Ввели 5,
//должно получиться в консоли: 1 * 2 * 3 * 4 * 5 = ответ

//1.1.1. Используя только цикл

public class Loops11n {

    public String multiplying(String arg) {
        int iterator = 1;
        try {
            iterator = Integer.parseInt(arg);
            if (iterator == 0) {
                System.out.println("Вы ввели 0!");
                return "0";
            }

        } catch (NumberFormatException e1) {
            System.out.println("Неправильный формат числа!");
            return null;
        }
        long result = 1;
        String str = "";
        for (int i = 1; i <= iterator; i++) {
            try {
                result = Math.multiplyExact(result, i);
            } catch (ArithmeticException e1) {
                System.out.println("Переполнение!");
                return null;
            }
            if (i == iterator) {
                str += i + " = " + result;
            } else str += i + " * ";
        }
       return str;
    }

    //    1.1.2.* Используя рекурсию
    public long factorial(int iterator) {
        if (iterator <= 0) {
            return 0;
        }
        String str = "";
        if (iterator != 1) {
            str += iterator + " * ";
        } else {
            str += iterator + " = ";
        }
        System.out.print(str);
        if (iterator == 1) {
            return 1;
        }
        return iterator * factorial(iterator - 1);
    }
}

