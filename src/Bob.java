import java.util.Scanner;

public class Bob {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        System.out.println("Hello, My name is Bob. \nAsk me a question, nicely tho.");
        String userInput = in.nextLine();

        if(userInput.endsWith("!")) {
            System.out.println("Woah, Chill out!");
        } else if (userInput.endsWith("?")) {
            System.out.println("Sure");
        } else if (userInput.equals("")) {
            System.out.println("Fine, Don't tell me");
        } else {
            System.out.println("That's cool");
        }

    }
}
