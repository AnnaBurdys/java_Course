package by.kursy.annaburdys.javatasks.Classwork.Stage34.model.logic;

import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.entity.Market;

import java.util.concurrent.TimeUnit;

public class Producer implements Runnable {
    private boolean running;
    private Market market;

    public Producer(Market market) {
        this.market = market;
        running = true;
        new Thread(this,"Producer").start();
    }

    @Override
    public void run() {
        int product = 0;

        while(running) {
            product++;
            market.send(product);
        }
    }

    public void stop() {
        running = false;
    }
}
