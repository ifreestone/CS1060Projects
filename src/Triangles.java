import java.util.Scanner;
public class Triangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creates a string that will be used to ask the user if they want to make another triangle
        String again = "y";
        //Loops the program if the user wants to do it again
        while (again.equals("y")){
            //Takes in the user inputted size of the triangle
            System.out.println("Enter the size (1 - 50): ");
            int size = sc.nextInt();
            //Loops that question until they put in a valid answer
            while (1 > size || 50 < size){
                System.out.println("Enter the size (1 - 50): ");
                size = sc.nextInt();
            }
            //Takes in the user inputted fill character
            System.out.println("Enter the fill character: ");
            char fillChar = sc.next().charAt(0);

            //Creating variables for the actual ascii art portion
            int triangle = 1;
            int printAgain = 1;
            int indent = size;
            //Repeats until the size is > 0, meaning the triangle has been made to the proper size
            while (size > 0) {
                //Prints out the fill character and a space for formatting
                while (triangle > 0) {
                    //Prints out the proper amount of space in order to make it a proper equilateral triangle
                    while (indent > 0) {
                        System.out.print(" ");
                        indent--;
                    }
                    System.out.print(fillChar + " ");
                    triangle--;
                }
                //Moves us to the next line
                System.out.println();
                //Keeps the size of the triangle in check, so we don't make it too big or small
                size--;
                //Resets indent to what it was before but minus one, so it's formatted properly
                indent = size;
                //Allows us to print the proper number of fill character for that line of the triangle
                printAgain++;
                //Ditto
                triangle = printAgain;
            }

            //Asks if they want to do the program again
            System.out.println("Do you want to do it again? (Y/N)");
            again = sc.next();
        }
    }
}
