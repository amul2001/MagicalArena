package main.test.java.com.arena;
import main.java.com.arena.Arena;
import main.java.com.arena.Player;
public class ArenaTest {

    public void testBattleOutcome() {
        Player playerA = new Player("Player A", 50, 5, 10);
        Player playerB = new Player("Player B", 100, 10, 5);
        Arena arena = new Arena(playerA, playerB);

        arena.startBattle();

        assertTrue(playerA.isAlive() || playerB.isAlive());
    }

    private void assertTrue(boolean c) {
        // TODO
    }
}
