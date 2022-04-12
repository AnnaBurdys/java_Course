package by.kursy.annaburdys.javatasks.Homework.Stage12.Task02;

public class Model {
    public static boolean isSortedFromMiddle(int[] array) {
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[array.length - i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}