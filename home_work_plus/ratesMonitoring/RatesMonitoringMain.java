package home_work_plus.ratesMonitoring;

import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.runnable.ConsolePrintRunnableJob;
import home_work_plus.ratesMonitoring.runnable.DownloadRunnableJob;
import home_work_plus.ratesMonitoring.runnable.ParseRunnableJob;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RatesMonitoringMain {
    public static void main(String[] args) {
        String query = "https://myfin.by/currency/torgi-na-bvfb";
        HTMLCodeContainer container = new HTMLCodeContainer();
        CoursesContainer coursesContainer = new CoursesContainer();

        String firstBorder = "<div class=\"currency-detailed-change-card__value\"><span>";
        String secondBorder = "</span></div>";
        String firstBorderChange = "<div class=\"currency-detailed-change-card__changes-tile\">";
        String secondBorderChange = "</div>";

        ScheduledExecutorService service1 = Executors.newScheduledThreadPool(1);
        service1.scheduleAtFixedRate(new DownloadRunnableJob(query, container), 0, 60, TimeUnit.SECONDS);
        //service1.shutdown();

        ScheduledExecutorService service2 = Executors.newScheduledThreadPool(1);
        service2.scheduleAtFixedRate(new ParseRunnableJob(firstBorder, secondBorder, firstBorderChange, secondBorderChange,
                container, coursesContainer), 2, 60,TimeUnit.SECONDS);
        //service2.shutdown();

        ScheduledExecutorService service3 = Executors.newScheduledThreadPool(1);
        service3.scheduleAtFixedRate(new ConsolePrintRunnableJob(coursesContainer), 3,60, TimeUnit.SECONDS);
        //service3.shutdown();

    }
}
