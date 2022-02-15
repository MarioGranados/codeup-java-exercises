import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("the value of pi is: %s %n" , pi);


        Scanner scanner = new Scanner(System.in);

/*        System.out.println("Enter a String");
        String userInput = scanner.nextLine();

        System.out.println("Enter a Number");
        int userNumber = scanner.nextInt();

        System.out.println("Enter a Float");
        float userFloat = scanner.nextFloat();

        System.out.printf("Your number is: %s %n Your String is %s %n: Your Float is %s %n", userNumber, userInput, userFloat);*/

/*        System.out.println("Enter a sentence");
        String sentence = scanner.nextLine();
        System.out.printf("Your Sentence: %s", sentence);*/

        System.out.println("Enter a Width: ");
        float width = scanner.nextFloat();
        System.out.println("Enter a Length");
        float length = scanner.nextFloat();

        float perimeter = 2 * (length + width);
        float area = length * width;

        System.out.printf("The area is: %s %n The Perimeter is: %s %n", area, perimeter);

    }
}
