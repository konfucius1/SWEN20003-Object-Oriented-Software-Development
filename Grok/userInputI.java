import java.util.Scanner;

public class userInputI {
    public static void main(String args[]) {
        // Creating a scanner object
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two numbers: ");

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println(sum);
        
        
    }
}