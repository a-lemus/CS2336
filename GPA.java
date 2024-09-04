import java.util.Scanner;

public class GPA {

    // "A+" --> 4.0, "A" --> 4.0, "A-" --> 3.7, ... so on.
    // Java requires you to use .equals() to compare strings!
    static double letterToPoints(String grade) {
        if (grade.equals("A+") || grade.equals("A"))
            return 4;
        if (grade.equals("A-"))
            return 3.7;
        if (grade.equals("B+"))
            return 3.3;
        if (grade.equals("B"))
            return 3;
        if (grade.equals("B-"))
            return 2.7;
        if (grade.equals("C+"))
            return 2.3;
        if (grade.equals("C"))
            return 2;
        if (grade.equals("C-"))
            return 1.7;
        if (grade.equals("D+"))
            return 1.3;
        if (grade.equals("D"))
            return 1;

        return 0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// WRITE YOUR CODE HERE
        //Hint: System.out.printf("... GPA: %.2f ", ...); will print output with 2 decimal points.
        // if you defined the following String variables
        // String letterGrade = "";
        // String coreFlag = "";
        // you can get their value by using
        // letterGrade = input.next();
        // coreFlag = input.next();
        double coreGpa = 0;
        double gpa = 0;
        int numCoreHrs = 0;
        int numTotHrs = 0;

        String grade;
        String isCore;
        int creditHours = input.nextInt();
        while (creditHours!=0) {
            grade = input.next();
            isCore = input.next();
            gpa += letterToPoints(grade) * creditHours;
            numTotHrs += creditHours;
            if (isCore.equals("Y")) {
                coreGpa+= letterToPoints(grade) * creditHours;
                numCoreHrs += creditHours;
            }
            creditHours = input.nextInt();
        }
        System.out.print("Cumulative GPA:" + String.format("%.2f",gpa/numTotHrs) + " Core Gpa: ");
        if (numCoreHrs == 0) {System.out.print("NA");} else {System.out.print(String.format("%.2f",coreGpa/numCoreHrs));}

    }
}