package by.kursy.annaburdys.javatasks.Homework.Stage12.Task01;

public class Model {
    public static boolean isSorted(int[] array) {
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}