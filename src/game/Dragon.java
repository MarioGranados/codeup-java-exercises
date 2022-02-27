package game;

import java.util.Random;

public class Dragon extends Wizard{
    public Dragon(String name, double hitPoints) {
        super(name, hitPoints);
    }

    protected double fireBall() {
        Random x = new Random();
        random = x.nextInt(10) + 1;
        if(random > 5) {
            return random + 9;
        } else {
            return random + 7;
        }
    }

    protected void shieldGuardDefense(double damage) {
        Random x = new Random();
        random = x.nextInt(10) + 1;
        if (random < 4) {
            System.out.println("The Dragon flew, and dogged your attack");
        } else {
            System.out.println("you landed a critical attack");
            super.hitPoints -= (damage * 2);
        }
    }
    public void uponDeath() {
        System.out.println("The Dragon lets out a ROAR! before collapsing to the ground....");
    }
}
