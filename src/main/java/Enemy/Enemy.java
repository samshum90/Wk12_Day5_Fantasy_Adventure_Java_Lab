package Enemy;

public class Enemy {

    private int hp;
    private String type;
    private String weapon;

    public Enemy(int hp, String type, String weapon) {
        this.hp = hp;
        this.type = type;
        this.weapon = weapon;
    }

    public int getHp() {
        return hp;
    }

    public String getType() {
        return type;
    }

    public String getWeapon() {
        return weapon;
    }

    public void takeDamage(int i) {
        this.hp - i;
    }
}
