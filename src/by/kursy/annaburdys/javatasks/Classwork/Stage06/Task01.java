package by.kursy.annaburdys.javatasks.Classwork.Stage06;
//рождается с 3 головами
//если меньше 200 лет каждый год + 3 головы    - лет *3
//от 201 до 300 растёт по 2 головы
//301+ растёт по одной голов
// кол-во голов если дракону n лет

import java.util.Scanner;

public class Task01 {
    public static final int FIRST_PERIOD = 200;
    public static final int SECOND_PERIOD = 300;
    public static final int FIRST_HEAD = 3;
    public static final int SECOND_HEAD = 2;
    public static final int BIRTH_HEAD = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input dragon's age : ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Error...");
            return;
        }
        int head = BIRTH_HEAD;
        if (age <= FIRST_PERIOD) {
            head += age * FIRST_HEAD;
        } else if (age <= SECOND_PERIOD) {
            head += FIRST_PERIOD * FIRST_HEAD + (age - FIRST_PERIOD) * SECOND_HEAD;
        } else {
            head += FIRST_PERIOD * FIRST_HEAD + (SECOND_PERIOD-FIRST_PERIOD) * SECOND_HEAD
                    + (age - SECOND_PERIOD);
        }
        String s = String.format("Dragon has %d heads", head);
        System.out.println(s);
    }
}