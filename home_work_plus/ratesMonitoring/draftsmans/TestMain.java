package home_work_plus.ratesMonitoring.draftsmans;

import home_work_plus.ratesMonitoring.downloaders.TXTFileDownloader;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {

        ConsoleDraftsMan consoleDraftsMan = new ConsoleDraftsMan();
        String text = "USD-0.5550 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-1.4900 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-2.5530 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-3.5650 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-4.4120 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-5.5400 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-6.5450 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-7.5570 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-8.5590 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-9.5580 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-0.4160 BYN-2021-11-16T14:09:16.511384900";

        consoleDraftsMan.draw(text, "USD");
        consoleDraftsMan.showGraph();


    }
}
