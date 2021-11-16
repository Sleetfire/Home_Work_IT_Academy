package home_work_plus.ratesMonitoring.draftsmans;

import home_work_plus.ratesMonitoring.downloaders.TXTFileDownloader;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class TestMain {
    public static void main(String[] args) {

        ConsoleDraftsMan consoleDraftsMan = new ConsoleDraftsMan();
        String text = "USD-0.4160 BYN-2021-11-16T14:09:16.511384900\n"
                +"USD-0.4160 BYN-2021-11-16T14:09:16.511384900\n" +
                "USD-0.4160 BYN-2021-11-16T14:09:16.511384900";

        consoleDraftsMan.draw(text, "USD");
        consoleDraftsMan.showGraph();


    }
}
