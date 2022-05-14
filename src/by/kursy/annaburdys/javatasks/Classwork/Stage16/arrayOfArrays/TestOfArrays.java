package by.kursy.annaburdys.javatasks.Classwork.Stage16.arrayOfArrays;

import java.util.Random;

public class TestOfArrays {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];

        System.out.println("Before: ");
        showInConsole(matrix);

        init(matrix);

        System.out.println("\nAfter: ");
        showInConsole(matrix);

        int max = max(matrix);
        System.out.println("Max matrix element = " + max);

        int sum = sumMainDiagonalElements(matrix);
        System.out.println("Sum of main diagonal elements = " + sum);

        sum = sumAdditionalDiagonalElements(matrix);
        System.out.println("Sum of additional diagonal elements = " + sum);
    }

    public static void showInConsole(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void init(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    public static int max(int[][] matrix) {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static int sumMainDiagonalElements (int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
                    sum += matrix[i][i];
        }
        return sum;
    }

    public static int sumAdditionalDiagonalElements (int[][] matrix) {
        int sum = 0;
        int iLast = matrix.length - 1;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][iLast - i];
        }
        return sum;
    }


}
