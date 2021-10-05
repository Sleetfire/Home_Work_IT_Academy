package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        System.out.println("--------CalculatorWithOperator--------");
        printResultCalculators(calculatorWithOperator);
        System.out.println("--------CalculatorWithMathCopy--------");
        printResultCalculators(calculatorWithMathCopy);
        System.out.println("--------CalculatorWithMathExtends--------");
        printResultCalculators(calculatorWithMathExtends);
    }

    public static void printResultCalculators(ICalculator iCalculator) {
        CalculatorWithCounterAutoCompositeInterface calculatorWithCounterAutoCompositeInterface = new CalculatorWithCounterAutoCompositeInterface(iCalculator);
        double operation1 = calculatorWithCounterAutoCompositeInterface.divide(28, 5);
        double operation2 = calculatorWithCounterAutoCompositeInterface.getDegree(operation1, 2);
        double operation3 = calculatorWithCounterAutoCompositeInterface.multiply(15, 7);
        double operation4 = calculatorWithCounterAutoCompositeInterface.sum(4.1, operation3);
        double operation5 = calculatorWithCounterAutoCompositeInterface.sum(operation4, operation2);
        System.out.println(operation5);
        System.out.println("Было выполнено " + calculatorWithCounterAutoCompositeInterface.getCountOperation() + " операций");
    }
}

