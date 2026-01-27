package pst;
import java.util.Scanner;
public class sumaveragearray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / (double) n));
        sc.close();
    }
}