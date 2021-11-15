package home_work_plus.ratesMonitoring;

import home_work_plus.ratesMonitoring.downloaders.TXTFileDownloader;
import home_work_plus.ratesMonitoring.draftsmans.ConsoleDraftsMan;
import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.runnable.ConsolePrintRunnableJob;
import home_work_plus.ratesMonitoring.runnable.DownloadRunnableJob;
import home_work_plus.ratesMonitoring.runnable.FilePrintRunnableJob;
import home_work_plus.ratesMonitoring.runnable.ParseRunnableJob;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RatesMonitoringMain {
    public static void main(String[] args) {
        String query = "https://myfin.by/currency/torgi-na-bvfb";
        HTMLCodeContainer container = new HTMLCodeContainer();
        CoursesContainer coursesContainer = new CoursesContainer();
        ConsoleDraftsMan consoleDraftsMan = new ConsoleDraftsMan();


        String firstBorder = "<div class=\"currency-detailed-change-card__value\"><span>";
        String secondBorder = "</span></div>";
        String firstBorderChange = "<div class=\"currency-detailed-change-card__changes-tile\">";
        String secondBorderChange = "</div>";

        Scanner scanner = new Scanner(System.in);
        int choice;
        TXTFileDownloader fileDownloader = new TXTFileDownloader();
        System.out.println("__________Меню__________");
        System.out.println("1. Мониторинг биржи.");
        System.out.println("2. Просмотр исторических файлов.");
        System.out.println("Выберите вариант из списка:");
        choice = scanner.nextInt();
        if (choice == 1) {
            ScheduledExecutorService service1 = Executors.newScheduledThreadPool(1);
            service1.scheduleAtFixedRate(new DownloadRunnableJob(query, container), 0, 60, TimeUnit.SECONDS);

            ScheduledExecutorService service2 = Executors.newScheduledThreadPool(1);
            service2.scheduleAtFixedRate(new ParseRunnableJob(firstBorder, secondBorder, firstBorderChange, secondBorderChange,
                    container, coursesContainer), 2, 60, TimeUnit.SECONDS);

            ScheduledExecutorService service3 = Executors.newScheduledThreadPool(1);
            service3.scheduleAtFixedRate(new ConsolePrintRunnableJob(coursesContainer), 3, 60, TimeUnit.SECONDS);

            ScheduledExecutorService service4 = Executors.newScheduledThreadPool(1);
            service4.scheduleAtFixedRate(new FilePrintRunnableJob(coursesContainer), 3, 60, TimeUnit.SECONDS);
        } else if (choice == 2) {
            System.out.println("Выберите валюту:\nUSD\nEUR\nRUB");

            String str = fileDownloader.downloadToString("rates.txt");
            String line = scanner.next();
            consoleDraftsMan.draw(str, line);
            consoleDraftsMan.showGraph();
        }


    }
}
