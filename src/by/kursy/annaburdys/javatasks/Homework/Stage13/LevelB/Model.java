package by.kursy.annaburdys.javatasks.Homework.Stage13.LevelB;

public class Model {
    public static int countMoreThanNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (element > number) {
                counter++;
            }
        }
        return counter;
    }

    public static int countLessThanNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (element < number) {
                counter++;
            }
        }
        return counter;
    }

    public static int countEqualsNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (element == number) {
                counter++;
            }
        }
        return counter;
    }

    public static int countNotEqualsNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (element != number) {
                counter++;
            }
        }
        return counter;
    }

    public static int countAliquotNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (element % number == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countNotAliquotNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (element % number != 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int countAbsMoreThanNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (Math.abs(element) > number) {
                counter++;
            }
        }
        return counter;
    }

    public static int countAbsLessThanNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (Math.abs(element) < number) {
                counter++;
            }
        }
        return counter;
    }

    public static int countAbsEqualsNumberElements (int[] array, int number) {
        int counter = 0;
        for (int element : array) {
            if (Math.abs(element) == number) {
                counter++;
            }
        }
        return counter;
    }

}