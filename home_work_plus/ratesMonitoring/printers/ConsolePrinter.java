package home_work_plus.ratesMonitoring.printers;

import home_work_plus.ratesMonitoring.printers.api.IPrinter;

import java.time.LocalDateTime;
import java.util.Objects;

public class ConsolePrinter implements IPrinter {

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
        int count;
        LocalDateTime dateTime = LocalDateTime.now();
        if (!Objects.equals("RUB", name)) {
            count = 1;
        } else {
            count = 100;
        }
        return count + " " + name + "\n" + course + "\n" + "Изменение курса: " + change + "\n" + dateTime;
    }
}
