package home_work_plus.ratesMonitoring.downloaders.api;

public interface IDownloader {

    /**
     * Метод, который принимает адрес, чтобы скачать информацию и записать в строку
     *
     * @param address адрес
     * @return строка с информацией
     */
    String downloadToString(String address);

}
