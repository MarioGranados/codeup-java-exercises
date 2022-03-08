package notes;

import java.util.Scanner;

public class ExceptionNotes {

    public static String getIndentationPreference() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("What type of indentation do you prefer?");
        String indentationPreference = sc.nextLine();

        if (indentationPreference.equals("tabs")) {
            throw new Exception("Spaces are superior!");
        }


        return indentationPreference;
    }

    public static void main(String[] args) throws Exception {
/*        throw new Exception("Something bad happened!");
        System.out.println("after the throw statement"); // wont compile this line*/

/*        try {
            System.out.println("Let's see...");
            int result = 1 / 0;
            System.out.println("I can divide by zero!");
        } catch (ArithmeticException e) {
            System.out.println("Math still works!");
        }*/

/*        int[] numbers = {1, 2, 3};
        int x;

        try {
            x = numbers[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            //caught the exception
            System.out.println("Caught an array index exception!");
        } catch (Exception e) {
            System.out.println("Caught a generic exception!");
        } finally {
            //this code will always run
            System.out.println("This will always run.");
        }*/

        try{
            throw new RuntimeException("something broke");
        } catch (NullPointerException exObject) {
            System.out.println("example of .getMessage() " + exObject.getMessage());
            exObject.printStackTrace();
        } catch (RuntimeException exObject) {
            System.out.println("runtine exception");
        }
    }
}
