package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();

        double operation1 = calculatorWithMathExtends.divide(28, 5);
        double operation2 = calculatorWithMathExtends.getDegree(operation1, 2);
        double operation3 = calculatorWithMathExtends.multiply(15, 7);
        double operation4 = calculatorWithMathExtends.sum(4.1, operation3);
        double operation5 = calculatorWithMathExtends.sum(operation4, operation2);

        System.out.println(operation5);

    }
}
