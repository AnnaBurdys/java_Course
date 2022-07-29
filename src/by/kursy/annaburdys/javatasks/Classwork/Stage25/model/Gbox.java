package by.kursy.annaburdys.javatasks.Classwork.Stage25.model;

public class Gbox <T> {
    private T value;

    public Gbox(T value) {
        this.value = value;
    }

    public Gbox() {
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
