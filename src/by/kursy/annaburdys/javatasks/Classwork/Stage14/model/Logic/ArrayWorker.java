package by.kursy.annaburdys.javatasks.Classwork.Stage14.model.Logic;

public class ArrayWorker {
    public static void reverse(int[] array) {
        //fool prove
        if (array == null) {
            return;
        }
        int size = array.length / 2;
        for (int i = 0; i < size; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}