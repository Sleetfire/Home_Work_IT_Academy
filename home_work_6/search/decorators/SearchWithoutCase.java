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

    @Override
    public long search(String text, String word) {
        return iSearchEngine.search(text, word);
    }

    public String makeLowerCase(String str) {
        return str.toLowerCase(Locale.ROOT);
    }

    public String makeRegexLoweCase(String str) {
        return "(?i)" + str;
    }






}
