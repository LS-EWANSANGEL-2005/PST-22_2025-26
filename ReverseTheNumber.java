package pst;
import java.util.Scanner;
public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		while(num!=0) {
			int temp=num%10;
			System.out.println(temp);
			num=num/10;
		}
		

	}

}
