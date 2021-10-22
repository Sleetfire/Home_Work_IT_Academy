package home_work_6.search;

import home_work_6.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    /**
     *
     * @param text строка с текстом
     * @param word слово,которое необходимо найти
     * @return
     */
    @Override
    public long search(String text, String word) {
        long counter = 0;
        try {
            Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.UNICODE_CASE);
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                counter++;
            }
        } catch (NullPointerException e1) {
            System.out.println(e1.getMessage());
        }
        return counter;
    }
}
