package by.kursy.annaburdys.javatasks.Classwork.Stage09;
// оператор continue
public class Task03 {
    public static void main(String[] args) {
        int number = 100;
        for (int i =2; i<number; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i+ " ");
        }
    }
}
