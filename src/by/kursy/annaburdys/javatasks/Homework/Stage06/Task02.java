package by.kursy.annaburdys.javatasks.Homework.Stage06;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day: ");
        int day = scanner.nextInt();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        String result ="Incorrect data";
        if (day < 0 || day > 31 || month > 12 || month < 1) {
            System.out.println(result);
            return;
        } else {
            if ((day >=20 && month ==1) || (day<=18 && month ==2)  ) {
            result = "Aquarius";
            }
            if ((day >=19 && month ==2) || (day<=20 && month ==3)  ) {
                result = "Pisces";
            }
            if ((day >=21 && month ==3) || (day<=19 && month ==4)  ) {
                result = "Aries";
            }
            if ((day >=20 && month ==4) || (day<=20 && month ==5)  ) {
                result = "Taurus";
            }
            if ((day >=21 && month ==5) || (day<=21 && month ==6)  ) {
                result = "Gemini";
            }
            if ((day >=22 && month ==6) || (day<=22 && month ==7)  ) {
                result = "Cancer";
            }
            if ((day >=23 && month ==7) || (day<=22 && month ==8)  ) {
                result = "Leo";
            }
            if ((day >=23 && month ==8) || (day<=22 && month ==9)  ) {
                result = "Virgo";
            }
            if ((day >=23 && month ==9) || (day<=22 && month ==10)  ) {
                result = "Libra";
            }
            if ((day >=23 && month ==10) || (day<=22 && month ==11)  ) {
                result = "Scorpio";
            }
            if ((day >=23 && month ==11) || (day<=21 && month ==12)  ) {
                result = "Saggitaruis";
            }
            if ((day >=22 && month ==12) || (day<=19 && month ==1)  ) {
                result = "Capricorn";
            }
        }
        System.out.println(result);

    }
}
