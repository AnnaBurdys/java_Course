package by.kursy.annaburdys.javatasks.Homework.Stage08;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "Your card is ";
        System.out.println("Input your card type: ");
        String type = scanner.nextLine();

        switch (type) {
            case "6": type = "six"; break;
            case "7": type = "seven"; break;
            case "8": type = "eight"; break;
            case "9": type = "nine"; break;
            case "10": type = "ten"; break;
            case "11": type = "jack"; break;
            case "12": type = "queen"; break;
            case "13": type = "king"; break;
            case "14": type = "ace"; break;
            default:  System.out.println("Suit Error "); return;
        }

        System.out.println("Input your suit: ");
        String suit = scanner.nextLine();

        switch (suit) {
            case "1": suit = " of spades"; break;
            case "2": suit = " of clubs"; break;
            case "3": suit = " of diamonds"; break;
            case "4" : suit = " of hearts"; break;
            default: System.out.println("Suit Error "); return;
        }

        System.out.println(result + type + suit);
    }
}
