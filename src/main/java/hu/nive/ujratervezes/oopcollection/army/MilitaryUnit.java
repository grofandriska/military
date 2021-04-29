package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    protected int hitPoints;
    protected int damage;
    protected boolean isArmored;

    public int getHitPoints() {
        return hitPoints;
    }

    int doDamage() {
        return damage;
    }

    abstract void sufferDamage(int damage);

}