package by.kursy.annaburdys.javatasks.Homework_Extra.Stage07;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input date : ");

        int date = scanner.nextInt();
        if (date < 1 || date > 365) {
            System.out.println("You entered wrong date");
            return;
        }

        String msg = String.format("Date %d is: %s", date, defineDay(date));
        System.out.println(msg);
    }

    public static String defineDay(int date) {
        String day;
        if (date % 7 == 0) {
            day = "Monday";
        } else if (date % 7 == 1) {
            day = "Tuesday";
        } else if (date % 7 == 2) {
            day = "Wednesday";
        } else if (date % 7 == 3) {
            day = "Thursday";
        } else if (date % 7 == 4) {
            day = "Friday";
        } else if (date % 7 == 5) {
            day = "Saturday";
        } else {
            day = "Sunday";
        }
        return day;
    }
}
