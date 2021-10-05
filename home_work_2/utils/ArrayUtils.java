package home_work_2.utils;

//2.1. Создать класс ArraysUtils:

//2.1.1. Написать метод public static int[] arrayFromConsole() рядом с main.
// Данный метод размер массива и каждый его элемент запрашивает у пользователя через консоль.

//2.1.1.1. Пример int[] container = arrayFromConsole().
// Результат: В методе arrayFromConsole будет запрошена информация у пользователя, пользователь вводит размер (3)
// и его элементы по порядку {4, 17, 32}. Соответственно будет создан массив размером 3 с элементами {4, 17, 32} и
// сохранён в переменную container.

//2.1.2. Написать метод public static int[] arrayRandom(int size, int maxValueExclusion) рядом с main.
// Данный метод принимает два аргумента. Первый (size) указывает размер массива который мы хотим получить.
// Второй (maxValueExclusion) указывает до какого числа генерировать рандомные числа.

//2.1.2.1. Пример: int[] container = arrayRandom(5, 100).
// Результат: В методе arrayRandom будет создан массив размером 5 с числами от 0 до 99 (использовать класс Random) и
// сохранён в переменную container.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {

    public static void main(String[] args) {
        int[] array = arrayRandom(10, 10);
        System.out.println(Arrays.toString(array));
    }

    public static int[] arrayFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите " + i + " элемент массива: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int [] arrayRandom (int size, int maxValueExclusion) {
        Random random = new Random();
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValueExclusion);
        }
        return array;
    }
}
