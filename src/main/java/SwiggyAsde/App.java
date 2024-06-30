package SwiggyAsde;

import SwiggyAsde.model.Player;
import SwiggyAsde.services.MagicalArena;
import SwiggyAsde.services.MagicalArenaImpl;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter details for Player A:");
        System.out.print("Health: ");
        Integer healthA = scanner.nextInt();
        System.out.print("Strength: ");
        Integer strengthA = scanner.nextInt();
        System.out.print("Attack: ");
        Integer attackA = scanner.nextInt();

        System.out.println("Enter details for Player B:");
        System.out.print("Health: ");
        Integer healthB = scanner.nextInt();
        System.out.print("Strength: ");
        Integer strengthB = scanner.nextInt();
        System.out.print("Attack: ");
        Integer attackB = scanner.nextInt();

        Player playerA = new Player(healthA, strengthA, attackA);
        Player playerB = new Player(healthB, strengthB, attackB);

        MagicalArena magicalArena = new MagicalArenaImpl();

        while (playerA.getHealth() > 0 && playerB.getHealth() > 0) {
            if (playerA.getHealth() < playerB.getHealth()) {
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
            } else {
                magicalArena.fight(playerB, playerA);
                if (playerA.getHealth() <= 0) {
                    System.out.println("Player B wins!");
                    break;
                }
                magicalArena.fight(playerA, playerB);
                if (playerB.getHealth() <= 0) {
                    System.out.println("Player A wins!");
                    break;
                }
            }
            scanner.close();
        }
    }
}
