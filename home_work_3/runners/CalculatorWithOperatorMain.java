package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        double operation1 = calculatorWithOperator.divide(28, 5);
        double operation2 = calculatorWithOperator.getDegree(operation1, 2);
        double operation3 = calculatorWithOperator.multiply(15, 7);
        double operation4 = calculatorWithOperator.sum(4.1, operation3);
        double operation5 = calculatorWithOperator.sum(operation4, operation2);
        System.out.println(operation5);
    }
}
