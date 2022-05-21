package by.kursy.annaburdys.javatasks.Classwork.Stage17.model;

public class Human {
    protected String name;
    protected int age;

    public Human() {
        name = "no name";
        age = 16;
    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;

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
        return name + ": age = " + age;
    }

}
