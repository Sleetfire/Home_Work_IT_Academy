package home_work_5.comparators;

import home_work_5.dto.Student;

import java.util.Comparator;

public class StudentRatingComparator implements Comparator<Student> {

    /**
     * метод, который сравнивает студентов по оценке
     * @param o1
     * @param o2
     * @return возвращает 1, если оценка студента o2 выше оценки студента o1, возвращает -1, если оценка студента o2 ниже оценки студента o1,
     * если оценки равны возвращает 0
     */
    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getRating() > o1.getRating()) {
            return 1;
        } else if (o2.getRating() < o1.getRating()) {
            return -1;
        } else {
            return 0;
        }
    }
}
