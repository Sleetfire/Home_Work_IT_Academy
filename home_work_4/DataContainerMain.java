package home_work_4;

import home_work_4.comparators.StudentAgeComparator;
import home_work_4.comparators.StudentNameComparator;
import home_work_4.dto.Student;
import java.util.Iterator;

public class DataContainerMain {

    public static void main(String[] args) {

        DataContainer<Student> container3 = new DataContainer<>(new Student[0]);

        DataContainer<String> container = new DataContainer<>(new String[10]);

        container3.add(new Student("alex", 50));
        container3.add(new Student("andrey", 100_000));
        container3.add(new Student("kill_real", 30));
        container3.add(new Student("max", 35));

        Iterator <Student> iterator = container3.iterator();

        System.out.println(container3.toString());
        DataContainer.sort(container3);
        System.out.println(container3.toString());



    }

}
