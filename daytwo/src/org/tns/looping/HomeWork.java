package org.tns.looping;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner s= new Scanner(System.in);
		 int n = s.nextInt();
		 for(int i =1;i<=n;i++)
		 {
			 for(int j =1; j<=i;j++)
			 {
				 System.out.print(i);
			 }
			 System.out.println();
		 }
	}

}
