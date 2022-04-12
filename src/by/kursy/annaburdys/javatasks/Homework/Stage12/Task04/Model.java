package by.kursy.annaburdys.javatasks.Homework.Stage12.Task04;

public class Model {
    public static int countSumOfEvenElements(int[] array) {
        int sum = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                break;
            }
        }
        return sum;
    }
}
