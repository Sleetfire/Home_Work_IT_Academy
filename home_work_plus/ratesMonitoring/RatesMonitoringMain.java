package home_work_plus.ratesMonitoring;

import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.runnable.DownloadRunnableJob;
import home_work_plus.ratesMonitoring.utils.ParserUtil;

import java.time.LocalDateTime;
import java.util.List;

public class RatesMonitoringMain {
    public static void main(String[] args) {
        String query = "https://banki24.by/exchange/currencymarket";
        HTMLCodeContainer container = new HTMLCodeContainer();

        Thread th = new Thread(new DownloadRunnableJob(query, container));
        th.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String page = container.getHTMLCode();

        String firstBorder = "<p class=\"text-center h1 mt-0\">";
        String secondBorder = "<span class=\"glyphicon glyphicon-arrow-up text-success\" aria-hidden=\"true\"></span>";

        List<String> list = ParserUtil.parseByBorders(page, firstBorder, secondBorder);

        double changeCurse = 0.0;
        LocalDateTime date = LocalDateTime.now();
        System.out.println("1 USD\n" + list.get(0) + " BYN\n" + changeCurse + "\n" + date);

        System.out.println(list);


    }
}
