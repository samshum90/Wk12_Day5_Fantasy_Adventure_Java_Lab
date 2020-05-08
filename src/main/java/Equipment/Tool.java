package Equipment;

public class Tool {

    private int hpRestored;
    private String name;

    public Tool(int hpRestored, String name) {
        this.hpRestored = hpRestored;
        this.name = name;
    }

    public int getHpRestored() {
        return hpRestored;
    }

    public String getName() {
        return name;
    }
}
