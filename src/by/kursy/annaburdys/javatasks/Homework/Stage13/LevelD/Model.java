package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelD;

import by.kursy.annaburdys.javatasks.Classwork.Stage13.ArraySorter;

public class Model {

    public static boolean areDifferent(int[] array) {
        boolean flag = true;
        ArraySorter.insertedSortAsc(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean areSame(int[] array) {
        boolean flag = true;
        ArraySorter.insertedSortAsc(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != array[i]) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean areSameOnce(int[] array) {
        boolean flag = false;
        ArraySorter.insertedSortAsc(array);
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] == array[i]) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean areOppositeOnce(int[] array) {
        boolean flag = false;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] == -array[i + 1]) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    public static boolean areAllPositive(int[] array) {
        boolean flag = true;
        for (int element : array) {
            if (element <= 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean areAllNegative(int[] array) {
        boolean flag = true;
        for (int element : array) {
            if (element >= 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean areAllOdd(int[] array) {
        boolean flag = true;
        for (int element : array) {
            if (element % 2 == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean areAllEven(int[] array) {
        boolean flag = true;
        for (int element : array) {
            if (element % 2 != 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static boolean isPositiveOnce(int[] array) {
        boolean flag = false;
        for (int element : array) {
            if (element > 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean isNegativeOnce(int[] array) {
        boolean flag = false;
        for (int element : array) {
            if (element < 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean isOnePositive(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter = i;
                break;
            }
        }
        for (int i = counter + 1; i < array.length; i++) {
            if (array[i] >= 0) return false;
        }
        return true;
    }

    public static boolean isOneNegative(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                counter = i;
                break;
            }
        }
        for (int i = counter + 1; i < array.length; i++) {
            if (array[i] <= 0) return false;
        }
        return true;
    }

    public static boolean arePositiveMajority(int[] array) {
        boolean flag;
        int counter = 0;
        for (int element : array) {
            if (element > 0) {
                counter++;
            }
        }
        flag = counter >= (double) array.length / 2;

        return flag;
    }

    public static boolean areNegativeMajority(int[] array) {
        boolean flag;
        int counter = 0;
        for (int element : array) {
            if (element < 0) {
                counter++;
            }
        }
        flag = counter >= (double) array.length / 2;
        return flag;
    }

    public static boolean areNegativeMinority(int[] array) {
        boolean flag;
        int counter = 0;
        for (int element : array) {
            if (element < 0) {
                counter++;
            }
        }
        flag = counter <= (double) array.length / 2;
        return flag;
    }

    public static boolean arePositiveMinority(int[] array) {
        boolean flag;
        int counter = 0;
        for (int element : array) {
            if (element > 0) {
                counter++;
            }
        }
        flag = counter <= (double) array.length / 2;
        return flag;
    }

    public static boolean areOddMajority(int[] array) {
        boolean flag;
        int counter = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        flag = counter >= (double) array.length / 2;
        return flag;
    }

    public static boolean areEvenMajority(int[] array) {
        boolean flag;
        int counter = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                counter++;
            }
        }
        flag = counter >= (double) array.length / 2;
        return flag;
    }

    public static boolean areEvenMinority(int[] array) {
        boolean flag;
        int counter = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        flag = counter <= (double) array.length / 2;
        return flag;
    }

    public static boolean areOddMinority(int[] array) {
        boolean flag;
        int counter = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                counter++;
            }
        }
        flag = counter <= (double) array.length / 2;
        return flag;
    }

    public static boolean areOddOnce(int[] array) {
        boolean flag = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean areEvenOnce(int[] array) {
        boolean flag = false;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static boolean isOneEven(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counter = i;
                break;
            }
        }
        for (int i = counter + 1; i < array.length; i++) {
            if (array[i] % 2 == 0) return false;
        }
        return true;
    }

    public static boolean isOneOdd(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                counter = i;
                break;
            }
        }
        for (int i = counter + 1; i < array.length; i++) {
            if (array[i] % 2 != 0) return false;
        }
        return true;
    }




}