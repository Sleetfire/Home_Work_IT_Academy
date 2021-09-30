package home_work_4;

import java.util.Comparator;

public class DataContainerMain {

    public static void main(String[] args) {


        DataContainer<String> container1 = new DataContainer<>(new String[0]);

        DataContainer<Integer> container2 = new DataContainer<>(new Integer[0]);

        DataContainer<Student> container3 = new DataContainer<>(new Student[0]);
        

//        container1.add("pudge");
//        container1.add("invoker");
//        container1.add("sf");
//
//        container1.printData();
//        System.out.println();
//        System.out.println(container1.delete("1"));
//        container1.printData();


        container2.add(777);
        container2.add(10);
        container2.add(2021);

        container2.printData();
        System.out.println();
        System.out.println(container2.delete(0));
        container2.printData();


//        container3.add(new Student("Alex", 21));
//        container3.add(new Student("Max", 42));
//
//        container3.printData();
//        System.out.println();
//        container3.delete(0);
//        container3.printData();
//
  }


}
