package by.kursy.annaburdys.javatasks.Classwork.Stage34.model.entity;

public class Market {
    private int product;
    private boolean empty;

    public Market() {
        empty = true;
    }

    public synchronized void send(int product) {
        if (empty) {
            this.product = product;
            System.out.println("Producer sends --> " + product);
            empty = false;
        }
    }

    public synchronized int get() {
        if (!empty) {
            System.out.println("Consumer gets <-- " + product);
            empty = true;
        }
        return product;

    }
}
