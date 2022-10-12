package by.kursy.annaburdys.javatasks.Classwork.Stage34.model.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.entity.Market;
import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.logic.Consumer;
import by.kursy.annaburdys.javatasks.Classwork.Stage34.model.logic.Producer;

public class Main {
    public static void main(String[] args) {
        Market market = new Market();
        new Producer(market);
        new Consumer(market);
    }
}
