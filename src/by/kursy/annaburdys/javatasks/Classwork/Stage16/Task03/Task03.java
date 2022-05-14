package by.kursy.annaburdys.javatasks.Classwork.Stage16.Task03;

import java.util.Random;

public class Task03 {
    private static final int MAX_GROUP_NUMBERS = 10;
    private static final int MIN_GROUP_NUMBERS = 5;
    private static final int MAX_STUDENT_NUMBERS = 10;
    private static final int MIN_STUDENT_NUMBERS = 2;
    private static final int MAX_MARK = 10;
    private static final int MIN_MARK = 4;

    private static final Random RND = new Random();

    public static int[][] createGroups() {
        int number = RND.nextInt(MAX_GROUP_NUMBERS - MIN_GROUP_NUMBERS + 1);

        int[][] groups = new int[number][];
        for (int i = 0; i < groups.length; i++) {
            number = RND.nextInt(MAX_STUDENT_NUMBERS - MIN_STUDENT_NUMBERS + 1);
            groups[i] = new int[number];
        }
        return groups;
    }

    public static void showAllGroups(int[][] groups) {
        for (int i = 0; i < groups.length; i++) {
            System.out.print("Group [" + (i+1) + "]: ");
            for (int j = 0; j < groups[i].length; j++) {
                System.out.print(groups[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void init (int[][] groups) {
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                groups[i][j] = RND.nextInt(MAX_MARK - MIN_MARK + 1);
            }
        }
    }

    public static int findBestGroupIndex(int[][] groups) {
        int iMax = 0;
        double avgMax = Integer.MIN_VALUE;
        for (int i = 0; i < groups.length; i++) {
            double sum = 0;
            for (int j = 0; j < groups[i].length; j++) {
                sum += groups[i][j];
            }
            double avg = sum/groups[i].length;

            System.out.println("Group [" + (i+1) + "]: " + avg);
            if(avg > avgMax) {
                iMax = i;
            }
        }
        return iMax;
    }

    public static void main(String[] args) {
        int[][] groups = createGroups();

        init(groups);

        showAllGroups(groups);
        int index = findBestGroupIndex(groups);
        System.out.println("Best group - " + (index + 1));
    }

}