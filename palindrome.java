package pst;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = obj.nextLine();
		String reversedword="";
		int count = 0;
		int len = word.length();
		 for (int i = len - 1; i >= 0; i--) {
	            reversedword = reversedword + word.charAt(i);
	        }
		 for(int i=0;i<word.length();i++) {
			 if(word.charAt(0) == reversedword.charAt(0) )
			 {
				 count ++;
			 }
		 }
		 if(count==word.length()) {
			 System.out.println("this is palindrome");
		 }
		 else {
			 System.out.println("this is not palindrome");
		 }

		

	}

	
}