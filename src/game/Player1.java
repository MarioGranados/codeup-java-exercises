package game;

import java.util.Random;

public class Player1 extends Knight{
    public Player1(String name, double hitPoints, double swordAttack) {
        super(name, hitPoints, swordAttack);
    }
    protected void shieldGuardDefense(double damage) {
        Random x = new Random();
        random = x.nextInt(10) + 1;
        if (random < 5) {
            System.out.println("Dodged");
        } else {
            System.out.println("you got hit");
            super.hitPoints -= damage;
        }
    }
    public void uponDeath() {
        System.out.println("You died");
    }
}
