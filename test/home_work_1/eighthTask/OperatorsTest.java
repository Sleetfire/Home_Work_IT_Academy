package home_work_1.eighthTask;

import home_work_1.eighthTask.ICommunicationPrinter;
import home_work_1.eighthTask.OperatorIf;
import home_work_1.eighthTask.OperatorIfElseIf;
import home_work_1.eighthTask.OperatorSwitch;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class OperatorsTest {

    @ParameterizedTest
    @DisplayName("Operators")
    @MethodSource("calcArgumentProvider")
    void sum(ICommunicationPrinter iCommunicationPrinter) {
        assertEquals("Привет!\nЯ тебя так долго ждал", iCommunicationPrinter.welcome("Вася"));
        assertEquals("Я тебя так долго ждал", iCommunicationPrinter.welcome("Анастасия"));
        assertEquals("Добрый день, а вы кто?", iCommunicationPrinter.welcome("Итачи"));

    }

    static Stream<Arguments> calcArgumentProvider() {
        return Stream.of(
                arguments(new OperatorIf()),
                arguments(new OperatorIfElseIf()),
                arguments(new OperatorSwitch())
        );
    }
}
