package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {

        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        System.out.println(calculator instanceof CalculatorWithCounterAutoDecorator);
        System.out.println(calculator instanceof CalculatorWithMemoryDecorator);
        System.out.println(calculator instanceof CalculatorWithMathExtends);


    }

}
