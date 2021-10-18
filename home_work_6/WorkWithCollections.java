package home_work_6;

import java.util.*;
import java.util.regex.Pattern;

public class WorkWithCollections {

    public Set<String> searchExclusiveWords(String str) {
        Set<String> words = new HashSet<>();
        //String [] strArr = str.split("[^А-Яа-я0-9\\-][-]");
        String[] strArr = str.split("[^А-Яа-я0-9\\-]");
        for (int i = 0; i < strArr.length; i++) {
            words.add(strArr[i]);
        }
        return words;
    }

    public boolean isRussianLetter(char symbol) {
        symbol = Character.toUpperCase(symbol);
        int numberValue = symbol;
        return (numberValue >= 1040 && numberValue <= 1071) || numberValue == 1025;
    }

    public boolean isEnglishLetter(char symbol) {
        symbol = Character.toUpperCase(symbol);
        int numberValue = symbol;
        return numberValue >= 65 && numberValue <= 90;
    }

    public boolean isLetter(char symbol) {
        return isEnglishLetter(symbol) || isRussianLetter(symbol);
    }

    public boolean isFigure(char symbol) {
        int numberValue = symbol;
        return numberValue >= 48 && numberValue <= 57;
    }

    public boolean isAllowedSymbol (char symbol) {
        return isLetter(symbol) || isFigure(symbol);
    }

    public boolean isDash(char symbol) {
        return (int) symbol == 45;
    }

    public String[] splitStringByGap(String str) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:|!|\\.)\\s*");
        return pattern.split(str.trim());
    }

    public Set<String> exclusiveWords(String str) {
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

    public Map<String, Integer> fillMap(Set<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, 1);
        }
        return map;
    }

    public Map<String, Integer> fillMap(String str) {
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

    public List mapSort(Map<String, Integer> map) {
        List list = new ArrayList(map.entrySet());
        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return b.getValue() - a.getValue();
            }
        });
        return list;
    }

    public void printTopRecords(List list, int records) {
        for (int i = 0; i < records; i++) {
            System.out.println(list.get(i));
        }
    }

}
