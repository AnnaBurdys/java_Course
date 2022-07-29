package by.kursy.annaburdys.javatasks.Classwork.Stage23.entity;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.container.Container;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.container.DynamicArray;

public class Bouquet {
    private Container flowers;

    public Bouquet() {
        flowers = new DynamicArray();
    }

    public Bouquet(Flower[] flowers) {
        this();
        if (flowers != null) {
            for (int i = 0; i < flowers.length; i++) {
                this.flowers.add(flowers[i]);
            }
        } else {
            flowers = new Flower[0];
        }
    }

    public Bouquet(Container flowers) {
        this.flowers = flowers;
    }

    public int size() {
        return flowers.size();
    }

    public Flower get(int index) {
        if (index >= 0 && index < flowers.size()) {
            return flowers.get(index);
        }
        return null;
    }

    public void add(by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Flower flower) {
        flowers.add((Flower) flower);
    }

    public void remove(int index) {
        flowers.remove(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of flowers:");

        for (int i = 0; i < flowers.size(); i++) {
            builder.append("\n").append(flowers.get(i));
        }
        return builder + "";
    }

    public void set(int index, Flower flower) {
        flowers.set(index,flower);
    }
}