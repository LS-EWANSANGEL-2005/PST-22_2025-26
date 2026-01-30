package pst2;

import java.util.Scanner;

public class DecendingOrderArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int temp=0;
		System.out.println("enter the size of array:");
		int size = scan.nextInt();
		int []arr=new int[size];
		System.out.println("enter the elements in array:");
		for(int i = 0;i<size;i++) {
			arr[i]=scan.nextInt();
		}
		for (int i = 0; i < size - 1; i++) {
		    for (int j = i + 1; j < size; j++) {
		        if (arr[i] < arr[j]) {
		            temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }
		    }
		}
		//descending order
		int len = arr.length;
		System.out.println("descending order:");
		for(int i=0;i<len;i++) {
			System.out.println(arr[i]);
		}
		

	}
}