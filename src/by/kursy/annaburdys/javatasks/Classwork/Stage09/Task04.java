package by.kursy.annaburdys.javatasks.Classwork.Stage09;
// nextInt(b-a+1) + a
import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.print(random.nextInt(10) + "");
        }

 //       for (int i = 0; i < 10; i++) {
//           String s = String.format("%.1f",random.nextDouble() * 100);
 //           System.out.println(s);
        }
    }
