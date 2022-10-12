package by.kursy.annaburdys.javatasks.Classwork.Stage34.model.logic;

import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.entity.Market;

public class Consumer implements Runnable {
    private boolean running;
    private Market market;

    public Consumer(Market market) {
        this.market = market;
        running = true;
        new Thread(this, "Consumer").start();
    }

    @Override
    public void run() {
        while (running) {
            market.get();
        }
    }

    public void stop() {
        running = false;
    }
}