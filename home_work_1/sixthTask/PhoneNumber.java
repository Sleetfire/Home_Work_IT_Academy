package home_work_1.sixthTask;

//6.* Создать СТАТИЧЕСКИЙ метод createPhoneNumber рядом с методом main, данный метод будет принимает один параметр и будет возвращать строку в отформатированном
// виде. В метод будет передаваться массив из 10 цифр (от 0 до 9). Данные цифры должны быть помещены в строку формата: (XXX) XXX-XXXX.
// Например передан массив: {1,2,3,4,5,6,7,8,9,0},возвращаемый результат: (123) 456-7890.
// (Взято с https://www.codewars.com/kata/525f50e3b73515a6db000b83/train/java). В задании нельзя использовать колекции, стрима.


public class PhoneNumber {

    public static void main(String[] args) {

        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

    }

    // Решение в лоб, codewars решение принял

    public static String createPhoneNumber(int[] numbers) {

        if (numbers.length == 0) return "Нулевой массив!";

        if (numbers.length > 10) return "Слишком большой массив!";

        return "(" + numbers[0] + numbers[1] + numbers[2] + ") " + numbers[3] + numbers[4] + numbers[5] + "-" + numbers[6] +
                numbers[7] + numbers[8] + numbers[9];

    }

}
