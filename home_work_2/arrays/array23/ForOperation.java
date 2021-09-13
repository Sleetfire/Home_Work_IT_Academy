package home_work_2.arrays.array23;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class ForOperation implements IArraysOperation {

    @Override
    public void printAllElements() {

        int[] array = arrayFromConsole();

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

    }

    @Override
    public void printAllSecondElement() {

        int[] array = arrayFromConsole();

        for (int i = 0; i < array.length; i++) {

            if (i % 2 != 0) {

                System.out.print(array[i] + " ");

            }

        }

    }

    @Override
    public void printReverseArray() {

        int[] array = arrayFromConsole();

        for (int i = array.length - 1; i >= 0; i--) {

                System.out.print(array[i] + " ");

        }





    }
}
