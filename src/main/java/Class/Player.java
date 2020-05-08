package Class;

import java.util.ArrayList;

import Equipment.Equipment;
import Equipment.Tool;

public abstract class Player {

    private String name;
   private int hp;
   private int wallet;
   ArrayList<Equipment> equipment;
   ArrayList<Tool>tools;

    public Player(String name, int hp, int wallet ) {
        this.name = name;
        this.hp = hp;
        this.wallet = wallet;
        this.equipment = new ArrayList<Equipment>();
        this.tools = new ArrayList<Tool>();
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getWallet() {
        return wallet;
    }

    public int getEquipmentCount() {
        return equipment.size();
    }

    public int getToolCount() {
        return tools.size();
    }

    public void addEquipment(Equipment equipment){
        this.equipment.add(equipment);
    }

    public void addTool(Tool tool){
        this.tools.add(tool);
    }

    public int attack(){
        return this.equipment.get(0).getDamage();
    }
}
