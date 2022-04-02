package by.kursy.annaburdys.javatasks.Homework.Stage11;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {

        System.out.println(count());

    }

    public static String count () {
        Random random = new Random();
        int counterHead = 0;
        int counterTail = 0;
        for (int i = 0; i< 1000; i++) {
            int choice = random.nextInt(2);
            if (choice == 0) {
                counterTail++;
            } else counterHead++;
        }
       return "Heads - " + counterHead + "\nTails - " + counterTail;
    }
}
