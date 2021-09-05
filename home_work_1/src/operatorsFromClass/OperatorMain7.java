package operatorsFromClass;

//По длинам трех отрезков, введенных пользователем, определить возможность существования треугольника, составленного из этих отрезков.
//Если такой треугольник существует, то определить, является ли он разносторонним, равнобедренным или равносторонним.

import java.util.Scanner;

public class OperatorMain7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую сторону");
        int sideA = scanner.nextInt();
        System.out.println("Введите вторую сторону");
        int sideB = scanner.nextInt();
        System.out.println("Введите третью сторону");
        int sideC = scanner.nextInt();

        if (sideA >= sideB + sideC || sideB >= sideA + sideC || sideC >= sideA + sideB) {
            System.out.println("Эти линии не могут быть треугольником");
        } else if (sideA == sideB && sideC == sideB) System.out.println("Треугольник равносторонний");
        else if (sideA == sideB || sideA == sideC || sideB == sideC) System.out.println("Треугольник равнобедренный");
        else System.out.println("Треугольник разносторонний");
    }


}



