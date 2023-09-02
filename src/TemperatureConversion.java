// This allows us to use the scanner function
import java.util.Scanner;
// public mean it can be accessed by any other class.
// class is like a group of functions and methods that are related and do things
public class TemperatureConversion {
    // static means that you can work on it almost anywhere, but non-static mean you have to specifically say that "hey im working with this thing"
    // void means the method doesn't return anything to the class
    // main means this method can be accessed in the main class??? maybe??????
    // String[] means this method is dealing with strings??????
    // idk what args means
    public static void main(String[] args) {
        // This sets us up to be able to scan the users input for farenheitNum
        Scanner sc = new Scanner(System.in);

        // This outputs the question prompt
        System.out.println("Type in a temperature in Farenheit");
        // This scans for the users input
        int farenheitNum = sc.nextInt();
        // This converts the users input into Kelvin
        double kelvinNum = ((farenheitNum - 32) * (5.0 / 9)) + 273.15;
        // This converts the users input into Celsius
        double celsiusNum = (farenheitNum - 32) * (5.0 / 9);

        // This outputs the users input after it's been converted into Celsius and Kelvin
        System.out.println("The temperature is: " + celsiusNum + " degrees Celsius, and: " + kelvinNum + " degrees Kelvin.");
    }

    public void printHam() {
        System.out.println("Ham");
    }


}
