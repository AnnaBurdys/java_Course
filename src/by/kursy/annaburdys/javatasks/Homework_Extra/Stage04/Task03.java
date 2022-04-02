package by.kursy.annaburdys.javatasks.Homework_Extra.Stage04;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input square side a and rectangle sides b and c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextInt();

        double rect_S = b * c;
        double square_S = a * a;
        int square_Amount = (int) ((int) rect_S/square_S);
        double free_Space = rect_S % square_S;
        String msg = String.format("There are %d squares in a rectangle\nFree space = %.2f;", square_Amount, free_Space);

        System.out.println(msg);

        scanner.close();
    }

}
