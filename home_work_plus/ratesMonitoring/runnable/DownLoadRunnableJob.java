package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.utils.DownloadPageUtil;

public class DownloadRunnableJob implements Runnable {

    private String queryAddress;
    private HTMLCodeContainer container;
    private Object lock;

    public DownloadRunnableJob(String queryAddress, HTMLCodeContainer container, Object lock) {
        this.queryAddress = queryAddress;
        this.container = container;
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            String page = DownloadPageUtil.downLoadPage(queryAddress);
            container.setHTMLCode(page);
        }

    }
}
