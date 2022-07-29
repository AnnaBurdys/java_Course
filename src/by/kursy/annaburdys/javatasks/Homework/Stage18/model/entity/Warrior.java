package by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity;

public class Warrior extends Player {
    private String weapon;
    private int damage;

    public Warrior(String name, int level, int health, double money, int diamonds, boolean premium, String weapon, int damage) {
        super(name, level, health, money, diamonds, premium);
        this.weapon = weapon;
        this.damage = damage;
    }

    public Warrior(String weapon, int damage) {
        this.weapon = weapon;
        this.damage = damage;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String action() {
        return "Warrior " + getName() + " attacks with " + getWeapon() + ", damage = " + getDamage();
    }

    @Override
    public String toString() {
        return "Warrior " + super.toString() +
                ", weapon = " + weapon +
                ", damage = " + damage;
    }
}
