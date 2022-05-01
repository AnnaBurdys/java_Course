package by.kursy.annaburdys.javatasks.Classwork.Stage15.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage15.model.entity.Student;
//Object Initialization
// 1) JVM (default value)
// 2) manual

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alex", 20, 10, 'm', true);
        System.out.println(student.getInfo());
    }
}