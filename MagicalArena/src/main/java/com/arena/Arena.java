package main.java.com.arena;
public class Arena {
    private Player playerA;
    private Player playerB;
    private Dice dice;

    public Arena(Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.dice = new Dice();
    }

    public void startBattle() {
        Player attacker = (playerA.getHealth() < playerB.getHealth()) ? playerA : playerB;
        Player defender = (attacker == playerA) ? playerB : playerA;

        while (attacker.isAlive() && defender.isAlive()) {
            int attackRoll = dice.roll();
            int defendRoll = dice.roll();

            int damage = (attacker.getAttack() * attackRoll) - (defender.getStrength() * defendRoll);
            if (damage > 0) {
                defender.reduceHealth(damage);
            }

            System.out.println(attacker.getName() + " attacks " + defender.getName() + " for " + damage + " damage. " +
                    defender.getName() + " health is now " + defender.getHealth());

            // Swap roles
            Player temp = attacker;
            attacker = defender;
            defender = temp;
        }

        System.out.println((playerA.isAlive() ? playerA.getName() : playerB.getName()) + " wins the battle!");
    }
}

    

