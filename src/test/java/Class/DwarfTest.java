package Class;

import Class.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf player1;

    @Before
    public void before(){
        player1 =  new Dwarf( "Dolph", 50, 10);
    }

    @Test
    public void canGetName(){
        assertEquals( "Dolph", player1.getName());
    }

    @Test
    public void canGetHP(){
        assertEquals( 50, player1.getHp());
    }

    @Test
    public void canGetWallet(){
        assertEquals( 10, player1.getWallet());
    }

    @Test
    public void canGetEquipmentCount(){
        assertEquals( 0, player1.getEquipmentCount());
    }

    @Test
    public void canGetToolCount(){
        assertEquals( 0, player1.getToolCount());
    }
}
