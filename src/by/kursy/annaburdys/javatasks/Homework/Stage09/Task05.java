package by.kursy.annaburdys.javatasks.Homework.Stage09;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialDeposit = 1000;
        System.out.println("Enter percent P: ");
        int percent = scanner.nextInt();

        if (percent < 0 || percent > 25) {
            System.out.println("Error");
            return;
        }

        String msg = String.format("After %d months the deposit is %d",
                countMonth(percent, initialDeposit),
                countDeposit(percent, initialDeposit));
        System.out.println(msg);
    }

    public static int countMonth (int percent, int initialDeposit) {
        int month = 0;
        while (initialDeposit>=2000) {
            month++;
            initialDeposit = initialDeposit * (1+percent/100);
        }
        return month;
    }

    public static int countDeposit (int percent, int initialDeposit) {
        while (initialDeposit>=2000) {
            initialDeposit = initialDeposit * (1+percent/100);
        }
        return initialDeposit;
    }

}