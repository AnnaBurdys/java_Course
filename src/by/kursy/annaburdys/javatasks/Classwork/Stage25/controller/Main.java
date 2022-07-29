package by.kursy.annaburdys.javatasks.Classwork.Stage25.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage25.model.Box;
import by.kursy.annaburdys.javatasks.Classwork.Stage25.model.Gbox;
import by.kursy.annaburdys.javatasks.Classwork.Stage25.model.Student;
import by.kursy.annaburdys.javatasks.Classwork.Stage25.model.SuperMath;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int s = sum(5,6);

        Box box1 = new Box();
        box1.setValue(3);
        int n = (int) box1.getValue();
        System.out.println(n);

        box1.setValue(new Student("Alex", 20, true));
        Student student = (Student) box1.getValue();
        System.out.println(student);

        Object obj = box1.getValue();
        if (obj instanceof Student) {
            Student stud = (Student) obj;
        } else if (obj instanceof String) {
            String str = (String) obj;
        }

        Gbox <Integer> ibox = new Gbox<>();
        ibox.setValue(12);

    Gbox<String> sbox = new Gbox<>();

        SuperMath superMath = new SuperMath();
        System.out.println(superMath.sum(5,6));

    }
}