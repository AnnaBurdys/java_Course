package by.kursy.annaburdys.javatasks.Classwork.Stage29And30.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.model.*;
import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.util.BouquetParser;
import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.util.FlowerBinaryParser;
import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.util.FlowerCharParser;
import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.util.Serializer;

public class Main {
    public static void main(String[] args) {

        //int number = Integer.MAX_VALUE;
        //NumberParser.writeIntegerNumber(number);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(NumberParser.readIntegerNumber());

//        String fileName = "/Users/annaburdys/Desktop/number.bin";
//
//        Flower flower = new Flower("Rose", "White", 5.5, 0.3, 150);
//
//        FlowerBinaryParser.writeFlower(fileName, flower);
//
//        System.out.println(FlowerBinaryParser.readFlower(fileName));

//        String fileName = "/Users/annaburdys/Desktop/number.bin";
        String fileName = "/Users/annaburdys/Desktop/flower.txt";
        Bouquet bouquet = new Bouquet();

        bouquet.add(new Rose("Rose", "White", 3.5, 0.3, 100, 5.0));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Rose("Rose", "Red", 3.5, 0.3, 50, 2.0));
        bouquet.add(new Rose("Rose", "Yellow", 7., 0.2, 170, 2.0));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));
        bouquet.add(new Chamomile("Simple", "White", 2.0, 0.05, 30, 17));

        Serializer<Bouquet> serializer = new Serializer<>();
        serializer.setFile("/Users/annaburdys/Desktop/flower.txt");
        serializer.serialize(bouquet);
        System.out.println(serializer.deserialize());
        /*
        BouquetParser.writeBouquet(fileName, bouquet);
         System.out.println(BouquetParser.readBouquet(fileName));
         System.out.println(FlowerBinaryParser.readBouquet(fileName));
        */

    }
}