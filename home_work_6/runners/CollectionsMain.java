package home_work_6.runners;

import home_work_6.search.EasySearch;
import home_work_6.search.RegExSearch;
import home_work_6.WorkWithCollections;
import home_work_6.utils.FileHandler;

public class CollectionsMain {
    public static void main(String[] args) {

        String actual = FileHandler.parseFileToString("book.txt");

//        System.out.println(exclusiveWords("привет, как дела!"));
//        System.out.println(exclusiveWords("привет,какдела!"));
//        System.out.println(exclusiveWords("привет;какдела!"));
//        System.out.println(exclusiveWords("как дела!.Что делаешь?"));
//        System.out.println(exclusiveWords("Привет-привет"));
//        System.out.println(exclusiveWords("Привет -привет"));
//        System.out.println(exclusiveWords("4-х"));
//        System.out.println(exclusiveWords("один и 1"));
//        System.out.println(exclusiveWords("бабушка бабушке бабушку"));

        WorkWithCollections workWithCollections = new WorkWithCollections();
        workWithCollections.printTopRecords(workWithCollections.mapSort(workWithCollections.fillMap(actual)), 15);
        EasySearch easySearch = new EasySearch();
        System.out.println(easySearch.search(actual, "и"));
        System.out.println(new RegExSearch().search(actual, "и"));
    }
}


