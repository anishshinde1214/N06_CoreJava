package org.tns.operator;

import java.util.Scanner;

public class TurnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num=s.nextInt();
            String result=(num%2==0)?"Even":"odd";
            System.out.println("Result is :"+result);
            s.close();
	}

}
