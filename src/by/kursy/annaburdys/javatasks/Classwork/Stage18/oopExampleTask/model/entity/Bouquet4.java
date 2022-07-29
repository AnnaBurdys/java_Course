package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.DynamicArray;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.SingleList;

public class Bouquet4 {
    private SingleList flowers;

    public Bouquet4 (Flower[] flowers) {
        if (flowers != null) {
            this.flowers = new SingleList(flowers);
        } else {
            this.flowers = new SingleList();
        }
    }

    public Bouquet4() {
        flowers = new SingleList();
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
