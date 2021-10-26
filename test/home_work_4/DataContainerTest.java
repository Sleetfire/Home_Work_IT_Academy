package home_work_4;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DataContainerTest {

    @Test
    @DisplayName("Добавление элемента в контейнер")
    void add() {
        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[]{1, 2, 3, null, null, null});
        int index = dataContainer.add(777);
        assertArrayEquals(new Integer[]{1, 2, 3, 777, null, null}, dataContainer.getItems());
        assertEquals(3, index);
        index = dataContainer.add(null);
        assertArrayEquals(new Integer[]{1, 2, 3, 777, null, null}, dataContainer.getItems());
        assertEquals(-1, index);
        dataContainer = new DataContainer<>(new Integer[]{1, null, 3, null, null, null});
        index = dataContainer.add(777);
        assertArrayEquals(new Integer[]{1, 777, 3, null, null, null}, dataContainer.getItems());
        assertEquals(1, index);
        dataContainer = new DataContainer<>(new Integer[0]);
        index = dataContainer.add(777);
        assertArrayEquals(new Integer[]{777}, dataContainer.getItems());
        assertEquals(0, index);
        dataContainer = new DataContainer<>(new Integer[]{1, 2, 3});
        index = dataContainer.add(777);
        assertArrayEquals(new Integer[]{1, 2, 3, 777}, dataContainer.getItems());
        assertEquals(3, index);
    }

    @Test
    @DisplayName("Получение элемента из контейнера")
    void get() {
        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[0]);
        int index = dataContainer.add(777);
        assertEquals(777, dataContainer.get(index));
        assertNull(dataContainer.get(index + 1));
    }

    @Test
    @DisplayName("Удаление элемента из контейнера по индексу")
    void deleteByIndex() {
        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean answer = dataContainer.delete(3);
        assertArrayEquals(new Integer[]{1, 2, 3}, dataContainer.getItems());
        assertTrue(answer);
        answer = dataContainer.delete(9);
        assertFalse(answer);
        dataContainer.add(777);
        answer = dataContainer.delete(2);
        assertArrayEquals(new Integer[]{1, 2, 777}, dataContainer.getItems());
        assertTrue(answer);
    }

    @Test
    @DisplayName("Удаление элемента из контейнера по самому элементу")
    void deleteByElement() {
        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[]{1, 2, 3, 777});
        boolean answer = dataContainer.delete(Integer.valueOf(777));
        assertArrayEquals(new Integer[]{1, 2, 3}, dataContainer.getItems());
        assertTrue(answer);
        answer = dataContainer.delete(Integer.valueOf(111));
        assertFalse(answer);
        dataContainer.add(777);
        dataContainer.add(3);
        answer = dataContainer.delete(Integer.valueOf(3));
        assertArrayEquals(new Integer[]{1, 2, 777, 3}, dataContainer.getItems());
        assertTrue(answer);
    }
}
