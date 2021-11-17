package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.printers.ConsolePrinter;
import home_work_plus.ratesMonitoring.printers.api.IPrinter;

import java.util.Objects;

public class ConsolePrintRunnableJob implements Runnable {

    private CoursesContainer container;
    private CoursesContainer oldContainer;

    public ConsolePrintRunnableJob(CoursesContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        IPrinter printer = new ConsolePrinter();

        if (!Objects.equals(container, oldContainer)) {
            System.err.println();
            System.err.println(printer.printInfo(container.getUsdCourse(), container.getChangeUsdCourse(), "USD"));
            System.err.println("______________");
            System.err.println(printer.printInfo(container.getEurCourse(), container.getChangeEurCourse(), "EUR"));
            System.err.println("______________");
            System.err.println(printer.printInfo(container.getRubCourse(), container.getChangeRubCourse(), "RUB"));
        }
        oldContainer = container;
    }
}
