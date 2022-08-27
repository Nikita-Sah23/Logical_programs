package com.logicalProblems;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the number =");
		int num =scanner.nextInt();
		
		int remainder;
		int reverse = 0;
		
		while (num > 0) {
			remainder = num % 10;
			reverse =  (reverse * 10 + remainder) ;
			num =num / 10;	
		}
		System.out.println("Number after reversed is " + reverse);
		scanner.close();
	}		

}


