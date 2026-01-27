package pst;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a non-negative number:");
        int num = obj.nextInt();

        long factorial = 1;   

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of " + num + " is: " + factorial);
        }
    }
}
