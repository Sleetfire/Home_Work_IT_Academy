package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long countOperation;

    public long getCountOperation () {
        return countOperation;
    }

    public void incrementCountOperation() {
        countOperation++;
    }


}
