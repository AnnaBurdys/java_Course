package by.kursy.annaburdys.javatasks.Classwork.Stage20.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.figures.Line;
import by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.figures.Point;
import by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.abstracts.Figure;
import by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.figures.Rectangle;
import by.kursy.annaburdys.javatasks.Classwork.Stage20.model.entity.figures.Triangle;

public class Main {
    public void testing(Figure[] figures) {
        for (Figure figure: figures) {
            System.out.println(figure.toString());
            System.out.println("Perimeter = " + figure.calculatePerimeter());
            figure.draw();
        }
    }

    public static void test(Figure[] figures) {
        for (Figure figure: figures) {
            figure.draw();
            System.out.println("Perimeter = " + figure.calculatePerimeter());
            System.out.println(figure.toString());
        }
    }

    public static void main(String[] args) {
        Figure[] figures = {
                new Point(1, 1),
                new Line(1, 1, 10),
                new Triangle(2, 1,3,4,5),
                new Rectangle(1,2,3,4)
        };
        test(figures);
    }
}
