package by.kursy.annaburdys.javatasks.Classwork.Stage25.model;

public class FloatBox {
    private double value;

    public FloatBox(int value) {
        this.value = value;
    }

    public FloatBox() {
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value + "";
    }
}
