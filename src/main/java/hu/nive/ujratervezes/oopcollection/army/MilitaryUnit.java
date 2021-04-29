package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    public int damage;
    public int hitPoints;
    public boolean hasArmour;

    public MilitaryUnit() {

    }

    public MilitaryUnit(int damage, int hitPoints, boolean hasArmour) {
        this.damage = damage;
        this.hitPoints = hitPoints;
        this.hasArmour = hasArmour;
    }

    public MilitaryUnit(boolean hasArmour) {
        this.hasArmour = hasArmour;
    }

    public int doDamage(){ return damage; }
    public void sufferDamage(int damage){
        if (hasArmour) {
            hitPoints -= damage/2;
        } else {
            hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
