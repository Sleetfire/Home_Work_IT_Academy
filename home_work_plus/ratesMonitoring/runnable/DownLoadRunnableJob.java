package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.utils.DownLoadPageUtil;

public class DownLoadRunnableJob implements Runnable {

    private String queryAddress;
    private HTMLCodeContainer container;

    public DownLoadRunnableJob(String queryAddress, HTMLCodeContainer container) {
        this.queryAddress = queryAddress;
        this.container = container;
    }

    @Override
    public void run() {

        String page = DownLoadPageUtil.downLoadPage(queryAddress);
        container.setHTMLCode(page);

    }
}
