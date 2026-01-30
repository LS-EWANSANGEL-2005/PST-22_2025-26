package pst2;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=0;
		int b= 1;
		System.out.println("the fibonacci series for");
		int count=scan.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<count;i++) {
		int c = a+b;
		System.out.println(""+c);
		a=b;
		b=c;
		}

	}

}