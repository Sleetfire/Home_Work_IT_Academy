package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.utils.ParserUtil;

import java.util.List;

public class ParseRunnableJob implements Runnable {

    private String firstBorder;
    private String secondBorder;
    private String firstChangeBorder;
    private String secondChangeBorder;

    private HTMLCodeContainer htmlCodeContainer;
    private CoursesContainer coursesContainer;
    private Object lock;

    public ParseRunnableJob(String firstBorder, String secondBorder, String firstChangeBorder, String secondChangeBorder,
                            HTMLCodeContainer htmlCodeContainer, CoursesContainer coursesContainer, Object lock) {
        this.firstBorder = firstBorder;
        this.secondBorder = secondBorder;
        this.firstChangeBorder = firstChangeBorder;
        this.secondChangeBorder = secondChangeBorder;
        this.htmlCodeContainer = htmlCodeContainer;
        this.coursesContainer = coursesContainer;
        this.lock = lock;
    }

    @Override
    public void run() {

        List<String> list = ParserUtil.parseByBorders(htmlCodeContainer.getHTMLCode(), firstBorder, secondBorder);
        List<String> listChange = ParserUtil.parseByBorders(htmlCodeContainer.getHTMLCode(), firstChangeBorder, secondChangeBorder);

        synchronized (lock) {
            coursesContainer.setUsdCourse(list.get(0));
            coursesContainer.setEurCourse(list.get(1));
            coursesContainer.setRubCourse(list.get(2));

            ParserUtil.parseNumber(listChange);
            coursesContainer.setChangeUsdCourse(listChange.get(0));
            coursesContainer.setChangeEurCourse(listChange.get(1));
            coursesContainer.setChangeRubCourse(listChange.get(1));
        }
    }
}
