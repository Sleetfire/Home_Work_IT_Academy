package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

import java.util.Objects;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long countOperation;

    public long getCountOperation() {
        return countOperation;
    }

    public void incrementCountOperation() {
        countOperation++;
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    @Override
    public double subtract(double a, double b) {
        incrementCountOperation();
        return super.subtract(a, b);
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return super.sum(a, b);
    }

    @Override
    public double getDegree(double a, int b) {
        incrementCountOperation();
        return super.getDegree(a, b);
    }

    @Override
    public double getModule(double a) {
        incrementCountOperation();
        return super.getModule(a);
    }

    @Override
    public double getSquareRoot(double a) {
        incrementCountOperation();
        return super.getSquareRoot(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorWithCounterAutoSuper that = (CalculatorWithCounterAutoSuper) o;
        return countOperation == that.countOperation;
    }

    @Override
    public int hashCode() {
        return 31 * (int) countOperation;
    }

    @Override
    public String toString() {
        return "CalculatorWithCounterAutoSuper {" +
                "countOperation=" + countOperation +
                " }";
    }
}
