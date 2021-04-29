package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit{
    private boolean isCharged = true;

    public HeavyCavalry() {
        hitPoints = 150;
        damage = 20;
        isArmored = true;

    }
    @Override
    int doDamage() {
        if (isCharged) {
            isCharged = false;
            return damage * 3;
        }
        else return damage;
    }


    @Override
    void sufferDamage(int damage) {
        if (isArmored) {
            hitPoints = hitPoints - (damage / 2);
        } else hitPoints = hitPoints - damage;
    }
}