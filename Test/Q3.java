package Test;

import java.util.Scanner;

public class Q3 {
	
	
	public static void main(String[] args) {
		
			Scanner S=new Scanner(System.in);
			System.out.println("enter your Age");
			int age =S.nextInt();
			System.out.println("enter your weight ");
			int wt=S.nextInt();
			
			if (age>=21 && age<=60 && wt>=40 && wt<=70) {
				System.out.println("you can donate your blood ");
				}		
			else {
					System.out.println("Invalid doner Exception: ");
				}
	}

}
