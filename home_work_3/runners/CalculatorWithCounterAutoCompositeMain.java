package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeMain {
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        System.out.println("------------CalculatorWithOperator------------");
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite1 = new CalculatorWithCounterAutoComposite(calculatorWithOperator);
        double operation1 = calculatorWithCounterAutoComposite1.divide(28, 5);
        double operation2 = calculatorWithCounterAutoComposite1.getDegree(operation1, 2);
        double operation3 = calculatorWithCounterAutoComposite1.multiply(15, 7);
        double operation4 = calculatorWithCounterAutoComposite1.sum(4.1, operation3);
        double operation5 = calculatorWithCounterAutoComposite1.sum(operation4, operation2);
        System.out.println(operation5);
        System.out.println("Было выполнено " + calculatorWithCounterAutoComposite1.getCountOperation() + " операций");
        System.out.println("------------CalculatorWithMathCopy------------");
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite2 = new CalculatorWithCounterAutoComposite(calculatorWithMathCopy);
        operation1 = calculatorWithCounterAutoComposite2.divide(28, 5);
        operation2 = calculatorWithCounterAutoComposite2.getDegree(operation1, 2);
        operation3 = calculatorWithCounterAutoComposite2.multiply(15, 7);
        operation4 = calculatorWithCounterAutoComposite2.sum(4.1, operation3);
        operation5 = calculatorWithCounterAutoComposite2.sum(operation4, operation2);
        System.out.println(operation5);
        System.out.println("Было выполнено " + calculatorWithCounterAutoComposite2.getCountOperation() + " операций");
        System.out.println("------------CalculatorWithMathExtends------------");
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite3 = new CalculatorWithCounterAutoComposite(calculatorWithMathExtends);
        operation1 = calculatorWithCounterAutoComposite3.divide(28, 5);
        operation2 = calculatorWithCounterAutoComposite3.getDegree(operation1, 2);
        operation3 = calculatorWithCounterAutoComposite3.multiply(15, 7);
        operation4 = calculatorWithCounterAutoComposite3.sum(4.1, operation3);
        operation5 = calculatorWithCounterAutoComposite3.sum(operation4, operation2);
        System.out.println(operation5);
        System.out.println("Было выполнено " + calculatorWithCounterAutoComposite3.getCountOperation() + " операций");
    }
}
