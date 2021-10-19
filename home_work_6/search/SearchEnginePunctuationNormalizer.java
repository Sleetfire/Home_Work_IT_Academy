package home_work_6.search;

import home_work_6.search.api.ISearchEngine;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine iSearchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine iSearchEngine) {
        this.iSearchEngine = iSearchEngine;
    }

    @Override
    public long search(String text, String word) {
        return iSearchEngine.search(text, word);
    }
}
