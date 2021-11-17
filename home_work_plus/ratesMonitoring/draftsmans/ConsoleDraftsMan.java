package home_work_plus.ratesMonitoring.draftsmans;

import home_work_plus.ratesMonitoring.draftsmans.api.IDraftsMan;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ConsoleDraftsMan implements IDraftsMan {

    private String[][] graph;
    private final List<String> dataAndTimeList = new ArrayList<>();
    private List<Double> numberList;

    /**
     * Метод, который рисует график и информацию к нему
     *
     * @param info     строка, из которой нужно достать информацию
     * @param currency валюта, на основе которой формируем график и дополнительную информацию к нему
     */
    @Override
    public void draw(String info, String currency) {
        String[] lines = splitByRegex(info, "\n");
        List<String> stringList;

        List<Double> sortedNumberList;
        stringList = searchByCurrency(lines, currency);

        stringList = reverseList(stringList);
        numberList = getCurrencyValues(stringList);

        getDateAndTime(stringList);
        sortedNumberList = numberList.stream()
                .sorted((Comparator.reverseOrder()))
                .collect(Collectors.toList());

        sortedNumberList = sortedNumberList.stream().
                distinct().
                collect(Collectors.toList());

        graph = new String[sortedNumberList.size() + 2][numberList.size() + 7];
        fillArrayByBlanks(" ");
        drawAxis(sortedNumberList);
        addPointsToGraph(sortedNumberList);
    }

    /**
     * Метод, который переворачивает коллекцию
     *
     * @param stringList коллекция строк
     * @return перевернутая коллекция строк
     */
    private List<String> reverseList(List<String> stringList) {
        if (stringList.size() > 10) {
            Collections.reverse(stringList);
            stringList = stringList.stream()
                    .limit(10)
                    .collect(Collectors.toList());
        }
        return stringList;
    }

    /**
     * Метод, который выводит график и информацию к нему в консоль
     */
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

    /**
     * Метод, который добавляет точки в поле графика
     *
     * @param sortedNumberList отсортированная по уменьшению коллекция значений курсов
     */
    private void addPointsToGraph(List<Double> sortedNumberList) {
        int index1;
        int index2;
        for (Double number : numberList) {
            index1 = numberList.indexOf(number);
            numberList.set(index1, (double) -1);
            index2 = sortedNumberList.indexOf(number);
            graph[index2][index1 + 2] = "*";
        }
    }

    /**
     * Метод, который добавляет оси и подписи к ним
     *
     * @param sortedNumberList отсортированная по уменьшению коллекция значений курсов
     */
    private void drawAxis(List<Double> sortedNumberList) {

        for (int i = 0; i < sortedNumberList.size(); i++) {
            graph[i][0] = String.format("%.3f", sortedNumberList.get(i));
            graph[i][1] = "#";
        }

        for (int j = 0; j < numberList.size(); j++) {
            graph[sortedNumberList.size()][j + 4] = "#";
            graph[sortedNumberList.size() + 1][j + 4] = "" + (j);
        }
    }

    /**
     * Метод, который заполняет поле графика переданными в него элементами
     *
     * @param element строковый символ
     */
    private void fillArrayByBlanks(String element) {
        for (String[] value : graph) {
            Arrays.fill(value, element);
        }
    }

    /**
     * Метод, который разбивает строку по переданному в него выражению
     *
     * @param line  строка, которую нужно разбить
     * @param regex выражение, на основе которого будет происходить разбитие
     * @return массив строк, которые получились в процессе разбиения
     */
    private String[] splitByRegex(String line, String regex) {
        return line.split(regex);
    }

    /**
     * Метод, который ищет строки с нужной валютой, а потом добавляет их в коллекцию
     *
     * @param stringArray массив строк, в котором нужно найти строки с определенной валютой
     * @param currency    валюта
     * @return коллекцию со строками, внутри которых есть переданная валюта
     */
    private List<String> searchByCurrency(String[] stringArray, String currency) {
        List<String> stringList = new ArrayList<>();
        for (String str : stringArray) {
            if (str.contains(currency)) {
                stringList.add(str);
            }
        }
        return stringList;
    }

    /**
     * Метод, который получает список значений курса валют
     *
     * @param stringList список со строками, внутри которых лежат значения курса валют
     * @return список со значениями курса валют
     */
    private List<Double> getCurrencyValues(List<String> stringList) {
        List<Double> list = new ArrayList<>();
        for (String s : stringList) {
            try {
                list.add(Double.parseDouble(searchInfo(s, "[0-9].[0-9]{4}")));
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        return list;
    }

    /**
     * Метод, который ищет в списке строк дату и время, а потом записывает их в свой список
     *
     * @param stringList список строк
     */
    private void getDateAndTime(List<String> stringList) {
        for (String s : stringList) {
            dataAndTimeList.add(searchInfo(s, "[0-9]{4}-[0-9]{2}-[0-9]{2}T[0-9]{2}:[0-9]{2}"));
        }
    }

    /**
     * Метод, который ищет в строке информацию, которая удовлетворяет переданному регулярному выражению
     *
     * @param str   строка, где надо найти информацию
     * @param regex регулярное выражение, на основе которого будет производиться поиск
     * @return найденная информация
     */
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
