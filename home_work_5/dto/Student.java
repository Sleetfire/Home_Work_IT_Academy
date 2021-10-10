package home_work_5.dto;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int age;
    private double rating;
    private boolean olympiad;

    public Student(int id, String name, int age, double rating, boolean olympiad) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.rating = rating;
        this.olympiad = olympiad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isOlympiad() {
        return olympiad;
    }

    public void setOlympiad(boolean olympiad) {
        this.olympiad = olympiad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && Double.compare(student.rating, rating) == 0 &&
                olympiad == student.olympiad && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, rating, olympiad);
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge() - o.getAge();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                ", olympiad=" + olympiad +
                '}';
    }
}
