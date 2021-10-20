package home_work_6.runners;

import home_work_6.search.RegExSearch;
import home_work_6.utils.FileHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;
import java.util.Scanner;

public class WorkWithFilesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String directoryPath;
        File dir;
        do {
            System.out.println("Введите адрес папки, из которой будем считывать текстовые файлы:");
            directoryPath = scanner.nextLine();
            dir = new File(directoryPath);
        } while (!dir.isDirectory());

        String[] files = dir.list();
        assert files != null;
        for (String file : files) {
            if (file.contains(".txt")) {
                System.out.println(file);
            }
        }
        System.out.println("Введите название файла, который хотите открыть:");
        String fileName = scanner.nextLine();
        String text = FileHandler.parseFileToString(fileName);
        searchWordAndWriteInFile(fileName, text);

    }

    public static void searchWordAndWriteInFile(String fileName, String text) {
        String word;
        Scanner scanner = new Scanner(System.in);
        RegExSearch regExSearch = new RegExSearch();
        long numberOfWords;
        BufferedWriter outWriter;
        try {
            outWriter = new BufferedWriter(new FileWriter("result.txt", true));
            String note;
            do {
                System.out.println("Введите слово, которое хотите найти в файле");
                System.out.println("Для выхода нажмите 'f'");
                word = scanner.nextLine();
                numberOfWords = regExSearch.search(text, word);
                if (!Objects.equals("f", word)) {
                    System.out.println(String.format("Слово '%s' повторяется %d раз", word, numberOfWords));
                    note = fileName + " – " + word + " – " + numberOfWords;

                    if (numberOfWords >= 0) {
                        outWriter.newLine();
                        outWriter.write(note);
                    }
                } else {
                    System.out.println("Выход");
                }
            } while (!Objects.equals("f", word));
            outWriter.flush();
            outWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
