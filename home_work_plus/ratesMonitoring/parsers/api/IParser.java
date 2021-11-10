package home_work_plus.ratesMonitoring.parsers.api;

import java.util.List;

public interface IParser<T> {

    List<String> parseByBorders(T text, String firstBorder, String secondBorder);

}
