package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first integer");
		int n1 = scan.nextInt();
		System.out.println("Enter second integer");
		int n2 = scan.nextInt();
		double average = ((n1 + n2)/2.0);
		System.out.println("The average of the numbers is " + average);
		
		// TODO Auto-generated method stub

	}

}
