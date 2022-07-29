package by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Team implements Iterable<Player>{
    private Collection<Player> players;

    public Team() {
        players = new ArrayList<>();
    }

    public Team(Collection<Player> players) {
        this.players = players;
    }

    public void add(Player player) {
        players.add(player);
    }

    public void remove(Player player) {
        players.remove(player);
    }

    public void clear() {
        players.clear();
    }

    public int size() {
        return players.size();
    }

    @Override
    public String toString() {
        Iterator<Player> it = players.iterator();
        StringBuilder builder = new StringBuilder();

        while(it.hasNext()) {
            builder.append(it.next()).append("\n");
        }
        return builder.toString();
    }

    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }
}