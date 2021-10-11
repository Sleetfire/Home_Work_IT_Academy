package home_work_5;

import home_work_5.comparators.StudentAgeComparator;
import home_work_5.comparators.StudentNameComparator;
import home_work_5.comparators.StudentRatingComparator;
import home_work_5.dto.Student;
import home_work_5.randomStudentLib.ClearNameRandomStudent;
import home_work_5.randomStudentLib.NamesFromFileRandomStudent;
import home_work_5.randomStudentLib.SimpleRandomStudent;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CollectionsMain {
    public static void main(String[] args) {
        //SimpleRandomStudent randomStudent = new SimpleRandomStudent();
        //ClearNameRandomStudent randomStudent = new ClearNameRandomStudent(new SimpleRandomStudent());
        NamesFromFileRandomStudent randomStudent = new NamesFromFileRandomStudent(new SimpleRandomStudent());

        List<Student> list1 = new ArrayList<>();
        int numberOfStudents = 10_000;
        System.out.println("___________________________________Список студентов:___________________________________");
        for (int i = 0; i < numberOfStudents; i++) {
            list1.add(new Student(i, randomStudent.generateRandomName(), randomStudent.generateRandomAge(),
                    randomStudent.generateRandomRating(), randomStudent.generateRandomIsOlympiad()));
            System.out.println(list1.get(i));
        }

        System.out.println("____________________Отфильтрованные студенты по возрасту и имени:____________________");
        List<Student> list2 = new ArrayList<>();
        for (Student item : list1) {
            if (item.getAge() >= 12 && item.getRating() > 8) {
                list2.add(item);
                System.out.println(item);
            }
        }
        System.out.println("_________________________Отсортированные по имени студенты:_________________________");
        list2.sort(new StudentNameComparator());
        printCollection(list2);
        System.out.println("_________________________Отсортированные по оценке студенты:_________________________");
        list2.sort(new StudentRatingComparator());
        printCollection(list2);
        System.out.println("______________________Отсортированные по возрасту и оценке студенты:______________________");
        Comparator<Student> comparator = new StudentAgeComparator().thenComparing(new StudentRatingComparator());
        list2.sort(comparator);
        printTenVariantsFromCollection(list2);
    }

    public static void printCollection(List<Student> list) {
        for (int i = 0; i < 10; i++) {
            System.out.println(list.get(i));
        }
    }

    public static void printTenVariantsFromCollection(List<Student> list) {
        int age = 12;
        int count = 0;
        for (Student student : list) {
            if (student.getAge() == age) {
                System.out.println(student);
                count++;
            }
            if (count == 10) {
                age++;
                count = 0;
                System.out.println("-----------------------------------------------------------------------------");
            }
        }
    }
}
