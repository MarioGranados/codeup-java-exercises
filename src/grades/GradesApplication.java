package grades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
/*        HashMap<String, Student > students = new HashMap<>();

        Student s1 = new Student("John");
        s1.addGrade(80);
        s1.addGrade(97);
        s1.addGrade(67);
        Student s2 = new Student("Mark");
        s2.addGrade(78);
        s2.addGrade(96);
        s2.addGrade(48);
        Student s3 = new Student("Jasmine");
        s3.addGrade(57);
        s3.addGrade(78);
        s3.addGrade(97);
        Student s4 = new Student("Tommy");
        s4.addGrade(67);
        s4.addGrade(80);
        s4.addGrade(100);

        students.put("JohnTheSmith", s1);
        students.put("MarkTheSpark", s2);
        students.put("JastMin", s3);
        students.put("ThomasTheTrain", s4);

        Scanner in = new Scanner(System.in);
        String userInput = "yes";
        while(userInput.equalsIgnoreCase("yes")) {

            System.out.println("search a github username");
            userInput = in.nextLine();

            if(students.containsKey(userInput)) {
                System.out.println(students.get(userInput).getGradeAverage());
            } else {
                System.out.println("couldn't find that student in the database");
            }

            System.out.println("would you like to search for another student?");
            System.out.println("type yes : no");
            userInput = in.nextLine();
        }*/

        Scanner in = new Scanner(System.in);
        System.out.println("would you like to make an list?");
        System.out.println("yes : no");

        String userInput = in.nextLine();

        if(userInput.equalsIgnoreCase("yes")) {
            ArrayList<String> list = new ArrayList<>();

            while(userInput.equalsIgnoreCase("yes")) {
                System.out.println("enter a new item: ");
                userInput = in.nextLine();

                if(list.contains(userInput)) {
                    System.out.println("you already have that item");
                } else {
                    list.add(userInput);
                }

                System.out.println("your current list is:");
                System.out.println(list);

                System.out.println("would you like to enter a new item");
                System.out.println("yes : no");
                userInput = in.nextLine();
            }
            System.out.println("your grocery list is: ");
            System.out.println(list);
        } else {
            System.out.println("maybe next time");
        }

    }
}
