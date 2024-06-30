package SwiggyAsde.model;

import SwiggyAsde.Player;

public interface MagicalArena {
    public Integer rollDice();
    public void fight(Player player1, Player player2);
}
