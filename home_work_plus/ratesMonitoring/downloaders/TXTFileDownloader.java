package home_work_plus.ratesMonitoring.downloaders;

import home_work_plus.ratesMonitoring.downloaders.api.IDownloader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class TXTFileDownloader implements IDownloader {
    @Override
    public String downloadToString(String address) {
        String str = null;
        try {
            Path file = Path.of(address);
            str = Files.readString(file);
        } catch (IOException | InvalidPathException | NullPointerException e1) {
            System.out.println(e1.getMessage());
        }
        return str;
    }
}
