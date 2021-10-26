package home_work_2.arrays.array23;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class OperationTest {

    @ParameterizedTest
    @DisplayName("Перебор массива")
    @MethodSource("calcArgumentProvider")
    void doArrayEnumeration(IArraysOperation iArraysOperation) {
        assertEquals("1 2 3 4 5", iArraysOperation.printAllElements(new int[]{1, 2, 3, 4, 5}));
        assertEquals("5 4 3 2 1", iArraysOperation.printReverseArray(new int[]{1, 2, 3, 4, 5}));
        assertEquals("2 4", iArraysOperation.printAllSecondElement(new int[]{1, 2, 3, 4, 5}));

    }

    static Stream<Arguments> calcArgumentProvider() {
        return Stream.of(
                arguments(new DoWhileOperation()),
                arguments(new ForEachOperation()),
                arguments(new ForOperation()),
                arguments(new WhileOperation())
        );
    }
}
