package home_work_1.seventhTask;

//7.** Создать СТАТИЧЕСКИЙ метод String toBinaryString(byte number) и возвращает двоичное представление числа. В методе можно использовать только
//        обычную математику которая описана в теории. Если число отрицательное, то вернуть дополнительный код.
//        Теория https://planetcalc.ru/747. Пример:
//        7.1 Вводим: 42.  Возвращает: 00101010
//        7.2 Вводим: 15.  Возвращает: 00001111
//        7.3 Вводим: -42. Возвращает: 11010110
//        7.4 Вводим: -15. Возвращает: 11110001

// Код выглядит отвратительно, но работает.

public class BinaryString {

    public static void main(String[] args) {

        System.out.println("Десятичное число: " + 42 + " | " + "Двоичное число: " + toBinaryString((byte) 42)); // Десятичное число: 42 | Двоичное число: 00101010
        System.out.println("Десятичное число: " + -42 + " | " + "Двоичное число (доп. код): " + toBinaryString((byte) -42)); // Десятичное число: -42 | Двоичное число (доп. код): 11010110
        System.out.println("Десятичное число: " + 15 + " | " + "Двоичное число: " + toBinaryString((byte) 15)); // Десятичное число: 15 | Двоичное число: 00001111
        System.out.println("Десятичное число: " + -15 + " | " + "Двоичное число (доп. код): " + toBinaryString((byte) -15)); // Десятичное число: -15 | Двоичное число (доп. код): 11110001
        System.out.println("Десятичное число: " + 127 + " | " + "Двоичное число: " + toBinaryString((byte) 127)); // Десятичное число: 127 | Двоичное число: 01111111
        System.out.println("Десятичное число: " + -128 + " | " + "Двоичное число (доп. код): " + toBinaryString((byte) -128)); // Десятичное число: -128 | Двоичное число (доп. код): 10000000

    }

    public static String toBinaryString(byte number) {

        if (number > 0) { // записываем остаток от деления в строку, а потом переворачиваем ее

            String str = "";

            while (number != 0) {

                str += number % 2;
                number /= 2;

            }

            StringBuilder stringBuilder = new StringBuilder(str);
            str = stringBuilder.reverse().toString();

            switch (str.length()) { // используется, чтобы лучше воспринимался ответ, но нуль слева не влияет на значение числа

                case 1:
                    str = "0000000" + str;
                    break;
                case 2:
                    str = "000000" + str;
                    break;
                case 3:
                    str = "00000" + str;
                    break;
                case 4:
                    str = "0000" + str;
                    break;
                case 5:
                    str = "000" + str;
                    break;
                case 6:
                    str = "00" + str;
                    break;
                case 7:
                    str = "0" + str;
                    break;
                default:
                    return str;
            }

            return str;

        } else if (number < 0) { // Сначала перевожу в прямой код и автоматически делают инверсию. После чего добавляю единицу к младшему биту

            number = (byte) Math.abs(number);

            String str = "";
            while (number != 0) {

                if (number % 2 == 0) str += 1;
                else str += 0;

                number /= 2;

            }

            StringBuilder stringBuilder = new StringBuilder(str);

            int counter = 1;

            for (int i = 0; i < stringBuilder.length(); i++) {

                if (stringBuilder.charAt(i) == '0' && counter == 1) {
                    stringBuilder.setCharAt(i, '1');
                    counter--;
                } else if (stringBuilder.charAt(i) == '1' && counter == 1) {
                    stringBuilder.setCharAt(i, '0');
                }
            }

            str = stringBuilder.reverse().toString();

            switch (str.length()) {  // используется, чтобы лучше воспринимался ответ

                case 1:
                    str = "1111111" + str;
                    break;
                case 2:
                    str = "111111" + str;
                    break;
                case 3:
                    str = "11111" + str;
                    break;
                case 4:
                    str = "1111" + str;
                    break;
                case 5:
                    str = "111" + str;
                    break;
                case 6:
                    str = "11" + str;
                    break;
                case 7:
                    str = "1" + str;
                    break;
                default:
                    return str;
            }

            return str;

        } else return null;

    }

}
