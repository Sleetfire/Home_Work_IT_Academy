package home_work_2.arrays.array23;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public void printAllElements(int [] array) {
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);
    }

    @Override
    public void printAllSecondElement(int [] array) {
        int i = 0;
        do {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
            }
            i++;
        } while (i < array.length);
    }

    @Override
    public void printReverseArray(int [] array) {
        int i = array.length - 1;
        do {
            System.out.print(array[i] + " ");
            i--;
        } while (i >= 0);
    }
}
