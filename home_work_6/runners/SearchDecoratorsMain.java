package home_work_6.runners;

import home_work_6.search.EasySearch;
import home_work_6.search.RegExSearch;
import home_work_6.search.api.ISearchEngine;
import home_work_6.search.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.search.decorators.SearchWithoutCase;
import home_work_6.utils.FileHandler;

import java.util.Scanner;

public class SearchDecoratorsMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = FileHandler.parseFileToString("book.txt");
        System.out.println("Введите слово, которое желаете найти: ");
        String word = scanner.nextLine();

        System.out.println("Поиск с помощью регулярных выражений");
        printSearchingWithDeleteGarbage(new RegExSearch(), word, text);
        System.out.println("Поиск с помощью indexOf()");
        printSearchingWithDeleteGarbage(new EasySearch(), word, text);

        System.out.println("Поиск с помощью регулярных выражений");
        printSearchingWithoutCase(new RegExSearch(), word, text);
        System.out.println("Поиск с помощью indexOf()");
        printSearchingWithoutCase(new EasySearch(), word, text);
    }

    public static void printSearchingWithDeleteGarbage(ISearchEngine iSearchEngine, String word, String text) {
        System.out.println("Поиск после удаления ненужных символов: ");
        ISearchEngine search = new SearchEnginePunctuationNormalizer(iSearchEngine);
        String temp = "Слова '%s' в этом тексте повторяется %d раз%n";
        System.out.printf(temp, word, search.search(text, word));
    }

    public static void printSearchingWithoutCase(ISearchEngine iSearchEngine, String word, String text) {
        String temp = "Слова '%s' в этом тексте повторяется %d раз%n";
        System.out.println("Поиск без учета регистра: ");
        ISearchEngine searchWithoutCase = new SearchWithoutCase(new RegExSearch());
        if (searchWithoutCase instanceof SearchWithoutCase) {
            SearchWithoutCase searchWithoutCase1 = (SearchWithoutCase) searchWithoutCase;
            if (searchWithoutCase1.getISearchEngine() instanceof EasySearch) {
                word = searchWithoutCase1.makeLowerCase(word);
                text = searchWithoutCase1.makeLowerCase(text);
                System.out.printf(temp, word, searchWithoutCase.search(text, word));
            } else if (searchWithoutCase1.getISearchEngine() instanceof RegExSearch) {
                String word1 = searchWithoutCase1.makeRegexLoweCase(word);
                System.out.printf(temp, word, searchWithoutCase.search(text, word1));
            }
        }
    }
}
