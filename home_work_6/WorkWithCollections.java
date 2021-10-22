package home_work_6;

import java.util.*;
import java.util.regex.Pattern;

public class WorkWithCollections {

    /**
     * Метод, который проверяет является ли переданный символ русской буквой
     *
     * @param symbol символ, который хотим проверить
     * @return true, если была передана русская буква, иначе false
     */
    public boolean isRussianLetter(char symbol) {
        symbol = Character.toUpperCase(symbol);
        int numberValue = symbol;
        return (numberValue >= 1040 && numberValue <= 1071) || numberValue == 1025;
    }

    /**
     * Метод, который проверяет является ли переданный символ английской буквой
     *
     * @param symbol символ, который хотим проверить
     * @return true, если была передана английская буква, иначе false
     */
    public boolean isEnglishLetter(char symbol) {
        symbol = Character.toUpperCase(symbol);
        int numberValue = symbol;
        return numberValue >= 65 && numberValue <= 90;
    }

    /**
     * Метод, который проверяет является ли переданный символ английской или русской буквой
     *
     * @param symbol символ, который хотим проверить
     * @return true, если была передана английская или русская буква, иначе false
     */
    public boolean isLetter(char symbol) {
        return isEnglishLetter(symbol) || isRussianLetter(symbol);
    }

    /**
     * Метод, который проверяет является ли переданный символ цифрой
     *
     * @param symbol символ, который хотим проверить
     * @return true, если была передана цифра, иначе false
     */
    public boolean isFigure(char symbol) {
        int numberValue = symbol;
        return numberValue >= 48 && numberValue <= 57;
    }

    /**
     * Метод, который проверяет является ли переданный символ допустимым
     *
     * @param symbol символ, который хотим проверить
     * @return true, если была передана английская или русская буква или цифра, иначе false
     */
    public boolean isAllowedSymbol(char symbol) {
        return isLetter(symbol) || isFigure(symbol);
    }

    /**
     * Метод, который проверяет является ли переданный символ тире (минус)
     *
     * @param symbol символ, который хотим проверить
     * @return true, если было передано тире (минус), иначе false
     */
    public boolean isDash(char symbol) {
        return symbol == 45;
    }

    /**
     * Метод, который разбивает строку на основе разделителя
     *
     * @param str строка, которую хотим разделить
     * @return массив слов
     */
    private String[] splitString(String str) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:|\\?|\"|!|\\.)\\s*");
        return pattern.split(str.trim());
    }

    /**
     * метод, который записывает уникальные слова в HashSet
     *
     * @param str строка, из которой будем записывать слова в HashSet
     * @return коллекцию HashSet
     */
    public Set<String> exclusiveWords(String str) {
        String[] stringArray = splitString(str);
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

    /**
     * Метод, который заполняет Map словами (Key) и их количестом (Value)
     *
     * @param str строка, из которой будем записывать слова в Map
     * @return отображение ключ-значение (слово-количество)
     */
    public Map<String, Integer> fillMap(String str) {
        String[] stringArray = splitString(str);
        StringBuilder word = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringArray) {
            for (int j = 0; j < s.length(); j++) {
                if (isAllowedSymbol(s.charAt(j))) {
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
                value++;
                map.put(word.toString(), value);
            }
            word = new StringBuilder();
        }
        return map;
    }

    /**
     * Метод, который сортирует Map
     *
     * @param map Map, которую хотим отсортировать
     * @return отсортированный список
     */
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

    /**
     * Метод, который выводит в консоль n первых слов и их количество из списка
     *
     * @param list    список, откуда хотим вывести слова
     * @param records количество слов
     */
    public void printTopRecords(List list, int records) {
        for (int i = 0; i < records; i++) {
            System.out.println(list.get(i));
        }
    }
}


