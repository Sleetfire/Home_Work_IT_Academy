package home_work_2.utils;

//4.* Выполнить сортировку массива с числами:
//4.1. После каждой сортировки в консоли у вас должно получиться
// "[Какой массив был до сортировки] -> [Каким стал массив после сортировки]".
// Для преобразования массива в текст можно использовать класс Arrays.
//4.2. Создать класс SortsUtils. Пишем в нём следующие алгоритмы:
//4.2.1. Пузырьковая сортировка
//4.2.2. Шейкерная сортировка
//4.3. Для тестов используем предварительно созданные массивы (в коде ваши тесты должны остаться):
//4.3.1. {1,2,3,4,5,6}
//4.3.2. {1,1,1,1}
//4.3.3. {9,1,5,99,9,9}
//4.3.4. {}
//4.4. После тестов написать код который будет массив через ранее созданный arrayRandom. Отсортировать.
//4.5. После рандома написать код, который будет создавать массив через ранее созданный arrayFromConsole. Отсортировать.

import java.util.Arrays;

import static home_work_2.utils.ArrayUtils.arrayFromConsole;
import static home_work_2.utils.ArrayUtils.arrayRandom;

public class SortsUtils {

    public static void main(String[] args) {
        //bubbleSort(new int[] {1,2,3,4,5,6});
        //bubbleSort(new int[] {1,1,1,1});
        //bubbleSort(new int[] {9,1,5,99,9,9});
        //bubbleSort(new int[] {});
        //bubbleSort(arrayRandom(10, 100));
        //bubbleSort(arrayFromConsole());

        //shakerSort(new int[] {1,2,3,4,5,6});
        //shakerSort(new int[] {1,1,1,1});
        //shakerSort(new int[] {9,1,5,99,9,9});
        //shakerSort(new int[] {});
        //shakerSort(arrayRandom(10, 100));
        //shakerSort(arrayFromConsole());
    }

    //4.2.1. Пузырьковая сортировка
    public static int[] bubbleSort(int[] array) {
        System.out.println("Массив имеет следующий вид: ");
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buf = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buf;
                }
            }
        }
        System.out.println("Отсортированный массив имеет следующий вид: ");
        System.out.println(Arrays.toString(array));
        return array;
    }

    //4.2.2. Шейкерная сортировка
    public static int[] shakerSort(int[] array) {
        System.out.println("Массив имеет следующий вид: ");
        System.out.println(Arrays.toString(array));
        int leftCount = 0;
        int rightCount = array.length - 1;
        int buf;
        do {
            for (int i = leftCount; i < rightCount; i++) {
                if (array[i] > array[i + 1]) {
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
            rightCount--;
            for (int i = rightCount; i > leftCount; i--) {
                if (array[i] < array[i - 1]) {
                    buf = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buf;
                }
            }
            leftCount++;
        } while (leftCount < rightCount);
        System.out.println("Отсортированный массив имеет следующий вид: ");
        System.out.println(Arrays.toString(array));
        return array;
    }
}
