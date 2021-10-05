package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper = new CalculatorWithCounterAutoSuper();
        double operation1 = calculatorWithCounterAutoSuper.divide(28, 5);
        double operation2 = calculatorWithCounterAutoSuper.getDegree(operation1, 2);
        double operation3 = calculatorWithCounterAutoSuper.multiply(15, 7);
        double operation4 = calculatorWithCounterAutoSuper.sum(4.1, operation3);
        double operation5 = calculatorWithCounterAutoSuper.sum(operation4, operation2);
        System.out.println(operation5);
        System.out.println("Было выполнено " + calculatorWithCounterAutoSuper.getCountOperation() + " операций");
    }
}
