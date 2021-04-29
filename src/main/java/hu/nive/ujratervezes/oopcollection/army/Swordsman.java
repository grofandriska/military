package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    public boolean handShield;

    public Swordsman(boolean shield) {
        this.damage = 10;
        this.hitPoints = 100;
        this.shield = shield;
        this.handShield = true;
    }

    @Override
    public int doDamage() {
        return this.damage;
    }

    @Override
    public int sufferDamage(int damage) {
        if (handShield){
            handShield = false;
          return hitPoints = hitPoints -0;
        }
        if (shield){
           return this.hitPoints = hitPoints - (damage / 2);
        }
       return this.hitPoints = hitPoints - damage;


    }
}