package by.kursy.annaburdys.javatasks.Classwork.Stage04;
import java.util.Scanner;

// приоритет логических операций
//1) ! - NOT
//2)  ^ - XOR
//3) && - AND
//4) || - OR

public class Task03 {

    public static void main(String[] args) {

        //input block
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        //business logic block
        boolean result = a % 2 + b % 2 + c % 2 <=2;

        //UI
        String msg = result ? "At least one number is even " : "Not all numbers are not even";

        //output block
        System.out.println(msg);
    }
}
