package home_work_plus.ratesMonitoring.printers;

import home_work_plus.ratesMonitoring.printers.api.IPrinter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Objects;

public class ConsolePrinter implements IPrinter {
    @Override
    public String printInfo(String course, String change, String name) {
        int count;
        LocalDateTime dateTime = LocalDateTime.now();
//        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.LONG);
//        String time = dateTime.format(formatter);

        if (!Objects.equals("RUB", name)) {
            count = 1;
        } else {
            count = 100;
        }
        return count + " " + name + "\n" + course + "\n" + "Изменение курса: " + change + "\n" + dateTime;
    }
}
