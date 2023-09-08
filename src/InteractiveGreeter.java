import java.util.Scanner;
public class InteractiveGreeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //All user responses are stored as strings even when they could logically be ints
        //I did this in-case the user inputs "twenty" instead of "20" which would break it if it was looking for an int
        //These lines print out a question, then take in the users input and set it as a string to be called on later
        //They're all println that way the text goes to new lines and doesn't jumble up in to an unreadable mess
        System.out.println("What's your name?");
        String name = sc.next();
        System.out.println("Where are you from?");
        String location = sc.next();
        System.out.println("How old are you?");
        String age = sc.next();
        //This line prints out a response using the strings we stored earlier from the users responses
        System.out.println("Hi " + name + " from " + location + " who is " + age + " years old.");
        //These lines do more of what's already been done.
        System.out.println("What's your favorite activity?");
        String activity = sc.next();
        System.out.println("Have fun next time you " + activity + "! How much would you like to donate today?");
        String donate = sc.next();
        System.out.println("Thank you for donating " + donate + "!");
    }
}
