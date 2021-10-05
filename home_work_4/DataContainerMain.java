package home_work_4;

import home_work_4.comparators.StudentAgeComparator;
import home_work_4.comparators.StudentNameComparator;
import home_work_4.dto.Student;
import home_work_4.iterators.DataContainerIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DataContainerMain {

    public static void main(String[] args) {

//        DataContainer<Student> container3 = new DataContainer<>(new Student[0]);
//
//        DataContainer<String> container = new DataContainer<>(new String[10]);
//
//        container3.add(new Student("alex", 50));
//        container3.add(new Student("andrey", 100_000));
//        container3.add(new Student("kill_real", 30));
//        container3.add(new Student("max", 35));
//
//        System.out.println(container3.delete(10));
//
//        Iterator <Student> iterator = container3.iterator();
//
//        System.out.println(container3.toString());
//        DataContainer.sort(container3);
//        System.out.println(container3.toString());

        DataContainer<String> container = new DataContainer<>(new String[0]);
        int index1 = container.add("Привет");
        int index2 = container.add("Как дела");
        int index3 = container.add("Работаю");
        int index4 = container.add("Давай потом");
        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
//        System.out.println(text1); //Привет
//        System.out.println(text2); //Как дела
//        System.out.println(text3); //Работаю
//        System.out.println(text4); //Давай потом
//        container.delete(text1);
//        System.out.println(container.get(index1)); //Как дела

        DataContainerIterator<String> iterator = container.iterator();

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list.toString());
        ListIterator<String> iter = list.listIterator();
        System.out.println(iter.next());
        iter.remove();
        System.out.println(iter.next());
        iter.remove();
        System.out.println(list.toString());

    }
}
