package by.kursy.annaburdys.javatasks.Classwork.Stage23;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Bouquet;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Chamomile;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Rose;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.FlowerSorter;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.ShopAssistance;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.TheStrategyPattern.SortFlowersByPriceAsc;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.logic.TheStrategyPattern.SortFlowersByPriceDesc;

import java.util.Random;

public class Main {

    private static final double MAX_PRICE = 10.0;
    private static final double MIN_PRICE = 1.0;

    public static void main(String[] args) {

        Flower[] flowers = new Flower[10];

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            double price = random.nextDouble() * (MAX_PRICE - MIN_PRICE);
            price = Double.parseDouble(String.format("%.2f", price));
            flowers[i] = new Rose("Pink Panther", "Pink", price, 78, 200, 1.5);
        }

        for (int i = 5; i < flowers.length; i++) {
            double price = random.nextDouble() * (MAX_PRICE - MIN_PRICE);
            price = Double.parseDouble(String.format("%.2f", price));
            flowers[i] = new Chamomile("Pink Panther", "Pink", price, 78, 70, 11);
        }

        Bouquet bouquet = new Bouquet(flowers);
        double totalWeight = ShopAssistance.calculateTotalWeight(bouquet);
        double totalPrice = ShopAssistance.calculateTotalPrice(bouquet);

        System.out.println(bouquet);
        System.out.println("Total price: " + totalPrice);
        System.out.println("Total weight: " + totalWeight);

        System.out.println("After sorting ascending:");
        FlowerSorter.bubbleSort(bouquet, new SortFlowersByPriceAsc());
        System.out.println(bouquet);

        System.out.println("After sorting descending:");
        FlowerSorter.bubbleSort(bouquet, new SortFlowersByPriceDesc());
        System.out.println(bouquet);

    }
}