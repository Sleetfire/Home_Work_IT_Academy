package operatorsFromClass;

//Вводятся три разных числа. Найти, какое из них является средним (больше одного, но меньше другого).

import java.util.Scanner;

public class OperatorMain2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите третье число");
        int thirdNumber = scanner.nextInt();

        if ((firstNumber == secondNumber && secondNumber == thirdNumber)) {
            System.out.println("Числа равны!");
            return;
        }

        if ((firstNumber > secondNumber && firstNumber < thirdNumber) || (firstNumber < secondNumber && firstNumber > thirdNumber))
            System.out.println(firstNumber);
        else if ((secondNumber > firstNumber && secondNumber < thirdNumber) || (secondNumber < firstNumber && secondNumber > thirdNumber))
            System.out.println(secondNumber);
        else System.out.println(thirdNumber);

    }

}
