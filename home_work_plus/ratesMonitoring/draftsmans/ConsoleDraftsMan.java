package home_work_plus.ratesMonitoring.draftsmans;

import home_work_plus.ratesMonitoring.draftsmans.api.IDraftsMan;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ConsoleDraftsMan implements IDraftsMan {

    String[][] graph;

    @Override
    public void draw(String info, String currency) {
        String[] lines = splitByRegex(info, "\n");
        List<String> stringList;
        List<Double> numberList;
        List<Double> sortedNumberList;
        stringList = searchByCurrency(lines, currency);
        numberList = getCurrencyValues(stringList);
        sortedNumberList = numberList.stream()
                .sorted((Comparator.reverseOrder()))
                .collect(Collectors.toList());

        graph = new String[numberList.size() + 1][numberList.size() + 7];
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
            numberList.add(searchDoubleCursNumber(s));
        }
        return numberList;
    }

    private double searchDoubleCursNumber(String str) {
        Pattern pattern = Pattern.compile("[0-9].[0-9]{4}");
        Matcher matcher;
        double number = 0;
        matcher = pattern.matcher(str);
        if (matcher.find()) {
            try {
                number = Double.parseDouble(str.substring(matcher.start(), matcher.end()));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return number;
    }

}
