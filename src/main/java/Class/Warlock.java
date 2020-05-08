package Class;

public class Warlock extends Player {

    private Creature creature;

    public Warlock(String name, int hp, int wallet, Creature creature) {
        super(name, hp, wallet);
        this.creature = creature;
    }

    public Creature getCreature() {
        return creature;
    }
}
