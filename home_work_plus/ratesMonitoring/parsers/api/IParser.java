package home_work_plus.ratesMonitoring.parsers.api;

import java.util.List;

public interface IParser<T> {

    /**
     * Метод, который находит в тексте информацию на основе границ
     *
     * @param text         текст, в котором ищем информацию
     * @param firstBorder  первая граница
     * @param secondBorder вторая граница
     * @return список найденных строк с информацией
     */
    List<String> parseByBorders(T text, String firstBorder, String secondBorder);

}
