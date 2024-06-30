package SwiggyAsde.services;

import SwiggyAsde.model.Player;

import java.util.Random;

public class MagicalArenaImpl implements MagicalArena {
    static Random randomNumber = new Random();

    public MagicalArenaImpl() {
    }

    public static Integer rollDice() {
//        1 to 6 sided dice
        return randomNumber.nextInt(6) + 1;
    }

    @Override
    public  void fight(Player attacker, Player defender) {
        // rolling for both the players
        Integer attackRoll = rollDice();
        Integer defenseRoll = rollDice();

        // calculating attack damage & defense strength
        Integer attackDamage = attacker.getAttack() * attackRoll;
        Integer defenseStrength = defender.getStrength() * defenseRoll;

        // calculating damage taken by the player
        // & the remaining health of that player
        Integer damageTaken = Math.max(0,attackDamage - defenseStrength);
        Integer remainingHealth = defender.getHealth() - damageTaken;

        // setting up the health
        defender.setHealth(remainingHealth);

        System.out.println("Attack rolls : " + attackRoll + ", Defender roll : " + defenseRoll);
        System.out.println("Attack damage : " + attackDamage + ", Defense strength : " + defenseStrength);
        System.out.println("Defender health reduced by : " + damageTaken + " to" + defender.getHealth());
    }
}
