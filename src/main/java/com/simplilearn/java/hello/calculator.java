package com.simplilearn.java.hello;

public class calculator {
	public static void main (String [] args) {
		System.out.println(" add : " + add(5,4));
		System.out.println(" multiply : " + multiply(5,4));
		System.out.println(" divide : " + divide(8,3));
		System.out.println(" round : " + round(5.7));
		System.out.println(" IsEven is True : " + isEven(4));
		System.out.println(" IsEven is True : " + isOdd(3));
		System.out.println(" add three int :  " + addthree(1,2,3));
		System.out.println(" left is less that right :" + lt(1,3));
		System.out.println(" true xor true : " + xnor(true,true));
		System.out.println(" false xor false : " + xnor(false,false));
		
		


		
	}
	// addition 
	private static int add (int left, int right) {
		return left + right;
	}
	// multiply
	private static int multiply ( int left, int right) {
		return left * right;
	}
	//divide
	private static double divide (int left, int right) {
		
		return left/(double) right;
	}
	// take a double are return a single
	private static int round (double a) {
		 int b = (int) (a+.5); 
		 return b;
	}
	//isEven (Take a single integer) and return true if it even
	private static boolean isEven(int a){
		a = a%2;
		return a==0;
	}
	//is Odd (Return true or false)
	private static boolean isOdd(int a) {
		a = a%2;
		return a==1;
	}
	
	// add three number 
	private static int addthree(int a, int b, int c) {
			int d = a+b+c;
			return (d);
	}
	
	// lt( take two integers and return true if left is less than right
	private static boolean lt(int left,int right) {
		if(left<right) {
			return true;
		}else {
			return false;
		}
	}
	
	
	//XNOR ( take tow booleans and returns true if both are true or false)
	private static boolean xnor(boolean left, boolean right) {
		if ((left && right)|| (!left && !right)) {
			return true;
		}else {
			return false ;
		}
	}
	
}
