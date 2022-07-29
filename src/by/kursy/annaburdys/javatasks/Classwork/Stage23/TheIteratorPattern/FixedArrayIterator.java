package by.kursy.annaburdys.javatasks.Classwork.Stage23.TheIteratorPattern;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.FixedArray;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public class FixedArrayIterator implements Iterator {
    private FixedArray array;
    private int current = 0;

    public FixedArrayIterator(FixedArray fixedArray) {
       array = fixedArray;
    }

    @Override
    public Flower next() {
        return (Flower) array.get(current++);
    }

    @Override
    public boolean hasNext() {
        boolean flag = current < array.size();
        if (!flag) {
            current = 0;
        }
        return flag;
    }

    @Override
    public void reset() {
    current = 0;
    }
}
