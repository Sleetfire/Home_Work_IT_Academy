package home_work_plus.ratesMonitoring;

import home_work_plus.ratesMonitoring.runnable.*;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class RatesMonitoringMain {
    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
        service.scheduleAtFixedRate(new UserInterfaceRunnableJob(), 0, 1, TimeUnit.SECONDS);

    }
}
