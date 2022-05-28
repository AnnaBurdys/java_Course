package by.kursy.annaburdys.javatasks.Homework.Stage18.controller;

import by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity.Player;
import by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity.Team;

public class Statistics {
    public static double calculateTotalMoney(Team team) {
        if (team == null || team.size() == 0) {
            return 0;
        }
        double total = 0;
        for (int i = 0; i < team.size(); i++) {
            total += team.get(i).getMoney();
        }
        return total;
    }

    public static int calculateTotalDiamonds(Team team) {
        if (team == null || team.size() == 0) {
            return 0;
        }

        int total = 0;
        for (int i = 0; i < team.size(); i++) {
            total += team.get(i).getDiamonds();
        }
        return total;
    }

    private static int getMaxDiamonds(Team team) {
        int maxDiamonds = team.get(0).getDiamonds();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getDiamonds() > maxDiamonds) {
                maxDiamonds = team.get(i).getDiamonds();
            }
        }
        return maxDiamonds;
    }

    private static int countPlayersWithMaxDiamonds(Team team, int maxDiamonds) {
        int counter = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getDiamonds() == maxDiamonds) {
                counter++;
            }
        }
        return counter;
    }

    public static Player[] findMaxDiamondsPlayers(Team team) {
        int maxDiamonds = getMaxDiamonds(team);
        int count = countPlayersWithMaxDiamonds(team, maxDiamonds);

        Player[] playersResult = new Player[count];

        for (int i = 0, j = 0; i < team.size(); i++) {
            if (team.get(i).getDiamonds() == maxDiamonds) {
                playersResult[j] = team.get(i);
                j++;
            }
        }
        return playersResult;
    }

    private static int getMinDiamonds(Team team) {
        int minDiamonds = team.get(0).getDiamonds();
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getDiamonds() < minDiamonds) {
                minDiamonds = team.get(i).getDiamonds();
            }
        }
        return minDiamonds;
    }

    private static int countPlayersWithMinDiamonds(Team team, int minDiamonds) {
        int counter = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getDiamonds() == minDiamonds) {
                counter++;
            }
        }
        return counter;
    }

    public static Player[] findMinDiamondsPlayers(Team team) {
        int minDiamonds = getMinDiamonds(team);
        int count = countPlayersWithMinDiamonds(team, minDiamonds);

        Player[] playersResult = new Player[count];

        for (int i = 0, j = 0; i < team.size(); i++) {
            if (team.get(i).getDiamonds() == minDiamonds) {
                playersResult[j] = team.get(i);
                j++;
            }
        }
        return playersResult;
    }



}
