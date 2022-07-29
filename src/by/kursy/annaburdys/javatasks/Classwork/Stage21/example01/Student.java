package by.kursy.annaburdys.javatasks.Classwork.Stage21.example01;

public class Student implements Eatable {
    private String name;

    public Student() {

    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Student is eating");
    }
}
