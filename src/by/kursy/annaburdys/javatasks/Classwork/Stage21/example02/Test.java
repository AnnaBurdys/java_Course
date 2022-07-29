package by.kursy.annaburdys.javatasks.Classwork.Stage21.example02;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ToothBrush toothBrush = new ToothBrush();
        consult(toothBrush);
        TVSet tvSet = new TVSet();
        consult(tvSet);
    }

    public static void consult(SwitchComponent component) throws InterruptedException {
        component.on();
        Thread.sleep(2000);
        component.off();
    }

    public static void user(Showable showable) throws InterruptedException {
        showable.show();
        Thread.sleep(2000);
        showable.show();
        Thread.sleep(2000);
        showable.show();
        Thread.sleep(2000);
    }

}
