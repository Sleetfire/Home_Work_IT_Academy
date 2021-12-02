package home_work_plus.strings_numerals;

public class Main {
    public static void main(String[] args) {
        NumeralTranslator translator = new NumeralTranslator();
        System.out.println(translator.toHoursMinuteSecondMillisecond(12345, false));

    }
}
