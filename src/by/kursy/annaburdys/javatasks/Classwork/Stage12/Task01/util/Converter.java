package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task01.util;

public class Converter {
    public static String convertFromArrayToString(int[] array) {
        String result = "";

        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }
        return result;
    }
}
