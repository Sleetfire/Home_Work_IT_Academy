package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {

    //деление
    public double divide(double a, double b) {

        return a / b;
    }

    //произведение
    public double multiply(double a, double b) {

        return a * b;
    }

    //разность
    public double subtract(double a, double b) {

        return a - b;
    }

    //сумма
    public double sum(double a, double b) {

        return a + b;
    }

    //возведение в степень
    public double getDegree(double a, int b) {

        return Math.pow(a, b);
    }

    //модуль числа
    public double getModule(double a) {

        return Math.abs(a);
    }

    //квадратный корень
    public double getSquareRoot(double a) {

        return Math.sqrt(a);
    }


}
