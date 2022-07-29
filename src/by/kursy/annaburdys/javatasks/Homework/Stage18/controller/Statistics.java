package by.kursy.annaburdys.javatasks.Homework.Stage18.controller;

import by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity.Player;
import by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity.Team1;

public class Statistics {
    public static double calculateTotalMoney(Team1 team1) {
        if (team1 == null || team1.size() == 0) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < team1.size(); i++) {
            total += team1.get(i).getMoney();
        }
        return total;
    }

    public static int calculateTotalDiamonds(Team1 team1) {
        if (team1 == null || team1.size() == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < team1.size(); i++) {
            total += team1.get(i).getDiamonds();
        }
        return total;
    }

    private static int getMaxDiamonds(Team1 team1) {
        int maxDiamonds = team1.get(0).getDiamonds();
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getDiamonds() > maxDiamonds) {
                maxDiamonds = team1.get(i).getDiamonds();
            }
        }
        return maxDiamonds;
    }

    private static int countPlayersWithMaxDiamonds(Team1 team1, int maxDiamonds) {
        int counter = 0;
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getDiamonds() == maxDiamonds) {
                counter++;
            }
        }
        return counter;
    }

    public static Player[] findMaxDiamondsPlayers(Team1 team1) {
        int maxDiamonds = getMaxDiamonds(team1);
        int count = countPlayersWithMaxDiamonds(team1, maxDiamonds);

        Player[] playersResult = new Player[count];

        for (int i = 0, j = 0; i < team1.size(); i++) {
            if (team1.get(i).getDiamonds() == maxDiamonds) {
                playersResult[j] = team1.get(i);
                j++;
            }
        }
        return playersResult;
    }

    private static int getMinDiamonds(Team1 team1) {
        int minDiamonds = team1.get(0).getDiamonds();
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getDiamonds() < minDiamonds) {
                minDiamonds = team1.get(i).getDiamonds();
            }
        }
        return minDiamonds;
    }

    private static int countPlayersWithMinDiamonds(Team1 team1, int minDiamonds) {
        int counter = 0;
        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).getDiamonds() == minDiamonds) {
                counter++;
            }
        }
        return counter;
    }

    public static Player[] findMinDiamondsPlayers(Team1 team1) {
        int minDiamonds = getMinDiamonds(team1);
        int count = countPlayersWithMinDiamonds(team1, minDiamonds);

        Player[] playersResult = new Player[count];

        for (int i = 0, j = 0; i < team1.size(); i++) {
            if (team1.get(i).getDiamonds() == minDiamonds) {
                playersResult[j] = team1.get(i);
                j++;
            }
        }
        return playersResult;
    }



}
