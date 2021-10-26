package home_work_2.arrays.array23;

public class WhileOperation implements IArraysOperation {

    @Override
    public String printAllElements(int [] array) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i < array.length) {
            System.out.print(array[i] + " ");
            stringBuilder.append(array[i]).append(" ");
            i++;
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String printAllSecondElement(int [] array) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (i < array.length) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
                stringBuilder.append(array[i]).append(" ");
            }
            i++;
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String printReverseArray(int [] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = array.length - 1;
        while (i >= 0) {
            System.out.print(array[i] + " ");
            stringBuilder.append(array[i]).append(" ");
            i--;
        }
        return stringBuilder.toString().trim();
    }
}
