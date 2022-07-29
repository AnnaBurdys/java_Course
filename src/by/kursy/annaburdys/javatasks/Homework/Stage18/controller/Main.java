package by.kursy.annaburdys.javatasks.Homework.Stage18.controller;

import by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity.*;

public class Main {
    public static void main(String[] args) {
        Team team = new Team();
        Warrior ann = new Warrior("ann", 1, 100, 200, 12, true, "sword", 20);
        team.add(ann);
        Healer ann1 = new Healer("ann2", 1, 100, 200, 12, true, "Heal All", 10);
        team.add(ann1);
        Wizard ann3 = new Wizard("ann3", 1, 100, 200, 12, true, "Kill All", 100);
        team.add(ann3);

        System.out.println(team);

        team.remove(ann1);
        System.out.println(team);

        System.out.println(ann3.action());

    }


}
