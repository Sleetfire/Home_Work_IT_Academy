package home_work_2.arrays.array23;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class WhileOperation implements IArraysOperation {

    @Override
    public void printAllElements() {

        int[] array = arrayFromConsole();

        int i = 0;

        while (i < array.length) {

            System.out.print(array[i] + " ");
            i++;

        }

    }

    @Override
    public void printAllSecondElement() {

        int[] array = arrayFromConsole();

        int i = 0;

        while (i < array.length) {

            if (i % 2 == 0) {

                System.out.print(array[i] + " ");
            }

            i++;

        }


    }

    @Override
    public void printReverseArray() {

        int[] array = arrayFromConsole();

        int i = array.length - 1;

        while (i >= 0) {

            System.out.print(array[i] + " ");

            i--;

        }

    }

}
