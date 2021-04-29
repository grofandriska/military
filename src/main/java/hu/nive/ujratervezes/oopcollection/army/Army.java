package hu.nive.ujratervezes.oopcollection.army;

//A hadseregnek az alábbi metódusai vannak:
//
//addUnit(MilitaryUnit militaryUnit), amivel egy katonai egységet tudunk hozzáadni a sereghez,
//
//damageAll(int damage), ami a sereg minden egységének életerejéből levonja a paraméterül kapott értéket,
//valamint eltávolítja a seregből azokat az egységeket, melyeknek így 25 pont alá csökkent az életerejük
//(azaz harcképtelenek vagy halottak),
//
//getArmyDamage(), ami visszaadja, hogy az aktuális támadással mennyi sebzést okoz a sereg összesen,
//
//getArmySize(), ami visszaadja, hogy hány egységből áll a sereg.

import java.util.ArrayList;
import java.util.List;

public class Army {
    public List<MilitaryUnit> units = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        units.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (int i = 0; i < units.size(); i++) {
            units.get(i).sufferDamage(damage);
            if (units.get(i).hitPoints <1) {
                units.remove(i);
            }
        }
    }

    public int getArmyDamage() {
        int result = 0;
        for (int i = 0; i < units.size(); i++) {
            result = result + units.get(i).getDamage();
        }
        return result;
    }

    public int getArmySize() {
        return units.size();
    }
}