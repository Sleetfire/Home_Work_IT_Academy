package home_work_plus.ratesMonitoring.draftsmans.api;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.DoubleStream;

public class ConsoleDraftsMan implements IDraftsMan {

    @Override
    public String draw(String info, String currency) {
        String[] lines = splitByRegex(info, "\n");
        List<String> stringList = new ArrayList<>();
        List<Double> numberList = new ArrayList<>();
        for (String line : lines) {
            if (line.contains(currency)) {
                stringList.add(line);
            }
        }

        for (String s : stringList) {
            numberList.add(searchDoubleCursNumber(s));
        }

        double maxNumber = numberList.stream().max((d1, d2) -> Double.compare(d1, d2)).get();
        double k = 0.1;
        int high = (int) Math.round(maxNumber / k);
        String[][] graph = new String[10][high];

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                graph[i][j] = "#";
            }
        }
        return null;

    }

    private String[] splitByRegex(String line, String regex) {
        return line.split(regex);
    }

    private double searchDoubleCursNumber(String str) {
        Pattern pattern = Pattern.compile("[0-9].[0-9]{4}");
        Matcher matcher;
        double number = 0;
        matcher = pattern.matcher(str);
        if (matcher.find()) {
            try {
                number = Double.parseDouble(str.substring(matcher.start()));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }


}
