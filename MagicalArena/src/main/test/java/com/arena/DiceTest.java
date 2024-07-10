package main.test.java.com.arena;
import main.java.com.arena.Dice;
public class DiceTest {

    public void testRoll() {
        Dice dice = new Dice();
        int roll = dice.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }

    private void assertTrue(boolean c) {
        // TODO
    }
}
