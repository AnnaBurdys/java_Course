package by.kursy.annaburdys.javatasks.Classwork.Stage26;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String name;
    private int age;
    private int mark;

    public Student() {
        name = "no name";
        age = 16;
    }

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
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

    @Override
    public String toString() {
        return name + ", age = " + age +
                ", mark = " + getMark();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age && mark == student.mark && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, mark);
    }

    @Override
    public int compareTo(Student o) {
        int result = name.compareTo(o.name);
        if (result == 0) {
            result = age - o.age;
            if (result == 0) {
                result = mark - o.mark;
            }
        }

        return result;
    }

}