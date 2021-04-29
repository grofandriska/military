package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        hitPoints = 50;
        damage = 20;
        isArmored = false;
    }

    @Override
    void sufferDamage(int damage) {
        if (isArmored) {
            hitPoints = hitPoints - (damage / 2);
        } else hitPoints = hitPoints - damage;
    }
}