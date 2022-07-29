package by.kursy.annaburdys.javatasks.Classwork.Stage23.container;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public class FixedArray implements Container {
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
        return size() == 0;
    }

    public int size() {
        return current;
    }

    public Flower get(int index) {
        return flowers[index];
    }

    @Override
    public void add(Flower flower) {
        if (current < flowers.length) {
            flowers[current] = (Flower) flower;
            current++;
        }
    }

    public void remove(int index) {
        for (int i = index; i < current; i++) {
            flowers[i] = flowers[i + 1];
        }
        current--;
    }

    @Override
    public void set(int index, Flower flower) {
        flowers[index] = flower;
    }
}