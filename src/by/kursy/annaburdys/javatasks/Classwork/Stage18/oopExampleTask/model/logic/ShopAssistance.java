package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.logic;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Bouquet3;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Flower;

public class ShopAssistance {
    public static final double LABOR_PERCENT = 0.1;

    public static double calculateTotalPrice(Bouquet3 bouquet3) {
        if (bouquet3 == null || bouquet3.size() == 0) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < bouquet3.size(); i++) {
            total += bouquet3.get(i).getPrice();
        }
        return total + total * LABOR_PERCENT;
    }

    public static double calculateTotalWeight(Bouquet3 bouquet1) {
        if (bouquet1 == null || bouquet1.size() == 0) {
            return 0;
        }

        double total = 0;
        for (int i = 0; i < bouquet1.size(); i++) {
            total += bouquet1.get(i).getWeight();
        }
        return total;
    }

    private static int getMaxLength(Bouquet3 bouquet1) {
        int maxLength = bouquet1.get(0).getLength();
        for (int i = 0; i < bouquet1.size(); i++) {
            if (bouquet1.get(i).getLength() > maxLength) {
                maxLength = bouquet1.get(i).getLength();
            }
        }
        return maxLength;
    }

    private static int countFlowersWithMaxLength(Bouquet3 bouquet1, int maxLength) {
        int counter = 0;
        for (int i = 0; i < bouquet1.size(); i++) {
            if (bouquet1.get(i).getLength() == maxLength) {
                counter++;
            }
        }
        return counter;
    }

    public static Flower[] findMaxLengthFlowers (Bouquet3 bouquet3) {
        int maxLength = getMaxLength(bouquet3);
        int count = countFlowersWithMaxLength(bouquet3, maxLength);

        Flower[] flowersResult = new Flower[count];

        for (int i = 0, j = 0; i < bouquet3.size(); i++) {
            if (bouquet3.get(i).getLength() == maxLength) {
                flowersResult[j] = bouquet3.get(i);
                j++;
            }
        }
        return flowersResult;
    }

}