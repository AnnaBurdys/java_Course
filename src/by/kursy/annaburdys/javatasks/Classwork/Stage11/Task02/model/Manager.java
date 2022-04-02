package by.kursy.annaburdys.javatasks.Classwork.Stage11.Task02.model;

public class Manager {
    public static final int MARK_COUNT = 5;
    public static double countMark (int mark1, int mark2, int mark3, int mark4, int mark5) {
        double sum = mark1+mark3+mark3+mark4+mark5;
        return sum/MARK_COUNT;
    }
}
