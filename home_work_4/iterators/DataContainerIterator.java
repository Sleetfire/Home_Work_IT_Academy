package home_work_4.iterators;

import home_work_4.DataContainer;
import home_work_4.DataContainerMain;

import java.util.Iterator;
import java.util.function.Consumer;

public class DataContainerIterator<T> implements Iterator<T> {

    private T[] data;
    private int cursor = 0;


    public DataContainerIterator(T[] data) {
        this.data = data;
    }

    @Override
    public void remove() {

        data[cursor] = null;
        T[] newData = (T[]) new Object[data.length - 1];

        for (int i = 0, j = 0; i < data.length - 1; i++, j++) {

            if (data[i] == null) {
                j++;

            }

            newData[i] = data[j];

        }

        data = newData;

    }

    @Override
    public boolean hasNext() {
        return cursor < data.length;
    }

    @Override
    public T next() {

        T currentItem = null;

        if (hasNext()) {
            currentItem = data[cursor];
            cursor++;
        }
        return currentItem;
    }

}
