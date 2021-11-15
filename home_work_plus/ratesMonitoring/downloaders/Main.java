package home_work_plus.ratesMonitoring.downloaders;

public class Main {
    public static void main(String[] args) {
        TXTFileDownloader downloader = new TXTFileDownloader();
        String str = downloader.downloadToString("rates.txt");
        System.out.println(str);


    }
}
