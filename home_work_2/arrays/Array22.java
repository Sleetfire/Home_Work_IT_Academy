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

    public static void printAllElements () {

        int [] array = arrayFromConsole();

        for (int i : array) {

            System.out.print(i + " ");

        }

    }

    public static void printAllSecondElement () {

        int [] array = arrayFromConsole();

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {

                System.out.print(array[i] + " ");

            }

        }

    }

    public static void printReverseArray () {

        int [] array = arrayFromConsole();

        for (int i = array.length - 1; i >= 0; i--) {

                System.out.print(array[i] + " ");

            }

        }

    }


