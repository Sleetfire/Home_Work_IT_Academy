package home_work_plus.ratesMonitoring.printers;

import home_work_plus.ratesMonitoring.printers.api.IPrinter;

import java.time.LocalDate;
import java.util.Objects;

public class ConsolePrinter implements IPrinter {
    @Override
    public String printInfo(String course, String change, String name) {
        int count;
        LocalDate data = LocalDate.now();

        if (!Objects.equals("RUB", name)) {
            count = 1;
        } else {
            count = 100;
        }
        return count + " " + name + "\n" + course + "\n" + "Изменение курса: " + change + "\n" + data;
    }
}
