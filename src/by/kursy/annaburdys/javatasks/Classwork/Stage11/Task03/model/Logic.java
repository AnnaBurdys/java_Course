package by.kursy.annaburdys.javatasks.Classwork.Stage11.Task03.model;

public class Logic {
    public static int countEvenSum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }
}