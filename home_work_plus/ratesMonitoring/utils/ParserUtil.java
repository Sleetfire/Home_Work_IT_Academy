package home_work_plus.ratesMonitoring.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserUtil {

    public static List<String> parseByBorders(String text, String firstBorder, String secondBorder) {
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("(?<=" + firstBorder + ")(.*?)(?=" + secondBorder + ")", Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            list.add(text.substring(matcher.start(), matcher.end()).trim());
        }
        return list;
    }
}
