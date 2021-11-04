package home_work_plus.ratesMonitoring.utils;

import java.time.LocalDate;
import java.util.Objects;

public class ConsolePrintUtil {

    public static String printInfoInConsole(String course, String change, String name) {
        int count;
        LocalDate data = LocalDate.now();

        if (!Objects.equals("RUB", name)) {
            count = 1;
        } else {
            count = 100;
        }
        return count + " " + name + "\n" + course + " BYN" + "\n" + "Изменение курса: " + change + "\n" + data;
    }
}
