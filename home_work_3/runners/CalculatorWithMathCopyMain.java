package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        double operation1 = calculatorWithMathCopy.divide(28, 5);
        double operation2 = calculatorWithMathCopy.getDegree(operation1, 2);
        double operation3 = calculatorWithMathCopy.multiply(15, 7);
        double operation4 = calculatorWithMathCopy.sum(4.1, operation3);
        double operation5 = calculatorWithMathCopy.sum(operation4, operation2);
        System.out.println(operation5);
    }
}
