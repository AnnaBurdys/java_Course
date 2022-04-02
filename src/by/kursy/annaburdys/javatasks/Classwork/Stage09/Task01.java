package by.kursy.annaburdys.javatasks.Classwork.Stage09;
// таблица пифагора

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input table size: ");
        int size = scanner.nextInt();
        if (size<0) {
            System.out.println("Error");
            return;
        }
        System.out.println(createTable(size));
        scanner.close();
    }

    public static String createTable(int size) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= size; i++) {
            for (int k = 1; k <= size; k++) {
                builder.append(k * i).append("\t");
            }
            builder.append("\n");
        }
        return builder + "";
    }
}