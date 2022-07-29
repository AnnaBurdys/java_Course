package by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.figures;

import by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.abstracts.Figure;

public class Triangle extends Figure {
    private double a;
    private double b;
    private double c;

    public Triangle(int x, int y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b > 0)
            this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        if (c > 0)
            this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle: " + super.toString() + " side a = " + a + " side b = " + b + " side c = " + c;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        System.out.println("Triangle is being drawn.");
    }

}