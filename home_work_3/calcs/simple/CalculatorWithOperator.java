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

        if (b == 1) {
            return 1;
        }

        double result = a;

        if (b > 0) {

            while (b > 1) {

                result *= a;
                b--;

            }

        } else {
            b *= -1;

            while (b > 1) {

                result *= a;
                b--;

            }

            result = 1 / result;

        }

        return result;

    }

    //модуль числа
    public double getModule(double a) {

        return (a < 0) ? -a : a;

    }

    //квадратный корень (Итерационная формула Герона)
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
