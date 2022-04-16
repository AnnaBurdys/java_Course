package by.kursy.annaburdys.javatasks.Classwork.Stage13;

public class ArraySorter {
    public static void bubbleSortAcs(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean flag = true;
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }

        public static void bubbleSortDecs(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            boolean flag = true;
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
    }



}