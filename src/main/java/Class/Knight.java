package Class;

public class Knight extends Player {

    private int armour;

    public Knight(String name, int hp, int wallet, int armour) {
        super(name, hp, wallet);
        this.armour = armour;
    }

    public int getArmour() {
        return armour;
    }
}
