package by.kursy.annaburdys.javatasks.Classwork.Stage09;

import java.util.Random;

public class Task05 {

    public static final int MOOD_NUMBERS = 5;
    public static final String GOOD_MOOD = ":)";
    public static final String BAD_MOOD = ":(";
    public static final String NEUTRAL_MOOD = ":|";
    public static final String NERVOUS_MOOD = ":/";
    public static final String SHOUT_MOOD = ":()";

    public static void main(String[] args) {
        String msg = ("Your mood is " + getMood());
        System.out.println(msg);
    }

    public static String getMood() {

        Random random = new Random();
        int number = random.nextInt(MOOD_NUMBERS);
        String mood = GOOD_MOOD;

        switch (number) {
            case 1: mood = BAD_MOOD; break;
            case 2: mood = SHOUT_MOOD; break;
            case 3: mood = NEUTRAL_MOOD; break;
            case 4: mood = NERVOUS_MOOD; break;
        }
        return mood;
    }
}