package home_work_plus.strings_numerals.api;

public interface INumeralTranslator {

    /**
     * Метод, который выполняет конвертацию переданного числа в число прописью
     *
     * @param number число
     * @return число прописью
     */
    String toString(int number);

    /**
     * Метод, который выполняет конвертацию переданного дробного числа в число прописью
     *
     * @param number дробное число
     * @return дробное число прописью
     */
    String toString(double number);

    /**
     * Метод, который считает количество недель по переданному числу дней
     *
     * @param day число дней
     * @return количество недель
     */
    String toWeek(int day);

    /**
     * Метод, который конвертирует милисекунды в количество часов, минут, секунд и милисекунд
     *
     * @param millisecond количество милисекунд
     * @param shortFormat true - короткий формат (HH:mm:ss.SSS), false - полный формат
     * @return короткое или нормальное написание
     */
    String toHoursMinuteSecondMillisecond(long millisecond, boolean shortFormat);

}
