package by.kursy.annaburdys.javatasks.Classwork.Stage21.example02;

public class TVSet implements SwitchComponent, Showable {
    @Override
    public void show() {
        System.out.println("Show new program");
    }

    @Override
    public void on() {
        System.out.println("TV is switched on");
    }

    @Override
    public void off() {
        System.out.println("TV is switched off");
    }
}
