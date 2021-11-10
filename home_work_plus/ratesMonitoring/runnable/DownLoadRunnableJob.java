package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.utils.DownloadPageUtil;

public class DownloadRunnableJob implements Runnable {

    private String queryAddress;
    private HTMLCodeContainer container;

    public DownloadRunnableJob(String queryAddress, HTMLCodeContainer container) {
        this.queryAddress = queryAddress;
        this.container = container;
    }

    @Override
    public void run() {

            String page = DownloadPageUtil.downLoadPage(queryAddress);
            container.setHTMLCode(page);

    }
}
