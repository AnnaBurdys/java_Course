package by.kursy.annaburdys.javatasks.Homework.Stage10;

import java.util.Random;

public class Task01 {

    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(6) + 1;
        int number2 = random.nextInt(6) + 1;
        int sum = countSum(number1, number2);
        String msg = String.format("Number 1 is %d, number 2 is %d\nSum is %d", number1, number2, sum);
        System.out.println(msg);
    }

    public static int countSum (int number1, int number2) {
       int sum = number1 + number2;
       return sum;
    }
}