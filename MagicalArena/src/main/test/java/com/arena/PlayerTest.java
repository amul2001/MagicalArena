package main.test.java.com.arena;
import main.java.com.arena.Player;
public class PlayerTest {
    public void testReduceHealth() {
        Player player = new Player("Test", 100, 10, 10);
        player.reduceHealth(30);
        assertEquals(70, player.getHealth());
    }

    private void assertEquals(int a, int b) {
        // TODO
    }
    public void testIsAlive() {
        Player player = new Player("Test", 0, 10, 10);
        assertFalse(player.isAlive());
    }

    private void assertFalse(boolean c) {
        // TODO
    }
}

