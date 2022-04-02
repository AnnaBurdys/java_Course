package by.kursy.annaburdys.javatasks.Homework.Stage08;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "Your age is ";
        System.out.println("Input your age: ");
        int age = scanner.nextInt();
        if (age < 0 || age > 120) {
            System.out.println("Input error");
        }
        String ageFinal;

        switch (age) {
            case 10:ageFinal  = "Ten"; break;
            case 11: ageFinal = "Eleven "; break;
            case 12: ageFinal = "Twenty "; break;
            case 13: ageFinal = "Thirteen"; break;
            case 14: ageFinal = "Fourteen"; break;
            case 15: ageFinal = "Fifteen"; break;
            case 16: ageFinal = "Sixteen"; break;
            case 17: ageFinal = "Seventeen"; break;
            case 18: ageFinal = "Eighteen"; break;
            case 19: ageFinal = "Nineteen"; break;
            default:  {

                String digit1;
                int digit = age % 10;
                switch (digit) {
                    case 0: digit1 = ""; break;
                    case 1: digit1 = "one "; break;
                    case 2: digit1 = "two "; break;
                    case 3: digit1 = "three "; break;
                    case 4: digit1 = "four "; break;
                    case 5: digit1 = "five "; break;
                    case 6: digit1 = "six "; break;
                    case 7: digit1 = "seven "; break;
                    case 8: digit1 = "eight "; break;
                    case 9: digit1 = "nine "; break;
                    default:  System.out.println("Error1 "); return;
                }
                age /= 10;

                String digit2 = "";
                digit = age % 10;
                switch (digit) {
                    case 0: digit2 = "and "; break;
                    case 1: digit1 = "ten "; break;
                    case 2: digit2 = "twenty "; break;
                    case 3: digit2 = "thirty "; break;
                    case 4: digit2 = "fourty "; break;
                    case 5: digit2 = "fifty "; break;
                    case 6: digit2 = "sixty "; break;
                    case 7: digit2 = "seventy "; break;
                    case 8: digit2 = "eighty "; break;
                    case 9: digit2 = "ninety "; break;
                    default:  System.out.println("Error2 "); return;
                }
                age /= 10;

                String digit3 = "";
                if (age>0) {
                    digit = age % 10;
                    switch (digit) {
                        case 1: digit3 = "one hundred "; break;
                        default: System.out.println("Error3"); return;
                    }
                }
                ageFinal = digit3 + digit2 + digit1;
            }
        }

        System.out.println(result + ageFinal);
    }
}
