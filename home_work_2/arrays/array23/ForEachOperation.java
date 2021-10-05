package home_work_2.arrays.array23;

public class ForEachOperation implements IArraysOperation {

    @Override
    public void printAllElements(int [] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    @Override
    public void printAllSecondElement(int [] array) {
        int counter = 0;
        for (int i : array) {
            if (counter % 2 != 0) {
                System.out.print(i + " ");
            }
            counter++;
        }
    }

    @Override
    public void printReverseArray(int [] array) {
        int counter = array.length - 1;
        for (int i : array) {
            System.out.print(array[counter] + " ");
            counter--;
        }
    }
}
