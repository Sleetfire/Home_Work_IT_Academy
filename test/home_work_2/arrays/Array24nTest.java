package home_work_2.arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Array24nTest {

    private final Array24n array24n = new Array24n();

    private List<Integer> fillList () {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        return list;
    }

    @Test
    @DisplayName("Обработка массива")
    void doArrayEnumeration() {
        assertEquals(4, array24n.maxElementWithOvenIndex(new int[]{2, 5, 3, 9, 4, 7, 1}));
        assertArrayEquals(new int[]{2, 5, 3, 9, 4, 7, 0}, array24n.arrayCompression(new int[]{2, 5, 3, 9, 4, 7, 1}));
        assertEquals(31, array24n.sumAllFigure(new int[]{2, 5, 3, 9, 4, 7, 1}));
        assertArrayEquals(fillList().toArray(), array24n.elementsLessMiddle(new int[]{2, 5, 3, 9, 4, 7, 1}));
        assertArrayEquals(new int[]{1, 2}, array24n.searchTwoMinElements(new int[]{2, 5, 3, 9, 4, 7, 1}));
        assertEquals(6, array24n.sumEvenPositiveElements(new int[]{2, 5, 3, 9, 4, 7, 1}));
    }
}
