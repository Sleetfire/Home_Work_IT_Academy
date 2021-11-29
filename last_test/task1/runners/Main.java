package last_test.task1.runners;

import last_test.task1.number_generators.IntegerNumberGenerator;

public class Main {
    public static void main(String[] args) {

        IntegerNumberGenerator generator = new IntegerNumberGenerator();
        int numberA = generator.generateRandomNumber(100);
        int numberB = generator.generateRandomNumber(100);
        int numberC = generator.generateRandomNumber(100);

        System.out.println("Число А равно: " + numberA);
        System.out.println("Число B равно: " + numberB);
        System.out.println("Число C равно: " + numberC);

        if(numberA > numberB && numberA > numberC) {
            System.out.println("Сумма чисел A и C: " + (numberA + numberC));
        } else {
            System.out.println("Число B: " + numberB);
        }

        double middle = (numberA + numberB + numberC) / 3.;
        System.out.println("Среднее арифметическое равно: " + middle);
    }
}
