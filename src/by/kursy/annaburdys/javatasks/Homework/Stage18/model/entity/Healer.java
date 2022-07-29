package by.kursy.annaburdys.javatasks.Homework.Stage18.model.entity;

public class Healer extends Player {
    private String spell;
    private int amountOfHeal;

    public Healer(String name, int level, int health, double money, int diamonds, boolean premium, String spell, int amountOfHeal) {
        super(name, level, health, money, diamonds, premium);
        this.spell = spell;
        this.amountOfHeal = amountOfHeal;
    }

    public Healer(String spell, int amountOfHeal) {
        this.spell = spell;
        this.amountOfHeal = amountOfHeal;
    }

    public String getSpell() {
        return spell;
    }

    public void setSpell(String spell) {
        this.spell = spell;
    }

    public int getAmountOfHeal() {
        return amountOfHeal;
    }

    public void setAmountOfHeal(int amountOfHeal) {
        this.amountOfHeal = amountOfHeal;
    }

    @Override
    public String action() {
        return "Healer " + getName() + " uses " + getSpell() + ", heal = " + getAmountOfHeal();
    }

    @Override
    public String toString() {
        return "Healer " + super.toString() +
                ", spell = " + spell +
                ", amountOfHeal = " + amountOfHeal;
    }
}