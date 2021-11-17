package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.downloaders.TXTFileDownloader;
import home_work_plus.ratesMonitoring.draftsmans.ConsoleDraftsMan;
import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;

import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class UserInterfaceRunnableJob implements Runnable {
    @Override
    public void run() {
        String query = "https://myfin.by/currency/torgi-na-bvfb";
        HTMLCodeContainer container = new HTMLCodeContainer();
        CoursesContainer coursesContainer = new CoursesContainer();
        ConsoleDraftsMan consoleDraftsMan = new ConsoleDraftsMan();
        Scanner scanner = new Scanner(System.in);
        int choice;

        String firstBorder = "<div class=\"currency-detailed-change-card__value\"><span>";
        String secondBorder = "</span></div>";
        String firstBorderChange = "<div class=\"currency-detailed-change-card__changes-tile\">";
        String secondBorderChange = "</div>";

        TXTFileDownloader fileDownloader = new TXTFileDownloader();
        System.out.println();
        System.out.println("Выберите вариант из списка:");
        System.out.println("__________Меню__________");
        System.out.println("1. Мониторинг биржи.");
        System.out.println("2. Просмотр исторических файлов.");
        System.out.print("Ввод: ");

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
            System.out.println("Введите файл, откуда хотите прочитать файл");
            System.out.print("Ввод: ");
            String fileName = scanner.next();
            String str = fileDownloader.downloadToString(fileName);
            System.out.println("Выберите валюту:\nUSD\nEUR\nRUB");
            System.out.print("Ввод: ");
            String currency = scanner.next();
            consoleDraftsMan.draw(str, currency);
            consoleDraftsMan.showGraph();
        } else {
            System.exit(1);
        }
    }
}
