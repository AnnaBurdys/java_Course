package by.kursy.annaburdys.javatasks.Classwork.Stage12.Task06;

public class Main {
    public static int sum(int... numbers) {
        int sum = 0;
        for (int element: numbers) {
            sum += element;
        }
        return sum;
    }

    public static int max (int... numbers) {
        int max = numbers[0];

        for (int element: numbers) {
            if (max<element) {
                max = element;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6));
        System.out.println(max(1,2,3,4,5,6));
    }
}
