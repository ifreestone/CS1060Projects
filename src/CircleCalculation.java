import java.util.Scanner;
public class CircleCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Asks the user for the radius and then puts it into the double named "radius"
        System.out.println("Please input the circles radius:");
        double radius = sc.nextDouble();

        //If statement that makes sure the radius entered is valid (not negative)
        if (radius >= 0){
            //There take the answer from a method and set it to a double for printing out
            double diameterResult = diameter(radius);
            System.out.println("The diameter is:" + diameterResult);
            double areaResult = area(radius);
            System.out.println("The area is: " + areaResult);
            double cirResult = circumference(radius);
            System.out.println("The circumference is: " + cirResult);
        } else {
            //Prints out error in-case the user inputs a non-valid radius
            System.out.println("Error");
        }
    }
    //Method that calculates the diameter from the user inputted radius before returning the result
    public static double diameter(double radius){
        double diameterCircle = radius + radius;
        return diameterCircle;
    }
    //Method that calculates the area from the user inputted radius before returning the result
    public static double area(double radius){
        double areaCircle = Math.PI * (radius * radius);
        return areaCircle;
    }
    //Method that calculates the circumference from the user inputted radius before returning the result
    public static double circumference(double radius){
        double cirCircle = 2 * Math.PI * radius;
        return cirCircle;
    }
}