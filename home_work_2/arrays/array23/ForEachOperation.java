package home_work_2.arrays.array23;

public class ForEachOperation implements IArraysOperation {

    @Override
    public String printAllElements(int [] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : array) {
            System.out.print(i + " ");
            stringBuilder.append(i).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String printAllSecondElement(int [] array) {
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i : array) {
            if (counter % 2 != 0) {
                System.out.print(i + " ");
                stringBuilder.append(i).append(" ");
            }
            counter++;
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String printReverseArray(int [] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = array.length - 1;
        for (int i : array) {
            System.out.print(array[counter] + " ");
            stringBuilder.append(array[counter]).append(" ");
            counter--;
        }
        return stringBuilder.toString().trim();
    }
}
