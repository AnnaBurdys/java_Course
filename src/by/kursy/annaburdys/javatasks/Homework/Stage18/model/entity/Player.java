package by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity;

public class Player {
private String name;
private int level;
private double money;
private int diamonds;
private boolean premium;

    public Player(String name, int level, double money, int diamonds, boolean premium) {
        this.name = name;
        this.level = level;
        this.money = money;
        this.diamonds = diamonds;
        this.premium = premium;
    }

    public Player() {
        name = "no name";
        level = 0;
        money = 0;
        diamonds = 0;
        premium = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public int getDiamonds() {
        return diamonds;
    }

    public void setDiamonds(int diamonds) {
        this.diamonds = diamonds;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return name + ": " +
                ", level = '" + level +
                ", money = " + money +
                ", diamonds = " + diamonds +
                ", premium = " + premium;
    }

}
