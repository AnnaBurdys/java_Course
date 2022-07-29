package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.container.SingleList;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.*;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.logic.ShopAssistance;

public class Main {
    public static void main(String[] args) {
        SingleList list = new SingleList();
        list.add(new Flower());
        System.out.println(list.get(0));
        /*Flower[] flowers = new Flower[10];

        for (int i = 0; i < 5; i++) {
            flowers[i] = new Rose("Pink Panther", "Pink", 3.5, 78, 200, 1.5);
        }

        for (int i = 5; i < flowers.length; i++) {
            flowers[i] = new Chamomile("Pink Panther", "Pink", 3.5, 78, 70, 5);
        }

        Bouquet3 bouquet3 = new Bouquet3(flowers);
        double totalWeight = ShopAssistance.calculateTotalWeight(bouquet3);
        double totalPrice = ShopAssistance.calculateTotalPrice(bouquet3);
        System.out.println(bouquet3);
        System.out.println("Total price = " + totalPrice);
        System.out.println("Total weight = " + totalWeight);*/
    }
}