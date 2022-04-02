package by.kursy.annaburdys.javatasks.Homework.Stage08;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result;
        System.out.println("Input your letter: ");
        String letter = scanner.nextLine();

        switch (letter) {
            case "a":
            case "y":
            case "e":
            case "i":
            case "o":
            case "u":
                result = "Letter is vowel"; break;
            default:  System.out.println("Letter is not vowel or not letter"); return;
        }

        System.out.println(result);
    }
}