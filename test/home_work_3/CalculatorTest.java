package home_work_3;

import home_work_3.calcs.additional.*;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class CalculatorTest {

    private final CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

    @ParameterizedTest
    @DisplayName("Сложение")
    @MethodSource("calcArgumentProvider")
    void sum(ICalculator iCalculator) {
        assertEquals(109.1, iCalculator.sum(4.1, 105));
        assertEquals(140.45999999999998, iCalculator.sum(109.1, 31.36));
    }

    @ParameterizedTest
    @DisplayName("Разность")
    @MethodSource("calcArgumentProvider")
    void subtract(ICalculator iCalculator) {
        assertEquals(1, iCalculator.subtract(2, 1));
        assertEquals(0, iCalculator.subtract(-1, -1));
        assertEquals(1, iCalculator.subtract(1, 0));
    }

    @ParameterizedTest
    @DisplayName("Произведение")
    @MethodSource("calcArgumentProvider")
    void multiply(ICalculator iCalculator) {
        assertEquals(105, iCalculator.multiply(15, 7));
    }

    @ParameterizedTest
    @DisplayName("Деление")
    @MethodSource("calcArgumentProvider")
    void divide(ICalculator iCalculator) {
        assertEquals(5.6, iCalculator.divide(28, 5));
    }

    @ParameterizedTest
    @DisplayName("Возведение в степень")
    @MethodSource("calcArgumentProvider")
    void getDegree(ICalculator iCalculator) {
        assertEquals(31.359999999999996, iCalculator.getDegree(5.6, 2));
    }

    @ParameterizedTest
    @DisplayName("Модуль числа")
    @MethodSource("calcArgumentProvider")
    void getModule(ICalculator iCalculator) {
        assertEquals(1, iCalculator.getModule(-1));
        assertEquals(0, iCalculator.getModule(0));
        assertEquals(1, iCalculator.getModule(1));
    }

    @ParameterizedTest
    @DisplayName("Квадратный корень")
    @MethodSource("calcArgumentProvider")
    void getSquareRoot(ICalculator iCalculator) {
        assertEquals(2, iCalculator.getSquareRoot(4));
        assertEquals(2.23606797749979, iCalculator.getSquareRoot(5));
    }

    static Stream<Arguments> calcArgumentProvider() {
        return Stream.of(
                arguments(new CalculatorWithMathCopy()),
                arguments(new CalculatorWithOperator()),
                arguments(new CalculatorWithMathExtends()),
                arguments(new CalculatorWithCounterClassic()),
                arguments(new CalculatorWithCounterAutoSuper()),
//                arguments(new CalculatorWithCounterAutoComposite(new CalculatorWithMathExtends())),
//                arguments(new CalculatorWithCounterAutoCompositeInterface(new CalculatorWithMathExtends())),
//                arguments(new CalculatorWithMemory(new CalculatorWithMathExtends())),
                arguments(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends())),
                arguments(new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends())))
        );
    }

}
