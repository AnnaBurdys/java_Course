package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity;

import java.util.ArrayList;

public class Bouquet {
    private ArrayList<Flower> flowers;

    public Bouquet(Flower[] flowers) {
        if (flowers != null) {
            this.flowers = new ArrayList<>();
            for (Flower flower : flowers) {
                this.flowers.add(flower);
            }
        } else {
            flowers = new Flower[0];
        }
    }

    public Bouquet() {
        flowers = new ArrayList<>();
    }

    public void add(Flower flower) {
        ArrayList<Flower> temp = new ArrayList<>();

        for (Flower f : flowers
        ) {
            temp.add(f);
        }
        temp.add(flower);
        flowers = temp;
    }

    public void remove(Flower flower) {
        ArrayList<Flower> temp = new ArrayList<>();
        boolean flag = false;

        for (int i = 0; i < flowers.size(); i++) {
            if (flag || (flowers.get(i).getLength() != flower.getLength() || flowers.get(i).getPrice() != flower.getPrice() ||
                    flowers.get(i).getWeight() != flower.getWeight() || !flowers.get(i).getColor().equals(flower.getColor())  ||
                    !flowers.get(i).getName().equals(flower.getName())) ) {
                temp.add(flowers.get(i));
            } else {
                flag = true;
            }
        }
        flowers = temp;
    }

    public void remove(int index) {
        ArrayList<Flower> temp = new ArrayList<>();

        for (int i = 0; i < flowers.size(); i++) {
            if (index != i) {
                temp.add(flowers.get(i));
            }
        }
        flowers = temp;
    }


    public int size() {
        return flowers.size();
    }

    /*public String toString() {

    }*/

    public Flower get(int index) {
        if (index >= 0 && index < flowers.size()) {
            return flowers.get(index);
        } else {
            return null;
        }
    }
}