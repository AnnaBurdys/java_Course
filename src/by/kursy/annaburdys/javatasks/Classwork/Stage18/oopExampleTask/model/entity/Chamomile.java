package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity;

public class Chamomile extends Flower {
    private int petalCount;

    public Chamomile() {
    }

    public Chamomile(String name, String color, double price, double weight, int length, int petalCount) {
        super(name, color, price, weight, length);
        this.petalCount = petalCount;
    }

    public Chamomile(String name) {
        super(name);
    }

    public Chamomile(Flower flower) {
        super(flower);
    }

    public int getPetalCount() {
        return petalCount;
    }

    public void setPetalCount(int petalCount) {
        if (petalCount > 0) {
            this.petalCount = petalCount;
        }
    }

    @Override
    public String toString() {
        return "Chamomile - " + super.toString() +
                ", petalCount = " + petalCount;
    }
}