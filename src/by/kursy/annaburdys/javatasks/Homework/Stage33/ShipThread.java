package by.kursy.annaburdys.javatasks.Homework.Stage33;

public class ShipThread implements Runnable {
    static int cargo;
    int car;
    int loadTime;
    int delTime;

    int result = 0;

    static long TIME = System.currentTimeMillis();

    public ShipThread(int cargo, int car, int loadTime, int delTime) {
        ShipThread.cargo = cargo;
        this.car = car;
        this.loadTime = loadTime;
        this.delTime = delTime;
    }

    public ShipThread() {
    }

    @Override
    public void run() {
        while (cargo > 0) {
            try {
                cargo -= car;
                result++;
                Thread.sleep((long) loadTime * car);
                Thread.sleep(delTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " (with capacity " + car + ") has worked for " + result + " time(s)" + "\n");
    }

    public double getTime() {
        return (double) ((System.currentTimeMillis() - TIME));
    }
}