package util;
import java.util.Scanner;

public class Input {
    private Scanner in;
    private String str;
    private int i;
    private double d;

    public Input() {
        in = new Scanner(System.in);
    }

    String getString() {
        return this.str;
    }

    void setString () {
        this.str = this.in.nextLine();
    }

    boolean yesNo() {
        return getString().equalsIgnoreCase("y") || getString().equalsIgnoreCase("yes");
    }

    void setInt() {
        try {
            Integer.valueOf(getString());
            throw new NumberFormatException("you didn't enter a int");
        }catch(NumberFormatException e) {
            System.out.println("More Info " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("enter a double");
            this.d = this.in.nextInt();
        }
    }

    int getInt() {
        return this.i;
    }

    void setDouble() {
        try{
            Double.valueOf(getString());
            throw new NumberFormatException("You didn't enter a double");
        }catch(NumberFormatException e) {
            System.out.println("More info " + e.getMessage());
            e.printStackTrace();
        } finally {
            this.d = this.in.nextDouble();
        }
    }

    double getDouble () {
        return this.d;
    }


    public static void main(String[] args) {
        Input input = new Input();


        System.out.println("---double---");
        input.setString();
        input.setDouble();
        System.out.println(input.getDouble());

        System.out.println("----int--");
        input.setString();
        input.setInt();
        System.out.println(input.getInt());

    }
}
