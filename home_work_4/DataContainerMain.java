package home_work_4;

import home_work_4.comparators.StudentAgeComparator;
import home_work_4.comparators.StudentNameComparator;
import home_work_4.dto.Student;
import java.util.Iterator;

public class DataContainerMain {

    public static void main(String[] args) {

        System.out.println("----------Students----------");
        DataContainer<Student> container3 = new DataContainer<>(new Student[0]);
        container3.add(new Student("Boris", 30));
        container3.add(new Student("Alex", 12));
        container3.add(new Student("Artyom", 60));
        container3.add(new Student("Pavel", 100_000));
        container3.add(new Student("Victor", 42));
        container3.add(new Student("Oleg", 47));
        System.out.println(container3);
        System.out.print("Delete Artyom: " + container3.get(2) + ": ");
        System.out.println(container3.delete(new Student("Artyom", 60)));
        System.out.println(container3);
        System.out.println("Sorting by names");
        container3.sort(new StudentNameComparator());
        System.out.println(container3);
        System.out.println("Sorting by ages");
        DataContainer.sort(container3, new StudentAgeComparator());
        System.out.println(container3);
        System.out.println("Sorting with Comparable");
        DataContainer.sort(container3);
        System.out.println(container3);

        Iterator <Student> iterator = container3.iterator();
        System.out.println("----------Iterator----------");
        System.out.println("Delete Alex: " + iterator.next());
        iterator.remove();
        System.out.println("Print next students");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------Print default tests----------");
        DataContainer<String> container = new DataContainer<>(new String[0]);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //Привет
        System.out.println(text2); //Как дела
        System.out.println(text3); //Работаю
        System.out.println(text4); //Давай потом
        container.delete(text1);
        System.out.println(container.get(index1)); //Как дела

    }
}
