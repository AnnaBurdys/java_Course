package by.kursy.annaburdys.javatasks.Homework_Extra.Stage10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day: ");
        int day = scanner.nextInt();
        System.out.println("Enter a month: ");
        int month = scanner.nextInt();
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        String currentDate = String.format("Current date: %d.%d.%d", day, month, year);
        System.out.println(currentDate);

        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1) {
            return;
        }

        int nextDay;
        int nextMonth;
        int nextYear = year;
        
        if (day == 31) {
            nextDay = 1;
            nextMonth = month++;
        }
            else if (month == 12 && day == 31) {
                nextYear++;
                nextMonth = 1;
                nextDay = 1;
        }
        else {
            nextDay = day++;
            nextMonth = month + 1;
        }
        String nextDate = String.format("Current date: %d.%d.%d", nextDay, nextMonth, nextYear);
        System.out.println(nextDate);
    }
}