package by.kursy.annaburdys.javatasks.Classwork.Stage23.container;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public interface Container {
    boolean isEmpty();
    int size();
    Flower get(int index);
    void set(int index, Flower flower);
    void add(Flower flower);
    void remove(int index);

}