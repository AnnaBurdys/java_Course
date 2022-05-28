package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Bouquet;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Flower;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class ShopAssistanceTest {
    private Bouquet bouquet;

    {
        Flower[] flowers = {
                new Flower("Rose", "red", 3, 100, 100),
                new Flower("Rose", "red", 3, 100, 80),
                new Flower("Rose", "red", 3, 100, 100),
                new Flower("Rose", "red", 3, 100, 50)
        };
        bouquet = new Bouquet(flowers);
    }


    @Test
    public void testCalculateTotalPricePositive() {

        double expected = (ShopAssistance.LABOR_PERCENT + 1) * 12;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateTotalPriceWithNull() {
        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalPriceWithEmptyObject() {
        Flower[] flowers = {};
        Bouquet bouquet = new Bouquet(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(bouquet);

        assertEquals(expected, actual, 0.0);
    }


    @Test
    public void testCalculateTotalWeightPositive() {

        double expected = 400;

        double actual = ShopAssistance.calculateTotalWeight(bouquet);

        assertEquals(expected, actual, 0.1);
    }

    @Test
    public void testCalculateTotalWeightWithNull() {
        double expected = 0;

        double actual = ShopAssistance.calculateTotalWeight(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalWeightWithEmptyObject() {
        Flower[] flowers = {};
        Bouquet bouquet = new Bouquet(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalWeight(bouquet);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testFindMaxLengthFlowersFirst() {

        Flower[] expected = {new Flower("Rose", "red", 3, 100, 100)};
        Flower[] actual = ShopAssistance.findMaxLengthFlowers(bouquet);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLength() != actual[i].getLength() || expected[i].getPrice() != actual[i].getPrice() ||
                    expected[i].getWeight() != actual[i].getWeight() || !expected[i].getColor().equals(actual[i].getColor()) ||
                    !expected[i].getName().equals(actual[i].getName())) {
                fail();
            }
        }
        //  assertArrayEquals(expected,actual);
    }

    @Test
    public void testFindMaxLengthFlowersSecond() {

        Flower[] expected = {new Flower("Rose", "red", 3, 100, 100)};
        Flower[] actual = ShopAssistance.findMaxLengthFlowers(bouquet);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLength() != actual[i].getLength() || expected[i].getPrice() != actual[i].getPrice() ||
                    expected[i].getWeight() != actual[i].getWeight() || !expected[i].getColor().equals(actual[i].getColor()) ||
                    !expected[i].getName().equals(actual[i].getName())) {
                fail();
            }
        }
        //  assertArrayEquals(expected,actual);
    }

}