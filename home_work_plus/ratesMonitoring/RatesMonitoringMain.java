package home_work_plus.ratesMonitoring;

import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.runnable.DownLoadRunnableJob;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RatesMonitoringMain {
    public static void main(String[] args) {
        String query = "https://banki24.by/exchange/currencymarket";
        HTMLCodeContainer container = new HTMLCodeContainer();

        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(new DownLoadRunnableJob(query, container));
        service.shutdown();
        String page = container.getHTMLCode();


        Pattern pattern0 = Pattern.compile("<p class=\"text-center h1 mt-0\">");
        Pattern pattern1 =  Pattern.compile("<span class=\"glyphicon glyphicon-arrow-up text-success\" aria-hidden=\"true\"></span>");
        String firstBorder = "<p class=\"text-center h1 mt-0\">";
        String secondBorder = "<span class=\"glyphicon glyphicon-arrow-up text-success\" aria-hidden=\"true\"></span>";

        List<String> list = new ArrayList<>();
        String test = "<p class=\"text-center h1 mt-0\"> 10 <span class=\"glyphicon glyphicon-arrow-up text-success\" aria-hidden=\"true\"></span>";
        Pattern pattern = Pattern.compile("(?<=" + firstBorder + ")(.*?)(?=" + secondBorder + ")", Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(page);
        while (matcher.find()) {
            list.add(page.substring(matcher.start(), matcher.end()).trim());
        }

        double changeCurse = 0.0;
        LocalDateTime date = LocalDateTime.now();
        System.out.println("1 USD\n" + list.get(0) + " BYN\n" + changeCurse + "\n" + date);

        System.out.println(list);





    }
}
