import java.util.Scanner;
public class BottlesOfBeer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many bottles of beer are on the wall?");
        int bottles = sc.nextInt();
        //Sets the inputted number of bottles to another int for later use in the last verse
        int someMore = bottles;
        //Runs through the different verses of the song up until the last one where there are 0 bottles left on the wall
        while (bottles > 0){
            //the two if statements are so the verses have proper grammar when there is only one bottle of beer left
            //this prints out the verses first line before the bottle gets passed around
            if (bottles == 1) {
                System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer.");
            } else {
                System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
            }
            //subtracts the number of bottles by one since one gets passed around in the next line
            bottles = bottles - 1;
            //this prints out the verses second line with the bottle being passed around
            if (bottles == 1) {
                System.out.println("Take one down and pass it around, " + bottles + " bottle of beer on the wall.");
            } else {
                System.out.println("Take one down and pass it around, " + bottles + " bottles of beer on the wall.");
            }
        }
        //these take care of the final verse where there are no more bottles of beer by using the int we made earlier
        System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
        System.out.println("Go to the store and buy some more, " + someMore + " bottles of beer on the wall.");
    }
}
