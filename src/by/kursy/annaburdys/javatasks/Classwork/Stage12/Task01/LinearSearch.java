package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task01;

public class LinearSearch {
    public static boolean checkValue(int[] array, int value) {
        for (int element : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    public static int findFirstIndex(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastIndex(int[] array, int value) {
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static int findSecondIndex(int[] array, int value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                counter++;
            }
            if (counter > 1) {
                return i;
            }
        }
        return -1;
    }


    public static int countValue(int[] array, int value) {
        int count = 0;
        for (int element : array) {
            if (element == value) {
                count++;
            }
        }
        return count;
    }
}

    /*public static int findFirstIndex (int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }*/
    /*public static boolean checkValue(int[] array, int value) {
        boolean flag = false;
        for (int i = 0; i<array.length; i++) {
            if (array[i] == value){
                flag = true;
                break;
            }
        }

        return flag;
    }*/