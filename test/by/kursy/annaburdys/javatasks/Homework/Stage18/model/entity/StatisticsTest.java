package by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity;

import by.kursy.annaburdys.javatasks.Homework.Stage18.controller.Statistics;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StatisticsTest {
    @Test
    public void testCalculateTotalMoneyPositive() {
        Player[] players = {
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
        };

        Team1 team1 = new Team1(players);

        double expected = 40;

        double actual = Statistics.calculateTotalMoney(team1);

        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testCalculateTotalMoneyWithNull() {
        double expected = 0;

        double actual = Statistics.calculateTotalMoney(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalMoneyWithEmptyObject() {
        Player[] players = {};
        Team1 team1 = new Team1(players);

        double expected = 0;

        double actual = Statistics.calculateTotalMoney(team1);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalDiamondsPositive() {
        Player[] players = {
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
        };

        Team1 team1 = new Team1(players);

        int expected = 400;

        int actual = Statistics.calculateTotalDiamonds(team1);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalDiamondsWithNull() {
        int expected = 0;

        int actual = Statistics.calculateTotalDiamonds(null);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testCalculateTotalDiamondsWithEmptyObject() {
        Player[] players = {};
        Team1 team1 = new Team1(players);

        int expected = 0;

        int actual = Statistics.calculateTotalDiamonds(team1);

        assertEquals(expected, actual, 0.0);
    }

    @Test
    public void testFindMaxDiamondsPlayersFirst() {
        Player[] players = {
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
                new Warrior("Player", 18, 90, 3, 500, false, "sword", 10),
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
                new Warrior("Player", 21, 100, 10, 100, true, "sword", 10),
        };

        Team1 team1 = new Team1(players);

        Player[] expected = {new Warrior("Player", 18, 90, 3, 500, false, "sword", 10)};
        Player[] actual = Statistics.findMaxDiamondsPlayers(team1);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLevel() != actual[i].getLevel() || expected[i].getMoney() != actual[i].getMoney() ||
                    expected[i].getDiamonds() != actual[i].getDiamonds() ||
                    !expected[i].getName().equals(actual[i].getName())) {
                fail();
            }
        }
        //  assertArrayEquals(expected,actual);
    }

}