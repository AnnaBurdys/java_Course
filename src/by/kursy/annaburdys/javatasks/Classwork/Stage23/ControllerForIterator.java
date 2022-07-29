package by.kursy.annaburdys.javatasks.Classwork.Stage23;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.DynamicArray;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.FixedArray;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.TheIteratorPattern.DynamicArrayIterator;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.TheIteratorPattern.FixedArrayIterator;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.TheIteratorPattern.Iterator;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public class ControllerForIterator {
    public static void main(String[] args) {
        DynamicArray array = new DynamicArray();
        array.add(new Flower());
        array.add(new Flower());
        array.add(new Flower());
        array.add(new Flower());
        array.add(new Flower());
        DynamicArrayIterator iterator  = new DynamicArrayIterator(array);

        view(iterator);
        iterator.reset();
        view(iterator);

        FixedArray fixedArray = new FixedArray();
      //  iterator = new FixedArrayIterator(fixedArray);
    }

    public static void view(Iterator iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
