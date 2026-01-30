package pst2;
import java.util.Scanner;
public class GreatestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int num1=Scan.nextInt();
		int num2=Scan.nextInt();
		int num3=Scan.nextInt();
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1);
				}
			}
		else if(num2>num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}
	}

}
