package operatorsFromClass;

//Вводятся координаты (x;y) точки и радиус круга (r).
//Определить принадлежит ли данная точка кругу, если его центр находится в начале координат.

//Точка представляет собой радиус-вектор из начала координат. Находим его модуль и сравниваем с длиной вектора. Если вектор больше,
//То точка внутри круга, если нет, тогда точка находится за пределами круга. Если они равны, тогда точка лежит на окружности.

import java.util.Scanner;

public class OperatorMain8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите x");
        int x = scanner.nextInt();
        System.out.println("Введите y");
        int y = scanner.nextInt();
        System.out.println("Введите r");
        int r = scanner.nextInt();

        if (r > Math.sqrt(x * x + y * y)) System.out.println("Точка внутри круга!");
        else if (r == Math.sqrt(x * x + y * y)) System.out.println("Точка лежит на окружности!");
        else System.out.println("Точка вне круга!");

    }

}
