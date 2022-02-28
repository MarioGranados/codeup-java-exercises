package game;

import java.util.Scanner;

public class Map {

    static int[][] map = new int[][]{
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {1, 2, 4, 2, 2, 4, 2, 2, 5, 1},
            {1, 3, 2, 2, 4, 2, 2, 4, 2, 1},
            {1, 2, 5, 4, 2, 2, 2, 5, 4, 4},
            {4, 2, 3, 3, 4, 5, 5, 3, 2, 1},
            {1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
            {1, 3, 2, 5, 2, 4, 3, 2, 4, 1},
            {1, 4, 4, 2, 2, 2, 2, 4, 2, 1},
            {1, 2, 5, 2, 4, 2, 3, 4, 5, 1},
            {1, 1, 4, 1, 1, 4, 1, 1, 1, 1}};

    static int x = map[1][0];
    static int y = map[0][2];
    static int currentPos = map[x][y];

    public static void mapEvents(Player1 player, Dragon dragon, Wizard wiz, Knight knight) {
        if (currentPos == 5) {
            System.out.println("You just kept walking");
        } else if (currentPos == 4) {
            if (knight.getHitPoints() >= 0) {
                battle(player, knight);
            }else if (wiz.getHitPoints() >= 0) {
                battle(player, wiz);
            }else if (dragon.getHitPoints() >= 0) {
                battle(player, dragon);
            } else {
                currentPos = -1;
                System.out.println("You found an exit....onto the next challenge");
            }
        } else if (currentPos == 3) {
            System.out.println("You heard a growl in the distance...");
        } else if (currentPos == 2) {
            System.out.println("There is ruble blocking this pathway...find another way");
        } else if (currentPos == 1) {
            System.out.println("There is an erie feeling here...let's keep going");
        }
    }
    public static void checkBounds () {
        if(x < 0) {
            x = 0;
            currentPos = map[x][y];
            System.out.println("There is a giant in this room...You went back to the previous room ");
        } else if(y < 0) {
            y = 0;
            currentPos = map[x][y];
            System.out.println("There is a broken bridge here...You found a different path");
        } else if (x > 10) {
            x = 9;
            currentPos = map[x][y];
            System.out.println("You tripped on a rock...let's get back to finding out way out");
        } else if (y > 10) {
            y = 9;
            currentPos = map[x][y];
            System.out.println("You were almost hit with an arrow...You went back to the previous room");
        }
    }
    public static void battle(Player1 player1, Knight character) {
        Scanner in = new Scanner(System.in);

        System.out.println("you came across a knight!");
       // System.out.println(player1.getHitPoints());
        //System.out.println(character.getHitPoints());
        while (player1.getHitPoints() >= 0 && character.getHitPoints() >= 0) {
            System.out.println();
            System.out.println("press any key to attack!");
            in.nextLine();
            System.out.println("you make a move which results in " + player1.getSwordAttack() + " damage");
            character.hitPoints -= player1.swordAttackDamage();
            System.out.println("the " + character.getName() +  " makes the next move");
            player1.shieldGuardDefense(character.swordAttackDamage());

            System.out.println();
            System.out.println("Your Health: " + player1.getHitPoints() + " Enemy health: " + character.getHitPoints());

        }
        if(player1.getHitPoints() <= 0) {
            player1.uponDeath();
            currentPos = -1;
        } else if (character.getHitPoints() <= 0) {
            character.uponDeath();
            System.out.println("you catch your breath...then continue on");
            System.out.println();
            player1.hitPoints += 30;
        }
    }

    public static void battle(Player1 player1, Wizard wiz) {
        System.out.println("A shadow appeared from the night...holding a flame??");
        Scanner in = new Scanner(System.in);
        while (player1.getHitPoints() >= 0 && wiz.getHitPoints() >= 0) {
            System.out.println();
            System.out.println("press any key to attack!");
            in.nextLine();

            System.out.println("you make a move which results in " + player1.getSwordAttack() + " damage");
            wiz.hitPoints -= player1.swordAttackDamage();
            System.out.println("The " + wiz.getName() + " casts a fireball");
            player1.shieldGuardDefense(wiz.fireBall());
            System.out.println("The enemy now casts a curse");
            player1.shieldGuardDefense(wiz.curseCasting());
            System.out.println();

            System.out.println("health: " + player1.getHitPoints() + " Enemy health: " + wiz.getHitPoints());
        }
        if(player1.getHitPoints() <= 0) {
            player1.uponDeath();
            currentPos = -1;
        } else if (wiz.getHitPoints() <= 0) {
            wiz.uponDeath();
            System.out.println("You then feel the wizard's energy flow through your blood..");
            System.out.println();
            player1.hitPoints += 60;
        }
    }

    public static void battle(Player1 player1, Dragon dragon) {
        System.out.println("The growling grows stronger...The Dragon Appears...");
        Scanner in = new Scanner(System.in);
        while (player1.getHitPoints() >= 0 && dragon.getHitPoints() >= 0) {
            System.out.println();
            System.out.println("press any key to attack!");
            in.nextLine();

            System.out.println("you make a move which results in " + player1.getSwordAttack() + " damage");
            dragon.hitPoints -= player1.swordAttackDamage();
            System.out.println("The " + dragon.getName() +  " casts a fireball");
            player1.shieldGuardDefense(dragon.fireBall());
            System.out.println("you make your next move another sword strike dealing " + player1.getSwordAttack() + "damage");
            dragon.shieldGuardDefense(player1.swordAttackDamage());
            System.out.println();

            System.out.println("health: " + player1.getHitPoints() + " Enemy health: " + dragon.getHitPoints());
        }
        if(player1.getHitPoints() <= 0) {
            player1.uponDeath();
            currentPos = -1;
        } else if (dragon.getHitPoints() <= 0) {
            dragon.uponDeath();
            System.out.println("you take short rest...everything is silent..you should find your way out");
        }
    }

    public static void main(String[] args) {
        Player1 player1 = new Player1("Player1", 150, 10.0);
        Dragon dragon = new Dragon("Dragon", 200);
        Knight knight = new Knight("knight", 80, 8.0);
        Wizard wiz = new Wizard("Wizard", 100);

        currentPos = map[0][0];
        Scanner in = new Scanner(System.in);
        System.out.println("you woke up in a strange place...");
        System.out.println("hit enter to continue");
        in.nextLine();
        System.out.println("You see a sword on the ground, hit enter to pick it up");
        in.nextLine();
        System.out.println("you see a shild on the ground, hit enter to pick it up");
        in.nextLine();

        System.out.print("you hear a scream in the distance...maybe you should find a way out..");

        System.out.println("Select a key");
        String userInput;
        System.out.print("w = up ");
        System.out.print("s = down ");
        System.out.print("d = right ");
        System.out.println("a = left");

        while (currentPos != -1) {
            System.out.println("Where to now?");
            userInput = in.nextLine();
            switch (userInput) {
                case "w":
                    y += 1;
                    checkBounds();
                    currentPos = map[x][y];
                    mapEvents(player1, dragon, wiz, knight);
                    break;
                case "s":
                    y -= 1;
                    checkBounds();
                    currentPos = map[x][y];
                    mapEvents(player1, dragon, wiz, knight);
                    break;
                case "a":
                    x -= 1;
                    checkBounds();
                    currentPos = map[x][y];
                    mapEvents(player1, dragon, wiz, knight);
                    break;
                case "d":
                    x += 1;
                    checkBounds();
                    currentPos = map[x][y];
                    mapEvents(player1, dragon, wiz, knight);
                    break;
                default:
                    System.out.println("You stayed in place!");
            }
        }
    }
}