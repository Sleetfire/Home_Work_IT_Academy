package home_work_6.search.api;

public interface ISearchEngine {

    /**
     * Метод, который выполняет поиск количества слов в строке
     * @param text строка с текстом
     * @param word слово,которое необходимо найти
     * @return возвращает количество слов в строке
     */
    long search(String text, String word);
}
