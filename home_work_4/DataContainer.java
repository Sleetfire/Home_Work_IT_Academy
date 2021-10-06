package home_work_4;

import home_work_4.iterators.DataContainerIterator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T> {

    private T[] data;

    DataContainer(T[] data) {
        this.data = data;
    }

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

    public T[] getItems() {
        return this.data;
    }

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

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
                return delete(i);
            }
        }
        return false;
    }

    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (comparator.compare(data[j], data[j + 1]) > 0) {
                    T buf = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = buf;
                }
            }
        }
    }

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

    private T[] expandArray() {
        return Arrays.copyOf(data, data.length + 1);
    }

    private boolean isEmpty() {
        return data.length == 0;
    }

    private boolean isFull() {
        for (T datum : data) {
            if (datum == null) {
                return false;
            }
        }
        return true;
    }

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
        String str = "";
        for (T datum : data) {
            if (datum != null) {
                str += datum + " ";
            }
        }
        return str;
    }

    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator(data);
    }
}



