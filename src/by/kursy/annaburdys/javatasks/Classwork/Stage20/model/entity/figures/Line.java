package by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.figures;

import by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.abstracts.Figure;

public class Line extends Figure {
    private double length;

    public Line(int x, int y, int length) {
        super(x, y);
        this.length = length;
    }

    public Line(int x, int y) {
        super(x, y);
    }

    public Line() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
        }
    }

    @Override
    public String toString() {
        return "Line: " + super.toString() + " length = " + length;
    }

    @Override
    public void draw() {
        System.out.println("Line is being drawn.");
    }
}
