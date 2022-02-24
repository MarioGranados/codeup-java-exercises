package game;

public class Character {
    protected String name;
    protected double hitPoints;

    static double random;

    Character(String name, double hitPoints) {
        this.name = name;
        this.hitPoints = hitPoints;
    }
    Character(double hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getHitPoints() {
        return hitPoints;
    }

    public String getName() {
        return name;
    }

    public void uponDeath() {
        System.out.println("Character D");
    }
}
