package hu.nive.ujratervezes.oopcollection.army;
import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> armyList = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        armyList.add(militaryUnit);
    }

    public void damageAll(int damage) {

        for (int i = 0; i < getArmySize(); i++) {
            armyList.get(i).sufferDamage(damage);
            if (armyList.get(i).getHitPoints() < 25) {
                armyList.remove(i);
                i--;
            }
        }
    }

    public int getArmyDamage() {
        int result = 0;
        for (MilitaryUnit unit : armyList) {
            result += unit.doDamage();
        }
        return result;
    }

    public int getArmySize() {
        return armyList.size();
    }
}