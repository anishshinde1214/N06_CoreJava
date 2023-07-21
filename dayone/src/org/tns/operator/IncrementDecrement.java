package org.tns.operator;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int x=23,y=6;
       int resl=x++ + ++y;
       System.out.println(resl);
       System.out.println(x);
       System.out.println(y);
       
       System.out.println("Result2");
       int res2=x-- + --y;
       System.out.println("Res2");
       System.out.println(x);
       System.out.println(y);
	}

}
