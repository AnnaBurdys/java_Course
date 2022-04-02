package by.kursy.annaburdys.javatasks.Classwork.Stage05;
//найти сумму всех цифр данного пятизначного числа 12345

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input number : ");
        int n = scanner.nextInt();
        int sum = 0;

        sum += n % 10;
        n /= 10;
        sum += n % 10;
        n /= 10;
        sum += n % 10;
        n /= 10;
        sum += n % 10;
        n /= 10;
        sum += n % 10;
        n /= 10;
        System.out.println(sum);

      /*  while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum); */

    }
}
