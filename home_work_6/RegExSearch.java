package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExSearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        long counter = 0;
        //Pattern pattern = Pattern.compile("(?:^|[^a-zA-Zа-яА-ЯёЁ])(?:" + word + ")(?![a-zA-Zа-яА-ЯёЁ])");
        Pattern pattern = Pattern.compile("\\b" + word + "\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            counter++;
        }
        return counter;
    }
}
