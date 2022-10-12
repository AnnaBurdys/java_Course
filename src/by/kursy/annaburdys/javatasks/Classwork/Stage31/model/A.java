package by.kursy.annaburdys.javatasks.Classwork.Stage31.model;

import java.io.IOException;

public class A {
    private static final long serialVersionUID = 1L;
    public int id;
    public transient double value;
    public String name;
    public B b;

    public A () {
        id = 1;
        value = 5.5;
        name = "no name";
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", value = " + value +
                ", name = " + name +
                ", " + b;

    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
    }

}
