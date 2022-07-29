package by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity;

public class Wizard extends Player {
    private String spell;
    private int damage;

    public Wizard(String name, int level, int health, double money, int diamonds, boolean premium, String spell, int damage) {
        super(name, level, health, money, diamonds, premium);
        this.spell = spell;
        this.damage = damage;
    }

    public Wizard(String spell, int damage) {
        this.spell = spell;
        this.damage = damage;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String action() {
        return "Wizard " + getName() + " casts " + getSpell() + ", damage = " + getDamage();
    }

    @Override
    public String toString() {
        return "Wizard " + super.toString() +
                ", spell = " + spell +
                ", damage = " + damage;
    }
}
