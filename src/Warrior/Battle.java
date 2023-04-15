package Warrior;

public class Battle {
    private Waroirs attacker;
    private Waroirs definder;

    public Battle(Waroirs attacker, Waroirs definder) {
        this.attacker = attacker;
        this.definder = definder;
    }

    public Waroirs run() {
        while (true) {
            int attack = attacker.Harm();
            definder.reduceHP(attack);
            System.out.printf("Warrior %s give harm %d \n" + "Warrior %s %d HP \n", attacker.getName(), attack, definder.getName(), definder.getHp());
            if (!definder.isAlive()) {
                System.out.printf("Warrior %s is dead, %s winner", definder.getName(), attacker.getName());
                return attacker;
            }
            attack = definder.Harm();
            definder.reduceHP(attack);
            System.out.printf("Warrior %s return harm %d \n" + "Warrior %s %d HP \n", definder.getName(), attack, definder.getName(), definder.getHp());
            if (!definder.isAlive()) {
                System.out.printf("Warrior %s is dead, %s winner", attacker.getName(), definder.getName());
                return definder;

            }

        }
    }

}