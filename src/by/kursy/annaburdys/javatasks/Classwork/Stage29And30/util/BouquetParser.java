package by.kursy.annaburdys.javatasks.Classwork.Stage29And30.util;

import by.kursy.annaburdys.javatasks.Classwork.Stage23.entity.Flower;
import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.model.Bouquet;
import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.model.Chamomile;
import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.model.FlowerType;
import by.kursy.annaburdys.javatasks.Classwork.Stage29And30.model.Rose;

import java.io.*;

public class BouquetParser {
    public static void writeBouquet(String fileName, Bouquet bouquet) {
        try (Writer stream = new BufferedWriter(
                new FileWriter(fileName))) {
            for (Flower flower : bouquet) {
                if (flower instanceof Rose) {
                    Rose rose = (Rose)flower;
                    stream.write(FlowerType.ROSE + " ");
                    stream.write(rose.getLengthOfThorn() + " ");

                } else if (flower instanceof Chamomile) {
                    Chamomile chamomile = (Chamomile)flower;
                    stream.write(chamomile.getPetalCount() + " ");
                }
                stream.write(flower.getName() + " ");
                stream.write(flower.getColor() + " ");
                stream.write(flower.getPrice() + " ");
                stream.write(flower.getWeight() + " ");
                stream.write(flower.getLength() + "\n");
            }
            stream.flush();

        } catch (IOException exception) {
            System.err.println(exception);
        }
    }

    public static Bouquet readBouquet(String fileName) {
        Bouquet bouquet = new Bouquet();
        try (BufferedReader stream = new BufferedReader(new FileReader(fileName))) {
            while (stream.ready()) {


                String s = stream.readLine();
                String[] params = s.split(" ");

                FlowerType type = FlowerType.valueOf(params[0]);

                switch(type) {
                    case ROSE:
                        Rose rose = new Rose();
                        rose.setLengthOfThorn(Double.parseDouble(params[1]));
                        break;
                    case CHAMOMILE:
                        Chamomile chamomile = new Chamomile();
                        chamomile.setPetalCount(Integer.parseInt(params[1]));
                        break;
                }

                Flower flower = new Flower();
                flower.setName(params[2]);
                flower.setColor(params[3]);
                flower.setPrice(Double.parseDouble(params[4]));
                flower.setWeight(Double.parseDouble(params[5]));
                flower.setLength(Integer.parseInt(params[6]));

                bouquet.add(flower);
            }
        } catch (IOException exception) {
            System.err.println(exception);
        }
        return bouquet;
    }
}