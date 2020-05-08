package Class;

public class Creature {

    private int hp;
    private String type;
    private int damage;

    public Creature(int hp, String type, int damage) {
        this.hp = hp;
        this.type = type;
        this.damage = damage;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }
}
