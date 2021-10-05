package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();
        double operation1 = calculatorWithCounterClassic.divide(28, 5);
        calculatorWithCounterClassic.incrementCountOperation();
        double operation2 = calculatorWithCounterClassic.getDegree(operation1, 2);
        calculatorWithCounterClassic.incrementCountOperation();
        double operation3 = calculatorWithCounterClassic.multiply(15, 7);
        calculatorWithCounterClassic.incrementCountOperation();
        double operation4 = calculatorWithCounterClassic.sum(4.1, operation3);
        calculatorWithCounterClassic.incrementCountOperation();
        double operation5 = calculatorWithCounterClassic.sum(operation4, operation2);
        calculatorWithCounterClassic.incrementCountOperation();
        System.out.println(operation5);
        System.out.println("Было выполнено " + calculatorWithCounterClassic.getCountOperation() + " операций");
    }
}
