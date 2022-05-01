package by.kursy.annaburdys.javatasks.Classwork.Stage15.model.entity;

public class Student {
    public String name;
    public int age;
    public double mark;
    public char sex; // 'm' of 'f'
    public boolean alive;

    public Student(String name, int age, double mark, char sex, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.sex = sex;
        this.alive = alive;
    }

    public Student() {
    }

    public String getInfo() {
        return name + " {age = " + age
                + "; mark = " + mark
                + "; sex = " + (sex== 'm' ? "male" : "female")
                + "; alive = " + (alive ? "yes" : "no") + "}";
    }
}