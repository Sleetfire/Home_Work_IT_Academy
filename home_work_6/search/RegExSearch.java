package home_work_6.search;

import home_work_6.search.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long counter = 0;
        //Pattern pattern = Pattern.compile("(?:^|[^a-zA-Zа-яА-ЯёЁ])(?:" + word + ")(?![a-zA-Zа-яА-ЯёЁ])");
        //Pattern pattern = Pattern.compile("\\b" + word + "\\b", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
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