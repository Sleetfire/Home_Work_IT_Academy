package home_work_6.search.decorators;

import home_work_6.search.api.ISearchEngine;

import java.util.Locale;

public class SearchWithoutCase implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    public SearchWithoutCase(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    public ISearchEngine getISearchEngine() {
        return iSearchEngine;
    }

    /**
     *
     * @param text строка с текстом
     * @param word слово,которое необходимо найти
     * @return
     */
    @Override
    public long search(String text, String word) {
        return iSearchEngine.search(text, word);
    }

    /**
     * Метод, который переводит строку в нижний регистр
     * @param str
     * @return строку в нижнем регистре
     */
    public String makeLowerCase(String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    /**
     * Метод, который добавляет к строке свойство нечувствительности к регистру
     * @param str
     * @return строку, которая будет нечувствительна к регистру, если использовать ее в регулярном выражении
     */
    public String makeRegexLoweCase(String str) {
        return "(?i)" + str;
    }






}
