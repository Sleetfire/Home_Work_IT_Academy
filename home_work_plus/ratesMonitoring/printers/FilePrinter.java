package home_work_plus.ratesMonitoring.printers;

import home_work_plus.ratesMonitoring.printers.api.IPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class FilePrinter implements IPrinter {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public FilePrinter(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Метод, который формирует строку с информацией о курсе, изменении и названии валюты
     *
     * @param course значение курса валют
     * @param change изменение курса валют
     * @param name   название курса валют
     * @return строку с информацией о курсе, изменении и названии валюты
     */
    @Override
    public String printInfo(String course, String change, String name) {
        LocalDateTime dateTime = LocalDateTime.now();
        String info = name + "-" + course + "-" + dateTime;
        try (BufferedWriter outWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            outWriter.write(info);
            outWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
