package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

import java.util.Objects;

public class CalculatorWithMemoryDecorator implements ICalculator {

    ICalculator iCalculator;

    private double memory;

    private double result;

    public double getMemory() {
        double timeMemory = this.memory;
        this.memory = 0;
        return timeMemory;
    }

    public ICalculator getCalculator() {
        return iCalculator;
    }

    public CalculatorWithMemoryDecorator(ICalculator iCalculator) {
        this.iCalculator = iCalculator;

    }

    public double divide(double a, double b) {
        double answer = iCalculator.divide(a, b);
        this.result = answer;
        return answer;
    }

    public double multiply(double a, double b) {
        double answer = iCalculator.multiply(a, b);
        this.result = answer;
        return answer;
    }

    public double subtract(double a, double b) {
        double answer = iCalculator.subtract(a, b);
        this.result = answer;
        return answer;
    }

    public double sum(double a, double b) {
        double answer = iCalculator.sum(a, b);
        this.result = answer;
        return answer;
    }

    public double getDegree(double a, int b) {
        double answer = iCalculator.getDegree(a, b);
        this.result = answer;
        return answer;
    }

    public double getModule(double a) {
        double answer = iCalculator.getModule(a);
        this.result = answer;
        return answer;
    }

    public double getSquareRoot(double a) {
        double answer = iCalculator.getSquareRoot(a);
        this.result = answer;
        return answer;
    }

    public void writeInMemory() {
        this.memory = this.result;
        this.result = 0;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorWithMemoryDecorator that = (CalculatorWithMemoryDecorator) o;
        return this.memory == that.memory && this.result == that.result && Objects.equals(iCalculator, that.iCalculator);
    }

    @Override
    public int hashCode() {
        int resultH = iCalculator == null ? 0 : iCalculator.hashCode();
        resultH += 31 * memory;
        resultH += 31 * result;
        return resultH;
    }

    @Override
    public String toString() {
        return "CalculatorWithMemory{ " +
                ", iCalculator=" + iCalculator +
                ", memory=" + memory +
                ", result=" + result +
                " }";
    }
}
