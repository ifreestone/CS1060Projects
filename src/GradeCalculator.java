import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Asks for the grade input
        System.out.println("Please input your number/percent grade.");
        //Takes the grade input as a double
        double grade = sc.nextDouble();
        //Creates a string that will be used for the letter grade equivalent
        String letterGrade = "x";

        //Makes sure the entered grade is above 0,
        //Then goes through all the grade ranges and sets the string equal to the appropriate letter grade
        if (grade < 0) {
            System.out.println("How'd you manage that? (ERROR)");
        } else if (grade <= 60) {
            letterGrade = "F";
        } else if (grade <= 67) {
            letterGrade = "D";
        } else if (grade <= 69) {
            letterGrade = "D+";
        } else if (grade <= 72) {
            letterGrade = "C-";
        } else if (grade <= 77) {
            letterGrade = "C";
        } else if (grade <= 79) {
            letterGrade = "C+";
        } else if (grade <= 82) {
            letterGrade = "B-";
        } else if (grade <= 87) {
            letterGrade = "B";
        } else if (grade <= 89) {
            letterGrade = "B+";
        } else if (grade <= 92) {
            letterGrade = "A-";
        } else if (grade > 92) {
            letterGrade = "A";
        }

        //Prints out the users letter grade but skips this if the user put in a negative number grade.
        if (!letterGrade.equals("x")) {
            System.out.println("Your letter grade is: " + letterGrade);
        }
    }
}
