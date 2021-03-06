package home_work_6.search;

import home_work_6.WorkWithCollections;
import home_work_6.search.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    /**
     *
     * @param text строка с текстом
     * @param word слово,которое необходимо найти
     * @return
     */
    @Override
    public long search(String text, String word) {
        if (word == null) {
            return 0;
        }
        WorkWithCollections temp = new WorkWithCollections();
        int firstBorder;
        int lastBorder;
        int index0 = -word.length();
        int index = 0;
        long counter = 0;
        try {
            if (text.contains(word)) {
                while (index != -1) {
                    try {
                        index = text.indexOf(word, index0 + word.length());
                        index0 = index;
                        firstBorder = index - 1;
                        lastBorder = index + word.length();
                        if (firstBorder >= 0 && lastBorder <= text.length() - 1) {
                            if ((!temp.isAllowedSymbol(text.charAt(firstBorder)) && !temp.isAllowedSymbol(text.charAt(lastBorder)))) {
                                counter++;
                            }
                        } else if (firstBorder == -1 || lastBorder == text.length()) {
                            counter++;
                        }
                    } catch (StringIndexOutOfBoundsException e1) {
                        System.out.println(e1.getMessage());
                    }
                }
            }
        } catch (NullPointerException e2) {
            System.out.println(e2.getMessage());
        }
        return counter;
    }
}
