package hu.nive.ujratervezes.oopcollection.army;

import java.util.List;

public class Army {
    private List<MilitaryUnit> army;

    public Army(Army units) {
        this.army = army;
    }

    public void addUnit(MilitaryUnit militaryUnit){
        this.army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (MilitaryUnit unit : army) {
            unit.doDamage();
        }


    }

    public int getArmyDamage() {
        return 0;

    }
    public int getArmySize() {
        return this.army.size();

    }
}