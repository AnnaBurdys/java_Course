package by.kursy.annaburdys.javatasks.Classwork.Stage23.TheIteratorPattern;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.TheStrategyPattern.FlowersComparable;

import java.util.ArrayList;

public class ArrayListIterator implements Iterator {
    private ArrayList list;
    private int current = 0;

    @Override
    public Flower next() {
        return (Flower) list.get(current++);
    }

    @Override
    public boolean hasNext() {
       boolean flag = current < list.size();
       return flag;
    }

    @Override
    public void reset() {
    return;
    }
}
