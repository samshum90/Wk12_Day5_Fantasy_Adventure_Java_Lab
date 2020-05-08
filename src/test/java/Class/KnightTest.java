package Class;

import Class.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

        Knight player1;

        @Before
        public void before(){
            player1 =  new Knight( "Sir Anton De Fluer", 60, 15, 10);
        }

        @Test
        public void canGetName(){
            assertEquals( "Sir Anton De Fluer", player1.getName());
        }

        @Test
        public void canGetHP(){
            assertEquals( 60, player1.getHp());
        }

        @Test
        public void canGetWallet(){
            assertEquals( 15, player1.getWallet());
        }

        @Test
        public void canGetArmour(){
            assertEquals( 10, player1.getArmour());
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
