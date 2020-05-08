package Class;

import Class.Barbarian;
import Equipment.Equipment;
import Equipment.Tool;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Equipment sword;
    Barbarian player1;
    Tool healingPotion;

    @Before
    public void before(){
        player1 =  new Barbarian( "Grom", 70, 5);
        sword = new Equipment( "Sword", 20);
        healingPotion = new Tool( 30, "Healing");
    }

    @Test
    public void canGetName(){
        assertEquals( "Grom", player1.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals( 70, player1.getHp());
    }

    @Test
    public void canGetWallet(){
        assertEquals( 5, player1.getWallet());
    }

    @Test
    public void canGetEquipmentCount(){
        assertEquals( 0, player1.getEquipmentCount());
    }

    @Test
    public void canGetToolCount(){
        assertEquals( 0, player1.getToolCount());
    }

    @Test
    public void canAddEquipment(){
        player1.addEquipment(sword);
        assertEquals( 1, player1.getEquipmentCount());
    }

    @Test
    public void canAddTool(){
        player1.addTool(healingPotion);
        assertEquals( 1, player1.getToolCount());
    }

    @Test
    public void canAttack(){
        player1.addEquipment(sword);
        assertEquals( 20, player1.attack());
    }


}
