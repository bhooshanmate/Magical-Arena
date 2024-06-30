package SwiggyAsde;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import SwiggyAsde.model.Player;
import SwiggyAsde.services.MagicalArena;
import SwiggyAsde.services.MagicalArenaImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private Player playerA;
    private Player playerB;
    private MagicalArena magicalArena;


    @Before
    public void setUp() {
        playerA = new Player(50, 5, 10);
        playerB = new Player(100, 10, 5);
        magicalArena = new MagicalArenaImpl();
    }

    @Test
    public void testFight() {
        int initialHealth = playerB.getHealth();
        magicalArena.fight(playerA,playerB);
        assertTrue(playerB.getHealth() < initialHealth);
    }

    @Test
    public void testPlayerAttributes() {
        assertEquals(new Integer(50),playerA.getHealth());
        assertEquals(new Integer(5),playerA.getStrength());
        assertEquals(new Integer(10),playerA.getAttack());
    }

    @Test
    public void testFightUntilDeath() {
        // lower health for quick test
        Player playerA = new Player(10, 1, 10); // Lower health for quick test
        Player playerB = new Player(10, 1, 10);

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            magicalArena.fight(playerA, playerB);
            if (playerB.getHealth() <= 0) {
                System.out.println("Player A wins!");
                break;
            }
            magicalArena.fight(playerB, playerA);
            if (playerA.getHealth() <= 0) {
                System.out.println("Player B wins!");
                break;
            }
        }
        // At least one player should be dead
        assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
    }
}
