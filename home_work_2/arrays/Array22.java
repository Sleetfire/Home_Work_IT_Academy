package home_work_2.arrays;

//2.2 Перебор массива при помощи do....while, while, for, foreach.
// Элементы массива вводить используя ранее созданный arrayFromConsole.
// Все задачи в одном классе, в отдельных методах. Должно получиться 3 метода:
//2.2.1. Вывести все элементы в консоль.
//2.2.2. Вывести каждый второй элемент массива в консоль.
//2.2.3. Вывести все элементы массива в консоль в обратном порядке.

import static home_work_2.utils.ArrayUtils.arrayFromConsole;

public class Array22 {

    public static void main(String[] args) {

        //printAllElements();

        //printAllSecondElement();

        //printReverseArray();

    }

    public static void printAllElements() {

        int[] array = arrayFromConsole();

        //foreach
        for (int i : array) {

            System.out.print(i + " ");

        }

        //for
//        for (int i = 0; i < array.length; i++ ) {
//
//            System.out.print(array[i] + " ");
//
//        }

        //while
//        int i = 0;
//
//        while (i < array.length) {
//
//            System.out.print(array[i] + " ");
//            i++;
//
//        }

        //do...while
//        i = 0;
////        do {
////
////            System.out.print(array[i] + " ");
////            i++;
////
////        } while (i < array.length);

    }

    public static void printAllSecondElement() {

        int[] array = arrayFromConsole();

        //for
        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {

                System.out.print(array[i] + " ");

            }

        }

        //foreach
//        int counter = 0;
//
//        for (int i : array) {
//
//            if (counter % 2 == 0) {
//
//                System.out.print(i + " ");
//
//            }
//
//            counter++;
//
//        }

        //while
//        int i = 0;
//
//        while (i < array.length) {
//
//            if (i % 2 == 0) {
//
//                System.out.print(array[i] + " ");
//            }
//
//            i++;
//
//        }

        //do...while
//        i = 0;
//
//        do {
//
//            if (i % 2 == 0) {
//
//                System.out.print(array[i] + " ");
//
//            }
//
//            i++;
//
//        } while (i < array.length);

    }


    public static void printReverseArray() {

        int[] array = arrayFromConsole();

        //for
        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");

        }

        //foreach
//        int counter = array.length - 1;
//
//        for (int i : array) {
//
//            System.out.print(array[counter] + " ");
//
//            counter--;
//
//        }

        //do...while
//        int i = array.length - 1;
//
//        do {
//
//            System.out.print(array[i] + " ");
//
//            i--;
//
//        } while (i >= 0);

        //while
//        i = array.length - 1;
//
//        while (i >= 0) {
//
//            System.out.print(array[i] + " ");
//
//            i--;
//
//        }

    }

}


