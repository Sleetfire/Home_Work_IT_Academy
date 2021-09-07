package operatorsFromClass;

//Вводится целое число, обозначающее код символа по таблице ASCII. Определить, это код английской буквы или какой-либо иной символ.

import java.util.Scanner;

public class OperatorMain5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int number = scanner.nextInt();

        if (number >= 65 && number <= 90 || number >= 97 && number <= 122)
            System.out.println("Это буква английского алфавита: " + Character.toString(number));
        else System.out.println("Это какой-то другой символ: " + Character.toString(number));

    }

}
