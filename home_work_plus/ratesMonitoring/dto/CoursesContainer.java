package home_work_plus.ratesMonitoring.dto;

public class CoursesContainer {

    private String usdCourse;
    private String eurCourse;
    private String rubCourse;

    private String changeUsdCourse;
    private String changeEurCourse;
    private String changeRubCourse;

    public String getUsdCourse() {
        return usdCourse;
    }

    public void setUsdCourse(String usdCourse) {
        this.usdCourse = usdCourse;
    }

    public String getEurCourse() {
        return eurCourse;
    }

    public void setEurCourse(String eurCourse) {
        this.eurCourse = eurCourse;
    }

    public String getRubCourse() {
        return rubCourse;
    }

    public void setRubCourse(String rubCourse) {
        this.rubCourse = rubCourse;
    }

    public String getChangeUsdCourse() {
        return changeUsdCourse;
    }

    public void setChangeUsdCourse(String changeUsdCourse) {
        this.changeUsdCourse = changeUsdCourse;
    }

    public String getChangeEurCourse() {
        return changeEurCourse;
    }

    public void setChangeEurCourse(String changeEurCourse) {
        this.changeEurCourse = changeEurCourse;
    }

    public String getChangeRubCourse() {
        return changeRubCourse;
    }

    public void setChangeRubCourse(String changeRubCourse) {
        this.changeRubCourse = changeRubCourse;
    }

    @Override
    public String toString() {
        return "CoursesContainer{" +
                "usdCourse='" + usdCourse + '\'' +
                ", eurCourse='" + eurCourse + '\'' +
                ", rubCourse='" + rubCourse + '\'' +
                ", changeUsdCourse='" + changeUsdCourse + '\'' +
                ", changeEurCourse='" + changeEurCourse + '\'' +
                ", changeRubCourse='" + changeRubCourse + '\'' +
                '}';
    }
}
