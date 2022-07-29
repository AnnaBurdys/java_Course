package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.DynamicArray;

public class Bouquet3 {
    private DynamicArray flowers;

    public Bouquet3 (Flower[] flowers) {
        if (flowers != null) {
            this.flowers = new DynamicArray(flowers);
        } else {
            this.flowers = new DynamicArray();
        }
    }

    public Bouquet3() {
        flowers = new DynamicArray();
    }

    public void add(Flower flower) {
        flowers.add(flower);
    }

    public void remove(Flower flower) {

    }

    public Flower get(int index) {
        return flowers.get(index);
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