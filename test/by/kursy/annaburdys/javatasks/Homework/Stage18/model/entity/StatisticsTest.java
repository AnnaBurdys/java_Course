package by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity;

import by.kursy.annaburdys.javatasks.Homework.Stage18.controller.Statistics;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class StatisticsTest {
    @Test
    public void testCalculateTotalMoneyPositive() {
        Player[] players = {
                new Player("Player", 21, 10, 100, true),
                new Player("Player", 18, 3, 100, false),
                new Player("Player", 3, 6, 100, false),
                new Player("Player", 9, 1, 100, true),
        };

        Team team = new Team(players);

        double expected = 20;

        double actual = Statistics.calculateTotalMoney(team);

        assertEquals(expected,actual, 0.01);
    }

    @Test
    public void testCalculateTotalMoneyWithNull() {
        double expected = 0;

        double actual = Statistics.calculateTotalMoney(null);

        assertEquals(expected,actual, 0.0);
    }

    @Test
    public void testCalculateTotalMoneyWithEmptyObject() {
        Player[] players = {};
        Team team = new Team(players);

        double expected = 0;

        double actual = Statistics.calculateTotalMoney(team);

        assertEquals(expected,actual, 0.0);
    }



    @Test
    public void testCalculateTotalDiamondsPositive() {
        Player[] players = {
                new Player("Player", 21, 10, 100, true),
                new Player("Player", 18, 3, 100, false),
                new Player("Player", 3, 6, 100, false),
                new Player("Player", 9, 1, 100, true),
        };

        Team team = new Team(players);

        int expected = 400;

        int actual = Statistics.calculateTotalDiamonds(team);

        assertEquals(expected,actual, 0.0);
    }

    @Test
    public void testCalculateTotalDiamondsWithNull() {
        int expected = 0;

        int actual = Statistics.calculateTotalDiamonds(null);

        assertEquals(expected,actual, 0.0);
    }

    @Test
    public void testCalculateTotalDiamondsWithEmptyObject() {
        Player[] players = {};
        Team team = new Team(players);

        int expected = 0;

        int actual = Statistics.calculateTotalDiamonds(team);

        assertEquals(expected,actual, 0.0);
    }

    @Test
    public void testFindMaxDiamondsPlayersFirst() {
        Player[] players = {
                new Player("Player", 21, 10, 100, true),
                new Player("Player", 18, 3, 500, false),
                new Player("Player", 3, 6, 100, false),
                new Player("Player", 9, 1, 100, true),
        };

        Team team = new Team(players);

        Player[] expected = {new Player("Player", 18, 3, 500, false)};
        Player[] actual = Statistics.findMaxDiamondsPlayers(team);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLevel() != actual[i].getLevel() || expected[i].getMoney() != actual[i].getMoney() ||
                    expected[i].getDiamonds() != actual[i].getDiamonds()  ||
                    !expected[i].getName().equals(actual[i].getName())) {
                fail();
            }
        }
        //  assertArrayEquals(expected,actual);
    }

    @Test
    public void testFindMaxLengthFlowersSecond() {
        Player[] players = {
                new Player("Player", 21, 10, 100, true),
                new Player("Player", 18, 3, 500, false),
                new Player("Player", 3, 6, 500, false),
                new Player("Player", 9, 1, 100, true),
        };

        Team team = new Team(players);

        Player[] expected = {new Player("Player", 18, 3, 500, false)};
        Player[] actual = Statistics.findMaxDiamondsPlayers(team);

        for (int i = 0; i < expected.length; i++) {
            if (expected[i].getLevel() != actual[i].getLevel() || expected[i].getMoney() != actual[i].getMoney() ||
                    expected[i].getDiamonds() != actual[i].getDiamonds()  ||
                    !expected[i].getName().equals(actual[i].getName())) {
                fail();
            }
        }
        //  assertArrayEquals(expected,actual);
    }
}
