package by.kursy.annaburdys.javatasks.Classwork.Stage34.model.logic;

import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.entity.Market;

import java.util.concurrent.TimeUnit;

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
            try{
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public void stop() {
        running = false;
    }
}