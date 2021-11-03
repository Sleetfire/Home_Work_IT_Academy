package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;

public class ParseRunnableJob implements Runnable{

    private String firstBorder;
    private String secondBorder;
    private HTMLCodeContainer htmlCodeContainer;
    private CoursesContainer coursesContainer;

    public ParseRunnableJob(String firstBorder, String secondBorder, HTMLCodeContainer htmlCodeContainer, CoursesContainer coursesContainer) {
        this.firstBorder = firstBorder;
        this.secondBorder = secondBorder;
        this.htmlCodeContainer = htmlCodeContainer;
        this.coursesContainer = coursesContainer;
    }

    @Override
    public void run() {


    }
}
