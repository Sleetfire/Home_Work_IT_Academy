package home_work_6.search;

import home_work_6.search.api.ISearchEngine;

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




}
