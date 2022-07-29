package by.kursy.annaburdys.javatasks.Classwork.Stage29And30.model;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public class Rose extends by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower {
    private double lengthOfThorn;

    public Rose() {

    }

    public Rose(double lengthOfThorn) {
        this.lengthOfThorn = lengthOfThorn;
    }

    public Rose(String name, String color, double price, double weight, int length, double lengthOfThorn) {
        super(name, color, price, weight, length);
        this.lengthOfThorn = lengthOfThorn;
    }

    public Rose(String name, double lengthOfThorn) {
        super(name);
        this.lengthOfThorn = lengthOfThorn;
    }

    public Rose(Flower flower, double lengthOfThorn) {
        super(flower);
        this.lengthOfThorn = lengthOfThorn;
    }

    public double getLengthOfThorn() {
        return lengthOfThorn;
    }

    public void setLengthOfThorn(double lengthOfThorn) {
        if (lengthOfThorn > 0) {
            this.lengthOfThorn = lengthOfThorn;
        }
    }

    @Override
    public String toString() {
        return "Rose - " + super.toString() +
                ", lengthOfThorn=" + lengthOfThorn;
    }
}