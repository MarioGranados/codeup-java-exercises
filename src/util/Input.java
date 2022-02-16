package util;

public class Input {
    private String scanner;
    private int someInt;
    private double doubleInt;

    String getString() {
        return this.scanner;
    }
    boolean yesNo() {
        return getString().equalsIgnoreCase("y") || getString().equalsIgnoreCase("yes");
    }

    int getInt(int min, int max) {
        while(getInt() < min && getInt() > max) {
            System.out.println("Enter another number");
        }
        return getInt();
    }
    int getInt() {
        return this.someInt;
    }
    double getDouble(double min, double max) {
        if(getDouble() < min && getDouble() > max) {
            System.out.println("try again later");
        }
        return getDouble();
    }
    double getDouble() {
        return this.doubleInt;
    }

    void setVariables(int integerVar, double doubleVar, String stringVar) {
        this.doubleInt = doubleVar;
        this.scanner = stringVar;
        this.someInt = integerVar;
    }

    public static void main(String[] args) {
        Input scanner = new Input();
        scanner.setVariables(10, 4.6, "yes");

        System.out.println(scanner.getDouble(1, 100));
        System.out.println(scanner.yesNo());
        System.out.println(scanner.getInt(1, 100));
    }
}
