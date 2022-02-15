import java.util.Scanner;
public class MethodsExercises {
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int subtraction(int a, int  b) {
        return a - b;
    }
    public static int multiplication(int a, int b) {
        return a * b;
    }
    public static int divide(int a, int b) {
        return b - a;
    }
    public static void getInteger(int userInput, int max) {
        if(userInput < max) {
            System.out.println("Thank You!");
            return;
        }
        System.out.println("Please Enter a number between 1 and 10");
        Scanner in = new Scanner(System.in);
        userInput = in.nextInt();
        getInteger(userInput , max);
    }
    public static void factorials(int userNum, String response){
        Scanner input = new Scanner(System.in);
        if(response.toLowerCase().equals("n")) {
            System.out.println("Goodbye");
            return;
        }

        System.out.println("Enter a number between 1 and 10");
        userNum = input.nextInt();
        System.out.println("The Factorial is:");
        System.out.println(userNum);

        System.out.println("Would you like to continue? %ny/n%n?");
        response = input.nextLine();
        factorials(userNum, response);
    }

    public static void main(String[] args) {
/*        System.out.println(addition(2,2));
        System.out.println(subtraction(2,2));
        System.out.println(multiplication(4,4));
        System.out.println(divide(5, 10));*/
        System.out.print("Enter a number between 1 and 10: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        getInteger(a, 10);


    }

}
