import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class ServerNameGenerator {

    static String[] UserInput(String[] word) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            String UserInput = in.nextLine();
            word[i] = UserInput;
        }
        return word;
    }
    static String randomName(String[] adj, String[] noun) {
        Random random = new Random();
        int nounNumber = random.nextInt(10 - 1) + 1;
        int adjNumber = random.nextInt(10 - 1) + 1;
        return adj[nounNumber] + " " + noun[adjNumber];

    }

    public static void main(String[] args) {
        String[] adjective = new String[10];
        System.out.println("Enter 10 Adjectives");
        adjective = UserInput(adjective);

        System.out.println("The adjectives are");

        System.out.println(Arrays.toString(adjective));
        String[] noun = new String[10];

        System.out.println("Enter 10 nouns: ");
        noun = UserInput(noun);
        System.out.println("The Nouns are: ");
        System.out.println(Arrays.toString(noun));

        String randomNameGenerated = randomName(adjective, noun);

        System.out.println("Random name generated is: ");
        System.out.println(randomNameGenerated);
    }
}
