package Warrior;

public class Archer extends Waroirs<Throwing>{
    public Archer(String name, int hp, Throwing weapon) {
        super(name, hp, weapon);
    }
    public int getRange() {
        return random.nextInt(weapon.getDistance() + 1);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString()+
                '}';
    }
}
