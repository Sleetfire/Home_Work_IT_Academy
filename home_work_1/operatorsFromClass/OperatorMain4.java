package operatorsFromClass;

//Перевести число, введенное пользователем, в байты или килобайты в зависимости от его выбора.

import java.util.Scanner;

public class OperatorMain4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Если хотите сделать перевод из килобайт в байты, тогда выберите 'b', если из байт в килобайты, тогда выберите 'k'");
        String str = scanner.nextLine();

        if (str.equalsIgnoreCase("b")) {
            System.out.println("Введите значение килобайт, которые хотите перевести");
            int b = scanner.nextInt();
            System.out.println(b * 1024 + " байт");

        } else if (str.equalsIgnoreCase("k")) {
            System.out.println("Введите значение байт, которые хотите перевести");
            int b = scanner.nextInt();
            System.out.println(b / 1024.0 + " килобайт");

        } else System.out.println("Вы ввели некорректную букву!");

    }

}
