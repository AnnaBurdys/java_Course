package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task04;

public class BinarySearch {
    public static boolean checkValue(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return true;
            } else if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle -1;
            }
        }
        return false;
    }
}
