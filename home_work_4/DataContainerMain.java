package home_work_4;

import home_work_4.comparators.StudentAgeComparator;
import home_work_4.comparators.StudentNameComparator;
import home_work_4.dto.Student;

public class DataContainerMain {

    public static void main(String[] args) {

        DataContainer<Student> container3 = new DataContainer<>(new Student[0]);

        DataContainer<String> container = new DataContainer<>(new String[10]);

        container3.add(new Student("pudge", 50));
        container3.add(new Student("invoker", 100_000));
        container3.add(new Student("anti-mage", 30));
        container3.add(new Student("storm spirit", 35));

        DataContainer.sort(container3);
        System.out.println(container3.toString());
       // System.out.println((container3.getItems().length));







  }

}
