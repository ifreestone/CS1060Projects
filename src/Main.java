import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type in a temperature in Farenheit");
        int farenheitNum = sc.nextInt();
        int kelvinNum = farenheitNum + 1;
    }
}