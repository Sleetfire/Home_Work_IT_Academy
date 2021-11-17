package home_work_plus.ratesMonitoring.printers.api;

public interface IPrinter {

    /**
     * Метод, который формирует строку с информацией о курсе, изменении и названии валюты
     *
     * @param course значение курса валют
     * @param change изменение курса валют
     * @param name   название курса валют
     * @return строку с информацией о курсе, изменении и названии валюты
     */
    String printInfo(String course, String change, String name);
}
