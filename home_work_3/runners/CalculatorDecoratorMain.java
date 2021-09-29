package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {

    public static void main(String[] args) {

        ICalculator calculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        if (calculator instanceof CalculatorWithCounterAutoDecorator) {

            CalculatorWithCounterAutoDecorator calc = (CalculatorWithCounterAutoDecorator) calculator;

            if (calc.getCalculator() instanceof CalculatorWithMemoryDecorator) {

                CalculatorWithMemoryDecorator memoryCalc = (CalculatorWithMemoryDecorator) calc.getCalculator();

                calc.divide(28, 5);
                memoryCalc.writeInMemory();
                calc.getDegree(memoryCalc.getMemory(), 2);
                memoryCalc.writeInMemory();
                calc.sum(4.1, memoryCalc.getMemory());
                memoryCalc.writeInMemory();
                calc.sum(memoryCalc.getMemory(), calc.multiply(15, 7));
                memoryCalc.writeInMemory();
                System.out.println("Было выполнено " + calc.getCountOperation() + " операций");
                System.out.println("Последнее значение в памяти (результат всех вычислений): " + memoryCalc.getMemory());

            }

        }

    }

}
