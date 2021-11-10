package home_work_plus.ratesMonitoring.runnable;

import home_work_plus.ratesMonitoring.dto.CoursesContainer;
import home_work_plus.ratesMonitoring.dto.HTMLCodeContainer;
import home_work_plus.ratesMonitoring.parsers.StringParser;

import java.util.List;

public class ParseRunnableJob implements Runnable {

    private String firstBorder;
    private String secondBorder;
    private String firstChangeBorder;
    private String secondChangeBorder;

    private HTMLCodeContainer htmlCodeContainer;
    private CoursesContainer coursesContainer;

    public ParseRunnableJob(String firstBorder, String secondBorder, String firstChangeBorder, String secondChangeBorder,
                            HTMLCodeContainer htmlCodeContainer, CoursesContainer coursesContainer) {
        this.firstBorder = firstBorder;
        this.secondBorder = secondBorder;
        this.firstChangeBorder = firstChangeBorder;
        this.secondChangeBorder = secondChangeBorder;
        this.htmlCodeContainer = htmlCodeContainer;
        this.coursesContainer = coursesContainer;
    }

    @Override
    public void run() {

        StringParser parser = new StringParser();

        List<String> list = parser.parseByBorders(htmlCodeContainer.getHTMLCode(), firstBorder, secondBorder);
        List<String> listChange = parser.parseByBorders(htmlCodeContainer.getHTMLCode(), firstChangeBorder, secondChangeBorder);

        coursesContainer.setUsdCourse(list.get(0));
        coursesContainer.setEurCourse(list.get(1));
        coursesContainer.setRubCourse(list.get(2));

        parser.parseNumber(listChange);
        coursesContainer.setChangeUsdCourse(listChange.get(0));
        coursesContainer.setChangeEurCourse(listChange.get(2));
        coursesContainer.setChangeRubCourse(listChange.get(4));

    }
}
