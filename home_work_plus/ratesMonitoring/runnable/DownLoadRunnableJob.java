package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.downloaders.WebsiteDownloader;
import home_work_plus.ratesMonitoring.downloaders.api.IDownloader;
import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;

public class DownloadRunnableJob implements Runnable {

    private String queryAddress;
    private HTMLCodeContainer container;

    public DownloadRunnableJob(String queryAddress, HTMLCodeContainer container) {
        this.queryAddress = queryAddress;
        this.container = container;
    }

    @Override
    public void run() {
        IDownloader downloader = new WebsiteDownloader();
        String page = downloader.downloadToString(queryAddress);
        container.setHTMLCode(page);

    }
}
