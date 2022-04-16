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

    public static void insertedSortAsc(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > element) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = element;
        }
    }

    public static void selectedSortAsc(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = true;
            for (int q = 0; q < array.length; q++) {
                if (array[q] > array[q+1]) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                break;
            }

            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[index] > array[j]) {
                    index = j;
                }
            }
            int t = array[i];
            array[i] = array[index];
            array[index] = t;
        }
    }

}