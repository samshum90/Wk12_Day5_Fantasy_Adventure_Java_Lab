package Equipment;

public class Equipment {

    private String type;
    private int damage;

    public Equipment(String type, int damage) {
        this.type = type;
        this.damage = damage;
    }

    public String getType() {
        return type;
    }

    public int getDamage() {
        return damage;
    }
}
