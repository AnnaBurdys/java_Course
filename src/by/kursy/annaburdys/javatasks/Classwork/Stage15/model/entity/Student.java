package by.kursy.annaburdys.javatasks.Classwork.Stage15.model.entity;

public class Student {
    public String name;     // 8
    public int age;         // 4
    public double mark;     // 8
    public char sex;        // 2  //'m' of 'f'
    public boolean alive;   // 4

    public Student(String name, int age, double mark, char sex, boolean alive) {
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.sex = sex;
        this.alive = alive;
    }

    public Student() {
        name = "no name";
        age = 16;
        sex = 'f';
        alive = true;
    }

    {
        mark = 4;
    }

    public String getInfo() {
        return name + " {age = " + age
                + "; mark = " + mark
                + "; sex = " + (sex== 'm' ? "male" : "female")
                + "; alive = " + (alive ? "yes" : "no") + "}";
    }

    public void testing() {
        System.out.println(this.hashCode());
    }

    //copy-constructor
    public Student (Student student) {
        name = student.name;
        age = student.age;
        mark = student.mark;
        sex = student.sex;
        alive = student.alive;
    }

}