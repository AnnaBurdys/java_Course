package by.kursy.annaburdys.javatasks.Homework.Stage12.Task03;

public class Model {
    public static boolean isDifferent(int[] array) {
        boolean flag = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
