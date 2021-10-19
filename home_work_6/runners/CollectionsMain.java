package home_work_6.runners;

import home_work_6.search.EasySearch;
import home_work_6.search.RegExSearch;
import home_work_6.WorkWithCollections;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CollectionsMain {
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

        WorkWithCollections workWithCollections = new WorkWithCollections();

        workWithCollections.printTopRecords(workWithCollections.mapSort(workWithCollections.fillMap(actual)), 15);

        EasySearch easySearch = new EasySearch();

        System.out.println(easySearch.search(actual, "я"));
        System.out.println(new RegExSearch().search(actual, "я"));

        String str = "Привет,                                           друг";
        System.out.println(str.replaceAll("[\\-\\+\\.\\?\\!\\n\\t\\^:,]", "").replaceAll("\\s{2,}", " "));

    }
}


