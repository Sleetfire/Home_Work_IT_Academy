package home_work_6;

import home_work_6.api.ISearchEngine;

import java.util.Locale;

public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        WorkWithCollections temp = new WorkWithCollections();
        int firstBorder;
        int lastBorder;
        int index = 0;
        long counter = 0;
        if (text.contains(word)) {
            while (index != -1) {
                try {
                    index = text.indexOf(word, index + word.length());
                    firstBorder = index - 1;
                    lastBorder = index + word.length();
                    if (firstBorder >= 0 && lastBorder <= text.length() - 1) {
                        if ((!temp.isAllowedSymbol(text.charAt(firstBorder)) && !temp.isAllowedSymbol(text.charAt(lastBorder)))) {
                            counter++;
                        }
                    }
                } catch (StringIndexOutOfBoundsException e1) {
                    System.out.println(e1.getMessage());
                }
            }
        }
        return counter;
    }
}


//    long counter = 0;
//    WorkWithCollections a = new WorkWithCollections();
//    int index = -word.length();
//        do {
//                index = text.indexOf(word, index + word.length());
//                if (index > 0 && !(a.isLetter(text.charAt(index - 1)) && a.isAllowedSymbol(text.charAt(index + word.length())))) {
//                counter++;
//                }
//                } while (index != -1);
//                return counter - 1;