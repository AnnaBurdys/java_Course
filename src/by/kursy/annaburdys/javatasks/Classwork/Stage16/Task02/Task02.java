package by.kursy.annaburdys.javatasks.Classwork.Stage16.Task02;

public class Task02 {
    public static void main(String[] args) {
        int[][] arrays = new int [10][];

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new int [(i + 1) * 2];
        }

        showInConsole(arrays);
    }

    public static void showInConsole(int[][] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }
    }

}
