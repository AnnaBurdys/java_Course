package by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.figures;

import by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.abstracts.Figure;

public class Point extends Figure {
    public Point(int x, int y) {
        super(x, y);
    }

    public Point() {
    }

    @Override
    public String toString() {
        return "Point: " + super.toString();
    }

    @Override
    public void draw() {
        System.out.println("Point is being drawn.");
    }
}
