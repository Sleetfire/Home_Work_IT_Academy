package home_work_plus.ratesMonitoring.dto;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoursesContainer that = (CoursesContainer) o;
        return Objects.equals(usdCourse, that.usdCourse) && Objects.equals(eurCourse, that.eurCourse) &&
                Objects.equals(rubCourse, that.rubCourse) && Objects.equals(changeUsdCourse, that.changeUsdCourse) &&
                Objects.equals(changeEurCourse, that.changeEurCourse) &&
                Objects.equals(changeRubCourse, that.changeRubCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usdCourse, eurCourse, rubCourse, changeUsdCourse, changeEurCourse, changeRubCourse);
    }
}
