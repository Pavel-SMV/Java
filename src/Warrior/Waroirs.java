package Warrior;

import java.util.Random;

public class Waroirs<T extends Weapon> extends Person {
    protected T weapon;
    protected static Random random = new Random();

    public Waroirs(String name, int hp, Weapon weapon) {
        super(name, hp);
        this.weapon = (T) weapon;
    }
    public  int Harm(){
        boolean isHit = random.nextBoolean();
        int damage = 0;
        if(isHit){
            damage = random.nextInt(weapon.damage()+1);}
        return damage;
    }

    @Override
    public String toString() {
        return "Waroirs{" + " name = " + getName()+
                "  hp = " + getHp() +
                " weapon = " + weapon +
                '}';
    }
}
