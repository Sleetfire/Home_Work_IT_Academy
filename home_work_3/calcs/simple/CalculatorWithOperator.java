package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {

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

        double result = a;

        while (b > 1) {

            result *= a;
            b--;

        }

        return result;

    }

    //модуль числа
    public double getModule(double a) {

        return (a < 0) ? -a : a;

    }

    //квадратный корень
    public double getSquareRoot(double a) {

        double x = a;
        int i = 0;
        while (x * x > a && i < 200) {

            x = (x + a / x) * 0.5;
            i++;

        }

        return x;

    }


}
