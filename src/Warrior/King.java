package Warrior;

public class King extends Waroirs<Knife>{
    public King(String name, int hp, Weapon weapon) {
        super(name, hp, weapon);
    }

    @Override
    public String toString() {
        return "King{" +
                super.toString()+
                '}';
    }
}
