package by.kursy.annaburdys.javatasks.Classwork.Stage23.TheIteratorPattern;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public interface Iterator {
    Flower next();
    boolean hasNext();
    void reset();
}
