package by.kursy.annaburdys.javatasks.Classwork.Stage11.Task03.model;

public class Logic {

    public static int countEvenSum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

}