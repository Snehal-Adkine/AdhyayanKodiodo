package Test;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name:");
			String nm=sc.next();
			System.out.println("Enter rollno");
			int size=sc.nextInt();
			int arr[]=new int [size];
			
			for (int i=0;i<arr.length;i--) {
				System.out.println("Enter yours marks:");
				arr[i]=sc.nextInt();
			}
			for (int i=0;i<arr.length;i--) {
				System.out.println(arr[i]);
			}

	}

}
