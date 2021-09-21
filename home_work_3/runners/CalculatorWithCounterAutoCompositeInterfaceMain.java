package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoCompositeInterface;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {

    public static void main(String[] args) {

        CalculatorWithOperator calculatorWithOperator = new CalculatorWithOperator();

        CalculatorWithCounterAutoCompositeInterface calculatorWithCounterAutoCompositeInterface = new CalculatorWithCounterAutoCompositeInterface(calculatorWithOperator);

        double operation1 = calculatorWithCounterAutoCompositeInterface.getICalculator().divide(28, 5);
        double operation2 = calculatorWithCounterAutoCompositeInterface.getICalculator().getDegree(operation1, 2);
        double operation3 = calculatorWithCounterAutoCompositeInterface.getICalculator().multiply(15, 7);
        double operation4 = calculatorWithCounterAutoCompositeInterface.getICalculator().sum(4.1, operation3);
        double operation5 = calculatorWithCounterAutoCompositeInterface.getICalculator().sum(operation4, operation2);

        System.out.println(operation5);
        System.out.println("Было выполнено " + calculatorWithCounterAutoCompositeInterface.getCountOperation() + " операций");

    }


}

