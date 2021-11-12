package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.printers.FilePrinter;

import java.util.Objects;

public class FilePrintRunnableJob implements Runnable {

    private CoursesContainer container;
    private CoursesContainer oldContainer;

    public FilePrintRunnableJob(CoursesContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        FilePrinter filePrinter = new FilePrinter("rates.txt");
        if (Objects.equals(container, oldContainer)) {
            filePrinter.printInfo(container.getUsdCourse(), container.getChangeUsdCourse(), "USD");
            filePrinter.printInfo(container.getEurCourse(), container.getChangeEurCourse(), "EUR");
            filePrinter.printInfo(container.getRubCourse(), container.getChangeRubCourse(), "RUB");
        }
        oldContainer = container;
    }
}
