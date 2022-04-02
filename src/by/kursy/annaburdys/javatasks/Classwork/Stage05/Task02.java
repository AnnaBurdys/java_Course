package by.kursy.annaburdys.javatasks.Classwork.Stage05;
// вводится 4 числа, минимальное и максимальное значение

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number a : ");
        int a = scanner.nextInt();
        System.out.print("Input number b : ");
        int b = scanner.nextInt();
        System.out.print("Input number c : ");
        int c = scanner.nextInt();
        System.out.print("Input number d : ");
        int d = scanner.nextInt();
        int max = d;

        if (a > b && a > c && a > d) {
            max = a;
        } else if (c > d) {
            max = c;
        } else {
            System.out.println("max " + max);
        }
        
    }
}