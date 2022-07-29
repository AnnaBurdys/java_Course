package by.kursy.annaburdys.javatasks.Classwork.Stage25.model;

public class StudentBox {
    private Student value;

    public StudentBox(Student value) {
        this.value = value;
    }

    public StudentBox() {
    }

    public Student getValue() {
        return value;
    }

    public void setValue(Student value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
