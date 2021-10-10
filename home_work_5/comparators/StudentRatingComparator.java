package home_work_5.comparators;

import home_work_5.dto.Student;

import java.util.Comparator;

public class StudentRatingComparator implements Comparator<Student> {

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
