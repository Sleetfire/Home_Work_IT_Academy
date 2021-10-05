package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double getDegree(double a, int b) {
        return Math.pow(a, b);
    }

    @Override
    public double getModule(double a) {
        return Math.abs(a);
    }

    @Override
    public double getSquareRoot(double a) {
        return Math.sqrt(a);
    }
}
