package home_work_4;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {

    private T[] data;

    DataContainer(T[] data) {

        this.data = data;

    }

    public int add(T item) {

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

        return data;

    }

    public boolean delete(int index) {

        try {

            data[index] = null;
            T[] newData = (T[]) new Object[data.length - 1];

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

    private T[] expandArray() {

        T[] newData = (T[]) new Object[data.length + 1];

        System.arraycopy(data, 0, newData, 0, data.length);
        //newData = Arrays.copyOf(data, data.length);

        return newData;

    }

    private boolean isEmpty() {

        if (data.length == 0) {

            return true;

        } else {

            return false;
        }

    }

    private boolean isFull() {

        for (int i = 0; i < data.length; i++) {

            if (data[i] == null) {

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

    public void printData() {

        for (int i = 0; i < data.length; i++) {

            System.out.print(data[i].toString() + " ");

        }

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        DataContainer<?> that = (DataContainer<?>) o;

        return Arrays.equals(data, that.data);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(data);
    }
}
