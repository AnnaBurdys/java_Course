package by.kursy.annaburdys.javatasks.Classwork.Stage21.example02;

public class ToothBrush implements SwitchComponent {

    @Override
    public void on() {
        System.out.println("On");
    }

    @Override
    public void off() {
        System.out.println("Off");
    }
}
