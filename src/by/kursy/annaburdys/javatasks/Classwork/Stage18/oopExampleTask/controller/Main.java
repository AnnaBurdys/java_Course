package by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.controller;

import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Flower;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Rose;
import by.kursy.annaburdys.javatasks.Classwork.Stage18.oopExampleTask.model.entity.Chamomile;

public class Main {
    public static void main(String[] args) {
        String o = new String();
        Flower flower = new Rose();
        Rose rose = (Rose) flower;
    }
}
