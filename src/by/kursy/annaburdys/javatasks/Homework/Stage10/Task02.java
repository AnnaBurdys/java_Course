package by.kursy.annaburdys.javatasks.Homework.Stage10;

import java.util.Random;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user amount: ");
        int amount = scanner.nextInt();
        if (amount > 8) {
            System.out.println("Места нет на столько человек");
            return;
        }

        System.out.println("\nCards on the table are: ");
        String tableCard1 = createCard();
        String tableCard2 = createCard();
        String tableCard3 = createCard();
        String tableCard4 = createCard();
        String tableCard5 = createCard();

        while  (tableCard1.equals(tableCard2) || tableCard1.equals(tableCard3) || tableCard1.equals(tableCard4)
        || tableCard1.equals(tableCard5) || tableCard2.equals(tableCard3) || tableCard2.equals(tableCard4)
        || tableCard2.equals(tableCard5) || tableCard3.equals(tableCard4) || tableCard3.equals(tableCard5)
        || tableCard4.equals(tableCard5)) {
            tableCard1 = createCard();
            tableCard2 = createCard();
            tableCard3 = createCard();
            tableCard4 = createCard();
            tableCard5 = createCard();
        }

        System.out.println(tableCard1);
        System.out.println(tableCard2);
        System.out.println(tableCard3);
        System.out.println(tableCard4);
        System.out.println(tableCard5);

        System.out.println("\nCards of users: ");
        for (int i=1; i<=amount; i++) {
            String userCard1 = createCard();
            String userCard2 = createCard();
            while (userCard1.equals(userCard2) || userCard1.equals(tableCard1) || userCard1.equals(tableCard2) ||
                    userCard1.equals(tableCard3) || userCard1.equals(tableCard4) || userCard1.equals(tableCard5) ||
                    userCard2.equals(tableCard1) || userCard2.equals(tableCard2) || userCard2.equals(tableCard3) ||
                    userCard2.equals(tableCard4) || userCard2.equals(tableCard5)) {
                userCard1 = createCard();
                userCard2 = createCard();
            }
            System.out.println("User " + i + ": " + createCard() + ", " + createCard());
        }
    }

    public static String createCard() {
        Random random = new Random();
        String card = "";
        int cardNumber = random.nextInt(7) + 6;
        switch (cardNumber) {
            case 6: card += "six"; break;
            case 7: card += "seven"; break;
            case 8: card += "eight"; break;
            case 9: card += "nine"; break;
            case 10: card += "ten"; break;
            case 11: card += "jack"; break;
            case 12: card += "queen"; break;
            case 13: card += "king"; break;
            case 14: card += "ace"; break;
        }

        int cardSuit = random.nextInt(4) + 1;
        switch (cardSuit) {
            case 1: card += " of spades"; break;
            case 2: card += " of clubs"; break;
            case 3: card += " of diamonds"; break;
            case 4: card += " of hearts"; break;
        }
        return card;
    }
}