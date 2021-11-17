package home_work_plus.ratesMonitoring.parsers;

import home_work_plus.ratesMonitoring.parsers.api.IParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringParser implements IParser<String> {

    /**
     * Метод, который находит в тексте информацию на основе границ
     *
     * @param text         текст, в котором ищем информацию
     * @param firstBorder  первая граница
     * @param secondBorder вторая граница
     * @return список найденных строк с информацией
     */
    @Override
    public List<String> parseByBorders(String text, String firstBorder, String secondBorder) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("(?<=" + firstBorder + ")(.*?)(?=" + secondBorder + ")", Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            list.add(text.substring(matcher.start(), matcher.end()).trim());
        }
        return list;
    }

    /**
     * Метод, который ищет дробное число меньше 10, но больше нуля. Также у него 4 знака после запятой
     * @param list список строк с информацией, где необходимо найти числа
     * @return список строк с числами
     */
    public List<String> parseNumber(List<String> list) {
        Pattern pattern = Pattern.compile("[0-9].[0-9]{4}");
        Matcher matcher;
        boolean flag = true;
        String str;
        String minus = "minus";
        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            if (str.contains(minus)) {
                flag = false;
            }
            matcher = pattern.matcher(str);
            if (matcher.find()) {
                str = str.substring(matcher.start());
            }
            if (!flag) {
                str = "-" + str;
            }
            list.set(i, str);
        }
        return list;
    }
}
