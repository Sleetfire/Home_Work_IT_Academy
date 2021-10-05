package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

import java.util.Objects;

public class CalculatorWithCounterAutoDecorator implements ICalculator{

    private long countOperation;

    ICalculator iCalculator;

    public long getCountOperation() {
        return countOperation;
    }

    public ICalculator getCalculator() {
        return iCalculator;
    }

    public void incrementCountOperation() {
        countOperation++;
    }

    public CalculatorWithCounterAutoDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;

    }

    public double divide(double a, double b) {
        incrementCountOperation();
        return iCalculator.divide(a, b);
    }

    public double multiply(double a, double b) {
        incrementCountOperation();
        return iCalculator.multiply(a, b);
    }

    public double subtract(double a, double b) {
        incrementCountOperation();
        return iCalculator.subtract(a, b);
    }

    public double sum(double a, double b) {

        incrementCountOperation();
        return iCalculator.sum(a, b);
    }

    public double getDegree(double a, int b) {
        incrementCountOperation();
        return iCalculator.getDegree(a, b);
    }

    public double getModule(double a) {
        incrementCountOperation();
        return iCalculator.getModule(a);
    }

    public double getSquareRoot(double a) {
        incrementCountOperation();
        return iCalculator.getSquareRoot(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorWithCounterAutoDecorator that = (CalculatorWithCounterAutoDecorator) o;
        return countOperation == that.countOperation && Objects.equals(iCalculator, that.iCalculator);
    }

    @Override
    public int hashCode() {
        int result = iCalculator == null ? 0 : iCalculator.hashCode();
        result += 31 * countOperation;
        return result;
    }

    @Override
    public String toString() {
        return "CalculatorWithCounterAutoDecorator {" +
                "countOperation=" + countOperation +
                ", iCalculator=" + iCalculator +
                "}";
    }
}
