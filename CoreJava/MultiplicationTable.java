package pst2;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		 System.out.println("Enter The Number:");
		int num=Scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println((num)+"*"+(i)+"="+(num*i));    
		}
	}

}
