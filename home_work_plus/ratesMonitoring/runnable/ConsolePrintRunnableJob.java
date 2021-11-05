package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.utils.ConsolePrintUtil;

public class ConsolePrintRunnableJob implements Runnable{

    private CoursesContainer container;
    private Object lock;

    public ConsolePrintRunnableJob(CoursesContainer container, Object lock) {
        this.container = container;
        this.lock = lock;
    }

    @Override
    public void run() {

        synchronized (lock) {
            System.err.println(ConsolePrintUtil.printInfoInConsole(container.getUsdCourse(), container.getChangeUsdCourse(), "USD"));
            System.err.println("______________");
            System.err.println(ConsolePrintUtil.printInfoInConsole(container.getEurCourse(), container.getChangeEurCourse(), "EUR"));
            System.err.println("______________");
            System.err.println(ConsolePrintUtil.printInfoInConsole(container.getRubCourse(), container.getChangeRubCourse(), "RUB"));
        }

    }
}
