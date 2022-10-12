package by.kursy.annaburdys.javatasks.Homework.Stage33;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Ship obj = new Ship();

        Thread ship1 = new Thread(new ShipThread(obj.cargo, obj.shipWeight1, obj.loadTime, obj.delTime1));
        Thread ship2 = new Thread(new ShipThread(obj.cargo, obj.shipWeight2, obj.loadTime, obj.delTime2));
        Thread ship3 = new Thread(new ShipThread(obj.cargo, obj.shipWeight3, obj.loadTime, obj.delTime3));

        ship1.start();
        ship2.start();
        ship3.start();

        ship1.setName("Ship1");
        ship2.setName("Ship2");
        ship3.setName("Ship3");

        ship1.join();
        ship2.join();
        ship3.join();

        System.out.println("Total time: " + ((new ShipThread().getTime()) / 60000 + " minutes"));
    }

}
