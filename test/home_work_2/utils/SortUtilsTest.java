package home_work_2.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortUtilsTest {

    @Test
    @DisplayName("Сортировка пузырьком")
    void bubbleSort() {
        assertArrayEquals(new int[]{1,2,3,4,5,6}, SortsUtils.bubbleSort(new int[]{1,2,3,4,5,6}));
        assertArrayEquals(new int[]{1,1,1,1}, SortsUtils.bubbleSort(new int[]{1,1,1,1}));
        assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, SortsUtils.bubbleSort(new int[]{9,1,5,99,9,9}));
        assertArrayEquals(new int[]{}, SortsUtils.bubbleSort(new int[]{}));
        assertArrayEquals(new int[]{0}, SortsUtils.bubbleSort(new int[]{0}));
        assertArrayEquals(new int[]{-999, 10}, SortsUtils.bubbleSort(new int[]{10, -999}));
    }

    @Test
    @DisplayName("Шейкерная сортировка")
    void shakeSort() {
        assertArrayEquals(new int[]{1,2,3,4,5,6}, SortsUtils.bubbleSort(new int[]{1,2,3,4,5,6}));
        assertArrayEquals(new int[]{1,1,1,1}, SortsUtils.bubbleSort(new int[]{1,1,1,1}));
        assertArrayEquals(new int[]{1, 5, 9, 9, 9, 99}, SortsUtils.bubbleSort(new int[]{9,1,5,99,9,9}));
        assertArrayEquals(new int[]{}, SortsUtils.bubbleSort(new int[]{}));
        assertArrayEquals(new int[]{0}, SortsUtils.bubbleSort(new int[]{0}));
        assertArrayEquals(new int[]{-999, 10}, SortsUtils.bubbleSort(new int[]{10, -999}));
    }
}
