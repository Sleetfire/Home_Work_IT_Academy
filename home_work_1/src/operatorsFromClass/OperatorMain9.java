package operatorsFromClass;

//Найти корни квадратного уравнения и вывести их на экран, если они есть.
//Если корней нет, то вывести сообщение об этом. Конкретное квадратное уравнение определяется коэффициентами a, b, c, которые вводит пользователь.

import java.util.Scanner;

public class OperatorMain9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите a");
        int a = scanner.nextInt();
        System.out.println("Введите b");
        int b = scanner.nextInt();
        System.out.println("Введите c");
        int c = scanner.nextInt();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            System.out.println((-b + Math.sqrt(d)) / (2 * a));
            System.out.println((-b - Math.sqrt(d)) / (2 * a));

        } else if (d == 0) System.out.println(-b / (2 * a));
        else System.out.println("Нет корней, так как дискриминант меньше нуля и равен: " + d);
    }

}
