package home_work_5.dto;

import java.util.Objects;

public class Student {
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
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public boolean isOlympiad() {
        return this.olympiad;
    }

    public void setOlympiad(boolean olympiad) {
        this.olympiad = olympiad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.id == student.id && this.age == student.age && Double.compare(student.rating, this.rating) == 0 &&
                this.olympiad == student.olympiad && Objects.equals(this.name, student.name);
    }

    @Override
    public int hashCode() {
        int result = 31 * this.id;
        result += this.name == null ? 0 : this.name.hashCode();
        result += 31 * this.age;
        result += 31 * this.rating;
        result += this.olympiad ? 1 : 0;
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", age=" + this.age +
                ", rating=" + String.format("%.4f", this.rating) +
                ", olympiad=" + this.olympiad +
                '}';
    }
}
