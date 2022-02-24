package game;

import java.util.Random;

public class Wizard extends Character {

    public Wizard(String name, double hitPoints) {
        super(name, hitPoints);
    }

    protected double fireBall() {
        Random x = new Random();
        random = x.nextInt(10) + 1;
        return random + 12;
    }
    protected double curseCasting() {
        Random x = new Random();
        random = x.nextInt(10) + 1;
        return random + 16;
    }
    public void uponDeath() {
        System.out.println("The wizard attempts one more curse...but it backfires and he dies..");
    }

}
