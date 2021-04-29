package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {
    public int hitPoints = 150;
    public int damage = 20;
    public boolean hasArmour = true;
    public boolean firstDamage = true;

    public HeavyCavalry() {
    }

    @Override
    public int doDamage(){
        damage = 20;
        if (firstDamage) {
            firstDamage = false;
            return 3 * damage;
        }
        return damage;
    }

}