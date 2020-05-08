package Class;

public class Wizard extends Player {

    private Creature creature;

    public Wizard(String name, int hp, int wallet, Creature creature) {
        super(name, hp, wallet);
        this.creature = creature;
    }

    public Creature getCreature() {
        return creature;
    }
}
