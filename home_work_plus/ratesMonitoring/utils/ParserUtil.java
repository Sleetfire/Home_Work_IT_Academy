package home_work_plus.ratesMonitoring.utils;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserUtil {

    public static List<String> parseNumber(List<String> list) {
        Pattern pattern = Pattern.compile("[0-9].[0-9]{4}");
        Matcher matcher;
        boolean flag = true;
        String str;

        for (int i = 0; i < list.size(); i++) {
            str = list.get(i);
            if (str.contains("minus")) {
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
