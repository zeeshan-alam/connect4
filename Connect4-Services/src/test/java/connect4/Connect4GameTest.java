package connect4;


import org.junit.*;

import com.connect4.Connect4Game;
import com.connect4.Connect4GameImpl;
import com.connect4.Connect4Player;
import com.connect4.Player;

public class Connect4GameTest {

    @Test
    public void testDropDisk() {
    	int player = 1;
    	Connect4Game connect4Game = new Connect4GameImpl();
     	Assert.assertTrue("drop operation is not successful", connect4Game.dropDisk(player, 1));
    }
    
    @Test
    public void testDropDiskBoundry() {
    	int player = 1;
    	Connect4Game connect4Game = new Connect4GameImpl();
     	Assert.assertFalse("Boundry condition violated", connect4Game.dropDisk( player, 9));
    }    

    @Test
    public void testConnect4HorizontalStart() {
    	int player = 1;
    	Connect4Game connect4Game = new Connect4GameImpl();
    	connect4Game.dropDisk( player, 1);
    	connect4Game.dropDisk( player, 2);
    	connect4Game.dropDisk( player, 3);
    	connect4Game.dropDisk( player, 4);
    	Assert.assertTrue("Horizontal connect failed", connect4Game.is4DiscConnected(player));
    }

    
    @Test
    public void testConnect4Vertical() {
    	int player = 1;
    	Connect4Game connect4Game = new Connect4GameImpl();
    	connect4Game.dropDisk( player, 1);
    	connect4Game.dropDisk( player, 1);
    	connect4Game.dropDisk( player, 1);
    	connect4Game.dropDisk( player, 1);
    	Assert.assertTrue("Vertical connect failed", connect4Game.is4DiscConnected(player));
    }

    //TODO implement Diagonal Tests
//    @Test
//    public void testConnect4AscendingDiagonalCheck() {
//    	int player = 2;
//    	Connect4Game connect4Game = new Connect4GameImpl();
//    	connect4Game.dropDisk( player, 5);
//    	connect4Game.dropDisk( player, 5);
//    	connect4Game.dropDisk( player, 5);
//    	connect4Game.dropDisk( player, 5);
//    	Assert.assertTrue("Vertical connect failed", connect4Game.is4DiscConnected(player));
//    }
//    @Test
//    public void testConnect4DescendingDiagonalCheck() {
//    	int player = 2;
//    	Connect4Game connect4Game = new Connect4GameImpl();
//    	connect4Game.dropDisk( player, 5);
//    	connect4Game.dropDisk( player, 5);
//    	connect4Game.dropDisk( player, 5);
//    	connect4Game.dropDisk( player, 5);
//    	Assert.assertTrue("Vertical connect failed", connect4Game.is4DiscConnected(player));
//    }
    
}