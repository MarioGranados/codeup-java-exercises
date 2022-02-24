package game;


import java.util.Random;

public class Knight extends Character {
    protected double swordAttack;

    protected double swordAttackDamage() {
        return Math.random() * getSwordAttack();
    }
    protected void shieldGuardDefense(double damage) {
        Random x = new Random();
        random = x.nextInt(10) + 1;
        if (random < 2) {
            System.out.println("Dodged");
        } else {
            super.hitPoints -= damage;
        }
    }
    public Knight(String name, double hitPoints, double swordAttack) {
        super(name, hitPoints);
        this.swordAttack = swordAttack;
    }

    public double getSwordAttack() {
        return swordAttack;
    }
    public void uponDeath() {
        System.out.println("The Knight tries to attack but collapses and dies...");
    }
}