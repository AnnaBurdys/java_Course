package by.kursy.annaburdys.javatasks.Homework.Stage06;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input char a : ");
        String a = scanner.nextLine();
        String msg;

        if (a.equals("a") || a.equals("e") || a.equals("i") || a.equals("o") || a.equals("y")
                || a.equals("u")) {
            msg = "Vowel";
        } else {
            msg = "Consonant";
        }
        System.out.println(msg);
    }
}