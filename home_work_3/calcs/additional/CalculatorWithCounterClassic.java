package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.Objects;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long countOperation;

    public long getCountOperation () {
        return countOperation;
    }

    public void incrementCountOperation() {
        countOperation++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorWithCounterClassic that = (CalculatorWithCounterClassic) o;
        return countOperation == that.countOperation;
    }

    @Override
    public int hashCode() {
        return 31 * (int) countOperation;
    }
}
