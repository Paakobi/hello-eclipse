package com.simplilearn.java.hello;

public class Demo2 {
	public int something = (int)(4*8+2/3.2)%5;
	public int somethingSimpler = 5 ;
	
	public boolean someBool = true && false || false && true || ! false;
	public boolean someSimpleBool = true ;
	
	public static void main (String [] args ) {
		String  s = "hello" ;
		if (s.length ()> 10) {
			System.out.println ("This is a large string : " + s );
		}else if(s.length() ==0) {
			System.out.println ("This is an empty string: "+ s);
		}else {
			System.out.println ("This is a NOT a larger string:" + s);
		}

		}
	

}
