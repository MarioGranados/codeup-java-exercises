package game;

public class Player1 extends Knight{
    public Player1(String name, double hitPoints, double swordAttack) {
        super(name, hitPoints, swordAttack);
    }
    protected void shieldGuardDefense(double damage) {
        random = (int) (Math.random() * 10);
        if (random < 5) {
            System.out.println("Dodged");
        } else {
            super.hitPoints -= damage;
        }
    }
    public void uponDeath() {
        System.out.println("You died");
    }
}
