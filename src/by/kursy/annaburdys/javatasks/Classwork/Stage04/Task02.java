package by.kursy.annaburdys.javatasks.Classwork.Stage04;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        //input block
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //business logic block
        boolean result = a % 2 + b % 2 + c % 2 > 1;

        //UI
        String msg = result ? "Majority of numbers are even " : "Majority of numbers are not even";

        //output block
        System.out.println(msg);
    }
}