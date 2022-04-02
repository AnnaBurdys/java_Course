package by.kursy.annaburdys.javatasks.Homework.Stage11;

import java.util.Scanner;

import static by.kursy.annaburdys.javatasks.Classwork.Stage08.Task03.factorial;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Input number: ");
        number = scanner.nextInt();
        long fact = factorial(number);
        String msg = String.format("%d! = %d", number, fact);
        System.out.println(msg);
    }

}
