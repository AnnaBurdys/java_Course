package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelA;

public class Model {
    public static int countNonZeroElements(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countEvenElements(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countPositiveElements(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element > 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countZeroElements(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countOddElements(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countNegativeElements(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element < 0) {
                counter++;
            }
        }
        return counter;
    }

}
