package by.kursy.annaburdys.javatasks.Classwork.Stage23.logic;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Bouquet;
import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;

public class ShopAssistance {
    public static final double LABOR_PERCENT = 0.1;

    public static double calculateTotalPrice(Bouquet bouquet) {
        if (bouquet == null || bouquet.size() == 0) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < bouquet.size(); i++) {
            total += bouquet.get(i).getPrice();
        }
        return total + total * LABOR_PERCENT;
    }

    public static double calculateTotalWeight(Bouquet bouquet) {
        if (bouquet == null || bouquet.size() == 0) {
            return 0;
        }

        double total = 0;
        for (int i = 0; i < bouquet.size(); i++) {
            total += bouquet.get(i).getWeight();
        }
        return total;
    }

    private static int getMaxLength(Bouquet bouquet1) {
        int maxLength = bouquet1.get(0).getLength();
        for (int i = 0; i < bouquet1.size(); i++) {
            if (bouquet1.get(i).getLength() > maxLength) {
                maxLength = bouquet1.get(i).getLength();
            }
        }
        return maxLength;
    }

    private static int countFlowersWithMaxLength(Bouquet bouquet, int maxLength) {
        int counter = 0;
        for (int i = 0; i < bouquet.size(); i++) {
            if (bouquet.get(i).getLength() == maxLength) {
                counter++;
            }
        }
        return counter;
    }

    public static Flower[] findMaxLengthFlowers (Bouquet bouquet) {
        int maxLength = getMaxLength(bouquet);
        int count = countFlowersWithMaxLength(bouquet, maxLength);

        Flower[] flowersResult = new Flower[count];

        for (int i = 0, j = 0; i < bouquet.size(); i++) {
            if (bouquet.get(i).getLength() == maxLength) {
                flowersResult[j] = bouquet.get(i);
                j++;
            }
        }
        return flowersResult;
    }

}