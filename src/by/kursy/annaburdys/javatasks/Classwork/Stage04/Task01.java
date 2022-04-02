package by.kursy.annaburdys.javatasks.Classwork.Stage04;
import java.util.Scanner;
public class Task01 {

    public static void main(String[] args) {
        //input block
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //business logic block
        boolean result = a % 2 == 0 && b % 2 == 0 && c % 2 == 0;

        //UI
        String msg = result ? "All numbers are even " : "Some numbers are not even";

        //output block
        System.out.println(msg);

    }
}