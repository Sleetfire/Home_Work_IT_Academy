package home_work_plus.ratesMonitoring.draftsmans;

import home_work_plus.ratesMonitoring.draftsmans.api.IDraftsMan;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ConsoleDraftsMan implements IDraftsMan {

    String[][] graph;
    List<String> dataAndTimeList = new ArrayList<>();

    @Override
    public void draw(String info, String currency) {
        String[] lines = splitByRegex(info, "\n");
        List<String> stringList;
        List<Double> numberList;
        List<Double> sortedNumberList;
        stringList = searchByCurrency(lines, currency);

        if (stringList.size() > 10) {
            Collections.reverse(stringList);
            stringList = stringList.stream()
                    .limit(10)
                    .collect(Collectors.toList());
        }
        numberList = getCurrencyValues(stringList);

        getDateAndTime(stringList);
        sortedNumberList = numberList.stream()
                .sorted((Comparator.reverseOrder()))
                .collect(Collectors.toList());

        graph = new String[numberList.size() + 2][numberList.size() + 7];
        fillArrayByBlanks();
        drawAxis(sortedNumberList);
        addPointsToGraph(numberList, sortedNumberList);
    }

    public void showGraph() {
        for (String[] strings : graph) {
            System.out.println();
            for (String string : strings) {
                System.out.print(string + " ");
            }
        }
        System.out.println();
        System.out.println("\n\t\t__Время измерений__");
        for (int i = 0; i < dataAndTimeList.size(); i++) {
            System.out.println("        " + i + ". " + dataAndTimeList.get(i));
        }
    }

    private void addPointsToGraph(List<Double> numberList, List<Double> sortedNumberList) {
        int index1;
        int index2;
        for (Double number : numberList) {
            index1 = numberList.indexOf(number);
            index2 = sortedNumberList.indexOf(number);
            graph[index2][index1 + 2] = "*";
        }
    }

    private void drawAxis(List<Double> sortedNumberList) {
        for (int i = 0, j = 0; i < graph.length && j < sortedNumberList.size(); i++, j++) {
            graph[j][0] = String.format("%.3f", sortedNumberList.get(j));
            graph[i][1] = "#";
            graph[sortedNumberList.size()][i + 4] = "#";
            graph[sortedNumberList.size() + 1][i + 4] = "" + (j);
        }
    }

    private void fillArrayByBlanks() {
        for (String[] value : graph) {
            Arrays.fill(value, " ");
        }
    }

    private String[] splitByRegex(String line, String regex) {
        return line.split(regex);
    }

    private List<String> searchByCurrency(String[] stringArray, String currency) {
        List<String> stringList = new ArrayList<>();
        for (String str : stringArray) {
            if (str.contains(currency)) {
                stringList.add(str);
            }
        }
        return stringList;
    }

    private List<Double> getCurrencyValues(List<String> stringList) {
        List<Double> numberList = new ArrayList<>();
        for (String s : stringList) {
            try {
                numberList.add(Double.parseDouble(searchInfo(s, "[0-9].[0-9]{4}")));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }

        }
        return numberList;
    }

    private void getDateAndTime(List<String> stringList) {
        for (String s : stringList) {
            dataAndTimeList.add(searchInfo(s, "[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}"));
        }
    }

    private String searchInfo(String str, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        String result = null;
        matcher = pattern.matcher(str);
        if (matcher.find()) {
            result = str.substring(matcher.start(), matcher.end());
        }
        return result;
    }

}
