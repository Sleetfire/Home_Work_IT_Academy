package home_work_plus.ratesMonitoring.printers;

import home_work_plus.ratesMonitoring.printers.api.IPrinter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements IPrinter {

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public FilePrinter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String printInfo(String course, String change, String name) {
        String info = name + "-" + course;
        try (BufferedWriter outWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            outWriter.write(info);
            outWriter.newLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
