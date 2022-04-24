package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelC;

public class Model {
    public static float countAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return (float) sum / array.length;
    }

    public static double countGeometricAverage(int[] array) {
        int multiple = 1;
        for (int element : array) {
            multiple *= element;
        }
        return Math.pow(multiple, 1.0/array.length);
    }

    public static int countMoreThanAverageAmount(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element > countAverage(array)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countMoreThanGeometricAverageAmount(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element > countGeometricAverage(array)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countLessThanAverageAmount(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element < countAverage(array)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countLessThanGeometricAverageAmount(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element < countGeometricAverage(array)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countEqualsAverageAmount(int[] array, double number) {
        int counter = 0;
        for (int element : array) {
            if ((element < countAverage(array) + number) && (element > countAverage(array) - number)) {
                counter++;
            }
        }
        return counter;
    }

    public static int countEqualsGeometricAverageAmount(int[] array, double number) {
        int counter = 0;
        for (int element : array) {
            if ((element < countGeometricAverage(array) + number) && (element > countGeometricAverage(array) - number)) {
                counter++;
            }
        }
        return counter;
    }

}
