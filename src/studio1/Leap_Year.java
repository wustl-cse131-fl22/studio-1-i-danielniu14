package studio1;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("what is the year");
		int year = scan.nextInt();
		
		boolean leapYear = true;
		leapYear = ((year%4==0) && (year%100!=0))||(year%400==0);
		System.out.print("is " + year + " a leap year? " + leapYear);
		
		

	}

}
