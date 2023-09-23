package com.simplilearn.java.hello;

import java.util.Scanner;

public class homeWork2 {
	
	public static void main(String[] arg) {
		
		Scanner scanner = new Scanner(System.in);
		
		/// If statement.. How old are you? 
		System.out.println("Hey, what is your name?");
		String name = scanner.nextLine();
		
		System.out.println("Ok,"+name+", how old are you?");
		int age = scanner.nextInt();	
		
		if(age>0 && age <16) {
			System.out.println("You can't drive.");	
			System.out.println("You can't vote");
			System.out.println("You can't rent a car");
			
		}else if (age >=16 && age< 18) {
			
			System.out.println("You can't vote");
			
		}else if (age >=18 && age<25) {
			System.out.println("You can't rent a car");
			
		}else {
			System.out.println("You can do anything");
		}
		
	/// Get three integers and increment the first number by the last 
		System.out.println("Enter first integer?");
		int x = scanner.nextInt();
		
		System.out.println("Enter second integer?");
		int y = scanner.nextInt();
		
		System.out.println("Enter third integer?");
		int z = scanner.nextInt();
		
		System.out.println("Increment starts from: ");
		
		for (int a=x; a<=y; a+=z) {
		
			System.out.println(a);
		}

	}
	
}
