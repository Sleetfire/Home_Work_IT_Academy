package home_work_6;

import home_work_6.search.EasySearch;
import home_work_6.search.RegExSearch;
import home_work_6.search.api.ISearchEngine;
import home_work_6.search.decorators.SearchEnginePunctuationNormalizer;
import home_work_6.search.decorators.SearchWithoutCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ISearchEngineTest {

    private final ISearchEngine search1 = new SearchWithoutCase(new EasySearch());
    private final ISearchEngine search2 = new SearchWithoutCase(new RegExSearch());

    @ParameterizedTest
    @DisplayName("Тестирование поиска слов простыми поисковиками")
    @MethodSource("searchSimpleArgument")
    void simpleSearch(ISearchEngine iSearchEngine) {
        assertEquals(1, iSearchEngine.search("Мама мыла раму", "мыла"));
        assertEquals(1, iSearchEngine.search("привет, как дела!", "как"));
        assertEquals(1, iSearchEngine.search("привет,какдела!", "привет"));
        assertEquals(1, iSearchEngine.search("привет;какдела!", "привет"));
        assertEquals(0, iSearchEngine.search("привет;какдела!", "как"));
        assertEquals(1, iSearchEngine.search("как дела!.Что делаешь", "Что"));
        assertEquals(1, iSearchEngine.search("Привет-привет", "Привет"));
        assertEquals(1, iSearchEngine.search("Привет -привет", "привет"));
        assertEquals(1, iSearchEngine.search("4-х", "4"));
        assertEquals(1, iSearchEngine.search("один и 1", "и"));
        assertEquals(1, iSearchEngine.search("бабушка бабушке бабушку", "бабушку"));
        assertEquals(1, iSearchEngine.search("Литературный тип у литературы", "литературы"));
    }

    @ParameterizedTest
    @DisplayName("Тестирование поиска слов с декораторами")
    @MethodSource("searchHardArgument")
    void hardSearch(ISearchEngine iSearchEngine) {
        assertEquals(0, iSearchEngine.search("как дела!.Что делаешь?", "дела"));
        assertEquals(1, iSearchEngine.search("город Москва: ул. Таллинская; улица Твардовского, " +
                "Туркменский проспект (дома с 1 по 31). Серебряноборское лесничество", "проспект"));
        assertEquals(3, iSearchEngine.search("где-то. когда.-то было fто, не ,знаю. что, почему. было" +
                "и зачем. было, не. знаю или. вру, что не, знаю?!", "не"));
    }

    @Test
    @DisplayName("Тестирование поиска слов без учета регистра")
    void withoutCaseSearch() {
        if (search1 instanceof SearchWithoutCase) {
            SearchWithoutCase searchWithoutCase1 = (SearchWithoutCase) search1;
            assertEquals(1, searchWithoutCase1.search(searchWithoutCase1.makeLowerCase("Мама мЫлА раму"), searchWithoutCase1.makeLowerCase("мыЛа")));
        }

        if (search2 instanceof RegExSearch) {
            SearchWithoutCase searchWithoutCase2 = (SearchWithoutCase) search2;
            assertEquals(1, searchWithoutCase2.search("Мама мЫлА раму", searchWithoutCase2.makeRegexLoweCase("мыЛа")));
        }
    }

    static Stream<Arguments> searchSimpleArgument() {
        return Stream.of(
                arguments(new EasySearch()),
                arguments(new RegExSearch())
        );
    }

    static Stream<Arguments> searchHardArgument() {
        return Stream.of(
                arguments(new SearchEnginePunctuationNormalizer(new EasySearch())),
                arguments(new SearchEnginePunctuationNormalizer(new RegExSearch()))
        );
    }
}
