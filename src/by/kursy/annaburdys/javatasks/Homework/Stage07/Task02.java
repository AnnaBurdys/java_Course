package by.kursy.annaburdys.javatasks.Homework.Stage07;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x1 : ");
        int x1 = scanner.nextInt();
        System.out.println("Input y1 : ");
        int y1 = scanner.nextInt();
        System.out.println("Input x2 : ");
        int x2 = scanner.nextInt();
        System.out.println("Input y2 : ");
        int y2 = scanner.nextInt();
        System.out.println("Input x : ");
        int x = scanner.nextInt();
        System.out.println("Input y : ");
        int y = scanner.nextInt();
        String msg = String.format("(%d, %d) is inside rectangle: %s", x, y, isInsideRectangle(x1, y1, x2, y2, x, y));
        System.out.println(msg);

    }
    public static boolean isInsideRectangle (int x1, int y1, int x2, int y2, int x, int y) {
        boolean flag = false;
        if ((x>x1 && x<x2) && (y<y1 && y>y2)) {
            flag = true;
        }
        return flag;
    }

}
