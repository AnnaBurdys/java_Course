package by.kursy.annaburdys.javatasks.Classwork.Stage06;
// A->Well done
// B->Very well
// C-> Good
// D-> So-so
// E-> Very bad
// F-> Fail
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your mark: ");
        String str = scanner.next();
        char mark = str.charAt(0);

        mark = Character.toUpperCase(mark);
        String result;

        switch (mark) {
            case 'A': result = "Well done"; break;
            case 'B': result = "Very well"; break;
            case 'C': result = "Good"; break;
            case 'D': result = "So-so"; break;
            case 'E': result = "Very bad"; break;
            case 'F': result = "Fail"; break;
            default:  result = "Mark Error";
        }
        System.out.println(result);
    }
}
