package home_work_6;

import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {

        String actual = null;
        try {
            Path fileName = Path.of("book.txt");
            actual = Files.readString(fileName);
            //System.out.println(actual);
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        }
        //System.out.println(exclusiveWords(actual));

//        System.out.println(exclusiveWords("привет, как дела!"));
//        System.out.println(exclusiveWords("привет,какдела!"));
//        System.out.println(exclusiveWords("привет;какдела!"));
//        System.out.println(exclusiveWords("как дела!.Что делаешь?"));
//        System.out.println(exclusiveWords("Привет-привет"));
//        System.out.println(exclusiveWords("Привет -привет"));
//        System.out.println(exclusiveWords("4-х"));
//        System.out.println(exclusiveWords("один и 1"));
//        System.out.println(exclusiveWords("бабушка бабушке бабушку"));

//

        printTopRecords(mapSort(fillMap(actual)), 10);

        EasySearch easySearch = new EasySearch();

        System.out.println(easySearch.search(actual, "не"));
        System.out.println(new RegExSearch().search(actual, "не"));
        System.out.println(mapSort(fillMap(actual)).get(0));

    }

    public static Set<String> searchExclusiveWords(String str) {
        Set<String> words = new HashSet<>();
        //String [] strArr = str.split("[^А-Яа-я0-9\\-][-]");
        String[] strArr = str.split("[^А-Яа-я0-9\\-]");
        for (int i = 0; i < strArr.length; i++) {
            words.add(strArr[i]);
        }
        return words;
    }

    public static boolean isRussianLetter(char symbol) {
        symbol = Character.toUpperCase(symbol);
        int numberValue = symbol;
        return (numberValue >= 1040 && numberValue <= 1071) || numberValue == 1025;
    }

    public static boolean isEnglishLetter(char symbol) {
        symbol = Character.toUpperCase(symbol);
        int numberValue = symbol;
        return numberValue >= 65 && numberValue <= 90;
    }

    public static boolean isLetter(char symbol) {
        return isEnglishLetter(symbol) || isRussianLetter(symbol);
    }

    public static boolean isFigure(char symbol) {
        int numberValue = symbol;
        return numberValue >= 48 && numberValue <= 57;
    }

    public static boolean isDash(char symbol) {
        return (int) symbol == 45;
    }

    public static String[] splitStringByGap(String str) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:|\\?|!|\\.)\\s*");
        return pattern.split(str.trim());
    }

    public static Set<String> exclusiveWords(String str) {
        String[] stringArray = splitStringByGap(str);
        StringBuilder word = new StringBuilder();
        Set<String> words = new HashSet<>();
        for (String s : stringArray) {
            for (int j = 0; j < s.length(); j++) {
                if (isLetter(s.charAt(j)) || isFigure(s.charAt(j)) || isDash(s.charAt(j))) {
                    word.append(s.charAt(j));
                }
            }
            if (word.length() > 0) {
                if (word.charAt(0) == '-') {
                    word.setCharAt(0, ' ');
                } else if (word.charAt(word.length() - 1) == '-') {
                    word.setCharAt(word.length() - 1, ' ');
                }
            } else {
                continue;
            }
            words.add(word.toString().trim());
            word = new StringBuilder();
        }
        return words;
    }

    public static Map<String, Integer> fillMap(Set<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, 1);
        }
        return map;
    }

    public static Map<String, Integer> fillMap(String str) {
        String[] stringArray = splitStringByGap(str);
        StringBuilder word = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringArray) {
            for (int j = 0; j < s.length(); j++) {
                if (isLetter(s.charAt(j)) || isFigure(s.charAt(j))) {
                    word.append(s.charAt(j));
                }
            }

            if (word.length() > 0) {
                if (word.charAt(0) == '-') {
                    word.setCharAt(0, ' ');
                } else if (word.charAt(word.length() - 1) == '-') {
                    word.setCharAt(word.length() - 1, ' ');
                }
            } else {
                continue;
            }

            if (!map.containsKey(word.toString())) {
                map.put(word.toString(), 1);
            } else {
                int value = map.get(word.toString());
                map.remove(word.toString());
                value++;
                map.put(word.toString(), value);
            }
            word = new StringBuilder();
        }
        return map;
    }

    public static List mapSort(Map<String, Integer> map) {
        List list = new ArrayList(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        return list;
    }

    public static void printTopRecords(List list, int records) {
        for (int i = 0; i < records; i++) {
            System.out.println(list.get(i));
        }
    }
}


