import java.util.Scanner;

public class StringWorkshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a starting String:");
        String starter = sc.nextLine();

        //This loop runs the program again until they pick option 7 (exit)
        boolean again = true;
        while (again) {
            System.out.println("Pick an option: \n" +
                    "1. Add content \n" +
                    "2. Check if string contains substring \n" +
                    "3. Output length \n" +
                    "4. Output substring after prefix \n" +
                    "5. Output substring before suffix \n" +
                    "6. Output substring between prefix and suffix \n" +
                    "7. Exit");
            int selection = sc.nextInt();

            //If statements for running the correct method
            if (selection == 1){
                //The addContent method takes in an input and adds it to the end of the original string, which gets set directly below
                starter = (addContent(starter));
                System.out.println("Your string is now: " + starter);
            } else if (selection == 2){
                //Uses the .contains() method to see if the string contains the inputted substring
                //returns true if it does, completing the if statements parameters
                if (containsSubstring(starter)) {
                    System.out.println("String contains inputted substring.");
                } else {
                    System.out.println("String does not contain inputted substring.");
                }
            } else if (selection == 3){
                //Uses the length() method to find its length then outputs it
                System.out.println("The strings length is: " + length(starter));
            } else if (selection == 4){
                System.out.println(afterPrefix(starter));
            } else if (selection == 5){
                //More of the same but returns the characters before the user entered substring up to the entered substring
                System.out.println(beforeSuffix(starter));
            } else if (selection == 6){
                //Runs through both of the previous 2 methods to get what's in between them
                System.out.println(betweenPrefixAndSuffix(starter));
            } else if (selection == 7){
                //Sets again to false, ending the loop that contains the program, thus ending the program itself
                again = exit(again);
            }
        }
    }
    public static String addContent(String starter) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Your string is currently: " + starter + "\nPlease enter what you want to add:");
        String addOn = sc.nextLine();
        return starter + addOn;
    }
    public static boolean containsSubstring(String starter) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the substring you would like to check for:");
        String subStringCheck = sc.nextLine();

        return starter.contains(subStringCheck);
    }
    public static int length(String starter) {
        return starter.length();
    }
    public static String afterPrefix(String starter) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input desired prefix substring:");
        String prefix = sc.nextLine();
        //String that will be set to the result of the following loops and if statements and then returned
        String substringAfterPrefix = "";
        //Won't start the code if the substring entered doesn't exist in the string
        if (starter.contains(prefix)) {
            //Goes through the index of the string until it reaches its end
            for (int i = 0; i < starter.length() - prefix.length(); i++) {
                //Checks to see if the substring inputted matches the current substring the loop is at
                if (starter.substring(i, i + prefix.length()).equals(prefix)) {
                    //Sets substringAfterPrefix to equal the substring after the inputted prefix
                    substringAfterPrefix = starter.substring(i + prefix.length());
                }
            }
        }
        return substringAfterPrefix;
    }
    public static String beforeSuffix(String starter) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input desired suffix substring:");
        String suffix = sc.nextLine();
        String substringBeforeSuffix = "";
        if (starter.contains(suffix)) {
            for (int i = 0; i < starter.length() - suffix.length(); i++) {
                if (starter.substring(i, i + suffix.length()).equals(suffix)) {
                    substringBeforeSuffix = starter.substring(0, i);
                }
            }
        }
        return substringBeforeSuffix;
    }
    public static String betweenPrefixAndSuffix(String starter) {
        return beforeSuffix(afterPrefix(starter));
    }
    public static boolean exit(boolean again) {
        return again = false;
    }
}
