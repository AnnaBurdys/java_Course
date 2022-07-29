package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Bouquet3;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Flower;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.logic.ShopAssistance;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;


public class ShopAssistanceTest {
    private static Bouquet3 bouquet3;


    @BeforeClass
    public static void init() {
        Flower[] flowers = {
                new Flower("Rose", "red", 3, 100, 100),
                new Flower("Rose", "red", 3, 100, 80),
                new Flower("Rose", "red", 3, 100, 100),
                new Flower("Rose", "red", 3, 100, 50)
        };
        bouquet3 = new Bouquet3(flowers);
    }

    @AfterClass
    public static void destroy() {
       bouquet3 = null;
    }

    @Before // перед каждым тестовым методом
    public void connect(){
        System.out.println("Connect to database..");
    }

    @After // после каждого тестового метода
    public void disconnect() {
        System.out.println("Disconnect from database..");
    }

    @Test
    public void testCalculateTotalPricePositive() {

        double expected = (ShopAssistance.LABOR_PERCENT + 1) * 12;

        double actual = ShopAssistance.calculateTotalPrice(bouquet3);

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
        Bouquet3 bouquet3 = new Bouquet3(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalPrice(bouquet3);

        assertEquals(expected, actual, 0.0);
    }


    @Test
    public void testCalculateTotalWeightPositive() {

        double expected = 400;

        double actual = ShopAssistance.calculateTotalWeight(bouquet3);

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
        Bouquet3 bouquet3 = new Bouquet3(flowers);

        double expected = 0;

        double actual = ShopAssistance.calculateTotalWeight(bouquet3);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testFindMaxLengthFlowersFirst() {

        Flower[] expected = {new Flower("Rose", "red", 3, 100, 100)};
        Flower[] actual = ShopAssistance.findMaxLengthFlowers(bouquet3);

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
        Flower[] actual = ShopAssistance.findMaxLengthFlowers(bouquet3);

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