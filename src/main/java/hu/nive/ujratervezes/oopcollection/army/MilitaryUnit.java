package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {
    public int hitPoints;
    public int damage;
    public boolean shield;

    public int doDamage() {
        return 0;
    }

    public int sufferDamage(int damage) {
   return hitPoints = this.hitPoints-damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isShield() {
        return shield;
    }
}
