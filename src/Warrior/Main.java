package Warrior;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<King> kings = new Team<>();
        archers.addPersons(new Archer("RobinGud", 100, new Bow(20)))
                .addPersons(new Archer("Robin", 100, new Bow(15)));
        kings.addPersons(new King("Ivan", 100, new Knife()))
                .addPersons(new King("Perec", 100, new Knife()));

        Archer archer1 = new Archer("RobinGud", 100, new Bow(20));
        Archer archer2 = new Archer("Robin", 100, new Bow(20));
        Battle fight = new Battle(archer1, archer2);
        fight.run();

    }
}
