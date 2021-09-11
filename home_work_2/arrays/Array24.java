package home_work_2.arrays;

//2.4 Задачи взяты с сайта https://taskcode.ru/array. На сайте есть пояснения по каждой из этих задач.
//Все задачи в одном классе, в отдельных методах. Для создания массивов использовать ранее созданный arrayRandom.
//2.4.1. Сумма четных положительных элементов массива
//2.4.2. Максимальный из элементов массива с четными индексами
//2.4.3. Элементы массива, которые меньше среднего арифметического
//2.4.4. Найти два наименьших (минимальных) элемента массива
//2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
//2.4.6. Сумма цифр массива


import java.util.Random;
import java.util.Scanner;

import static home_work_2.utils.ArrayUtils.arrayRandom;

public class Array24 {

    public static void main(String[] args) {


        //sumEvenPositiveElements(10, 10);

        //maxElementWithOvenIndex(10, 10);

        //elementsLessMiddle(10, 10);

        //searchTwoMinElements(10, 10);

        //arrayCompression(10, 10);

        sumAllFigure(5, 100);

    }

    //2.4.1. Сумма четных положительных элементов массива
    public static void sumEvenPositiveElements(int size, int maxValueExclusion) {

        int[] array = arrayRandom(size, maxValueExclusion);

        int sum = 0;

        System.out.println("Массив состоит из следующих элементов: ");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

            if (array[i] > 0 && array[i] % 2 == 0) {

                sum += array[i];

            }

        }

        System.out.println();

        System.out.println("Сумма четных положительных элементов равна: " + sum);

    }

    //2.4.2. Максимальный из элементов массива с четными индексами
    public static void maxElementWithOvenIndex(int size, int maxValueExclusion) {

        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println("Массив состоит из следующих элементов: ");

        for (int i : array) {

            System.out.print(i + " ");
        }

        int result = array[0];

        for (int i = 0; i < array.length - 1; i++) {

            if (result < array[i] && i % 2 == 0) {

                result = array[i];

            }

        }

        System.out.println();

        System.out.println("Максимальный из элементов массива с четными индексами равен: " + result);

    }

    //2.4.3. Элементы массива, которые меньше среднего арифметического
    public static void elementsLessMiddle(int size, int maxValueExclusion) {

        int[] array = arrayRandom(size, maxValueExclusion);

        int sum = 0;
        int arithMean;

        System.out.println("Массив состоит из следующих элементов: ");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

            sum += array[i];

        }

        System.out.println();

        arithMean = sum / array.length;

        System.out.println("Элементы массива, которые меньше среднего арифметического (" + arithMean + "): ");

        for (int i : array) {

            if (i < arithMean) System.out.print(i + " ");

        }

    }

    //2.4.4. Найти два наименьших (минимальных) элемента массива
    public static void searchTwoMinElements(int size, int maxValueExclusion) {

        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println("Массив состоит из следующих элементов: ");

        for (int i : array) {

            System.out.print(i + " ");

        }

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (min1 > array[i]) {

                min1 = array[i];

                counter = i;

            }
        }

        for (int j = 0; j < array.length; j++) {

            if (min2 > array[j] && j != counter) {

                min2 = array[j];

            }

        }

        System.out.println();
        System.out.println("Первое минимальное число :" + min1);
        System.out.println("Второе минимальное число :" + min2);

    }

    //2.4.5. Сжать массив, удалив элементы, принадлежащие интервалу
    public static void arrayCompression(int size, int maxValueExclusion) {

        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println("Массив состоит из следующих элементов: ");

        for (int i : array) {

            System.out.print(i + " ");

        }

        System.out.println('\n' + "Введите нижнюю границу интервала, в котором хотите очистить элементы массива: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int b;

        do {

            System.out.println("Введите нижнюю границу интервала, в котором хотите очистить элементы массива: ");

            b = scanner.nextInt();

        } while (a >= b);

        for (int i = 0; i < array.length; ) {

            if (array[i] > a && array[i] < b) {

                for (int j = i; j < array.length - 1; j++) {

                    array[j] = array[j + 1];

                }

                array[array.length - 1] = 0;

            } else i++;

        }

        for (int i : array) {

            System.out.print(i + " ");

        }

    }

    //2.4.6. Сумма цифр массива
    public static void sumAllFigure(int size, int maxValueExclusion) {

        int[] array = arrayRandom(size, maxValueExclusion);

        System.out.println("Массив имеет следующий вид: ");

        int sum = 0;

        for (int i : array) {

            System.out.print(i + " ");

        }

        for (int i = 0; i < array.length; i++) {

            while (array[i] > 0) {

                sum += array[i] % 10;
                array[i] /= 10;

            }

        }

        System.out.println();

        System.out.println("Сумма всех цифр массива равна: " + sum);

    }

}



