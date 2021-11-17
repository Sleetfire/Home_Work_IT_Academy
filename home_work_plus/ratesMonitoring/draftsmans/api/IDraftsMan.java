package home_work_plus.ratesMonitoring.draftsmans.api;

public interface IDraftsMan {

    /**
     * Метод, который рисует график и информацию к нему
     * @param info строка, из которой нужно достать информацию
     * @param currency валюта, на основе которой формируем график и дополнительную информацию к нему
     */
    void draw(String info, String currency);

}
