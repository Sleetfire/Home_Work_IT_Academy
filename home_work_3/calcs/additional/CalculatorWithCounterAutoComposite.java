package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

import java.util.Objects;

public class CalculatorWithCounterAutoComposite {

    private long countOperation;

    private CalculatorWithOperator calculatorWithOperator;

    private CalculatorWithMathCopy calculatorWithMathCopy;

    private CalculatorWithMathExtends calculatorWithMathExtends;

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

    public double divide(double a, double b) {
        double result;
        if (calculatorWithOperator != null) {
            result = calculatorWithOperator.divide(a, b);
        } else if (calculatorWithMathCopy != null) {
            result = calculatorWithMathCopy.divide(a, b);
        } else {
            result = calculatorWithMathExtends.divide(a, b);
        }
        incrementCountOperation();
        return result;
    }

    public double multiply(double a, double b) {
        double result;
        if (calculatorWithOperator != null) {
            result = calculatorWithOperator.multiply(a, b);
        } else if (calculatorWithMathCopy != null) {
            result = calculatorWithMathCopy.multiply(a, b);
        } else {
            result = calculatorWithMathExtends.multiply(a, b);
        }
        incrementCountOperation();
        return result;

    }

    public double subtract(double a, double b) {
        double result;
        if (calculatorWithOperator != null) {
            result = calculatorWithOperator.subtract(a, b);
        } else if (calculatorWithMathCopy != null) {
            result = calculatorWithMathCopy.subtract(a, b);
        } else {
            result = calculatorWithMathExtends.subtract(a, b);
        }
        incrementCountOperation();
        return result;
    }

    public double sum(double a, double b) {
        double result;
        if (calculatorWithOperator != null) {
            result = calculatorWithOperator.sum(a, b);
        } else if (calculatorWithMathCopy != null) {
            result = calculatorWithMathCopy.sum(a, b);
        } else {
            result = calculatorWithMathExtends.sum(a, b);
        }
        incrementCountOperation();
        return result;
    }

    public double getDegree(double a, int b) {
        double result;
        if (calculatorWithOperator != null) {
            result = calculatorWithOperator.getDegree(a, b);
        } else if (calculatorWithMathCopy != null) {
            result = calculatorWithMathCopy.getDegree(a, b);
        } else {
            result = calculatorWithMathExtends.getDegree(a, b);
        }
        incrementCountOperation();
        return result;
    }

    public double getModule(double a) {
        double result;
        if (calculatorWithOperator != null) {
            result = calculatorWithOperator.getModule(a);
        } else if (calculatorWithMathCopy != null) {
            result = calculatorWithMathCopy.getModule(a);
        } else {
            result = calculatorWithMathExtends.getModule(a);
        }
        incrementCountOperation();
        return result;
    }

    public double getSquareRoot(double a) {
        double result;
        if (calculatorWithOperator != null) {
            result = calculatorWithOperator.getSquareRoot(a);
        } else if (calculatorWithMathCopy != null) {
            result = calculatorWithMathCopy.getSquareRoot(a);
        } else {
            result = calculatorWithMathExtends.getSquareRoot(a);
        }
        incrementCountOperation();
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculatorWithCounterAutoComposite that = (CalculatorWithCounterAutoComposite) o;
        return countOperation == that.countOperation && Objects.equals(calculatorWithOperator, that.calculatorWithOperator) && Objects.equals(calculatorWithMathCopy, that.calculatorWithMathCopy) && Objects.equals(calculatorWithMathExtends, that.calculatorWithMathExtends);
    }

    @Override
    public int hashCode() {
        int result = calculatorWithOperator == null ? 0 : calculatorWithOperator.hashCode();
        result += calculatorWithMathCopy == null ? 0 : calculatorWithMathCopy.hashCode();
        result += calculatorWithMathExtends == null ? 0 : calculatorWithMathExtends.hashCode();
        result += 31 * countOperation;
        return result;
    }

    @Override
    public String toString() {
        return "CalculatorWithCounterAutoComposite{ " +
                "countOperation=" + countOperation +
                ", calculatorWithOperator=" + calculatorWithOperator +
                ", calculatorWithMathCopy=" + calculatorWithMathCopy +
                ", calculatorWithMathExtends=" + calculatorWithMathExtends +
                " }";
    }
}
