package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {
    public int hitPoints = 100;
    public int damage = 10;
    public boolean hasArmour;

    public Swordsman(boolean hasArmour) {
        this.hasArmour = hasArmour;
    }
}