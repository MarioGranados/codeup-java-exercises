import java.lang.Math;
import java.util.Scanner;

public class HighLow {
    public static int userNumber(int userInput, int random, int attempts) {
        Scanner input = new Scanner(System.in);
        System.out.println("Take a guess");
        do {
            userInput = input.nextInt();
            if (userInput > random) {
                System.out.println("lower");
            } else if (userInput < random) {
                System.out.println("higher");
            }
            attempts++;
        } while (userInput != random);

        return attempts;

    }

    public static void main(String[] args) {
        System.out.println("Lets see if you can guess what my number is:");
        System.out.println("I'm thinking of a number between 1 - 100");

        double myNumber = Math.floor(Math.random() * 100);
        int random = (int) myNumber;
        int attempts = 0;
        attempts = userNumber(-1,random, attempts);
        System.out.println("congrats! You guessed it");
        System.out.printf("my number was: %s. it took you %s attempts", random, attempts);
    }
}
