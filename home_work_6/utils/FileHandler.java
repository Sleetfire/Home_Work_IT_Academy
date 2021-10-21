package home_work_6.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;

public class FileHandler {

    public static String parseFileToString(String fileName) {
        String str = null;
        try {
            Path file = Path.of(fileName);
            str = Files.readString(file);
        } catch (IOException e1) {
            System.out.println(e1.getMessage());
        } catch (InvalidPathException e2) {
            System.out.println(e2.getMessage());
        } catch (NullPointerException e3) {
            System.out.println(e3.getMessage());
        }
        return str;
    }
}
