package by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity;

import java.util.ArrayList;

public class Team1 {
private ArrayList<Player> players;

    public Team1(Player[] players) {
        if (players != null) {
            this.players = new ArrayList<>();
            for (Player player : players) {
                this.players.add(player);
            }
        } else {
            players = new Player[0];
        }
    }

    public Team1() {
        players = new ArrayList<>();
    }

    public void add(Player player) {
        ArrayList<Player> temp = new ArrayList<>();

        for (Player p : players
        ) {
            temp.add(p);
        }
        temp.add(player);
        players = temp;
    }

    public void remove(Player player) {
        ArrayList<Player> temp = new ArrayList<>();
        boolean flag = false;

        for (Player value : players) {
            if (flag || (!value.getName().equals(player.getName()) || value.getLevel() != player.getLevel() ||
                    value.getMoney() != player.getMoney() || value.getDiamonds() != player.getDiamonds() ||
                    value.isPremium() == player.isPremium())) {
                temp.add(value);
            } else {
                flag = true;
            }
        }
        players = temp;
    }

    public void remove(int index) {
        ArrayList<Player> temp = new ArrayList<>();

        for (int i = 0; i < players.size(); i++) {
            if (index != i) {
                temp.add(players.get(i));
            }
        }
        players = temp;
    }

    public int size() {
        return players.size();
    }

    /*public String toString() {

    }*/

    public Player get(int index) {
        if (index >= 0 && index < players.size()) {
            return players.get(index);
        } else {
            return null;
        }
    }

}
