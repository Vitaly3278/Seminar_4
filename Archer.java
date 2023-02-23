package Seminar_4;

import Seminar_4.Shield.BigShield;
import Seminar_4.Weapons.Bow;

public class Archer extends Warrior {

    public Archer(String name, int healthPoint, Bow bow, BigShield bigShield) {
        super(name, healthPoint, bow, bigShield);
    }

    @Override
    public String toString() {
        return "Archer " + super.toString();
    }

    public int shotRange(){
        return ((Bow) getWeapon()).getRange();
    }

}