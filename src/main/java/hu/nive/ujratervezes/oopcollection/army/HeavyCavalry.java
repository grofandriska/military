package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    public boolean isCharged = false;

    public HeavyCavalry() {
        this.damage = 20;
        this.hitPoints = 150;
        this.shield = true;
    }

    @Override
    public int doDamage() {
        if (this.isCharged = false) {
            return this.damage * 3;
        }
        return this.damage;
    }

    @Override
    public int sufferDamage(int damage) {
        return this.hitPoints -= (damage / 2);
    }

}