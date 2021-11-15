package home_work_plus.ratesMonitoring.draftsmans;

import home_work_plus.ratesMonitoring.downloaders.TXTFileDownloader;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {

        ConsoleDraftsMan consoleDraftsMan = new ConsoleDraftsMan();
        String text = "USD-2.5550 BYN\n" +
                "USD-2.4900 BYN\n" +
                "USD-2.5530 BYN\n" +
                "USD-2.5650 BYN\n" +
                "USD-2.4120 BYN\n" +
                "USD-2.5400 BYN\n" +
                "USD-2.5450 BYN\n" +
                "USD-2.5570 BYN\n" +
                "USD-2.5580 BYN\n" +
                "USD-2.4160 BYN";

        consoleDraftsMan.draw(text, "USD");
        consoleDraftsMan.showGraph();


    }
}
