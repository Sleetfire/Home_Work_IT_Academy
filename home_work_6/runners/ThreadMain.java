package home_work_6.runners;

import home_work_6.search.RegExSearch;
import home_work_6.utils.FileHandler;
import home_work_6.utils.Trimmer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ThreadMain {
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
        List<String> txtFilesList = new ArrayList<>();
        String fullFilePathBuffer;
        if (files != null) {
            for (String file : files) {
                if (file.contains(".txt")) {
                    fullFilePathBuffer = directoryPath + "\\" + file;
                    txtFilesList.add(fullFilePathBuffer);
                }
            }
        }
        List<Thread> threads = new ArrayList<>();
        String word;
        do {
            System.out.println("Введите слово, которое хотите найти в файле");
            System.out.println("Для выхода нажмите 'f(F)'");
            word = scanner.nextLine();
            for (String value : txtFilesList) {
                String finalWord = word;
                Thread th = new Thread(() -> {
                    String text = FileHandler.parseFileToString(value);
                    searchWordAndWriteInFile(value, text, finalWord, files);
                });
                th.start();
                threads.add(th);
            }
            for (Thread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } while (!Objects.equals("f", word) && !Objects.equals("F", word));
    }

    /**
     * Метод, который ищет слово, а потом записывает его в файл
     *
     * @param fileName название файла, где искали текст, чтобы потом записать его в файл с результатами
     * @param text     строка, в которую было записано содержимое файла
     */
    public static void searchWordAndWriteInFile(String fileName, String text, String word, String[] files) {
        RegExSearch regExSearch = new RegExSearch();
        long numberOfWords;
        try (BufferedWriter outWriter = new BufferedWriter(new FileWriter("result.txt", true))){
            String note;
            numberOfWords = regExSearch.search(text, word);
            if (!Objects.equals("f", word) && !Objects.equals("F", word)) {
                note = Trimmer.trimPath(fileName, files) + " – " + word + " – " + numberOfWords;
                if (numberOfWords >= 0) {
                    outWriter.newLine();
                    outWriter.write(note);
                }
            }
            outWriter.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
