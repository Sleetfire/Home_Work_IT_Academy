package home_work_4.iterators;

import java.util.Arrays;
import java.util.Iterator;

public class DataContainerIterator<T>  implements Iterator<T> {

    private T[] data;
    private int cursor = 0;
    private T item;

    public DataContainerIterator(T[] data) {
        this.data = data;
    }

    public void fastRemove(int index) {
        data[index] = null;
        T[] newData = Arrays.copyOf(data, data.length - 1);
        for (int i = 0, j = 0; i < data.length - 1; i++, j++) {
            if (data[i] == null) {
                j++;
            }
            newData[i] = data[j];
        }
        this.data = newData;
        cursor--;
    }

    @Override
    public void remove() {
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(item)) {
               fastRemove(i);
            }
        }
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
        item = currentItem;
        return currentItem;
    }

    public  T[] getData() {
        return data;
    }

}