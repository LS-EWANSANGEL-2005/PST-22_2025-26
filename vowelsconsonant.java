package pst;

import java.util.Scanner;

public class vowelsconsonant {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Letter");
		char a = obj.next().charAt(0);
		String vowels = "AEIOU";
		int temps = 0;
		for (int i =0;i<vowels.length();i++) {
			if (vowels.charAt(i)==a) {
				temps++;
			}
		}
		if (temps>0) {
			System.out.println("vowels");
		
		}
		else {
			System.out.println("consonent");
		}
		
		
	}

}