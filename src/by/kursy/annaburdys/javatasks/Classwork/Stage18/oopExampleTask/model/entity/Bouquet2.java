package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.FixedArray;

import java.util.ArrayList;

public class Bouquet2 {
    private FixedArray flowers;

    public Bouquet2 (Flower[] flowers) {
        if (flowers != null) {
            this.flowers = new FixedArray(flowers);
        } else {
            this.flowers = new FixedArray();
        }
    }

    public Bouquet2() {
        flowers = new FixedArray();
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }

    public void remove(Flower flower) {

    }

    public void remove(int index) {
        flowers.remove(index);
    }

    public int size() {
        return flowers.size();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of flowers:");
        for (int i = 0; i< flowers.size(); i++) {
            builder.append("\n").append(flowers.get(i));
        }
        return builder + "";
    }

}