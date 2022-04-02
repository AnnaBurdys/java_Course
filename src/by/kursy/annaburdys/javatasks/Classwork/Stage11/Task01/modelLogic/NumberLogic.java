package by.kursy.annaburdys.javatasks.Classwork.Stage11.Task01.modelLogic;

public class NumberLogic {
    public static int sumAllDigits(int number) {
        int sum = 0;
        while (number > 0) {
            while (number != 0) {
                int t = number % 10;
                if (t % 2 == 0) {
                    sum += t;
                }
                number /= 10;
            }
        }
        return sum;
    }
}