package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryMain {

    public static void main(String[] args) {

        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(calculatorWithMathExtends);

        calculatorWithMemory.divide(28, 5);
        calculatorWithMemory.writeInMemory();
        calculatorWithMemory.getDegree(calculatorWithMemory.getMemory(), 2);
        calculatorWithMemory.writeInMemory();
        calculatorWithMemory.sum(4.1, calculatorWithMemory.getMemory());
        calculatorWithMemory.writeInMemory();
        calculatorWithMemory.sum(calculatorWithMemory.getMemory(), calculatorWithMemory.multiply(15, 7));
        calculatorWithMemory.writeInMemory();

        System.out.println(calculatorWithMemory.getMemory());
        System.out.println("Было выполнено " + calculatorWithMemory.getCountOperation() + " операций");

    }

}
