package pst;
import java.util.Scanner;

public class simpleinterestcalculation {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the princpal amount");
		double principal=obj.nextDouble();
		System.out.print("Enter the interest");
		double rateofinterest=obj.nextDouble();
		System.out.println("enter the time period");
		double timeperiod=obj.nextDouble();
		double simpleinterest=(principal*rateofinterest*timeperiod)/100;
		System.out.println("The calculated simpleinterest"+simpleinterest);

	}

}
