package by.kursy.annaburdys.javatasks.Homework.Stage12.Task05;

public class Model {
    public static int countAmountOfMarks(int[] array, int mark) {
        int count = 0;
        for (int element : array) {
            if (element == mark) {
                count++;
            }
        }
        return count;
    }

    public static float countPercent(int[] array, int markAmount) {
        int a = array.length;
        float percent;
        percent = (float) (markAmount * 100 / a);
        return percent;
    }
}