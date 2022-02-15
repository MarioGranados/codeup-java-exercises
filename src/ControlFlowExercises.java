import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
/*        int i = 5;
        while (i < 15) {
            System.out.println(i);
            i++;
        }
        System.out.println("ex 2");
        i = 2;
        do {
            System.out.println(i);
            i *= 2;
        } while (i <= 65536);

        for(i = 2; i <= 65536; i*=2) {
            System.out.println(i);
        }*/

        /*FizzBuzz*/
/*        for(int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }*/

        Scanner in = new Scanner(System.in);

/*        System.out.println("What would you like the table to go up to?");
        int userInt = in.nextInt();
        System.out.println("Here is your tabled");
        System.out.println("Number  | Squared  | Cubed");
        System.out.println("------- | -------- | ------");

        for(int i = 0; i <= userInt; i++){
            int squared = i*i;
            int cubed = i * i * i;

            System.out.printf("%s \t\t| %s \t\t| %s %n", i, squared, cubed);
        }*/

        System.out.println("Enter a numeric grade");
        int userGrade = in.nextInt();

        if (userGrade >= 88 && userGrade <= 100) {
            System.out.println("A");
        } else if (userGrade >= 80) {
            System.out.println("B");
        } else if (userGrade >= 67) {
            System.out.println("C");
        } else if (userGrade >= 60) {
            System.out.println("D");
        } else if (userGrade >= 0) {
            System.out.println("F");
        } else {
            System.out.println("out of range");
        }
    }
}
