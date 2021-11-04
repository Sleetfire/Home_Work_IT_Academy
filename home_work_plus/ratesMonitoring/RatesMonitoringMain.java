package home_work_plus.ratesMonitoring;

import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.runnable.DownloadRunnableJob;
import home_work_plus.ratesMonitoring.runnable.ParseRunnableJob;
import home_work_plus.ratesMonitoring.utils.ConsolePrintUtil;
import home_work_plus.ratesMonitoring.utils.ParserUtil;

import java.util.List;

public class RatesMonitoringMain {
    public static void main(String[] args) {
        String query = "https://banki24.by/exchange/currencymarket";
        HTMLCodeContainer container = new HTMLCodeContainer();
        CoursesContainer coursesContainer = new CoursesContainer();

        String firstBorder = "<p class=\"text-center h1 mt-0\">";
        String secondBorder = "<span class=\"glyphicon glyphicon-arrow-down text-danger\" aria-hidden=\"true\"></span>";
        String firstBorderChange = "<span class=\"text-danger glyphicon glyphicon-arrow-down\">";
        String secondBorderChange = "</span> ";


        Thread th1 = new Thread(new DownloadRunnableJob(query, container));
        Thread th2 = new Thread(new ParseRunnableJob(firstBorder, secondBorder, firstBorderChange, secondBorderChange,
                container, coursesContainer));

        th1.start();
        th2.start();
        try {
            th1.join();
            th2.join();
            System.out.println(th1.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String page = container.getHTMLCode();



        List<String> list = ParserUtil.parseByBorders(page, firstBorder, secondBorder);
        List<String> listChange = ParserUtil.parseByBorders(page, firstBorderChange, secondBorderChange);
        listChange = ParserUtil.parseNumber(listChange);

//        System.out.println(ConsolePrintUtil.printInfoInConsole(list.get(0), listChange.get(0), "USD"));
//        System.out.println("______________");
//        System.out.println( ConsolePrintUtil.printInfoInConsole(list.get(1), listChange.get(1), "EUR"));
//        System.out.println("______________");
//        System.out.println(ConsolePrintUtil.printInfoInConsole(list.get(2), listChange.get(2), "RUB"));

        System.out.println(coursesContainer);



    }
}
