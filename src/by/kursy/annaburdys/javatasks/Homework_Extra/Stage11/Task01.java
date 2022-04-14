package by.kursy.annaburdys.javatasks.Homework_Extra.Stage11;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;

        System.out.print("Input first number: ");
        number1 = scanner.nextInt();
        System.out.print("Input second number: ");
        number2 = scanner.nextInt();

        int nod = findNod(number1, number2);
        int nok = findNok(number1, number2);
        String msg = String.format("""
                Numbers are %d and %d
                NOD is %d
                NOK is %d""", number1, number2, nod, nok);
        System.out.println(msg);
    }

    public static int findNod(int number1, int number2) {
        int nod = 1;
        int i = Math.min(number1, number2);
        for (; i > 1; i--) {
            if (number1 % i == 0) {
                nod = i;
            }
        }
        return nod;
    }

    public static int findNok(int number1, int number2) {
        int nok;
        int i = Math.min(number1, number2);
        for (; ; i++) {
            if (i % number1 == 0 && i % number2 == 0) {
                nok = i;
                break;
            }
        }
        return nok;
    }

}
