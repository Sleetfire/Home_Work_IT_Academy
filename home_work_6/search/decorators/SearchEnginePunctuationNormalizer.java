package home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    /**
     *
     * @param text строка с текстом
     * @param word слово,которое необходимо найти
     * @return
     */
    @Override
    public long search(String text, String word) {
        text = clearText(text);
        return iSearchEngine.search(text, word);
    }

    /**
     * Метод, который удаляет в строке знаки препинания, нежелательные пробелы, переводы строки и т.д.
     * @param text
     * @return отформатированную строку
     */
    private String clearText (String text) {
        return text.replaceAll("[\\-\\+\\.\\?\\!\\n\\t\\^:,]", "").replaceAll("\\s{2,}", " ");
    }
}
