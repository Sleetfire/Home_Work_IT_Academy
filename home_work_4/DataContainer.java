package home_work_4;

import home_work_4.iterators.DataContainerIterator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class DataContainer<T> implements Iterable<T> {

    private T[] data;

    DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * метод, который осуществляет добавление элемента в коллекцию
     * @param item элемент, который добавляем в контейнер
     * @return возвращает индекс ячейки, куда был добавлен элемент, если был передан null, возвращает -1
     */
    public int add(T item) {
        if (item == null) {
            return -1;
        }
        int index;
        if (isEmpty() || isFull()) {
            data = expandArray();
        }
        index = dataFill(item);
        return index;
    }

    /**
     * метод, который возвращает элемент из коллекции по его индексу
     * @param index индекс элемента контейнера
     * @return если коллекция пустая или указанный индекс выходит за пределы data - возвращает null, иначе возвращает элемент по индексу
     */
    public T get(int index) {
        if (isEmpty()) {
            return null;
        }
        try {
            return data[index];
        } catch (ArrayIndexOutOfBoundsException e1) {
            return null;
        }
    }

    /**
     * метод, который возвращает поле data
     * @return возвращает поле data
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * метод, который удаляет элемент поля data по индексу
     * @param index индекс элемента контейнера
     * @return если удаление элемента произошло успешно - возвращает true, иначе возвращает false
     */
    public boolean delete(int index) {
        try {
            data[index] = null;
            T[] newData = Arrays.copyOf(data, data.length - 1);
            for (int i = 0, j = 0; i < data.length - 1; i++, j++) {
                if (data[i] == null) {
                    j++;
                }
                newData[i] = data[j];
            }
            data = newData;
            return true;
        } catch (ArrayIndexOutOfBoundsException e1) {
            return false;
        }
    }

    /**
     * метод, который удаляет элемент поля data по item
     * @param item элемент, который добавляем в контейнер
     * @return если удаление элемента произошло успешно - возвращает true, иначе возвращает false
     */
    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (Objects.equals(data[i], item)) {
                return delete(i);
            }
        }
        return false;
    }

    /**
     * метод, который выполняет сортировку DataContainer на основе переданного компаратора
     * @param comparator компаратор, на основе которого собираемся выполнять сортировку
     */
    public void sort(Comparator<T> comparator) {
        sort(this, comparator);
    }

    /**
     * статический метод, который выполняет сортировку переданного в него DataContainer
     * @param dataContainer контейнер, который хотим отсортировать
     * @param <T>
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        for (int i = 0; i < dataContainer.data.length; i++) {
            for (int j = 0; j < dataContainer.data.length - i - 1; j++) {
                if (dataContainer.data[j].compareTo(dataContainer.data[j + 1]) > 0) {
                    T buf = dataContainer.data[j];
                    dataContainer.data[j] = dataContainer.data[j + 1];
                    dataContainer.data[j + 1] = buf;
                }
            }
        }
    }

    /**
     * статический метод, который выполняет сортировку переданного в него DataContainer на основе компаратора
     * @param dataContainer контейнер, который хотим отсортировать
     * @param comparator компаратор, на основе которого собираемся выполнять сортировку
     * @param <T>
     */
    public static <T> void sort(DataContainer<T> dataContainer, Comparator<T> comparator) {
        for (int i = 0; i < dataContainer.data.length; i++) {
            for (int j = 0; j < dataContainer.data.length - i - 1; j++) {
                if (comparator.compare(dataContainer.data[j], dataContainer.data[j + 1]) > 0) {
                    T buf = dataContainer.data[j];
                    dataContainer.data[j] = dataContainer.data[j + 1];
                    dataContainer.data[j + 1] = buf;
                }
            }
        }
    }

    /**
     * метод, который расширяет поле data
     * @return возвращает расширенный массив
     */
    private T[] expandArray() {
        return Arrays.copyOf(data, data.length + 1);
    }

    /**
     * метод, который проверяет пустое ли поле data
     * @return возвращает true, если поле data пустое, иначе возвращает false
     */
    private boolean isEmpty() {
        return data.length == 0;
    }

    /**
     * метод, который проверяет заполнено ли поле data
     * @return если поле заполнено - возвращает true, иначе возвращает false
     */
    private boolean isFull() {
        for (T datum : data) {
            if (datum == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * метод, который заполняет поле data элементами
     * @param item элемент коллекции
     * @return возвращает индекс поля data, если элемент был добавлен, иначе возвращает -1
     */
    private int dataFill(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (T datum : data) {
            if (datum != null) {
                str.append(datum).append(" ");
            }
        }
        return str.toString();
    }

    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator(data);
    }
}



