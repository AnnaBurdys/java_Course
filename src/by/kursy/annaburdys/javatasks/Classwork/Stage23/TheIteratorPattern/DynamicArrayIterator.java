package by.kursy.annaburdys.javatasks.Classwork.Stage23.TheIteratorPattern;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.DynamicArray;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public class DynamicArrayIterator implements Iterator {
    private DynamicArray array;
    private int current = 0;

    public DynamicArrayIterator(DynamicArray array) {
        this.array = array;
    }

    @Override
    public Flower next() {
        return (Flower) array.get(current++);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public void reset() {
        current = 0;
    }
}
