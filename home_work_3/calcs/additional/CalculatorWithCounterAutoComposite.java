package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoComposite {

    private long countOperation;

    private CalculatorWithOperator calculatorWithOperator;

    private CalculatorWithMathCopy calculatorWithMathCopy;

    private CalculatorWithMathExtends calculatorWithMathExtends;

    public CalculatorWithOperator getCalculatorWithOperator() {
        incrementCountOperation();
        return calculatorWithOperator;
    }

    public CalculatorWithMathCopy getCalculatorWithMathCopy() {
        incrementCountOperation();
        return calculatorWithMathCopy;
    }

    public CalculatorWithMathExtends getCalculatorWithMathExtends() {
        incrementCountOperation();
        return calculatorWithMathExtends;
    }

    public long getCountOperation() {
        return countOperation;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithOperator calculatorWithOperator) {
        this.calculatorWithOperator = calculatorWithOperator;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathCopy calculatorWithMathCopy) {
        this.calculatorWithMathCopy = calculatorWithMathCopy;
    }

    public CalculatorWithCounterAutoComposite(CalculatorWithMathExtends calculatorWithMathExtends) {
        this.calculatorWithMathExtends = calculatorWithMathExtends;
    }

    public void incrementCountOperation() {
        countOperation++;
    }


}
