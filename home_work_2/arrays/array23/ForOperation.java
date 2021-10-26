package home_work_2.arrays.array23;

public class ForOperation implements IArraysOperation {

    @Override
    public String printAllElements(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            stringBuilder.append(array[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String printAllSecondElement(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
                stringBuilder.append(array[i]).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }

    @Override
    public String printReverseArray(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
            stringBuilder.append(array[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }
}
