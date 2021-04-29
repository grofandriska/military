package hu.nive.ujratervezes.oopcollection.army;

public class Archer extends MilitaryUnit {

    public Archer() {
        this.hitPoints = 50;
        this.damage = 20;
    }

    @Override
    public int doDamage() {
        return this.damage;
    }

    @Override
    public int sufferDamage(int damage) {
        return this.hitPoints = hitPoints-damage;
    }
}