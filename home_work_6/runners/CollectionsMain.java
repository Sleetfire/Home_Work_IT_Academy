package home_work_6.runners;

import home_work_6.search.EasySearch;
import home_work_6.search.RegExSearch;
import home_work_6.WorkWithCollections;
import home_work_6.utils.FileHandler;

public class CollectionsMain {
    public static void main(String[] args) {

        String actual = FileHandler.parseFileToString("book.txt");
        WorkWithCollections workWithCollections = new WorkWithCollections();

        System.out.println("Работа с примерами из задания:");
        System.out.println(workWithCollections.exclusiveWords("привет, как дела!"));
        System.out.println(workWithCollections.exclusiveWords("привет,какдела!"));
        System.out.println(workWithCollections.exclusiveWords("привет;какдела!"));
        System.out.println(workWithCollections.exclusiveWords("как дела!.Что делаешь?"));
        System.out.println(workWithCollections.exclusiveWords("Привет-привет"));
        System.out.println(workWithCollections.exclusiveWords("Привет -привет"));
        System.out.println(workWithCollections.exclusiveWords("4-х"));
        System.out.println(workWithCollections.exclusiveWords("один и 1"));
        System.out.println(workWithCollections.exclusiveWords("бабушка бабушке бабушку"));
        System.out.println("__________________________________________________");
        System.out.printf("Количество рахных слов в файле Война и мир: %d\n", workWithCollections.exclusiveWords(actual)
                .size());
        System.out.println("__________________________________________________");
        int n = 15;
        System.out.printf("Топ %d частовстречающихся слов в файле Война и мир:\n", n);
        workWithCollections.printTopRecords(workWithCollections.mapSort(workWithCollections.fillMap(actual)), 15);
        System.out.println("_______________________________________________________________________________________");
        String word = "и";
        System.out.printf("Поиск слова '%s' с помощью обычного поиска(1) и поиска с регулярными выражениями(2):\n", word);
        System.out.println("(1) " + new EasySearch().search(actual, word));
        System.out.println("(2) " + new RegExSearch().search(actual, word));
    }
}


