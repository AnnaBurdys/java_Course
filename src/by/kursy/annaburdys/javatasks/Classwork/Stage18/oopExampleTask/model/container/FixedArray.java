package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Flower;

public class FixedArray {
    public static final int DEFAULT_SIZE = 10;

    private Flower[] flowers;
    private int current;

    public FixedArray() {
        flowers = new Flower[DEFAULT_SIZE];
        current = 0;
    }

    public FixedArray(Flower[] flowers) {
        this.flowers = flowers;
        current = flowers.length;
    }

    public boolean isEmpty() {
        return current == 0;
    }

    public int size() {
        return current;
    }

    public Flower get(int index) {
        return flowers[index];
    }

    public void add(Flower flower) {
        if (current < flowers.length) {
            flowers[current] = flower;
            current++;
        }
    }

    public void remove(int index) {
        for (int i = index; i < flowers.length; i++) {
                flowers[i] = flowers[i+1];
        }
        current--;
    }
}