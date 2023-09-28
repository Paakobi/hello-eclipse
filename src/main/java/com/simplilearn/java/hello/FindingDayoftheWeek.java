package com.simplilearn.java.hello;

import java.util.Scanner;

public class FindingDayoftheWeek {
	
		public static void main(String [] args) {
			
			System.out.println("Please enter an integer for day of the week");
			
			Scanner s = new Scanner(System.in);
			
			int day =s.nextInt();
			
			FindingDayoftheWeek TheDayofWeek = new FindingDayoftheWeek();
			
			System.out.println(TheDayofWeek.FindDayofWeek (day));
			
		}
	
		private String FindDayofWeek (int d){
			String Days []= {
					"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"		
			};
			
			if ( d <=0 || d>7) {
				return "Invalid Input";				
			}else
				return Days[d-1];
		}		

}
