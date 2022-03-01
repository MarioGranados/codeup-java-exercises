package grades;

import java.util.ArrayList;

public class Student {
    private ArrayList<Integer> grades = new ArrayList<>();
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double average = 0;
        for(int grade: this.grades) {
            average += grade;
        }
        return Math.round(average / this.grades.size());
    }

/*    public static void main(String[] args) {
        Student john = new Student("John");
        Student bill = new Student("Bill");

        john.addGrade(80);
        john.addGrade(60);
        john.addGrade(100);
        john.addGrade(75);

        bill.addGrade(80);
        bill.addGrade(90);
        bill.addGrade(100);
        bill.addGrade(86);


        System.out.println(john.getName() + " Grade average is:");
        System.out.println(john.getGradeAverage());

        System.out.println(bill.getName() + " Grade average is:");
        System.out.println(bill.getGradeAverage());
    }*/
}
