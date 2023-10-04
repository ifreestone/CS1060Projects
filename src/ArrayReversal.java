import java.util.Scanner;
public class ArrayReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the values for your array (-1 to stop)");
        //Int which will be set to the users input later
        double userInput = 0;
        double[] userArray = new double[100];
        //Int used to know where the user stopped in the array for when we walk through it backwards
        int usedSize = 0;
        //Int used to walk through the array forwards
        int i = 0;
        while (i <= 100 && userInput != -1) {
            userInput = sc.nextDouble();
            if (userInput != -1) {
                userArray[i] = userInput;
                i++;
                usedSize++;
            }
        }
        System.out.println("Your array reversed is:");
        for (int j = usedSize - 1; j > -1; j--) {
            System.out.println(userArray[j]);
        }
    }
}
