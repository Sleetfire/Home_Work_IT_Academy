package fourthTask;

//4.* Создать СТАТИЧЕСКИЙ метод sleepIn рядом с методом main. (Взято с https://codingbat.com/prob/p187868).
//        4.1 Данный метод будет принимать два параметра
//        4.2 Будет отвечать на вопрос спать ли дальше (возвращать true либо false).
//        4.3 Первый параметр boolean weekday обозначает рабочий день
//        4.4 Второй параметр boolean vacation обозначает отпуск.
//        4.5 Если у нас отпуск или не рабочий день то мы можем спать дальше
//        4.6 На основании ответа от метода sleepIn вывести сообщение можем спать дальше или пора идти на работу

public class Sleep {

    public static void main(String[] args) {

        System.out.println(sleepIn1(false, false));
        System.out.println(sleepIn1(true, false));
        System.out.println(sleepIn1(false, true));
        System.out.println(sleepIn1(true, true));

        System.out.println("_________________________");

        System.out.println(sleepIn2(false, false));
        System.out.println(sleepIn2(true, false));
        System.out.println(sleepIn2(false, true));
        System.out.println(sleepIn2(true, true));

    }

    public static boolean sleepIn1(boolean weekday, boolean vacation) { // решение в лоб

        if (weekday == false && vacation == false) return true;
        else if (weekday == true && vacation == false) return false;
        else if (weekday == false && vacation == true) return true;
        else return true;

    }

    public static boolean sleepIn2 (boolean weekday, boolean vacation) { // лаконичное решение

        if (!weekday) {
            return true;
        } else if (vacation) return true;
        else return false;

    }

}
