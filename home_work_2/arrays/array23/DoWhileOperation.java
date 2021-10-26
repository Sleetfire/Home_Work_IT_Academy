package home_work_2.arrays.array23;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public String printAllElements(int[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        do {
            System.out.print(array[i] + " ");
            stringBuilder.append(array[i]).append(" ");
            i++;
        } while (i < array.length);
        return stringBuilder.toString().trim();
    }

    @Override
    public String printAllSecondElement(int[] array) {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            if (i % 2 != 0) {
                System.out.print(array[i] + " ");
                stringBuilder.append(array[i]).append(" ");
            }
            i++;
        } while (i < array.length);
        return stringBuilder.toString().trim();
    }

    @Override
    public String printReverseArray(int[] array) {
        int i = array.length - 1;
        StringBuilder stringBuilder = new StringBuilder();
        do {
            System.out.print(array[i] + " ");
            stringBuilder.append(array[i]).append(" ");
            i--;
        } while (i >= 0);
        return stringBuilder.toString().trim();
    }
}
