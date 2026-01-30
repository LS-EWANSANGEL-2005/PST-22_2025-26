package pst2;
import java.util.Scanner;
public class CountOfDigits {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter The Number:");
		int num=Scan.nextInt();
		int count=0;
		while(num!=0) {
			count++;
			num=num/10;
		}
        System.out.println(count);
	}

}
