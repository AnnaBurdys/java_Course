package by.kursy.annaburdys.javatasks.Classwork.Stage15.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage15.model.entity.Student;
// Object Initialization
// 1) JVM (default value)
// 2) manual
// 3) fields definition
// 4) init blocks

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Alex", 20, 10, 'm', true);

        System.out.println(st1.hashCode());
        st1.testing();
        System.out.println(st2.hashCode());
        st2.testing();
    }

}