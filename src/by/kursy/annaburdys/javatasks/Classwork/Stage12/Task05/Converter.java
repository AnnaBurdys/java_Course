package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task05;

public class Converter {
    public static String convertFromArrayToString (int[]array) {
        StringBuilder builder = new StringBuilder();
        for (int element : array) {
            builder.append(element).append(" ");
        }
        return builder + "";
    }
}
