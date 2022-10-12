package by.kursy.annaburdys.javatasks.Classwork.Stage34.model.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.entity.Market;
import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.logic.Consumer;
import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.logic.Producer;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Market market = new Market();
        new Producer(market);
        TimeUnit.MILLISECONDS.sleep(100);
        new Consumer(market);
    }
}
